package ecommerce.catalog_api.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EntityScan("ecommerce.catalog_api.domain")
@EnableJpaRepositories("ecommerce.catalog_api.repos")
@EnableTransactionManagement
public class DomainConfig {
}
