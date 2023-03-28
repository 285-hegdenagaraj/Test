package com.example.demo.core;
import java.util.*;
public class FIIHelper
{
	public static < T, E> T getKeyByValue(java.util.Map< T, E> map, E value) {
		for (java.util.Map.Entry< T, E> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}


	public static UUID emptyGuid()
	{
		return new UUID(0,0);
	}
}
