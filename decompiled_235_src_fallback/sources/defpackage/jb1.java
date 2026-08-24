package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jb1  reason: default package */
/* loaded from: classes.dex */
public final class jb1 {
    public java.lang.Object a;
    public java.lang.Object b;
    public final java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public final java.lang.Object f;
    public final java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;
    public java.lang.Object j;
    public java.lang.Object k;

    public jb1() {
            r3 = this;
            r3.<init>()
            ua4 r0 = new ua4
            r1 = 16
            br2[] r2 = new defpackage.br2[r1]
            r0.<init>(r2)
            r3.c = r0
            ka4 r2 = defpackage.c66.a
            ka4 r2 = new ka4
            r2.<init>()
            r3.d = r2
            r3.e = r0
            ua4 r0 = new ua4
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r0.<init>(r2)
            r3.f = r0
            ua4 r0 = new ua4
            on2[] r1 = new defpackage.on2[r1]
            r0.<init>(r1)
            r3.g = r0
            return
    }

    public jb1(defpackage.nb1 r3, defpackage.pa r4) {
            r2 = this;
            r2.<init>()
            r2.b = r3
            r2.a = r4
            fb1 r4 = new fb1
            r0 = 1
            r4.<init>(r3, r0, r0, r2)
            m55 r4 = defpackage.em1.a(r4)
            r2.c = r4
            fb1 r4 = new fb1
            r1 = 2
            r4.<init>(r3, r1, r0, r2)
            m55 r4 = defpackage.em1.a(r4)
            r2.d = r4
            fb1 r4 = new fb1
            r1 = 4
            r4.<init>(r3, r1, r0, r2)
            r2.g = r4
            fb1 r4 = new fb1
            r1 = 5
            r4.<init>(r3, r1, r0, r2)
            r2.h = r4
            fb1 r4 = new fb1
            r1 = 6
            r4.<init>(r3, r1, r0, r2)
            r2.i = r4
            fb1 r4 = new fb1
            r1 = 7
            r4.<init>(r3, r1, r0, r2)
            r2.j = r4
            fb1 r4 = new fb1
            r1 = 8
            r4.<init>(r3, r1, r0, r2)
            r2.k = r4
            fb1 r4 = new fb1
            r1 = 3
            r4.<init>(r3, r1, r0, r2)
            m55 r4 = defpackage.em1.a(r4)
            r2.e = r4
            fb1 r4 = new fb1
            r1 = 0
            r4.<init>(r3, r1, r0, r2)
            m55 r3 = defpackage.em1.a(r4)
            r2.f = r3
            return
    }

