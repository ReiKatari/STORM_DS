package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ii1  reason: default package */
/* loaded from: classes.dex */
public final class ii1 extends defpackage.fq6 implements defpackage.pp6 {
    public final defpackage.on2 B;
    public final defpackage.im6 L;
    public defpackage.hi1 R;

    public ii1(defpackage.on2 r3, defpackage.im6 r4) {
            r2 = this;
            r2.<init>()
            r2.B = r3
            r2.L = r4
            hi1 r3 = new hi1
            vl6 r4 = defpackage.bm6.j()
            long r0 = r4.g()
            r3.<init>(r0)
            r2.R = r3
            return
    }

    @Override // defpackage.eq6
    public final defpackage.hq6 a() {
            r0 = this;
            hi1 r0 = r0.R
            return r0
    }

    @Override // defpackage.eq6
    public final void f(defpackage.hq6 r1) {
            r0 = this;
            r1.getClass()
            hi1 r1 = (defpackage.hi1) r1
            r0.R = r1
            return
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r4 = this;
            vl6 r0 = defpackage.bm6.j()
            qn2 r0 = r0.e()
            if (r0 == 0) goto Ld
            r0.g(r4)
        Ld:
            vl6 r0 = defpackage.bm6.j()
            hi1 r1 = r4.R
            hq6 r1 = defpackage.bm6.i(r1, r0)
            hi1 r1 = (defpackage.hi1) r1
            r2 = 1
            on2 r3 = r4.B
            hi1 r4 = r4.h(r1, r0, r2, r3)
            java.lang.Object r4 = r4.f
            return r4
    }

