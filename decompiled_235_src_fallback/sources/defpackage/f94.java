package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f94  reason: default package */
/* loaded from: classes.dex */
public final class f94 extends defpackage.gx0 {
    public final defpackage.ja4 b;
    public final java.util.ArrayList c;
    public final defpackage.ka4 d;
    public final defpackage.ja4 e;
    public final defpackage.h61 f;

    public f94() {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            ja4 r0 = defpackage.mp2.q()
            r3.b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.c = r0
            ka4 r0 = defpackage.c66.a
            ka4 r0 = new ka4
            r0.<init>()
            r3.d = r0
            ja4 r0 = new ja4
            r0.<init>()
            r3.e = r0
            z5 r0 = new z5
            r1 = 19
            r0.<init>(r3, r1)
            r76 r1 = defpackage.bm6.a
            defpackage.bm6.e(r1)
            java.lang.Object r1 = defpackage.bm6.c
            monitor-enter(r1)
            java.util.List r2 = defpackage.bm6.h     // Catch: java.lang.Throwable -> L43
            java.util.ArrayList r2 = defpackage.gt0.U0(r0, r2)     // Catch: java.lang.Throwable -> L43
            defpackage.bm6.h = r2     // Catch: java.lang.Throwable -> L43
            monitor-exit(r1)
            h61 r1 = new h61
            r2 = 20
            r1.<init>(r0, r2)
            r3.f = r1
            return
        L43:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }

    @Override // defpackage.gx0
    public final void c(defpackage.ob6 r2) {
            r1 = this;
            d94 r0 = new d94
            r0.<init>(r2)
            java.util.ArrayList r1 = r1.c
            r1.add(r0)
            return
    }

    @Override // defpackage.gx0
    public final void d() {
            r7 = this;
            java.lang.Object r0 = r7.a
            monitor-enter(r0)
            java.util.ArrayList r1 = r7.c     // Catch: java.lang.Throwable -> L25
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L25
            r3 = 0
        La:
            if (r3 >= r2) goto L3d
            java.lang.Object r4 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            e94 r4 = (defpackage.e94) r4     // Catch: java.lang.Throwable -> L25
            boolean r5 = r4 instanceof defpackage.c94     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L27
            ja4 r5 = r7.b     // Catch: java.lang.Throwable -> L25
            r6 = r4
            c94 r6 = (defpackage.c94) r6     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = r6.a     // Catch: java.lang.Throwable -> L25
            c94 r4 = (defpackage.c94) r4     // Catch: java.lang.Throwable -> L25
            ob6 r4 = r4.b     // Catch: java.lang.Throwable -> L25
            defpackage.mp2.g(r5, r6, r4)     // Catch: java.lang.Throwable -> L25
            goto L34
        L25:
            r7 = move-exception
            goto L44
        L27:
            boolean r5 = r4 instanceof defpackage.d94     // Catch: java.lang.Throwable -> L25
            if (r5 == 0) goto L37
            ja4 r5 = r7.b     // Catch: java.lang.Throwable -> L25
            d94 r4 = (defpackage.d94) r4     // Catch: java.lang.Throwable -> L25
            ob6 r4 = r4.a     // Catch: java.lang.Throwable -> L25
            defpackage.mp2.W(r5, r4)     // Catch: java.lang.Throwable -> L25
        L34:
            int r3 = r3 + 1
            goto La
        L37:
            ug r7 = new ug     // Catch: java.lang.Throwable -> L25
            r7.<init>()     // Catch: java.lang.Throwable -> L25
            throw r7     // Catch: java.lang.Throwable -> L25
        L3d:
            monitor-exit(r0)
            java.util.ArrayList r7 = r7.c
            r7.clear()
            return
        L44:
            monitor-exit(r0)
            throw r7
    }

    @Override // defpackage.gx0
    public final void e() {
            r1 = this;
            h61 r0 = r1.f
            r0.d()
            java.util.ArrayList r0 = r1.c
            r0.clear()
            ja4 r0 = r1.e
            r0.a()
            java.lang.Object r0 = r1.a
            monitor-enter(r0)
            ja4 r1 = r1.b     // Catch: java.lang.Throwable -> L19
            r1.a()     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return
        L19:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @Override // defpackage.gx0
    public final defpackage.qn2 j(defpackage.ob6 r5) {
            r4 = this;
            ja4 r0 = r4.e
            java.lang.Object r1 = r0.g(r5)
            qn2 r1 = (defpackage.qn2) r1
            if (r1 != 0) goto L22
            bi2 r1 = new bi2
            r2 = 23
            r1.<init>(r2, r4, r5)
            int r4 = r0.f(r5)
            if (r4 >= 0) goto L18
            int r4 = ~r4
        L18:
            java.lang.Object[] r2 = r0.c
            r3 = r2[r4]
            java.lang.Object[] r0 = r0.b
            r0[r4] = r5
            r2[r4] = r1
        L22:
            return r1
    }

    @Override // defpackage.gx0
    public final void k(defpackage.ul0 r2) {
            r1 = this;
            ja4 r0 = r1.e
            r0.k(r2)
            r1.c(r2)
            r1.d()
            return
    }
}
