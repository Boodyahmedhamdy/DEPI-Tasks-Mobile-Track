package builders;


public abstract class BaseCPUBuilder extends ComponentBuilder {
    public abstract BaseCPUBuilder setClockSpeed(int clockSpeed);
    public abstract BaseCPUBuilder setCacheMemory(int cacheMemory);
}
