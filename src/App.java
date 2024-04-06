
interface Logger {
    void log(String message);
    void error(String message);
}
// Class implementing AsteriskLogger
class AsteriskLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("***" + message + "***");
    }
    @Override
    public void error(String message) {
        System.out.println("****************");
        System.out.println("***Error: " + message + "***");
        System.out.println("****************");
    }
}
// Class implementing SpacedLogger
class SpacedLogger implements Logger {
    @Override
    public void log(String message) {
        StringBuilder spacedMessage = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            spacedMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedMessage.toString().trim());
    }
    @Override
    public void error(String message) {
        StringBuilder spacedErrorMessage = new StringBuilder("ERROR: ");
        for (int i = 0; i < message.length(); i++) {
            spacedErrorMessage.append(message.charAt(i)).append(" ");
        }
        System.out.println(spacedErrorMessage.toString().trim());
    }
}
public class App {
    public static void main(String[] args) {
        // Step 6a: Instantiate instances of logger classes
        Logger asteriskLogger = new AsteriskLogger();
        Logger spacedLogger = new SpacedLogger();
        // Step 6b: Test methods on both instances
        asteriskLogger.log("Hello");
        asteriskLogger.error("Hello");
        spacedLogger.log("Hello");
        spacedLogger.error("Hello");
    }
}
