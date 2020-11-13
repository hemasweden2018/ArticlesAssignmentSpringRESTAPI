package se.novare.article.news;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import se.novare.article.news.products.Product;
import se.novare.article.news.products.ProductController;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import se.novare.article.news.products.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@SpringBootTest
public class ProductControllerTests {
    @Autowired
    ProductController productController;

    @MockBean
    ProductService productService;

    @Test
    public void testGetById() {
        // Arrange
        Product product1 = new Product(1L, "Test product 1", "Test description 1");
        Product product2 = new Product(2L, "Test product 2", "Test description 2");

        Mockito.when(productService.getById(1L))
                .thenReturn(Optional.of(product1));
        Mockito.when(productService.getById(2L))
                .thenReturn(Optional.of(product2));

        // Act
        Product controllerProduct1 = productController.getById(1L);
        Product controllerProduct2 = productController.getById(2L);

        // Assert
        Assertions.assertEquals(product1.getName(), controllerProduct1.getName());
        Assertions.assertEquals(product2.getName(), controllerProduct2.getName());
    }

    @Test
    public void testGetAll() {
        // Arrange
        Product product1 = new Product(1L, "Test product 1", "Test description 1");
        Product product2 = new Product(2L, "Test product 2", "Test description 2");
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        Mockito.when(productService.getAll())
                .thenReturn(products);

        // Act
        List<Product> actualProducts = productController.getAll(null, null);

        // Assert
        Assertions.assertEquals(products.size(), actualProducts.size());
        Assertions.assertEquals(products.get(0).getName(), actualProducts.get(0).getName());
        Assertions.assertEquals(products.get(1).getName(), actualProducts.get(1).getName());
    }

    @Test
    public void testGetAllByCategoryId() {
        // Arrange
        Long categoryId = 101L;
        Product product1 = new Product(1L, "Test product 1", "Test description 1");
        Product product2 = new Product(2L, "Test product 2", "Test description 2");
        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        Mockito.when(productService.getAllByCategoryId(categoryId))
                .thenReturn(products);

        // Act
        List<Product> actualProducts = productController.getAll(categoryId, null);

        // Assert
        Assertions.assertEquals(products.size(), actualProducts.size());
        Assertions.assertEquals(products.get(0).getName(), actualProducts.get(0).getName());
        Assertions.assertEquals(products.get(1).getName(), actualProducts.get(1).getName());
    }

}
*/