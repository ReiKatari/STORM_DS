package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hq3  reason: default package */
/* loaded from: classes.dex */
public final class hq3 implements pp6 {
    public final int A;
    public final int B;
    public final vs4 L;
    public int R;

    public hq3(int i, int i2, int i3) {
        this.A = i2;
        this.B = i3;
        int i4 = (i / i2) * i2;
        this.L = new vs4(gi2.R(Math.max(i4 - i3, 0), i4 + i2 + i3), xd5.s0);
        this.R = i;
    }

    public final void a(int i) {
        if (i != this.R) {
            this.R = i;
            int i2 = this.A;
            int i3 = (i / i2) * i2;
            int i4 = this.B;
            this.L.setValue(gi2.R(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return (l93) this.L.getValue();
    }
}
