
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Log {
    Log(){
        String log;
        log = String.valueOf(new Date()) +"   "+ String.valueOf(JPanelCalculator.num) +" "+ String.valueOf(JPanelCalculator.operation)+" "+ String.valueOf(JPanelCalculator.num1) +" = "+ String.valueOf(JPanelCalculator.res);
        FileWriter writeFile = null;
        try {
            File logFile = new File("log.txt");
            writeFile = new FileWriter(logFile);
            writeFile.append(log);
            //System.out.println(log);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(writeFile != null) {
                try {
                    writeFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
