package javalec.di_ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

	@Bean
	public Student student4() {
		String[] hobbys = {"golf" ,"game" , "racing"};
		Student student = new Student("java",15);
		student.setHobbys(hobbys);
		return student;
	}
	
	@Bean
	public Student student5() {
		String[] hobbys = {"book" ,"study" , "jogging"};
		Student student = new Student("alpaha",25);
		student.setHobbys(hobbys);
		return student;
	}
}
// 이러한 어노테이션 자바 파일을 이용하고 싶은 경우 메인함수에서
// annotationConfigApplcationConfig 를 사용해야 한다. 
