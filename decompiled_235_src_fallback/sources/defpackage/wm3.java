package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wm3  reason: default package */
/* loaded from: classes.dex */
public final class wm3 {
    public final defpackage.sm3 a;
    public boolean b;
    public boolean c;
    public defpackage.om3 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;
    public final defpackage.d34 p;
    public defpackage.rz3 q;

    public wm3(defpackage.sm3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            om3 r1 = defpackage.om3.Idle
            r0.d = r1
            d34 r1 = new d34
            r1.<init>(r0)
            r0.p = r1
            return
    }

    public final defpackage.eg4 a() {
            r0 = this;
            sm3 r0 = r0.a
            if0 r0 = r0.B0
            java.lang.Object r0 = r0.e
            eg4 r0 = (defpackage.eg4) r0
            return r0
    }

    public final void b() {
            r3 = this;
            sm3 r0 = r3.a
            wm3 r0 = r0.C0
            om3 r0 = r0.d
            om3 r1 = defpackage.om3.LayingOut
            r2 = 1
            if (r0 == r1) goto Lf
            om3 r1 = defpackage.om3.LookaheadLayingOut
            if (r0 != r1) goto L1c
        Lf:
            d34 r1 = r3.p
            boolean r1 = r1.w0
            if (r1 == 0) goto L19
            r3.g(r2)
            goto L1c
        L19:
            r3.f(r2)
        L1c:
            om3 r1 = defpackage.om3.LookaheadLayingOut
            if (r0 != r1) goto L2f
            rz3 r0 = r3.q
            if (r0 == 0) goto L2c
            boolean r0 = r0.q0
            if (r0 != r2) goto L2c
            r3.i(r2)
            return
        L2c:
            r3.h(r2)
        L2f:
            return
    }

    public final void c(long r4) {
            r3 = this;
            rz3 r3 = r3.q
            if (r3 == 0) goto L3c
            om3 r0 = defpackage.om3.LookaheadMeasuring
            wm3 r1 = r3.Y
            r1.d = r0
            sm3 r0 = r1.a
            r2 = 0
            r1.e = r2
            r3.u0 = r4
            zp4 r4 = defpackage.vm3.a(r0)
            te r4 = (defpackage.te) r4
            bq4 r4 = r4.getSnapshotObserver()
            qz3 r3 = r3.v0
            hh2 r5 = r4.b
            qm6 r4 = r4.a
            r4.d(r0, r5, r3)
            r3 = 1
            r1.f = r3
            r1.g = r3
            boolean r4 = defpackage.bl2.J(r0)
            d34 r5 = r1.p
            if (r4 == 0) goto L36
            r5.r0 = r3
            r5.s0 = r3
            goto L38
        L36:
            r5.q0 = r3
        L38:
            om3 r3 = defpackage.om3.Idle
            r1.d = r3
        L3c:
            return
    }

