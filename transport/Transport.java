package org.transport;
import org.road.*;
import org.air.*;
public class Transport {
	public void Transportform() {
		System.out.println("transportform");
	}
	public static void main(String[] args) {
		Transport tp=new Transport();
		Road rd=new Road();
		Air ar=new Air();
		tp.Transportform();
		rd.bike();
		rd.bus();
		rd.car();
		rd.cycle();
		ar.aeroplane();
		ar.helicopter();
		
		
	}

}
