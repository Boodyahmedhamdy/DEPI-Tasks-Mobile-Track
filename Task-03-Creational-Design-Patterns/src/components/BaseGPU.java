package components;



public abstract class BaseGPU extends Component {
    public int vRam = 0;

    @Override
    public String toString() {
        return "BaseGPU{" +
                "vRam=" + vRam +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", versionId=" + versionId +
                '}';
    }
}
