package com.javalab.polymorphism.pkg14;
/**
 * [필드의 다형성]
 * 인터페이스를 구현한 클래스들을 사용하는 클래스
 * 1) 첫번쨰는 필드를 특정 타이어로 고정하고 테스트
 * 2) 필드를 인터페이스 타입으로 변경
 */
public class Car { // class s

	//1. 필드(특정 타이어 타입으로 고정) (x)
	// HankookTire tire1 = new HankookTire();
	// HankookTire tire2 = new HankookTire();

	//2. 필드(타이어 인터페이스 타입으로 변경)
	Tire tire1 = new HankookTire();		// 다형성을 적용하려면 인터페이스타입이 와야한다
	Tire tire2 = new HankookTire();		// 다형성을 적용하려면 인터페이스타입이 와야한다
	
	//메소드
	void run() {
		tire1.roll();
		tire2.roll();
	}
} // class e
