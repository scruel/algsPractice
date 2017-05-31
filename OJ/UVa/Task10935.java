package algsPractice.OJ.UVa;

import algsPractice.lib.InputReader;
import algsPractice.lib.OutputWriter;

import java.util.LinkedList;

/**
 * Created by Scruel.
 * Personal blog : http://blog.csdn.net/scruelt
 * Github : https://github.com/scruel
 */
public class Task10935 {
    LinkedList<Integer> list = new LinkedList<Integer>();

    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int n;
        while ((n = in.nextInt()) != 0) {
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            out.write("Discarded cards:");
            while (list.size() != 1) {
                out.write(" ", list.poll());
                if (list.size() != 1) out.write(",");
                list.add(list.poll());
            }
            out.writeln();
            out.writef("Remaining card: %d\n", list.poll());
        }
    }
}
