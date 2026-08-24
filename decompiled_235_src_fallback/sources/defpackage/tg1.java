package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tg1  reason: default package */
/* loaded from: classes.dex */
public final class tg1 implements defpackage.ui6 {
    public final /* synthetic */ int A;
    public boolean B;
    public final java.lang.Object L;
    public final java.lang.Object R;

    public tg1(defpackage.hz2 r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.R = r2
            lk2 r0 = new lk2
            bt r2 = r2.c
            java.lang.Object r2 = r2.R
            ee5 r2 = (defpackage.ee5) r2
            ui6 r2 = r2.A
            b67 r2 = r2.b()
            r0.<init>(r2)
            r1.L = r0
            return
    }

    public tg1(defpackage.k80 r2, java.util.zip.Deflater r3) {
            r1 = this;
            r0 = 0
            r1.A = r0
            ee5 r0 = new ee5
            r0.<init>(r2)
            r1.<init>()
            r1.L = r0
            r1.R = r3
            return
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r13, long r14) {
            r12 = this;
            int r0 = r12.A
            java.lang.Object r1 = r12.R
            switch(r0) {
                case 0: goto L25;
                default: goto L7;
            }
        L7:
            boolean r12 = r12.B
            if (r12 != 0) goto L1f
            long r2 = r13.B
            r4 = 0
            r6 = r14
            defpackage.yy7.a(r2, r4, r6)
            hz2 r1 = (defpackage.hz2) r1
            bt r12 = r1.c
            java.lang.Object r12 = r12.R
            ee5 r12 = (defpackage.ee5) r12
            r12.O(r13, r6)
            goto L24
        L1f:
            java.lang.String r12 = "closed"
            defpackage.i.m(r12)
        L24:
            return
        L25:
            r6 = r14
            java.util.zip.Deflater r1 = (java.util.zip.Deflater) r1
            r10 = r6
            long r6 = r13.B
            r8 = 0
            defpackage.hf.D(r6, r8, r10)
            r6 = r10
            r14 = r6
        L32:
            r2 = 0
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L6d
            o96 r0 = r13.A
            r0.getClass()
            int r3 = r0.c
            int r4 = r0.b
            int r3 = r3 - r4
            long r3 = (long) r3
            long r3 = java.lang.Math.min(r14, r3)
            int r3 = (int) r3
            byte[] r4 = r0.a
            int r5 = r0.b
            r1.setInput(r4, r5, r3)
            r12.e(r2)
            long r4 = r13.B
            long r6 = (long) r3
            long r4 = r4 - r6
            r13.B = r4
            int r2 = r0.b
            int r2 = r2 + r3
            r0.b = r2
            int r3 = r0.c
            if (r2 != r3) goto L6b
            o96 r2 = r0.a()
            r13.A = r2
            defpackage.r96.a(r0)
        L6b:
            long r14 = r14 - r6
            goto L32
        L6d:
            byte[] r12 = defpackage.mb3.C
            r1.setInput(r12, r2, r2)
            return
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r1.L
            lk2 r1 = (defpackage.lk2) r1
            return r1
        La:
            java.lang.Object r1 = r1.L
            ee5 r1 = (defpackage.ee5) r1
            ui6 r1 = r1.A
            b67 r1 = r1.b()
            return r1
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r4 = this;
            int r0 = r4.A
            java.lang.Object r1 = r4.L
            r2 = 1
            java.lang.Object r3 = r4.R
            switch(r0) {
                case 0: goto L25;
                default: goto La;
            }
        La:
            hz2 r3 = (defpackage.hz2) r3
            boolean r0 = r4.B
            if (r0 == 0) goto L11
            goto L24
        L11:
            r4.B = r2
            lk2 r1 = (defpackage.lk2) r1
            b67 r4 = r1.e
            a67 r0 = defpackage.b67.d
            r1.e = r0
            r4.a()
            r4.b()
            r4 = 3
            r3.d = r4
        L24:
            return
        L25:
            java.util.zip.Deflater r3 = (java.util.zip.Deflater) r3
            boolean r0 = r4.B
            if (r0 == 0) goto L2c
            goto L4c
        L2c:
            r3.finish()     // Catch: java.lang.Throwable -> L35
            r0 = 0
            r4.e(r0)     // Catch: java.lang.Throwable -> L35
            r0 = 0
            goto L36
        L35:
            r0 = move-exception
        L36:
            r3.end()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r3 = move-exception
            if (r0 != 0) goto L3e
            r0 = r3
        L3e:
            ee5 r1 = (defpackage.ee5) r1     // Catch: java.lang.Throwable -> L44
            r1.close()     // Catch: java.lang.Throwable -> L44
            goto L48
        L44:
            r1 = move-exception
            if (r0 != 0) goto L48
            r0 = r1
        L48:
            r4.B = r2
            if (r0 != 0) goto L4d
        L4c:
            return
        L4d:
            throw r0
    }

    public void e(boolean r8) {
            r7 = this;
            java.lang.Object r0 = r7.R
            java.util.zip.Deflater r0 = (java.util.zip.Deflater) r0
            java.lang.Object r7 = r7.L
            ee5 r7 = (defpackage.ee5) r7
            k80 r1 = r7.B
        La:
            r2 = 1
            o96 r2 = r1.j0(r2)
            byte[] r3 = r2.a
            int r4 = r2.c
            if (r8 == 0) goto L1d
            int r5 = 8192 - r4
            r6 = 2
            int r3 = r0.deflate(r3, r4, r5, r6)     // Catch: java.lang.NullPointerException -> L4a
            goto L23
        L1d:
            int r5 = 8192 - r4
            int r3 = r0.deflate(r3, r4, r5)     // Catch: java.lang.NullPointerException -> L4a
        L23:
            if (r3 <= 0) goto L34
            int r4 = r2.c
            int r4 = r4 + r3
            r2.c = r4
            long r4 = r1.B
            long r2 = (long) r3
            long r4 = r4 + r2
            r1.B = r4
            r7.e()
            goto La
        L34:
            boolean r3 = r0.needsInput()
            if (r3 == 0) goto La
            int r7 = r2.b
            int r8 = r2.c
            if (r7 != r8) goto L49
            o96 r7 = r2.a()
            r1.A = r7
            defpackage.r96.a(r2)
        L49:
            return
        L4a:
            r7 = move-exception
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "Deflater already closed"
            r8.<init>(r0, r7)
            throw r8
    }

    @Override // defpackage.ui6, java.io.Flushable
    public final void flush() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto L18;
                default: goto L5;
            }
        L5:
            boolean r0 = r1.B
            if (r0 == 0) goto La
            goto L17
        La:
            java.lang.Object r1 = r1.R
            hz2 r1 = (defpackage.hz2) r1
            bt r1 = r1.c
            java.lang.Object r1 = r1.R
            ee5 r1 = (defpackage.ee5) r1
            r1.flush()
        L17:
            return
        L18:
            r0 = 1
            r1.e(r0)
            java.lang.Object r1 = r1.L
            ee5 r1 = (defpackage.ee5) r1
            r1.flush()
            return
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DeflaterSink("
            r0.<init>(r1)
            java.lang.Object r2 = r2.L
            ee5 r2 = (defpackage.ee5) r2
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
