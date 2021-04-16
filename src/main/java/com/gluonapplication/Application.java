package com.gluonapplication;

import com.gluonhq.particle.application.ParticleApplication;
import javafx.scene.Scene;

import static org.controlsfx.control.action.ActionMap.actions;

public class Application extends ParticleApplication {

    public Application() {
        super("Russian Fishing Manager");
    }

    @Override
    public void postInit(Scene scene) {
        scene.getStylesheets().add(Application.class.getResource("style.css").toExternalForm());
        setTitle("Russian Fishing Manager");
        getParticle().buildMenu(
                "File -> [createNew],[open],[importData],[exportData],[settings],[exit]"
                ,"Edit -> [edit]"
                ,"Help -> [about]");
        getParticle().getToolBarActions().addAll(actions("---"
                ,"createNew","open","importData","exportData","settings","exit"
                ,"edit"
                ,"about"));
    }
}