public class ConcertSimulator {
  public static void main(String[] args) {

	  System.out.println("sjdvbfksjbv");
	  Musician myManKlaus = new Musician("Christopher W. Klaus", "violin", 30);
	  Musician toHellWithGeorgia = new Musician("UGA", "students", 234);
	  Fan geraldClough = new Fan (14, 8, 0, true, myManKlaus);
	  Concert myConcert = new Concert (500, 60, "Mercedes-Benz Stadium", "02/03/2019");
	  myConcert.sellTicket();
	  if (myConcert.isSoldOut()) {
		  System.out.println("Sorry!");
	  }
	  System.out.println(geraldClough.liveTweet(myConcert));
  }
}
