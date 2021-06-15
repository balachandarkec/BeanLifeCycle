package in.stack.lifecycleDemo.config;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import in.stack.lifecycleDemo.model.User;

@Component
public class DataBaseInitializer implements InitializingBean, DisposableBean  {
	
	private List<User> users =new ArrayList<>();
	
//	
//	@PostConstruct
//	public void afterInit() {
//		
//
//		User u1=new User(1,"Malar");
//		User u2=new User(2,"Veena");
//		User u3=new User(3,"Ravi");
//		User u4=new User(4,"Mani");
//		
//		users.add(u4);
//		users.add(u3);
//		users.add(u1);
//		users.add(u2);
//		users.forEach(user->System.out.println(user.toString()));
//	}
	
	

	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
		User u1=new User(1,"Malar");
		User u2=new User(2,"Veena");
		User u3=new User(3,"Ravi");
		User u4=new User(4,"Mani");
		
		users.add(u4);
		users.add(u3);
		users.add(u1);
		users.add(u2);
		users.forEach(user->System.out.println(user.toString()));
		
	
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Clean Up progressing............");
		users.clear();
		users.forEach(user->System.out.println(user.toString()));
		System.out.println("Clean Up Completed!");
	}


}
