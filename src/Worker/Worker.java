package Worker;

//Описать класс с именем Worker, содержащую следующие поля:
//  фамилия и инициалы работника;
//  название занимаемой должности;
//  год поступления на работу.
//Написать программу, выполняющую следующие действия:
//  ввод с клавиатуры данных в массив, состоящий из двух элементов типа Worker (записи должны быть упорядочены по алфавиту);
//  если значение года введено не в соответствующем формате выдает исключение.
//  вывод на экран фамилии работника, стаж работы которого превышает введенное значение.
public class Worker implements Comparable<Worker> {
    private String name;
    private String jobtitle;
    private int year;
    private int experience;

    public Worker() {
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Worker o) {
        return this.year - o.year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", year=" + year + '}' +
                ", experience=" + experience + '\n';
    }


}








