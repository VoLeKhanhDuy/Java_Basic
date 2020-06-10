/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hocvien.controller;


import javax.swing.JPanel;
import javax.swing.JLanel;
import java.awt.Color;
import java.awt.BorderLayout;


/**
 *
 * @author WIN10
 */
public class ChuyenManHinhController {
    private JPanel root;
    private String kindSelected = "";
    
    public ChuyenManHinhController(JPanel, jpnRoot)
    {
        this.Root = jpnRoot;
    }
    
    private void setView(JPanel jpnItem, JLabel jlbItem)
    {
        kindSelected = "TrangChu";
        jpnItem.setBackground(new Color(96, 100, 191));
        jlbItem.setBackground(new Color(96, 100, 191));
        root.removeAll();
        root.setLayout(new BorderLayout);
        root.add(root);
        root.validate;
        root.repaint();
    }
}
