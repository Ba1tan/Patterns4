package ChainOfResponsibility.approver;


import ChainOfResponsibility.request.ExpenseRequest;

public class TeamLead extends Approver {
    @Override
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() < 1000) {
            System.out.println("TeamLead approved the request of " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
