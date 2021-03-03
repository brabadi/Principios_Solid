/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.parkinglot.domain;

/**
 * @authores Astrid Carolina Cruz(accruz@unicauca.edu.co) 
 * Braian Alexis Bastidas(brabadi@unicauca.edu.co)
 */
public class MotoParkingCost extends IParkingCost {
/**
 * 
 * Se calcula la tarifa de las Motos
 * 
 */
    @Override
    public int calculateCost(int minutos) {
        tarifa = 1000;
        if (minutos > 60) {
            tarifa += (minutos - 60) * 25 / 3;
            tarifa = redondear(tarifa);
        }
        return tarifa;
    }
}
