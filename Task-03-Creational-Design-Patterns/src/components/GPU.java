package components;

import builders.BaseGPUBuilder;
import builders.ComponentBuilder;

public class GPU extends BaseGPU{


    private GPU(
            String name, String brand, int versionId, int vRam
    ) {
        this.name = name;
        this.brand = brand;
        this.versionId = versionId;
        this.vRam = vRam;
    }


    public static class Builder extends BaseGPUBuilder {
        private String name;
        private String brand;
        private int versionId;
        private int vRam;

        @Override
        public BaseGPUBuilder setVRam(int vRam) {
            this.vRam = vRam;
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
            this.versionId = version;
            return this;
        }

        @Override
        public GPU build() {
            return new GPU(
                    name, brand, versionId, vRam
            );
        }
    }
}
