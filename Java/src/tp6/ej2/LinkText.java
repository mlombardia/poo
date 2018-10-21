package tp6.ej2;

public class LinkText implements HTMLText {

    public HTMLText element;
    public String link;

    public LinkText(HTMLText element, String link){
        this.element = element;
        this.link = link;
    }

    @Override
    public String toString(){
        return source();
    }

    @Override
    public String source() {
        return String.format("<a href:\"%s\">%s</a>",link,element.source());
    }
}
