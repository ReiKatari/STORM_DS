package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z73  reason: default package */
/* loaded from: classes.dex */
public final class z73 extends java.io.InputStream {
    public boolean A;
    public java.io.InputStream B;
    public java.io.InputStream L;
    public defpackage.m44 R;
    public byte[] X;

    @Override // java.io.InputStream
    public final synchronized int available() {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.B     // Catch: java.lang.Throwable -> Le
            if (r0 != 0) goto L8
            monitor-exit(r1)
            r1 = 0
            return r1
        L8:
            int r0 = r0.available()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
            r1 = this;
            monitor-enter(r1)
            java.io.InputStream r0 = r1.L     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.InputStream
    public final synchronized int read() {
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            byte[] r1 = new byte[r0]     // Catch: java.lang.Throwable -> Lf
            int r2 = r3.read(r1)     // Catch: java.lang.Throwable -> Lf
            if (r2 != r0) goto L11
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r3)
            return r0
        Lf:
            r0 = move-exception
            goto L14
        L11:
            monitor-exit(r3)
            r3 = -1
            return r3
        L14:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] r3) {
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.length     // Catch: java.lang.Throwable -> L9
            r1 = 0
            int r3 = r2.read(r3, r1, r0)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r2)
            return r3
        L9:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9
            throw r3
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] r6, int r7, int r8) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            if (r8 != 0) goto L6
            monitor-exit(r5)
            return r0
        L6:
            java.io.InputStream r1 = r5.B     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            int r6 = r1.read(r6, r7, r8)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r5)
            return r6
        L10:
            r6 = move-exception
            goto L80
        L12:
            boolean r1 = r5.A     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L78
            r1 = 1
            r5.A = r1     // Catch: java.lang.Throwable -> L10
            m44 r1 = r5.R     // Catch: java.lang.Throwable -> L10
            byte[] r2 = defpackage.n16.l     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.B     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch: java.lang.Throwable -> L10
            z25 r3 = new z25     // Catch: java.lang.Throwable -> L10
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L10
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L2f
            goto L31
        L2f:
            java.util.List r1 = java.util.Collections.EMPTY_LIST     // Catch: java.lang.Throwable -> L10
        L31:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L10
        L35:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L10
            if (r2 == 0) goto L70
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L10
            y25 r2 = (defpackage.y25) r2     // Catch: java.lang.Throwable -> L10
            java.lang.Object r2 = r2.a     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            xr6 r2 = (defpackage.xr6) r2     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            java.io.InputStream r3 = r5.L     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            byte[] r4 = r5.X     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            java.io.InputStream r2 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            int r3 = r2.read(r6, r7, r8)     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            if (r3 == 0) goto L5c
            r5.B = r2     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            java.io.InputStream r2 = r5.L     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            r2.mark(r0)     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            monitor-exit(r5)
            return r3
        L5c:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            java.lang.String r3 = "Could not read bytes from the ciphertext stream"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
            throw r2     // Catch: java.lang.Throwable -> L10 java.security.GeneralSecurityException -> L64 java.io.IOException -> L6a
        L64:
            java.io.InputStream r2 = r5.L     // Catch: java.lang.Throwable -> L10
            r2.reset()     // Catch: java.lang.Throwable -> L10
            goto L35
        L6a:
            java.io.InputStream r2 = r5.L     // Catch: java.lang.Throwable -> L10
            r2.reset()     // Catch: java.lang.Throwable -> L10
            goto L35
        L70:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "No matching key found for the ciphertext in the stream."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L10
            throw r6     // Catch: java.lang.Throwable -> L10
        L78:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> L10
            java.lang.String r7 = "No matching key found for the ciphertext in the stream."
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L10
            throw r6     // Catch: java.lang.Throwable -> L10
        L80:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L10
            throw r6
    }
}
