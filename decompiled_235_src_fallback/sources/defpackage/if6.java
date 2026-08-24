package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: if6  reason: default package */
/* loaded from: classes.dex */
public final class if6 implements defpackage.bj5 {
    public final defpackage.vs4 A;
    public final defpackage.rs4 B;
    public final defpackage.vs4 L;
    public final defpackage.vs4 R;
    public final defpackage.vs4 X;
    public final defpackage.vs4 Y;
    public final defpackage.vs4 Z;
    public final defpackage.vs4 d0;
    public final defpackage.vs4 e0;
    public defpackage.hj f0;
    public defpackage.if6 g0;
    public defpackage.cf6 h0;
    public final defpackage.vs4 i0;

    public if6(defpackage.gf6 r3, defpackage.x60 r4, defpackage.tg6 r5, defpackage.rg6 r6) {
            r2 = this;
            r2.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            vs4 r0 = defpackage.np2.Y(r0)
            r2.A = r0
            rs4 r0 = new rs4
            r1 = 0
            r0.<init>(r1)
            r2.B = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            vs4 r1 = defpackage.np2.Y(r0)
            r2.L = r1
            vs4 r3 = defpackage.np2.Y(r3)
            r2.R = r3
            vs4 r3 = defpackage.np2.Y(r4)
            r2.X = r3
            pg6 r3 = defpackage.pg6.b
            vs4 r3 = defpackage.np2.Y(r3)
            r2.Y = r3
            vs4 r3 = defpackage.np2.Y(r0)
            r2.Z = r3
            vs4 r3 = defpackage.np2.Y(r5)
            r2.d0 = r3
            vs4 r3 = defpackage.np2.Y(r6)
            r2.e0 = r3
            r3 = 0
            vs4 r3 = defpackage.np2.Y(r3)
            r2.i0 = r3
            return
    }

    @Override // defpackage.bj5
    public final void a() {
            r0 = this;
            return
    }

    @Override // defpackage.bj5
    public final void b() {
            r5 = this;
            gf6 r0 = r5.e()
            sg6 r0 = r0.b
            r0.getClass()
            gf6 r1 = r5.e()
            java.util.List r2 = r1.b()
            java.util.ArrayList r2 = defpackage.gt0.T0(r2, r5)
            vs4 r3 = r1.d
            r3.setValue(r2)
            java.util.List r2 = r1.c()
            java.util.ArrayList r2 = defpackage.gt0.T0(r2, r5)
            vs4 r3 = r1.e
            r3.setValue(r2)
            r1.e()
            r0.f()
            mm6 r0 = r0.Z
            r0.remove(r5)
            java.util.List r0 = r1.b()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L4b
            sg6 r0 = r1.b
            w61 r0 = r0.B
            xy5 r2 = new xy5
            r3 = 2
            r4 = 0
            r2.<init>(r1, r5, r4, r3)
            r1 = 3
            defpackage.hv.L(r0, r4, r4, r2, r1)
        L4b:
            gf6 r5 = r5.e()
            mg5 r5 = r5.c
            r5.f()
            return
    }

    @Override // defpackage.bj5
    public final void c() {
            r6 = this;
            gf6 r0 = r6.e()
            sg6 r0 = r0.b
            r0.getClass()
            gf6 r1 = r6.e()
            java.util.List r2 = r1.b()
            java.util.ArrayList r2 = defpackage.gt0.U0(r6, r2)
            vs4 r3 = r1.d
            r3.setValue(r2)
            r1.e()
            r0.f()
            mm6 r0 = r0.Z
            java.util.ListIterator r1 = r0.listIterator()
            r2 = 0
        L27:
            r3 = r1
            xx2 r3 = (defpackage.xx2) r3
            boolean r4 = r3.hasNext()
            r5 = -1
            if (r4 == 0) goto L50
            java.lang.Object r3 = r3.next()
            if6 r3 = (defpackage.if6) r3
            r4 = 0
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r3 = r4
        L3c:
            if (r3 == 0) goto L42
            gf6 r4 = r3.e()
        L42:
            gf6 r3 = r6.e()
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 == 0) goto L4d
            goto L51
        L4d:
            int r2 = r2 + 1
            goto L27
        L50:
            r2 = r5
        L51:
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r2 == r1) goto L62
            if (r2 != r5) goto L5c
            goto L62
        L5c:
            int r2 = r2 + 1
            r0.add(r2, r6)
            goto L65
        L62:
            r0.add(r6)
        L65:
            gf6 r6 = r6.e()
            mg5 r6 = r6.c
            r6.f()
            return
    }

    public final defpackage.x60 d() {
            r0 = this;
            vs4 r0 = r0.X
            java.lang.Object r0 = r0.getValue()
            x60 r0 = (defpackage.x60) r0
            return r0
    }

    public final defpackage.gf6 e() {
            r0 = this;
            vs4 r0 = r0.R
            java.lang.Object r0 = r0.getValue()
            gf6 r0 = (defpackage.gf6) r0
            return r0
    }

    public final boolean f() {
            r1 = this;
            x60 r0 = r1.d()
            boolean r0 = r0.b()
            if (r0 != 0) goto L3b
            gf6 r0 = r1.e()
            mg5 r0 = r0.c
            zg6 r0 = r0.d()
            boolean r0 = r0.d()
            if (r0 == 0) goto L2a
            gf6 r0 = r1.e()
            mg5 r0 = r0.c
            zg6 r0 = r0.d()
            boolean r0 = r0.b()
            if (r0 == 0) goto L3b
        L2a:
            vs4 r1 = r1.Z
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L39
            goto L3b
        L39:
            r1 = 0
            return r1
        L3b:
            r1 = 1
            return r1
    }

    public final boolean g() {
            r1 = this;
            boolean r0 = r1.f()
            if (r0 == 0) goto L38
            gf6 r0 = r1.e()
            mg5 r0 = r0.c
            zg6 r0 = r0.d()
            boolean r0 = r0.d()
            if (r0 == 0) goto L38
            boolean r0 = r1.h()
            if (r0 == 0) goto L38
            vs4 r0 = r1.L
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L38
            gf6 r1 = r1.e()
            sg6 r1 = r1.b
            boolean r1 = r1.a()
            if (r1 == 0) goto L38
            r1 = 1
            return r1
        L38:
            r1 = 0
            return r1
    }

    public final boolean h() {
            r1 = this;
            vs4 r0 = r1.e0
            java.lang.Object r0 = r0.getValue()
            rg6 r0 = (defpackage.rg6) r0
            vs4 r1 = r1.A
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L23
            vs4 r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            og6 r1 = (defpackage.og6) r1
            r1.getClass()
            r1 = 1
            return r1
        L23:
            r1 = 0
            return r1
    }
}
