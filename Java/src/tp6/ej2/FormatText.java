package tp6.ej2;

public class FormatText implements HTMLText {

    private HTMLText element;
    private String format;

    public FormatText(HTMLText element, String format){
        this.element = element;
        this.format = format;
    }

    @Override
    public String toString(){
        return source();
    }

    @Override
    public String source() {
        return String.format("<%s>%s</%s>", format, element.source(), format);
    }
}
