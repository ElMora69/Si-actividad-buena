/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package componentesnew;


import javax.swing.*;

/**
 *
 * @author soryl
 */
public class ComponentesNew extends JFrame{
       private String[] lista = {"Bueno", "Malo", "Regular"}; // arreglo estandar para el JComboBox
       
       private JTextArea textArea = new JTextArea();
       private ButtonGroup botonGrupo1 = new ButtonGroup();
       private JRadioButton radio1 = new JRadioButton();
       private JRadioButton radio2 = new JRadioButton();
       private JCheckBox check1 = new JCheckBox();
       private JCheckBox check2 = new JCheckBox();
       private JComboBox combolista = new JComboBox(lista); //agregamos el listado

    public ComponentesNew() {
       setTitle("Copiar Pegar");
       setSize(350, 300);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
    }
    
    public void AddComponentes(JPanel panel1) {
        // Configuración de JTextArea
        textArea.setBounds(10, 20, 300, 100); // Posición y tamaño del JTextArea
        panel1.add(textArea);
        
        // Agrupamos los JRadioButton en el ButtonGroup
        botonGrupo1.add(radio1);
        botonGrupo1.add(radio2);
        
        // Configuración de los JRadioButton
        radio1.setBounds(10, 130, 80, 30); // Coordenadas y tamaño del RadioButton 1
        radio1.setText("Radio 1");
        panel1.add(radio1);
        
        radio2.setBounds(100, 130, 80, 30); // Coordenadas y tamaño del RadioButton 2
        radio2.setText("Radio 2");
        panel1.add(radio2);
        
        // Configuración de los JCheckBox
        check1.setBounds(10, 170, 100, 30); // Coordenadas y tamaño del CheckBox 1
        check1.setText("Revisar el radio 1");
        panel1.add(check1);

        check2.setBounds(120, 170, 100, 30); // Coordenadas y tamaño del CheckBox 2
        check2.setText("Revisar el radio 2");
        panel1.add(check2);

        // Configuración del JComboBox
        combolista.setBounds(10, 210, 120, 30); // Coordenadas y tamaño del ComboBox
        combolista.addItem("Excelente"); // Agregamos más elementos al JComboBox
        panel1.add(combolista);
    }
    
    public static void main(String[] args) {
        ComponentesNew ventana = new ComponentesNew();
        
        JPanel panel1 = new JPanel(); // Contenedor para agrupar componentes
        panel1.setLayout(null); 
        ventana.getContentPane().add(panel1); // Agregamos el panel a la ventana con getContentPane

        ventana.AddComponentes(panel1); // Llamamos al método AddComponentes y pasamos el panel creado
        
        ventana.setVisible(true); // Hacemos visible nuestra ventana
    }
}

