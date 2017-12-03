package longpipes;

/**
 *
 * @author up806925
 */
public class PipeIV extends PipeIII {

    /**
     *
     */
    protected boolean innerInsulation;

    /**
     **@param plasticGr an integer between 2 and 5 representing the quality of
     * plastic
     * @param len a double representing the length of the pipe with a maximum of
     * 6M
     * @param outerRi a double representing the outer radius of the pipe
     * @param chemRes a boolean value representing if the pipe has chemical
     * resistance
     * @param innerIns a boolean value representing if the has inner insulation
     */
    public PipeIV(int plasticGr, double len, double outerRi, boolean chemRes, boolean innerIns) {
        super(plasticGr, len, outerRi, chemRes);
        innerInsulation = innerIns;

    }

    /**
     * Calculate the cost of the pipe2 based on the cost found by parent class
     * and adding additional 13%
     *
     * @return a double representing the cost of the pipe
     */
    @Override
    public double calculateCost() {
        double parentCost = super.calculateCost();
        double cost = parentCost + basicCost * 0.13;
        return cost;

    }
}
