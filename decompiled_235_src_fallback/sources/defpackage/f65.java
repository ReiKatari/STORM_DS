package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f65  reason: default package */
/* loaded from: classes.dex */
public final class f65 {
    public static final defpackage.da0 b = null;
    public static final java.util.List c = null;
    public static final defpackage.f65 d = null;
    public final defpackage.pa a;

    static {
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 42
            r3 = 0
            r1[r3] = r2
            da0 r2 = new da0
            byte[] r0 = java.util.Arrays.copyOf(r1, r0)
            r2.<init>(r0)
            defpackage.f65.b = r2
            java.lang.String r0 = "*"
            java.util.List r0 = defpackage.hf.b0(r0)
            defpackage.f65.c = r0
            f65 r0 = new f65
            pa r1 = new pa
            r2 = 3
            r1.<init>(r2)
            r0.<init>(r1)
            defpackage.f65.d = r0
            return
    }

    public f65(defpackage.pa r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static java.util.List b(java.lang.String r3) {
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 46
            r2 = 0
            r0[r2] = r1
            r1 = 6
            java.util.List r3 = defpackage.qs6.J0(r3, r0, r1)
            java.lang.Object r0 = defpackage.gt0.Q0(r3)
            java.lang.String r1 = ""
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L1d
            java.util.List r3 = defpackage.gt0.E0(r3)
        L1d:
            return r3
    }

    public final java.lang.String a(java.lang.String r13) {
            r12 = this;
            java.lang.String r0 = java.net.IDN.toUnicode(r13)
            r0.getClass()
            java.util.List r0 = b(r0)
            pa r12 = r12.a
            java.lang.Object r1 = r12.B
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1
            boolean r2 = r1.get()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L44
            boolean r1 = r1.compareAndSet(r4, r3)
            if (r1 == 0) goto L44
            r1 = r4
        L20:
            r12.r()     // Catch: java.lang.Throwable -> L2d java.io.IOException -> L2f java.io.InterruptedIOException -> L35
            if (r1 == 0) goto L53
        L25:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
            goto L53
        L2d:
            r12 = move-exception
            goto L3a
        L2f:
            r2 = move-exception
            r12.Y = r2     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L53
            goto L25
        L35:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L2d
            r1 = r3
            goto L20
        L3a:
            if (r1 == 0) goto L43
            java.lang.Thread r13 = java.lang.Thread.currentThread()
            r13.interrupt()
        L43:
            throw r12
        L44:
            java.lang.Object r1 = r12.L     // Catch: java.lang.InterruptedException -> L4c
            java.util.concurrent.CountDownLatch r1 = (java.util.concurrent.CountDownLatch) r1     // Catch: java.lang.InterruptedException -> L4c
            r1.await()     // Catch: java.lang.InterruptedException -> L4c
            goto L53
        L4c:
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L53:
            java.lang.Object r1 = r12.R
            da0 r1 = (defpackage.da0) r1
            if (r1 == 0) goto L17c
            int r1 = r0.size()
            da0[] r2 = new defpackage.da0[r1]
            r5 = r4
        L60:
            if (r5 >= r1) goto L73
            da0 r6 = defpackage.da0.R
            java.lang.Object r6 = r0.get(r5)
            java.lang.String r6 = (java.lang.String) r6
            da0 r6 = defpackage.xd5.o(r6)
            r2[r5] = r6
            int r5 = r5 + 1
            goto L60
        L73:
            r5 = r4
        L74:
            java.lang.String r6 = "bytes"
            r7 = 0
            if (r5 >= r1) goto L8d
            java.lang.Object r8 = r12.R
            da0 r8 = (defpackage.da0) r8
            if (r8 == 0) goto L89
            java.lang.String r8 = defpackage.w31.l(r8, r2, r5)
            if (r8 == 0) goto L86
            goto L8e
        L86:
            int r5 = r5 + 1
            goto L74
        L89:
            defpackage.nb3.a0(r6)
            throw r7
        L8d:
            r8 = r7
        L8e:
            if (r1 <= r3) goto Lb3
            java.lang.Object r5 = r2.clone()
            da0[] r5 = (defpackage.da0[]) r5
            int r9 = r5.length
            int r9 = r9 - r3
            r10 = r4
        L99:
            if (r10 >= r9) goto Lb3
            da0 r11 = defpackage.f65.b
            r5[r10] = r11
            java.lang.Object r11 = r12.R
            da0 r11 = (defpackage.da0) r11
            if (r11 == 0) goto Laf
            java.lang.String r11 = defpackage.w31.l(r11, r5, r10)
            if (r11 == 0) goto Lac
            goto Lb4
        Lac:
            int r10 = r10 + 1
            goto L99
        Laf:
            defpackage.nb3.a0(r6)
            throw r7
        Lb3:
            r11 = r7
        Lb4:
            if (r11 == 0) goto Ld0
            int r1 = r1 - r3
            r5 = r4
        Lb8:
            if (r5 >= r1) goto Ld0
            java.lang.Object r6 = r12.X
            da0 r6 = (defpackage.da0) r6
            if (r6 == 0) goto Lca
            java.lang.String r6 = defpackage.w31.l(r6, r2, r5)
            if (r6 == 0) goto Lc7
            goto Ld1
        Lc7:
            int r5 = r5 + 1
            goto Lb8
        Lca:
            java.lang.String r12 = "exceptionBytes"
            defpackage.nb3.a0(r12)
            throw r7
        Ld0:
            r6 = r7
        Ld1:
            r12 = 6
            r1 = 46
            if (r6 == 0) goto Le5
            java.lang.String r2 = "!"
            java.lang.String r2 = r2.concat(r6)
            char[] r5 = new char[r3]
            r5[r4] = r1
            java.util.List r12 = defpackage.qs6.J0(r2, r5, r12)
            goto L111
        Le5:
            if (r8 != 0) goto Lec
            if (r11 != 0) goto Lec
            java.util.List r12 = defpackage.f65.c
            goto L111
        Lec:
            yt1 r2 = defpackage.yt1.A
            if (r8 == 0) goto Lf9
            char[] r5 = new char[r3]
            r5[r4] = r1
            java.util.List r5 = defpackage.qs6.J0(r8, r5, r12)
            goto Lfa
        Lf9:
            r5 = r2
        Lfa:
            if (r11 == 0) goto L104
            char[] r2 = new char[r3]
            r2[r4] = r1
            java.util.List r2 = defpackage.qs6.J0(r11, r2, r12)
        L104:
            int r12 = r5.size()
            int r1 = r2.size()
            if (r12 <= r1) goto L110
            r12 = r5
            goto L111
        L110:
            r12 = r2
        L111:
            int r1 = r0.size()
            int r2 = r12.size()
            r5 = 33
            if (r1 != r2) goto L12a
            java.lang.Object r1 = r12.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            char r1 = r1.charAt(r4)
            if (r1 == r5) goto L12a
            return r7
        L12a:
            java.lang.Object r1 = r12.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            char r1 = r1.charAt(r4)
            if (r1 != r5) goto L140
            int r0 = r0.size()
            int r12 = r12.size()
        L13e:
            int r0 = r0 - r12
            goto L14a
        L140:
            int r0 = r0.size()
            int r12 = r12.size()
            int r12 = r12 + r3
            goto L13e
        L14a:
            java.util.List r12 = b(r13)
            ev r13 = new ev
            r13.<init>(r12, r3)
            if (r0 < 0) goto L170
            if (r0 != 0) goto L158
            goto L169
        L158:
            boolean r12 = r13 instanceof defpackage.qp1
            if (r12 == 0) goto L163
            qp1 r13 = (defpackage.qp1) r13
            qb6 r13 = r13.a(r0)
            goto L169
        L163:
            pp1 r12 = new pp1
            r12.<init>(r13, r0)
            r13 = r12
        L169:
            java.lang.String r12 = "."
            java.lang.String r12 = defpackage.sb6.a0(r13, r12)
            return r12
        L170:
            java.lang.String r12 = "Requested element count "
            java.lang.String r13 = " is less than zero."
            java.lang.String r12 = defpackage.lb1.k(r12, r0, r13)
            defpackage.i.f(r12)
            return r7
        L17c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to load "
            r0.<init>(r1)
            java.lang.Object r1 = r12.Z
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = " resource."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            java.lang.Object r12 = r12.Y
            java.io.IOException r12 = (java.io.IOException) r12
            r13.initCause(r12)
            throw r13
    }
}
