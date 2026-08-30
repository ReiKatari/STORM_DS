package lj;

import a0.j;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements Closeable {
    public static final short[] Y = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    public static final int[] Z = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};

    /* renamed from: b0  reason: collision with root package name */
    public static final int[] f9182b0 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};

    /* renamed from: c0  reason: collision with root package name */
    public static final int[] f9183c0;

    /* renamed from: d0  reason: collision with root package name */
    public static final int[] f9184d0;
    public boolean A;
    public mj.a L;
    public final InputStream R;
    public final b X = new b();
    public k0.d B = new Object();

    static {
        int[] iArr = new int[288];
        f9183c0 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        Arrays.fill(iArr2, 5);
        f9184d0 = iArr2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, k0.d] */
    public f(InputStream inputStream) {
        this.L = new mj.a(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.R = inputStream;
    }

    public static dk.a d(int[] iArr) {
        int[] iArr2 = new int[65];
        int i2 = 0;
        for (int i10 : iArr) {
            if (i10 >= 0 && i10 <= 64) {
                i2 = Math.max(i2, i10);
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                j.h(w.d.m("Invalid code ", i10, " in literal table"));
                return null;
            }
        }
        int i11 = i2 + 1;
        int[] copyOf = Arrays.copyOf(iArr2, i11);
        int[] iArr3 = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 <= i2; i13++) {
            i12 = (i12 + copyOf[i13]) << 1;
            iArr3[i13] = i12;
        }
        dk.a aVar = new dk.a(0);
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 != 0) {
                int i16 = i15 - 1;
                int i17 = iArr3[i16];
                dk.a aVar2 = aVar;
                int i18 = i16;
                while (true) {
                    int i19 = aVar2.f4111b;
                    if (i18 >= 0) {
                        if (((1 << i18) & i17) == 0) {
                            if (((dk.a) aVar2.f4113d) == null && aVar2.f4112c == -1) {
                                aVar2.f4113d = new dk.a(i19 + 1);
                            }
                            aVar2 = (dk.a) aVar2.f4113d;
                        } else {
                            if (((dk.a) aVar2.f4114e) == null && aVar2.f4112c == -1) {
                                aVar2.f4114e = new dk.a(i19 + 1);
                            }
                            aVar2 = (dk.a) aVar2.f4114e;
                        }
                        if (aVar2 == null) {
                            j.p("node doesn't exist in Huffman tree");
                            return null;
                        }
                        i18--;
                    } else {
                        aVar2.f4112c = i14;
                        aVar2.f4113d = null;
                        aVar2.f4114e = null;
                        iArr3[i16] = iArr3[i16] + 1;
                        break;
                    }
                }
            }
        }
        return aVar;
    }

    public static int m(mj.a aVar, dk.a aVar2) {
        Object obj;
        while (aVar2 != null && aVar2.f4112c == -1) {
            if (t(aVar, 1) == 0) {
                obj = aVar2.f4113d;
            } else {
                obj = aVar2.f4114e;
            }
            aVar2 = (dk.a) obj;
        }
        if (aVar2 == null) {
            return -1;
        }
        return aVar2.f4112c;
    }

    public static long t(mj.a aVar, int i2) {
        long d4 = aVar.d(i2);
        if (d4 != -1) {
            return d4;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k0.d] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = new Object();
        this.L = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(byte[] bArr, int i2, int i10) {
        boolean z10;
        mj.a aVar;
        int t5;
        long t10;
        while (true) {
            if (this.A && !this.B.C()) {
                return -1;
            }
            if (this.B.L() == g.INITIAL) {
                char c4 = 1;
                if (t(this.L, 1) == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.A = z10;
                int i11 = 2;
                int t11 = (int) t(this.L, 2);
                if (t11 != 0) {
                    if (t11 != 1) {
                        if (t11 == 2) {
                            int[][] iArr = {new int[(int) (t(this.L, 5) + 257)], new int[(int) (t(this.L, 5) + 1)]};
                            mj.a aVar2 = this.L;
                            int[] iArr2 = iArr[0];
                            int[] iArr3 = iArr[1];
                            int t12 = (int) (t(aVar2, 4) + 4);
                            int[] iArr4 = new int[19];
                            int i12 = 0;
                            while (i12 < t12) {
                                iArr4[f9182b0[i12]] = (int) t(aVar2, 3);
                                i12++;
                                c4 = c4;
                            }
                            char c10 = c4;
                            dk.a d4 = d(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr5 = new int[length];
                            int i13 = 0;
                            int i14 = 0;
                            int i15 = -1;
                            while (i13 < length) {
                                if (i14 > 0) {
                                    iArr5[i13] = i15;
                                    i14--;
                                    i13++;
                                } else {
                                    int m = m(aVar2, d4);
                                    if (m < 16) {
                                        iArr5[i13] = m;
                                        t5 = i14;
                                        i13++;
                                        i15 = m;
                                        aVar = aVar2;
                                    } else {
                                        long j2 = 3;
                                        switch (m) {
                                            case 16:
                                                aVar = aVar2;
                                                t5 = (int) (t(aVar2, i11) + 3);
                                                break;
                                            case 17:
                                                t10 = t(aVar2, 3);
                                                i14 = (int) (t10 + j2);
                                                i15 = 0;
                                                aVar = aVar2;
                                                t5 = i14;
                                                break;
                                            case 18:
                                                t10 = t(aVar2, 7);
                                                j2 = 11;
                                                i14 = (int) (t10 + j2);
                                                i15 = 0;
                                                aVar = aVar2;
                                                t5 = i14;
                                                break;
                                            default:
                                                aVar = aVar2;
                                                t5 = i14;
                                                break;
                                        }
                                    }
                                    i14 = t5;
                                    aVar2 = aVar;
                                    i11 = 2;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.B = new c(this, g.DYNAMIC_CODES, iArr[0], iArr[c10]);
                        } else {
                            j.p(w.d.l(t11, "Unsupported compression: "));
                            return 0;
                        }
                    } else {
                        this.B = new c(this, g.FIXED_CODES, f9183c0, f9184d0);
                    }
                } else {
                    mj.a aVar3 = this.L;
                    int i16 = aVar3.R % 8;
                    if (i16 > 0) {
                        aVar3.i(i16);
                    }
                    long t13 = t(this.L, 16);
                    if ((65535 & (t13 ^ 65535)) == t(this.L, 16)) {
                        this.B = new e(this, t13);
                    } else {
                        j.p("Illegal LEN / NLEN values");
                        return 0;
                    }
                }
            } else {
                int D = this.B.D(bArr, i2, i10);
                if (D != 0) {
                    return D;
                }
            }
        }
    }
}
