package longpipes;

/**
 *
 * @author up806925
 */
public class PipeI extends Pipe {

    /**
     **@param plasticGr an integer between 1 and 3 representing the quality of
     * plastic
     * @param len a double representing the length of the pipe with a maximum of
     * 6M
     * @param outerRi a double representing the outer radius of the pipe
     * @param chemRes a boolean value representing if the pipe has chemical
     * resistance
     */
    public PipeI(int plasticGr, double len, double outerRi, boolean chemRes) {
        super(plasticGr, len, outerRi, chemRes);
    }

    /**
     * Calculate the base cost of the pipe based on attributes and set attribute
     * basicCost to the result
     *
     * @return a double representing the basic cost of the pipe
     */
    @Override
    public double calculateCost() {
        Double innerVolume = (Math.pow(innerRadius,2)*Math.PI)*(length * 39.37); // converts length from meters in inches and calculted the inner volume of the pipe
        Double outerVolume = (Math.pow(outerRadius,2)*Math.PI)*(length * 39.37);  // converts length from meters in inches and calculted the outer volume of the pipe
        Double pipeVolume = outerVolume - innerVolume;

        basicCost = pipeVolume * costPerInc;  
        if (chemResistance == true) {
            double cost = basicCost * 1.14;
            return cost;

        } else {
            return basicCost;

        }

    }
}
