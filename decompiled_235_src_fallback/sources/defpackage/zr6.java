package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zr6  reason: default package */
/* loaded from: classes.dex */
public final class zr6 extends java.io.FilterInputStream {
    public final java.nio.ByteBuffer A;
    public final java.nio.ByteBuffer B;
    public final int L;
    public boolean R;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final byte[] d0;
    public int e0;
    public final defpackage.mr6 f0;
    public final int g0;
    public final int h0;

    public zr6(defpackage.og4 r2, java.io.InputStream r3, byte[] r4) {
            r1 = this;
            r1.<init>(r3)
            mr6 r3 = r2.g()
            r1.f0 = r3
            int r3 = r2.e()
            r1.L = r3
            int r3 = r4.length
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            r1.d0 = r3
            int r3 = r2.d()
            r1.g0 = r3
            int r4 = r3 + 1
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            r1.A = r4
            r0 = 0
            r4.limit(r0)
            int r4 = r2.c()
            int r3 = r3 - r4
            r1.h0 = r3
            int r2 = r2.f()
            int r2 = r2 + 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            r1.B = r2
            r2.limit(r0)
            r1.R = r0
            r1.X = r0
            r1.Y = r0
            r1.e0 = r0
            r1.Z = r0
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.B     // Catch: java.lang.Throwable -> L9
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r0
        L9:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            super.close()     // Catch: java.lang.Throwable -> L6
            monitor-exit(r1)
            return
        L6:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6
            throw r0
    }

    public final void e() {
            r8 = this;
        L0:
            boolean r0 = r8.X
            r1 = 1
            if (r0 != 0) goto L41
            java.nio.ByteBuffer r0 = r8.A
            int r0 = r0.remaining()
            if (r0 <= 0) goto L41
            java.io.InputStream r0 = r8.in
            java.nio.ByteBuffer r2 = r8.A
            byte[] r2 = r2.array()
            java.nio.ByteBuffer r3 = r8.A
            int r3 = r3.position()
            java.nio.ByteBuffer r4 = r8.A
            int r4 = r4.remaining()
            int r0 = r0.read(r2, r3, r4)
            if (r0 <= 0) goto L32
            java.nio.ByteBuffer r1 = r8.A
            int r2 = r1.position()
            int r2 = r2 + r0
            r1.position(r2)
            goto L0
        L32:
            r2 = -1
            if (r0 != r2) goto L38
            r8.X = r1
            goto L0
        L38:
            if (r0 == 0) goto L3b
            goto L0
        L3b:
            java.lang.String r8 = "Could not read bytes from the ciphertext stream"
            defpackage.e41.i(r8)
            return
        L41:
            boolean r0 = r8.X
            r2 = 0
            if (r0 != 0) goto L5c
            java.nio.ByteBuffer r0 = r8.A
            int r3 = r0.position()
            int r3 = r3 - r1
            byte r0 = r0.get(r3)
            java.nio.ByteBuffer r3 = r8.A
            int r4 = r3.position()
            int r4 = r4 - r1
            r3.position(r4)
            goto L5d
        L5c:
            r0 = r2
        L5d:
            java.nio.ByteBuffer r3 = r8.A
            r3.flip()
            java.nio.ByteBuffer r3 = r8.B
            r3.clear()
            mr6 r3 = r8.f0     // Catch: java.security.GeneralSecurityException -> L9a
            java.nio.ByteBuffer r4 = r8.A     // Catch: java.security.GeneralSecurityException -> L9a
            int r5 = r8.e0     // Catch: java.security.GeneralSecurityException -> L9a
            boolean r6 = r8.X     // Catch: java.security.GeneralSecurityException -> L9a
            java.nio.ByteBuffer r7 = r8.B     // Catch: java.security.GeneralSecurityException -> L9a
            r3.d(r4, r5, r6, r7)     // Catch: java.security.GeneralSecurityException -> L9a
            int r2 = r8.e0
            int r2 = r2 + r1
            r8.e0 = r2
            java.nio.ByteBuffer r2 = r8.B
            r2.flip()
            java.nio.ByteBuffer r2 = r8.A
            r2.clear()
            boolean r2 = r8.X
            if (r2 != 0) goto L99
            java.nio.ByteBuffer r2 = r8.A
            r2.clear()
            java.nio.ByteBuffer r2 = r8.A
            int r3 = r8.g0
            int r3 = r3 + r1
            r2.limit(r3)
            java.nio.ByteBuffer r8 = r8.A
            r8.put(r0)
        L99:
            return
        L9a:
            r0 = move-exception
            r8.Z = r1
            java.nio.ByteBuffer r1 = r8.B
            r1.limit(r2)
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = r8.toString()
            int r4 = r8.e0
            boolean r8 = r8.X
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = "\n"
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = "\nsegmentNr:"
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = " endOfCiphertext:"
            r5.append(r2)
            r5.append(r8)
            java.lang.String r8 = r5.toString()
            r1.<init>(r8, r0)
            throw r1
    }

