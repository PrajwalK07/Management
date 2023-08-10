/**
 * @author Prajwal
 * @created date Aug-09-2023
 * @updated date 
 * @description : This class is used to fetch fieldet based on fieldsetName and objectApiname
 */

public class NewWorkOrderController {
    @AuraEnabled(cacheable=true)
    public static list<string> getFieldsToDisplay(String fieldSetName,String objectApiName){
        system.debug('Inside getFieldsToDisplay'+fieldSetName+'object'+objectApiName);
        list<String> fieldApiNames = new List<String>();
        SObject sObj = (SObject) (Type.forName('Schema.'+ objectApiName).newInstance());
        //Schema.SObjectType.Working_Order__c.fieldSets.getMap().get(fieldSetName)
        //sObj.getSObjectType().getDescribe().fieldSets.getMap().get(fieldSetName).getFields();
        List<Schema.FieldSetMember> listFieldSetMem =  sObj.getSObjectType().getDescribe().fieldSets.getMap().get(fieldSetName).getFields();
        for(Schema.FieldSetMember field : listFieldSetMem){
            system.debug(field.getFieldPath());
            fieldApiNames.add(field.getFieldPath());
        }
        return fieldApiNames;

    }

}