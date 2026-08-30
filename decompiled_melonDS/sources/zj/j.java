package zj;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends InputStream {
    public final b A;
    public DataInputStream B;
    public ck.a L;
    public ek.b R;
    public dk.b X;
    public int Y = 0;
    public boolean Z = false;

    /* renamed from: b0  reason: collision with root package name */
    public boolean f15158b0 = true;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f15159c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    public boolean f15160d0 = false;

    /* renamed from: e0  reason: collision with root package name */
    public IOException f15161e0 = null;

    /* renamed from: f0  reason: collision with root package name */
    public final byte[] f15162f0 = new byte[1];

    public j(InputStream inputStream, int i2, b bVar) {
        inputStream.getClass();
        this.A = bVar;
        this.B = new DataInputStream(inputStream);
        this.R = new ek.b(bVar);
        this.L = new ck.a(i(i2), bVar);
    }

    public static int i(int i2) {
        if (i2 >= 4096 && i2 <= 2147483632) {
            return (i2 + 15) & (-16);
        }
        a0.j.h(w.d.l(i2, "Unsupported dictionary size "));
        return 0;
    }

    @Override // java.io.InputStream
    public final int available() {
        DataInputStream dataInputStream = this.B;
        if (dataInputStream != null) {
            IOException iOException = this.f15161e0;
            if (iOException == null) {
                boolean z10 = this.Z;
                int i2 = this.Y;
                if (z10) {
                    return i2;
                }
                return Math.min(i2, dataInputStream.available());
            }
            throw iOException;
        }
        throw new IOException("Stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.B != null) {
            ck.a aVar = this.L;
            if (aVar != null) {
                byte[] bArr = aVar.f2902a;
                b bVar = this.A;
                bVar.b(bArr);
                this.L = null;
                bVar.b(this.R.f4508d);
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
            this.f15160d0 = true;
            ck.a aVar = this.L;
            if (aVar != null) {
                byte[] bArr = aVar.f2902a;
                b bVar = this.A;
                bVar.b(bArr);
                this.L = null;
                bVar.b(this.R.f4508d);
                this.R = null;
                return;
            }
            return;
        }
        if (readUnsignedByte < 224 && readUnsignedByte != 1) {
            if (this.f15158b0) {
                throw new g();
            }
        } else {
            this.f15159c0 = true;
            this.f15158b0 = false;
            ck.a aVar2 = this.L;
            aVar2.f2904c = 0;
            aVar2.f2905d = 0;
            aVar2.f2906e = 0;
            aVar2.f2907f = 0;
            aVar2.f2902a[aVar2.f2903b - 1] = 0;
        }
        if (readUnsignedByte >= 128) {
            this.Z = true;
            int i2 = (readUnsignedByte & 31) << 16;
            this.Y = i2;
            this.Y = this.B.readUnsignedShort() + 1 + i2;
            int readUnsignedShort = this.B.readUnsignedShort();
            int i10 = readUnsignedShort + 1;
            if (readUnsignedByte >= 192) {
                this.f15159c0 = false;
                int readUnsignedByte2 = this.B.readUnsignedByte();
                if (readUnsignedByte2 <= 224) {
                    int i11 = readUnsignedByte2 / 45;
                    int i12 = readUnsignedByte2 - (i11 * 45);
                    int i13 = i12 / 9;
                    int i14 = i12 - (i13 * 9);
                    if (i14 + i13 <= 4) {
                        this.X = new dk.b(this.L, this.R, i14, i13, i11);
                    } else {
                        throw new g();
                    }
                } else {
                    throw new g();
                }
            } else if (!this.f15159c0) {
                if (readUnsignedByte >= 160) {
                    this.X.b();
                }
            } else {
                throw new g();
            }
            ek.b bVar2 = this.R;
            DataInputStream dataInputStream = this.B;
            bVar2.getClass();
            if (i10 >= 5) {
                if (dataInputStream.readUnsignedByte() == 0) {
                    bVar2.f4507c = dataInputStream.readInt();
                    bVar2.f4506b = -1;
                    int i15 = readUnsignedShort - 4;
                    byte[] bArr2 = bVar2.f4508d;
                    int length = bArr2.length - i15;
                    bVar2.f4509e = length;
                    dataInputStream.readFully(bArr2, length, i15);
                    return;
                }
                throw new g();
            }
            throw new g();
        } else if (readUnsignedByte <= 2) {
            this.Z = false;
            this.Y = this.B.readUnsignedShort() + 1;
        } else {
            throw new g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
        throw new zj.g();
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
        throw new UnsupportedOperationException("Method not decompiled: zj.j.read(byte[], int, int):int");
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f15162f0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
