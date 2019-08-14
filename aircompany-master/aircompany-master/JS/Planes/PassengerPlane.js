const Plane = require('./Plane');

class PassengerPlane extends Plane {

    constructor(model, maxSpeed, maxFlightDistance, maxLoadCapacity, maximumNumberOfPassengers) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this._MaximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    getMaximumNumberOfPassengers() {
        return this._MaximumNumberOfPassengers;
    }
}

module.exports = PassengerPlane;