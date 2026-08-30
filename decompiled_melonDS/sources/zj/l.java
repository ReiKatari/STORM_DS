package zj;

import java.io.IOException;
import java.io.InputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l extends InputStream {

    /* renamed from: e0  reason: collision with root package name */
    public static final /* synthetic */ int f15163e0 = 0;
    public InputStream A;
    public final b B;
    public ck.a L;
    public final ek.c R;
    public final dk.b X;

    /* renamed from: c0  reason: collision with root package name */
    public long f15165c0;
    public boolean Y = false;
    public boolean Z = false;

    /* renamed from: b0  reason: collision with root package name */
    public final byte[] f15164b0 = new byte[1];

    /* renamed from: d0  reason: collision with root package name */
    public IOException f15166d0 = null;

    public l(InputStream inputStream, long j2, byte b10, int i2) {
        b bVar = b.f15153a;
        int i10 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if (i10 >= 0) {
            int i11 = b10 & 255;
            if (i11 <= 224) {
                int i12 = i11 / 45;
                int i13 = i11 - (i12 * 45);
                int i14 = i13 / 9;
                int i15 = i13 - (i14 * 9);
                if (i2 >= 0 && i2 <= 2147483632) {
                    if (i10 >= 0 && i15 >= 0 && i15 <= 8 && i14 >= 0 && i14 <= 4 && i12 >= 0 && i12 <= 4) {
                        this.A = inputStream;
                        this.B = bVar;
                        int d4 = d(i2);
                        if (j2 >= 0 && d4 > j2) {
                            d4 = d((int) j2);
                        }
                        this.L = new ck.a(d(d4), bVar);
                        ek.c cVar = new ek.c(inputStream);
                        this.R = cVar;
                        this.X = new dk.b(this.L, cVar, i15, i14, i12);
                        this.f15165c0 = j2;
                        return;
                    }
                    fj.j.b();
                    throw null;
                }
                throw new IOException("LZMA dictionary is too big for this implementation");
            }
            throw new IOException("Invalid LZMA properties byte");
        }
        throw new IOException("Uncompressed size is too big");
    }

    public static int d(int i2) {
        if (i2 >= 0 && i2 <= 2147483632) {
            if (i2 < 4096) {
                i2 = 4096;
            }
            return (i2 + 15) & (-16);
        }
        a0.j.h("LZMA dictionary is too big for this implementation");
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A != null) {
            ck.a aVar = this.L;
            if (aVar != null) {
                this.B.b(aVar.f2902a);
                this.L = null;
            }
            try {
                this.A.close();
            } finally {
                this.A = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (i2 >= 0 && i10 >= 0 && (i11 = i2 + i10) >= 0 && i11 <= bArr.length) {
            boolean z14 = false;
            if (i10 == 0) {
                return 0;
            }
            if (this.A != null) {
                IOException iOException = this.f15166d0;
                if (iOException == null) {
                    if (this.Y) {
                        return -1;
                    }
                    int i13 = i2;
                    int i14 = i10;
                    int i15 = 0;
                    while (i14 > 0) {
                        try {
                            long j2 = this.f15165c0;
                            if (j2 >= 0 && j2 < i14) {
                                i12 = (int) j2;
                            } else {
                                i12 = i14;
                            }
                            ck.a aVar = this.L;
                            int i16 = aVar.f2903b;
                            int i17 = aVar.f2905d;
                            if (i16 - i17 <= i12) {
                                aVar.f2907f = i16;
                            } else {
                                aVar.f2907f = i17 + i12;
                            }
                            try {
                                this.X.a();
                            } catch (g e6) {
                                if (this.f15165c0 == -1) {
                                    if (this.X.f4116b[0] == -1) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        this.Y = true;
                                        this.R.f();
                                    }
                                }
                                throw e6;
                            }
                            ck.a aVar2 = this.L;
                            int i18 = aVar2.f2905d;
                            int i19 = aVar2.f2904c;
                            int i20 = i18 - i19;
                            if (i18 == aVar2.f2903b) {
                                aVar2.f2905d = 0;
                            }
                            System.arraycopy(aVar2.f2902a, i19, bArr, i13, i20);
                            aVar2.f2904c = aVar2.f2905d;
                            i13 += i20;
                            i14 -= i20;
                            i15 += i20;
                            long j10 = this.f15165c0;
                            if (j10 >= 0) {
                                long j11 = j10 - i20;
                                this.f15165c0 = j11;
                                if (j11 == 0) {
                                    this.Y = true;
                                }
                            }
                            if (this.Y) {
                                ck.a aVar3 = this.L;
                                if (aVar3.f2908g > 0) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (!z11) {
                                    if (this.R.f4507c == 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (!z12) {
                                        if (this.f15165c0 != -1 && this.Z) {
                                            int i21 = aVar3.f2903b;
                                            int i22 = aVar3.f2905d;
                                            if (i21 - i22 <= 1) {
                                                aVar3.f2907f = i21;
                                            } else {
                                                aVar3.f2907f = i22 + 1;
                                            }
                                            try {
                                                this.X.a();
                                            } catch (g e10) {
                                                if (this.X.f4116b[0] == -1) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                if (z13) {
                                                    this.R.f();
                                                    if (this.R.f4507c == 0) {
                                                        z14 = true;
                                                    }
                                                    if (z14) {
                                                    }
                                                } else {
                                                    throw e10;
                                                }
                                            }
                                            throw new g();
                                        }
                                        throw new g();
                                    }
                                    ck.a aVar4 = this.L;
                                    if (aVar4 != null) {
                                        this.B.b(aVar4.f2902a);
                                        this.L = null;
                                    }
                                    if (i15 == 0) {
                                        return -1;
                                    }
                                    return i15;
                                }
                                throw new g();
                            }
                        } catch (IOException e11) {
                            this.f15166d0 = e11;
                            throw e11;
                        }
                    }
                    return i15;
                }
                throw iOException;
            }
            throw new IOException("Stream closed");
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f15164b0;
        if (read(bArr, 0, 1) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }
}
