package ChainOfResponsibility.approver;


import ChainOfResponsibility.request.ExpenseRequest;

public abstract class Approver {
    protected Approver nextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public abstract void processRequest(ExpenseRequest request);
}
