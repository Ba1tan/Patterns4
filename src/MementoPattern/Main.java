package MementoPattern;

import MementoPattern.document.Document;
import MementoPattern.versioncontrol.VersionControl;

public class Main {
    public static void main(String[] args) {
        VersionControl versionControl = new VersionControl();

        Document document = new Document("Initial content");
        versionControl.saveVersion(document.save());

        document.edit("First update");
        versionControl.saveVersion(document.save());

        document.edit("Second update");
        versionControl.saveVersion(document.save());

        System.out.println("Current Document: " + document.getContent());
        versionControl.listVersions();

        System.out.println("Restoring to version 1...");
        document.restore(versionControl.getVersion(0));
        System.out.println("Current Document: " + document.getContent());
    }
}
