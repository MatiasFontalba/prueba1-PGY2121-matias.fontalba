

package principal.handball;

import java.util.Date;


public class suscripcion {
/*cada Usuario puede suscribirse a los clubes de los cuales quiere recibir información y noticias,
esta relación está marcada por la fecha de inicio de la suscripción, valor de la suscripción, equipos al que se
está suscrito y abono total por concepto de pagos, además de un correlativo de la venta*/
//Suscripcion
private Date FechaInicio;
private int AbonoSuscripcion;
private String Equipos;
private int Numero;


public suscripcion(){
    this.FechaInicio = new Date ();
    this.AbonoSuscripcion = 0;
    this.Equipos = "";
    this.Numero = 0;
        
    }    

    public suscripcion(Date FechaInicio, int AbonoSuscripcion, String Equipos, int Numero) {
        this.FechaInicio = FechaInicio;
        this.AbonoSuscripcion = AbonoSuscripcion;
        this.Equipos = Equipos;
        this.Numero = Numero;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public int getAbonoSuscripcion() {
        return AbonoSuscripcion;
    }

    public void setAbonoSuscripcion(int AbonoSuscripcion) {
        this.AbonoSuscripcion = AbonoSuscripcion;
    }

    public String getEquipos() {
        return Equipos;
    }

    public void setEquipos(String Equipos) {
        this.Equipos = Equipos;
    }

    public int getNumero() {
        if(Numero >999);
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }


}
