package TemplateMethodPattern.report;

public class HTMLReportGenerator extends ReportGenerator {
    @Override
    protected void formatHeader() {
        System.out.println("<h1>HTML Report Header</h1>");
    }

    @Override
    protected void formatBody() {
        System.out.println("<p>HTML Report Body</p>");
    }

    @Override
    protected void formatFooter() {
        System.out.println("<footer>HTML Report Footer</footer>");
    }
}
