package components;

import builders.BaseCPUBuilder;
import builders.ComponentBuilder;

public class CPU extends BaseCPU {

    private CPU(String name, String brand, int version, int clockSpeed, int cacheMemory) {
        this.name = name;
        this.brand = brand;
        this.versionId = version;
        this.clockSpeed = clockSpeed;
        this.cacheMemory = cacheMemory;
    }

    @Override
    public String toString() {
        return this.name + " " + this.brand + " " + this.versionId + " " + this.clockSpeed + " " + this.cacheMemory;
    }

    public static class Builder extends BaseCPUBuilder {
        private String name;
        private String brand;
        private int version;
        private int clockSpeed;
        private int cacheMemory;

        @Override
        public BaseCPUBuilder setClockSpeed(int clockSpeed) {
            this.clockSpeed = clockSpeed;
            return this;
        }

        @Override
        public BaseCPUBuilder setCacheMemory(int cacheMemory) {
            this.cacheMemory = cacheMemory;
            return this;
        }

        @Override
        public ComponentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        @Override
        public ComponentBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        @Override
        public ComponentBuilder setVersion(int version) {
            this.version = version;
            return this;
        }

        @Override
        public CPU build() {
            return new CPU(
                    name, brand, version, clockSpeed, cacheMemory
            );
        }
    }
}
