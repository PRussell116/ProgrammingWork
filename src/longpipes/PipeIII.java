/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * 
 */
public class PipeIII extends PipeII{
    protected String colour2;
    
    public PipeIII(int plasticGr,int len,int outerDi ,boolean chemRes, String col1, String col2){
        super(plasticGr,len,outerDi,chemRes,col1);
        colour2 = col2;
        
    }
    
    
    
}
