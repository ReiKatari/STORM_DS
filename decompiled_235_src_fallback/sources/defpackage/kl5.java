package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl5  reason: default package */
/* loaded from: classes.dex */
public final class kl5 extends defpackage.db2 {
    public static final defpackage.lt4 X = null;
    public final java.lang.ClassLoader B;
    public final defpackage.db2 L;
    public final defpackage.ex6 R;

    static {
            java.lang.String r0 = defpackage.lt4.B
            java.lang.String r0 = "/"
            lt4 r0 = defpackage.w31.p(r0)
            defpackage.kl5.X = r0
            return
    }

    public kl5(java.lang.ClassLoader r2) {
            r1 = this;
            xf3 r0 = defpackage.db2.A
            r0.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r0
            er2 r2 = new er2
            r0 = 18
            r2.<init>(r1, r0)
            ex6 r0 = new ex6
            r0.<init>(r2)
            r1.R = r0
            return
    }

    @Override // defpackage.db2
    public final defpackage.ai1 D(defpackage.lt4 r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = defpackage.jd1.c(r3)
            if (r0 != 0) goto La
            goto L4a
        La:
            lt4 r0 = defpackage.kl5.X
            r0.getClass()
            r1 = 1
            lt4 r3 = defpackage.f.b(r0, r3, r1)
            lt4 r3 = r3.c(r0)
            da0 r3 = r3.A
            java.lang.String r3 = r3.s()
            ex6 r2 = r2.R
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r2.next()
            vr4 r0 = (defpackage.vr4) r0
            java.lang.Object r1 = r0.A
            db2 r1 = (defpackage.db2) r1
            java.lang.Object r0 = r0.B
            lt4 r0 = (defpackage.lt4) r0
            lt4 r0 = r0.d(r3)
            ai1 r0 = r1.D(r0)
            if (r0 != 0) goto L49
            goto L2a
        L49:
            return r0
        L4a:
            r2 = 0
            return r2
    }

    @Override // defpackage.db2
    public final defpackage.wf3 F(defpackage.lt4 r6) {
            r5 = this;
            boolean r0 = defpackage.jd1.c(r6)
            r1 = 0
            java.lang.String r2 = "file not found: "
            if (r0 == 0) goto L4a
            lt4 r0 = defpackage.kl5.X
            r0.getClass()
            r3 = 1
            lt4 r3 = defpackage.f.b(r0, r6, r3)
            lt4 r0 = r3.c(r0)
            da0 r0 = r0.A
            java.lang.String r0 = r0.s()
            ex6 r5 = r5.R
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            java.util.Iterator r5 = r5.iterator()
        L29:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L46
            java.lang.Object r3 = r5.next()
            vr4 r3 = (defpackage.vr4) r3
            java.lang.Object r4 = r3.A
            db2 r4 = (defpackage.db2) r4
            java.lang.Object r3 = r3.B
            lt4 r3 = (defpackage.lt4) r3
            lt4 r3 = r3.d(r0)     // Catch: java.io.FileNotFoundException -> L29
            wf3 r5 = r4.F(r3)     // Catch: java.io.FileNotFoundException -> L29
            return r5
        L46:
            defpackage.e41.u(r6, r2)
            return r1
        L4a:
            defpackage.e41.u(r6, r2)
            return r1
    }

