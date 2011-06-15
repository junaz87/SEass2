/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

/**
 *
 * @author tdahl01
 */
public class Location {
    
    String desc;
    Location north, east, south, west;
    
    Location(String d){
        desc = d;
    }
        
    void setExits(Location n, Location e, Location s, Location w){
        north = n;
        east = e;
        south = s;
        west = w;
    }
}
