package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dx4  reason: default package */
/* loaded from: classes.dex */
public abstract class dx4 {
    public int A;
    public int B;
    public long L;
    public long R;
    public long X;

    public dx4() {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.L = r0
            long r2 = defpackage.ex4.a
            r4.R = r2
            r4.X = r0
            return
    }

    public java.lang.Object B() {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract int X(defpackage.ey2 r1);

    public int Z() {
            r4 = this;
            long r0 = r4.L
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = (int) r0
            return r4
    }

    public int d0() {
            r2 = this;
            long r0 = r2.L
            r2 = 32
            long r0 = r0 >> r2
            int r2 = (int) r0
            return r2
    }

    public final void f0() {
            r9 = this;
            long r0 = r9.L
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            long r3 = r9.R
            int r1 = defpackage.q21.j(r3)
            long r3 = r9.R
            int r3 = defpackage.q21.h(r3)
            int r0 = defpackage.gi2.q(r0, r1, r3)
            r9.A = r0
            long r0 = r9.L
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            long r5 = r9.R
            int r1 = defpackage.q21.i(r5)
            long r5 = r9.R
            int r5 = defpackage.q21.g(r5)
            int r0 = defpackage.gi2.q(r0, r1, r5)
            r9.B = r0
            int r1 = r9.A
            long r5 = r9.L
            long r7 = r5 >> r2
            int r7 = (int) r7
            int r1 = r1 - r7
            int r1 = r1 / 2
            long r5 = r5 & r3
            int r5 = (int) r5
            int r0 = r0 - r5
            int r0 = r0 / 2
            long r5 = (long) r1
            long r1 = r5 << r2
            long r5 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            r9.X = r0
            return
    }

    public abstract void h0(long r1, float r3, defpackage.qn2 r4);

    public final void l0(long r3) {
            r2 = this;
            long r0 = r2.L
            boolean r0 = defpackage.q93.b(r0, r3)
            if (r0 != 0) goto Ld
            r2.L = r3
            r2.f0()
        Ld:
            return
    }

    public final void m0(long r3) {
            r2 = this;
            long r0 = r2.R
            boolean r0 = defpackage.q21.b(r0, r3)
            if (r0 != 0) goto Ld
            r2.R = r3
            r2.f0()
        Ld:
            return
    }
}
