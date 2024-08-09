/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_task;

/**
 *
 * @author Hawk
 */
class binarysearch { 
	int binarysearch(int arr[], int x) 
	{ 
		int l = 0, r = arr.length - 1; 
		while (l <= r) { 
			int m = l + (r - l) / 2; 

			if (arr[m] == x) 
				return m; 

			if (arr[m] < x) 
				l = m + 1; 
			else
				r = m - 1; 
		}
		return -1; 
	}
} 
