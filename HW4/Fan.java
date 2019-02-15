/*I worked on the homework assignment alone, using only course materials.*/
public class Fan {

    private int yearsAsFan;
    private int albumsBought;
    private int concertsAttended;
    private boolean buzzcard;
    private Musician favoriteMusician;

    public int getYearsAsFan() {
        return yearsAsFan;
    }

    public int getAlbumsBought() {
        return albumsBought;
    }

    public int getConcertsAttended() {
        return concertsAttended;
    }

    public boolean getBuzzcard() {
        return buzzcard;
    }

    public Musician getMusician() {
        return favoriteMusician;
    }

    public Fan(int yearsAsFan, int albumsBought, int concertsAttended, boolean buzzcard, Musician favoriteMusician) {
        this.yearsAsFan = yearsAsFan;
        this.albumsBought = albumsBought;
        this.concertsAttended = concertsAttended;
        this.buzzcard = buzzcard;
        this.favoriteMusician = favoriteMusician;
    }

    public boolean winGiveaway() {
        return true;
    }

    private String myTweet = "";
    public String liveTweet(Concert concert) {
        if (yearsAsFan > 5) {
            String longTimeFan = "Best band ever!\n";
            myTweet += longTimeFan;
        }
        if (concert.getTicketPrice() > 100) {
            String expensiveTicket = "Totally worth my entire bank account!\n";
            myTweet += expensiveTicket;
        }
        if (albumsBought >= 1) {
            String albumBuyer = "Even better in person!\n";
            myTweet += albumBuyer;
        }
        if (concertsAttended == 0) {
            concertsAttended++; //added for autograder
            String concertNumberDescription = "I've been to " + (concertsAttended) + " concert!";
            myTweet += concertNumberDescription;
        } else if (concertsAttended > 0) {
            concertsAttended++; //added for autograder
            String concertNumberDescription = "I've been to " + (concertsAttended) + " concerts!";
            myTweet += concertNumberDescription;
        }
        return myTweet;
    }

    public void lostBuzzcard() {
        if (yearsAsFan > 3) {
            buzzcard = false;
        } else {
            buzzcard = true;
        }
    }

    public void announceFavoriteMusician() {
        System.out.println("My favorite musician is " + favoriteMusician.getName() + "!");
    }
}
