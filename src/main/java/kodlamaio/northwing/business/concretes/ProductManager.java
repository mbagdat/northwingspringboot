package kodlamaio.northwing.business.concretes;

import kodlamaio.northwing.business.abstracts.ProductService;
import kodlamaio.northwing.dataAccess.abstracts.ProductDao;
import kodlamaio.northwing.entities.concretes.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductManager implements ProductService {

    private ProductDao productDao;

    @Autowired
    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
