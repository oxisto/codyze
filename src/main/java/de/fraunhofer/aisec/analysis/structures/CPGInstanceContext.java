
package de.fraunhofer.aisec.analysis.structures;

import org.apache.tinkerpop.gremlin.structure.Vertex;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * key: Mark instance ("b"), value: the Vertex that usages of program variables corresponding to "b" REFERS_TO.
 */
public class CPGInstanceContext {
	// e.g. for
	//    using Botan as b, Random as r
	// maps "b" to its vertex and "r" to its vertex
	private Map<String, Vertex> entityAssignemnt = new HashMap<>();

	public void entityPut(String s, Vertex v) {
		entityAssignemnt.put(s, v);
	}

	public Vertex entityGet(String s) {
		return entityAssignemnt.get(s);
	}

	public Set<String> entityKeySet() {
		return entityAssignemnt.keySet();
	}
}