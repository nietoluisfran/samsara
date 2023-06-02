

package sominie.samsara.java.test;

import sominie.samsara.java.connectors.Conexion;
import sominie.samsara.java.dao.ProductoDAOImpl;
import sominie.samsara.java.entities.Producto;
import sominie.samsara.java.interfaces.ProductoDAO;
//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;


public class Test {
    public static void main(String[] args) throws IOException, SQLException {
        // Crear la instancia de la conexión a la base de datos
        Connection conn = (Connection) Conexion.getConnection();

        // Crear una instancia de ProductoDAOImpl
        ProductoDAO dao = new ProductoDAOImpl((java.sql.Connection) conn);

        // Insertar un nuevo producto
//        Producto nuevoProducto = new Producto(1, "Televisor", "Sony", 499.99, 10);
//        Producto nuevoProducto = new Producto(2, "Laptop", "Dell", 799.99, 5);
//        Producto nuevoProducto = new Producto(3, "Smartphone", "Samsung", 699.99, 12);
//        Producto nuevoProducto = new Producto(4, "Tablet", "Apple", 549.99, 8);
//        Producto nuevoProducto = new Producto(5, "Monitor", "LG", 299.99, 15);
//        Producto nuevoProducto = new Producto(6, "Impresora", "HP", 199.99, 6);
//        Producto nuevoProducto = new Producto(7, "Altavoz Bluetooth", "JBL", 149.99, 10);
//        Producto nuevoProducto = new Producto(8, "Mouse inalámbrico", "Logitech", 39.99, 20);
//        Producto nuevoProducto = new Producto(9, "Teclado", "Microsoft", 79.99, 7);
//        Producto nuevoProducto = new Producto(10, "Auriculares con cable", "Sony", 99.99, 4);

//        dao.insertarProducto(nuevoProducto);

        // Listar todos los productos
//        List<Producto> productos = dao.listarProductos();
//        for (Producto producto : productos) {
//            System.out.println(producto);
//        }

        // Actualizar el stock del producto con código 1
        Producto productoExistente = new Producto(1, "Televisor", "Sony", 499.99, 30);
        dao.actualizarProducto(productoExistente);

//         Eliminar el producto con código 1
//        dao.eliminarProducto(productoExistente);

        // Cerrar la conexión a la base de datos
        Conexion.cerrarConexion((java.sql.Connection) conn);
    }
}
