

package principal.handball;

import java.util.Date;

public class clubdeportivo {

//Clubes deportivos

private int RolUnico; //debe ser int y validar que sea mayor a 1000 y ademas que vaya subiendo de 10 en 10
private String Codigo;  //codigo del club deportivo ej ARH11
private String NombreClub;
private String NombreFundador;
private Date AnioFundacion;
private String PaisOrigen;
private String Lema;
private String Colores;
private int ValorSuscripcion;


public clubdeportivo(){
    this.RolUnico = 0;
    this.Codigo = "";
    this.NombreClub = "";
    this.NombreFundador = "";
    this.AnioFundacion = new Date ();
    this.PaisOrigen = "";
    this.Lema = "";
    this.Colores = "";
    this.ValorSuscripcion = 0;
    
}

    public clubdeportivo(int RolUnico, String Codigo, String NombreClub, String NombreFundador, Date AnioFundacion, String PaisOrigen, String Lema, String Colores, int ValorSuscripcion) {
        this.RolUnico = RolUnico;
        this.Codigo = Codigo;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AnioFundacion = AnioFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.Colores = Colores;
        this.ValorSuscripcion = ValorSuscripcion;
    }

    public int getRolUnico() {
        return RolUnico;
    }

    public void setRolUnico(int RolUnico) {
        this.RolUnico = RolUnico;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public Date getAnioFundacion() {
        return AnioFundacion;
    }

    public void setAnioFundacion(Date AnioFundacion) {
        this.AnioFundacion = AnioFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColores() {
        return Colores;
    }

    public void setColores(String Colores) {
        this.Colores = Colores;
    }

    public int getValorSuscripcion() {
        return ValorSuscripcion;
    }

    public void setValorSuscripcion(int ValorSuscripcion) {
        this.ValorSuscripcion = ValorSuscripcion;
    }


    
    
    
}
