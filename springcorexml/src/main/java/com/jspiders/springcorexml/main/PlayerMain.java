package com.jspiders.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.springcorexml.bean.Player;

public class PlayerMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("player_config.xml");
		Player player1 = (Player) applicationContext.getBean("player1");
		System.out.println(player1);
		Player player2 = (Player) applicationContext.getBean("player2");
		System.out.println(player2);
		((ClassPathXmlApplicationContext) applicationContext).close();

	}

}
