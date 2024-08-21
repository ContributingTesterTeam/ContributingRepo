package org.projects.contributingrepo.pattern;

public class Builder {
    private final String value1;
    private final String value2;
    private final String value3;
    private final String value4;
    private final String value5;

    public class BuilderPattern {
        private String value1;
        private String value2;
        private String value3;
        private String value4;
        private String value5;

        public BuilderPattern(String value1, String value2, String value3, String value4, String value5) {
            this.value1 = value1;
            this.value2 = value2;
            this.value3 = value3;
            this.value4 = value4;
            this.value5 = value5;
        }

        public Builder build() {
            return new Builder(this);
        }
    }

    private Builder(BuilderPattern builderPattern) {
        value1 = builderPattern.value1;
        value2 = builderPattern.value2;
        value3 = builderPattern.value3;
        value4 = builderPattern.value4;
        value5 = builderPattern.value5;
    }

}
