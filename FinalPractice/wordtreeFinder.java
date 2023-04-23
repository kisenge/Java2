private class Node {  
public String s;  
public Node left;
public Node right;

public Node(String s){ 
	this.s = s; 
	left = null; 
	right = null; 
}



public boolean findRec(String s){
	if(this.word.compareTo(s)==0){
		return true;
	}

	else if(this.word.compareTo(s) > 0){
	//look left
		if(this.left != null){
			return left.findRed(s)
		}
		else{
			return false
		}
	}

	else{
		//look right
		if(this.right != null){
			return right.findRec(s);
		}
		else{
		return false;
		}
	}
}




}


