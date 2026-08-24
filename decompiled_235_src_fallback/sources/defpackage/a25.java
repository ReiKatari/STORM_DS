package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a25  reason: default package */
/* loaded from: classes.dex */
public final class a25 implements defpackage.oq3 {
    public final int a;
    public final defpackage.m44 b;
    public final defpackage.qn2 c;
    public defpackage.q21 d;
    public defpackage.nt6 e;
    public defpackage.fn3 f;
    public boolean g;
    public boolean h;
    public boolean i;
    public java.lang.Object j;
    public boolean k;
    public defpackage.z15 l;
    public boolean m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public final /* synthetic */ defpackage.bk1 r;

    public a25(defpackage.bk1 r1, int r2, defpackage.m44 r3, defpackage.qn2 r4) {
            r0 = this;
            r0.<init>()
            r0.r = r1
            r0.a = r2
            r0.b = r3
            r0.c = r4
            int r1 = defpackage.h74.b
            long r1 = java.lang.System.nanoTime()
            long r3 = defpackage.h74.a
            long r1 = r1 - r3
            r0.p = r1
            return
    }

    @Override // defpackage.oq3
    public final void a() {
            r1 = this;
            r0 = 1
            r1.m = r0
            return
    }

    public final void b() {
            r3 = this;
            fn3 r0 = r3.f
            r1 = 0
            if (r0 == 0) goto L1d
            int r2 = r0.a
            switch(r2) {
                case 0: goto L1d;
                default: goto La;
            }
        La:
            ym3 r2 = r0.b()
            if (r2 == 0) goto L13
            tu4 r2 = r2.f
            goto L14
        L13:
            r2 = r1
        L14:
            if (r2 == 0) goto L1d
            gn3 r2 = r0.b
            java.lang.Object r0 = r0.c
            defpackage.gn3.c(r2, r0)
        L1d:
            r3.f = r1
            nt6 r0 = r3.e
            if (r0 == 0) goto L26
            r0.dispose()
        L26:
            r3.e = r1
            r3.l = r1
            return
    }

    public final boolean c(defpackage.ck r3) {
            r2 = this;
            bk1 r0 = r2.r
            boolean r0 = r0.A
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            boolean r0 = r2.m
            if (r0 == 0) goto L1e
            java.lang.String r0 = "compose:lazy:prefetch:execute:urgent"
            android.os.Trace.beginSection(r0)
            boolean r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L19
            android.os.Trace.endSection()
            goto L22
        L19:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L1e:
            boolean r2 = r2.d(r3)
        L22:
            java.lang.String r3 = "compose:lazy:prefetch:execute:item"
            r0 = -1
            defpackage.lb4.J(r0, r3)
            return r2
    }

    @Override // defpackage.oq3
    public final void cancel() {
            r1 = this;
            boolean r0 = r1.h
            if (r0 != 0) goto La
            r0 = 1
            r1.h = r0
            r1.b()
        La:
            return
    }

