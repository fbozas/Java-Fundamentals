package gr.aueb.cf.ch17.clonable;

import java.util.Objects;

public class Trainee implements Cloneable{
    private String name;
    private City city;

    public Trainee(){}

    public Trainee(String name, City city){
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", city=" + city +
                '}';
    }

    protected Trainee clone() throws CloneNotSupportedException{
//        return (Trainee) super.clone(); // Object.clone()
        Trainee trainee = (Trainee) super.clone();
        trainee.setCity(new City(this.getCity().getName()));
        return trainee;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Trainee trainee = (Trainee) o;

        if(getName() != null ? !getName().equals(trainee.getName()) : trainee.getName() != null) return false;

//        return getCity() != null ? getCity().equals(trainee.getCity()) : trainee.getCity() == null;
        return Objects.equals(getName(), trainee.getName()) && Objects.equals(getCity(),trainee.getCity());
    }

    @Override
    public int hashCode(){
//        int result = 1;
////        return getName() != null ? getName().hashCode() : 0;
//        result = 31 * result + (getCity() != null ? getCity().hashCode() : 0);
//        return result;

        return Objects.hash(name, city);
    }
}
