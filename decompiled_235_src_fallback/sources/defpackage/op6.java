package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: op6  reason: default package */
/* loaded from: classes.dex */
public final class op6 implements defpackage.gi7, defpackage.fj7 {
    public final defpackage.sg0 a;
    public final defpackage.lx b;
    public final defpackage.kj7 c;
    public final java.lang.Object d;
    public defpackage.li7 e;
    public final java.util.ArrayList f;
    public long g;
    public int h;
    public int i;
    public boolean j;
    public java.lang.Integer k;

    public op6(defpackage.sg0 r1, defpackage.lx r2, defpackage.kj7 r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            java.lang.Object r1 = new java.lang.Object
            r1.<init>()
            r0.d = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f = r1
            r1 = 2
            r0.h = r1
            r1 = 1
            r0.i = r1
            return
    }

    @Override // defpackage.fj7
    public final void a(java.util.LinkedHashSet r5) {
            r4 = this;
            java.util.Set r5 = defpackage.gt0.p1(r5)
            kj7 r0 = r4.c
            o41 r0 = r0.f
            xy5 r1 = new xy5
            r2 = 0
            r3 = 3
            r1.<init>(r2, r5, r4, r3)
            defpackage.hv.L(r0, r2, r2, r1, r3)
            return
    }

    @Override // defpackage.gi7
    public final void b(defpackage.li7 r1) {
            r0 = this;
            r0.e = r1
            r0.f()
            return
    }

    public final void c(java.lang.Exception r3) {
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            java.util.ArrayList r1 = r2.f     // Catch: java.lang.Throwable -> L24
            java.util.List r1 = defpackage.gt0.k1(r1)     // Catch: java.lang.Throwable -> L24
            java.util.ArrayList r2 = r2.f     // Catch: java.lang.Throwable -> L24
            r2.clear()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            java.util.Iterator r2 = r1.iterator()
        L13:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            tu0 r0 = (defpackage.tu0) r0
            r0.v0(r3)
            goto L13
        L23:
            return
        L24:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final int d(int r1, boolean r2, java.lang.Integer r3) {
            r0 = this;
            if (r3 == 0) goto L7
            int r1 = r3.intValue()
            goto L16
        L7:
            if (r1 == 0) goto L10
            r3 = 1
            if (r1 == r3) goto Le
            r1 = r3
            goto L16
        Le:
            r1 = 3
            goto L16
        L10:
            lx r1 = r0.b
            int r1 = r1.j()
        L16:
            java.lang.String r3 = "CXCP"
            if (r2 == 0) goto L30
            sg0 r0 = r0.a
            lg0 r0 = r0.b
            boolean r0 = defpackage.mb3.H(r0)
            if (r0 == 0) goto L30
            boolean r0 = defpackage.kj2.F(r3)
            if (r0 == 0) goto L2f
            java.lang.String r0 = "State3AControl.invalidate: trying external flash AE mode."
            android.util.Log.d(r3, r0)
        L2f:
            r1 = 5
        L30:
            boolean r0 = defpackage.kj2.F(r3)
            if (r0 == 0) goto L47
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "State3AControl.getFinalPreferredAeMode: preferAeMode = "
            r0.<init>(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
        L47:
            return r1
    }

    public final int e() {
            r5 = this;
            java.lang.Object r0 = r5.d
            monitor-enter(r0)
            sg0 r1 = r5.a     // Catch: java.lang.Throwable -> L17
            lg0 r1 = r1.b     // Catch: java.lang.Throwable -> L17
            int r2 = r5.h     // Catch: java.lang.Throwable -> L17
            boolean r3 = r5.j     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r4 = r5.k     // Catch: java.lang.Throwable -> L17
            int r5 = r5.d(r2, r3, r4)     // Catch: java.lang.Throwable -> L17
            int r5 = defpackage.mb3.F(r1, r5)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r5
        L17:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public final defpackage.tu0 f() {
            r7 = this;
            tu0 r0 = new tu0
            r0.<init>()
            ch5 r1 = new ch5
            r1.<init>()
            java.lang.Object r2 = r7.d
            monitor-enter(r2)
            java.util.ArrayList r3 = r7.f     // Catch: java.lang.Throwable -> L2c
            r3.add(r0)     // Catch: java.lang.Throwable -> L2c
            long r3 = r7.g     // Catch: java.lang.Throwable -> L2c
            r5 = 1
            long r3 = r3 + r5
            r7.g = r3     // Catch: java.lang.Throwable -> L2c
            r1.A = r3     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            kj7 r2 = r7.c
            o41 r2 = r2.f
            xy5 r3 = new xy5
            r4 = 4
            r5 = 0
            r3.<init>(r5, r7, r1, r4)
            r7 = 3
            defpackage.hv.L(r2, r5, r5, r3, r7)
            return r0
        L2c:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
    }

    @Override // defpackage.gi7
    public final void reset() {
            r2 = this;
            java.lang.Object r0 = r2.d
            monitor-enter(r0)
            r1 = 0
            r2.j = r1     // Catch: java.lang.Throwable -> L14
            r1 = 0
            r2.k = r1     // Catch: java.lang.Throwable -> L14
            r1 = 2
            r2.h = r1     // Catch: java.lang.Throwable -> L14
            r1 = 1
            r2.i = r1     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)
            r2.f()
            return
        L14:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }
}
