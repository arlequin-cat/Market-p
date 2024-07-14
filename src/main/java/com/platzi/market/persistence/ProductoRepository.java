//Clase encargada de interactuar con la tabla de productos en la BD
package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudRepository;
import com.platzi.market.persistence.entity.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    //Metodo que muestra todos los productos existentes
    public List<Producto> getAll() {
        return (List<Producto>) productoCrudRepository.findAll();
    }

    //Metodo que muestra una lista de productos por la categoria
    public List<Producto> getByCategoria(int idCategoria) {
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);
    }

    //metodo que muestra que productos quedan en stock
    public Optional<List<Producto>> getEscasos(int cantidad) {
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad, true);
    }

    //metodo que busca un producto en la BD
    public Optional<Producto> getProducto(int idProducto) {
        return productoCrudRepository.findById(idProducto);
    }

    //Metodo que guarda un producto en la BD
    public Producto save(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    //Metodo DELETE borra por un id del producto
    public void delete(int idProducto) {
        productoCrudRepository.deleteById(idProducto);
    }
}
