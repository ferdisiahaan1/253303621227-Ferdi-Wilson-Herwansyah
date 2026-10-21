package com.unpri.charactermanager.view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.util.ArrayList;
import com.unpri.charactermanager.model.Character;

/**
 * Jendela utama aplikasi Character Manager.
 * Menampilkan daftar karakter yang diterima dari luar secara dinamis
 * serta statistik rata-rata level.
 */
public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private ArrayList<Character> characterList;
    private double averageLevel;

    // Overloaded Constructor untuk menerima daftar karakter + rata-rata level
    public MainWindow(ArrayList<Character> characterList, double averageLevel) {
        super("Character Manager v0.3");
        this.characterList = characterList;
        this.averageLevel = averageLevel;

        initComponents();

        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Constructor bawaan (fallback jika averageLevel dihitung manual)
    public MainWindow(ArrayList<Character> characterList) {
        this(characterList, calculateAverage(characterList));
    }

    private static double calculateAverage(ArrayList<Character> list) {
        if (list == null || list.isEmpty()) return 0.0;
        int total = 0;
        for (Character c : list) {
            total += c.getLevel();
        }
        return (double) total / list.size();
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        // Header Title
        JLabel titleLabel = new JLabel("=== Daftar Karakter (" + characterList.size() + ") ===");
        titleLabel.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(titleLabel);
        mainPanel.add(javax.swing.Box.createVerticalStrut(10));

        // Loop setiap Character, buat SATU JLabel baru untuk masing-masing (Dinamis)
        for (Character c : characterList) {
            String info = c.getName() + " | " + c.getType() +
                          " | Lv." + c.getLevel() +
                          " | HP:" + c.getHitPoints() +
                          " | ATK:" + c.getAttackPower() +
                          " | Mana:" + c.getMana();
            JLabel characterLabel = new JLabel(info);
            characterLabel.setAlignmentX(LEFT_ALIGNMENT);
            mainPanel.add(characterLabel);
            mainPanel.add(javax.swing.Box.createVerticalStrut(5));
        }

        mainPanel.add(javax.swing.Box.createVerticalStrut(15));

        // Mini-Challenge: Label Statistik Rata-rata Level
        String statsText = String.format("📊 Rata-rata Level: %.2f", averageLevel);
        JLabel statsLabel = new JLabel(statsText);
        statsLabel.setAlignmentX(CENTER_ALIGNMENT);
        mainPanel.add(statsLabel);

        add(mainPanel, BorderLayout.CENTER);
    }
}