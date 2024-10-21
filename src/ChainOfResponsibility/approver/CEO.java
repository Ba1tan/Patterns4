package ChainOfResponsibility.approver;


import ChainOfResponsibility.request.ExpenseRequest;

public class CEO extends Approver {
    @Override
    public void processRequest(ExpenseRequest request) {
        System.out.println("CEO approved the request of " + request.getAmount());
    }
}
