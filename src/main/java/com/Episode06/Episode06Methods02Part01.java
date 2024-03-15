package com.Episode06;

public class Episode06Methods02Part01 {
	
	public static void main(String[] args) {
		Episode06Methods02Part01 yt = new Episode06Methods02Part01();
		yt.deleteVideo("Video Number 01", 0);
		yt.deleteVideo("Guna Video", 2);
		yt.deleteVideo(123);
		
	}
	
	//accessModifier returnType methodName(parameter)
	private void deleteVideo(String videoId, int a) {
		
		//In the same class method name is same but the argument is different is called method overLoading.
		//PrintIn(String, int, float, etc) - it is a method over loading
		System.out.println("Deleted video - " + videoId + a);
	}
		private void deleteVideo(int a) {
		System.out.println("Delete int - " + a);
		}
	}


