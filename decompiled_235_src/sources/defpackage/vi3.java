package defpackage;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi3  reason: default package */
/* loaded from: classes.dex */
public final class vi3 extends InputStream {
    public final mu A;
    public DataInputStream B;
    public ui3 L;
    public od5 R;
    public xi3 X;
    public int Y = 0;
    public boolean Z = false;
    public boolean d0 = true;
    public boolean e0 = true;
    public boolean f0 = false;
    public IOException g0 = null;
    public final byte[] h0 = new byte[1];

    public vi3(InputStream inputStream, int i, mu muVar) {
        inputStream.getClass();
        this.A = muVar;
        this.B = new DataInputStream(inputStream);
        this.R = new od5(muVar);
        this.L = new ui3(h(i), muVar);
    }

    public static int h(int i) {
        if (i >= 4096 && i <= 2147483632) {
            return (i + 15) & (-16);
        }
        i.h(lb1.g(i, "Unsupported dictionary size "));
        return 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        DataInputStream dataInputStream = this.B;
        if (dataInputStream != null) {
            IOException iOException = this.g0;
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
            ui3 ui3Var = this.L;
            if (ui3Var != null) {
                byte[] bArr = ui3Var.a;
                mu muVar = this.A;
                muVar.b(bArr);
                this.L = null;
                muVar.b(this.R.d);
                this.R = null;
            }
            try {
                this.B.close();
            } finally {
                this.B = null;
            }
        }
    }

    public final void e() {
        int readUnsignedByte = this.B.readUnsignedByte();
        if (readUnsignedByte == 0) {
            this.f0 = true;
            ui3 ui3Var = this.L;
            if (ui3Var != null) {
                byte[] bArr = ui3Var.a;
                mu muVar = this.A;
                muVar.b(bArr);
                this.L = null;
                muVar.b(this.R.d);
                this.R = null;
                return;
            }
            return;
        }
        if (readUnsignedByte < 224 && readUnsignedByte != 1) {
            if (this.d0) {
                throw new e71();
            }
        } else {
            this.e0 = true;
            this.d0 = false;
            ui3 ui3Var2 = this.L;
            ui3Var2.c = 0;
            ui3Var2.d = 0;
            ui3Var2.e = 0;
            ui3Var2.f = 0;
            ui3Var2.a[ui3Var2.b - 1] = 0;
        }
        if (readUnsignedByte >= 128) {
            this.Z = true;
            int i = (readUnsignedByte & 31) << 16;
            this.Y = i;
            this.Y = this.B.readUnsignedShort() + 1 + i;
            int readUnsignedShort = this.B.readUnsignedShort();
            int i2 = readUnsignedShort + 1;
            if (readUnsignedByte >= 192) {
                this.e0 = false;
                int readUnsignedByte2 = this.B.readUnsignedByte();
                if (readUnsignedByte2 <= 224) {
                    int i3 = readUnsignedByte2 / 45;
                    int i4 = readUnsignedByte2 - (i3 * 45);
                    int i5 = i4 / 9;
                    int i6 = i4 - (i5 * 9);
                    if (i6 + i5 <= 4) {
                        this.X = new xi3(this.L, this.R, i6, i5, i3);
                    } else {
                        throw new e71();
                    }
                } else {
                    throw new e71();
                }
            } else if (!this.e0) {
                if (readUnsignedByte >= 160) {
                    this.X.b();
                }
            } else {
                throw new e71();
            }
            od5 od5Var = this.R;
            DataInputStream dataInputStream = this.B;
            od5Var.getClass();
            if (i2 >= 5) {
                if (dataInputStream.readUnsignedByte() == 0) {
                    od5Var.c = dataInputStream.readInt();
                    od5Var.b = -1;
                    int i7 = readUnsignedShort - 4;
                    byte[] bArr2 = od5Var.d;
                    int length = bArr2.length - i7;
                    od5Var.e = length;
                    dataInputStream.readFully(bArr2, length, i7);
                    return;
                }
                throw new e71();
            }
            throw new e71();
        } else if (readUnsignedByte <= 2) {
            this.Z = false;
            this.Y = this.B.readUnsignedShort() + 1;
        } else {
            throw new e71();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
        throw new defpackage.e71();
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        boolean z;
        if (i >= 0 && i2 >= 0 && (i3 = i + i2) >= 0 && i3 <= bArr.length) {
            if (i2 == 0) {
                return 0;
            }
            if (this.B != null) {
                IOException iOException = this.g0;
                if (iOException == null) {
                    if (!this.f0) {
                        int i4 = 0;
                        while (true) {
                            if (i2 <= 0) {
                                break;
                            }
                            try {
                                if (this.Y == 0) {
                                    e();
                                    if (this.f0) {
                                        if (i4 == 0) {
                                            return -1;
                                        }
                                    }
                                }
                                int min = Math.min(this.Y, i2);
                                boolean z2 = this.Z;
                                ui3 ui3Var = this.L;
                                if (!z2) {
                                    DataInputStream dataInputStream = this.B;
                                    int min2 = Math.min(ui3Var.b - ui3Var.d, min);
                                    dataInputStream.readFully(ui3Var.a, ui3Var.d, min2);
                                    int i5 = ui3Var.d + min2;
                                    ui3Var.d = i5;
                                    if (ui3Var.e < i5) {
                                        ui3Var.e = i5;
                                    }
                                } else {
                                    int i6 = ui3Var.b;
                                    int i7 = ui3Var.d;
                                    if (i6 - i7 <= min) {
                                        ui3Var.f = i6;
                                    } else {
                                        ui3Var.f = i7 + min;
                                    }
                                    this.X.a();
                                }
                                ui3 ui3Var2 = this.L;
                                int i8 = ui3Var2.d;
                                int i9 = ui3Var2.c;
                                int i10 = i8 - i9;
                                if (i8 == ui3Var2.b) {
                                    ui3Var2.d = 0;
                                }
                                System.arraycopy(ui3Var2.a, i9, bArr, i, i10);
                                ui3Var2.c = ui3Var2.d;
                                i += i10;
                                i2 -= i10;
                                i4 += i10;
                                int i11 = this.Y - i10;
                                this.Y = i11;
                                if (i11 == 0) {
                                    od5 od5Var = this.R;
                                    if (od5Var.e != od5Var.d.length || od5Var.c != 0) {
                                        break;
                                    }
                                    if (this.L.g > 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        break;
                                    }
                                }
                            } catch (IOException e) {
                                this.g0 = e;
                                throw e;
                            }
                        }
                        return i4;
                    }
                    return -1;
                }
                throw iOException;
            }
            throw new IOException("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.h0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
