/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.poo.calculadora.cci;

import ifes.poo.calculadora.cgt.AplCalculadora;
import ifes.poo.calculadora.cih.Tela;

/**
 *
 * @author Alessandro Eller
 */
public class CtrlCalculadora {
    
     public void run()
    {
        Tela tela = new Tela();
        
        String expressao = tela.telaInicial();
       
        AplCalculadora aplCalculadora = new AplCalculadora();
       
        Double result = aplCalculadora.calculo(expressao);        
        
        tela.telaFinal(result);
    }


}
