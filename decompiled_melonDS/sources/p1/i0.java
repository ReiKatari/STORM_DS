package p1;

import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 implements s2 {
    public final int A;
    public final int B;
    public final n2.f1 L;
    public int R;

    public i0(int i2, int i10, int i11) {
        this.A = i10;
        this.B = i11;
        int i12 = (i2 / i10) * i10;
        this.L = new n2.f1(p7.j.L(Math.max(i12 - i11, 0), i12 + i10 + i11), n2.e.Z);
        this.R = i2;
    }

    public final void a(int i2) {
        if (i2 != this.R) {
            this.R = i2;
            int i10 = this.A;
            int i11 = (i2 / i10) * i10;
            int i12 = this.B;
            this.L.setValue(p7.j.L(Math.max(i11 - i12, 0), i11 + i10 + i12));
        }
    }

    @Override // n2.s2
    public final Object getValue() {
        return (sc.d) this.L.getValue();
    }
}
