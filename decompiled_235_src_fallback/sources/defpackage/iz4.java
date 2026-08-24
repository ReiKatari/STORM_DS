package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz4  reason: default package */
/* loaded from: classes.dex */
public final class iz4 {
    public final int a;
    public final defpackage.on2 b;
    public final java.util.concurrent.locks.ReentrantLock c;
    public int d;
    public boolean e;
    public final defpackage.b01[] f;
    public final defpackage.lb6 g;
    public final defpackage.pu h;

    public iz4(int r1, defpackage.on2 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
            r2.<init>()
            r0.c = r2
            b01[] r2 = new defpackage.b01[r1]
            r0.f = r2
            int r2 = defpackage.mb6.a
            lb6 r2 = new lb6
            r2.<init>(r1)
            r0.g = r2
            pu r2 = new pu
            r2.<init>(r1)
            r0.h = r2
            return
    }

    public final java.lang.Object a(defpackage.s41 r8) {
            r7 = this;
            pu r0 = r7.h
            boolean r1 = r8 instanceof defpackage.gz4
            if (r1 == 0) goto L15
            r1 = r8
            gz4 r1 = (defpackage.gz4) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.Y = r2
            goto L1a
        L15:
            gz4 r1 = new gz4
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.R
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.Y
            r4 = 0
            lb6 r5 = r7.g
            r6 = 1
            if (r3 == 0) goto L32
            if (r3 != r6) goto L2c
            defpackage.oi2.Y(r8)
            goto L3e
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r4
        L32:
            defpackage.oi2.Y(r8)
            r1.Y = r6
            java.lang.Object r8 = r5.a(r1)
            if (r8 != r2) goto L3e
            return r2
        L3e:
            java.util.concurrent.locks.ReentrantLock r8 = r7.c     // Catch: java.lang.Throwable -> L78
            r8.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r7.e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r7.d     // Catch: java.lang.Throwable -> L7a
            int r2 = r7.a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            b01 r1 = new b01     // Catch: java.lang.Throwable -> L7a
            on2 r2 = r7.b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.c()     // Catch: java.lang.Throwable -> L7a
            e36 r2 = (defpackage.e36) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            b01[] r2 = r7.f     // Catch: java.lang.Throwable -> L7a
            int r3 = r7.d     // Catch: java.lang.Throwable -> L7a
            int r4 = r3 + 1
            r7.d = r4     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r7 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            b01 r7 = (defpackage.b01) r7     // Catch: java.lang.Throwable -> L7a
            r8.unlock()     // Catch: java.lang.Throwable -> L78
            return r7
        L78:
            r7 = move-exception
            goto L88
        L7a:
            r7 = move-exception
            goto L84
        L7c:
            java.lang.String r7 = "Connection pool is closed"
            r0 = 21
            defpackage.ii2.T(r0, r7)     // Catch: java.lang.Throwable -> L7a
            throw r4     // Catch: java.lang.Throwable -> L7a
        L84:
            r8.unlock()     // Catch: java.lang.Throwable -> L78
            throw r7     // Catch: java.lang.Throwable -> L78
        L88:
            r5.c()
            throw r7
    }

    public final java.lang.Object b(long r9, defpackage.sz0 r11, defpackage.s41 r12) {
            r8 = this;
            boolean r0 = r12 instanceof defpackage.hz4
            if (r0 == 0) goto L13
            r0 = r12
            hz4 r0 = (defpackage.hz4) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            hz4 r0 = new hz4
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            long r9 = r0.R
            dh5 r11 = r0.Y
            on2 r2 = r0.X
            defpackage.oi2.Y(r12)     // Catch: java.lang.Throwable -> L2e
            goto L5a
        L2e:
            r12 = move-exception
            goto L66
        L30:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L36:
            defpackage.oi2.Y(r12)
        L39:
            dh5 r12 = new dh5
            r12.<init>()
            u12 r2 = new u12     // Catch: java.lang.Throwable -> L64
            r5 = 22
            r2.<init>(r12, r8, r4, r5)     // Catch: java.lang.Throwable -> L64
            r0.X = r11     // Catch: java.lang.Throwable -> L64
            r0.Y = r12     // Catch: java.lang.Throwable -> L64
            r0.R = r9     // Catch: java.lang.Throwable -> L64
            r0.e0 = r3     // Catch: java.lang.Throwable -> L64
            long r5 = defpackage.q60.Y(r9)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = defpackage.xk2.M(r5, r2, r0)     // Catch: java.lang.Throwable -> L64
            if (r2 != r1) goto L58
            return r1
        L58:
            r2 = r11
            r11 = r12
        L5a:
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r4
            goto L6b
        L5f:
            r7 = r2
            r2 = r11
            r11 = r12
            r12 = r7
            goto L66
        L64:
            r2 = move-exception
            goto L5f
        L66:
            r7 = r12
            r12 = r11
            r11 = r2
            r2 = r0
            r0 = r7
        L6b:
            boolean r5 = r0 instanceof defpackage.c67     // Catch: java.lang.Throwable -> L73
            if (r5 == 0) goto L75
            r11.c()     // Catch: java.lang.Throwable -> L73
            goto L7c
        L73:
            r9 = move-exception
            goto L7f
        L75:
            if (r0 != 0) goto L7e
            java.lang.Object r12 = r12.A     // Catch: java.lang.Throwable -> L73
            if (r12 == 0) goto L7c
            return r12
        L7c:
            r0 = r2
            goto L39
        L7e:
            throw r0     // Catch: java.lang.Throwable -> L73
        L7f:
            java.lang.Object r10 = r12.A
            b01 r10 = (defpackage.b01) r10
            if (r10 == 0) goto L88
            r8.e(r10)
        L88:
            throw r9
    }

