package div2.srm635.level3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hideo on 14/09/28.
 */
public class LonglongestPathTree {

    public long getLength(int[] A, int[] B, int[] L) {
        long length=-1;


        for (int edge = 0; edge < A.length; edge++) {
            for (int i = 0; i < A.length; i++){
                int[] xA = new int[edge];
                int[] xB = new int[edge];
                int[] xL = new int[edge];
                int[] yA = new int[edge];
                int[] yB = new int[edge];
                int[] yL = new int[edge];

                if (i == edge) {
                    continue;
                } else if (i < edge){
                    xA[i] = A[i];
                    xB[i] = B[i];
                    xL[i] = L[i];
                } else {
                    yA[i-1-edge] = A[i];
                    yB[i-1-edge] = B[i];
                    yL[i-1-edge] = L[i];
                }
                for (int k=0; k<xA.length; k++) {
                    System.out.print(xA[i]);
                    System.out.print(",");
                }
                for (int k=0; k<yA.length; k++) {
                    System.out.print(yA[i]);
                    System.out.print(",");
                }
                System.out.println("");

                length = Math.max(length, new TreeDiameter(xA, xB, xL).getDiameter() + new TreeDiameter(yA, yB, yL).getDiameter() + L[edge]);
            }
        }

        return length;
    }

    public class TreeDiameter {
        private long DIAMETER = -1;
        private boolean[] VISITED_NODE;
        private final int[] A, B, L;

        public TreeDiameter(int[] a, int[] b, int[] l) {
            A = a;
            B = b;
            L = l;
            VISITED_NODE = new boolean[a.length + 1];
        }

        public void calculateDiameter(int currentNode, long currentDepth) {
            VISITED_NODE[currentNode] = true;
            DIAMETER = Math.max(DIAMETER, currentDepth);
            if (endCondition()) return;

            for (int nextEdge : getNextEdges(currentNode)) {
                calculateDiameter(getNextNode(currentNode, nextEdge), currentDepth + L[nextEdge]);
            }
        }

        private int getNextNode(int currentNode, int nextEdge) {
            return (currentNode == A[nextEdge]) ? B[nextEdge] : A[nextEdge];
        }

        private List<Integer> getNextEdges(int currentNode) {

            List<Integer> nextEdges = new ArrayList<Integer>();
            for (int i = 0; i < A.length; i++) {
                System.out.println(A.length);
                if (A[i] == currentNode && !VISITED_NODE[B[i]]) nextEdges.add(i);
                if (B[i] == currentNode && !VISITED_NODE[A[i]]) nextEdges.add(i);
            }

            return nextEdges;
        }

        private boolean endCondition() {
            boolean endCondition = true;
            for (boolean aVISITED_NODE : VISITED_NODE) {
                endCondition = endCondition && aVISITED_NODE;
            }
            return endCondition;
        }

        public long getDiameter() {
            if (DIAMETER == -1) {
                for (int i = 0; i < A.length; i++) {
                    VISITED_NODE = new boolean[A.length + 1];
                    calculateDiameter(i, 0);
                }
            }
            return DIAMETER;
        }
    }
}
