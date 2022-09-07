package Lab_4.Program_2;

public class Player {
    private String name;
    private int age;
    private String country;

    public Player(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Country: " + country;
    }
}

class cricketPlayer extends Player {
    private String type;
    private int matches;

    public cricketPlayer(String name, int age, String country, String type, int matches) {
        super(name, age, country);
        this.type = type;
        this.matches = matches;
    }

    public String getType() {
        return type;
    }

    public int getMatches() {
        return matches;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public String toString() {
        return super.toString() + ", Type: " + type + ", Matches: " + matches;
    }
}

class hockeyPlayer extends Player {
    private String type;
    private int matches;

    public hockeyPlayer(String name, int age, String country, String type, int matches) {
        super(name, age, country);
        this.type = type;
        this.matches = matches;
    }

    public String getType() {
        return type;
    }

    public int getMatches() {
        return matches;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public String toString() {
        return super.toString() + ", Type: " + type + ", Matches: " + matches;
    }
}

class footballPlayer extends Player {
    private String type;
    private int matches;

    public footballPlayer(String name, int age, String country, String type, int matches) {
        super(name, age, country);
        this.type = type;
        this.matches = matches;
    }

    public String getType() {
        return type;
    }

    public int getMatches() {
        return matches;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    public String toString() {
        return super.toString() + ", Type: " + type + ", Matches: " + matches;
    }
}

class Main {
    public static void main(String[] args) {
        cricketPlayer c = new cricketPlayer("Virat Kohli", 32, "India", "Batsman", 100);
        hockeyPlayer h = new hockeyPlayer("Rani Rampal", 26, "India", "Defender", 50);
        footballPlayer f = new footballPlayer("Lionel Messi", 33, "Argentina", "Forward", 150);

        System.out.println(c);
        System.out.println(h);
        System.out.println(f);
    }
}