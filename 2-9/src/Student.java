
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
		// Student (name) ������ ȣ��
		this(name); // this.name=name�� ����
		this.grade=grade; //this(grade);
		this.ban=ban;
	}	
	void printInfo()
	{
		System.out.println(name+"��  "+grade+"�г� "+ ban +"���Դϴ�.");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Student park=new Student();
		park.name="����ȭ";
		park.grade=2;
		park.ban=8;
		park.number=27;
		park.telephone="010-1234-1234";
		
		Student bak=new Student(2,6);
		Student hong=new Student("��ȫ�ڼ�����");
		
		System.out.println(bak.grade+"�г�"+bak.ban+"���� ���Ӽ�������"+hong.name+"�Դϴ�.");
		Student ja=new Student("������",2,6);
		
		ja.printInfo();
		System.out.println("�л��� �̸��� "+park.name+" �̰� "+park.grade+"�г� �Դϴ�.");
		System.out.println(park.name+" �л��� ��ȭ��ȣ�� "+park.telephone+"�Դϴ�.");
	}

}
