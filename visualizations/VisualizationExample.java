package visualizations;

import desmoj.core.simulator.TimeInstant;
import desmoj.extensions.visualization2d.animation.Form;
import desmoj.extensions.visualization2d.animation.Position;
import desmoj.extensions.visualization2d.animation.core.statistic.CountAnimation;
import examples.ModelExample;
import desmoj.extensions.visualization2d.animation.core.simulator.ModelAnimation;
import desmoj.extensions.visualization2d.animation.core.simulator.SimProcessAnimation;

import java.awt.*;

public class VisualizationExample extends SimProcessAnimation {

    static ModelExample modelExample;
    static {
        modelExample = new ModelExample(null,"modelName", null, true, false, true);
        modelExample.setName("Test");
    }

    public VisualizationExample(ModelAnimation modelAnimation, String s, boolean b) {
        super(modelAnimation, s, b);
        super.createAnimation("Test0",true);
        CountAnimation ca = new CountAnimation(null, "countanimation", true, true);
        ca.createAnimation(new TimeInstant(1.0D), 0.0D, 1.0D, 10, new Position("pos0", new Point(1,1)), new Form(), true);
        modelAnimation.initAnimation();
    }

    @Override
    public void lifeCycle() {

    }
}
