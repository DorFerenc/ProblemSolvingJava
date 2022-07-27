package level1;

public class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {}
	public ListNode(int val) { 
		this.val = val; 
	}
	public ListNode(int val, ListNode next) { 
		this.val = val; this.next = next; 
	}

	public ListNode getHeadFromArray(int[] vals) {
		ListNode myHead;
		
		if (vals.length  == 1 && vals[0] == 0) {
			ListNode p1 = new ListNode(0, null);
			return new ListNode(vals[0], p1);
		}
		
		if (vals.length > 0) {
			ListNode p1 = new ListNode();
			ListNode p2;
			myHead = p1;
			for (int i = 0; i < vals.length; i++) {
				p2 = new ListNode(vals[i]);
				p1.next = p2;
				p1 = p1.next;
			}
			myHead = myHead.next;
		}
		else
			myHead = new ListNode(0, null);
		
		return myHead;
	}
	
	public ListNode makeACycle(ListNode myHead, int startPos, int lastPos) {
		ListNode p1 = myHead;
		ListNode p2 = myHead;
		
		for(int i = 0; i < startPos; i++)
			p2 = p2.next;
		
		for(int i = 0; i < lastPos; i++)
			p1 = p1.next;
		
		p1.next = p2;
		
		return myHead;
	}
	
	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (!( obj instanceof ListNode))
			return false;

		ListNode temp = (ListNode)obj;
		ListNode me = this;

		while (temp.next != null && me.next != null) {
			if (this.val != temp.val)
				return false;
			temp = temp.next;
			me = this.next;
		}

		if (temp.next == null && me.next == null)
			return true;

		return false;
	}

	@Override
	public String toString() {
		ListNode meTemp = this;
		String msg = "";
		while (meTemp != null) {
			msg += "" + meTemp.val;
			meTemp = meTemp.next;
		}	
		return msg;
	}


}
