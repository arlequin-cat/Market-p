package com.platzi.market.persistence.crud;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {
//<clase de entity y eltipo de la llave primaria>

//es lo mismo que usar un query @Query
//(value
//= "SELECT *
//FROM
//WHERE
//nativeQuery

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);
}
