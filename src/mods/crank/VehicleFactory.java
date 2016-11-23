package mods.crank;

import game.AbstractVehicleFactory;
import game.vehicles.Car;
import game.Terrain;
import game.Vehicle;
import mods.crank.vehicles.Boat;
import mods.crank.vehicles.Forklift;
import mods.crank.vehicles.Tank;

public class VehicleFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle createVehicle(Terrain terrain) {
        switch (terrain){
            case ROAD:
                return new Car();

            case WATER:
                return new Boat();

            case OFFROAD:
                return new Tank();

            case INDUSTRIAL:
                return new Forklift();

            default:
                return null;
        }
    }
}