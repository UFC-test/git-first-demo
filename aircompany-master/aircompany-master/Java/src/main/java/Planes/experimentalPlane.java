package Planes;

import models.ClassificationLevelsSecurityOfThePlanes;
import models.ExperimentalTypesOfThePlanes;

public class experimentalPlane extends Plane{

    private ExperimentalTypesOfThePlanes =  new experimentaltype;
    private ClassificationLevelsSecurityOfThePlanes = new classificationLevel;

    public experimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int experimentaltype, int classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.experimentaltype = experimentaltype;
        this.classificationLevel = classificationLevel;
    }
    public ClassificationLevelsSecurityOfThePlanes getClassificationLevelsSecurityOfThePlanes(){
        return classificationLevel;
    }
    public void setClassificationLevelsSecurityOfThePlanes(ClassificationLevelsSecurityOfThePlanes classificationLevel){
        this.classificationLevel = classificationLevel;
    }
    @Override
    public boolean equals(Object Aircraft) {
        return super.equals(Aircraft);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" + model + '\'' +
                '}';
    }
}
