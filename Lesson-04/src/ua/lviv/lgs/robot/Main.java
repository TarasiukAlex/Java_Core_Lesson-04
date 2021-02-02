package ua.lviv.lgs.robot;

public class Main {

	public static void main(String[] args) {

		Robot rob = new Robot();
		Robot cofRob = new CoffeeRobot();
		Robot robDanc = new RobotDancer();
		Robot robCook = new RobotCoocker();

		rob.work();
		cofRob.work();
		robDanc.work();
		robCook.work();

		Robot robArray[] = { rob, cofRob, robDanc, robCook };

		for (int i = 0; i < robArray.length; i++) {

			robArray[i].work();

		}

	}

}
