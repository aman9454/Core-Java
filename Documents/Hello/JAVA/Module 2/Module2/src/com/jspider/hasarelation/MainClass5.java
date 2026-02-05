package com.jspider.hasarelation;
class Department{
	void teach() {
		System.out.println("Teaching Subject");
	}
}
class Student{
	void learn() {
		System.out.println("Students Learning");
	}
}
class College{
	Department dept=new Department();
	Student st;
	College(Student st)
	{
		this.st=st;
	}
	}
public class MainClass5 {
	public static void main(String[] args) {
		Student st=new Student();
		College col=new College(st);
		col.dept.teach();
		col.st.learn();
	}

}