    public final defpackage.hi1 h(defpackage.hi1 r21, defpackage.vl6 r22, boolean r23, defpackage.on2 r24) {
            r20 = this;
            r1 = r20
            r6 = r21
            r0 = r22
            boolean r2 = r6.c(r1, r0)
            if (r2 == 0) goto Lc2
            if (r23 == 0) goto Lc1
            ua4 r1 = defpackage.np2.H()
            java.lang.Object[] r2 = r1.A
            int r3 = r1.L
            r4 = 0
        L17:
            if (r4 >= r3) goto L23
            r5 = r2[r4]
            wq2 r5 = (defpackage.wq2) r5
            r5.b()
            int r4 = r4 + 1
            goto L17
        L23:
            y94 r2 = r6.e     // Catch: java.lang.Throwable -> L38
            m44 r3 = defpackage.jm6.a     // Catch: java.lang.Throwable -> L38
            java.lang.Object r4 = r3.f()     // Catch: java.lang.Throwable -> L38
            n93 r4 = (defpackage.n93) r4     // Catch: java.lang.Throwable -> L38
            if (r4 != 0) goto L3b
            n93 r4 = new n93     // Catch: java.lang.Throwable -> L38
            r4.<init>()     // Catch: java.lang.Throwable -> L38
            r3.F(r4)     // Catch: java.lang.Throwable -> L38
            goto L3b
        L38:
            r0 = move-exception
            goto Laf
        L3b:
            int r3 = r4.a     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r5 = r2.b     // Catch: java.lang.Throwable -> L38
            int[] r8 = r2.c     // Catch: java.lang.Throwable -> L38
            long[] r2 = r2.a     // Catch: java.lang.Throwable -> L38
            int r9 = r2.length     // Catch: java.lang.Throwable -> L38
            int r9 = r9 + (-2)
            if (r9 < 0) goto L9c
            r10 = 0
        L49:
            r11 = r2[r10]     // Catch: java.lang.Throwable -> L38
            long r13 = ~r11     // Catch: java.lang.Throwable -> L38
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L97
            int r13 = r10 - r9
            int r13 = ~r13     // Catch: java.lang.Throwable -> L38
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L63:
            if (r15 >= r13) goto L94
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L8b
            int r16 = r10 << 3
            int r16 = r16 + r15
            r17 = r5[r16]     // Catch: java.lang.Throwable -> L38
            r16 = r8[r16]     // Catch: java.lang.Throwable -> L38
            r7 = r17
            eq6 r7 = (defpackage.eq6) r7     // Catch: java.lang.Throwable -> L38
            r20 = r14
            int r14 = r3 + r16
            r4.a = r14     // Catch: java.lang.Throwable -> L38
            qn2 r14 = r0.e()     // Catch: java.lang.Throwable -> L38
            if (r14 == 0) goto L8d
            r14.g(r7)     // Catch: java.lang.Throwable -> L38
            goto L8d
        L8b:
            r20 = r14
        L8d:
            long r11 = r11 >> r20
            int r15 = r15 + 1
            r14 = r20
            goto L63
        L94:
            r7 = r14
            if (r13 != r7) goto L9c
        L97:
            if (r10 == r9) goto L9c
            int r10 = r10 + 1
            goto L49
        L9c:
            r4.a = r3     // Catch: java.lang.Throwable -> L38
            java.lang.Object[] r0 = r1.A
            int r1 = r1.L
            r7 = 0
        La3:
            if (r7 >= r1) goto Lc1
            r2 = r0[r7]
            wq2 r2 = (defpackage.wq2) r2
            r2.a()
            int r7 = r7 + 1
            goto La3
        Laf:
            java.lang.Object[] r2 = r1.A
            int r1 = r1.L
            r7 = 0
        Lb4:
            if (r7 >= r1) goto Lc0
            r3 = r2[r7]
            wq2 r3 = (defpackage.wq2) r3
            r3.a()
            int r7 = r7 + 1
            goto Lb4
        Lc0:
            throw r0
        Lc1:
            return r6
        Lc2:
            y94 r3 = new y94
            r3.<init>()
            m44 r0 = defpackage.jm6.a
            java.lang.Object r2 = r0.f()
            n93 r2 = (defpackage.n93) r2
            if (r2 != 0) goto Ld9
            n93 r2 = new n93
            r2.<init>()
            r0.F(r2)
        Ld9:
            int r4 = r2.a
            ua4 r7 = defpackage.np2.H()
            java.lang.Object[] r0 = r7.A
            int r5 = r7.L
            r8 = 0
        Le4:
            if (r8 >= r5) goto Lf0
            r9 = r0[r8]
            wq2 r9 = (defpackage.wq2) r9
            r9.b()
            int r8 = r8 + 1
            goto Le4
        Lf0:
            int r0 = r4 + 1
            r2.a = r0     // Catch: java.lang.Throwable -> L187
            gi1 r0 = new gi1     // Catch: java.lang.Throwable -> L187
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L187
            r5 = r24
            java.lang.Object r0 = defpackage.ln2.Q(r0, r5)     // Catch: java.lang.Throwable -> L187
            r2.a = r4     // Catch: java.lang.Throwable -> L187
            java.lang.Object[] r2 = r7.A
            int r4 = r7.L
            r7 = 0
        L107:
            if (r7 >= r4) goto L113
            r5 = r2[r7]
            wq2 r5 = (defpackage.wq2) r5
            r5.a()
            int r7 = r7 + 1
            goto L107
        L113:
            java.lang.Object r2 = defpackage.bm6.c
            monitor-enter(r2)
            vl6 r4 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L135
            java.lang.Object r5 = r6.f     // Catch: java.lang.Throwable -> L135
            java.lang.Object r7 = defpackage.hi1.h     // Catch: java.lang.Throwable -> L135
            if (r5 == r7) goto L137
            im6 r7 = r1.L     // Catch: java.lang.Throwable -> L135
            if (r7 == 0) goto L137
            boolean r5 = r7.i(r0, r5)     // Catch: java.lang.Throwable -> L135
            r7 = 1
            if (r5 != r7) goto L137
            r6.e = r3     // Catch: java.lang.Throwable -> L135
            int r0 = r6.d(r1, r4)     // Catch: java.lang.Throwable -> L135
            r6.g = r0     // Catch: java.lang.Throwable -> L135
            r5 = r6
            goto L155
        L135:
            r0 = move-exception
            goto L185
        L137:
            hi1 r5 = r1.R     // Catch: java.lang.Throwable -> L135
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L135
            hq6 r6 = defpackage.bm6.m(r5, r1)     // Catch: java.lang.Throwable -> L182
            r6.a(r5)     // Catch: java.lang.Throwable -> L182
            long r7 = r4.g()     // Catch: java.lang.Throwable -> L182
            r6.a = r7     // Catch: java.lang.Throwable -> L182
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L135
            r5 = r6
            hi1 r5 = (defpackage.hi1) r5     // Catch: java.lang.Throwable -> L135
            r5.e = r3     // Catch: java.lang.Throwable -> L135
            int r1 = r5.d(r1, r4)     // Catch: java.lang.Throwable -> L135
            r5.g = r1     // Catch: java.lang.Throwable -> L135
            r5.f = r0     // Catch: java.lang.Throwable -> L135
        L155:
            monitor-exit(r2)
            m44 r0 = defpackage.jm6.a
            java.lang.Object r0 = r0.f()
            n93 r0 = (defpackage.n93) r0
            if (r0 == 0) goto L181
            int r0 = r0.a
            if (r0 != 0) goto L181
            vl6 r0 = defpackage.bm6.j()
            r0.m()
            monitor-enter(r2)
            vl6 r0 = defpackage.bm6.j()     // Catch: java.lang.Throwable -> L17e
            long r3 = r0.g()     // Catch: java.lang.Throwable -> L17e
            r5.c = r3     // Catch: java.lang.Throwable -> L17e
            int r0 = r0.h()     // Catch: java.lang.Throwable -> L17e
            r5.d = r0     // Catch: java.lang.Throwable -> L17e
            monitor-exit(r2)
            return r5
        L17e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L181:
            return r5
        L182:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L135
            throw r0     // Catch: java.lang.Throwable -> L135
        L185:
            monitor-exit(r2)
            throw r0
        L187:
            r0 = move-exception
            java.lang.Object[] r1 = r7.A
            int r2 = r7.L
            r7 = 0
        L18d:
            if (r7 >= r2) goto L199
            r3 = r1[r7]
            wq2 r3 = (defpackage.wq2) r3
            r3.a()
            int r7 = r7 + 1
            goto L18d
        L199:
            throw r0
    }

    public final defpackage.hi1 i() {
            r4 = this;
            vl6 r0 = defpackage.bm6.j()
            hi1 r1 = r4.R
            hq6 r1 = defpackage.bm6.i(r1, r0)
            hi1 r1 = (defpackage.hi1) r1
            r2 = 0
            on2 r3 = r4.B
            hi1 r4 = r4.h(r1, r0, r2, r3)
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            hi1 r0 = r3.R
            hq6 r0 = defpackage.bm6.h(r0)
            hi1 r0 = (defpackage.hi1) r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DerivedState(value="
            r0.<init>(r1)
            hi1 r1 = r3.R
            hq6 r1 = defpackage.bm6.h(r1)
            hi1 r1 = (defpackage.hi1) r1
            vl6 r2 = defpackage.bm6.j()
            boolean r2 = r1.c(r3, r2)
            if (r2 == 0) goto L28
            java.lang.Object r1 = r1.f
            java.lang.String r1 = java.lang.String.valueOf(r1)
            goto L2a
        L28:
            java.lang.String r1 = "<Not calculated>"
        L2a:
            r0.append(r1)
            java.lang.String r1 = ")@"
            r0.append(r1)
            int r3 = r3.hashCode()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
