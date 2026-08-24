package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ts0  reason: default package */
/* loaded from: classes.dex */
public final class ts0 extends j0 {
    public static final byte[] c = new byte[1];
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts0(Class[] clsArr, int i) {
        super(clsArr);
        this.b = i;
    }

    public static int c(ps0 ps0Var) {
        byte[] bArr = ps0Var.d;
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
                    e41.i("Dictionary larger than 4GiB maximum size");
                    return 0;
                }
                e41.i("Unsupported LZMA2 property bits");
                return 0;
            }
            e41.i("LZMA2 properties too short");
            return 0;
        }
        e41.i("Missing LZMA2 properties");
        return 0;
    }

    public static int d(ps0 ps0Var) {
        byte[] bArr = ps0Var.d;
        long j = 0;
        int i = 0;
        while (i < 4) {
            int i2 = 1 + i;
            j |= (bArr[i2] & 255) << (i * 8);
            i = i2;
        }
        return (int) j;
    }

    @Override // defpackage.j0
    public final InputStream a(String str, InputStream inputStream, long j, ps0 ps0Var, byte[] bArr, int i) {
        int i2;
        switch (this.b) {
            case 0:
                Inflater inflater = new Inflater(true);
                return new ss0(new InflaterInputStream(new SequenceInputStream(inputStream, new ByteArrayInputStream(c)), inflater), inflater, 0);
            case 1:
                return new m(inputStream, ps0Var, str, bArr);
            case 2:
                return new a00(inputStream);
            case 3:
                return inputStream;
            case 4:
                return new sg1(inputStream);
            case 5:
                byte[] bArr2 = ps0Var.d;
                if (bArr2 != null && bArr2.length != 0) {
                    i2 = (bArr2[0] & 255) + 1;
                } else {
                    i2 = 1;
                }
                if (i2 >= 1 && i2 <= 256) {
                    mu muVar = mu.a;
                    return new ph1(inputStream, i2);
                }
                throw new IOException(lb1.g(i2, "Delta distance must be in the range [1, 256]: "));
            case 6:
                try {
                    int c2 = c(ps0Var);
                    int h = (vi3.h(c2) / 1024) + 104;
                    if (h <= i) {
                        return new vi3(inputStream, c2, mu.a);
                    }
                    throw new gb2(i, h);
                } catch (IllegalArgumentException e) {
                    throw new IOException(e);
                }
            default:
                byte[] bArr3 = ps0Var.d;
                if (bArr3 != null) {
                    if (bArr3.length >= 1) {
                        byte b = bArr3[0];
                        int d = d(ps0Var);
                        if (d <= 2147483632) {
                            int i3 = yi3.g0;
                            if (d >= 0 && d <= 2147483632) {
                                int i4 = b & 255;
                                if (i4 <= 224) {
                                    int i5 = i4 % 45;
                                    int i6 = i5 / 9;
                                    int i7 = i5 - (i6 * 9);
                                    if (i7 >= 0 && i7 <= 8 && i6 >= 0 && i6 <= 4) {
                                        int e2 = ((1536 << (i7 + i6)) / 1024) + (yi3.e(d) / 1024) + 10;
                                        if (e2 <= i) {
                                            yi3 yi3Var = new yi3(inputStream, j, b, d);
                                            yi3Var.Z = true;
                                            return yi3Var;
                                        }
                                        throw new gb2(i, e2);
                                    }
                                    i.h("Invalid lc or lp");
                                } else {
                                    throw new IOException("Invalid LZMA properties byte");
                                }
                            } else {
                                throw new IOException("LZMA dictionary is too big for this implementation");
                            }
                        } else {
                            e41.i(i61.m("Dictionary larger than 4GiB maximum size used in ", str));
                        }
                        return null;
                    }
                    e41.i("LZMA properties too short");
                    return null;
                }
                e41.i("Missing LZMA properties");
                return null;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [wi3, java.lang.Object] */
    @Override // defpackage.j0
    public Object b(ps0 ps0Var) {
        int i = 1;
        switch (this.b) {
            case 5:
                byte[] bArr = ps0Var.d;
                if (bArr != null && bArr.length != 0) {
                    i = 1 + (bArr[0] & 255);
                }
                return Integer.valueOf(i);
            case 6:
                return Integer.valueOf(c(ps0Var));
            case 7:
                byte[] bArr2 = ps0Var.d;
                if (bArr2 != null) {
                    if (bArr2.length >= 1) {
                        int i2 = bArr2[0] & 255;
                        int i3 = i2 / 45;
                        int i4 = i2 - (i3 * 45);
                        int i5 = i4 / 9;
                        int i6 = i4 - (i5 * 9);
                        ?? obj = new Object();
                        try {
                            obj.A = wi3.B[6];
                            if (i3 >= 0 && i3 <= 4) {
                                if (i6 >= 0 && i5 >= 0 && i6 <= 4 && i5 <= 4 && i6 + i5 <= 4) {
                                    int d = d(ps0Var);
                                    if (d >= 4096) {
                                        if (d <= 805306368) {
                                            obj.A = d;
                                            return obj;
                                        }
                                        throw new IOException(lb1.k("LZMA2 dictionary size must not exceed 768 MiB: ", d, " B"));
                                    }
                                    throw new IOException(lb1.k("LZMA2 dictionary size must be at least 4 KiB: ", d, " B"));
                                }
                                throw new IOException(lb1.j("lc + lp must not exceed 4: ", i6, i5, " + "));
                            }
                            throw new IOException(lb1.g(i3, "pb must not exceed 4: "));
                        } catch (lh7 unused) {
                            throw new RuntimeException();
                        }
                    }
                    e41.i("LZMA properties too short");
                    return null;
                }
                e41.i("Missing LZMA properties");
                return null;
            default:
                return super.b(ps0Var);
        }
    }
}
