package TemplateMethodPattern.reporting;


import TemplateMethodPattern.report.ReportGenerator;

public class ReportingSystem {
    private ReportGenerator reportGenerator;

    public void setReportGenerator(ReportGenerator reportGenerator) {
        this.reportGenerator = reportGenerator;
    }

    public void generateReport() {
        if (reportGenerator != null) {
            reportGenerator.generateReport();
        } else {
            System.out.println("No report generator set.");
        }
    }
}
