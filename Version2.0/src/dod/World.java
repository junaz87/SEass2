/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dod;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author tdahl01
 */
public class World {
    
    ArrayList<Location> locations;
    
    World(){
        Location bb = new Location("by a babbling brook");
        Location mm = new Location("up in some misty mountains");
        Location dc = new Location("in the cave of Gwent the dragon");
        Location sf = new Location("in a sunny field");
        Location go = new Location("by a great oak");
        Location ms = new Location("in some murky marshes");
        Location tr = new Location("in some deserted tower ruins");
        Location hc = new Location("on top of some high cliffs");
        Location lb = new Location("on a lonely beach");
        
        bb.setExits(sf,mm,null,null);
        mm.setExits(go,dc,null,bb);
        dc.setExits(null,null,null,mm);
        sf.setExits(tr,go,bb,null);
        go.setExits(hc,ms,mm,sf);
        ms.setExits(lb,null,null,go);
        tr.setExits(null,null,sf,null);
        hc.setExits(null,lb,go,null);
        lb.setExits(null,null,ms,hc);
        
        Location[] ls = new Location[] {bb,mm,dc,sf,go,ms,tr,hc,lb};
        locations = new ArrayList(Arrays.asList(ls));
    }
}
