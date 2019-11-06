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
public class Revisao {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    int duracaoTotal=0;
    Streaming[] playlist = new Streaming[3];
    
    Streaming stream = new Streaming("abc");
    stream.duracao = 3600;
    
    Live live = new Live("def");
    live.duracao = 600;
    live.taxaDeTransmissao = 5;
    live.setDataDeInicio("01/01/2017");
    live.setHoraDeInicio("22:30:00");
    
    Video video = new Video("ghi");
    video.autor = "Bruno";
    video.duracao = 600;
    video.nome = "Revisão";
    
    playlist[0] = stream;
    playlist[1] = live;
    playlist[2] = video;
    
    for (int i=0; i<3; i++) {
      playlist[i].tocar();
      System.out.println();
      duracaoTotal = duracaoTotal + playlist[i].duracao;
      if (i==2) {
        System.out.println("Duração Total da Playlist: " + duracaoTotal);
      }
    }
  }
  
}
