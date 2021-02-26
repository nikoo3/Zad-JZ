package sda.zadENUM.ex3;

public enum TemperatureCovert {

    C_F('C', 'F', new Convert() {
        @Override
        public float covert(float tempIn) {
            return (tempIn * 9/ 5)+32;
        }
    }),
    C_K('C', 'K', new Convert() {
        @Override
        public float covert(float tempIn) {
            return tempIn +273.15f;
        }
    }),
    K_C('K', 'C', new Convert() {
        @Override
        public float covert(float tempIn) {
            return tempIn -273.15f;
        }
    }),
    F_C('F', 'C', new Convert() {
        @Override
        public float covert(float tempIn) {
            return (tempIn -32)*5/9;
        }
    }),
    F_K('F', 'K', new Convert() {
        @Override
        public float covert(float tempIn) {
            return (tempIn-32)*5/9+273.15f;
        }
    }),
    K_F('K', 'F', new Convert() {
        @Override
        public float covert(float tempIn) {
            return (tempIn +273.15f)*9/5+32;
        }
    });

    private Convert convert;
    private char output;
    private char input;

    TemperatureCovert(char input, char output, Convert convert){
        this.input = input;
        this.output = output;
        this.convert = convert;
    }

    public static float convertTemperature(char tempIn, char tempOut, float temp){
        for (TemperatureCovert temperatureCovert : values()){
            if (temperatureCovert.input == tempIn & temperatureCovert.output == tempOut)
                return temperatureCovert.convert.covert(temp);
        }
    }
}
