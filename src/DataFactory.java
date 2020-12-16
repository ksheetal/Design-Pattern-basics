
/*
 * @created 16/12/2020 - 2:34 PM
 * @project Oops
 * @author  sheetalkumar
 */

public class DataFactory {

    public canApplyForLeave applyForLeave(Role role){

        canApplyForLeave canApply = null;

        switch (role) {
            case INTERN:
                    canApply = new Intern();
                    break;
            case MANAGER:
                canApply = new Manager();
                break;
            case SENIOR_SOFTWARE_ENGINEER:
                canApply = new SeniorSoftwareEngineer();
                break;

        }
       return canApply;
    }
    public canApproveLeave approveLeave(Role role) throws Exception {

        canApproveLeave canApply = null;

        switch (role) {
            case MANAGER:
                canApply = new Manager();
                break;
            case SENIOR_SOFTWARE_ENGINEER:
                canApply = new SeniorSoftwareEngineer();
                break;

            default:
                throw new Exception("Invalid position to approve leaves!");

        }
        return canApply;
    }
}