    public final boolean d(defpackage.ck r22) {
            r21 = this;
            r0 = r21
            int r1 = r0.a
            long r2 = (long) r1
            java.lang.String r4 = "compose:lazy:prefetch:execute:item"
            defpackage.lb4.J(r2, r4)
            bk1 r5 = r0.r
            java.lang.Object r5 = r5.L
            bq3 r5 = (defpackage.bq3) r5
            f4 r5 = r5.b
            java.lang.Object r5 = r5.c()
            cq3 r5 = (defpackage.cq3) r5
            boolean r6 = r0.h
            r7 = 0
            if (r6 != 0) goto L2fb
            int r6 = r5.a()
            if (r1 < 0) goto L2fb
            if (r1 >= r6) goto L2fb
            java.lang.Object r6 = r5.c(r1)
            java.lang.Object r8 = r0.j
            if (r8 == 0) goto L37
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L37
            r0.b()
            return r7
        L37:
            java.lang.Object r1 = r5.d(r1)
            m44 r5 = r0.b
            java.lang.Object r8 = r5.R
            nz r8 = (defpackage.nz) r8
            java.lang.Object r9 = r5.L
            r10 = -1
            if (r9 != r1) goto L49
            if (r8 == 0) goto L49
            goto L64
        L49:
            java.lang.Object r8 = r5.B
            ja4 r8 = (defpackage.ja4) r8
            java.lang.Object r9 = r8.g(r1)
            if (r9 != 0) goto L5d
            nz r9 = new nz
            r9.<init>()
            r9.e = r10
            r8.m(r1, r9)
        L5d:
            r8 = r9
            nz r8 = (defpackage.nz) r8
            r5.L = r1
            r5.R = r8
        L64:
            r0.e()
            long r11 = r22.a()
            r0.n = r11
            int r5 = defpackage.h74.b
            long r13 = java.lang.System.nanoTime()
            long r15 = defpackage.h74.a
            long r13 = r13 - r15
            r0.p = r13
            r13 = 0
            r0.o = r13
            java.lang.String r5 = "compose:lazy:prefetch:available_time_nanos"
            defpackage.lb4.J(r11, r5)
            boolean r5 = r0.e()
            if (r5 != 0) goto Lb0
            long r11 = r0.n
            r15 = r13
            long r13 = r8.a
            long r9 = r8.b
            long r13 = r13 + r9
            boolean r9 = r0.g(r11, r13)
            if (r9 == 0) goto La6
            java.lang.String r9 = "compose:lazy:prefetch:compose"
            android.os.Trace.beginSection(r9)
            r0.f(r6, r1, r8)     // Catch: java.lang.Throwable -> La1
            android.os.Trace.endSection()
            goto La6
        La1:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        La6:
            boolean r1 = r0.e()
            if (r1 != 0) goto Lb1
        Lac:
            r17 = 1
            goto L2a1
        Lb0:
            r15 = r13
        Lb1:
            fn3 r1 = r0.f
            r6 = 0
            if (r1 == 0) goto L10d
            long r9 = r0.n
            long r11 = r8.c
            boolean r1 = r0.g(r9, r11)
            if (r1 == 0) goto Lac
            java.lang.String r1 = "compose:lazy:prefetch:apply"
            android.os.Trace.beginSection(r1)
            fn3 r1 = r0.f     // Catch: java.lang.Throwable -> L108
            if (r1 == 0) goto L100
            int r9 = r1.a     // Catch: java.lang.Throwable -> L108
            switch(r9) {
                case 0: goto Le0;
                default: goto Lce;
            }     // Catch: java.lang.Throwable -> L108
        Lce:
            gn3 r9 = r1.b     // Catch: java.lang.Throwable -> L108
            ym3 r10 = r1.b()     // Catch: java.lang.Throwable -> L108
            if (r10 == 0) goto Ld9
            r9.d(r10, r7)     // Catch: java.lang.Throwable -> L108
        Ld9:
            java.lang.Object r1 = r1.c     // Catch: java.lang.Throwable -> L108
            nt6 r1 = r9.f(r1)     // Catch: java.lang.Throwable -> L108
            goto Le8
        Le0:
            gn3 r9 = r1.b     // Catch: java.lang.Throwable -> L108
            java.lang.Object r1 = r1.c     // Catch: java.lang.Throwable -> L108
            nt6 r1 = r9.f(r1)     // Catch: java.lang.Throwable -> L108
        Le8:
            r0.e = r1     // Catch: java.lang.Throwable -> L108
            r0.f = r6     // Catch: java.lang.Throwable -> L108
            r1 = 1
            r0.i = r1     // Catch: java.lang.Throwable -> L108
            android.os.Trace.endSection()
            r0.h()
            long r9 = r0.o
            long r11 = r8.c
            long r9 = defpackage.nz.a(r9, r11)
            r8.c = r9
            goto L10d
        L100:
            java.lang.String r0 = "Nothing to apply!"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L108
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L108
            throw r1     // Catch: java.lang.Throwable -> L108
        L108:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L10d:
            boolean r1 = r0.k
            if (r1 != 0) goto L151
            long r9 = r0.n
            int r1 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r1 <= 0) goto Lac
            java.lang.String r1 = "compose:lazy:prefetch:resolve-nested"
            android.os.Trace.beginSection(r1)
            nt6 r1 = r0.e     // Catch: java.lang.Throwable -> L144
            if (r1 == 0) goto L146
            dh5 r9 = new dh5     // Catch: java.lang.Throwable -> L144
            r9.<init>()     // Catch: java.lang.Throwable -> L144
            pc4 r10 = new pc4     // Catch: java.lang.Throwable -> L144
            r11 = 1
            r10.<init>(r11, r9)     // Catch: java.lang.Throwable -> L144
            r1.b(r10)     // Catch: java.lang.Throwable -> L144
            java.lang.Object r1 = r9.A     // Catch: java.lang.Throwable -> L144
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L144
            if (r1 == 0) goto L13a
            z15 r9 = new z15     // Catch: java.lang.Throwable -> L144
            r9.<init>(r0, r1)     // Catch: java.lang.Throwable -> L144
            goto L13b
        L13a:
            r9 = r6
        L13b:
            r0.l = r9     // Catch: java.lang.Throwable -> L144
            r1 = 1
            r0.k = r1     // Catch: java.lang.Throwable -> L144
            android.os.Trace.endSection()
            goto L151
        L144:
            r0 = move-exception
            goto L14d
        L146:
            java.lang.String r0 = "Should precompose before resolving nested prefetch states"
            ug r0 = defpackage.lb1.c(r0)     // Catch: java.lang.Throwable -> L144
            throw r0     // Catch: java.lang.Throwable -> L144
        L14d:
            android.os.Trace.endSection()
            throw r0
        L151:
            z15 r1 = r0.l
            if (r1 == 0) goto L229
            int r9 = r8.e
            boolean r10 = r0.m
            java.util.List[] r11 = r1.b
            int r12 = r1.c
            java.util.List r13 = r1.a
            int r14 = r13.size()
            if (r12 < r14) goto L167
            goto L229
        L167:
            a25 r12 = r1.f
            boolean r12 = r12.h
            if (r12 == 0) goto L172
            java.lang.String r12 = "Should not execute nested prefetch on canceled request"
            defpackage.s53.c(r12)
        L172:
            java.lang.String r12 = "compose:lazy:prefetch:update_nested_prefetch_count"
            android.os.Trace.beginSection(r12)
            int r12 = r13.size()     // Catch: java.lang.Throwable -> L224
            r14 = r7
        L17c:
            if (r14 >= r12) goto L18b
            java.lang.Object r18 = r13.get(r14)     // Catch: java.lang.Throwable -> L224
            r5 = r18
            pq3 r5 = (defpackage.pq3) r5     // Catch: java.lang.Throwable -> L224
            r5.d = r9     // Catch: java.lang.Throwable -> L224
            int r14 = r14 + 1
            goto L17c
        L18b:
            android.os.Trace.endSection()
            java.lang.String r5 = "compose:lazy:prefetch:nested"
            android.os.Trace.beginSection(r5)
        L193:
            int r5 = r1.c     // Catch: java.lang.Throwable -> L21f
            int r9 = r13.size()     // Catch: java.lang.Throwable -> L21f
            if (r5 >= r9) goto L21b
            int r5 = r1.c     // Catch: java.lang.Throwable -> L21f
            r5 = r11[r5]     // Catch: java.lang.Throwable -> L21f
            if (r5 != 0) goto L1d3
            long r19 = r22.a()     // Catch: java.lang.Throwable -> L21f
            int r5 = (r19 > r15 ? 1 : (r19 == r15 ? 0 : -1))
            if (r5 > 0) goto L1af
            android.os.Trace.endSection()
            r17 = 1
            return r17
        L1af:
            int r5 = r1.c     // Catch: java.lang.Throwable -> L21f
            java.lang.Object r9 = r13.get(r5)     // Catch: java.lang.Throwable -> L21f
            pq3 r9 = (defpackage.pq3) r9     // Catch: java.lang.Throwable -> L21f
            qn2 r12 = r9.a     // Catch: java.lang.Throwable -> L21f
            if (r12 != 0) goto L1be
            yt1 r9 = defpackage.yt1.A     // Catch: java.lang.Throwable -> L21f
            goto L1d1
        L1be:
            nq3 r14 = new nq3     // Catch: java.lang.Throwable -> L21f
            int r6 = r9.d     // Catch: java.lang.Throwable -> L21f
            r14.<init>(r9, r6)     // Catch: java.lang.Throwable -> L21f
            r12.g(r14)     // Catch: java.lang.Throwable -> L21f
            java.util.ArrayList r6 = r14.b     // Catch: java.lang.Throwable -> L21f
            int r12 = r6.size()     // Catch: java.lang.Throwable -> L21f
            r9.f = r12     // Catch: java.lang.Throwable -> L21f
            r9 = r6
        L1d1:
            r11[r5] = r9     // Catch: java.lang.Throwable -> L21f
        L1d3:
            int r5 = r1.c     // Catch: java.lang.Throwable -> L21f
            r5 = r11[r5]     // Catch: java.lang.Throwable -> L21f
            r5.getClass()     // Catch: java.lang.Throwable -> L21f
        L1da:
            int r6 = r1.d     // Catch: java.lang.Throwable -> L21f
            int r9 = r5.size()     // Catch: java.lang.Throwable -> L21f
            if (r6 >= r9) goto L20c
            int r6 = r1.d     // Catch: java.lang.Throwable -> L21f
            java.lang.Object r6 = r5.get(r6)     // Catch: java.lang.Throwable -> L21f
            a25 r6 = (defpackage.a25) r6     // Catch: java.lang.Throwable -> L21f
            if (r10 == 0) goto L1f7
            if (r6 == 0) goto L1f0
            r9 = r6
            goto L1f1
        L1f0:
            r9 = 0
        L1f1:
            if (r9 == 0) goto L1f7
            r12 = 1
            r9.m = r12     // Catch: java.lang.Throwable -> L21f
            goto L1f8
        L1f7:
            r12 = 1
        L1f8:
            r1.e = r12     // Catch: java.lang.Throwable -> L21f
            r9 = r22
            boolean r6 = r6.c(r9)     // Catch: java.lang.Throwable -> L21f
            if (r6 == 0) goto L206
            android.os.Trace.endSection()
            return r12
        L206:
            int r6 = r1.d     // Catch: java.lang.Throwable -> L21f
            int r6 = r6 + r12
            r1.d = r6     // Catch: java.lang.Throwable -> L21f
            goto L1da
        L20c:
            r9 = r22
            r1.d = r7     // Catch: java.lang.Throwable -> L21f
            int r5 = r1.c     // Catch: java.lang.Throwable -> L21f
            r17 = 1
            int r5 = r5 + 1
            r1.c = r5     // Catch: java.lang.Throwable -> L21f
            r6 = 0
            goto L193
        L21b:
            android.os.Trace.endSection()
            goto L229
        L21f:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L224:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L229:
            z15 r1 = r0.l
            if (r1 == 0) goto L23e
            boolean r1 = r1.e
            r11 = 1
            if (r1 != r11) goto L23e
            r0.h()
            defpackage.lb4.J(r2, r4)
            z15 r1 = r0.l
            if (r1 == 0) goto L23e
            r1.e = r7
        L23e:
            q21 r1 = r0.d
            boolean r2 = r0.g
            if (r2 != 0) goto L2a2
            if (r1 == 0) goto L2a2
            long r2 = r0.n
            long r4 = r8.d
            boolean r2 = r0.g(r2, r4)
            if (r2 == 0) goto Lac
            java.lang.String r2 = "compose:lazy:prefetch:measure"
            android.os.Trace.beginSection(r2)
            long r1 = r1.a     // Catch: java.lang.Throwable -> L29c
            boolean r3 = r0.h     // Catch: java.lang.Throwable -> L29c
            if (r3 == 0) goto L260
            java.lang.String r3 = "Callers should check whether the request is still valid before calling performMeasure()"
            defpackage.s53.a(r3)     // Catch: java.lang.Throwable -> L29c
        L260:
            boolean r3 = r0.g     // Catch: java.lang.Throwable -> L29c
            if (r3 == 0) goto L269
            java.lang.String r3 = "Request was already measured!"
            defpackage.s53.a(r3)     // Catch: java.lang.Throwable -> L29c
        L269:
            r11 = 1
            r0.g = r11     // Catch: java.lang.Throwable -> L29c
            nt6 r3 = r0.e     // Catch: java.lang.Throwable -> L29c
            if (r3 == 0) goto L295
            int r4 = r3.a()     // Catch: java.lang.Throwable -> L29c
            r5 = r7
        L275:
            if (r5 >= r4) goto L27d
            r3.d(r5, r1)     // Catch: java.lang.Throwable -> L29c
            int r5 = r5 + 1
            goto L275
        L27d:
            android.os.Trace.endSection()
            r0.h()
            long r1 = r0.o
            long r3 = r8.d
            long r1 = defpackage.nz.a(r1, r3)
            r8.d = r1
            qn2 r1 = r0.c
            if (r1 == 0) goto L2a2
            r1.g(r0)
            goto L2a2
        L295:
            java.lang.String r0 = "performComposition() must be called before performMeasure()"
            ug r0 = defpackage.lb1.c(r0)     // Catch: java.lang.Throwable -> L29c
            throw r0     // Catch: java.lang.Throwable -> L29c
        L29c:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        L2a1:
            return r17
        L2a2:
            z15 r1 = r0.l
            boolean r2 = r0.g
            if (r2 == 0) goto L2fa
            boolean r0 = r0.k
            if (r0 == 0) goto L2fa
            if (r1 == 0) goto L2fa
            java.util.List r0 = r1.a
            int r1 = r0.size()
            r2 = 2147483647(0x7fffffff, float:NaN)
            r4 = r2
            r3 = r7
        L2b9:
            if (r3 >= r1) goto L2ca
            java.lang.Object r5 = r0.get(r3)
            pq3 r5 = (defpackage.pq3) r5
            int r5 = r5.e
            int r4 = java.lang.Math.min(r4, r5)
            int r3 = r3 + 1
            goto L2b9
        L2ca:
            if (r4 != r2) goto L2cd
            r4 = r7
        L2cd:
            int r1 = r8.e
            r5 = -1
            if (r1 != r5) goto L2d4
            r1 = r4
            goto L2d9
        L2d4:
            int r1 = r1 * 3
            int r1 = r1 + r4
            int r1 = r1 / 4
        L2d9:
            r8.e = r1
            int r1 = r0.size()
            r5 = r2
            r3 = r7
        L2e1:
            if (r3 >= r1) goto L2f2
            java.lang.Object r6 = r0.get(r3)
            pq3 r6 = (defpackage.pq3) r6
            int r6 = r6.f
            int r5 = java.lang.Math.min(r5, r6)
            int r3 = r3 + 1
            goto L2e1
        L2f2:
            if (r5 != r2) goto L2f5
            r5 = r7
        L2f5:
            if (r5 >= r4) goto L2fa
            r0 = r15
            r8.d = r0
        L2fa:
            return r7
        L2fb:
            r0.b()
            return r7
    }

    public final boolean e() {
            r2 = this;
            boolean r0 = r2.i
            r1 = 1
            if (r0 != 0) goto L12
            fn3 r2 = r2.f
            if (r2 == 0) goto L10
            boolean r2 = r2.c()
            if (r2 != r1) goto L10
            goto L12
        L10:
            r2 = 0
            return r2
        L12:
            return r1
    }

    public final void f(java.lang.Object r6, java.lang.Object r7, defpackage.nz r8) {
            r5 = this;
            fn3 r0 = r5.f
            r1 = 0
            if (r0 != 0) goto L36
            bk1 r0 = r5.r
            java.lang.Object r2 = r0.L
            bq3 r2 = (defpackage.bq3) r2
            int r3 = r5.a
            eo2 r7 = r2.a(r3, r6, r7)
            java.lang.Object r0 = r0.B
            pt6 r0 = (defpackage.pt6) r0
            gn3 r0 = r0.a()
            sm3 r2 = r0.A
            boolean r2 = r2.H()
            if (r2 != 0) goto L28
            fn3 r7 = new fn3
            r7.<init>(r0, r6, r1)
        L26:
            r0 = r7
            goto L32
        L28:
            r2 = 1
            r0.k(r6, r7, r2)
            fn3 r7 = new fn3
            r7.<init>(r0, r6, r2)
            goto L26
        L32:
            r5.f = r0
            r5.j = r6
        L36:
            r5.q = r1
        L38:
            boolean r6 = r0.c()
            if (r6 != 0) goto L7f
            boolean r6 = r5.q
            if (r6 != 0) goto L7f
            pk0 r6 = new pk0
            r7 = 4
            r6.<init>(r7, r5, r8)
            int r7 = r0.a
            switch(r7) {
                case 0: goto L38;
                default: goto L4d;
            }
        L4d:
            ym3 r7 = r0.b()
            r1 = 0
            if (r7 == 0) goto L57
            tu4 r2 = r7.f
            goto L58
        L57:
            r2 = r1
        L58:
            if (r2 == 0) goto L38
            boolean r3 = r2.c()
            if (r3 != 0) goto L38
            vl6 r3 = defpackage.ln2.t()
            if (r3 == 0) goto L6a
            qn2 r1 = r3.e()
        L6a:
            vl6 r4 = defpackage.ln2.N(r3)
            r2.e(r6)     // Catch: java.lang.Throwable -> L75
            defpackage.ln2.V(r3, r4, r1)
            goto L38
        L75:
            r5 = move-exception
            r7.getClass()     // Catch: java.lang.Throwable -> L7a
            throw r5     // Catch: java.lang.Throwable -> L7a
        L7a:
            r5 = move-exception
            defpackage.ln2.V(r3, r4, r1)
            throw r5
        L7f:
            r5.h()
            boolean r6 = r5.q
            long r0 = r5.o
            if (r6 == 0) goto L91
            long r5 = r8.b
            long r5 = defpackage.nz.a(r0, r5)
            r8.b = r5
            return
        L91:
            long r5 = r8.a
            long r5 = defpackage.nz.a(r0, r5)
            r8.a = r5
            return
    }

    public final boolean g(long r1, long r3) {
            r0 = this;
            boolean r0 = r0.m
            if (r0 == 0) goto L6
            r3 = 0
        L6:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final void h() {
            r16 = this;
            r0 = r16
            int r1 = defpackage.h74.b
            long r1 = java.lang.System.nanoTime()
            long r3 = defpackage.h74.a
            long r1 = r1 - r3
            long r3 = r0.p
            uq1 r5 = defpackage.uq1.NANOSECONDS
            r5.getClass()
            r6 = 1
            long r8 = r3 - r6
            long r8 = r8 | r6
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            r12 = 0
            if (r8 != 0) goto L38
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L2a
            jd1 r3 = defpackage.oq1.B
            goto L97
        L2a:
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L31
            long r3 = defpackage.oq1.R
            goto L33
        L31:
            long r3 = defpackage.oq1.L
        L33:
            long r12 = defpackage.oq1.m(r3)
            goto L97
        L38:
            long r8 = r1 - r6
            long r8 = r8 | r6
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 != 0) goto L4a
            int r3 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r3 >= 0) goto L47
            long r3 = defpackage.oq1.R
        L45:
            r12 = r3
            goto L97
        L47:
            long r3 = defpackage.oq1.L
            goto L45
        L4a:
            long r8 = r1 - r3
            long r14 = r8 ^ r1
            long r10 = r8 ^ r3
            long r10 = ~r10
            long r10 = r10 & r14
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L93
            uq1 r10 = defpackage.uq1.MILLISECONDS
            int r11 = r5.compareTo(r10)
            if (r11 >= 0) goto L85
            r10.getClass()
            java.util.concurrent.TimeUnit r8 = r5.getTimeUnit$kotlin_stdlib()
            java.util.concurrent.TimeUnit r9 = r10.getTimeUnit$kotlin_stdlib()
            long r6 = r8.convert(r6, r9)
            long r8 = r1 / r6
            long r11 = r3 / r6
            long r8 = r8 - r11
            long r11 = r1 % r6
            long r3 = r3 % r6
            long r11 = r11 - r3
            jd1 r3 = defpackage.oq1.B
            long r3 = defpackage.n16.M(r8, r10)
            long r5 = defpackage.n16.M(r11, r5)
            long r12 = defpackage.oq1.j(r3, r5)
            goto L97
        L85:
            int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r3 >= 0) goto L8c
            long r3 = defpackage.oq1.R
            goto L8e
        L8c:
            long r3 = defpackage.oq1.L
        L8e:
            long r12 = defpackage.oq1.m(r3)
            goto L97
        L93:
            long r12 = defpackage.n16.M(r8, r5)
        L97:
            r3 = 1
            long r4 = r12 >> r3
            jd1 r6 = defpackage.oq1.B
            int r6 = (int) r12
            r3 = r3 & r6
            if (r3 != 0) goto La2
            r10 = r4
            goto Lc2
        La2:
            r6 = 9223372036854(0x8637bd05af6, double:4.5569512622224E-311)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 <= 0) goto Lb1
            r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto Lc2
        Lb1:
            r6 = -9223372036854(0xfffff79c842fa50a, double:NaN)
            int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r3 >= 0) goto Lbd
            r10 = -9223372036854775808
            goto Lc2
        Lbd:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            long r10 = r4 * r6
        Lc2:
            r0.o = r10
            long r3 = r0.n
            long r3 = r3 - r10
            r0.n = r3
            r0.p = r1
            java.lang.String r0 = "compose:lazy:prefetch:available_time_nanos"
            defpackage.lb4.J(r3, r0)
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "HandleAndRequestImpl { index = "
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", constraints = "
            r0.append(r1)
            q21 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", isComposed = "
            r0.append(r1)
            boolean r1 = r2.e()
            r0.append(r1)
            java.lang.String r1 = ", isMeasured = "
            r0.append(r1)
            boolean r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", isCanceled = "
            r0.append(r1)
            boolean r2 = r2.h
            java.lang.String r1 = " }"
            java.lang.String r2 = defpackage.i61.o(r0, r2, r1)
            return r2
    }
}
