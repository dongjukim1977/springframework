package spring.di.ui;

<<<<<<< HEAD
import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	private Exam exam;
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}
	
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

=======
import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
	}
	
	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}
>>>>>>> branch 'master' of https://github.com/dongjukim1977/springframework.git

}
