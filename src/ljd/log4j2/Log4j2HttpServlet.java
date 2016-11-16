package ljd.log4j2;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log4j2HttpServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Logger logger = LoggerFactory.getLogger(Log4j2HttpServlet.class);
	private Logger productLog = LoggerFactory.getLogger("ProductLog");

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		this.process(req, resp);
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
		this.process(req, resp);
	}
	
	private void process(HttpServletRequest req, HttpServletResponse resp){
//		String s = "you are bicth!";
		System.out.println("---------111111111111111111--------");
		for(int i=0;i<10000;i++){
			productLog.error("i: {}", new Object[]{i});
			if(i%100 == 1){
				logger.warn("system out i: {}", new Object[]{i});
			}
		}
	}
}
