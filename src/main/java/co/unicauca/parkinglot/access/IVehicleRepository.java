
package co.unicauca.parkinglot.access;

import co.unicauca.parkinglot.domain.Vehicle;
import java.util.List;

/**
 * @authores Astrid Carolina Cruz(accruz@unicauca.edu.co) 
 * Braian Alexis Bastidas(brabadi@unicauca.edu.co)
 */

public interface IVehicleRepository {
    boolean save(Vehicle newProduct);

    List<Vehicle> list();
}
