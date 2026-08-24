package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zz2  reason: default package */
/* loaded from: classes.dex */
public abstract class zz2 {
    static {
            da0 r0 = defpackage.da0.R
            java.lang.String r0 = "\"\\"
            defpackage.xd5.o(r0)
            java.lang.String r0 = "\t ,="
            defpackage.xd5.o(r0)
            return
    }

    public static final boolean a(defpackage.wl5 r4) {
            pa r0 = r4.A
            java.lang.Object r0 = r0.L
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "HEAD"
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto Lf
            goto L40
        Lf:
            int r0 = r4.R
            r1 = 100
            if (r0 < r1) goto L19
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 < r1) goto L22
        L19:
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L22
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L22
            goto L42
        L22:
            long r0 = defpackage.az7.e(r4)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L42
            yw2 r4 = r4.Y
            java.lang.String r0 = "Transfer-Encoding"
            java.lang.String r4 = r4.a(r0)
            if (r4 != 0) goto L37
            r4 = 0
        L37:
            java.lang.String r0 = "chunked"
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L40
            goto L42
        L40:
            r4 = 0
            return r4
        L42:
            r4 = 1
            return r4
    }

    public static final void b(defpackage.vs0 r36, defpackage.i03 r37, defpackage.yw2 r38) {
            r36.getClass()
            r37.getClass()
            r38.getClass()
            vs0 r0 = defpackage.vs0.e0
            r1 = r36
            if (r1 != r0) goto L10
            return
        L10:
            java.util.regex.Pattern r0 = defpackage.c51.k
            java.lang.String r0 = "Set-Cookie"
            r1 = r38
            java.util.List r1 = r1.f(r0)
            int r2 = r1.size()
            r3 = 0
            r5 = r3
            r6 = 0
        L21:
            if (r5 >= r2) goto L21f
            java.lang.Object r0 = r1.get(r5)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r7.getClass()
            long r8 = java.lang.System.currentTimeMillis()
            r10 = 59
            r11 = 6
            int r0 = defpackage.yy7.g(r7, r10, r3, r3, r11)
            r12 = 2
            r13 = 61
            int r12 = defpackage.yy7.g(r7, r13, r3, r0, r12)
            if (r12 != r0) goto L42
            goto L71
        L42:
            int r14 = defpackage.yy7.j(r3, r12, r7)
            int r15 = defpackage.yy7.k(r14, r12, r7)
            java.lang.String r17 = r7.substring(r14, r15)
            int r14 = r17.length()
            if (r14 != 0) goto L55
            goto L71
        L55:
            int r14 = defpackage.yy7.i(r17)
            r15 = -1
            if (r14 == r15) goto L5d
            goto L71
        L5d:
            int r12 = r12 + 1
            int r12 = defpackage.yy7.j(r12, r0, r7)
            int r14 = defpackage.yy7.k(r12, r0, r7)
            java.lang.String r18 = r7.substring(r12, r14)
            int r12 = defpackage.yy7.i(r18)
            if (r12 == r15) goto L76
        L71:
            r7 = r37
            r4 = 0
            goto L20d
        L76:
            int r0 = r0 + 1
            int r12 = r7.length()
            r19 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r23 = r3
            r24 = r23
            r25 = r24
            r28 = r19
            r38 = 1
            r4 = 0
            r14 = 0
            r21 = -1
            r26 = 1
            r27 = 0
        L93:
            r30 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r32 = -9223372036854775808
            if (r0 >= r12) goto L16e
            r34 = -1
            int r15 = defpackage.yy7.e(r7, r10, r0, r12)
            int r10 = defpackage.yy7.e(r7, r13, r0, r15)
            int r0 = defpackage.yy7.j(r0, r10, r7)
            int r13 = defpackage.yy7.k(r0, r10, r7)
            java.lang.String r0 = r7.substring(r0, r13)
            if (r10 >= r15) goto Lc3
            int r10 = r10 + 1
            int r10 = defpackage.yy7.j(r10, r15, r7)
            int r13 = defpackage.yy7.k(r10, r15, r7)
            java.lang.String r10 = r7.substring(r10, r13)
            goto Lc5
        Lc3:
            java.lang.String r10 = ""
        Lc5:
            java.lang.String r13 = "expires"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto Ld9
            int r0 = r10.length()     // Catch: java.lang.Throwable -> L166
            long r28 = defpackage.l.H(r0, r10)     // Catch: java.lang.Throwable -> L166
        Ld5:
            r25 = r38
            goto L166
        Ld9:
            java.lang.String r13 = "max-age"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L110
            long r21 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> Lee
            r30 = 0
            int r0 = (r21 > r30 ? 1 : (r21 == r30 ? 0 : -1))
            if (r0 > 0) goto Ld5
            r21 = r32
            goto Ld5
        Lee:
            r0 = move-exception
            java.lang.String r13 = "-?\\d+"
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            r13.getClass()
            java.util.regex.Matcher r13 = r13.matcher(r10)
            boolean r13 = r13.matches()
            if (r13 == 0) goto L10f
            java.lang.String r0 = "-"
            boolean r0 = defpackage.xs6.g0(r10, r0, r3)
            if (r0 == 0) goto L10c
            r30 = r32
        L10c:
            r21 = r30
            goto Ld5
        L10f:
            throw r0
        L110:
            java.lang.String r13 = "domain"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L13c
            java.lang.String r0 = "."
            boolean r13 = defpackage.xs6.Y(r10, r0, r3)     // Catch: java.lang.Throwable -> L166
            if (r13 != 0) goto L134
            java.lang.String r0 = defpackage.qs6.D0(r10, r0)     // Catch: java.lang.Throwable -> L166
            java.lang.String r0 = defpackage.wy7.b(r0)     // Catch: java.lang.Throwable -> L166
            if (r0 == 0) goto L12e
            r4 = r0
            r26 = r3
            goto L166
        L12e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L166
            r0.<init>()     // Catch: java.lang.Throwable -> L166
            throw r0     // Catch: java.lang.Throwable -> L166
        L134:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L166
            r10.<init>(r0)     // Catch: java.lang.Throwable -> L166
            throw r10     // Catch: java.lang.Throwable -> L166
        L13c:
            java.lang.String r13 = "path"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L146
            r14 = r10
            goto L166
        L146:
            java.lang.String r13 = "secure"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L151
            r23 = r38
            goto L166
        L151:
            java.lang.String r13 = "httponly"
            boolean r13 = r0.equalsIgnoreCase(r13)
            if (r13 == 0) goto L15c
            r24 = r38
            goto L166
        L15c:
            java.lang.String r13 = "samesite"
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L166
            r27 = r10
        L166:
            int r0 = r15 + 1
            r10 = 59
            r13 = 61
            goto L93
        L16e:
            r34 = -1
            int r0 = (r21 > r32 ? 1 : (r21 == r32 ? 0 : -1))
            if (r0 != 0) goto L179
            r7 = r37
            r19 = r32
            goto L1a1
        L179:
            int r0 = (r21 > r34 ? 1 : (r21 == r34 ? 0 : -1))
            if (r0 == 0) goto L19d
            r12 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r21 > r12 ? 1 : (r21 == r12 ? 0 : -1))
            if (r0 > 0) goto L18a
            r12 = 1000(0x3e8, double:4.94E-321)
            long r30 = r21 * r12
        L18a:
            long r30 = r8 + r30
            int r0 = (r30 > r8 ? 1 : (r30 == r8 ? 0 : -1))
            if (r0 < 0) goto L19a
            int r0 = (r30 > r19 ? 1 : (r30 == r19 ? 0 : -1))
            if (r0 <= 0) goto L195
            goto L19a
        L195:
            r7 = r37
            r19 = r30
            goto L1a1
        L19a:
            r7 = r37
            goto L1a1
        L19d:
            r7 = r37
            r19 = r28
        L1a1:
            java.lang.String r0 = r7.d
            if (r4 != 0) goto L1a7
            r4 = r0
            goto L1cf
        L1a7:
            boolean r8 = defpackage.nb3.k(r0, r4)
            if (r8 == 0) goto L1ae
            goto L1cf
        L1ae:
            boolean r8 = defpackage.xs6.Y(r0, r4, r3)
            if (r8 == 0) goto L1e1
            int r8 = r0.length()
            int r9 = r4.length()
            int r8 = r8 - r9
            int r8 = r8 + (-1)
            char r8 = r0.charAt(r8)
            r9 = 46
            if (r8 != r9) goto L1e1
            xh5 r8 = defpackage.wy7.a
            boolean r8 = r8.d(r0)
            if (r8 != 0) goto L1e1
        L1cf:
            int r0 = r0.length()
            int r8 = r4.length()
            if (r0 == r8) goto L1e4
            f65 r0 = defpackage.f65.d
            java.lang.String r0 = r0.a(r4)
            if (r0 != 0) goto L1e4
        L1e1:
            r16 = 0
            goto L20b
        L1e4:
            java.lang.String r0 = "/"
            if (r14 == 0) goto L1f2
            boolean r8 = defpackage.xs6.g0(r14, r0, r3)
            if (r8 != 0) goto L1ef
            goto L1f2
        L1ef:
            r22 = r14
            goto L204
        L1f2:
            java.lang.String r8 = r7.b()
            r9 = 47
            int r9 = defpackage.qs6.x0(r9, r3, r11, r8)
            if (r9 == 0) goto L202
            java.lang.String r0 = r8.substring(r3, r9)
        L202:
            r14 = r0
            goto L1ef
        L204:
            c51 r16 = new c51
            r21 = r4
            r16.<init>(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27)
        L20b:
            r4 = r16
        L20d:
            if (r4 != 0) goto L210
            goto L21b
        L210:
            if (r6 != 0) goto L218
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6 = r0
        L218:
            r6.add(r4)
        L21b:
            int r5 = r5 + 1
            goto L21
        L21f:
            if (r6 == 0) goto L229
            java.util.List r4 = java.util.Collections.unmodifiableList(r6)
            r4.getClass()
            goto L22a
        L229:
            r4 = 0
        L22a:
            if (r4 != 0) goto L22e
            yt1 r4 = defpackage.yt1.A
        L22e:
            r4.isEmpty()
            return
    }
}
