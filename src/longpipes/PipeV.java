
package longpipes;

/**
 *
 * @author Oliver
 */
public class PipeV extends PipeIV{
    protected boolean outerReinfocement;
    
    /**
     **@param plasticGr an integer between 3 and 5 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     * @param innerIns a boolean value representing if the has inner insulation
     * @param outerRein a boolean value representing if the pipe has outer reinforcement
     */ 
    public PipeV(int plasticGr,double len,double outerDi ,boolean chemRes, boolean innerIns, boolean outerRein){
        super(plasticGr,len,outerDi,chemRes,innerIns);
        outerReinfocement = outerRein;
        

    }
    
    
     /** Calculate the cost of the pipe2 based on the cost found by parent class and adding additional 17%
    * 
    * @return  a double representing the cost of the pipe 
    */
        
    @Override
    public double calculateCost(){
        double parentCost = super.calculateCost();   
        double cost = parentCost + basicCost * 0.17;
        return cost;
    
    
    }
}
