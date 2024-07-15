package builders;


import components.Component;

public abstract class ComponentBuilder {
    public abstract ComponentBuilder setName(String name);
    public abstract ComponentBuilder setBrand(String brand);
    public abstract ComponentBuilder setVersion(int version);

    public abstract Component build();
}
