/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazarq;

/**
 *
 * @author Manuel
 */
public class Frm_Reglas extends javax.swing.JFrame {

    /**
     * Método constructor de clase Frm_Reglas que inicia componentes y configura coordenadas.
     */
    public Frm_Reglas() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reglas");

        jPanel1.setBackground(new java.awt.Color(53, 43, 49));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Reglas");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTextArea1.setBackground(new java.awt.Color(53, 43, 49));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(7);
        jTextArea1.setText(" TABLERO\n-El tablero es en forma de aspa (X) con cuatro divisiones y 52 casillas (14 casillas por aspa – 7 por cada lado del aspa – y 4 casillas centrales) \n\n-El número de casillas será variable de un máximo de 14 casillas por aspa, hasta un mínimo de 8 casillas. \n\n-Las casillas con triángulos (4 por aspa) También, existen casillas especiales para la salida o meta del tablero, marcadas en amarillo\n\nJUGADORES\n-Se permiten de 2 a 4 jugadores máximo, cada uno inicia de un extremo de la cruz o equis del tablero.\n\nFICHAS\n-Se inicia con 6 fichas para cada jugador, de diferentes colores (un color para cada jugador, el cual será configurable), que se irán avanzando por las casillas del tablero en dirección de las agujas del reloj,\npasando por todas las casillas hastan llegar a la salida, que será la misma aspa por la que se inició. Las fichas por jugador van a ser configurables de un mínimo de 2 a un máximo de 6.\n\nDADOS\n-Cada jugador deberá lanzar los 5 dados en su turno correspondiente y dependiendo como caigan podrá avanzar el número de casillas, como se indica a continuación.\no 1 caña con punto y las demás lisas, se avanza 1 casilla.\no 2 cañas con punto y las demás lisas, se avanzan 2 casillas.\no 3 cañas con punto y las demás lisas, se avanzan 3 casillas.\no 4 cañas con punto y la restante lisa, se avanzan 4 casillas.\no 5 cañas con punto, se avanzan 10 casillas.\no 5 cañas mostrando la cara lisa, no se avanza y se cede el turno al siguiente jugador.\n\nAPUESTAS\n-Las apuestas tendran un fondo fijo de apuesta para cada jugador (configurable) y un monto variable para apostar por vez (configurable). Si a un jugador se le acaba el fondo de apuestas, sale del juego automáticamente.\n\nMOVIMIENTOS\n1. Para ingresar de inicio una ficha en el tablero se tiene que sacar al menos un punto en la tirada de los 5 dados. Si la tirada no es exitosa debe pagar una apuesta a los contrincantes.\n\n2. Una vez con una ficha adentro, cada vez que un jugador logra obtener un punto en su tirada tiene la posibilidad de incorporar una ficha en el tablero, esto hasta que logre introducir sus 6 fichas.\n   oSi falta una ficha a ingresar y el jugador saca un punto, no puede introducir una nueva ficha en el tablero, si tiene una a una casilla de llegar a la meta, primero se avanza esta última, y la otra ficha tendrá que espera hasta que salga un uno nuevamente.\n\n3. Para ingresar una ficha, esta se coloca en la casilla central del tablero que le corresponde (el contrario a la salida).\n\n4. Con cada lanzada que mueve una sola ficha, en el orden en que las mismas fueron entrando al tablero. Por ejemplo: vamos a suponer que un jugador tiene ya una ficha ingresada al tablero, y en su siguiente lanzada obtiene 1, por lo tanto, \ningresa una nueva ficha; en el siguiente turno, la lanzada sería para avanzar la ficha que ingresó 1ero, luego en su siguiente lanzada, se moverá la segunda ficha, y así sucesivamente.\n   o Se pudiera escoger que ficha avanzar pagando una apuesta.\n\n5. No puede haber dos fichas de diferente color en la misma casilla. Si al hacer la tirada, la ficha cae en una casilla ocupada, se tienen las siguientes opciones.\n   o Si la casilla es una de las 4 centrales, la ficha que está actualmente en la casilla es eliminada.\n   o Si la casilla no es de las centrales, la ficha que cayó en la casilla ocupada se devuelve a la casilla de donde partió.\n\n6. Si un jugador saca una combinación en la que no le permita avanzar ninguna pieza (todas las cañas lisas) deberá pagar una apuesta.\n\n7. Si el jugador cae en una casilla con triángulo se paga doble apuesta.\n\n8. Si un jugador se queda sin fichas automáticamente pierde la partida.\n\n9. Cuando una ficha llega a la meta se cobra una apuesta a todos los contrincantes y se realiza una nueva jugada.\n\n10. Cuando se cae en la zona semicircular que hay al final de cada brazo del tablero (hay ocho casillas), juega dos turnos seguidos.\n\n11. Gana el jugador que logre meter primero todas sus fichas en la meta o en su defecto, aquel que logre meter el mayor número de fichas.");
        jScrollPane1.setViewportView(jTextArea1);

        btnAtras.setText("Atras");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(662, 662, 662)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       
        Frm_MenuPrincipal menu = new Frm_MenuPrincipal();
        menu.setVisible(true);
        this.dispose();
        
        
        
        
    }//GEN-LAST:event_btnAtrasActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}