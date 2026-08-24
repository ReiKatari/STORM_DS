package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq7  reason: default package */
/* loaded from: classes.dex */
public abstract class rq7 extends defpackage.gx2 {
    public int A0;
    public boolean B0;
    public int C0;
    public int D0;
    public final defpackage.e30 E0;
    public defpackage.p11 F0;
    public int v0;
    public int w0;
    public int x0;
    public int y0;
    public int z0;

    public rq7() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.v0 = r0
            r1.w0 = r0
            r1.x0 = r0
            r1.y0 = r0
            r1.z0 = r0
            r1.A0 = r0
            r1.B0 = r0
            r1.C0 = r0
            r1.D0 = r0
            e30 r0 = new e30
            r0.<init>()
            r1.E0 = r0
            r0 = 0
            r1.F0 = r0
            return
    }

    @Override // defpackage.gx2
    public final void U() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.u0
            if (r0 >= r1) goto L11
            l21[] r1 = r3.t0
            r1 = r1[r0]
            if (r1 == 0) goto Le
            r2 = 1
            r1.F = r2
        Le:
            int r0 = r0 + 1
            goto L1
        L11:
            return
    }

    public abstract void V(int r1, int r2, int r3, int r4);

    public final void W(defpackage.l21 r3, defpackage.k21 r4, int r5, defpackage.k21 r6, int r7) {
            r2 = this;
        L0:
            p11 r0 = r2.F0
            if (r0 != 0) goto Lf
            l21 r1 = r2.U
            if (r1 == 0) goto Lf
            m21 r1 = (defpackage.m21) r1
            p11 r0 = r1.x0
            r2.F0 = r0
            goto L0
        Lf:
            e30 r2 = r2.E0
            r2.a = r4
            r2.b = r6
            r2.c = r5
            r2.d = r7
            r0.b(r3, r2)
            int r4 = r2.e
            r3.P(r4)
            int r4 = r2.f
            r3.M(r4)
            boolean r4 = r2.h
            r3.E = r4
            int r2 = r2.g
            r3.J(r2)
            return
    }
}
