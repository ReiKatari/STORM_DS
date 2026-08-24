package com.github.junrar.crypt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Rijndael {
    public Rijndael() {
            r0 = this;
            r0.<init>()
            return
    }

    public static javax.crypto.Cipher buildDecipherer(java.lang.String r11, byte[] r12) {
            if (r11 == 0) goto Lc9
            r0 = 16
            byte[] r1 = new byte[r0]
            byte[] r0 = new byte[r0]
            int r2 = r11.length()
            r3 = 2
            int r2 = r2 * r3
            int r4 = r2 + 8
            byte[] r4 = new byte[r4]
            byte[] r5 = r11.getBytes()
            r6 = 0
            r7 = r6
        L18:
            int r8 = r11.length()
            if (r7 >= r8) goto L2b
            int r8 = r7 * 2
            r9 = r5[r7]
            r4[r8] = r9
            int r8 = r8 + 1
            r4[r8] = r6
            int r7 = r7 + 1
            goto L18
        L2b:
            int r11 = r12.length
            java.lang.System.arraycopy(r12, r6, r4, r2, r11)
            java.lang.String r11 = "sha-1"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)
            java.io.ByteArrayOutputStream r12 = new java.io.ByteArrayOutputStream
            r12.<init>()
            r2 = r6
        L3b:
            r5 = 262144(0x40000, float:3.67342E-40)
            if (r2 >= r5) goto L6c
            r12.write(r4)
            byte r5 = (byte) r2
            r12.write(r5)
            int r5 = r2 >>> 8
            byte r5 = (byte) r5
            r12.write(r5)
            int r5 = r2 >>> 16
            byte r5 = (byte) r5
            r12.write(r5)
            int r5 = r2 % 16384
            if (r5 != 0) goto L69
            byte[] r5 = r12.toByteArray()
            r11.update(r5)
            byte[] r5 = r11.digest()
            int r7 = r2 / 16384
            r8 = 19
            r5 = r5[r8]
            r1[r7] = r5
        L69:
            int r2 = r2 + 1
            goto L3b
        L6c:
            byte[] r12 = r12.toByteArray()
            r11.update(r12)
            byte[] r11 = r11.digest()
            r12 = r6
        L78:
            r2 = 4
            if (r12 >= r2) goto Lb3
            r4 = r6
        L7c:
            if (r4 >= r2) goto Lb0
            int r5 = r12 * 4
            int r7 = r5 + r4
            r8 = r11[r5]
            r9 = 16777216(0x1000000, float:2.3509887E-38)
            int r8 = r8 * r9
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8 = r8 & r9
            int r9 = r5 + 1
            r9 = r11[r9]
            r10 = 65536(0x10000, float:9.1835E-41)
            int r9 = r9 * r10
            r10 = 16711680(0xff0000, float:2.3418052E-38)
            r9 = r9 & r10
            r8 = r8 | r9
            int r9 = r5 + 2
            r9 = r11[r9]
            int r9 = r9 * 256
            r10 = 65280(0xff00, float:9.1477E-41)
            r9 = r9 & r10
            r8 = r8 | r9
            int r5 = r5 + 3
            r5 = r11[r5]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r5 = r5 | r8
            int r8 = r4 * 8
            int r5 = r5 >>> r8
            byte r5 = (byte) r5
            r0[r7] = r5
            int r4 = r4 + 1
            goto L7c
        Lb0:
            int r12 = r12 + 1
            goto L78
        Lb3:
            java.lang.String r11 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r11 = javax.crypto.Cipher.getInstance(r11)
            javax.crypto.spec.SecretKeySpec r12 = new javax.crypto.spec.SecretKeySpec
            java.lang.String r2 = "AES"
            r12.<init>(r0, r2)
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec
            r0.<init>(r1)
            r11.init(r3, r12, r0)
            return r11
        Lc9:
            java.security.InvalidAlgorithmParameterException r11 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r12 = "password should be specified"
            r11.<init>(r12)
            throw r11
    }
}
