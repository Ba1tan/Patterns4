package ChainOfResponsibility.approver;


import ChainOfResponsibility.request.ExpenseRequest;

public class Director extends Approver {
    @Override
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() < 10000) {
            System.out.println("Director approved the request of " + request.getAmount());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
