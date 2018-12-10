
package main;

import models.RFCModels;
import views.RFCViews;
import controllers.RFCControllers;

public class Main {
    
    private static RFCModels models;
    private static RFCViews views;
    private static RFCControllers controllers;

 
    public static void main(String[] args) {
        models = new RFCModels();
        views = new RFCViews();
        controllers = new RFCControllers(models, views);   
    }
    
}
