package Articles;

import java.util.ResourceBundle;

public class ArticleFactory {

    static ResourceBundle resourceArticle;
    Article article;

    static {
        resourceArticle = ResourceBundle.getBundle("articles");
    }

    public static Article getValidArticleAllFields() {
        Article article = new Article();
        article.setTitle(resourceArticle.getString("article.validTitle"));
        article.setContent(resourceArticle.getString("article.validContent"));
        article.setAuthor(resourceArticle.getString("article.validAuthor"));
        article.setTag(resourceArticle.getString("article.validTag"));
        return article;
    }

    public static Article getArticleTitle() {
        Article article = new Article();
        article.setTitle(resourceArticle.getString("article.validTitle"));
        return article;
    }

}
