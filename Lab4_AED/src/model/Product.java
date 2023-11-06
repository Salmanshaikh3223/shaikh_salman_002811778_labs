/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Salman
 */
public class Product {
    
    private String name;
    private int price;
    private int id;

    private static int count = 0;
    
    private ArrayList<Feature> features;
    
    public Product() {
        count++;
        id = count;
        features = new ArrayList<>();
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }
    
    public Feature addNewFeature(){
        Feature feature = new Feature(this);
        features.add(feature);
        return feature;
    }
    
     public void removeFeature(Feature f) {
        features.remove(f);
    }
    
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
    
    
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return name;
    }
    
}