    public final void d(int r4) {
            r3 = this;
            int r0 = r3.l
            r3.l = r4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r4 != 0) goto Le
            r1 = r2
        Le:
            if (r0 == r1) goto L2c
            sm3 r3 = r3.a
            sm3 r3 = r3.v()
            if (r3 == 0) goto L1b
            wm3 r3 = r3.C0
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L2c
            int r0 = r3.l
            if (r4 != 0) goto L28
            int r0 = r0 + (-1)
            r3.d(r0)
            return
        L28:
            int r0 = r0 + r2
            r3.d(r0)
        L2c:
            return
    }

    public final void e(int r4) {
            r3 = this;
            int r0 = r3.o
            r3.o = r4
            r1 = 0
            r2 = 1
            if (r0 != 0) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r4 != 0) goto Le
            r1 = r2
        Le:
            if (r0 == r1) goto L2c
            sm3 r3 = r3.a
            sm3 r3 = r3.v()
            if (r3 == 0) goto L1b
            wm3 r3 = r3.C0
            goto L1c
        L1b:
            r3 = 0
        L1c:
            if (r3 == 0) goto L2c
            int r0 = r3.o
            if (r4 != 0) goto L28
            int r0 = r0 + (-1)
            r3.e(r0)
            return
        L28:
            int r0 = r0 + r2
            r3.e(r0)
        L2c:
            return
    }

    public final void f(boolean r2) {
            r1 = this;
            boolean r0 = r1.k
            if (r0 == r2) goto L21
            r1.k = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.j
            if (r0 != 0) goto L14
            int r2 = r1.l
            int r2 = r2 + 1
            r1.d(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.j
            if (r2 != 0) goto L21
            int r2 = r1.l
            int r2 = r2 + (-1)
            r1.d(r2)
        L21:
            return
    }

    public final void g(boolean r2) {
            r1 = this;
            boolean r0 = r1.j
            if (r0 == r2) goto L21
            r1.j = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.k
            if (r0 != 0) goto L14
            int r2 = r1.l
            int r2 = r2 + 1
            r1.d(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.k
            if (r2 != 0) goto L21
            int r2 = r1.l
            int r2 = r2 + (-1)
            r1.d(r2)
        L21:
            return
    }

    public final void h(boolean r2) {
            r1 = this;
            boolean r0 = r1.n
            if (r0 == r2) goto L21
            r1.n = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.m
            if (r0 != 0) goto L14
            int r2 = r1.o
            int r2 = r2 + 1
            r1.e(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.m
            if (r2 != 0) goto L21
            int r2 = r1.o
            int r2 = r2 + (-1)
            r1.e(r2)
        L21:
            return
    }

    public final void i(boolean r2) {
            r1 = this;
            boolean r0 = r1.m
            if (r0 == r2) goto L21
            r1.m = r2
            if (r2 == 0) goto L14
            boolean r0 = r1.n
            if (r0 != 0) goto L14
            int r2 = r1.o
            int r2 = r2 + 1
            r1.e(r2)
            return
        L14:
            if (r2 != 0) goto L21
            boolean r2 = r1.n
            if (r2 != 0) goto L21
            int r2 = r1.o
            int r2 = r2 + (-1)
            r1.e(r2)
        L21:
            return
    }

    public final void j() {
            r6 = this;
            d34 r0 = r6.p
            wm3 r1 = r0.Y
            java.lang.Object r2 = r0.n0
            r3 = 7
            sm3 r4 = r6.a
            r5 = 0
            if (r2 != 0) goto L17
            eg4 r2 = r1.a()
            java.lang.Object r2 = r2.B()
            if (r2 != 0) goto L17
            goto L31
        L17:
            boolean r2 = r0.m0
            if (r2 != 0) goto L1c
            goto L31
        L1c:
            r0.m0 = r5
            eg4 r1 = r1.a()
            java.lang.Object r1 = r1.B()
            r0.n0 = r1
            sm3 r0 = r4.v()
            if (r0 == 0) goto L31
            defpackage.sm3.V(r0, r5, r3)
        L31:
            rz3 r6 = r6.q
            if (r6 == 0) goto L82
            wm3 r0 = r6.Y
            java.lang.Object r1 = r6.t0
            if (r1 != 0) goto L4f
            eg4 r1 = r0.a()
            mz3 r1 = r1.W0()
            r1.getClass()
            eg4 r1 = r1.k0
            java.lang.Object r1 = r1.B()
            if (r1 != 0) goto L4f
            goto L82
        L4f:
            boolean r1 = r6.s0
            if (r1 != 0) goto L54
            goto L82
        L54:
            r6.s0 = r5
            eg4 r0 = r0.a()
            mz3 r0 = r0.W0()
            r0.getClass()
            eg4 r0 = r0.k0
            java.lang.Object r0 = r0.B()
            r6.t0 = r0
            boolean r6 = defpackage.bl2.J(r4)
            if (r6 == 0) goto L79
            sm3 r6 = r4.v()
            if (r6 == 0) goto L82
            defpackage.sm3.V(r6, r5, r3)
            return
        L79:
            sm3 r6 = r4.v()
            if (r6 == 0) goto L82
            defpackage.sm3.T(r6, r5, r3)
        L82:
            return
    }
}
