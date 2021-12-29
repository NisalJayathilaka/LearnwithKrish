package Nisal;
import java.util.*;
public class Freedy
{
	Scanner scanner = new Scanner(System.in);
	int meters;
	

	void calculateFreedysTime()
	{
	  System.out.println("What distance freedy what to jumps meters");
	meters= scanner.nextInt();

	if(meters > 0)
	{
		int round = meters / 9;
		int howManyRound = round * 9;
		double time = round * 6.5;
		int steps = 0;

		steps = round *3;
		int remainMeters = meters - howManyRound;

		if(remainMeters >=1 && remainMeters <=5)
		{
			time = time +1;
			steps = steps +1;
		}
		else if (remainMeters >= 6 && remainMeters <=8) {
			time =time +3;
			steps = steps +2;
		}

		System.out.println("times takes " + time);
		System.out.println("Steps takes " + steps);
	}
	}
}