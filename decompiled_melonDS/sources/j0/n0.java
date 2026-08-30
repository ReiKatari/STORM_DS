package j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 extends Exception {
    public final int A;

    public n0(int i2, IllegalArgumentException illegalArgumentException) {
        super("Expected camera missing from device.", illegalArgumentException);
        this.A = i2;
    }
}
