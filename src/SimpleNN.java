import java.util.Random;
public class SimpleNN {
    //first and only neuron ;u;
    public float weight;
    public float bias;
    public SimpleNN() {
        Random random = new Random();
        this.weight = random.nextFloat(-1, 1);
        this.bias = 0;
    }
    public void train(float training_data[], float expected_data[], int epochs) {
        float learning_rate = 0.1f;
        for(int epoch = 0 ; epoch < epochs ; epoch++) {
            float total_loss = 0.0f;
            for(int i = 0 ; i < training_data.length ; i++) {
                float x = training_data[i];
                float expected_x = expected_data[i];

                //forward
                float y = weight * x + bias;
                float z = y; //mya ctivation function is y=x

                //error calculation
                float error = (float)(Math.pow(z - expected_x, 2));
                total_loss += error;

                //backpropagation with my derivatives
                //i followed this dependencies in order to derivate:
                /*
                L depends on z, z depends on y, y depends on a weight and a bias
                so:          weight
                            /
                L -> z -> y
                            \
                             bias

                 with loss formula being L
                 */
                float dL_dz = 2*(z - expected_x);
                float dz_dy = 1;//my activation function is y=x
                float dy_dw = x;
                float dy_db = 1;

                float dL_dw = dL_dz * dz_dy * dy_dw;
                float dL_db = dL_dz * dz_dy * dy_db;

                weight -= dL_dw * learning_rate;
                bias -= dL_db * learning_rate;
            }
            System.out.println(epoch+". weight = "+weight+", bias = "+bias+", loss = "+total_loss);
        }
    }
    public float predict(float x) {
        return weight * x + bias;
    }
}
