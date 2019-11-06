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
public class Video extends Streaming{
  String autor, nome;
  
  @Override
  void tocar() {
    super.tocar();
    System.out.println("Simulando um Vídeo:" +
                       "\nAutor: " + autor +
                       "\nNome: " + nome);
  }
  
  Video(String fonte) {
    super(fonte);
  }
}
