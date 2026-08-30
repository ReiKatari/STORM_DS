package a1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long[] f103a = {-9187201950435737345L, -1};

    static {
        new m0(0);
    }

    public static final int a(int i2) {
        if (i2 == 7) {
            return 6;
        }
        return i2 - (i2 / 8);
    }

    public static final int b(int i2) {
        if (i2 == 0) {
            return 6;
        }
        return (i2 * 2) + 1;
    }

    public static final int c(int i2) {
        if (i2 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i2);
        }
        return 0;
    }

    public static final int d(int i2) {
        if (i2 == 7) {
            return 8;
        }
        return ((i2 - 1) / 7) + i2;
    }
}
