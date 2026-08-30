package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public enum t {
    UNKNOWN,
    NONE,
    READY,
    FIRED;

    public int toFlashState() {
        int ordinal = ordinal();
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 3;
        }
        if (ordinal == 3) {
            return 1;
        }
        return 0;
    }
}
