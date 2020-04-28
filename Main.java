import desmoj.core.simulator.Experiment;
import desmoj.core.simulator.PatternBasedTimeFormatter;
import desmoj.core.simulator.TimeInstant;
import desmoj.extensions.visualization2d.animation.CmdGeneration;
import examples.ModelExample;
import visualizations.VisualizationExample;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Main {
    public static void main(String... blablabl) {
        String modelName = "Test_Model";
        String expName = "firstExp";
// Initialisierung der CmdGeneration für Animation
        try {
            CmdGeneration cmdGen = new CmdGeneration(
                    "./cmdfile.cmd" , "./logfile.log",
                    new URL("https://www.google.com/imgres?imgurl=https%3A%2F%2Fcdns.iconmonstr.com%2Fwp-content%2Fassets%2Fpreview%2F2016%2F240%2Ficonmonstr-car-3.png&imgrefurl=https%3A%2F%2Ficonmonstr.com%2Fcar-3-svg%2F&tbnid=7m4hp2lPaAvPjM&vet=12ahUKEwikzebY74vpAhVNuKQKHTFECiQQMygAegUIARCfAg..i&docid=nqhAlX2a6HZK0M&w=240&h=240&q=icon%20car&safe=strict&ved=2ahUKEwikzebY74vpAhVNuKQKHTFECiQQMygAegUIARCfAg"));
            ModelExample model = new ModelExample(null,"modelName", cmdGen, true, false, true);
            Experiment exp = new Experiment(modelName,
                    "");
            TimeInstant simBegin, simEnd;
            simBegin = new TimeInstant(new GregorianCalendar(2009, Calendar.JUNE, 1, 10, 00));
            simEnd = new TimeInstant(new GregorianCalendar(2009, Calendar.JUNE, 2, 10, 00));
            cmdGen.setStartStopTime(simBegin, simEnd, TimeZone.getDefault());
            model.connectToExperiment(exp);
            // setze Experiment-Parameter
            exp.setShowProgressBar(true);
            exp.setTimeFormatter(new PatternBasedTimeFormatter(true));
            System.out.println("Begin: "+simBegin+" End: "+simEnd);
            cmdGen.experimentStart(exp, 5.0);
            cmdGen.close();
            exp.report();
            exp.finish();
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}