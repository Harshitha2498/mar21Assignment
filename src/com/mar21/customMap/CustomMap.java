package com.mar21.customMap;
import com.mar21.customMap.models.Custom;
/*
 * @Author Harshitha.D
 * Overrides the put() and get() methods in a custom implementation
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@SuppressWarnings("serial")
class CustomMap<K, V> extends HashMap<Integer, String> {
	// creating a new Custom class list
	List<Custom> list = new ArrayList<Custom>();

	// put() store the key-value pair in a custom data structure
	@Override
	public String put(Integer key, String value) {
		boolean keyExists = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == key) {
				list.get(i).setName(value);
				keyExists = true;
			}
		}
		if (!keyExists) {
			list.add(new Custom(key, value));
		}
		return super.put(key, value);
	}

	// get() retrieve the value associated with the given key from the custom data
	// structure
	@Override
	public String get(Object key) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == key) {
				return list.get(i).getName();
			}
		}
		return null;
	}

	// prints the list values
	public void printList() {
		System.out.println("list values:" + list.toString());
	}
}
