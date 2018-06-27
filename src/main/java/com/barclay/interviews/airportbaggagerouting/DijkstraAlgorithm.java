package com.barclay.interviews.airportbaggagerouting;

import java.util.List;
import com.barclay.interviews.airportbaggagerouting.model.DirectedEdge;

public interface DijkstraAlgorithm {
	public String findShortestPath(String entry, String dest, List<DirectedEdge> graphEdges);
}
