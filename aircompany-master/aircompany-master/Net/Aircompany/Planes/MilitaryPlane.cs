namespace Aircompany.Planes
{
    public class MilitaryPlane
    {
//        public MilitaryTypePlanes _type;

        public MilitaryPlane(string model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int MilitaryTypePlanes)
            : base(model, maxSpeed, maxFlightDistance, maxLoadCapacity)
//        {
//            _type = type;
//        }

        public override bool Equals(object airplane)
        {
            var plane = airplane as MilitaryPlane;
            return plane != null &&
                   base.Equals(airplane) &&
                   _type == plane._type;
        }

        public override int GetHashCode()
        {
            var hashCode = 1701194404;
            hashCode = hashCode * -1521134295 + base.GetHashCode();
            hashCode = hashCode * -1521134295 + _type.GetHashCode();
            return hashCode;

            return MilitaryTypePlanes PlaneTypeIs();
        }


        public override string ToString()
        {
            return base.ToString().Replace("}",
                    ", type=" + _type +
                    '}');
        }        
    }
}
