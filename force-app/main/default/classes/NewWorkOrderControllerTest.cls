@isTest
public class NewWorkOrderControllerTest {
    
	@isTest
    public static void getFieldsToDisplayTest(){
        
        test.startTest();
        List<string> fieldList=NewWorkOrderController.getFieldsToDisplay(UtilityClass.NEW_WORKING_ORDER_FIELDSET_NAME,UtilityClass.NEW_WORKING_ORDER_OBJ_API_NAME);
        test.stopTest();
        system.assert(fieldList.size()>0, 'Found field set');
        
    }
}