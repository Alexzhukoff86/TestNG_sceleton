package Articles;

import java.util.ResourceBundle;

public class ArticleFactory {

    static ResourceBundle resourceArticle;

    static {
        resourceArticle = ResourceBundle.getBundle("articles");
    }

    public static Article getValidArticle() {
        String title = resourceArticle.getString("article.validTitle");
        String content = resourceArticle.getString("article.validContent");
        String tag = resourceArticle.getString("article.validTag");
        String author = resourceArticle.getString("article.validAuthor");
        return new Article(title,content,tag,author);
    }

}
