package b1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f1739a = new int[0];

    /* renamed from: b  reason: collision with root package name */
    public static final long[] f1740b = new long[0];

    /* renamed from: c  reason: collision with root package name */
    public static final Object[] f1741c = new Object[0];

    public static final int a(int i2, int i10, int[] iArr) {
        iArr.getClass();
        int i11 = i2 - 1;
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) >>> 1;
            int i14 = iArr[i13];
            if (i14 < i10) {
                i12 = i13 + 1;
            } else if (i14 > i10) {
                i11 = i13 - 1;
            } else {
                return i13;
            }
        }
        return ~i12;
    }

    public static final int b(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i10 = i2 - 1;
        int i11 = 0;
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            int i13 = (jArr[i12] > j2 ? 1 : (jArr[i12] == j2 ? 0 : -1));
            if (i13 < 0) {
                i11 = i12 + 1;
            } else if (i13 > 0) {
                i10 = i12 - 1;
            } else {
                return i12;
            }
        }
        return ~i11;
    }
}
