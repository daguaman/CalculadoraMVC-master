/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.poo.calculadora.cdp;

/**
 *
 * @author Alessandro Eller
 */
public class Soma implements Operador {

    @Override
    public double operacao(double valor1, double valor2) {
      return valor1 + valor2;
    }
    
}