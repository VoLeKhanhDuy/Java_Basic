/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qlhv.bean;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author WIN10
 */
public class DanhMucBean {
    private String kind;
    private JPanel jpn;
    private JLabel jb;

    public DanhMucBean() {
    }

    public DanhMucBean(String kind, JPanel jpn, JLabel jb) {
        this.kind = kind;
        this.jpn = jpn;
        this.jb = jb;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public JPanel getJpn() {
        return jpn;
    }

    public void setJpn(JPanel jpn) {
        this.jpn = jpn;
    }

    public JLabel getJb() {
        return jb;
    }

    public void setJb(JLabel jb) {
        this.jb = jb;
    }
    
    
    
}
