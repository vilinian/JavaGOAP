package pub.p1387h.javaGOAP;

import pub.p1387h.javaGOAP.graph.DirectedWeightedGraph;
import pub.p1387h.javaGOAP.graph.IWeightedGraph;
import pub.p1387h.javaGOAP.graph.WeightedEdge;

/**
 * DefaultGoapPlanner.java --- The default implementation of the GoapPlanner.
 * 
 * @author P H - 15.03.2017
 *
 */
public class DefaultGoapPlanner extends GoapPlanner {

	@Override
	protected <EdgeType extends WeightedEdge> IWeightedGraph<GraphNode, EdgeType> generateGraphObject() {
		return new DirectedWeightedGraph<GraphNode, EdgeType>();
	}
}
