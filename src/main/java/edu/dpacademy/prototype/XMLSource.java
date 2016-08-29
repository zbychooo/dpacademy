package edu.dpacademy.prototype;

public class XMLSource extends Sourceable {

    private String filePath;

    XMLSource(String filePath) {
        this.filePath = filePath;
    }

    public String getIdentifier() {
        return XMLSource.class.getName();
    }

    public Sourceable clone() {
        return new XMLSource(filePath);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("XMLSource{");
        sb.append("filePath='").append(filePath).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
