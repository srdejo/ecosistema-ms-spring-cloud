package co.srdejo.microproducto.negocio.repository;

import co.srdejo.microproducto.modelo.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoEntity, Integer> {
}
