package operateLog4j;

import org.apache.log4j.Logger;

public class Logestic {

	final static Logger logger = Logger.getLogger(Logestic.class);

	public static void main(String[] args) {

		Logestic obj = new Logestic();
		obj.runMe("mkyong");
	}

	private void runMe(String parameter) {

		if (logger.isDebugEnabled()) {
			logger.debug("This is debug : " + parameter);
		}
		if (logger.isInfoEnabled()) {
			logger.info("This is info : " + parameter);
		}
		logger.warn("This is warn : " + parameter);
		logger.error("This is error : " + parameter);
		logger.fatal("This is fatal : " + parameter);
	}
}
