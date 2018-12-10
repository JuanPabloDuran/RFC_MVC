
package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.RFCModels;
import views.RFCViews;

public class RFCControllers implements ActionListener{
    private final RFCModels models;
    private final RFCViews views;
   
    
    
public RFCControllers (RFCModels models, RFCViews views){
    this.models = models;
    this.views = views;
    
    views.jb_Genera.addActionListener(this);
    initview();
}


    @Override
    public void actionPerformed(ActionEvent P) {
        if (P.getSource() == views.jb_Genera);
        ActionRFC();
    }
    
    public void ActionRFC(){
    models.setApPat(views.jtf_ApPat.getText());
    models.setApMat(views.jtf_ApMat.getText());
    models.setNom(views.jtf_Nom.getText());
    models.setAño(views.jtf_Año.getText());
    models.getRFC();
    String i = views.jcb_Mes.getSelectedItem().toString();
    if(i.equals("Enero")) models.setMes("01");
    else if (i.equals("Febrero")) models.setMes("02");
    else if (i.equals("Marzo")) models.setMes("03");
    else if (i.equals("Abril")) models.setMes("04");
    else if (i.equals("Mayo")) models.setMes("05");
    else if (i.equals("Junio")) models.setMes("06");
    else if (i.equals("Julio")) models.setMes("07");
    else if (i.equals("Agosto")) models.setMes("08");
    else if (i.equals("Septiembre")) models.setMes("09");
    else if (i.equals("Octubre")) models.setMes("10");
    else if (i.equals("Noviembre")) models.setMes("11");
    else if (i.equals("Diciembre")) models.setMes("12");
    String e = views.jcb_Dia.getSelectedItem().toString();
    if(e.equals("1")) models.setDia("01");
    else if (e.equals("2")) models.setDia("02");
    else if (e.equals("3")) models.setDia("03");
    else if (e.equals("4")) models.setDia("04");
    else if (e.equals("5")) models.setDia("05");
    else if (e.equals("6")) models.setDia("06");
    else if (e.equals("7")) models.setDia("07");
    else if (e.equals("8")) models.setDia("08");
    else if (e.equals("9")) models.setDia("09");
    else if (e.equals("10")) models.setDia("10");
    else if (e.equals("11")) models.setDia("11");
    else if (e.equals("12")) models.setDia("12");
    else if (e.equals("13")) models.setDia("13");
    else if (e.equals("14")) models.setDia("14");
    else if (e.equals("15")) models.setDia("15");
    else if (e.equals("16")) models.setDia("16");
    else if (e.equals("17")) models.setDia("17");
    else if (e.equals("18")) models.setDia("18");
    else if (e.equals("19")) models.setDia("19");
    else if (e.equals("20")) models.setDia("20");
    else if (e.equals("21")) models.setDia("21");
    else if (e.equals("22")) models.setDia("22");
    else if (e.equals("23")) models.setDia("23");
    else if (e.equals("24")) models.setDia("24");
    else if (e.equals("25")) models.setDia("25");
    else if (e.equals("26")) models.setDia("26");
    else if (e.equals("27")) models.setDia("27");
    else if (e.equals("28")) models.setDia("28");
    else if (e.equals("29")) models.setDia("29");
    else if (e.equals("30")) models.setDia("30");
    else if (e.equals("31")) models.setDia("31");
    JOptionPane.showMessageDialog(null,"Tu RFC es :");
    JOptionPane.showMessageDialog(null,models.ObtenerRFC());
}
    
  public void initview(){
      views.setLocationRelativeTo(null);
      views.setVisible(true);
      views.setTitle("Calcula tu RFC");
  }
    
}
