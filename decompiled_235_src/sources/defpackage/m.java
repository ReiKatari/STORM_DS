package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m  reason: default package */
/* loaded from: classes.dex */
public final class m extends InputStream {
    public final InputStream A;
    public final ps0 B;
    public final String L;
    public final byte[] R;
    public boolean X;
    public CipherInputStream Y;

    public m(InputStream inputStream, ps0 ps0Var, String str, byte[] bArr) {
        this.A = inputStream;
        this.B = ps0Var;
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

    public final CipherInputStream e() {
        byte[] digest;
        if (this.X) {
            return this.Y;
        }
        ps0 ps0Var = this.B;
        byte[] bArr = ps0Var.d;
        String str = this.L;
        if (bArr != null) {
            if (bArr.length >= 2) {
                int i = 0;
                int i2 = bArr[0];
                int i3 = i2 & 255;
                int i4 = i2 & 63;
                int i5 = bArr[1];
                int i6 = ((i3 >> 6) & 1) + (i5 & 15);
                int i7 = ((i3 >> 7) & 1) + ((i5 & 255) >> 4);
                int i8 = i7 + 2;
                if (i8 + i6 <= bArr.length) {
                    byte[] bArr2 = new byte[i7];
                    System.arraycopy(bArr, 2, bArr2, 0, i7);
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(ps0Var.d, i8, bArr3, 0, i6);
                    byte[] bArr4 = this.R;
                    if (bArr4 != null) {
                        if (i4 == 63) {
                            digest = new byte[32];
                            System.arraycopy(bArr2, 0, digest, 0, i7);
                            System.arraycopy(bArr4, 0, digest, i7, Math.min(bArr4.length, 32 - i7));
                        } else {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                                byte[] bArr5 = new byte[8];
                                long j = 0;
                                while (j < (1 << i4)) {
                                    messageDigest.update(bArr2);
                                    messageDigest.update(bArr4);
                                    messageDigest.update(bArr5);
                                    for (int i9 = i; i9 < 8; i9++) {
                                        byte b = (byte) (bArr5[i9] + 1);
                                        bArr5[i9] = b;
                                        if (b != 0) {
                                            break;
                                        }
                                    }
                                    j++;
                                    i = 0;
                                }
                                digest = messageDigest.digest();
                            } catch (NoSuchAlgorithmException e) {
                                throw new IllegalStateException("SHA-256 is unsupported by your Java implementation", e);
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
                        } catch (GeneralSecurityException e2) {
                            throw new IllegalStateException("Decryption error (do you have the JCE Unlimited Strength Jurisdiction Policy Files installed?)", e2);
                        }
                    }
                    throw new IOException(lb1.A("Cannot read encrypted content from ", str, " without a password."));
                }
                e41.i(i61.m("Salt size + IV size too long in ", str));
                return null;
            }
            e41.i(i61.m("AES256 properties too short in ", str));
            return null;
        }
        e41.i(i61.m("Missing AES256 properties in ", str));
        return null;
    }

    @Override // java.io.InputStream
    public final int read() {
        return e().read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return e().read(bArr, i, i2);
    }
}
