
package models;


public class RFCModels {
  String ApPat;
  String ApMat;
  String Nom;
  String Año;
  String Mes;
  String Dia;
  String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getAño() {
        return Año;
    }

    public void setAño(String Año) {
        this.Año = Año;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

    public String getApPat() {
        return ApPat;
    }

    public void setApPat(String ApPat) {
        this.ApPat = ApPat;
    }

    public String getApMat() {
        return ApMat;
    }

    public void setApMat(String ApMat) {
        this.ApMat = ApMat;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }
    /**
     * Obtiene el RFC haciendo split en las respectivas letras y fechas
     * @return RFC Regresa El Valor concatenado de las primeras letras de el apellido paterno, la primera del apellido materno y la primer letra del nombre,asi como el año,mes y fecha
     */
    public String ObtenerRFC(){
        this.RFC = this.ApPat.trim().substring(0,2);
        //Primer Apellido 2 letras
        this.RFC = this.RFC.concat(this.ApMat.trim().substring(0,1));
        //Segundo Apellido 1 Letra
        this.RFC = this.RFC.concat(this.Nom.trim().substring(0,1));
        //Primer Letra del Nombre
        this.RFC = this.RFC.concat(this.Año.trim().substring(2,4));
        //Ultimos 2 digitos del año
        this.RFC = this.RFC.concat(this.Mes);
        //Captura el Mes
        this.RFC = this.RFC.concat(this.Dia);
        
        return this.RFC = this.RFC.toUpperCase();
    }
}
