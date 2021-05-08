package kodlamaio.northwing.business.abstracts;

import kodlamaio.northwing.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();
}
