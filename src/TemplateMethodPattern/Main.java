package TemplateMethodPattern;

import TemplateMethodPattern.report.PDFReportGenerator;
import TemplateMethodPattern.report.HTMLReportGenerator;
import TemplateMethodPattern.reporting.ReportingSystem;

public class Main {
    public static void main(String[] args) {
        ReportingSystem reportingSystem = new ReportingSystem();

        System.out.println("Generating PDF Report:");
        reportingSystem.setReportGenerator(new PDFReportGenerator());
        reportingSystem.generateReport();

        System.out.println("\nGenerating HTML Report:");
        reportingSystem.setReportGenerator(new HTMLReportGenerator());
        reportingSystem.generateReport();
    }
}
