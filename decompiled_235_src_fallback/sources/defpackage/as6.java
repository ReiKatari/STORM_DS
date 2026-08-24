package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: as6  reason: default package */
/* loaded from: classes.dex */
public final class as6 extends java.io.FilterOutputStream {
    public final defpackage.nr6 A;
    public final int B;
    public final java.nio.ByteBuffer L;
    public final java.nio.ByteBuffer R;
    public boolean X;

    public as6(defpackage.og4 r3, java.io.FileOutputStream r4, byte[] r5) {
            r2 = this;
            r2.<init>(r4)
            nr6 r4 = r3.h(r5)
            r2.A = r4
            int r5 = r3.f()
            r2.B = r5
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r5)
            r2.L = r0
            int r1 = r3.d()
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r2.R = r1
            int r3 = r3.c()
            int r5 = r5 - r3
            r0.limit(r5)
            java.nio.ByteBuffer r3 = r4.i()
            int r4 = r3.remaining()
            byte[] r4 = new byte[r4]
            r3.get(r4)
            java.io.OutputStream r3 = r2.out
            r3.write(r4)
            r3 = 1
            r2.X = r3
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r4 = this;
            java.lang.String r0 = "ptBuffer.remaining():"
            monitor-enter(r4)
            boolean r1 = r4.X     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L9
            monitor-exit(r4)
            return
        L9:
            java.nio.ByteBuffer r1 = r4.L     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            r1.flip()     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            java.nio.ByteBuffer r1 = r4.R     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            r1.clear()     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            nr6 r1 = r4.A     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            java.nio.ByteBuffer r2 = r4.L     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            java.nio.ByteBuffer r3 = r4.R     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            r1.j(r2, r3)     // Catch: java.lang.Throwable -> L40 java.security.GeneralSecurityException -> L42
            java.nio.ByteBuffer r0 = r4.R     // Catch: java.lang.Throwable -> L40
            r0.flip()     // Catch: java.lang.Throwable -> L40
            java.io.OutputStream r0 = r4.out     // Catch: java.lang.Throwable -> L40
            java.nio.ByteBuffer r1 = r4.R     // Catch: java.lang.Throwable -> L40
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L40
            java.nio.ByteBuffer r2 = r4.R     // Catch: java.lang.Throwable -> L40
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L40
            java.nio.ByteBuffer r3 = r4.R     // Catch: java.lang.Throwable -> L40
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L40
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L40
            r0 = 0
            r4.X = r0     // Catch: java.lang.Throwable -> L40
            super.close()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r4)
            return
        L40:
            r0 = move-exception
            goto L69
        L42:
            r1 = move-exception
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.nio.ByteBuffer r0 = r4.L     // Catch: java.lang.Throwable -> L40
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L40
            r3.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = " ctBuffer.remaining():"
            r3.append(r0)     // Catch: java.lang.Throwable -> L40
            java.nio.ByteBuffer r0 = r4.R     // Catch: java.lang.Throwable -> L40
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L40
            r3.append(r0)     // Catch: java.lang.Throwable -> L40
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L40
            r2.<init>(r0, r1)     // Catch: java.lang.Throwable -> L40
            throw r2     // Catch: java.lang.Throwable -> L40
        L69:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L40
            throw r0
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int r4) {
            r3 = this;
            byte r4 = (byte) r4
            r0 = 1
            byte[] r1 = new byte[r0]
            r2 = 0
            r1[r2] = r4
            r3.write(r1, r2, r0)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] r5, int r6, int r7) {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.X     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L63
        L5:
            java.nio.ByteBuffer r0 = r4.L     // Catch: java.lang.Throwable -> L55
            int r0 = r0.remaining()     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r1 = r4.L
            if (r7 <= r0) goto L5e
            int r0 = r1.remaining()     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r5, r6, r0)     // Catch: java.lang.Throwable -> L55
            int r6 = r6 + r0
            int r7 = r7 - r0
            java.nio.ByteBuffer r0 = r4.L     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            r0.flip()     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            java.nio.ByteBuffer r0 = r4.R     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            r0.clear()     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            nr6 r0 = r4.A     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            java.nio.ByteBuffer r2 = r4.L     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            java.nio.ByteBuffer r3 = r4.R     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            r0.f(r2, r1, r3)     // Catch: java.lang.Throwable -> L55 java.security.GeneralSecurityException -> L57
            java.nio.ByteBuffer r0 = r4.R     // Catch: java.lang.Throwable -> L55
            r0.flip()     // Catch: java.lang.Throwable -> L55
            java.io.OutputStream r0 = r4.out     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r1 = r4.R     // Catch: java.lang.Throwable -> L55
            byte[] r1 = r1.array()     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r2 = r4.R     // Catch: java.lang.Throwable -> L55
            int r2 = r2.position()     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r3 = r4.R     // Catch: java.lang.Throwable -> L55
            int r3 = r3.remaining()     // Catch: java.lang.Throwable -> L55
            r0.write(r1, r2, r3)     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r0 = r4.L     // Catch: java.lang.Throwable -> L55
            r0.clear()     // Catch: java.lang.Throwable -> L55
            java.nio.ByteBuffer r0 = r4.L     // Catch: java.lang.Throwable -> L55
            int r1 = r4.B     // Catch: java.lang.Throwable -> L55
            r0.limit(r1)     // Catch: java.lang.Throwable -> L55
            goto L5
        L55:
            r5 = move-exception
            goto L6b
        L57:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L55
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L55
            throw r6     // Catch: java.lang.Throwable -> L55
        L5e:
            r1.put(r5, r6, r7)     // Catch: java.lang.Throwable -> L55
            monitor-exit(r4)
            return
        L63:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "Trying to write to closed stream"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L55
            throw r5     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L55
            throw r5
    }
}
