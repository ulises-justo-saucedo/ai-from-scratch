public class Main {
    public static void main(String[] args) {
        float[] training_data = {2.0f, 3.0f, 4.0f, 5.0f};
        float[] expected_values = {4.0f, 6.0f, 8.0f, 10.0f};
        int epochs = 500;

        SimpleNN neural_network = new SimpleNN();
        neural_network.train(training_data, expected_values, epochs);

        int predictions = 15;
        for(int prediction = 0 ; prediction < predictions ; prediction++) {
            float nn_prediction = neural_network.predict(prediction);
            System.out.println("Prediction with x = "+prediction+": "+nn_prediction);
        }
    }
}