package ChainOfResponsibility.approver;


import ChainOfResponsibility.request.ExpenseRequest;

public class Manager extends Approver {
    @Override
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() < 5000) {
            System.out.println("Manager approved the request of " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