    @Override // defpackage.db2
    public final defpackage.ui6 J(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is read-only"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // defpackage.db2
    public final defpackage.in6 N(defpackage.lt4 r6) {
            r5 = this;
            r6.getClass()
            boolean r0 = defpackage.jd1.c(r6)
            r1 = 0
            java.lang.String r2 = "file not found: "
            if (r0 == 0) goto L46
            lt4 r0 = defpackage.kl5.X
            r0.getClass()
            r3 = 0
            lt4 r4 = defpackage.f.b(r0, r6, r3)
            lt4 r0 = r4.c(r0)
            da0 r0 = r0.A
            java.lang.String r0 = r0.s()
            java.lang.ClassLoader r5 = r5.B
            java.net.URL r5 = r5.getResource(r0)
            if (r5 == 0) goto L42
            java.net.URLConnection r5 = r5.openConnection()
            boolean r6 = r5 instanceof java.net.JarURLConnection
            if (r6 == 0) goto L36
            r6 = r5
            java.net.JarURLConnection r6 = (java.net.JarURLConnection) r6
            r6.setUseCaches(r3)
        L36:
            java.io.InputStream r5 = r5.getInputStream()
            r5.getClass()
            a83 r5 = defpackage.hi2.P(r5)
            return r5
        L42:
            defpackage.e41.u(r6, r2)
            return r1
        L46:
            defpackage.e41.u(r6, r2)
            return r1
    }

    @Override // defpackage.db2
    public final defpackage.ui6 e(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is read-only"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // defpackage.db2
    public final void h(defpackage.lt4 r1, defpackage.lt4 r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is read-only"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // defpackage.db2
    public final void n(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is read-only"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // defpackage.db2
    public final void r(defpackage.lt4 r2) {
            r1 = this;
            r2.getClass()
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " is read-only"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            throw r2
    }

    @Override // defpackage.db2
    public final java.util.List x(defpackage.lt4 r15) {
            r14 = this;
            r15.getClass()
            lt4 r0 = defpackage.kl5.X
            r0.getClass()
            r1 = 1
            lt4 r2 = defpackage.f.b(r0, r15, r1)
            lt4 r2 = r2.c(r0)
            da0 r2 = r2.A
            java.lang.String r2 = r2.s()
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            ex6 r14 = r14.R
            java.lang.Object r14 = r14.getValue()
            java.util.List r14 = (java.util.List) r14
            java.util.Iterator r14 = r14.iterator()
            r4 = 0
            r5 = r4
        L2a:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto Lac
            java.lang.Object r6 = r14.next()
            vr4 r6 = (defpackage.vr4) r6
            java.lang.Object r7 = r6.A
            db2 r7 = (defpackage.db2) r7
            java.lang.Object r6 = r6.B
            lt4 r6 = (defpackage.lt4) r6
            lt4 r8 = r6.d(r2)     // Catch: java.io.IOException -> L2a
            java.util.List r7 = r7.x(r8)     // Catch: java.io.IOException -> L2a
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.io.IOException -> L2a
            r8.<init>()     // Catch: java.io.IOException -> L2a
            java.util.Iterator r7 = r7.iterator()     // Catch: java.io.IOException -> L2a
        L4f:
            boolean r9 = r7.hasNext()     // Catch: java.io.IOException -> L2a
            if (r9 == 0) goto L66
            java.lang.Object r9 = r7.next()     // Catch: java.io.IOException -> L2a
            r10 = r9
            lt4 r10 = (defpackage.lt4) r10     // Catch: java.io.IOException -> L2a
            boolean r10 = defpackage.jd1.c(r10)     // Catch: java.io.IOException -> L2a
            if (r10 == 0) goto L4f
            r8.add(r9)     // Catch: java.io.IOException -> L2a
            goto L4f
        L66:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.io.IOException -> L2a
            r9 = 10
            int r9 = defpackage.ht0.v0(r8, r9)     // Catch: java.io.IOException -> L2a
            r7.<init>(r9)     // Catch: java.io.IOException -> L2a
            int r9 = r8.size()     // Catch: java.io.IOException -> L2a
            r10 = r4
        L76:
            if (r10 >= r9) goto La6
            java.lang.Object r11 = r8.get(r10)     // Catch: java.io.IOException -> L2a
            int r10 = r10 + 1
            lt4 r11 = (defpackage.lt4) r11     // Catch: java.io.IOException -> L2a
            r11.getClass()     // Catch: java.io.IOException -> L2a
            da0 r12 = r6.A     // Catch: java.io.IOException -> L2a
            java.lang.String r12 = r12.s()     // Catch: java.io.IOException -> L2a
            da0 r11 = r11.A     // Catch: java.io.IOException -> L2a
            java.lang.String r11 = r11.s()     // Catch: java.io.IOException -> L2a
            java.lang.String r11 = defpackage.qs6.D0(r11, r12)     // Catch: java.io.IOException -> L2a
            r12 = 92
            r13 = 47
            java.lang.String r11 = r11.replace(r12, r13)     // Catch: java.io.IOException -> L2a
            r11.getClass()     // Catch: java.io.IOException -> L2a
            lt4 r11 = r0.d(r11)     // Catch: java.io.IOException -> L2a
            r7.add(r11)     // Catch: java.io.IOException -> L2a
            goto L76
        La6:
            defpackage.gt0.A0(r3, r7)     // Catch: java.io.IOException -> L2a
            r5 = r1
            goto L2a
        Lac:
            if (r5 == 0) goto Lb3
            java.util.List r14 = defpackage.gt0.k1(r3)
            return r14
        Lb3:
            java.lang.String r14 = "file not found: "
            defpackage.e41.u(r15, r14)
            r14 = 0
            return r14
    }
}
