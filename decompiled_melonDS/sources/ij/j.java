package ij;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends d {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f7094c = new byte[1];

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7095b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Class[] clsArr, int i2) {
        super(clsArr);
        this.f7095b = i2;
    }

    public static int c(f fVar) {
        byte[] bArr = fVar.f7092d;
        if (bArr != null) {
            if (bArr.length >= 1) {
                byte b10 = bArr[0];
                int i2 = b10 & 255;
                if ((b10 & 192) == 0) {
                    if (i2 <= 40) {
                        if (i2 == 40) {
                            return -1;
                        }
                        return ((b10 & 1) | 2) << ((i2 / 2) + 11);
                    }
                    fj.j.h("Dictionary larger than 4GiB maximum size");
                    return 0;
                }
                fj.j.h("Unsupported LZMA2 property bits");
                return 0;
            }
            fj.j.h("LZMA2 properties too short");
            return 0;
        }
        fj.j.h("Missing LZMA2 properties");
        return 0;
    }

    public static int d(f fVar) {
        byte[] bArr = fVar.f7092d;
        long j2 = 0;
        int i2 = 0;
        while (i2 < 4) {
            int i10 = 1 + i2;
            j2 |= (bArr[i10] & 255) << (i2 * 8);
            i2 = i10;
        }
        return (int) j2;
    }

    @Override // ij.d
    public final InputStream a(String str, InputStream inputStream, long j2, f fVar, byte[] bArr, int i2) {
        int i10;
        switch (this.f7095b) {
            case 0:
                Inflater inflater = new Inflater(true);
                return new i(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(f7094c)), inflater), inflater, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new b(inputStream, fVar, str, bArr);
            case 2:
                return new kj.b(inputStream);
            case 3:
                return inputStream;
            case 4:
                return new lj.a(inputStream);
            case l1.c.f8511g /* 5 */:
                byte[] bArr2 = fVar.f7092d;
                if (bArr2 != null && bArr2.length != 0) {
                    i10 = (bArr2[0] & 255) + 1;
                } else {
                    i10 = 1;
                }
                if (i10 >= 1 && i10 <= 256) {
                    zj.b bVar = zj.b.f15153a;
                    return new zj.h(inputStream, i10);
                }
                throw new IOException(w.d.l(i10, "Delta distance must be in the range [1, 256]: "));
            case l1.c.f8509e /* 6 */:
                try {
                    int c4 = c(fVar);
                    int i11 = (zj.j.i(c4) / 1024) + 104;
                    if (i11 <= i2) {
                        return new zj.j(inputStream, c4, zj.b.f15153a);
                    }
                    throw new hj.a(i2, i11);
                } catch (IllegalArgumentException e6) {
                    throw new IOException(e6);
                }
            default:
                byte[] bArr3 = fVar.f7092d;
                if (bArr3 != null) {
                    if (bArr3.length >= 1) {
                        byte b10 = bArr3[0];
                        int d4 = d(fVar);
                        if (d4 <= 2147483632) {
                            int i12 = zj.l.f15163e0;
                            if (d4 >= 0 && d4 <= 2147483632) {
                                int i13 = b10 & 255;
                                if (i13 <= 224) {
                                    int i14 = i13 % 45;
                                    int i15 = i14 / 9;
                                    int i16 = i14 - (i15 * 9);
                                    if (i16 >= 0 && i16 <= 8 && i15 >= 0 && i15 <= 4) {
                                        int d10 = ((1536 << (i16 + i15)) / 1024) + (zj.l.d(d4) / 1024) + 10;
                                        if (d10 <= i2) {
                                            zj.l lVar = new zj.l(inputStream, j2, b10, d4);
                                            lVar.Z = true;
                                            return lVar;
                                        }
                                        throw new hj.a(i2, d10);
                                    }
                                    a0.j.h("Invalid lc or lp");
                                } else {
                                    throw new IOException("Invalid LZMA properties byte");
                                }
                            } else {
                                throw new IOException("LZMA dictionary is too big for this implementation");
                            }
                        } else {
                            fj.j.n(str, "Dictionary larger than 4GiB maximum size used in ");
                        }
                        return null;
                    }
                    fj.j.h("LZMA properties too short");
                    return null;
                }
                fj.j.h("Missing LZMA properties");
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [zj.k, java.lang.Object] */
    @Override // ij.d
    public Object b(f fVar) {
        switch (this.f7095b) {
            case l1.c.f8511g /* 5 */:
                byte[] bArr = fVar.f7092d;
                int i2 = 1;
                if (bArr != null && bArr.length != 0) {
                    i2 = 1 + (bArr[0] & 255);
                }
                return Integer.valueOf(i2);
            case l1.c.f8509e /* 6 */:
                return Integer.valueOf(c(fVar));
            case 7:
                byte[] bArr2 = fVar.f7092d;
                if (bArr2 != null) {
                    if (bArr2.length >= 1) {
                        int i10 = bArr2[0] & 255;
                        int i11 = i10 / 45;
                        int i12 = i10 - (i11 * 45);
                        int i13 = i12 / 9;
                        int i14 = i12 - (i13 * 9);
                        ?? obj = new Object();
                        try {
                            obj.A = zj.k.B[6];
                            if (i11 >= 0 && i11 <= 4) {
                                if (i14 >= 0 && i13 >= 0 && i14 <= 4 && i13 <= 4 && i14 + i13 <= 4) {
                                    int d4 = d(fVar);
                                    if (d4 >= 4096) {
                                        if (d4 <= 805306368) {
                                            obj.A = d4;
                                            return obj;
                                        }
                                        throw new IOException(w.d.m("LZMA2 dictionary size must not exceed 768 MiB: ", d4, " B"));
                                    }
                                    throw new IOException(w.d.m("LZMA2 dictionary size must be at least 4 KiB: ", d4, " B"));
                                }
                                throw new IOException(kc.a.d(i14, i13, "lc + lp must not exceed 4: ", " + "));
                            }
                            throw new IOException(w.d.l(i11, "pb must not exceed 4: "));
                        } catch (zj.n unused) {
                            throw new RuntimeException();
                        }
                    }
                    fj.j.h("LZMA properties too short");
                } else {
                    fj.j.h("Missing LZMA properties");
                }
                return null;
            default:
                return super.b(fVar);
        }
    }
}
