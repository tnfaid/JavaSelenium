import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PenerapanLog4J {
	
	static Logger log = Logger.getRootLogger();
	 
    public static void main(String[] args) {
        PropertyConfigurator.configure("log4j.properties");
 
        log.trace("Ini pesan trace");
        log.debug("Ini pesan debug");
        log.info("Ini pesan info");
        log.warn("Ini pesan warn");
        log.error("Ini pesan error");
        log.fatal("Ini pesan fatal");
        
 
    }

}
