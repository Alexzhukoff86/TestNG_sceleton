package Articles;

public class Article {
    private String title;
    private String content;
    private String tag;
    private String author;

/*    public Article(String title, String content, String tag, String author) {
        this.title = title;
        this.content = content;
        this.tag = tag;
        this.author = author;
    }*/

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