    public final void h() {
            r7 = this;
            boolean r0 = r7.R
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L59
            int r0 = r7.L
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
        Lc:
            int r3 = r0.remaining()
            if (r3 <= 0) goto L45
            java.io.InputStream r3 = r7.in
            byte[] r4 = r0.array()
            int r5 = r0.position()
            int r6 = r0.remaining()
            int r3 = r3.read(r4, r5, r6)
            r4 = -1
            if (r3 == r4) goto L38
            if (r3 == 0) goto L32
            int r4 = r0.position()
            int r4 = r4 + r3
            r0.position(r4)
            goto Lc
        L32:
            java.lang.String r7 = "Could not read bytes from the ciphertext stream"
            defpackage.e41.i(r7)
            return
        L38:
            r7.Z = r2
            java.nio.ByteBuffer r7 = r7.B
            r7.limit(r1)
            java.lang.String r7 = "Ciphertext is too short"
            defpackage.e41.i(r7)
            return
        L45:
            r0.flip()
            mr6 r1 = r7.f0     // Catch: java.security.GeneralSecurityException -> L52
            byte[] r3 = r7.d0     // Catch: java.security.GeneralSecurityException -> L52
            r1.c(r0, r3)     // Catch: java.security.GeneralSecurityException -> L52
            r7.R = r2
            return
        L52:
            r7 = move-exception
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r7)
            throw r0
        L59:
            r7.Z = r2
            java.nio.ByteBuffer r7 = r7.B
            r7.limit(r1)
            java.lang.String r7 = "Decryption failed."
            defpackage.e41.i(r7)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
            r3 = this;
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            int r3 = r3.read(r1, r2, r0)
            if (r3 != r0) goto Lf
            r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
        Lf:
            r0 = -1
            if (r3 != r0) goto L13
            return r3
        L13:
            java.lang.String r3 = "Reading failed"
            defpackage.e41.i(r3)
            r3 = 0
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            int r2 = r2.read(r3, r0, r1)
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] r7, int r8, int r9) {
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.Z     // Catch: java.lang.Throwable -> L1b
            if (r0 != 0) goto L58
            boolean r0 = r6.R     // Catch: java.lang.Throwable -> L1b
            r1 = 1
            if (r0 != 0) goto L1d
            r6.h()     // Catch: java.lang.Throwable -> L1b
            java.nio.ByteBuffer r0 = r6.A     // Catch: java.lang.Throwable -> L1b
            r0.clear()     // Catch: java.lang.Throwable -> L1b
            java.nio.ByteBuffer r0 = r6.A     // Catch: java.lang.Throwable -> L1b
            int r2 = r6.h0     // Catch: java.lang.Throwable -> L1b
            int r2 = r2 + r1
            r0.limit(r2)     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r7 = move-exception
            goto L60
        L1d:
            boolean r0 = r6.Y     // Catch: java.lang.Throwable -> L1b
            r2 = -1
            if (r0 == 0) goto L24
            monitor-exit(r6)
            return r2
        L24:
            r0 = 0
        L25:
            if (r0 >= r9) goto L4e
            java.nio.ByteBuffer r3 = r6.B     // Catch: java.lang.Throwable -> L1b
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L39
            boolean r3 = r6.X     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L36
            r6.Y = r1     // Catch: java.lang.Throwable -> L1b
            goto L4e
        L36:
            r6.e()     // Catch: java.lang.Throwable -> L1b
        L39:
            java.nio.ByteBuffer r3 = r6.B     // Catch: java.lang.Throwable -> L1b
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L1b
            int r4 = r9 - r0
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L1b
            java.nio.ByteBuffer r4 = r6.B     // Catch: java.lang.Throwable -> L1b
            int r5 = r0 + r8
            r4.get(r7, r5, r3)     // Catch: java.lang.Throwable -> L1b
            int r0 = r0 + r3
            goto L25
        L4e:
            if (r0 != 0) goto L56
            boolean r7 = r6.Y     // Catch: java.lang.Throwable -> L1b
            if (r7 == 0) goto L56
            monitor-exit(r6)
            return r2
        L56:
            monitor-exit(r6)
            return r0
        L58:
            java.io.IOException r7 = new java.io.IOException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r8 = "Decryption failed."
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L1b
            throw r7     // Catch: java.lang.Throwable -> L1b
        L60:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L1b
            throw r7
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long r9) {
            r8 = this;
            int r0 = r8.g0
            long r0 = (long) r0
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 > 0) goto La
            return r2
        La:
            long r0 = java.lang.Math.min(r0, r9)
            int r0 = (int) r0
            byte[] r1 = new byte[r0]
            r4 = r9
        L12:
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L27
            long r6 = (long) r0
            long r6 = java.lang.Math.min(r6, r4)
            int r6 = (int) r6
            r7 = 0
            int r6 = r8.read(r1, r7, r6)
            if (r6 > 0) goto L24
            goto L27
        L24:
            long r6 = (long) r6
            long r4 = r4 - r6
            goto L12
        L27:
            long r9 = r9 - r4
            return r9
    }

    public final synchronized java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "\nplaintextSegment position:"
            java.lang.String r1 = "\nciphertextSgement position:"
            java.lang.String r2 = "StreamingAeadDecryptingStream\nsegmentNr:"
            monitor-enter(r4)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.e0     // Catch: java.lang.Throwable -> L7d
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "\nciphertextSegmentSize:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.g0     // Catch: java.lang.Throwable -> L7d
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "\nheaderRead:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r4.R     // Catch: java.lang.Throwable -> L7d
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "\nendOfCiphertext:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r4.X     // Catch: java.lang.Throwable -> L7d
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "\nendOfPlaintext:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r4.Y     // Catch: java.lang.Throwable -> L7d
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = "\ndecryptionErrorOccured:"
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r4.Z     // Catch: java.lang.Throwable -> L7d
            r3.append(r2)     // Catch: java.lang.Throwable -> L7d
            r3.append(r1)     // Catch: java.lang.Throwable -> L7d
            java.nio.ByteBuffer r1 = r4.A     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.position()     // Catch: java.lang.Throwable -> L7d
            r3.append(r1)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r1 = " limit:"
            r3.append(r1)     // Catch: java.lang.Throwable -> L7d
            java.nio.ByteBuffer r1 = r4.A     // Catch: java.lang.Throwable -> L7d
            int r1 = r1.limit()     // Catch: java.lang.Throwable -> L7d
            r3.append(r1)     // Catch: java.lang.Throwable -> L7d
            r3.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.nio.ByteBuffer r0 = r4.B     // Catch: java.lang.Throwable -> L7d
            int r0 = r0.position()     // Catch: java.lang.Throwable -> L7d
            r3.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = " limit:"
            r3.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.nio.ByteBuffer r0 = r4.B     // Catch: java.lang.Throwable -> L7d
            int r0 = r0.limit()     // Catch: java.lang.Throwable -> L7d
            r3.append(r0)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L7d
            monitor-exit(r4)
            return r0
        L7d:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L7d
            throw r0
    }
}
