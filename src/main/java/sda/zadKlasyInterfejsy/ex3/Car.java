package sda.zadKlasyInterfejsy.ex3;

public class Car {
    private String name;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    class Engine {
        private String engineType;

        public void setEngine(String type) {
            switch (type) {
                case "economy":
                    this.engineType = "diesel";
                    break;
                case "luxury":
                    this.engineType = "electric";
                    break;
                default:
                    this.engineType = "patrol";
            }
        }
    }
}
