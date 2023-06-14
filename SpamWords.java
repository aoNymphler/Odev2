import java.util.Scanner;

public class SpamWords {

	public static void main(String[] args) {
		String[] spamWord= {"additional income","extra cash","big bucks", "billion","free trial","free gift","one time","prize","promise"
				,"prize","lowest price","giveaway","earn money","lower rates","winner","free hosting","free access","double your income"
				,"best price","double your cash","double your income","eliminate bad credit","expect to earn","financial freedom","bonus"
				,"deal","cheap","claims","discount","luxury"}; 
		int spamno=0;
		Scanner input =new Scanner(System.in);
		System.out.print("Please enter message : ");
		String msnmessage = input.nextLine().toLowerCase();
		for(String words : spamWord) {
			if(msnmessage.contains(words)) {
				spamno++;
			}
		}
		if(spamno >= 5) {
			System.out.println("I think there is a "+(100)+"% chance that this message is a spam message");
		}
		else {
			System.out.println("I think there is a "+(spamno*20)+"% chance that this message is a spam message");
		}
		
	}

}
