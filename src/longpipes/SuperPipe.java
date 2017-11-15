/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Oliver
 */
public class SuperPipe {
    protected int plasticGrade,length,outerDiameter;
    protected float innerDiameter, basicCost;
    protected boolean chemRes;
        
    public SuperPipe(int plasticGr,int len,int outerDi ,boolean chemRes ){
        plasticGrade = plasticGr;
        length = len;
        outerDiameter = outerDi;
        innerDiameter = (float) (outerDi * 0.9);                   //calculates inner diameter of pipe  
    };
   
}
