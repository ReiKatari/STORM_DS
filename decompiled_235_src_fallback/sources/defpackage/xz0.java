package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xz0  reason: default package */
/* loaded from: classes.dex */
public final class xz0 {
    public static final java.util.List e = null;
    public static final java.util.List f = null;
    public static final defpackage.xz0 g = null;
    public static final defpackage.xz0 h = null;
    public final boolean a;
    public final boolean b;
    public final java.lang.String[] c;
    public final java.lang.String[] d;

    static {
            rq0 r0 = defpackage.rq0.r
            rq0 r1 = defpackage.rq0.s
            rq0 r2 = defpackage.rq0.t
            rq0 r3 = defpackage.rq0.l
            rq0 r4 = defpackage.rq0.n
            rq0 r5 = defpackage.rq0.m
            rq0 r6 = defpackage.rq0.o
            rq0 r7 = defpackage.rq0.q
            rq0 r8 = defpackage.rq0.p
            rq0[] r9 = new defpackage.rq0[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            java.util.List r9 = defpackage.hf.c0(r9)
            defpackage.xz0.e = r9
            rq0 r10 = defpackage.rq0.j
            rq0 r11 = defpackage.rq0.k
            rq0 r12 = defpackage.rq0.h
            rq0 r13 = defpackage.rq0.i
            rq0 r14 = defpackage.rq0.f
            rq0 r15 = defpackage.rq0.g
            rq0 r16 = defpackage.rq0.e
            r17 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r17
            rq0[] r1 = new defpackage.rq0[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            java.util.List r1 = defpackage.hf.c0(r1)
            defpackage.xz0.f = r1
            wz0 r2 = new wz0
            r2.<init>()
            r3 = 0
            rq0[] r4 = new defpackage.rq0[r3]
            java.lang.Object[] r0 = r0.toArray(r4)
            rq0[] r0 = (defpackage.rq0[]) r0
            int r4 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            rq0[] r0 = (defpackage.rq0[]) r0
            r2.b(r0)
            l67 r0 = defpackage.l67.TLS_1_3
            l67 r4 = defpackage.l67.TLS_1_2
            l67[] r5 = new defpackage.l67[]{r0, r4}
            r2.c(r5)
            r5 = 1
            r2.b = r5
            r2.a()
            wz0 r2 = new wz0
            r2.<init>()
            rq0[] r6 = new defpackage.rq0[r3]
            java.lang.Object[] r6 = r1.toArray(r6)
            rq0[] r6 = (defpackage.rq0[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            rq0[] r6 = (defpackage.rq0[]) r6
            r2.b(r6)
            l67[] r6 = new defpackage.l67[]{r0, r4}
            r2.c(r6)
            r2.b = r5
            xz0 r2 = r2.a()
            defpackage.xz0.g = r2
            wz0 r2 = new wz0
            r2.<init>()
            rq0[] r6 = new defpackage.rq0[r3]
            java.lang.Object[] r1 = r1.toArray(r6)
            rq0[] r1 = (defpackage.rq0[]) r1
            int r6 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r6)
            rq0[] r1 = (defpackage.rq0[]) r1
            r2.b(r1)
            l67 r1 = defpackage.l67.TLS_1_1
            l67 r6 = defpackage.l67.TLS_1_0
            l67[] r0 = new defpackage.l67[]{r0, r4, r1, r6}
            r2.c(r0)
            r2.b = r5
            r2.a()
            xz0 r0 = new xz0
            r1 = 0
            r0.<init>(r3, r3, r1, r1)
            defpackage.xz0.h = r0
            return
    }

    public xz0(boolean r1, boolean r2, java.lang.String[] r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    public final void a(javax.net.ssl.SSLSocket r10, boolean r11) {
            r9 = this;
            java.lang.String[] r0 = r10.getEnabledCipherSuites()
            r0.getClass()
            java.lang.String[] r1 = r9.c
            if (r1 == 0) goto L11
            zh2 r2 = defpackage.rq0.c
            java.lang.String[] r0 = defpackage.yy7.l(r1, r0, r2)
        L11:
            java.lang.String[] r1 = r9.d
            if (r1 == 0) goto L23
            java.lang.String[] r2 = r10.getEnabledProtocols()
            r2.getClass()
            qb4 r3 = defpackage.qb4.b
            java.lang.String[] r1 = defpackage.yy7.l(r2, r1, r3)
            goto L27
        L23:
            java.lang.String[] r1 = r10.getEnabledProtocols()
        L27:
            java.lang.String[] r2 = r10.getSupportedCipherSuites()
            r2.getClass()
            zh2 r3 = defpackage.rq0.c
            byte[] r4 = defpackage.yy7.a
            int r4 = r2.length
            r5 = 0
        L34:
            r6 = -1
            if (r5 >= r4) goto L45
            r7 = r2[r5]
            java.lang.String r8 = "TLS_FALLBACK_SCSV"
            int r7 = r3.compare(r7, r8)
            if (r7 != 0) goto L42
            goto L46
        L42:
            int r5 = r5 + 1
            goto L34
        L45:
            r5 = r6
        L46:
            if (r11 == 0) goto L60
            if (r5 == r6) goto L60
            r11 = r2[r5]
            r11.getClass()
            r0.getClass()
            int r2 = r0.length
            int r2 = r2 + 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            int r2 = r2 + (-1)
            r0[r2] = r11
        L60:
            int r11 = r0.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r0, r11)
            java.lang.String[] r11 = (java.lang.String[]) r11
            boolean r0 = r9.a
            if (r0 == 0) goto Lb8
            int r2 = r11.length
            if (r2 == 0) goto Lb2
            int r2 = r11.length
            java.lang.Object[] r11 = java.util.Arrays.copyOf(r11, r2)
            java.lang.String[] r11 = (java.lang.String[]) r11
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            if (r0 == 0) goto Lac
            int r2 = r1.length
            if (r2 == 0) goto La6
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            java.lang.String[] r1 = (java.lang.String[]) r1
            xz0 r2 = new xz0
            boolean r9 = r9.b
            r2.<init>(r0, r9, r11, r1)
            java.util.ArrayList r9 = r2.c()
            if (r9 == 0) goto L9a
            java.lang.String[] r9 = r2.d
            r10.setEnabledProtocols(r9)
        L9a:
            java.util.ArrayList r9 = r2.b()
            if (r9 == 0) goto La5
            java.lang.String[] r9 = r2.c
            r10.setEnabledCipherSuites(r9)
        La5:
            return
        La6:
            java.lang.String r9 = "At least one TLS version is required"
            defpackage.i.h(r9)
            return
        Lac:
            java.lang.String r9 = "no TLS versions for cleartext connections"
            defpackage.i.h(r9)
            return
        Lb2:
            java.lang.String r9 = "At least one cipher suite is required"
            defpackage.i.h(r9)
            return
        Lb8:
            java.lang.String r9 = "no cipher suites for cleartext connections"
            defpackage.i.h(r9)
            return
    }

    public final java.util.ArrayList b() {
            r5 = this;
            java.lang.String[] r5 = r5.c
            if (r5 == 0) goto L1d
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1c
            r3 = r5[r2]
            cs1 r4 = defpackage.rq0.b
            rq0 r3 = r4.r(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lc
        L1c:
            return r0
        L1d:
            r5 = 0
            return r5
    }

    public final java.util.ArrayList c() {
            r5 = this;
            java.lang.String[] r5 = r5.d
            if (r5 == 0) goto L20
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r5.length
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1f
            r3 = r5[r2]
            k67 r4 = defpackage.l67.Companion
            r4.getClass()
            l67 r3 = defpackage.k67.a(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto Lc
        L1f:
            return r0
        L20:
            r5 = 0
            return r5
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.xz0
            if (r0 != 0) goto L5
            goto L2f
        L5:
            if (r3 != r2) goto L8
            goto L31
        L8:
            xz0 r3 = (defpackage.xz0) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 == r0) goto L11
            goto L2f
        L11:
            if (r1 == 0) goto L31
            java.lang.String[] r0 = r2.c
            java.lang.String[] r1 = r3.c
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L1e
            goto L2f
        L1e:
            java.lang.String[] r0 = r2.d
            java.lang.String[] r1 = r3.d
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 != 0) goto L29
            goto L2f
        L29:
            boolean r2 = r2.b
            boolean r3 = r3.b
            if (r2 == r3) goto L31
        L2f:
            r2 = 0
            return r2
        L31:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            if (r0 == 0) goto L25
            r0 = 0
            java.lang.String[] r1 = r3.c
            if (r1 == 0) goto Le
            int r1 = java.util.Arrays.hashCode(r1)
            goto Lf
        Le:
            r1 = r0
        Lf:
            r2 = 527(0x20f, float:7.38E-43)
            int r2 = r2 + r1
            int r2 = r2 * 31
            java.lang.String[] r1 = r3.d
            if (r1 == 0) goto L1c
            int r0 = java.util.Arrays.hashCode(r1)
        L1c:
            int r2 = r2 + r0
            int r2 = r2 * 31
            boolean r3 = r3.b
            r3 = r3 ^ 1
            int r2 = r2 + r3
            return r2
        L25:
            r3 = 17
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            boolean r0 = r3.a
            if (r0 != 0) goto L7
            java.lang.String r3 = "ConnectionSpec()"
            return r3
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConnectionSpec(cipherSuites="
            r0.<init>(r1)
            java.util.ArrayList r1 = r3.b()
            java.lang.String r2 = "[all enabled]"
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", tlsVersions="
            r0.append(r1)
            java.util.ArrayList r1 = r3.c()
            java.lang.String r1 = java.util.Objects.toString(r1, r2)
            r0.append(r1)
            java.lang.String r1 = ", supportsTlsExtensions="
            r0.append(r1)
            boolean r3 = r3.b
            r1 = 41
            java.lang.String r3 = defpackage.xg6.r(r0, r3, r1)
            return r3
    }
}
