public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        double tax = 0.0;
        if (this.salary < 1000) {
            System.out.println("Vergi uygulanmadı");
        } else {
            tax = this.salary * 0.03;
        }
        return tax;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus = (this.workHours - 40) * 30;
        }
        return bonus;
    }

    double raiseSalary() {
        int sure = 2021 - this.hireYear;
        double artis;
        if (sure < 10) {
            artis = this.salary * 0.05;
            return artis;
        } else if (sure < 20) {
            artis = (this.salary * 0.1);
            return artis;
        } else {
            artis = (this.salary * 0.15);
            return artis;
        }
    }

    void info() {
        double vergiBonus = this.salary + bonus() - tax();
        double toplamMaas = this.salary + raiseSalary();
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary + " TL");
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + "%" + this.tax());
        System.out.println("Bonus: " + this.bonus() + " TL");
        System.out.println("Maaş Artışı: " + this.raiseSalary() + " TL");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + vergiBonus + " TL");
        System.out.println("Toplam Maaş: " + toplamMaas + " TL");
    }
}