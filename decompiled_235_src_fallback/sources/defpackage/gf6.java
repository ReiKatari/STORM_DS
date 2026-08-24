package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gf6  reason: default package */
/* loaded from: classes.dex */
public final class gf6 {
    public final java.lang.String a;
    public final defpackage.sg6 b;
    public final defpackage.mg5 c;
    public final defpackage.vs4 d;
    public final defpackage.vs4 e;
    public final defpackage.gn f;
    public boolean g;
    public final defpackage.ff6 h;
    public final defpackage.ff6 i;

    public gf6(java.lang.String r4, defpackage.sg6 r5) {
            r3 = this;
            r3.<init>()
            r3.a = r4
            r3.b = r5
            mg5 r4 = new mg5
            r4.<init>(r3)
            r3.c = r4
            yt1 r4 = defpackage.yt1.A
            vs4 r5 = defpackage.np2.Y(r4)
            r3.d = r5
            vs4 r4 = defpackage.np2.Y(r4)
            r3.e = r4
            gn r4 = new gn
            jk4 r5 = new jk4
            r0 = 0
            r5.<init>(r0)
            wc7 r0 = defpackage.nw7.j0
            r1 = 0
            r2 = 12
            r4.<init>(r5, r0, r1, r2)
            r3.f = r4
            ff6 r4 = new ff6
            r5 = 0
            r4.<init>(r3, r5)
            r3.h = r4
            ff6 r4 = new ff6
            r5 = 1
            r4.<init>(r3, r5)
            r3.i = r4
            return
    }

    public final boolean a() {
            r1 = this;
            mg5 r1 = r1.c
            zg6 r0 = r1.d()
            boolean r0 = r0.b()
            if (r0 != 0) goto L21
            zg6 r0 = r1.d()
            boolean r0 = r0.d()
            if (r0 != 0) goto L21
            java.lang.Object r1 = r1.f
            qp6 r1 = (defpackage.qp6) r1
            qp6 r0 = defpackage.qp6.MatchFound
            if (r1 != r0) goto L1f
            goto L21
        L1f:
            r1 = 0
            return r1
        L21:
            r1 = 1
            return r1
    }

    public final java.util.List b() {
            r0 = this;
            vs4 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final java.util.List c() {
            r0 = this;
            vs4 r0 = r0.e
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public final boolean d() {
            r5 = this;
            java.util.List r5 = r5.c()
            int r0 = r5.size()
            r1 = 0
            r2 = r1
        La:
            if (r2 >= r0) goto L35
            java.lang.Object r3 = r5.get(r2)
            if6 r3 = (defpackage.if6) r3
            x60 r3 = r3.d()
            ga7 r3 = r3.b
        L18:
            ga7 r4 = r3.b
            if (r4 == 0) goto L1e
            r3 = r4
            goto L18
        L1e:
            gx0 r4 = r3.a
            java.lang.Object r4 = r4.f()
            vs4 r3 = r3.d
            java.lang.Object r3 = r3.getValue()
            boolean r3 = defpackage.nb3.k(r4, r3)
            if (r3 != 0) goto L32
            r5 = 1
            return r5
        L32:
            int r2 = r2 + 1
            goto La
        L35:
            return r1
    }

    public final void e() {
            r8 = this;
            sg6 r0 = r8.b
            r0.getClass()
            java.util.List r0 = r8.b()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L14:
            r5 = 1
            if (r3 >= r2) goto L34
            java.lang.Object r6 = r0.get(r3)
            if6 r6 = (defpackage.if6) r6
            boolean r7 = r6.h()
            if (r7 == 0) goto L31
            r1.add(r6)
            x60 r6 = r6.d()
            boolean r6 = r6.b()
            if (r6 == 0) goto L31
            r4 = r5
        L31:
            int r3 = r3 + 1
            goto L14
        L34:
            vs4 r0 = r8.e
            r0.setValue(r1)
            mg5 r8 = r8.c
            java.lang.Object r0 = r8.c
            gf6 r0 = (defpackage.gf6) r0
            java.lang.Object r1 = r8.e
            ss4 r1 = (defpackage.ss4) r1
            java.util.List r2 = r0.c()
            int r2 = r2.size()
            if (r2 <= r5) goto L5a
            if (r4 == 0) goto L5a
            qp6 r0 = defpackage.qp6.MatchFound
            r8.f = r0
            int r0 = r8.a
            int r0 = r0 + r5
            r1.i(r0)
            goto L82
        L5a:
            sg6 r0 = r0.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L6f
            if (r4 != 0) goto L82
            qp6 r0 = defpackage.qp6.VisibleContentAbsentDuringTransition
            r8.f = r0
            int r0 = r8.a
            int r0 = r0 + r5
            r1.i(r0)
            goto L82
        L6f:
            qp6 r0 = defpackage.qp6.NoRequest
            r8.f = r0
            int r0 = r1.h()
            r8.a = r0
            java.lang.Object r0 = r8.d
            vs4 r0 = (defpackage.vs4) r0
            rf4 r1 = defpackage.rf4.a
            r0.setValue(r1)
        L82:
            r8.f()
            return
    }
}
