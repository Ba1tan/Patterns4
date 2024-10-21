package MementoPattern.document;

public class Document {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public String getContent() {
        return content;
    }

    public DocumentVersion save() {
        return new DocumentVersion(content);
    }

    public void restore(DocumentVersion version) {
        this.content = version.getContent();
    }
}
