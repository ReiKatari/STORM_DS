package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pv6  reason: default package */
/* loaded from: classes.dex */
public final class pv6 extends defpackage.ig1 {
    public final defpackage.gx3 n;
    public final defpackage.qb0 o;
    public defpackage.ig1 p;
    public defpackage.wv6 q;

    public pv6(int r3, android.util.Size r4) {
            r2 = this;
            r2.<init>(r3, r4)
            qb0 r3 = new qb0
            r3.<init>()
            hl5 r4 = new hl5
            r4.<init>()
            r3.c = r4
            tb0 r4 = new tb0
            r4.<init>(r3)
            r3.b = r4
            java.lang.Class<i61> r0 = defpackage.i61.class
            r3.a = r0
            r2.o = r3     // Catch: java.lang.Exception -> L31
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L31
            java.lang.String r1 = "SettableFuture hashCode: "
            r0.<init>(r1)     // Catch: java.lang.Exception -> L31
            int r1 = r2.hashCode()     // Catch: java.lang.Exception -> L31
            r0.append(r1)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L31
            r3.a = r0     // Catch: java.lang.Exception -> L31
            goto L35
        L31:
            r3 = move-exception
            r4.b(r3)
        L35:
            r2.n = r4
            return
    }

    @Override // defpackage.ig1
    public final void a() {
            r2 = this;
            super.a()
            lv6 r0 = new lv6
            r1 = 2
            r0.<init>(r2, r1)
            defpackage.nj2.D(r0)
            return
    }

    @Override // defpackage.ig1
    public final defpackage.gx3 f() {
            r0 = this;
            gx3 r0 = r0.n
            return r0
    }

    public final boolean g(defpackage.ig1 r11, java.lang.Runnable r12) {
            r10 = this;
            java.lang.String r0 = ")"
            java.lang.String r1 = ") must match the parent("
            android.util.Size r2 = r10.h
            defpackage.nj2.h()
            r11.getClass()
            int r3 = r11.i
            android.util.Size r4 = r11.h
            ig1 r5 = r10.p
            r6 = 0
            if (r5 != r11) goto L16
            return r6
        L16:
            r7 = 1
            if (r5 != 0) goto L1b
            r5 = r7
            goto L1c
        L1b:
            r5 = r6
        L1c:
            java.lang.String r8 = "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider"
            defpackage.np2.A(r8, r5)
            boolean r5 = r2.equals(r4)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "The provider's size("
            r8.<init>(r9)
            r8.append(r2)
            r8.append(r1)
            r8.append(r4)
            r8.append(r0)
            java.lang.String r2 = r8.toString()
            defpackage.np2.s(r2, r5)
            int r2 = r10.i
            if (r2 != r3) goto L44
            r6 = r7
        L44:
            java.lang.String r4 = "The provider's format("
            java.lang.String r0 = defpackage.xg6.m(r2, r3, r4, r1, r0)
            defpackage.np2.s(r0, r6)
            java.lang.Object r0 = r10.a
            monitor-enter(r0)
            boolean r1 = r10.c     // Catch: java.lang.Throwable -> L8c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            r0 = r1 ^ 1
            java.lang.String r1 = "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider."
            defpackage.np2.A(r1, r0)
            r10.p = r11
            gx3 r0 = r11.c()
            qb0 r1 = r10.o
            uj1 r2 = defpackage.u24.j()
            defpackage.l.J(r7, r0, r1, r2)
            r11.d()
            tb0 r10 = r10.e
            gx3 r10 = defpackage.l.F(r10)
            mv6 r0 = new mv6
            r0.<init>(r11, r7)
            uj1 r1 = defpackage.u24.j()
            r10.a(r1, r0)
            tb0 r10 = r11.g
            gx3 r10 = defpackage.l.F(r10)
            ov2 r11 = defpackage.u24.x()
            r10.a(r11, r12)
            return r7
        L8c:
            r10 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8c
            throw r10
    }
}
