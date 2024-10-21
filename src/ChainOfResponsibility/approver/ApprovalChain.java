package ChainOfResponsibility.approver;

import ChainOfResponsibility.request.ExpenseRequest;

public class ApprovalChain {
    private Approver approverChain;

    public ApprovalChain() {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        approverChain = teamLead;
    }

    public void processExpense(double amount, String purpose) {
        ExpenseRequest request = new ExpenseRequest(amount, purpose);
        approverChain.processRequest(request);
    }
}
