import { LightningElement,api, track } from 'lwc';
import getFieldsToDisplay from '@salesforce/apex/NewWorkOrderController.getFieldsToDisplay';
import { ShowToastEvent } from 'lightning/platformShowToastEvent';
	
import { NavigationMixin } from 'lightning/navigation';

export default class NewWorkOrderForm extends NavigationMixin(LightningElement) {
    @api name
    evt
     @track showSpinner=false
    @track fieldSet =[];
    strFieldSetName = 'New_Order_Form_FieldSet';
    @track strobjectApiName = 'Working_Order__c';
    workorderId=''

    connectedCallback(){
        getFieldsToDisplay({fieldSetName : this.strFieldSetName,
            objectApiName : this.strobjectApiName})
            .then((result)=>{
                console.log('result-->',JSON.stringify(result,null,2));
                this.fieldSet = result;
            })

    }

    handleSubmit(event){
        console.log('inside handlesubmit  ');
        this.showSpinner=true;
        let errorMessage = ''
        event.preventDefault();
        const inputFields = this.template.querySelectorAll("lightning-input-field");
        //const fields = event.detail.fields;
        //console.log('inpue fields  '+JSON.stringify(inputFields,null,2));
        if(inputFields){
            let workname=''
            //gtaher fieldValues
            inputFields.forEach((field)=>{
                console.log('field name  '+field.fieldName)
                //console.log('field+'+JSON.stringify(field,null,2))
                //console.log('field+val'+field.value)
                if(field.fieldName === 'Name__c'){
                    workname = field.value;
                    //let f = this.template.querySelector(".Name__c");
                    //console.log('ffff '+f+'--'+f.value );
                    
                }
            })
            //check field validity
            if(workname === '' || workname===null){
                errorMessage = errorMessage + 'Name should not be blank'
            }/*else if(){

            }*/
            console.log('err--'+ errorMessage)
            if(errorMessage !=''){
                console.log('err found--')
                //show toast
                this.dispatchEvent(
                    new ShowToastEvent({
                        title : "Error",
                        message : errorMessage,
                        variant : "error"
                    })
                )
                this.showSpinner=false;
            }else{
                console.log('error not found=='+JSON.stringify(event.detail.fields,null,2) )
                
                this.template.querySelector("lightning-record-edit-form").submit(event.detail.fields)
            }
        }
    }
    
    handleSuccess(event){
        this.workorderId = event.detail.id;
        //let errorMessage = ''
        console.log('workorderId-'+this.workorderId);
        // navigate to record detail page
        this.evt=setTimeout(()=>{
            this.navigateToDetailPage();
        },4000)
        
    }

    handleReset(event){
        const inputFields = this.template.querySelectorAll("lightning-input-field");
        if(inputFields){
            inputFields.forEach((field)=>{
                field.reset();
                // navigate to listview
            })
        }
    }

    // Navigate to View Account Page
    navigateToDetailPage() {
        this[NavigationMixin.Navigate]({
            type: 'standard__recordPage',
            attributes: {
                recordId:this.workorderId,
                objectApiName: this.strobjectApiName,
                actionName: 'view'
            },
        });
        this.showSpinner=false
        clearInterval(this.evt);
    }

}