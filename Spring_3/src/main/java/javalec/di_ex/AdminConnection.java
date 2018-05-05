package javalec.di_ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;


public class AdminConnection implements EnvironmentAware,InitializingBean,DisposableBean{

	private Environment env;
	private String adminId;
	private String adminPw;
	
	@Override
	public void setEnvironment(Environment env) {
		// TODO Auto-generated method stub
		// first 
		System.out.println("Set Environments");
		setEnv(env);
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// second
		System.out.println("after Properties set");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}
	
	@Override
	public void destroy() throws Exception {
		// third
		
	}
		
	
	
	public Environment getEnv() {
		return env;
	}
	public void setEnv(Environment env) {
		this.env = env;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminPw() {
		return adminPw;
	}
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	
	

}
