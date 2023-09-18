package gr.aueb.cf.ch17.clonable;

public class City implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                '}';
    }

    public City(){}

    public City(String name){
        this.name = name;
    }

    @Override
    protected City clone() throws CloneNotSupportedException {
        return (City)super.clone(); // Object.clone();
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        City city = (City) o;
        return getName() != null ? getName().equals(city.getName()) : city.getName() == null;
    }

    @Override
    public int hashCode(){
        return getName() != null ? getName().hashCode() : 0;
    }
}
