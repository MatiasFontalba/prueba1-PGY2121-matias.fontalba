

package principal.handball;

import java.util.Date;
//import java.util.regex.Pattern


public class usuario {
   /* Para los usuarios que se registran en la plataforma, deben estar identificados por su ID, nombre completo,
    rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña.
    registro de usuario*/
private String Id;
private String NombreCompleto;
private int Rut;
private String DigitoVerificador;
private Date FechaNacimiento;
private int Telefono;
private String Email;
private String NombreUsuario;
private String Contraseña;

public usuario( ){
    this.Id = "";
    this.NombreCompleto = "";
    this.Rut = 0;
    this.DigitoVerificador = "";
    this.FechaNacimiento = new Date ();
    this.Telefono = 0;
    this.Email = "";
    this.NombreUsuario = "";
    this.Contraseña = "";
    
}

    public usuario(String Id, String NombreCompleto, int Rut, String DigitoVerificador, Date FechaNacimiento, int Telefono, String Email, String NombreUsuario, String Contraseña) {
        this.Id = Id;
        this.NombreCompleto = NombreCompleto;
        this.Rut = Rut;
        this.DigitoVerificador = DigitoVerificador;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.NombreUsuario = NombreUsuario;
        this.Contraseña = Contraseña;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut, char DigitoVerificador) {
        if(this.validarRut(Rut, DigitoVerificador)){
        this.Rut = Rut;
        this.DigitoVerificador = DigitoVerificador+"";
        }
    }

    public String getDigitoVerificador() {
        return DigitoVerificador;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
       // if (new Date FechaNacimiento.after(2004/01/01))//si la fecha actual se compara con la cutual podra saber si es mayor a 18
        this.FechaNacimiento = FechaNacimiento;
       // else System.out.println("Debes ser mayor de edad");
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        if(Telefono > 55999999)//si el primer numero es 5 , si el segundo numero es 6 y el largo es minimo 8
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@")) { 
    } else {System.out.println("Debe ingresar un @");
        if (Email.contains(".com"))
    this.Email = Email;
    }
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        if(NombreUsuario.length() > 3)
        this.NombreUsuario = NombreUsuario;
        
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        if(Contraseña.length() >= 6)//como saber si contiene 1 mayuscula numero
        //if(Contraseña.matches([]) libreria extensa para aplicarla correctamente(mucho que aprender por el timpo)
            this.Contraseña = Contraseña;
    }

    
        public boolean validarRut(int Rut, char DigitoVerificador) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; Rut != 0; Rut /= 10) {
                s = (s + Rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (DigitoVerificador == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
        }

}
