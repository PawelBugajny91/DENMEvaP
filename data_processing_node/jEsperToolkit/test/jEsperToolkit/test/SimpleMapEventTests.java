/*  
 *  Copyright (C) 2015, Frankfurt University of Applied Sciences
 *
 *  This program is free software; you can redistribute it and/or modify it under the terms of the
 *  GNU General Public License as published by the Free Software Foundation; either version 2 of the License,
 *  or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 *  without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *  See the GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License along with this program;
 *  if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 *
 *
 *  Linking this library statically or dynamically with other modules is making a combined work based on this library.
 *  Thus, the terms and conditions of the GNU General Public License cover the whole combination.
 *
 *  As a special exception, the copyright holders of this library give you permission to link this library with
 *  independent modules to produce an executable, regardless of the license terms of these independent modules,
 *  and to copy and distribute the resulting executable under terms of your choice, provided that you also meet,
 *  for each linked independent module, the terms and conditions of the license of that module. An independent module
 *  is a module which is not derived from or based on this library. If you modify this library, you may extend
 *  this exception to your version of the library, but you are not obligated to do so. If you do not wish to do so,
 *  delete this exception statement from your version.
 * 
 *
 *
 *  In addition, this software is also licensed under the terms of the Eclipse Public License 
 *  (EPL) 1.0. You can find a copy of the EPL at: 
 *  http://opensource.org/licenses/eclipse-1.0.php
 */

package jEsperToolkit.test;

import static org.junit.Assert.*;
import jEsperToolkit.test.api.TestWithEsperRuntimeFacade;
import jEsperToolkit.util.MapEventHelper;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**
 * 
 * Simple tests for working with Map-based event types. 
 * 
 * @author Ruediger Gad
 *
 */
public class SimpleMapEventTests extends TestWithEsperRuntimeFacade {

    @Test
    public void getEventDescriptionMap() {
        Map<String, Object> event = new HashMap<String, Object>();
        event.put("number", 1);
        event.put("string", "one");

        Map<String, Object> eventDescription = MapEventHelper
                .getEventDescritption(event, null);
        
        assertEquals(Integer.class, eventDescription.get("number"));
        assertEquals(String.class, eventDescription.get("string"));

    }

    @Test
    public void addSimpleMapEvent() {
        Map<String, Object> event = new HashMap<String, Object>();
        event.put("number", 1);
        event.put("string", "one");
        
        erf.addEventType("SimpleMapEvent", event);
    }
    
    @Test(expected=RuntimeException.class)
    public void sendMapEventWithoutType() {
        Map<String, Object> event = new HashMap<String, Object>();
        event.put("number", 1);
        event.put("string", "one");
        
        /*
         * The send method with a single parameter is not intended for sending
         * Map-based events. 
         */
        erf.send(event);
    }

}
