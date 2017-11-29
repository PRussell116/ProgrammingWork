
package longpipes;


public class PipeIV extends PipeIII{
    protected boolean innerInsulation;
    
    /**
     **@param plasticGr an integer between 2 and 5 representing the quality of plastic 
     * @param len an integer representing the length of the pipe in mm
     * @param outerDi an integer representing the outer diameter of the pipe in mm
     * @param chemRes a boolean value representing if the pipe has chemical resistance 
     * @param innerIns a boolean value representing if the has inner insulation
     */  
    public PipeIV(int plasticGr,int len,int outerDi ,boolean chemRes, boolean innerIns){
        super(plasticGr,len,outerDi,chemRes);
        innerInsulation = innerIns;
        
    }
   
    
    
     /** Calculate the cost of the pipe2 based on the cost found by parent class and adding additional 13%
    * 
    * @return  a double representing the cost of the pipe 
    */
    
    @Override
    public double calculateCost(){
        double parentCost = super.calculateCost();   
        double cost = parentCost + basicCost * 0.13;
        return cost;
    
    
    }
}
