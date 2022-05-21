package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

<<<<<<< HEAD
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
=======
import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		Exam exam = context.getBean(Exam.class);
		System.out.println(exam.toString());
		
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//List<Exam> exams = new ArrayList<>();
		// setting.xml 에서 exams 객체 생성
		//exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam e : exams) {
		//	System.out.println(e);
		//}
>>>>>>> branch 'master' of https://github.com/dongjukim1977/springframework.git
	}

}
