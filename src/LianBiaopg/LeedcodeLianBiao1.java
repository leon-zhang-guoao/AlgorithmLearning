package LianBiaopg;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeedcodeLianBiao1 {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public class ListNodeComparaor implements Comparator<ListNode> {
        @Override
        public int compare(ListNode o1, ListNode o2) {

            return o1.val - o2.val;

        }
    }

    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            PriorityQueue<ListNode> head = new PriorityQueue<>(new ListNodeComparaor());
            for (int i = 0; i < lists.length; i++) {
                head.add(lists[i]);
            }
            ListNode start = head.poll();
            ListNode h = start;
            if (start.next != null) {
                head.add(start.next);
            }

            while (!head.isEmpty()){


            }

            return null;

        }

    }
}
