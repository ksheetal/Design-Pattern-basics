
/*
 * @created 16/12/2020 - 2:14 PM
 * @project Oops
 * @author  sheetalkumar
 */

public class Main {
    public static void main(String[] args) throws Exception {

        // Kids way of doing things.
        Manager manager = new Manager();
        Intern intern = new Intern();
//        intern.canApplyForLeave(12);
//        manager.canApplyForLeave(12);


        // factory Design Pattern;
        DataFactory dataFactory = new DataFactory();

//        dataFactory.getLeaveStatus(Role.INTERN).canApplyForLeave(12);
//        dataFactory.getLeaveStatus(Role.MANAGER).canApplyForLeave(12);
//        dataFactory.getLeaveStatus(Role.SENIOR_SOFTWARE_ENGINEER).canApplyForLeave(12);


        System.out.println(dataFactory
                .applyForLeave(Role.MANAGER)
                .canApplyForLeave(12)
            + " for "+Role.MANAGER);
        System.out.println(dataFactory
                .applyForLeave(Role.SENIOR_SOFTWARE_ENGINEER)
                .canApplyForLeave(32)
                + " for "+Role.SENIOR_SOFTWARE_ENGINEER);

        System.out.println(dataFactory
                .approveLeave(Role.SENIOR_SOFTWARE_ENGINEER)
                .canApproveLeave("12")
        + " : By "+ Role.SENIOR_SOFTWARE_ENGINEER);

        System.out.println(dataFactory
                .approveLeave(Role.MANAGER)
                .canApproveLeave("23")
                + " : By "+ Role.MANAGER);

        // dataFactory.getLeaveStatus(Role.SENIOR_SOFTWARE_ENGINEER).canApproveLeave("23");




    }
}
