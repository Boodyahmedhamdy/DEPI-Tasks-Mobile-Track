package components;

public abstract class Component {
    public String name = "";
    public String brand = "";
    public int versionId = 0;

    @Override
    public String toString() {
        return "Component{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
