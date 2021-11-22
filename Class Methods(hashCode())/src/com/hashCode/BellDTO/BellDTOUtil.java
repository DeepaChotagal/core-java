package com.hashCode.BellDTO;

public class BellDTOUtil {

	public static void main(String[] args){
		BellDTO bell = new BellDTO();
		bell.setBellid(10);
		
		System.out.println(bell.hashCode());
	}
}
