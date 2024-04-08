
package com.sirorlando;

import java.util.HashMap;
import java.util.Map;

/*
 * Class representing a room in the game world
 */
class Room {
   private String title;
   private String description;
   private Map<String, Integer> exits; // Mapping of directions to room IDs
   private Map<String, String> objects; // Mapping of object names to descriptions

   public Room(String title, String description) {
       this.title = title;
       this.description = description;
       exits = new HashMap<>();
       objects = new HashMap<>();
   }

   public void addExit(String direction, int roomId) {
       exits.put(direction.toUpperCase(), roomId);
   }

   public void addObject(String objectName, String objectDescription) {
       objects.put(objectName.toLowerCase(), objectDescription);
   }

   public String getTitle() {
       return title;
   }

   public String getDescription() {
       return description;
   }

   public int getExit(String direction) {
       return exits.getOrDefault(direction.toUpperCase(), -1);
   }

   public String getObjectDescription(String objectName) {
       return objects.get(objectName.toLowerCase());
   }
}
