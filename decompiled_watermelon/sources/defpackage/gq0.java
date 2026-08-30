package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gq0  reason: default package */
/* loaded from: classes.dex */
public final class gq0 extends i0 {
    public static final byte[] c = new byte[1];
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gq0(Class[] clsArr, int i) {
        super(clsArr);
        this.b = i;
    }

    public static int c(cq0 cq0Var) {
        byte[] bArr = cq0Var.d;
        if (bArr != null) {
            if (bArr.length >= 1) {
                byte b = bArr[0];
                int i = b & 255;
                if ((b & 192) == 0) {
                    if (i <= 40) {
                        if (i == 40) {
                            return -1;
                        }
                        return ((b & 1) | 2) << ((i / 2) + 11);
                    }
                    f81.j("Dictionary larger than 4GiB maximum size");
                    return 0;
                }
                f81.j("Unsupported LZMA2 property bits");
                return 0;
            }
            f81.j("LZMA2 properties too short");
            return 0;
        }
        f81.j("Missing LZMA2 properties");
        return 0;
    }

    public static int d(cq0 cq0Var) {
        byte[] bArr = cq0Var.d;
        long j = 0;
        int i = 0;
        while (i < 4) {
            int i2 = 1 + i;
            j |= (bArr[i2] & 255) << (i * 8);
            i = i2;
        }
        return (int) j;
    }

    @Override // defpackage.i0
    public final InputStream a(String str, InputStream inputStream, long j, cq0 cq0Var, byte[] bArr, int i) {
        int i2;
        switch (this.b) {
            case 0:
                Inflater inflater = new Inflater(true);
                return new fq0(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(c)), inflater), inflater, 0);
            case 1:
                return new m(inputStream, cq0Var, str, bArr);
            case 2:
                return new jy(inputStream);
            case 3:
                return inputStream;
            case 4:
                return new rc1(inputStream);
            case 5:
                byte[] bArr2 = cq0Var.d;
                if (bArr2 != null && bArr2.length != 0) {
                    i2 = (bArr2[0] & 255) + 1;
                } else {
                    i2 = 1;
                }
                if (i2 >= 1 && i2 <= 256) {
                    ut utVar = ut.a;
                    return new nd1(inputStream, i2);
                }
                throw new IOException(wh1.g(i2, "Delta distance must be in the range [1, 256]: "));
            case ig7.b /* 6 */:
                try {
                    int c2 = c(cq0Var);
                    int i3 = (dc3.i(c2) / 1024) + 104;
                    if (i3 <= i) {
                        return new dc3(inputStream, c2, ut.a);
                    }
                    throw new m62(i, i3);
                } catch (IllegalArgumentException e) {
                    throw new IOException(e);
                }
            default:
                byte[] bArr3 = cq0Var.d;
                if (bArr3 != null) {
                    if (bArr3.length >= 1) {
                        byte b = bArr3[0];
                        int d = d(cq0Var);
                        if (d <= 2147483632) {
                            int i4 = gc3.f0;
                            if (d >= 0 && d <= 2147483632) {
                                int i5 = b & 255;
                                if (i5 <= 224) {
                                    int i6 = i5 % 45;
                                    int i7 = i6 / 9;
                                    int i8 = i6 - (i7 * 9);
                                    if (i8 >= 0 && i8 <= 8 && i7 >= 0 && i7 <= 4) {
                                        int d2 = ((1536 << (i8 + i7)) / 1024) + (gc3.d(d) / 1024) + 10;
                                        if (d2 <= i) {
                                            gc3 gc3Var = new gc3(inputStream, j, b, d);
                                            gc3Var.Z = true;
                                            return gc3Var;
                                        }
                                        throw new m62(i, d2);
                                    }
                                    i.i("Invalid lc or lp");
                                } else {
                                    throw new IOException("Invalid LZMA properties byte");
                                }
                            } else {
                                throw new IOException("LZMA dictionary is too big for this implementation");
                            }
                        } else {
                            f81.j(b31.p("Dictionary larger than 4GiB maximum size used in ", str));
                        }
                        return null;
                    }
                    f81.j("LZMA properties too short");
                    return null;
                }
                f81.j("Missing LZMA properties");
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [ec3, java.lang.Object] */
    @Override // defpackage.i0
    public Object b(cq0 cq0Var) {
        int i = 1;
        switch (this.b) {
            case 5:
                byte[] bArr = cq0Var.d;
                if (bArr != null && bArr.length != 0) {
                    i = 1 + (bArr[0] & 255);
                }
                return Integer.valueOf(i);
            case ig7.b /* 6 */:
                return Integer.valueOf(c(cq0Var));
            case 7:
                byte[] bArr2 = cq0Var.d;
                if (bArr2 != null) {
                    if (bArr2.length >= 1) {
                        int i2 = bArr2[0] & 255;
                        int i3 = i2 / 45;
                        int i4 = i2 - (i3 * 45);
                        int i5 = i4 / 9;
                        int i6 = i4 - (i5 * 9);
                        ?? obj = new Object();
                        try {
                            obj.A = ec3.B[6];
                            if (i3 >= 0 && i3 <= 4) {
                                if (i6 >= 0 && i5 >= 0 && i6 <= 4 && i5 <= 4 && i6 + i5 <= 4) {
                                    int d = d(cq0Var);
                                    if (d >= 4096) {
                                        if (d <= 805306368) {
                                            obj.A = d;
                                            return obj;
                                        }
                                        throw new IOException(wh1.j("LZMA2 dictionary size must not exceed 768 MiB: ", d, " B"));
                                    }
                                    throw new IOException(wh1.j("LZMA2 dictionary size must be at least 4 KiB: ", d, " B"));
                                }
                                throw new IOException(wh1.f(i6, i5, "lc + lp must not exceed 4: ", " + "));
                            }
                            throw new IOException(wh1.g(i3, "pb must not exceed 4: "));
                        } catch (q37 unused) {
                            throw new RuntimeException();
                        }
                    }
                    f81.j("LZMA properties too short");
                    return null;
                }
                f81.j("Missing LZMA properties");
                return null;
            default:
                return super.b(cq0Var);
        }
    }
}
