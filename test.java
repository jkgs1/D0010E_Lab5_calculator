class GUI implements Runnable {

    public static void main(String[] args) {
        EventQueue.invokeLater(new GUI());
    }

    @Override
    public void run() {
        JFrame myFrame = new JFrame("Frame Title");

        myFrame.setLocation(new Point(100, 100));
        myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        myFrame.getContentPane().add(mainPanel);
        mainPanel.add(new JButton("Button Text"), BorderLayout.CENTER);

        myFrame.pack();
        myFrame.setLocationByPlatform(true);
        myFrame.setVisible(true);
    }

}