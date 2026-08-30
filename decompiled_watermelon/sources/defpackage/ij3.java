package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ij3  reason: default package */
/* loaded from: classes.dex */
public final class ij3 implements ae6 {
    public final int A;
    public final int B;
    public final tj4 L;
    public int R;

    public ij3(int i, int i2, int i3) {
        this.A = i2;
        this.B = i3;
        int i4 = (i / i2) * i2;
        this.L = new tj4(io2.t0(Math.max(i4 - i3, 0), i4 + i2 + i3), k45.n0);
        this.R = i;
    }

    public final void b(int i) {
        if (i != this.R) {
            this.R = i;
            int i2 = this.A;
            int i3 = (i / i2) * i2;
            int i4 = this.B;
            this.L.setValue(io2.t0(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return (d33) this.L.getValue();
    }
}
