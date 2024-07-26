package ecommerce.catalog_api.repos;

import ecommerce.catalog_api.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
