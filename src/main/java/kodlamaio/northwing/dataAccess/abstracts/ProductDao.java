package kodlamaio.northwing.dataAccess.abstracts;

import kodlamaio.northwing.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductDao extends JpaRepository<Product,Integer> {
}
