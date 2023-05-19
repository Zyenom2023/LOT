import javax.swing.*;

public class PhysicsCalculationGUI {
  public static void main(String[] args) {
    JFrame frame = new JFrame("Physics Calculation");
    JPanel panel = new JPanel();
    JLabel label1 = new JLabel("Enter the initial velocity:");
    JLabel label2 = new JLabel("Enter the acceleration:");
    JLabel label3 = new JLabel("Enter the time:");
    JTextField field1 = new JTextField(10);
    JTextField field2 = new JTextField(10);
    JTextField field3 = new JTextField(10);
    JButton button = new JButton("Calculate");
    JLabel resultLabel = new JLabel("The final velocity is:");
    JTextField resultField = new JTextField(10);
    
    panel.add(label1);
    panel.add(field1);
    panel.add(label2);
    panel.add(field2);
    panel.add(label3);
    panel.add(field3);
    panel.add(button);
    panel.add(resultLabel);
    panel.add(resultField);
    
    button.addActionListener(e -> {
      // Get input from user
      double v0 = Double.parseDouble(field1.getText());
      double a = Double.parseDouble(field2.getText());
      double t = Double.parseDouble(field3.getText());
      
      // Calculate final velocity
      double vf = v0 + a*t;
      
      // Output result
      resultField.setText(Double.toString(vf));
    });
    
    frame.add(panel);
    frame.setSize(300, 200);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
#For force

def calculate_force(mass, acceleration):
    force = mass * acceleration
    return force

# Example usage:
mass = 5  # Mass in kg
acceleration = 10  # Acceleration in m/s^2

result = calculate_force(mass, acceleration)
print("The force is:", result, "N")


