
/*
 * @created 16/12/2020 - 3:20 PM
 * @project Oops
 * @author  sheetalkumar
 */

public class Leave implements canApproveLeave, canApplyForLeave {

    @Override
    public String canApplyForLeave(Integer days) {
       // System.out.println("Applying leave for "+ days+ " days!");
        String res = "Applying leave for "+ days+ " days!";
        return res;
    }

    @Override
    public String canApproveLeave(String userID) {
      //  System.out.println("Leave approve for UserID - "+ userID);
        String res = "Leave approve for UserID -" + userID;
        return res;
    }
}
