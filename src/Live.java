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
public class Live extends Streaming{
  private String dataDeInicio, horaDeInicio;
  int taxaDeTransmissao;
  
  @Override
  void tocar() {
    super.tocar();
    System.out.println("Simulando um Live:" +
                       "\nData de Início: " + dataDeInicio +
                       "\nHora de Início: " + horaDeInicio +
                       "\nTaxa de Transmissão: " + taxaDeTransmissao);
  }
  
  public void setDataDeInicio(String data) {
    boolean valido=true;
    if (data.length()==10) {
      for (int i=0; i<10; i++) {
        if (i==2 || i==5) {
          if (data.charAt(i)!='/') {
            valido=false;
          }
        } else {
          if (data.charAt(i)<'0' || data.charAt(i)>'9') {
            valido=false;
          }
        }
      }
    } else {
      valido=false;
    }
    if (valido==true) {
      dataDeInicio=data;
    } else {
      System.out.println("Data de Início inválida");
    }
  }
  
  public String getDataDeInicio() {
    return dataDeInicio;
  }
  
  public void setHoraDeInicio(String hora) {
    boolean valido=true;
    if (hora.length()==8) {
      for (int i=0; i<8; i++) {
        if (i==2 || i==5) {
          if (hora.charAt(i)!=':') {
            valido=false;
          }
        } else {
          if (hora.charAt(i)<'0' || hora.charAt(i)>'9') {
            valido=false;
          }
        }
      }
    } else {
      valido=false;
    }
    if (valido==true) {
      horaDeInicio=hora;
    } else {
      System.out.println("Hora de Início inválida");
    }
  }
  
  public String getHoraDeInicio() {
    return horaDeInicio;
  }
  
  Live(String fonte) {
    super(fonte);
  }
}
