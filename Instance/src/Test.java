
public class Test {

	public static void main(String[] args){
		Person taro=new Person();
		Person jiro=new Person();
		Person hanako=new Person();
		Person shimada=new Person();
		Robot aibo=new Robot();
		Robot asimo=new Robot();
		Robot pepper=new Robot();

		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber=",123-45-6789,";
		taro.address="東京";


		jiro.name="木村次郎,";
		jiro.age=18;
		hanako.name="鈴木花子,";
		hanako.age=16;
		shimada.name="嶋田麻人,";
		shimada.age=27;

		aibo.name="aibo";
		asimo.name="asimo";
		pepper.name="pepper";

		System.out.print(taro.name);
		System.out.print(taro.age);
		System.out.print(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		System.out.print(jiro.name);
		System.out.println(jiro.age);

		System.out.print(hanako.name);
		System.out.println(hanako.age);

		System.out.print(shimada.name);
		System.out.println(shimada.age);

		aibo.talk();
		aibo.walk();
		aibo.run();

		asimo.talk();
		asimo.walk();
		asimo.run();

		pepper.talk();
		pepper.walk();
		pepper.run();
	}

}
