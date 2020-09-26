public class GreeterTest {

static void main(String[] args){

	Greeter me = new Greeter("John");
	System.out.println(me.sayHello());
	System.out.println(me.sayGoodbye());
	System.out.println(me.refuseHelp());
	
}
}