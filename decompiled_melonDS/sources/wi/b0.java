package wi;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public int f14224a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f14225b = new int[10];

    public final int a() {
        if ((this.f14224a & 16) != 0) {
            return this.f14225b[4];
        }
        return 65535;
    }

    public final void b(int i2, int i10) {
        if (i2 >= 0) {
            int[] iArr = this.f14225b;
            if (i2 < iArr.length) {
                this.f14224a = (1 << i2) | this.f14224a;
                iArr[i2] = i10;
            }
        }
    }
}
