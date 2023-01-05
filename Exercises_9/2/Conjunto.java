import java.util.ArrayList;

public class Conjunto {
	private ArrayList<String> conjElements = new ArrayList();

public void addElement(String element) {
	if (!conjElements.contains(element)){
		conjElements.add(element);
	}
}

public String checkElement(String element) {
	if (conjElements.contains(element)){
		return "Contém elemento.";
	}
	return "Não contém elemento";
}

public ArrayList unionConj(ArrayList conj) {
	ArrayList<String> conjUnion = new ArrayList();
	conjUnion = conj;
	for (String s : this.conjElements) {
		if (!conjUnion.contains(s)) {
			conjUnion.add(s);
		}
	}
	return conjUnion;
}

public ArrayList interConj(ArrayList conj) {
	ArrayList<String> conjInter = new ArrayList();
	conjInter = conj;
	conjInter.retainAll(this.conjElements);
	return conjInter;
}

public ArrayList diffConj(ArrayList conj) {
	ArrayList<String> conjDiff = new ArrayList();
	conjDiff = conj;
	for (String s : this.conjElements) {
		if (conjDiff.contains(s)) {
			conjDiff.remove(s);
		}
	}
	return conjDiff;
}
}
