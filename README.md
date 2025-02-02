## AI from Scratch

A simple Java application I created to experiment with building AI from scratch, without using any frameworks. This is a small linear regression model consisting of a single neuron. It's not very smart, but I'm somewhat proud of it.

## Installation

1. Clone the repository:

   ```
   git clone https://github.com/ulises-justo-saucedo/ai-from-scratch/
   ```

2. Open the project in any Java IDE and run it.

## Example

Like any other model, it requires training data. In this example, I'll feed it values that follow the equation *y = 2x*:

![image](https://github.com/user-attachments/assets/d44ea013-44fe-45be-91b5-4ec36aaa7d74)

Then, you can instantiate the model and train it using the given data:

![image](https://github.com/user-attachments/assets/c2abeee1-b41f-48b2-9fd5-9837bd20738f)

After training, you can make predictions:

![image](https://github.com/user-attachments/assets/a0c52817-42aa-45bd-bd98-e4a286951abe)
![image](https://github.com/user-attachments/assets/b8f335a1-f71c-4738-8d23-bcccf74905c8)

## Explanation

As mentioned earlier, this model uses a linear function as its activation function. The structure of the model is as follows:

![Untitled](https://github.com/user-attachments/assets/484f76bb-c6b6-4562-8ae5-ea9ca1b7ac23)

It employs [Mean Squared Error (MSE)](https://en.wikipedia.org/wiki/Mean_squared_error) to calculate the loss. The following derivatives were required for training:

![Untitle1d](https://github.com/user-attachments/assets/98484a9d-0140-439d-b9df-178bd9a733bb)

To train the model, I calculated the derivative of the loss function with respect to the weight and bias. These are represented in the code as follows:

![image](https://github.com/user-attachments/assets/3631b2c8-bab1-462c-9052-9af6896e9f81)

These values are then used to adjust the weight and bias, allowing the model to "learn":

![image](https://github.com/user-attachments/assets/881d9757-b210-4702-acd1-2c5d91c642f4)
