package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;

import spring.di.entity.Exam;

public class GirdExamConsole implements ExamConsole {

	private Exam exam;
	
	public GirdExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GirdExamConsole(Exam exam) {
		this.exam = exam;
	}
	
	@Override
	public void print() {
		System.out.printf("total : %d, avg : %f\n", exam.total(), exam.avg());

	}

	@Autowired
	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

}
