package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f302a;

    public static final int a(int i2, long j2) {
        int i10 = o2.f304b;
        return ((int) (j2 >> (i2 * 15))) & 32767;
    }

    public static long c(int i2, int i10, int i11, int i12) {
        return ((i10 & 32767) << 15) | (i2 & 32767) | ((i11 & 32767) << 30) | ((i12 & 32767) << 45) | Long.MIN_VALUE;
    }

    public int b() {
        switch (this.f302a) {
            case 0:
                return 16;
            default:
                return 8;
        }
    }
}
