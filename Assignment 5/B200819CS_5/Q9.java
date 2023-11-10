
interface Searchable {
    void search(String keyword);
}


class Document implements Searchable {
    private String content;

    public Document(String content) {
        this.content = content;
    }

    @Override
    public void search(String keyword) {
        if (content.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the document.");
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the document.");
        }
    }
}


class WebPage implements Searchable {
    private String url;
    private String pageContent;

    public WebPage(String url, String pageContent) {
        this.url = url;
        this.pageContent = pageContent;
    }

    @Override
    public void search(String keyword) {
        if (pageContent.contains(keyword)) {
            System.out.println("Keyword '" + keyword + "' found in the web page: " + url);
        } else {
            System.out.println("Keyword '" + keyword + "' not found in the web page: " + url);
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
       
        Document document = new Document("This is a sample document with some text.");
        WebPage webpage = new WebPage("https://example.com", "Welcome to the example website.");

        
        document.search("sample");
        document.search("search");
        webpage.search("website");
        webpage.search("Java");
    }
}
