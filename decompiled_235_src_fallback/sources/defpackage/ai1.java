package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai1  reason: default package */
/* loaded from: classes.dex */
public final class ai1 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;
    public java.lang.Object g;
    public java.lang.Object h;
    public java.lang.Object i;

    public /* synthetic */ ai1() {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            return
    }

    public ai1(defpackage.bc1 r4, defpackage.gn5 r5, defpackage.h4 r6) {
            r3 = this;
            r5 = 2
            r3.a = r5
            r3.<init>()
            r3.d = r4
            i16 r5 = new i16
            r6 = -1
            java.lang.String r0 = ""
            r5.<init>(r0, r6, r0)
            r3.e = r5
            java.util.List r5 = r4.e
            yt1 r6 = defpackage.yt1.A
            if (r5 != 0) goto L1a
            r0 = r6
            goto L1b
        L1a:
            r0 = r5
        L1b:
            r3.f = r0
            ro5 r0 = new ro5
            r1 = 5
            r0.<init>(r3, r1)
            if (r5 != 0) goto L26
            r5 = r6
        L26:
            gr0 r3 = new gr0
            r3.<init>(r0)
            defpackage.gt0.U0(r3, r5)
            android.content.Context r3 = r4.a
            wb1 r5 = r4.d
            l16 r6 = r4.g
            java.util.concurrent.Executor r0 = r4.h
            java.util.concurrent.Executor r1 = r4.i
            java.util.List r2 = r4.m
            java.util.List r4 = r4.n
            r3.getClass()
            r5.getClass()
            r6.getClass()
            r0.getClass()
            r1.getClass()
            r2.getClass()
            r4.getClass()
            tg4 r3 = new tg4
            r4 = 0
            r3.<init>(r4)
            throw r3
    }

    public ai1(defpackage.bc1 r13, defpackage.ts1 r14, defpackage.h4 r15) {
            r12 = this;
            r0 = 2
            r12.a = r0
            l16 r1 = r13.g
            ou6 r2 = r13.c
            f36 r3 = r13.p
            java.lang.String r6 = r13.b
            r12.<init>()
            r12.d = r13
            r12.e = r14
            java.util.List r4 = r13.e
            if (r4 != 0) goto L18
            yt1 r4 = defpackage.yt1.A
        L18:
            r12.f = r4
            r4 = 0
            r10 = 1
            java.lang.String r11 = ":memory:"
            if (r3 != 0) goto L57
            if (r2 == 0) goto L51
            android.content.Context r5 = r13.a
            r5.getClass()
            zb r7 = new zb
            int r13 = r14.a
            r7.<init>(r12, r13)
            nu6 r4 = new nu6
            r8 = 0
            r9 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            pu6 r13 = r2.f(r4)
            r12.h = r13
            ht4 r14 = new ht4
            s35 r0 = new s35
            r13.getClass()
            r0.<init>()
            r0.A = r13
            if (r6 != 0) goto L4a
            r6 = r11
        L4a:
            r14.<init>(r0, r6, r15)
            r12.g = r14
            goto Lde
        L51:
            java.lang.String r12 = "SQLiteManager was constructed with both null driver and open helper factory!"
            defpackage.i.h(r12)
            throw r4
        L57:
            r12.h = r4
            boolean r13 = r3.m()
            if (r13 == 0) goto L6e
            ht4 r13 = new ht4
            u63 r14 = new u63
            r14.<init>(r12, r3)
            if (r6 != 0) goto L69
            r6 = r11
        L69:
            r13.<init>(r14, r6, r15)
            goto Ldc
        L6e:
            if (r6 != 0) goto L7c
            u63 r13 = new u63
            r13.<init>(r12, r3)
            uz0 r14 = new uz0
            r14.<init>(r13)
        L7a:
            r13 = r14
            goto Ldc
        L7c:
            u63 r13 = new u63
            r13.<init>(r12, r3)
            r1.getClass()
            int[] r14 = defpackage.r20.a
            int r15 = r1.ordinal()
            r15 = r14[r15]
            r2 = 39
            if (r15 == r10) goto Laf
            if (r15 != r0) goto L94
            r15 = 4
            goto Lb0
        L94:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Can't get max number of reader for journal mode '"
            r13.<init>(r14)
            r13.append(r1)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Laf:
            r15 = r10
        Lb0:
            int r3 = r1.ordinal()
            r14 = r14[r3]
            if (r14 == r10) goto Ld6
            if (r14 != r0) goto Lbb
            goto Ld6
        Lbb:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Can't get max number of writers for journal mode '"
            r13.<init>(r14)
            r13.append(r1)
            r13.append(r2)
            java.lang.String r13 = r13.toString()
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Ld6:
            uz0 r14 = new uz0
            r14.<init>(r13, r6, r15)
            goto L7a
        Ldc:
            r12.g = r13
        Lde:
            l16 r13 = defpackage.l16.WRITE_AHEAD_LOGGING
            if (r1 != r13) goto Le3
            goto Le4
        Le3:
            r10 = 0
        Le4:
            java.lang.Object r12 = r12.h
            pu6 r12 = (defpackage.pu6) r12
            if (r12 == 0) goto Led
            r12.setWriteAheadLoggingEnabled(r10)
        Led:
            return
    }

    public /* synthetic */ ai1(boolean r11, boolean r12, defpackage.lt4 r13, java.lang.Long r14, java.lang.Long r15, java.lang.Long r16, java.lang.Long r17) {
            r10 = this;
            r0 = 1
            r10.a = r0
            zt1 r9 = defpackage.zt1.A
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public ai1(boolean r2, boolean r3, defpackage.lt4 r4, java.lang.Long r5, java.lang.Long r6, java.lang.Long r7, java.lang.Long r8, java.util.Map r9) {
            r1 = this;
            r0 = 1
            r1.a = r0
            r9.getClass()
            r1.<init>()
            r1.b = r2
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r6
            r1.g = r7
            r1.h = r8
            java.util.Map r2 = defpackage.c14.s0(r9)
            r1.i = r2
            return
    }

    public static final void a(defpackage.ai1 r5, defpackage.e36 r6) {
            java.lang.Object r0 = r5.e
            ts1 r0 = (defpackage.ts1) r0
            java.lang.String r1 = "PRAGMA user_version = "
            f(r6)
            java.lang.Object r2 = r5.d
            bc1 r2 = (defpackage.bc1) r2
            l16 r3 = r2.g
            l16 r4 = defpackage.l16.WRITE_AHEAD_LOGGING
            if (r3 != r4) goto L19
            java.lang.String r3 = "PRAGMA journal_mode = WAL"
            defpackage.ii2.s(r6, r3)
            goto L1e
        L19:
            java.lang.String r3 = "PRAGMA journal_mode = TRUNCATE"
            defpackage.ii2.s(r6, r3)
        L1e:
            l16 r2 = r2.g
            if (r2 != r4) goto L28
            java.lang.String r2 = "PRAGMA synchronous = NORMAL"
            defpackage.ii2.s(r6, r2)
            goto L2d
        L28:
            java.lang.String r2 = "PRAGMA synchronous = FULL"
            defpackage.ii2.s(r6, r2)
        L2d:
            java.lang.String r2 = "PRAGMA user_version"
            j36 r2 = r6.i0(r2)
            r2.f0()     // Catch: java.lang.Throwable -> L8a
            r3 = 0
            long r3 = r2.getLong(r3)     // Catch: java.lang.Throwable -> L8a
            int r3 = (int) r3
            r4 = 0
            defpackage.lb4.p(r2, r4)
            int r0 = r0.a
            if (r3 == r0) goto L86
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.ii2.s(r6, r2)
            if (r3 != 0) goto L51
            r5.j(r6)     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            goto L66
        L51:
            r5.k(r6, r3, r0)     // Catch: java.lang.Throwable -> L4f
        L54:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L4f
            r2.append(r0)     // Catch: java.lang.Throwable -> L4f
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L4f
            defpackage.ii2.s(r6, r0)     // Catch: java.lang.Throwable -> L4f
            jg7 r0 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L4f
            goto L6c
        L66:
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L6c:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 != 0) goto L79
            r1 = r0
            jg7 r1 = (defpackage.jg7) r1
            java.lang.String r1 = "END TRANSACTION"
            defpackage.ii2.s(r6, r1)
        L79:
            java.lang.Throwable r0 = defpackage.hm5.a(r0)
            if (r0 != 0) goto L80
            goto L86
        L80:
            java.lang.String r5 = "ROLLBACK TRANSACTION"
            defpackage.ii2.s(r6, r5)
            throw r0
        L86:
            r5.l(r6)
            return
        L8a:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L8c
        L8c:
            r6 = move-exception
            defpackage.lb4.p(r2, r5)
            throw r6
    }

    public static void f(defpackage.e36 r5) {
            java.lang.String r0 = "PRAGMA busy_timeout"
            j36 r0 = r5.i0(r0)
            r0.f0()     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            defpackage.lb4.p(r0, r3)
            r3 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1d
            java.lang.String r0 = "PRAGMA busy_timeout = 3000"
            defpackage.ii2.s(r5, r0)
        L1d:
            return
        L1e:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            defpackage.lb4.p(r0, r5)
            throw r1
    }

    public void b(defpackage.ci1 r10, int r11, java.util.ArrayList r12, defpackage.s26 r13) {
            r9 = this;
            ct7 r10 = r10.d
            s26 r0 = r10.c
            ci1 r1 = r10.i
            ci1 r2 = r10.h
            if (r0 != 0) goto Ldb
            java.lang.Object r0 = r9.d
            m21 r0 = (defpackage.m21) r0
            ly2 r3 = r0.d
            if (r10 == r3) goto Ldb
            lm7 r0 = r0.e
            if (r10 != r0) goto L18
            goto Ldb
        L18:
            if (r13 != 0) goto L2e
            s26 r13 = new s26
            r13.<init>()
            r0 = 0
            r13.a = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r13.b = r0
            r13.a = r10
            r12.add(r13)
        L2e:
            r10.c = r13
            java.util.ArrayList r0 = r13.b
            r0.add(r10)
            java.util.ArrayList r0 = r2.k
            int r3 = r0.size()
            r4 = 0
            r5 = r4
        L3d:
            if (r5 >= r3) goto L51
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            xh1 r6 = (defpackage.xh1) r6
            boolean r7 = r6 instanceof defpackage.ci1
            if (r7 == 0) goto L3d
            ci1 r6 = (defpackage.ci1) r6
            r9.b(r6, r11, r12, r13)
            goto L3d
        L51:
            java.util.ArrayList r0 = r1.k
            int r3 = r0.size()
            r5 = r4
        L58:
            if (r5 >= r3) goto L6c
            java.lang.Object r6 = r0.get(r5)
            int r5 = r5 + 1
            xh1 r6 = (defpackage.xh1) r6
            boolean r7 = r6 instanceof defpackage.ci1
            if (r7 == 0) goto L58
            ci1 r6 = (defpackage.ci1) r6
            r9.b(r6, r11, r12, r13)
            goto L58
        L6c:
            r0 = 1
            if (r11 != r0) goto L93
            boolean r3 = r10 instanceof defpackage.lm7
            if (r3 == 0) goto L93
            r3 = r10
            lm7 r3 = (defpackage.lm7) r3
            ci1 r3 = r3.k
            java.util.ArrayList r3 = r3.k
            int r5 = r3.size()
            r6 = r4
        L7f:
            if (r6 >= r5) goto L93
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            xh1 r7 = (defpackage.xh1) r7
            boolean r8 = r7 instanceof defpackage.ci1
            if (r8 == 0) goto L7f
            ci1 r7 = (defpackage.ci1) r7
            r9.b(r7, r11, r12, r13)
            goto L7f
        L93:
            java.util.ArrayList r2 = r2.l
            int r3 = r2.size()
            r5 = r4
        L9a:
            if (r5 >= r3) goto La8
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            ci1 r6 = (defpackage.ci1) r6
            r9.b(r6, r11, r12, r13)
            goto L9a
        La8:
            java.util.ArrayList r1 = r1.l
            int r2 = r1.size()
            r3 = r4
        Laf:
            if (r3 >= r2) goto Lbd
            java.lang.Object r5 = r1.get(r3)
            int r3 = r3 + 1
            ci1 r5 = (defpackage.ci1) r5
            r9.b(r5, r11, r12, r13)
            goto Laf
        Lbd:
            if (r11 != r0) goto Ldb
            boolean r0 = r10 instanceof defpackage.lm7
            if (r0 == 0) goto Ldb
            lm7 r10 = (defpackage.lm7) r10
            ci1 r10 = r10.k
            java.util.ArrayList r10 = r10.l
            int r0 = r10.size()
        Lcd:
            if (r4 >= r0) goto Ldb
            java.lang.Object r1 = r10.get(r4)
            int r4 = r4 + 1
            ci1 r1 = (defpackage.ci1) r1
            r9.b(r1, r11, r12, r13)
            goto Lcd
        Ldb:
            return
    }

    public void c(defpackage.m21 r25) {
            r24 = this;
            r0 = r25
            java.util.ArrayList r1 = r0.t0
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        La:
            if (r4 >= r2) goto L347
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            r7 = r5
            l21 r7 = (defpackage.l21) r7
            k21[] r5 = r7.T
            h11[] r6 = r7.Q
            h11 r8 = r7.L
            h11 r9 = r7.J
            h11 r10 = r7.K
            h11 r11 = r7.I
            r12 = r5[r3]
            r13 = 1
            r5 = r5[r13]
            int r14 = r7.h0
            r15 = 8
            if (r14 != r15) goto L2f
            r7.a = r13
            goto La
        L2f:
            float r14 = r7.w
            r15 = 1065353216(0x3f800000, float:1.0)
            int r16 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            r17 = r3
            r3 = 2
            if (r16 >= 0) goto L43
            r16 = r15
            k21 r15 = defpackage.k21.MATCH_CONSTRAINT
            if (r12 != r15) goto L45
            r7.r = r3
            goto L45
        L43:
            r16 = r15
        L45:
            float r15 = r7.z
            int r18 = (r15 > r16 ? 1 : (r15 == r16 ? 0 : -1))
            if (r18 >= 0) goto L51
            k21 r13 = defpackage.k21.MATCH_CONSTRAINT
            if (r5 != r13) goto L51
            r7.s = r3
        L51:
            float r13 = r7.X
            r19 = 0
            int r13 = (r13 > r19 ? 1 : (r13 == r19 ? 0 : -1))
            if (r13 <= 0) goto L8d
            k21 r13 = defpackage.k21.MATCH_CONSTRAINT
            if (r12 != r13) goto L67
            k21 r3 = defpackage.k21.WRAP_CONTENT
            if (r5 == r3) goto L65
            k21 r3 = defpackage.k21.FIXED
            if (r5 != r3) goto L67
        L65:
            r3 = 3
            goto L69
        L67:
            r3 = 3
            goto L6c
        L69:
            r7.r = r3
            goto L8d
        L6c:
            if (r5 != r13) goto L7d
            k21 r3 = defpackage.k21.WRAP_CONTENT
            if (r12 == r3) goto L76
            k21 r3 = defpackage.k21.FIXED
            if (r12 != r3) goto L78
        L76:
            r3 = 3
            goto L7a
        L78:
            r3 = 3
            goto L7d
        L7a:
            r7.s = r3
            goto L8d
        L7d:
            if (r12 != r13) goto L8d
            if (r5 != r13) goto L8d
            int r13 = r7.r
            if (r13 != 0) goto L87
            r7.r = r3
        L87:
            int r13 = r7.s
            if (r13 != 0) goto L8d
            r7.s = r3
        L8d:
            k21 r3 = defpackage.k21.MATCH_CONSTRAINT
            if (r12 != r3) goto La3
            int r13 = r7.r
            r21 = r1
            r1 = 1
            if (r13 != r1) goto La5
            h11 r1 = r11.f
            if (r1 == 0) goto La0
            h11 r1 = r10.f
            if (r1 != 0) goto La5
        La0:
            k21 r12 = defpackage.k21.WRAP_CONTENT
            goto La5
        La3:
            r21 = r1
        La5:
            if (r5 != r3) goto Lb6
            int r1 = r7.s
            r13 = 1
            if (r1 != r13) goto Lb6
            h11 r1 = r9.f
            if (r1 == 0) goto Lb4
            h11 r1 = r8.f
            if (r1 != 0) goto Lb6
        Lb4:
            k21 r5 = defpackage.k21.WRAP_CONTENT
        Lb6:
            ly2 r1 = r7.d
            r1.d = r12
            int r13 = r7.r
            r1.a = r13
            lm7 r1 = r7.e
            r1.d = r5
            r22 = r2
            int r2 = r7.s
            r1.a = r2
            k21 r1 = defpackage.k21.MATCH_PARENT
            r23 = r4
            if (r12 == r1) goto Ld6
            k21 r4 = defpackage.k21.FIXED
            if (r12 == r4) goto Ld6
            k21 r4 = defpackage.k21.WRAP_CONTENT
            if (r12 != r4) goto Le2
        Ld6:
            if (r5 == r1) goto L2fe
            k21 r4 = defpackage.k21.FIXED
            if (r5 == r4) goto L2fe
            k21 r4 = defpackage.k21.WRAP_CONTENT
            if (r5 != r4) goto Le2
            goto L2fe
        Le2:
            r4 = 1056964608(0x3f000000, float:0.5)
            if (r12 != r3) goto Lf0
            k21 r8 = defpackage.k21.WRAP_CONTENT
            if (r5 == r8) goto Lee
            k21 r9 = defpackage.k21.FIXED
            if (r5 != r9) goto Lf0
        Lee:
            r9 = 3
            goto Lf3
        Lf0:
            r10 = r5
            goto L1b6
        Lf3:
            if (r13 != r9) goto L134
            if (r5 != r8) goto Lff
            r9 = 0
            r11 = 0
            r10 = r8
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
        Lff:
            int r11 = r7.l()
            float r1 = (float) r11
            float r2 = r7.X
            float r1 = r1 * r2
            float r1 = r1 + r4
            int r9 = (int) r1
            k21 r8 = defpackage.k21.FIXED
            r10 = r8
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r8 = 1
            r7.a = r8
        L12a:
            r3 = r17
            r1 = r21
            r2 = r22
            r4 = r23
            goto La
        L134:
            r9 = r8
            r8 = 1
            if (r13 != r8) goto L14d
            r1 = 0
            r11 = 0
            r6 = r24
            r10 = r5
            r8 = r9
            r9 = r1
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.m = r2
            goto L12a
        L14d:
            r10 = r5
            r8 = r9
            r5 = 2
            if (r13 != r5) goto L187
            k21[] r5 = r0.T
            r5 = r5[r17]
            k21 r8 = defpackage.k21.FIXED
            if (r5 == r8) goto L15c
            if (r5 != r1) goto L1b6
        L15c:
            int r1 = r0.r()
            float r1 = (float) r1
            float r14 = r14 * r1
            float r14 = r14 + r4
            int r9 = (int) r14
            int r11 = r7.l()
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r5 = 1
            r7.a = r5
            goto L12a
        L187:
            r5 = 1
            r9 = r6[r17]
            h11 r9 = r9.f
            if (r9 == 0) goto L194
            r9 = r6[r5]
            h11 r5 = r9.f
            if (r5 != 0) goto L1b6
        L194:
            r9 = 0
            r11 = 0
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r1 = 1
            r7.a = r1
            goto L12a
        L1b6:
            if (r10 != r3) goto L1c2
            k21 r8 = defpackage.k21.WRAP_CONTENT
            if (r12 == r8) goto L1c0
            k21 r5 = defpackage.k21.FIXED
            if (r12 != r5) goto L1c2
        L1c0:
            r9 = 3
            goto L1c6
        L1c2:
            r5 = r10
        L1c3:
            r1 = 1
            goto L293
        L1c6:
            if (r2 != r9) goto L206
            if (r12 != r8) goto L1d2
            r9 = 0
            r11 = 0
            r10 = r8
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
        L1d2:
            int r9 = r7.r()
            float r1 = r7.X
            int r2 = r7.Y
            r3 = -1
            if (r2 != r3) goto L1df
            float r1 = r16 / r1
        L1df:
            float r2 = (float) r9
            float r2 = r2 * r1
            float r2 = r2 + r4
            int r11 = (int) r2
            k21 r8 = defpackage.k21.FIXED
            r10 = r8
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r5 = 1
            r7.a = r5
            goto L12a
        L206:
            r5 = 1
            if (r2 != r5) goto L21e
            r9 = 0
            r11 = 0
            r6 = r24
            r10 = r8
            r8 = r12
            r6.h(r7, r8, r9, r10, r11)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.m = r2
            goto L12a
        L21e:
            r9 = r8
            r8 = r12
            r11 = 2
            if (r2 != r11) goto L25d
            k21[] r6 = r0.T
            r6 = r6[r5]
            r5 = r10
            k21 r10 = defpackage.k21.FIXED
            if (r6 == r10) goto L231
            if (r6 != r1) goto L22f
            goto L231
        L22f:
            r12 = r8
            goto L1c3
        L231:
            int r9 = r7.r()
            int r1 = r0.l()
            float r1 = (float) r1
            float r15 = r15 * r1
            float r15 = r15 + r4
            int r11 = (int) r15
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r1 = 1
            r7.a = r1
            goto L12a
        L25d:
            r12 = r8
            r5 = r10
            r19 = r11
            r1 = r6[r19]
            h11 r1 = r1.f
            if (r1 == 0) goto L26f
            r20 = 3
            r1 = r6[r20]
            h11 r1 = r1.f
            if (r1 != 0) goto L1c3
        L26f:
            r8 = r9
            r9 = 0
            r11 = 0
            r6 = r24
            r10 = r5
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r1 = 1
            r7.a = r1
            goto L12a
        L293:
            if (r12 != r3) goto L12a
            if (r5 != r3) goto L12a
            if (r13 == r1) goto L2de
            if (r2 != r1) goto L29c
            goto L2de
        L29c:
            r5 = 2
            if (r2 != r5) goto L12a
            if (r13 != r5) goto L12a
            k21[] r2 = r0.T
            r3 = r2[r17]
            k21 r8 = defpackage.k21.FIXED
            if (r3 != r8) goto L12a
            r2 = r2[r1]
            if (r2 != r8) goto L12a
            int r1 = r0.r()
            float r1 = (float) r1
            float r14 = r14 * r1
            float r14 = r14 + r4
            int r9 = (int) r14
            int r1 = r0.l()
            float r1 = (float) r1
            float r15 = r15 * r1
            float r15 = r15 + r4
            int r11 = (int) r15
            r10 = r8
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r1 = 1
            r7.a = r1
            goto L12a
        L2de:
            k21 r8 = defpackage.k21.WRAP_CONTENT
            r9 = 0
            r11 = 0
            r10 = r8
            r6 = r24
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.m = r2
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.m = r2
            goto L12a
        L2fe:
            int r2 = r7.r()
            if (r12 != r1) goto L310
            int r2 = r0.r()
            int r3 = r11.g
            int r2 = r2 - r3
            int r3 = r10.g
            int r2 = r2 - r3
            k21 r12 = defpackage.k21.FIXED
        L310:
            int r3 = r7.l()
            if (r5 != r1) goto L323
            int r1 = r0.l()
            int r3 = r9.g
            int r1 = r1 - r3
            int r3 = r8.g
            int r3 = r1 - r3
            k21 r5 = defpackage.k21.FIXED
        L323:
            r6 = r24
            r9 = r2
            r11 = r3
            r10 = r5
            r8 = r12
            r6.h(r7, r8, r9, r10, r11)
            ly2 r1 = r7.d
            rj1 r1 = r1.e
            int r2 = r7.r()
            r1.d(r2)
            lm7 r1 = r7.e
            rj1 r1 = r1.e
            int r2 = r7.l()
            r1.d(r2)
            r1 = 1
            r7.a = r1
            goto L12a
        L347:
            return
    }

    public void d() {
            r12 = this;
            java.lang.Object r0 = r12.d
            m21 r0 = (defpackage.m21) r0
            java.lang.Object r1 = r12.g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r12.f
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.clear()
            java.lang.Object r3 = r12.e
            m21 r3 = (defpackage.m21) r3
            ly2 r4 = r3.d
            r4.f()
            lm7 r4 = r3.e
            r4.f()
            ly2 r4 = r3.d
            r2.add(r4)
            lm7 r4 = r3.e
            r2.add(r4)
            java.util.ArrayList r4 = r3.t0
            int r5 = r4.size()
            r6 = 0
            r7 = 0
            r8 = r7
        L30:
            r9 = 1
            if (r8 >= r5) goto Lab
            java.lang.Object r10 = r4.get(r8)
            int r8 = r8 + 1
            l21 r10 = (defpackage.l21) r10
            boolean r11 = r10 instanceof defpackage.av2
            if (r11 == 0) goto L58
            bv2 r9 = new bv2
            r9.<init>(r10)
            ly2 r11 = r10.d
            r11.f()
            lm7 r11 = r10.e
            r11.f()
            av2 r10 = (defpackage.av2) r10
            int r10 = r10.x0
            r9.f = r10
            r2.add(r9)
            goto L30
        L58:
            boolean r11 = r10.y()
            if (r11 == 0) goto L76
            kl0 r11 = r10.b
            if (r11 != 0) goto L69
            kl0 r11 = new kl0
            r11.<init>(r10, r7)
            r10.b = r11
        L69:
            if (r6 != 0) goto L70
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L70:
            kl0 r11 = r10.b
            r6.add(r11)
            goto L7b
        L76:
            ly2 r11 = r10.d
            r2.add(r11)
        L7b:
            boolean r11 = r10.z()
            if (r11 == 0) goto L99
            kl0 r11 = r10.c
            if (r11 != 0) goto L8c
            kl0 r11 = new kl0
            r11.<init>(r10, r9)
            r10.c = r11
        L8c:
            if (r6 != 0) goto L93
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
        L93:
            kl0 r9 = r10.c
            r6.add(r9)
            goto L9e
        L99:
            lm7 r9 = r10.e
            r2.add(r9)
        L9e:
            boolean r9 = r10 instanceof defpackage.gx2
            if (r9 == 0) goto L30
            fx2 r9 = new fx2
            r9.<init>(r10)
            r2.add(r9)
            goto L30
        Lab:
            if (r6 == 0) goto Lb0
            r2.addAll(r6)
        Lb0:
            int r4 = r2.size()
            r5 = r7
        Lb5:
            if (r5 >= r4) goto Lc3
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            ct7 r6 = (defpackage.ct7) r6
            r6.f()
            goto Lb5
        Lc3:
            int r4 = r2.size()
            r5 = r7
        Lc8:
            if (r5 >= r4) goto Ldb
            java.lang.Object r6 = r2.get(r5)
            int r5 = r5 + 1
            ct7 r6 = (defpackage.ct7) r6
            l21 r8 = r6.b
            if (r8 != r3) goto Ld7
            goto Lc8
        Ld7:
            r6.d()
            goto Lc8
        Ldb:
            r1.clear()
            ly2 r2 = r0.d
            r12.g(r2, r7, r1)
            lm7 r0 = r0.e
            r12.g(r0, r9, r1)
            r12.b = r7
            return
    }

    public int e(defpackage.m21 r18, int r19) {
            r17 = this;
            r0 = r18
            r1 = r17
            r2 = r19
            java.lang.Object r1 = r1.g
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r3 = r1.size()
            r4 = 0
            r6 = 0
            r7 = r4
        L12:
            if (r6 >= r3) goto L108
            java.lang.Object r9 = r1.get(r6)
            s26 r9 = (defpackage.s26) r9
            ct7 r9 = r9.a
            boolean r10 = r9 instanceof defpackage.kl0
            if (r10 == 0) goto L2e
            r10 = r9
            kl0 r10 = (defpackage.kl0) r10
            int r10 = r10.f
            if (r10 == r2) goto L3a
        L27:
            r17 = r1
            r0 = r4
            r16 = r6
            goto Lfa
        L2e:
            if (r2 != 0) goto L35
            boolean r10 = r9 instanceof defpackage.ly2
            if (r10 != 0) goto L3a
            goto L27
        L35:
            boolean r10 = r9 instanceof defpackage.lm7
            if (r10 != 0) goto L3a
            goto L27
        L3a:
            if (r2 != 0) goto L41
            ly2 r10 = r0.d
        L3e:
            ci1 r10 = r10.h
            goto L44
        L41:
            lm7 r10 = r0.e
            goto L3e
        L44:
            if (r2 != 0) goto L4b
            ly2 r11 = r0.d
        L48:
            ci1 r11 = r11.i
            goto L4e
        L4b:
            lm7 r11 = r0.e
            goto L48
        L4e:
            ci1 r12 = r9.h
            ci1 r13 = r9.i
            java.util.ArrayList r14 = r12.l
            boolean r10 = r14.contains(r10)
            java.util.ArrayList r14 = r13.l
            boolean r11 = r14.contains(r11)
            long r14 = r9.j()
            if (r10 == 0) goto Lc3
            if (r11 == 0) goto Lc3
            long r10 = defpackage.s26.b(r12, r4)
            r17 = r1
            long r0 = defpackage.s26.a(r13, r4)
            long r10 = r10 - r14
            int r4 = r13.f
            int r5 = -r4
            r16 = r6
            long r5 = (long) r5
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 < 0) goto L7d
            long r4 = (long) r4
            long r10 = r10 + r4
        L7d:
            long r0 = -r0
            long r0 = r0 - r14
            int r4 = r12.f
            long r4 = (long) r4
            long r0 = r0 - r4
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 < 0) goto L88
            long r0 = r0 - r4
        L88:
            l21 r4 = r9.b
            if (r2 != 0) goto L8f
            float r4 = r4.e0
            goto L9a
        L8f:
            r5 = 1
            if (r2 != r5) goto L95
            float r4 = r4.f0
            goto L9a
        L95:
            r4.getClass()
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
        L9a:
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 <= 0) goto Laa
            float r0 = (float) r0
            float r0 = r0 / r4
            float r1 = (float) r10
            float r5 = r6 - r4
            float r1 = r1 / r5
            float r1 = r1 + r0
            long r0 = (long) r1
            goto Lac
        Laa:
            r0 = 0
        Lac:
            float r0 = (float) r0
            float r1 = r0 * r4
            r5 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r5
            long r9 = (long) r1
            float r0 = defpackage.i61.a(r6, r4, r0, r5)
            long r0 = (long) r0
            long r9 = r9 + r14
            long r9 = r9 + r0
            int r0 = r12.f
            long r0 = (long) r0
            long r0 = r0 + r9
            int r4 = r13.f
            long r4 = (long) r4
            long r0 = r0 - r4
            goto Lfa
        Lc3:
            r17 = r1
            r16 = r6
            if (r10 == 0) goto Ld9
            int r0 = r12.f
            long r0 = (long) r0
            long r0 = defpackage.s26.b(r12, r0)
            int r4 = r12.f
            long r4 = (long) r4
            long r4 = r4 + r14
            long r0 = java.lang.Math.max(r0, r4)
            goto Lfa
        Ld9:
            if (r11 == 0) goto Led
            int r0 = r13.f
            long r0 = (long) r0
            long r0 = defpackage.s26.a(r13, r0)
            int r4 = r13.f
            int r4 = -r4
            long r4 = (long) r4
            long r4 = r4 + r14
            long r0 = -r0
            long r0 = java.lang.Math.max(r0, r4)
            goto Lfa
        Led:
            int r0 = r12.f
            long r0 = (long) r0
            long r4 = r9.j()
            long r4 = r4 + r0
            int r0 = r13.f
            long r0 = (long) r0
            long r0 = r4 - r0
        Lfa:
            long r7 = java.lang.Math.max(r7, r0)
            int r6 = r16 + 1
            r1 = r17
            r0 = r18
            r4 = 0
            goto L12
        L108:
            int r0 = (int) r7
            return r0
    }

    public void g(defpackage.ct7 r9, int r10, java.util.ArrayList r11) {
            r8 = this;
            ci1 r0 = r9.h
            ci1 r1 = r9.i
            java.util.ArrayList r0 = r0.k
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        Lc:
            r5 = 0
            if (r4 >= r2) goto L2d
            java.lang.Object r6 = r0.get(r4)
            int r4 = r4 + 1
            xh1 r6 = (defpackage.xh1) r6
            boolean r7 = r6 instanceof defpackage.ci1
            if (r7 == 0) goto L21
            ci1 r6 = (defpackage.ci1) r6
            r8.b(r6, r10, r11, r5)
            goto Lc
        L21:
            boolean r7 = r6 instanceof defpackage.ct7
            if (r7 == 0) goto Lc
            ct7 r6 = (defpackage.ct7) r6
            ci1 r6 = r6.h
            r8.b(r6, r10, r11, r5)
            goto Lc
        L2d:
            java.util.ArrayList r0 = r1.k
            int r1 = r0.size()
            r2 = r3
        L34:
            if (r2 >= r1) goto L54
            java.lang.Object r4 = r0.get(r2)
            int r2 = r2 + 1
            xh1 r4 = (defpackage.xh1) r4
            boolean r6 = r4 instanceof defpackage.ci1
            if (r6 == 0) goto L48
            ci1 r4 = (defpackage.ci1) r4
            r8.b(r4, r10, r11, r5)
            goto L34
        L48:
            boolean r6 = r4 instanceof defpackage.ct7
            if (r6 == 0) goto L34
            ct7 r4 = (defpackage.ct7) r4
            ci1 r4 = r4.i
            r8.b(r4, r10, r11, r5)
            goto L34
        L54:
            r0 = 1
            if (r10 != r0) goto L75
            lm7 r9 = (defpackage.lm7) r9
            ci1 r9 = r9.k
            java.util.ArrayList r9 = r9.k
            int r0 = r9.size()
        L61:
            if (r3 >= r0) goto L75
            java.lang.Object r1 = r9.get(r3)
            int r3 = r3 + 1
            xh1 r1 = (defpackage.xh1) r1
            boolean r2 = r1 instanceof defpackage.ci1
            if (r2 == 0) goto L61
            ci1 r1 = (defpackage.ci1) r1
            r8.b(r1, r10, r11, r5)
            goto L61
        L75:
            return
    }

    public void h(defpackage.l21 r2, defpackage.k21 r3, int r4, defpackage.k21 r5, int r6) {
            r1 = this;
            java.lang.Object r0 = r1.i
            e30 r0 = (defpackage.e30) r0
            r0.a = r3
            r0.b = r5
            r0.c = r4
            r0.d = r6
            java.lang.Object r1 = r1.h
            p11 r1 = (defpackage.p11) r1
            r1.b(r2, r0)
            int r1 = r0.e
            r2.P(r1)
            int r1 = r0.f
            r2.M(r1)
            boolean r1 = r0.h
            r2.E = r1
            int r1 = r0.g
            r2.J(r1)
            return
    }

    public void i() {
            r15 = this;
            java.lang.Object r0 = r15.d
            m21 r0 = (defpackage.m21) r0
            java.util.ArrayList r0 = r0.t0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto Lc4
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            r6 = r4
            l21 r6 = (defpackage.l21) r6
            boolean r4 = r6.a
            if (r4 == 0) goto L1c
            goto Lc
        L1c:
            k21[] r4 = r6.T
            r11 = r4[r2]
            r12 = 1
            r4 = r4[r12]
            int r5 = r6.r
            int r7 = r6.s
            k21 r9 = defpackage.k21.WRAP_CONTENT
            if (r11 == r9) goto L34
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r11 != r8) goto L32
            if (r5 != r12) goto L32
            goto L34
        L32:
            r5 = r2
            goto L35
        L34:
            r5 = r12
        L35:
            if (r4 == r9) goto L40
            k21 r8 = defpackage.k21.MATCH_CONSTRAINT
            if (r4 != r8) goto L3e
            if (r7 != r12) goto L3e
            goto L40
        L3e:
            r7 = r2
            goto L41
        L40:
            r7 = r12
        L41:
            ly2 r8 = r6.d
            rj1 r8 = r8.e
            boolean r10 = r8.j
            lm7 r13 = r6.e
            rj1 r13 = r13.e
            boolean r14 = r13.j
            if (r10 == 0) goto L5f
            if (r14 == 0) goto L5f
            k21 r7 = defpackage.k21.FIXED
            int r8 = r8.g
            int r10 = r13.g
            r9 = r7
            r5 = r15
            r5.h(r6, r7, r8, r9, r10)
            r6.a = r12
            goto Lb2
        L5f:
            if (r10 == 0) goto L89
            if (r7 == 0) goto L89
            k21 r7 = defpackage.k21.FIXED
            int r8 = r8.g
            int r10 = r13.g
            r5 = r15
            r5.h(r6, r7, r8, r9, r10)
            k21 r5 = defpackage.k21.MATCH_CONSTRAINT
            lm7 r7 = r6.e
            if (r4 != r5) goto L7d
            rj1 r4 = r7.e
            int r5 = r6.l()
            r4.m = r5
        L7b:
            r5 = r15
            goto Lb2
        L7d:
            rj1 r4 = r7.e
            int r5 = r6.l()
            r4.d(r5)
            r6.a = r12
            goto L7b
        L89:
            r7 = r9
            if (r14 == 0) goto L7b
            if (r5 == 0) goto L7b
            int r8 = r8.g
            k21 r9 = defpackage.k21.FIXED
            int r10 = r13.g
            r5 = r15
            r5.h(r6, r7, r8, r9, r10)
            k21 r15 = defpackage.k21.MATCH_CONSTRAINT
            ly2 r4 = r6.d
            if (r11 != r15) goto La7
            rj1 r15 = r4.e
            int r4 = r6.r()
            r15.m = r4
            goto Lb2
        La7:
            rj1 r15 = r4.e
            int r4 = r6.r()
            r15.d(r4)
            r6.a = r12
        Lb2:
            boolean r15 = r6.a
            if (r15 == 0) goto Lc1
            lm7 r15 = r6.e
            w20 r15 = r15.l
            if (r15 == 0) goto Lc1
            int r4 = r6.b0
            r15.d(r4)
        Lc1:
            r15 = r5
            goto Lc
        Lc4:
            return
    }

    public void j(defpackage.e36 r9) {
            r8 = this;
            java.lang.Object r0 = r8.e
            ts1 r0 = (defpackage.ts1) r0
            r9.getClass()
            java.lang.String r1 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            j36 r1 = r9.i0(r1)
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L20
            r3 = 0
            if (r2 == 0) goto L22
            long r4 = r1.getLong(r3)     // Catch: java.lang.Throwable -> L20
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L22
            r3 = 1
            goto L22
        L20:
            r8 = move-exception
            goto L69
        L22:
            r2 = 0
            defpackage.lb4.p(r1, r2)
            r0.a(r9)
            if (r3 != 0) goto L3e
            g60 r1 = r0.v(r9)
            boolean r2 = r1.A
            if (r2 == 0) goto L34
            goto L3e
        L34:
            java.lang.Object r8 = r1.B
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "Pre-packaged database has an invalid schema: "
            defpackage.u34.B(r8, r9)
            return
        L3e:
            r8.m(r9)
            r0.r(r9)
            java.lang.Object r8 = r8.f
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r8 = r8.iterator()
        L4c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L68
            java.lang.Object r0 = r8.next()
            k16 r0 = (defpackage.k16) r0
            r0.getClass()
            boolean r1 = r9 instanceof defpackage.mu6
            if (r1 == 0) goto L4c
            r1 = r9
            mu6 r1 = (defpackage.mu6) r1
            vm2 r1 = r1.A
            r0.a(r1)
            goto L4c
        L68:
            return
        L69:
            throw r8     // Catch: java.lang.Throwable -> L6a
        L6a:
            r9 = move-exception
            defpackage.lb4.p(r1, r8)
            throw r9
    }

    public void k(defpackage.e36 r17, int r18, int r19) {
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            java.lang.Object r4 = r0.e
            ts1 r4 = (defpackage.ts1) r4
            r1.getClass()
            java.lang.Object r5 = r0.d
            bc1 r5 = (defpackage.bc1) r5
            wb1 r6 = r5.d
            r6.getClass()
            r8 = 0
            r9 = 1
            if (r2 != r3) goto L20
            yt1 r6 = defpackage.yt1.A
            goto La7
        L20:
            if (r3 <= r2) goto L24
            r10 = r9
            goto L25
        L24:
            r10 = r8
        L25:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r12 = r2
        L2b:
            if (r10 == 0) goto L30
            if (r12 >= r3) goto La6
            goto L32
        L30:
            if (r12 <= r3) goto La6
        L32:
            java.util.LinkedHashMap r13 = r6.b
            if (r10 == 0) goto L4e
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r13.get(r14)
            java.util.TreeMap r13 = (java.util.TreeMap) r13
            if (r13 != 0) goto L44
        L42:
            r15 = 0
            goto L64
        L44:
            java.util.NavigableSet r14 = r13.descendingKeySet()
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
            goto L64
        L4e:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Object r13 = r13.get(r14)
            java.util.TreeMap r13 = (java.util.TreeMap) r13
            if (r13 != 0) goto L5b
            goto L42
        L5b:
            java.util.Set r14 = r13.keySet()
            vr4 r15 = new vr4
            r15.<init>(r13, r14)
        L64:
            if (r15 != 0) goto L67
            goto La4
        L67:
            java.lang.Object r13 = r15.A
            java.util.Map r13 = (java.util.Map) r13
            java.lang.Object r14 = r15.B
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L73:
            boolean r15 = r14.hasNext()
            if (r15 == 0) goto La1
            java.lang.Object r15 = r14.next()
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r10 == 0) goto L8c
            int r7 = r12 + 1
            if (r7 > r15) goto L73
            if (r15 > r3) goto L73
            goto L90
        L8c:
            if (r3 > r15) goto L73
            if (r15 >= r12) goto L73
        L90:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
            java.lang.Object r7 = r13.get(r7)
            r7.getClass()
            r11.add(r7)
            r7 = r9
            r12 = r15
            goto La2
        La1:
            r7 = r8
        La2:
            if (r7 != 0) goto L2b
        La4:
            r6 = 0
            goto La7
        La6:
            r6 = r11
        La7:
            if (r6 == 0) goto Ld9
            r4.u(r1)
            java.util.Iterator r2 = r6.iterator()
        Lb0:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc0
            java.lang.Object r3 = r2.next()
            i64 r3 = (defpackage.i64) r3
            r3.b(r1)
            goto Lb0
        Lc0:
            g60 r2 = r4.v(r1)
            boolean r3 = r2.A
            if (r3 == 0) goto Lcf
            r4.t(r1)
            r16.m(r17)
            return
        Lcf:
            java.lang.Object r0 = r2.B
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "Migration didn't properly handle: "
            defpackage.u34.B(r0, r1)
            return
        Ld9:
            r5.getClass()
            if (r2 <= r3) goto Le4
            boolean r6 = r5.k
            if (r6 == 0) goto Le4
        Le2:
            r6 = r8
            goto Lf7
        Le4:
            java.util.Set r6 = r5.l
            boolean r7 = r5.j
            if (r7 == 0) goto Le2
            if (r6 == 0) goto Lf6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
            boolean r6 = r6.contains(r7)
            if (r6 != 0) goto Le2
        Lf6:
            r6 = r9
        Lf7:
            if (r6 != 0) goto L1c2
            boolean r2 = r5.o
            if (r2 == 0) goto L197
            java.lang.String r2 = "SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"
            j36 r2 = r1.i0(r2)
            kw3 r3 = defpackage.hf.I()     // Catch: java.lang.Throwable -> L139
        L107:
            boolean r5 = r2.f0()     // Catch: java.lang.Throwable -> L139
            if (r5 == 0) goto L13c
            java.lang.String r5 = r2.R(r8)     // Catch: java.lang.Throwable -> L139
            java.lang.String r6 = "sqlite_"
            boolean r6 = defpackage.xs6.g0(r5, r6, r8)     // Catch: java.lang.Throwable -> L139
            if (r6 != 0) goto L107
            java.lang.String r6 = "android_metadata"
            boolean r6 = r5.equals(r6)     // Catch: java.lang.Throwable -> L139
            if (r6 == 0) goto L122
            goto L107
        L122:
            java.lang.String r6 = r2.R(r9)     // Catch: java.lang.Throwable -> L139
            java.lang.String r7 = "view"
            boolean r6 = defpackage.nb3.k(r6, r7)     // Catch: java.lang.Throwable -> L139
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch: java.lang.Throwable -> L139
            vr4 r7 = new vr4     // Catch: java.lang.Throwable -> L139
            r7.<init>(r5, r6)     // Catch: java.lang.Throwable -> L139
            r3.add(r7)     // Catch: java.lang.Throwable -> L139
            goto L107
        L139:
            r0 = move-exception
            r1 = r0
            goto L191
        L13c:
            kw3 r3 = defpackage.hf.A(r3)     // Catch: java.lang.Throwable -> L139
            r5 = 0
            defpackage.lb4.p(r2, r5)
            java.util.ListIterator r2 = r3.listIterator(r8)
        L148:
            r3 = r2
            xx2 r3 = (defpackage.xx2) r3
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L19a
            java.lang.Object r3 = r3.next()
            vr4 r3 = (defpackage.vr4) r3
            java.lang.Object r5 = r3.A
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.B
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r6 = 96
            if (r3 == 0) goto L17c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP VIEW IF EXISTS `"
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            defpackage.ii2.s(r1, r3)
            goto L148
        L17c:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r7 = "DROP TABLE IF EXISTS `"
            r3.<init>(r7)
            r3.append(r5)
            r3.append(r6)
            java.lang.String r3 = r3.toString()
            defpackage.ii2.s(r1, r3)
            goto L148
        L191:
            throw r1     // Catch: java.lang.Throwable -> L192
        L192:
            r0 = move-exception
            defpackage.lb4.p(r2, r1)
            throw r0
        L197:
            r4.c(r1)
        L19a:
            java.lang.Object r0 = r0.f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        L1a2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1be
            java.lang.Object r2 = r0.next()
            k16 r2 = (defpackage.k16) r2
            r2.getClass()
            boolean r2 = r1 instanceof defpackage.mu6
            if (r2 == 0) goto L1a2
            r2 = r1
            mu6 r2 = (defpackage.mu6) r2
            vm2 r2 = r2.A
            r2.getClass()
            goto L1a2
        L1be:
            r4.a(r1)
            return
        L1c2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "A migration from "
            r1.<init>(r4)
            r1.append(r2)
            java.lang.String r2 = " to "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public void l(defpackage.e36 r11) {
            r10 = this;
            r11.getClass()
            java.lang.Object r0 = r10.e
            ts1 r0 = (defpackage.ts1) r0
            java.lang.String r1 = "Pre-packaged database has an invalid schema: "
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'"
            j36 r2 = r11.i0(r2)
            boolean r3 = r2.f0()     // Catch: java.lang.Throwable -> L23
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L26
            long r6 = r2.getLong(r5)     // Catch: java.lang.Throwable -> L23
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L26
            r3 = r4
            goto L27
        L23:
            r10 = move-exception
            goto Lff
        L26:
            r3 = r5
        L27:
            r6 = 0
            defpackage.lb4.p(r2, r6)
            if (r3 == 0) goto L84
            java.lang.String r1 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            j36 r1 = r11.i0(r1)
            boolean r2 = r1.f0()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L40
            java.lang.String r2 = r1.R(r5)     // Catch: java.lang.Throwable -> L3e
            goto L41
        L3e:
            r10 = move-exception
            goto L7e
        L40:
            r2 = r6
        L41:
            defpackage.lb4.p(r1, r6)
            java.lang.Object r1 = r0.b
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto Lcf
            java.lang.Object r1 = r0.c
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L5a
            goto Lcf
        L5a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.Object r11 = r0.b
            java.lang.String r11 = (java.lang.String) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r11 = ", found: "
            r0.append(r11)
            r0.append(r2)
            java.lang.String r11 = r0.toString()
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L7e:
            throw r10     // Catch: java.lang.Throwable -> L7f
        L7f:
            r11 = move-exception
            defpackage.lb4.p(r1, r10)
            throw r11
        L84:
            java.lang.String r2 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.ii2.s(r11, r2)
            g60 r2 = r0.v(r11)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = r2.A     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L9c
            r0.t(r11)     // Catch: java.lang.Throwable -> L9a
            r10.m(r11)     // Catch: java.lang.Throwable -> L9a
            jg7 r1 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L9a
            goto Lbc
        L9a:
            r1 = move-exception
            goto Lb6
        L9c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L9a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9a
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r1 = r2.B     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L9a
            r5.append(r1)     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L9a
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L9a
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L9a
            throw r3     // Catch: java.lang.Throwable -> L9a
        Lb6:
            em5 r2 = new em5
            r2.<init>(r1)
            r1 = r2
        Lbc:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 != 0) goto Lc9
            r2 = r1
            jg7 r2 = (defpackage.jg7) r2
            java.lang.String r2 = "END TRANSACTION"
            defpackage.ii2.s(r11, r2)
        Lc9:
            java.lang.Throwable r1 = defpackage.hm5.a(r1)
            if (r1 != 0) goto Lf9
        Lcf:
            r0.s(r11)
            java.lang.Object r0 = r10.f
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r0 = r0.iterator()
        Lda:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lf6
            java.lang.Object r1 = r0.next()
            k16 r1 = (defpackage.k16) r1
            r1.getClass()
            boolean r2 = r11 instanceof defpackage.mu6
            if (r2 == 0) goto Lda
            r2 = r11
            mu6 r2 = (defpackage.mu6) r2
            vm2 r2 = r2.A
            r1.b(r2)
            goto Lda
        Lf6:
            r10.b = r4
            return
        Lf9:
            java.lang.String r10 = "ROLLBACK TRANSACTION"
            defpackage.ii2.s(r11, r10)
            throw r1
        Lff:
            throw r10     // Catch: java.lang.Throwable -> L100
        L100:
            r11 = move-exception
            defpackage.lb4.p(r2, r10)
            throw r11
    }

    public void m(defpackage.e36 r3) {
            r2 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            defpackage.ii2.s(r3, r0)
            java.lang.Object r2 = r2.e
            ts1 r2 = (defpackage.ts1) r2
            java.lang.Object r2 = r2.b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = "')"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            defpackage.ii2.s(r3, r2)
            return
    }

    public java.lang.String toString() {
            r11 = this;
            int r0 = r11.a
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r11 = super.toString()
            return r11
        La:
            java.lang.Object r0 = r11.i
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r1 = r11.h
            java.lang.Long r1 = (java.lang.Long) r1
            java.lang.Object r2 = r11.g
            java.lang.Long r2 = (java.lang.Long) r2
            java.lang.Object r3 = r11.f
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r4 = r11.e
            java.lang.Long r4 = (java.lang.Long) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r6 = r11.b
            if (r6 == 0) goto L2c
            java.lang.String r6 = "isRegularFile"
            r5.add(r6)
        L2c:
            boolean r11 = r11.c
            if (r11 == 0) goto L35
            java.lang.String r11 = "isDirectory"
            r5.add(r11)
        L35:
            if (r4 == 0) goto L4c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r6 = "byteCount="
            r11.<init>(r6)
            long r6 = r4.longValue()
            r11.append(r6)
            java.lang.String r11 = r11.toString()
            r5.add(r11)
        L4c:
            if (r3 == 0) goto L63
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r4 = "createdAt="
            r11.<init>(r4)
            long r3 = r3.longValue()
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r5.add(r11)
        L63:
            if (r2 == 0) goto L7a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r3 = "lastModifiedAt="
            r11.<init>(r3)
            long r2 = r2.longValue()
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            r5.add(r11)
        L7a:
            if (r1 == 0) goto L91
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r2 = "lastAccessedAt="
            r11.<init>(r2)
            long r1 = r1.longValue()
            r11.append(r1)
            java.lang.String r11 = r11.toString()
            r5.add(r11)
        L91:
            boolean r11 = r0.isEmpty()
            if (r11 != 0) goto La8
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r1 = "extras="
            r11.<init>(r1)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r5.add(r11)
        La8:
            r9 = 0
            r10 = 56
            java.lang.String r6 = ", "
            java.lang.String r7 = "FileMetadata("
            java.lang.String r8 = ")"
            java.lang.String r11 = defpackage.gt0.P0(r5, r6, r7, r8, r9, r10)
            return r11
    }
}
