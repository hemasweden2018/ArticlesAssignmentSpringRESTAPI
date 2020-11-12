package se.novare.article.news.categories;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Category<Product> {
    @Id
    private Long id;
    @OneToMany
    private List<Product> products;

}
