package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yn4  reason: default package */
/* loaded from: classes.dex */
public abstract class yn4 {
    public int A;
    public int B;
    public long L = 0;
    public long R = zn4.a;
    public long X = 0;

    public abstract int j0(ds2 ds2Var);

    public int k0() {
        return (int) (this.L & 4294967295L);
    }

    public Object l() {
        return null;
    }

    public int l0() {
        return (int) (this.L >> 32);
    }

    public final void m0() {
        this.A = io2.m((int) (this.L >> 32), lz0.j(this.R), lz0.h(this.R));
        int m = io2.m((int) (this.L & 4294967295L), lz0.i(this.R), lz0.g(this.R));
        this.B = m;
        int i = this.A;
        long j = this.L;
        this.X = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((m - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void o0(long j, float f, mi2 mi2Var);

    public final void p0(long j) {
        if (!i33.b(this.L, j)) {
            this.L = j;
            m0();
        }
    }

    public final void q0(long j) {
        if (!lz0.b(this.R, j)) {
            this.R = j;
            m0();
        }
    }
}
