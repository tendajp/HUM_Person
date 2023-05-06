class Person
{
    //Pola klasy Person
    private String name, surname, pesel;
    //Konstruktir bez paramtrów
    Person()
    {
        this.name = null;
        this.surname = null;
        this.pesel = null;
        System.out.println("maj nejm is Person KoNsTrUkToR");
    }

    //Konstruktir bez paramtrów
    Person(String n, String s, String p)
    {
        this.name = n;
        this.surname = s;
        this.pesel = p;
        System.out.println("maj nejm is Person KoNsTrUkToR with Params");
    }
    //Metody typu setter
    void setName(String name)
    {
        this.name = name;
    }
    void setSurname(String surname)
    {
        this.surname = surname;
    }
    void setPesel(String pesel)
    {
        this.pesel = pesel;
    }

    //Metody typu setter
    String getName()
    {
        return this.name;
    }
    String getSurname()
    {
        return this.surname;
    }
    String getPesel()
    {
        return this.pesel;
    }
    void info()
    {
        System.out.println(this.getName() + " , " + this.getSurname() + " , " + this.getPesel());
    }

}

class Menager extends Person
{
    //Pola klasy Person
    private double salary, bonus;
    //Konstruktir bez paramtrów
    Menager()
    {
        super();
        this.salary = 0;
        this.bonus = 0;
        System.out.println("maj nejm is Manager KoNsTrUkToR");
    }

    //Konstruktir bez paramtrów
    Menager(String n, String s, String p, double sal, double bon)
    {
        super(n, s, p); // wywołanie konstruktora klasy Person
        this.salary = sal;
        this.bonus = bon;
        System.out.println("maj nejm is Manager KoNsTrUkToR with Params");
    }
    //Metody typu setter
    void setSalary(double sal)
    {
        this.salary = sal;
    }
    void setBonus(double bon)
    {
        this.bonus = bon;
    }

    //Metody typu setter
    double getSalary()
    {
        return this.salary;
    }
    double getBonus()
    {
        return this.bonus;
    }

    double getMonthSalary()
    {
        return this.salary + this.bonus; // obliczanie pensji miesięcznej
    }

    void getInfo()
    {
        System.out.print("-------------------MANAGER----------------------\n");
        super.info(); //wywołanie z klasy Person
        System.out.println("Pensja = Podstawa :" + this.salary + " Bonus : " + this.bonus);
        System.out.println("Pensja miesięczna : " + getMonthSalary());
    }

}

class OfficeWorker extends Person
{
    //Pola klasy Person
    private double rate;
    private int hours;
    //Konstruktir bez paramtrów
    OfficeWorker()
    {
        super();
        this.rate = 0.0;
        this.hours = 0;
        System.out.println("maj nejm is OfficeWorker KoNsTrUkToR");
    }

    //Konstruktir bez parametrów
    OfficeWorker(String n, String s, String p, double rat, int h)
    {
        super(n, s, p); // wywołanie konstruktora klasy Person
        this.rate = rat;
        this.hours = h;
        System.out.println("maj nejm is Manager KoNsTrUkToR with Params");
    }
    //Metody typu setter
    void setRate(double rat)
    {
        this.rate = rat;
    }
    void setBonus(int h)
    {
        this.hours = h;
    }

    //Metody typu setter
    double getRate()
    {
        return this.rate;
    }
    int getHours()
    {
        return this.hours;
    }

    double getMonthSalary()
    {
        return this.rate * this.hours; // obliczanie pensji miesięcznej
    }

    void getInfo()
    {
        System.out.print("-------------------OFFICEWORKER----------------------\n");
        super.info(); //wywołanie z klasy Person
        System.out.println("Pensja = Podstawa :" + this.rate + " razy " + this.hours + " godzin ");
        System.out.println("Pensja miesięczna : " + getMonthSalary());
    }

}

class SalesMan extends OfficeWorker
{
    //Pola klasy SalesMan
    private double sale, percent;
    //Konstruktir bez paramtrów
    SalesMan()
    {
        super();
        this.sale = 0.0;
        this.percent = 0.0;
        System.out.println("maj nejm is SalesMan KoNsTrUkToR");
    }

    //Konstruktir bez parametrów
    SalesMan(String n, String s, String p, double rat, int h, double sal, double perc)
    {
        super(n, s, p, rat, h); // wywołanie konstruktora klasy OfficeWorker
        this.sale = sal;
        this.percent = perc;
        System.out.println("maj nejm is SalesMan KoNsTrUkToR with Params");
    }
    //Metody typu setter
    void setSale(double sal)
    {
        this.sale = sal;
    }
    void setPercent(int perc)
    {
        this.percent = perc;
    }

    //Metody typu setter
    double getSale()
    {
        return this.sale;
    }
    double getPercent()
    {
        return this.percent;
    }

    double getMonthSalary()
    {
        return super.getMonthSalary() + this.sale * this.percent; // obliczanie pensji miesięcznej
    }

    void getInfo()
    {
        System.out.print("-------------------SALEMAN----------------------\n");
        super.info(); //wywołanie z klasy Person
        System.out.println("Pensja = Podstawa :" + this.sale + " razy " + this.percent + " godzin ");
        System.out.println("Pensja miesięczna : " + getMonthSalary());
    }

}

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Kadra pracownicza\n");
        Person person1 = new Person();
        Person person2 = new Person("Tatryk", "Pendaj", "123123123");
        Menager manager1 = new Menager("Anna", "Kowalska", "123123123", 11500, 1000 );
        OfficeWorker ow1 = new OfficeWorker("Maciej", "Nowak", "123123123", 25, 158  );
        SalesMan sm1 = new SalesMan("Zbigniew", "Wodecki", "123123123", 25, 168, 19500, 0.003  );
        person2.info();
        person1.info();
        manager1.getInfo();
        ow1.getInfo();
        sm1.getInfo();
    }
}