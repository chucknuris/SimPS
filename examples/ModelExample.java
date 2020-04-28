package examples;

import desmoj.extensions.visualization2d.animation.CmdGeneration;
import desmoj.extensions.visualization2d.animation.core.simulator.ModelAnimation;

public class ModelExample extends ModelAnimation {
    public ModelExample(ModelAnimation modelAnimation, String s, CmdGeneration cmdGeneration, boolean b, boolean b1, boolean b2) {
        super(modelAnimation, s, cmdGeneration, b, b1, b2);
        this.setModelProjectName("Desmo-J Demo");
        this.setModelProjectURL("http://www.th-wildau.de/.....");
        this.setModelProjectIconId("DESMO-J");
        this.setModelAuthor("Name des Modell-Autors");
        this.setModelDate("Datum der Modell-Erstellung");
        this.setModelDescription("Beschreibung des Modells");
        this.setModelLicense("optional: Lizenz des Modells");
        this.addIcon("Ärztin", "doctor2_active.gif");
        this.addIcon("Anruf", "tel_active.gif");
        this.addIcon("DESMO-J", "desmoJ.gif");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int size;
    public int height;
    public int width;
    public String name;

    @Override
    public void initAnimation() {

    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public void doInitialSchedules() {

    }
}
