import peersim.Simulator;
import picocli.CommandLine;

@CommandLine.Command(description = "Run a peersim experiment using the specified configuration file",
        name = "peersim", mixinStandardHelpOptions = true)
public class App implements Runnable {
    @CommandLine.Option(names = "--config", description = "Define the full path to configuration file of peersim")
    String config = "";

    public static void main(String[] args) {
        CommandLine.run(new App(), args);
    }

    @Override
    public void run() {
        if(config.equals("")) {
            throw new Error("please specify a configuration file.");
        } else {
            new Simulator().main(new String[]{config});
        }
    }
}
