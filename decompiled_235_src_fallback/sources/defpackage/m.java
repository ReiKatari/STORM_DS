package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m  reason: default package */
/* loaded from: classes.dex */
public final class m extends java.io.InputStream {
    public final java.io.InputStream A;
    public final defpackage.ps0 B;
    public final java.lang.String L;
    public final byte[] R;
    public boolean X;
    public javax.crypto.CipherInputStream Y;

    public m(java.io.InputStream r1, defpackage.ps0 r2, java.lang.String r3, byte[] r4) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            r0.L = r3
            r0.R = r4
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            javax.crypto.CipherInputStream r0 = r0.Y
            if (r0 == 0) goto L7
            r0.close()
        L7:
            return
    }

    public final javax.crypto.CipherInputStream e() {
            r17 = this;
            r0 = r17
            boolean r1 = r0.X
            if (r1 == 0) goto L9
            javax.crypto.CipherInputStream r0 = r0.Y
            return r0
        L9:
            ps0 r1 = r0.B
            byte[] r2 = r1.d
            r3 = 0
            java.lang.String r4 = r0.L
            if (r2 == 0) goto Le6
            int r5 = r2.length
            r6 = 2
            if (r5 < r6) goto Ldc
            r5 = 0
            r7 = r2[r5]
            r8 = r7 & 255(0xff, float:3.57E-43)
            r9 = 63
            r7 = r7 & r9
            r10 = 1
            r11 = r2[r10]
            r12 = r11 & 255(0xff, float:3.57E-43)
            int r13 = r8 >> 6
            r13 = r13 & r10
            r11 = r11 & 15
            int r13 = r13 + r11
            int r8 = r8 >> 7
            r8 = r8 & r10
            int r11 = r12 >> 4
            int r8 = r8 + r11
            int r11 = r8 + 2
            int r12 = r11 + r13
            int r14 = r2.length
            if (r12 > r14) goto Ld2
            byte[] r3 = new byte[r8]
            java.lang.System.arraycopy(r2, r6, r3, r5, r8)
            r2 = 16
            byte[] r2 = new byte[r2]
            byte[] r1 = r1.d
            java.lang.System.arraycopy(r1, r11, r2, r5, r13)
            byte[] r1 = r0.R
            if (r1 == 0) goto Lc4
            if (r7 != r9) goto L5c
            r4 = 32
            byte[] r4 = new byte[r4]
            java.lang.System.arraycopy(r3, r5, r4, r5, r8)
            int r3 = r1.length
            int r7 = 32 - r8
            int r3 = java.lang.Math.min(r3, r7)
            java.lang.System.arraycopy(r1, r5, r4, r8, r3)
            goto L91
        L5c:
            java.lang.String r4 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.security.NoSuchAlgorithmException -> Lbb
            r8 = 8
            byte[] r9 = new byte[r8]
            r11 = 0
        L68:
            r13 = 1
            long r15 = r13 << r7
            int r15 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r15 >= 0) goto L8d
            r4.update(r3)
            r4.update(r1)
            r4.update(r9)
            r15 = r5
        L7a:
            if (r15 >= r8) goto L8a
            r16 = r9[r15]
            int r5 = r16 + 1
            byte r5 = (byte) r5
            r9[r15] = r5
            if (r5 == 0) goto L86
            goto L8a
        L86:
            int r15 = r15 + 1
            r5 = 0
            goto L7a
        L8a:
            long r11 = r11 + r13
            r5 = 0
            goto L68
        L8d:
            byte[] r4 = r4.digest()
        L91:
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r3 = "AES"
            r1.<init>(r4, r3)
            java.lang.String r3 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r3 = javax.crypto.Cipher.getInstance(r3)     // Catch: java.security.GeneralSecurityException -> Lb2
            javax.crypto.spec.IvParameterSpec r4 = new javax.crypto.spec.IvParameterSpec     // Catch: java.security.GeneralSecurityException -> Lb2
            r4.<init>(r2)     // Catch: java.security.GeneralSecurityException -> Lb2
            r3.init(r6, r1, r4)     // Catch: java.security.GeneralSecurityException -> Lb2
            javax.crypto.CipherInputStream r1 = new javax.crypto.CipherInputStream     // Catch: java.security.GeneralSecurityException -> Lb2
            java.io.InputStream r2 = r0.A     // Catch: java.security.GeneralSecurityException -> Lb2
            r1.<init>(r2, r3)     // Catch: java.security.GeneralSecurityException -> Lb2
            r0.Y = r1     // Catch: java.security.GeneralSecurityException -> Lb2
            r0.X = r10     // Catch: java.security.GeneralSecurityException -> Lb2
            return r1
        Lb2:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)"
            r1.<init>(r2, r0)
            throw r1
        Lbb:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "SHA-256 is unsupported by your Java implementation"
            r1.<init>(r2, r0)
            throw r1
        Lc4:
            gb2 r0 = new gb2
            java.lang.String r1 = "Cannot read encrypted content from "
            java.lang.String r2 = " without a password."
            java.lang.String r1 = defpackage.lb1.A(r1, r4, r2)
            r0.<init>(r1)
            throw r0
        Ld2:
            java.lang.String r0 = "Salt size + IV size too long in "
            java.lang.String r0 = defpackage.i61.m(r0, r4)
            defpackage.e41.i(r0)
            return r3
        Ldc:
            java.lang.String r0 = "AES256 properties too short in "
            java.lang.String r0 = defpackage.i61.m(r0, r4)
            defpackage.e41.i(r0)
            return r3
        Le6:
            java.lang.String r0 = "Missing AES256 properties in "
            java.lang.String r0 = defpackage.i61.m(r0, r4)
            defpackage.e41.i(r0)
            return r3
    }

    @Override // java.io.InputStream
    public final int read() {
            r0 = this;
            javax.crypto.CipherInputStream r0 = r0.e()
            int r0 = r0.read()
            return r0
    }

    @Override // java.io.InputStream
    public final int read(byte[] r1, int r2, int r3) {
            r0 = this;
            javax.crypto.CipherInputStream r0 = r0.e()
            int r0 = r0.read(r1, r2, r3)
            return r0
    }
}
