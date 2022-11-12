A map contains key:value pair.

Each key and value pair is known as an entry. 
keys always be unique.

we cannot traverse map diretley so we  need to convert it into Set - 
using keySet() or
entrySet() method.


HashMap	HashMap is the implementation of Map, but it doesn't maintain any order.


LinkedHashMap	LinkedHashMap is the implementation of Map. It inherits HashMap class. It maintains insertion order.


TreeMap	TreeMap is the implementation of Map and SortedMap. It maintains ascending order.  

_________________________________________________________________________________________________________________________________________
put(Object key, Object value)	--It is used to insert an entry in the map.
putAll(Map map)	It is used to insert the specified map in the map.
putIfAbsent(K key, V value)	It inserts the specified value with the specified key in the map only if it is not already specified.

remove(Object key)	It is used to delete an entry for the specified key.
emove(Object key, Object value)	It removes the specified values with the associated specified keys from the map.

 keySet()	It returns the Set view containing all the keys.
 
 entrySet()	It returns the Set view containing all the keys and values.
 setValue(V value)	It is used to replace the value corresponding to this entry with the specified value.

