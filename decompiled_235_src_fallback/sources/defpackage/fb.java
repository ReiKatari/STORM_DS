package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fb  reason: default package */
/* loaded from: classes.dex */
public final class fb implements defpackage.nr6, defpackage.w62 {
    public long A;
    public final java.lang.Object B;
    public final java.lang.Object L;
    public final java.lang.Object R;
    public final java.lang.Object X;

    public fb(defpackage.gb r6, byte[] r7) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.A = r0
            p42 r2 = defpackage.p42.e
            java.lang.String r3 = "AES/GCM/NoPadding"
            java.lang.Object r2 = r2.a(r3)
            javax.crypto.Cipher r2 = (javax.crypto.Cipher) r2
            r5.L = r2
            r5.A = r0
            int r0 = r6.a
            byte[] r1 = defpackage.nd5.a(r0)
            r2 = 7
            byte[] r2 = defpackage.nd5.a(r2)
            r5.R = r2
            int r3 = r6.e()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r5.X = r3
            int r4 = r6.e()
            byte r4 = (byte) r4
            r3.put(r4)
            r3.put(r1)
            r3.put(r2)
            r3.flip()
            java.lang.String r2 = r6.d
            byte[] r6 = r6.e
            byte[] r6 = defpackage.gi2.v(r2, r6, r1, r7, r0)
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r0 = "AES"
            r7.<init>(r6, r0)
            r5.B = r7
            return
    }

    public fb(defpackage.ue5 r1, defpackage.qz6 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r1 = -9223372036854775808
            r0.A = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.R = r1
            java.util.concurrent.LinkedBlockingDeque r1 = new java.util.concurrent.LinkedBlockingDeque
            r1.<init>()
            r0.X = r1
            return
    }

    @Override // defpackage.w62
    public defpackage.ke5 a() {
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            java.lang.Object r2 = r8.R     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.CopyOnWriteArrayList r2 = (java.util.concurrent.CopyOnWriteArrayList) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L21
            java.lang.Object r2 = r8.B     // Catch: java.lang.Throwable -> L1e
            ue5 r2 = (defpackage.ue5) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.a(r0)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L17
            goto L21
        L17:
            r8.c()
            r1.getClass()
            throw r1
        L1e:
            r0 = move-exception
            goto Ldb
        L21:
            java.lang.Object r2 = r8.B     // Catch: java.lang.Throwable -> L1e
            ue5 r2 = (defpackage.ue5) r2     // Catch: java.lang.Throwable -> L1e
            je5 r2 = r2.k     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.m0     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto Ld3
            java.lang.Object r2 = r8.L     // Catch: java.lang.Throwable -> L1e
            qz6 r2 = (defpackage.qz6) r2     // Catch: java.lang.Throwable -> L1e
            s35 r2 = r2.a     // Catch: java.lang.Throwable -> L1e
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L1e
            long r4 = r8.A     // Catch: java.lang.Throwable -> L1e
            long r4 = r4 - r2
            java.lang.Object r6 = r8.R     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.CopyOnWriteArrayList r6 = (java.util.concurrent.CopyOnWriteArrayList) r6     // Catch: java.lang.Throwable -> L1e
            boolean r6 = r6.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r6 != 0) goto L4c
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 > 0) goto L49
            goto L4c
        L49:
            r5 = r4
            r4 = r0
            goto L56
        L4c:
            g26 r4 = r8.d()     // Catch: java.lang.Throwable -> L1e
            r5 = 250000000(0xee6b280, double:1.235164115E-315)
            long r2 = r2 + r5
            r8.A = r2     // Catch: java.lang.Throwable -> L1e
        L56:
            if (r4 != 0) goto L7c
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r3 = r8.R     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch: java.lang.Throwable -> L1e
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L1e
            if (r4 == 0) goto L66
        L64:
            r4 = r0
            goto L79
        L66:
            java.lang.Object r4 = r8.X     // Catch: java.lang.Throwable -> L1e
            java.util.concurrent.LinkedBlockingDeque r4 = (java.util.concurrent.LinkedBlockingDeque) r4     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r2 = r4.poll(r5, r2)     // Catch: java.lang.Throwable -> L1e
            g26 r2 = (defpackage.g26) r2     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L73
            goto L64
        L73:
            h26 r4 = r2.a     // Catch: java.lang.Throwable -> L1e
            r3.remove(r4)     // Catch: java.lang.Throwable -> L1e
            r4 = r2
        L79:
            if (r4 != 0) goto L7c
            goto L2
        L7c:
            h26 r2 = r4.b     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            r5 = 1
            if (r2 != 0) goto L88
            java.lang.Throwable r2 = r4.c     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L88
            r2 = r5
            goto L89
        L88:
            r2 = r3
        L89:
            if (r2 == 0) goto Lb1
            r8.c()     // Catch: java.lang.Throwable -> L1e
            h26 r2 = r4.a     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.c()     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto L9c
            h26 r2 = r4.a     // Catch: java.lang.Throwable -> L1e
            g26 r4 = r2.g()     // Catch: java.lang.Throwable -> L1e
        L9c:
            h26 r2 = r4.b     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto La5
            java.lang.Throwable r2 = r4.c     // Catch: java.lang.Throwable -> L1e
            if (r2 != 0) goto La5
            r3 = r5
        La5:
            if (r3 == 0) goto Lb1
            h26 r0 = r4.a     // Catch: java.lang.Throwable -> L1e
            ke5 r0 = r0.b()     // Catch: java.lang.Throwable -> L1e
            r8.c()
            return r0
        Lb1:
            java.lang.Throwable r2 = r4.c     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto Lc4
            boolean r3 = r2 instanceof java.io.IOException     // Catch: java.lang.Throwable -> L1e
            if (r3 == 0) goto Lc3
            if (r1 != 0) goto Lbf
            java.io.IOException r2 = (java.io.IOException) r2     // Catch: java.lang.Throwable -> L1e
            r1 = r2
            goto Lc4
        Lbf:
            defpackage.mb3.q(r1, r2)     // Catch: java.lang.Throwable -> L1e
            goto Lc4
        Lc3:
            throw r2     // Catch: java.lang.Throwable -> L1e
        Lc4:
            h26 r2 = r4.b     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L2
            java.lang.Object r3 = r8.B     // Catch: java.lang.Throwable -> L1e
            ue5 r3 = (defpackage.ue5) r3     // Catch: java.lang.Throwable -> L1e
            pu r3 = r3.p     // Catch: java.lang.Throwable -> L1e
            r3.addFirst(r2)     // Catch: java.lang.Throwable -> L1e
            goto L2
        Ld3:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r1 = "Canceled"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0     // Catch: java.lang.Throwable -> L1e
        Ldb:
            r8.c()
            throw r0
    }

    @Override // defpackage.w62
    public defpackage.ue5 b() {
            r0 = this;
            java.lang.Object r0 = r0.B
            ue5 r0 = (defpackage.ue5) r0
            return r0
    }

    public void c() {
            r4 = this;
            java.lang.Object r0 = r4.R
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r1 = r0.iterator()
            r1.getClass()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()
            h26 r2 = (defpackage.h26) r2
            r2.cancel()
            h26 r2 = r2.a()
            if (r2 != 0) goto L21
            goto Lb
        L21:
            java.lang.Object r3 = r4.B
            ue5 r3 = (defpackage.ue5) r3
            pu r3 = r3.p
            r3.addLast(r2)
            goto Lb
        L2b:
            r0.clear()
            return
    }

    public defpackage.g26 d() {
            r7 = this;
            java.lang.Object r0 = r7.B
            ue5 r0 = (defpackage.ue5) r0
            r1 = 0
            boolean r2 = r0.a(r1)
            if (r2 == 0) goto L64
            h26 r2 = r0.b()     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r2 = move-exception
            l92 r3 = new l92
            r3.<init>(r2)
            r2 = r3
        L17:
            boolean r3 = r2.c()
            if (r3 == 0) goto L24
            g26 r7 = new g26
            r0 = 6
            r7.<init>(r2, r1, r0)
            return r7
        L24:
            boolean r3 = r2 instanceof defpackage.l92
            if (r3 == 0) goto L2d
            l92 r2 = (defpackage.l92) r2
            g26 r7 = r2.a
            return r7
        L2d:
            java.lang.Object r3 = r7.R
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3
            r3.add(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = defpackage.az7.b
            r3.append(r4)
            java.lang.String r4 = " connect "
            r3.append(r4)
            ea r0 = r0.i
            i03 r0 = r0.h
            java.lang.String r0 = r0.g()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.Object r3 = r7.L
            qz6 r3 = (defpackage.qz6) r3
            pz6 r3 = r3.d()
            p92 r4 = new p92
            r4.<init>(r0, r2, r7)
            r5 = 0
            r3.c(r4, r5)
        L64:
            return r1
    }

    @Override // defpackage.nr6
    public synchronized void f(java.nio.ByteBuffer r7, java.nio.ByteBuffer r8, java.nio.ByteBuffer r9) {
            r6 = this;
            monitor-enter(r6)
            java.lang.Object r0 = r6.L     // Catch: java.lang.Throwable -> L34
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r6.B     // Catch: java.lang.Throwable -> L34
            javax.crypto.spec.SecretKeySpec r1 = (javax.crypto.spec.SecretKeySpec) r1     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r6.R     // Catch: java.lang.Throwable -> L34
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L34
            long r3 = r6.A     // Catch: java.lang.Throwable -> L34
            r5 = 0
            javax.crypto.spec.GCMParameterSpec r2 = defpackage.gb.i(r2, r3, r5)     // Catch: java.lang.Throwable -> L34
            r3 = 1
            r0.init(r3, r1, r2)     // Catch: java.lang.Throwable -> L34
            long r0 = r6.A     // Catch: java.lang.Throwable -> L34
            r2 = 1
            long r0 = r0 + r2
            r6.A = r0     // Catch: java.lang.Throwable -> L34
            boolean r0 = r8.hasRemaining()     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r6.L
            javax.crypto.Cipher r1 = (javax.crypto.Cipher) r1
            if (r0 == 0) goto L36
            r1.update(r7, r9)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r7 = r6.L     // Catch: java.lang.Throwable -> L34
            javax.crypto.Cipher r7 = (javax.crypto.Cipher) r7     // Catch: java.lang.Throwable -> L34
            r7.doFinal(r8, r9)     // Catch: java.lang.Throwable -> L34
            goto L39
        L34:
            r7 = move-exception
            goto L3b
        L36:
            r1.doFinal(r7, r9)     // Catch: java.lang.Throwable -> L34
        L39:
            monitor-exit(r6)
            return
        L3b:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L34
            throw r7
    }

    @Override // defpackage.nr6
    public java.nio.ByteBuffer i() {
            r0 = this;
            java.lang.Object r0 = r0.X
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    @Override // defpackage.nr6
    public synchronized void j(java.nio.ByteBuffer r7, java.nio.ByteBuffer r8) {
            r6 = this;
            monitor-enter(r6)
            java.lang.Object r0 = r6.L     // Catch: java.lang.Throwable -> L27
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.lang.Throwable -> L27
            java.lang.Object r1 = r6.B     // Catch: java.lang.Throwable -> L27
            javax.crypto.spec.SecretKeySpec r1 = (javax.crypto.spec.SecretKeySpec) r1     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r6.R     // Catch: java.lang.Throwable -> L27
            byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L27
            long r3 = r6.A     // Catch: java.lang.Throwable -> L27
            r5 = 1
            javax.crypto.spec.GCMParameterSpec r2 = defpackage.gb.i(r2, r3, r5)     // Catch: java.lang.Throwable -> L27
            r0.init(r5, r1, r2)     // Catch: java.lang.Throwable -> L27
            long r0 = r6.A     // Catch: java.lang.Throwable -> L27
            r2 = 1
            long r0 = r0 + r2
            r6.A = r0     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r6.L     // Catch: java.lang.Throwable -> L27
            javax.crypto.Cipher r0 = (javax.crypto.Cipher) r0     // Catch: java.lang.Throwable -> L27
            r0.doFinal(r7, r8)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r6)
            return
        L27:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L27
            throw r7
    }
}
