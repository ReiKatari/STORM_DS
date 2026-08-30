package ij;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends InputStream {
    public final InputStream A;
    public final f B;
    public final String L;
    public final byte[] R;
    public boolean X;
    public CipherInputStream Y;

    public b(InputStream inputStream, f fVar, String str, byte[] bArr) {
        this.A = inputStream;
        this.B = fVar;
        this.L = str;
        this.R = bArr;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CipherInputStream cipherInputStream = this.Y;
        if (cipherInputStream != null) {
            cipherInputStream.close();
        }
    }

    public final CipherInputStream d() {
        byte[] digest;
        if (this.X) {
            return this.Y;
        }
        f fVar = this.B;
        byte[] bArr = fVar.f7092d;
        String str = this.L;
        if (bArr != null) {
            if (bArr.length >= 2) {
                int i2 = 0;
                int i10 = bArr[0];
                int i11 = i10 & 255;
                int i12 = i10 & 63;
                int i13 = bArr[1];
                int i14 = ((i11 >> 6) & 1) + (i13 & 15);
                int i15 = ((i11 >> 7) & 1) + ((i13 & 255) >> 4);
                int i16 = i15 + 2;
                if (i16 + i14 <= bArr.length) {
                    byte[] bArr2 = new byte[i15];
                    System.arraycopy(bArr, 2, bArr2, 0, i15);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(fVar.f7092d, i16, bArr3, 0, i14);
                    byte[] bArr4 = this.R;
                    if (bArr4 != null) {
                        if (i12 == 63) {
                            digest = new byte[32];
                            System.arraycopy(bArr2, 0, digest, 0, i15);
                            System.arraycopy(bArr4, 0, digest, i15, Math.min(bArr4.length, 32 - i15));
                        } else {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                byte[] bArr5 = new byte[8];
                                long j2 = 0;
                                while (j2 < (1 << i12)) {
                                    messageDigest.update(bArr2);
                                    messageDigest.update(bArr4);
                                    messageDigest.update(bArr5);
                                    for (int i17 = i2; i17 < 8; i17++) {
                                        byte b10 = (byte) (bArr5[i17] + 1);
                                        bArr5[i17] = b10;
                                        if (b10 != 0) {
                                            break;
                                        }
                                    }
                                    j2++;
                                    i2 = 0;
                                }
                                digest = messageDigest.digest();
                            } catch (NoSuchAlgorithmException e6) {
                                throw new IllegalStateException("SHA-256 is unsupported by your Java implementation", e6);
                            }
                        }
                        SecretKeySpec secretKeySpec = new SecretKeySpec(digest, "AES");
                        try {
                            Cipher cipher = Cipher.getInstance("AES/CBC/NoPadding");
                            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
                            CipherInputStream cipherInputStream = new CipherInputStream(this.A, cipher);
                            this.Y = cipherInputStream;
                            this.X = true;
                            return cipherInputStream;
                        } catch (GeneralSecurityException e10) {
                            throw new IllegalStateException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", e10);
                        }
                    }
                    throw new IOException(kc.a.g("Cannot read encrypted content from ", str, " without a password."));
                }
                fj.j.n(str, "Salt size + IV size too long in ");
                return null;
            }
            fj.j.n(str, "AES256 properties too short in ");
            return null;
        }
        fj.j.n(str, "Missing AES256 properties in ");
        return null;
    }

    @Override // java.io.InputStream
    public final int read() {
        return d().read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        return d().read(bArr, i2, i10);
    }
}
