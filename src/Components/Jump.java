package Components;

/**
 * Jump means Snake or Ladder.
 * Snake : start > end
 * Ladder : start < end
 */
public class Jump {
    int start;
    int end;

    Jump(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
