package div2.srm609.level2;

/**
 * Created by hideo on 2/19/14.
 */
public class PackingBallsDiv2 {
    public int minPacks(int R, int G, int B) {
        int pack = 0;
        while (true) {
            if (R == 0 || G == 0 || B == 0) break;
            R--;
            G--;
            B--;
            pack++;
        }

        while (R >= 3) {
            R = R - 3;
            pack++;
        }

        while (G >= 3) {
            G = G - 3;
            pack++;
        }
        while (B >= 3) {
            B = B - 3;
            pack++;
        }

        if (R + G + B == 4) {
            pack = pack + 2;
        }

        if (R + G + B == 3) {
            pack = pack + 2;
        }

        if (R + G + B == 2) {
            pack = pack + 1;
        }

        if (R + G + B == 1) {
            pack = pack + 1;
        }


        return pack;
    }
}
