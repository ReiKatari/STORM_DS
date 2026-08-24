package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx4  reason: default package */
/* loaded from: classes.dex */
public abstract class dx4 {
    public int A;
    public int B;
    public long L = 0;
    public long R = ex4.a;
    public long X = 0;

    public Object B() {
        return null;
    }

    public abstract int X(ey2 ey2Var);

    public int Z() {
        return (int) (this.L & 4294967295L);
    }

    public int d0() {
        return (int) (this.L >> 32);
    }

    public final void f0() {
        this.A = gi2.q((int) (this.L >> 32), q21.j(this.R), q21.h(this.R));
        int q = gi2.q((int) (this.L & 4294967295L), q21.i(this.R), q21.g(this.R));
        this.B = q;
        int i = this.A;
        long j = this.L;
        this.X = (((i - ((int) (j >> 32))) / 2) << 32) | (4294967295L & ((q - ((int) (j & 4294967295L))) / 2));
    }

    public abstract void h0(long j, float f, qn2 qn2Var);

    public final void l0(long j) {
        if (!q93.b(this.L, j)) {
            this.L = j;
            f0();
        }
    }

    public final void m0(long j) {
        if (!q21.b(this.R, j)) {
            this.R = j;
            f0();
        }
    }
}
