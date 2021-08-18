public class Comics {

    private String name;
    private int volume;
    private double number;
    private String publisher;
    private int yearPublished;

// constructors
    public Comics(String name, int volume, double number, String publisher, int yearPublished) {
        this.name = name;
        this.volume = volume;
        this.number = number;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }

    public Comics(String name, int volume, double number) {
        this.name = name;
        this.volume = volume;
        this.number = number;
    }

    public Comics(String name, int volume, double number, int yearPublished) {
        this.name = name;
        this.volume = volume;
        this.number = number;
        this.yearPublished = yearPublished;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

   public boolean isInPrint() {
        return true;
   }

   public String publishingSynopsis() {
        return "This is issue volume " + volume + ", issue number #" + number +
               " of the comic series " + name + ". The book was published by " + publisher + " in " + yearPublished + ".";

    }
}

