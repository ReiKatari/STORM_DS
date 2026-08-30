package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dc3  reason: default package */
/* loaded from: classes.dex */
public final class dc3 extends InputStream {
    public final ut A;
    public DataInputStream B;
    public cc3 L;
    public e45 R;
    public fc3 X;
    public int Y = 0;
    public boolean Z = false;
    public boolean c0 = true;
    public boolean d0 = true;
    public boolean e0 = false;
    public IOException f0 = null;
    public final byte[] g0 = new byte[1];

    public dc3(InputStream inputStream, int i, ut utVar) {
        inputStream.getClass();
        this.A = utVar;
        this.B = new DataInputStream(inputStream);
        this.R = new e45(utVar);
        this.L = new cc3(i(i), utVar);
    }

    public static int i(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & (-16);
        }
        i.i(wh1.g(i, "Unsupported dictionary size "));
        return 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        DataInputStream dataInputStream = this.B;
        if (dataInputStream != null) {
            IOException iOException = this.f0;
            if (iOException == null) {
                boolean z = this.Z;
                int i = this.Y;
                if (z) {
                    return i;
                }
                return Math.min(i, dataInputStream.available());
            }
            throw iOException;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.B != null) {
            cc3 cc3Var = this.L;
            if (cc3Var != null) {
                byte[] bArr = cc3Var.a;
                ut utVar = this.A;
                utVar.b(bArr);
                this.L = null;
                utVar.b(this.R.d);
                this.R = null;
            }
            try {
                this.B.close();
            } finally {
                this.B = null;
            }
        }
    }

    public final void d() {
        int readUnsignedByte = this.B.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.e0 = true;
            cc3 cc3Var = this.L;
            if (cc3Var != null) {
                byte[] bArr = cc3Var.a;
                ut utVar = this.A;
                utVar.b(bArr);
                this.L = null;
                utVar.b(this.R.d);
                this.R = null;
                return;
            }
            return;
        }
        if (readUnsignedByte < 224 && readUnsignedByte != 1) {
            if (this.c0) {
                throw new w31();
            }
        } else {
            this.d0 = true;
            this.c0 = false;
            cc3 cc3Var2 = this.L;
            cc3Var2.c = 0;
            cc3Var2.d = 0;
            cc3Var2.e = 0;
            cc3Var2.f = 0;
            cc3Var2.a[cc3Var2.b - 1] = 0;
        }
        if (readUnsignedByte >= 128) {
            this.Z = true;
            int i = (readUnsignedByte & 31) << 16;
            this.Y = i;
            this.Y = this.B.readUnsignedShort() + 1 + i;
            int readUnsignedShort = this.B.readUnsignedShort();
            int i2 = readUnsignedShort + 1;
            if (readUnsignedByte >= 192) {
                this.d0 = false;
                int readUnsignedByte2 = this.B.readUnsignedByte();
                if (readUnsignedByte2 <= 224) {
                    int i3 = readUnsignedByte2 / 45;
                    int i4 = readUnsignedByte2 - (i3 * 45);
                    int i5 = i4 / 9;
                    int i6 = i4 - (i5 * 9);
                    if (i6 + i5 <= 4) {
                        this.X = new fc3(this.L, this.R, i6, i5, i3);
                    } else {
                        throw new w31();
                    }
                } else {
                    throw new w31();
                }
            } else if (!this.d0) {
                if (readUnsignedByte >= 160) {
                    this.X.b();
                }
            } else {
                throw new w31();
            }
            e45 e45Var = this.R;
            DataInputStream dataInputStream = this.B;
            e45Var.getClass();
            if (i2 >= 5) {
                if (dataInputStream.readUnsignedByte() == 0) {
                    e45Var.c = dataInputStream.readInt();
                    e45Var.b = -1;
                    int i7 = readUnsignedShort - 4;
                    byte[] bArr2 = e45Var.d;
                    int length = bArr2.length - i7;
                    e45Var.e = length;
                    dataInputStream.readFully(bArr2, length, i7);
                    return;
                }
                throw new w31();
            }
            throw new w31();
        } else if (readUnsignedByte <= 2) {
            this.Z = false;
            this.Y = this.B.readUnsignedShort() + 1;
        } else {
            throw new w31();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
        throw new defpackage.w31();
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(byte[] r8, int r9, int r10) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc3.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.g0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
