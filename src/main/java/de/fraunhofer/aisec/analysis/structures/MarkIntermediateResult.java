
package de.fraunhofer.aisec.analysis.structures;

public class MarkIntermediateResult {
	private ResultType resultType;

	public enum ResultType {
		UNDEFINED, SINGLEVALUE, LIST
	}

	public MarkIntermediateResult(ResultType t) {
		this.resultType = t;
	}

	public boolean isSingleResult() {
		return resultType == ResultType.SINGLEVALUE;
	}

	public boolean isListResult() {
		return resultType == ResultType.LIST;
	}

}
