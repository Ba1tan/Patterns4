package ChainOfResponsibility;

import ChainOfResponsibility.approver.ApprovalChain;

public class Main {
    public static void main(String[] args) {
        ApprovalChain chain = new ApprovalChain();

        chain.processExpense(500, "Team Outing");
        chain.processExpense(3000, "Project Supplies");
        chain.processExpense(7000, "New Office Setup");
        chain.processExpense(15000, "Company Event");
    }
}
