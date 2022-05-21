package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Exam exam = new NewlecExam();
		
		// DI
		// 소스 코드 없이 사용하려면.. 설정으로 빼야 한다.
		// ExamConsole console = ?
		
		//ExamConsole console = new InlineExamConsole(exam);
		//ExamConsole console = new GridExamConsole(exam);	// 생성자를 통한 결합
		
		ExamConsole console = new GridExamConsole();
		console.setExam(exam);
		*/
		
		//ExamConsole console = ?;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		ExamConsole console = context.getBean(ExamConsole.class);
		//context.getBean("console");
		
		console.print();
	}

}
