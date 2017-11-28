package longpipes;

public class PipeI extends Pipe {

    /**
     **@param plasticGr an integer between 1 and 3 representing the quality of
     * plastic
     * @param len an integer representing the length of the pipe in mm with
     * maximum of 6m
     * @param outerDi an integer representing the outer diameter of the pipe in
     * mm
     * @param chemRes a boolean value representing if the pipe has chemical
     * resistance
     */
    public PipeI(int plasticGr, int len, int outerDi, boolean chemRes) {
        super(plasticGr, len, outerDi,chemRes);
    }
    /**
     * Calculate the base cost of the pipe based on attributes and set attribute
     * basicCost to the result
     *
     * @return a double representing the basic cost of the pipe
     */
    public double calculateCost() {
        Double innerVolume = Math.pow((innerDiameter / 2), 2) * Math.PI * length;
        Double outerVolume = Math.pow((outerDiameter / 2), 2) * Math.PI * length;
        Double pipeVolume = outerVolume - innerVolume;

        basicCost = (pipeVolume * 0.00006102374) * costPerInc;  //converts from mm to inches and times by the price
        if (chemResistance == true) {
            double cost = basicCost * 0.14;
            return cost;

        } else {
            return basicCost;

        }

    }
}
