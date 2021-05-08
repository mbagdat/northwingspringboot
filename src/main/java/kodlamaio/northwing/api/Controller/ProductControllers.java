package kodlamaio.northwing.api.Controller;

import kodlamaio.northwing.business.abstracts.ProductService;
import kodlamaio.northwing.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductControllers {

    private ProductService productService;

    @Autowired
    public ProductControllers(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/getall")
    public List<Product> getAll() {
        return this.productService.getAll();
    }
}
