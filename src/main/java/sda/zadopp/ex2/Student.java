package sda.zadopp.ex2;

public class Student extends Person{
    private String studiesType;
    private int yStudy;
    private float price;

    public Student (){}

    Student(String name, String address, String studiesType, int yStudy, float price){
        super(name, address);
        this.studiesType = studiesType;
        this.yStudy = yStudy;
        this.price = price;
    }

    public String getStudyType() {
        return studiesType;
    }

    public void setStudyType(String studyType) {
        this.studiesType = studyType;
    }

    public int getyStudy() {
        return yStudy;
    }

    public void setyStudy(int yStudy) {
        this.yStudy = yStudy;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", studiesType='" + studiesType + '\'' +
                ", yStudy=" + yStudy +
                ", price=" + price +
                '}';
    }
}