    public static final boolean f(defpackage.br2 r5, defpackage.ua4 r6) {
            java.lang.Object[] r0 = r6.A
            int r6 = r6.L
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r6) goto L28
            r3 = r0[r2]
            br2 r3 = (defpackage.br2) r3
            bj5 r3 = r3.a
            boolean r4 = r3 instanceof defpackage.uu4
            if (r4 == 0) goto L25
            uu4 r3 = (defpackage.uu4) r3
            ua4 r3 = r3.B
            boolean r4 = r3.j(r5)
            if (r4 == 0) goto L1d
            goto L23
        L1d:
            boolean r3 = f(r5, r3)
            if (r3 == 0) goto L25
        L23:
            r5 = 1
            return r5
        L25:
            int r2 = r2 + 1
            goto L6
        L28:
            return r1
    }

    public void a() {
            r3 = this;
            r0 = 0
            r3.a = r0
            r3.b = r0
            java.lang.Object r1 = r3.c
            ua4 r1 = (defpackage.ua4) r1
            r1.g()
            java.lang.Object r2 = r3.d
            ka4 r2 = (defpackage.ka4) r2
            r2.b()
            r3.e = r1
            java.lang.Object r1 = r3.f
            ua4 r1 = (defpackage.ua4) r1
            r1.g()
            java.lang.Object r1 = r3.g
            ua4 r1 = (defpackage.ua4) r1
            r1.g()
            r3.h = r0
            r3.i = r0
            r3.j = r0
            return
    }

    public void b() {
            r1 = this;
            java.lang.Object r1 = r1.a
            java.util.Set r1 = (java.util.Set) r1
            if (r1 != 0) goto L7
            goto L35
        L7:
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L35
            java.lang.String r0 = "Compose:abandons"
            android.os.Trace.beginSection(r0)
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L30
        L19:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L30
            bj5 r0 = (defpackage.bj5) r0     // Catch: java.lang.Throwable -> L30
            r1.remove()     // Catch: java.lang.Throwable -> L30
            r0.a()     // Catch: java.lang.Throwable -> L30
            goto L19
        L2c:
            android.os.Trace.endSection()
            return
        L30:
            r1 = move-exception
            android.os.Trace.endSection()
            throw r1
        L35:
            return
    }

    public void c() {
            r8 = this;
            java.lang.Object r0 = r8.c
            ua4 r0 = (defpackage.ua4) r0
            java.lang.Object r1 = r8.f
            ua4 r1 = (defpackage.ua4) r1
            java.lang.Object r2 = r8.a
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L10
            goto Lb4
        L10:
            r3 = 0
            r8.k = r3
            int r3 = r1.L
            r4 = 18
            if (r3 == 0) goto L73
            java.lang.String r3 = "Compose:onForgotten"
            android.os.Trace.beginSection(r3)
            java.lang.Object r3 = r8.h     // Catch: java.lang.Throwable -> L6e
            ka4 r3 = (defpackage.ka4) r3     // Catch: java.lang.Throwable -> L6e
            int r5 = r1.L     // Catch: java.lang.Throwable -> L6e
            int r5 = r5 + (-1)
        L26:
            r6 = -1
            if (r6 >= r5) goto L6a
            java.lang.Object[] r6 = r1.A     // Catch: java.lang.Throwable -> L6e
            r6 = r6[r5]     // Catch: java.lang.Throwable -> L6e
            boolean r7 = r6 instanceof defpackage.br2     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L3f
            r7 = r6
            br2 r7 = (defpackage.br2) r7     // Catch: java.lang.Throwable -> L3d
            bj5 r7 = r7.a     // Catch: java.lang.Throwable -> L3d
            r2.remove(r7)     // Catch: java.lang.Throwable -> L3d
            r7.b()     // Catch: java.lang.Throwable -> L3d
            goto L3f
        L3d:
            r0 = move-exception
            goto L5b
        L3f:
            boolean r7 = r6 instanceof defpackage.ww0     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L58
            if (r3 == 0) goto L52
            boolean r7 = r3.c(r6)     // Catch: java.lang.Throwable -> L3d
            if (r7 == 0) goto L52
            r7 = r6
            ww0 r7 = (defpackage.ww0) r7     // Catch: java.lang.Throwable -> L3d
            r7.a()     // Catch: java.lang.Throwable -> L3d
            goto L58
        L52:
            r7 = r6
            ww0 r7 = (defpackage.ww0) r7     // Catch: java.lang.Throwable -> L3d
            r7.b()     // Catch: java.lang.Throwable -> L3d
        L58:
            int r5 = r5 + (-1)
            goto L26
        L5b:
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> L6e
            cy0 r8 = (defpackage.cy0) r8     // Catch: java.lang.Throwable -> L6e
            if (r8 == 0) goto L69
            q6 r1 = new q6     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r4, r8, r6)     // Catch: java.lang.Throwable -> L6e
            defpackage.nw7.s0(r0, r1)     // Catch: java.lang.Throwable -> L6e
        L69:
            throw r0     // Catch: java.lang.Throwable -> L6e
        L6a:
            android.os.Trace.endSection()
            goto L73
        L6e:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        L73:
            int r1 = r0.L
            if (r1 == 0) goto Lb4
            java.lang.String r1 = "Compose:onRemembered"
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r8.a     // Catch: java.lang.Throwable -> La9
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto L83
            goto Lac
        L83:
            java.lang.Object[] r2 = r0.A     // Catch: java.lang.Throwable -> La9
            int r0 = r0.L     // Catch: java.lang.Throwable -> La9
            r3 = 0
        L88:
            if (r3 >= r0) goto Lac
            r5 = r2[r3]     // Catch: java.lang.Throwable -> La9
            br2 r5 = (defpackage.br2) r5     // Catch: java.lang.Throwable -> La9
            bj5 r6 = r5.a     // Catch: java.lang.Throwable -> La9
            r1.remove(r6)     // Catch: java.lang.Throwable -> La9
            r6.c()     // Catch: java.lang.Throwable -> L99
            int r3 = r3 + 1
            goto L88
        L99:
            r0 = move-exception
            java.lang.Object r8 = r8.b     // Catch: java.lang.Throwable -> La9
            cy0 r8 = (defpackage.cy0) r8     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto Lab
            q6 r1 = new q6     // Catch: java.lang.Throwable -> La9
            r1.<init>(r4, r8, r5)     // Catch: java.lang.Throwable -> La9
            defpackage.nw7.s0(r0, r1)     // Catch: java.lang.Throwable -> La9
            goto Lab
        La9:
            r8 = move-exception
            goto Lb0
        Lab:
            throw r0     // Catch: java.lang.Throwable -> La9
        Lac:
            android.os.Trace.endSection()
            return
        Lb0:
            android.os.Trace.endSection()
            throw r8
        Lb4:
            return
    }

    public void d() {
            r4 = this;
            java.lang.Object r4 = r4.g
            ua4 r4 = (defpackage.ua4) r4
            int r0 = r4.L
            if (r0 == 0) goto L2a
            java.lang.String r0 = "Compose:sideeffects"
            android.os.Trace.beginSection(r0)
            java.lang.Object[] r0 = r4.A     // Catch: java.lang.Throwable -> L25
            int r1 = r4.L     // Catch: java.lang.Throwable -> L25
            r2 = 0
        L12:
            if (r2 >= r1) goto L1e
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L25
            on2 r3 = (defpackage.on2) r3     // Catch: java.lang.Throwable -> L25
            r3.c()     // Catch: java.lang.Throwable -> L25
            int r2 = r2 + 1
            goto L12
        L1e:
            r4.g()     // Catch: java.lang.Throwable -> L25
            android.os.Trace.endSection()
            return
        L25:
            r4 = move-exception
            android.os.Trace.endSection()
            throw r4
        L2a:
            return
    }

    public void e(defpackage.br2 r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            ua4 r0 = (defpackage.ua4) r0
            java.lang.Object r1 = r2.d
            ka4 r1 = (defpackage.ka4) r1
            boolean r1 = r1.c(r3)
            if (r1 == 0) goto L36
            java.lang.Object r1 = r2.d
            ka4 r1 = (defpackage.ka4) r1
            r1.l(r3)
            java.lang.Object r1 = r2.e
            ua4 r1 = (defpackage.ua4) r1
            boolean r1 = r1.j(r3)
            if (r1 != 0) goto L29
            boolean r1 = r0.j(r3)
            if (r1 == 0) goto L26
            goto L29
        L26:
            f(r3, r0)
        L29:
            java.lang.Object r2 = r2.a
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L30
            goto L43
        L30:
            bj5 r3 = r3.a
            r2.add(r3)
            return
        L36:
            java.lang.Object r0 = r2.k
            ka4 r0 = (defpackage.ka4) r0
            if (r0 == 0) goto L44
            boolean r0 = r0.c(r3)
            if (r0 != 0) goto L43
            goto L44
        L43:
            return
        L44:
            java.lang.Object r2 = r2.f
            ua4 r2 = (defpackage.ua4) r2
            r2.b(r3)
            return
    }

    public void g(java.util.Set r1, defpackage.cy0 r2) {
            r0 = this;
            r0.a()
            r0.a = r1
            r0.b = r2
            return
    }
}
