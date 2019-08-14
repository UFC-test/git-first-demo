const PassengerPlane = require('./Planes/PassengerPlane');
const MilitaryPlane = require('./Planes/MilitaryPlane');
const MilitaryTypePlanes = require('./models/militaryTypePlanes');
const experimentalPlane = require('./Planes/experimentalPlane');

class Airport {

    getpassengerPlaneRepublicOfBelarus() {
        let airplane = this.planes;
        var jet = [];
        for (let airplane of this.planes) {
            if (airplane instanceof PassengerPlane) {jet.push(airplane);}
        }
        return jet;
    }

    getMilitaryPlanes() {
        let militaryPlanes = [];
        this.planes.forEach(plane => {
            if (plane instanceof MilitaryPlane) {
                militaryPlanes.push(plane);
            }
      else{}
        });
        return militaryPlanes;
    }

    getPassengerPlaneWithMaximumNumberOfPassengers() {
        let passengerPlanes = this.getpassengerPlaneRepublicOfBelarus();
        let planeWithMaximumNumberOfPassengers = passengerPlanes[0];
        for (let i = 0; i < passengerPlanes.length; i++) {
            if (passengerPlanes[i].getMaximumNumberOfPassengers() >     planeWithMaximumNumberOfPassengers.getMaximumNumberOfPassengers()) {
                planeWithMaximumNumberOfPassengers = passengerPlanes[i];
            }
        }
        return planeWithMaximumNumberOfPassengers;
    }
    getTransportMilitaryPlanes(){
        let transportMilitaryPlanes = [];
        let militaryPlanes = this.getMilitaryPlanes();
        for (let i = 0; i < militaryPlanes.length; i++) {
        if (militaryPlanes[i].getMilitaryTypePlanes() == MilitaryTypePlanes.TYPE_TRANSPORT) {
        transportMilitaryPlanes.push(militaryPlanes[i]);
        }
        }
        return transportMilitaryPlanes;
    }
    getBomberMilitaryPlanes()
    {
        let bomberMilitaryPlanes = [];
        let militaryPlanes = this.getMilitaryPlanes();
        for (let i = 0; i < militaryPlanes.length; i++) {
            if (militaryPlanes[i].getMilitaryType()=== MilitaryTypePlanes.BOMBER) {
                bomberMilitaryPlanes.push(militaryPlanes[i]);
            }
        }
        return bomberMilitaryPlanes;
    }
    constructor(planes) {
        this.planes = planes;
    }
    getExperimentalPlanes() {
        let experimentalPlanes  = [];
        this.planes.forEach(plane => {
            if (plane instanceof experimentalPlane) {//if
                experimentalPlanes.push(plane);
            }
        });
        return experimentalPlanes;
    }
    sortByMaxDistance() {
        this.planes.sort((a, b) => (a.Get_Max_Flight_Distance() > b.Get_Max_Flight_Distance()) ? 1 : -1);
        return this;
    }
    sortByMaxSpeed() {
        this.planes.sort((a, b) => (a.getMaxSpeed() > b.getMaxSpeed()) ? 1 : -1);
        return this;
    }
    sortByMaxLoadCapacity() {
        this.planes.sort((a, b) => (a.getMinLoadCapacity() > b.getMinLoadCapacity()) ? 1 : -1);
        return this;
    }
    getPlanes() {
        return this.planes;
    }
    static print(planes) {
        return JSON.stringify(planes);
    }
}

module.exports = Airport;
