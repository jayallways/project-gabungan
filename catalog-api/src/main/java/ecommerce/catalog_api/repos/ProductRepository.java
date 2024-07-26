package ecommerce.catalog_api.repos;

import ecommerce.catalog_api.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
