/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Bruno
 */
public class Streaming {
  String fonte;
  int duracao;
  
  void tocar(){
    System.out.println("Fonte: " + fonte +
                       "\nDuração: " + duracao);
  }
  
  Streaming(String fonte) {
    this.fonte = fonte;
  }
}
