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
public class CarParkingCost extends IParkingCost {

    /**
     *
     * Se calcula la tarifa de los Carros
     *
     */
    @Override
    public int calculateCost(int minutos) {
        tarifa = 2000;
        if (minutos > 60) {
            tarifa += (minutos - 60) * (50 / 3);
            tarifa = redondear(tarifa);
        }
        return tarifa;
    }
}
