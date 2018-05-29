
public class Student {
	String name;
	int grade;
	int ban;
	int number;
	String telephone;
	
	Student() {}
	Student(String name) {
		this.name=name;
	}
	Student(int grade, int ban)
	{
		this.grade=grade;
		this.ban=ban;
	}
	Student(String name, int grade, int ban)
	{
		// Student (name) 생성자 호출
		this(name); // this.name=name과 같음
		this.grade=grade; //this(grade);
		this.ban=ban;
	}	
	void printInfo()
	{
		System.out.println(name+"은  "+grade+"학년 "+ ban +"반입니다.");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student park=new Student();
		park.name="박정화";
		park.grade=2;
		park.ban=8;
		park.number=27;
		park.telephone="010-1234-1234";
		
		Student bak=new Student(2,6);
		Student hong=new Student("박홍자선생님");
		
		System.out.println(bak.grade+"학년"+bak.ban+"반의 담임선생님은"+hong.name+"입니다.");
		Student ja=new Student("신진아",2,6);
		
		ja.printInfo();
		System.out.println("학생의 이름은 "+park.name+" 이고 "+park.grade+"학년 입니다.");
		System.out.println(park.name+" 학생의 전화번호는 "+park.telephone+"입니다.");
	}

}
