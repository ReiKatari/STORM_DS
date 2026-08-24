package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee5  reason: default package */
/* loaded from: classes.dex */
public final class ee5 implements defpackage.y80 {
    public final defpackage.ui6 A;
    public final defpackage.k80 B;
    public boolean L;

    public ee5(defpackage.ui6 r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            k80 r1 = new k80
            r1.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.y80
    public final defpackage.y80 B(byte[] r2, int r3) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto Ld
            k80 r0 = r1.B
            r0.l0(r2, r3)
            r1.e()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.y80
    public final defpackage.y80 H(java.lang.String r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.L
            if (r0 != 0) goto L10
            k80 r0 = r1.B
            r0.t0(r2)
            r1.e()
            return r1
        L10:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.ui6
    public final void O(defpackage.k80 r2, long r3) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.L
            if (r0 != 0) goto L10
            k80 r0 = r1.B
            r0.O(r2, r3)
            r1.e()
            return
        L10:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            return
    }

    @Override // defpackage.y80
    public final defpackage.y80 P(defpackage.da0 r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.L
            if (r0 != 0) goto L10
            k80 r0 = r1.B
            r0.k0(r2)
            r1.e()
            return r1
        L10:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.y80
    public final defpackage.k80 a() {
            r0 = this;
            k80 r0 = r0.B
            return r0
    }

    @Override // defpackage.ui6
    public final defpackage.b67 b() {
            r0 = this;
            ui6 r0 = r0.A
            b67 r0 = r0.b()
            return r0
    }

    @Override // defpackage.ui6, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r6 = this;
            ui6 r0 = r6.A
            boolean r1 = r6.L
            if (r1 != 0) goto L26
            k80 r1 = r6.B     // Catch: java.lang.Throwable -> L14
            long r2 = r1.B     // Catch: java.lang.Throwable -> L14
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto L16
            r0.O(r1, r2)     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r1 = move-exception
            goto L17
        L16:
            r1 = 0
        L17:
            r0.close()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r0 = move-exception
            if (r1 != 0) goto L1f
            r1 = r0
        L1f:
            r0 = 1
            r6.L = r0
            if (r1 != 0) goto L25
            goto L26
        L25:
            throw r1
        L26:
            return
    }

    public final defpackage.y80 e() {
            r5 = this;
            boolean r0 = r5.L
            if (r0 != 0) goto L16
            k80 r0 = r5.B
            long r1 = r0.k()
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L15
            ui6 r3 = r5.A
            r3.O(r0, r1)
        L15:
            return r5
        L16:
            java.lang.String r5 = "closed"
            defpackage.i.m(r5)
            r5 = 0
            return r5
    }

    @Override // defpackage.y80, defpackage.ui6, java.io.Flushable
    public final void flush() {
            r5 = this;
            boolean r0 = r5.L
            if (r0 != 0) goto L17
            k80 r0 = r5.B
            long r1 = r0.B
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            ui6 r5 = r5.A
            if (r3 <= 0) goto L13
            r5.O(r0, r1)
        L13:
            r5.flush()
            return
        L17:
            java.lang.String r5 = "closed"
            defpackage.i.m(r5)
            return
    }

    @Override // defpackage.y80
    public final defpackage.y80 h0(long r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto Ld
            k80 r0 = r1.B
            r0.o0(r2)
            r1.e()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r0 = this;
            boolean r0 = r0.L
            r0 = r0 ^ 1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "buffer("
            r0.<init>(r1)
            ui6 r2 = r2.A
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(java.nio.ByteBuffer r2) {
            r1 = this;
            r2.getClass()
            boolean r0 = r1.L
            if (r0 != 0) goto L11
            k80 r0 = r1.B
            int r2 = r0.write(r2)
            r1.e()
            return r2
        L11:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.y80
    public final defpackage.y80 write(byte[] r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r2.L
            if (r0 != 0) goto L11
            k80 r0 = r2.B
            int r1 = r3.length
            r0.l0(r3, r1)
            r2.e()
            return r2
        L11:
            java.lang.String r2 = "closed"
            defpackage.i.m(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.y80
    public final defpackage.y80 writeByte(int r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto Ld
            k80 r0 = r1.B
            r0.n0(r2)
            r1.e()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.y80
    public final defpackage.y80 writeInt(int r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto Ld
            k80 r0 = r1.B
            r0.q0(r2)
            r1.e()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }

    @Override // defpackage.y80
    public final defpackage.y80 writeShort(int r2) {
            r1 = this;
            boolean r0 = r1.L
            if (r0 != 0) goto Ld
            k80 r0 = r1.B
            r0.r0(r2)
            r1.e()
            return r1
        Ld:
            java.lang.String r1 = "closed"
            defpackage.i.m(r1)
            r1 = 0
            return r1
    }
}
