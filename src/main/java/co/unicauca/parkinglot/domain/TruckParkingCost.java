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
public class TruckParkingCost extends IParkingCost {
    
    /**
     * 
     * @param minutes
     * @return
     * 
     * Se calcula la tarifa de los Camiones
     */
    
    public int calculateCost(int minutes) {
        tarifa = 15000;
        if (minutes < 720) {
            tarifa = 10000;
        } else if (minutes > 1440) {
            System.out.println("Minutos del Camion en el Parqueadero: "+minutes);
            tarifa += (minutes - 1440) * (125.0 / 12.0);
            System.out.println("Tarfa sin redondear del Camion: "+tarifa);
            tarifa = redondear(tarifa);
            System.out.println("Tarifa redondeada del Camion: "+tarifa);
        }
        if (Sortear()) {
            tarifa = 0;
        }
        return tarifa;
    }

    
    /**
     * 
     * Sorteo requerido por el taller 
     */
    private boolean Sortear() {
        int numeroAleatorio = (int) (Math.random() * (1000 - 1)) + 1;
        return tarifa % numeroAleatorio == 0;
    }
}

