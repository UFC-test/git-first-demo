const Plane = require('./Plane');

class MilitaryPlane extends Plane {

    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity, militaryTypeplanes) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.militaryTypePlanes = militaryTypeplanes;
    }
    getMilitaryType() {
        return this.militaryTypePlanes;
    }
}
module.exports = MilitaryPlane;