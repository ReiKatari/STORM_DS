package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class i1 {
    public int A;
    public int B;
    public long L;
    public long R = k1.f14702a;
    public long X = 0;

    public i1() {
        long j2 = 0;
        this.L = (j2 & 4294967295L) | (j2 << 32);
    }

    public abstract int i0(q qVar);

    public int j0() {
        return (int) (this.L & 4294967295L);
    }

    public Object n() {
        return null;
    }

    public int n0() {
        return (int) (this.L >> 32);
    }

    public final void p0() {
        this.A = p7.j.g((int) (this.L >> 32), x4.a.j(this.R), x4.a.h(this.R));
        int g10 = p7.j.g((int) (this.L & 4294967295L), x4.a.i(this.R), x4.a.g(this.R));
        this.B = g10;
        int i2 = this.A;
        long j2 = this.L;
        this.X = (((i2 - ((int) (j2 >> 32))) / 2) << 32) | (4294967295L & ((g10 - ((int) (j2 & 4294967295L))) / 2));
    }

    public abstract void q0(long j2, float f8, mc.l lVar);

    public final void r0(long j2) {
        if (!x4.l.b(this.L, j2)) {
            this.L = j2;
            p0();
        }
    }

    public final void s0(long j2) {
        if (!x4.a.b(this.R, j2)) {
            this.R = j2;
            p0();
        }
    }
}
