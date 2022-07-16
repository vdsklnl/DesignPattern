package chain;

import chain.approve.CollegeApprover;
import chain.approve.DepartmentApprover;
import chain.approve.SchoolMasterApprover;
import chain.approve.ViceSchoolMasterApprover;
import chain.request.PurchaseRequest;

/**
 * @author vdsklnl
 * @create 2022-07-11 14:35
 * @Description
 */

public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(1, 1, 1000);

        DepartmentApprover department = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李院长");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("副校长");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("王校长");

        //要不形成环链，要不每次从最低级传递
        department.setApprover(collegeApprover);
        collegeApprover.setApprover(viceSchoolMasterApprover);
        viceSchoolMasterApprover.setApprover(schoolMasterApprover);
        schoolMasterApprover.setApprover(department);

        collegeApprover.processRequest(request);
    }
}
