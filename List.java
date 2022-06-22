class List<T> implements Iterable<T> {
   class ListNode {
      T val;
      ListNode next;

      ListNode (T v) {
         val = v; next = null;
      }
   }

   ListNode head;

   List (ListNode hd) { head = hd; }
   List () { this(null); }

   void prepend (T e) {
      ListNode p = new ListNode(e);
      p.next = head;
      head = p;
   }

   T first () {
      return head.val;
   }

   T get (int idx) {
      ListNode p = head;
      for (int i = 0; i < idx; i++)
         p = p.next;
      return p.val;
   }

   List<T> tail () {
      return new List<T>(this.head.next);
   }

   boolean empty () {
      return head == null;
   }

   int length () {
      int count = 0;
      ListNode p = head;
      while (p != null) {
         count += 1;
         p = p.next;
      }
      return count;
   }

   boolean contains (T e) {
      ListNode p = head;
      while (p != null && !p.val.equals(e))
         p = p.next;
      // p == null || p.val.equals(e)
      return p != null;
   }

   void print () {
      ListNode p = head;
      while (p != null) {
         Out.println(p.val);
         p = p.next;
      }
   }

   class ListIterator implements Iterator<T> {
      ListNode pos;

      ListIterator () {
         pos = head;
      }

      public T next () {
         T res = pos.val;
         pos = pos.next;
         return res;
      }

      public boolean hasNext () {
         return pos != null;
      }
   }

   Iterator<T> getIterator () {
      return this.new ListIterator();
   }

   public Iterator<T> iterator () {  // for use with special form of for-loop
      return this.new ListIterator();
   }
}