    public final void c() {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.c
            r0.lock()
            r1 = 1
            r4.e = r1     // Catch: java.lang.Throwable -> L16
            b01[] r4 = r4.f     // Catch: java.lang.Throwable -> L16
            int r1 = r4.length     // Catch: java.lang.Throwable -> L16
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1b
            r3 = r4[r2]     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto L18
            r3.close()     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1f
        L18:
            int r2 = r2 + 1
            goto Lc
        L1b:
            r0.unlock()
            return
        L1f:
            r0.unlock()
            throw r4
    }

    public final void d(java.lang.StringBuilder r13) {
            r12 = this;
            java.lang.String r0 = ", "
            pu r1 = r12.h
            java.util.concurrent.locks.ReentrantLock r2 = r12.c
            r2.lock()
            kw3 r3 = defpackage.hf.I()     // Catch: java.lang.Throwable -> L1d
            int r4 = r1.L     // Catch: java.lang.Throwable -> L1d
            r5 = 0
            r6 = r5
        L11:
            if (r6 >= r4) goto L21
            java.lang.Object r7 = r1.get(r6)     // Catch: java.lang.Throwable -> L1d
            r3.add(r7)     // Catch: java.lang.Throwable -> L1d
            int r6 = r6 + 1
            goto L11
        L1d:
            r0 = move-exception
            r12 = r0
            goto Lf9
        L21:
            kw3 r6 = defpackage.hf.A(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            r3 = 9
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = r12.toString()     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = " ("
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "capacity="
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            int r3 = r12.a     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r1.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "permits="
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            lb6 r3 = r12.g     // Catch: java.lang.Throwable -> L1d
            r3.getClass()     // Catch: java.lang.Throwable -> L1d
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.kb6.Z     // Catch: java.lang.Throwable -> L1d
            int r3 = r4.get(r3)     // Catch: java.lang.Throwable -> L1d
            int r3 = java.lang.Math.max(r3, r5)     // Catch: java.lang.Throwable -> L1d
            r1.append(r3)     // Catch: java.lang.Throwable -> L1d
            r1.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r0.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "queue=(size="
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            int r1 = r6.a()     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = ")["
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            r10 = 0
            r11 = 63
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r1 = defpackage.gt0.P0(r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L1d
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            r1 = 93
            r0.append(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = ")"
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            r0 = 10
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            b01[] r12 = r12.f     // Catch: java.lang.Throwable -> L1d
            int r1 = r12.length     // Catch: java.lang.Throwable -> L1d
            r3 = r5
        Lbe:
            if (r5 >= r1) goto Lf5
            r4 = r12[r5]     // Catch: java.lang.Throwable -> L1d
            int r3 = r3 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            r6.<init>()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "\t\t["
            r6.append(r7)     // Catch: java.lang.Throwable -> L1d
            r6.append(r3)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "] - "
            r6.append(r7)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto Ldf
            e36 r7 = r4.A     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1d
            goto Le0
        Ldf:
            r7 = 0
        Le0:
            r6.append(r7)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1d
            r13.append(r6)     // Catch: java.lang.Throwable -> L1d
            r13.append(r0)     // Catch: java.lang.Throwable -> L1d
            if (r4 == 0) goto Lf2
            r4.k(r13)     // Catch: java.lang.Throwable -> L1d
        Lf2:
            int r5 = r5 + 1
            goto Lbe
        Lf5:
            r2.unlock()
            return
        Lf9:
            r2.unlock()
            throw r12
    }

    public final void e(defpackage.b01 r3) {
            r2 = this;
            r3.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = r2.c
            r0.lock()
            pu r1 = r2.h     // Catch: java.lang.Throwable -> L16
            r1.addLast(r3)     // Catch: java.lang.Throwable -> L16
            r0.unlock()
            lb6 r2 = r2.g
            r2.c()
            return
        L16:
            r2 = move-exception
            r0.unlock()
            throw r2
    }
}
