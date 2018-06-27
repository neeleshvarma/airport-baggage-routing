package com.barclay.interviews.airportbaggagerouting;

public class DijkstraAlgorithmFactory {

	public static DijkstraAlgorithm createDijkstraAlgorithm() {
		return new DijkstraAlgorithmImpl();
	}
}
