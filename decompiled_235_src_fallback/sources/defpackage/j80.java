package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j80  reason: default package */
/* loaded from: classes.dex */
public final class j80 extends java.io.InputStream {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.z80 B;

    public /* synthetic */ j80(defpackage.z80 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    private final void e() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r5 = this;
            int r0 = r5.A
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            z80 r5 = r5.B
            switch(r0) {
                case 0: goto L21;
                default: goto La;
            }
        La:
            fe5 r5 = (defpackage.fe5) r5
            boolean r0 = r5.L
            if (r0 != 0) goto L1a
            k80 r5 = r5.B
            long r3 = r5.B
            long r0 = java.lang.Math.min(r3, r1)
            int r5 = (int) r0
            goto L20
        L1a:
            java.lang.String r5 = "closed"
            defpackage.e41.i(r5)
            r5 = 0
        L20:
            return r5
        L21:
            k80 r5 = (defpackage.k80) r5
            long r3 = r5.B
            long r0 = java.lang.Math.min(r3, r1)
            int r5 = (int) r0
            return r5
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto Lc;
                default: goto L5;
            }
        L5:
            z80 r1 = r1.B
            fe5 r1 = (defpackage.fe5) r1
            r1.close()
        Lc:
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r6 = this;
            int r0 = r6.A
            r1 = -1
            r2 = 0
            z80 r6 = r6.B
            switch(r0) {
                case 0: goto L35;
                default: goto La;
            }
        La:
            fe5 r6 = (defpackage.fe5) r6
            k80 r0 = r6.B
            boolean r4 = r6.L
            if (r4 != 0) goto L2e
            long r4 = r0.B
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L27
            in6 r6 = r6.A
            r2 = 8192(0x2000, double:4.0474E-320)
            long r2 = r6.b0(r0, r2)
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L27
            goto L34
        L27:
            byte r6 = r0.readByte()
            r1 = r6 & 255(0xff, float:3.57E-43)
            goto L34
        L2e:
            java.lang.String r6 = "closed"
            defpackage.e41.i(r6)
            r1 = 0
        L34:
            return r1
        L35:
            k80 r6 = (defpackage.k80) r6
            long r4 = r6.B
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L43
            byte r6 = r6.readByte()
            r1 = r6 & 255(0xff, float:3.57E-43)
        L43:
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r9, int r10, int r11) {
            r8 = this;
            int r0 = r8.A
            z80 r8 = r8.B
            r9.getClass()
            switch(r0) {
                case 0: goto L3d;
                default: goto La;
            }
        La:
            fe5 r8 = (defpackage.fe5) r8
            k80 r0 = r8.B
            boolean r1 = r8.L
            if (r1 != 0) goto L36
            int r1 = r9.length
            long r2 = (long) r1
            long r4 = (long) r10
            long r6 = (long) r11
            defpackage.hf.D(r2, r4, r6)
            long r1 = r0.B
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L31
            in6 r8 = r8.A
            r1 = 8192(0x2000, double:4.0474E-320)
            long r1 = r8.b0(r0, r1)
            r3 = -1
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r8 != 0) goto L31
            r8 = -1
            goto L3c
        L31:
            int r8 = r0.read(r9, r10, r11)
            goto L3c
        L36:
            java.lang.String r8 = "closed"
            defpackage.e41.i(r8)
            r8 = 0
        L3c:
            return r8
        L3d:
            k80 r8 = (defpackage.k80) r8
            int r8 = r8.read(r9, r10, r11)
            return r8
    }

    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            java.lang.String r1 = ".inputStream()"
            z80 r2 = r2.B
            switch(r0) {
                case 0: goto L1b;
                default: goto L9;
            }
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            fe5 r2 = (defpackage.fe5) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
        L1b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            k80 r2 = (defpackage.k80) r2
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public long transferTo(java.io.OutputStream r15) {
            r14 = this;
            int r0 = r14.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            long r14 = super.transferTo(r15)
            return r14
        La:
            r15.getClass()
            z80 r14 = r14.B
            fe5 r14 = (defpackage.fe5) r14
            k80 r0 = r14.B
            boolean r1 = r14.L
            r2 = 0
            if (r1 != 0) goto L70
            r4 = r2
        L1a:
            long r6 = r0.B
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 != 0) goto L31
            in6 r1 = r14.A
            r6 = 8192(0x2000, double:4.0474E-320)
            long r6 = r1.b0(r0, r6)
            r8 = -1
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            r2 = r4
            goto L75
        L31:
            long r6 = r0.B
            long r4 = r4 + r6
            r8 = 0
            r10 = r6
            defpackage.hf.D(r6, r8, r10)
            o96 r1 = r0.A
        L3c:
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 <= 0) goto L1a
            r1.getClass()
            int r8 = r1.c
            int r9 = r1.b
            int r8 = r8 - r9
            long r8 = (long) r8
            long r8 = java.lang.Math.min(r6, r8)
            int r8 = (int) r8
            byte[] r9 = r1.a
            int r10 = r1.b
            r15.write(r9, r10, r8)
            int r9 = r1.b
            int r9 = r9 + r8
            r1.b = r9
            long r10 = r0.B
            long r12 = (long) r8
            long r10 = r10 - r12
            r0.B = r10
            long r6 = r6 - r12
            int r8 = r1.c
            if (r9 != r8) goto L3c
            o96 r8 = r1.a()
            r0.A = r8
            defpackage.r96.a(r1)
            r1 = r8
            goto L3c
        L70:
            java.lang.String r14 = "closed"
            defpackage.e41.i(r14)
        L75:
            return r2
    }
}
