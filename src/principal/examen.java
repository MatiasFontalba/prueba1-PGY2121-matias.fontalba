//git add git commit git push

package principal;

import principal.handball.clubdeportivo;
import principal.handball.suscripcion;
import principal.handball.usuario;




public class examen {
//correlatico = correlativo++10//contador para numero (osea el folio de suscripcion empieza en 1000

    public static void main(String[] args) {
    usuario use1 = new usuario();
        use1.CreadorUsuarios("dcog", "Afds22231");
        System.out.println(use1.getNombreUsuario());
            //creacion de usuario con el print se puede ver el nombre de usuario

    /*public suscripcion(){
    this.FechaInicio = new Date ();
    this.AbonoSuscripcion = 0;
    this.Equipos = "";
    this.Numero = 0;
        intento de verificar
        */
    suscripcion suscripcionuno = new suscripcion();
    suscripcionuno.getNumero();
    suscripcionuno.getFechaInicio();
    suscripcionuno.getAbonoSuscripcion();
    suscripcionuno.getEquipos();
     
    /*
    private int RolUnico; //debe ser int y validar que sea mayor a 1000 y ademas que vaya subiendo de 10 en 10
private String Codigo;  //codigo del club deportivo ej ARH11
private String NombreClub;
private String NombreFundador;
private Date AnioFundacion;
private String PaisOrigen;
private String Lema;
private String Colores;
private int ValorSuscripcion;
    clubdeportivo
    intento de verificar
    */
    clubdeportivo clubdeportivouno = new clubdeportivo();
    clubdeportivouno.getRolUnico();
    clubdeportivouno.getCodigo();
    clubdeportivouno.getNombreClub();
    clubdeportivouno.getNombreFundador();
    clubdeportivouno.getAnioFundacion();
    clubdeportivouno.getPaisOrigen();
    clubdeportivouno.getLema();
    clubdeportivouno.getColores();
    clubdeportivouno.getValorSuscripcion();
    
    }
    
}
