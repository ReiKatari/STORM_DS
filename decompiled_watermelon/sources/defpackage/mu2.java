package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mu2  reason: default package */
/* loaded from: classes.dex */
public final class mu2 implements Closeable {
    public static final short[] Y = {96, 128, 160, 192, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    public static final int[] Z = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    public static final int[] c0 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final int[] d0;
    public static final int[] e0;
    public boolean A;
    public o20 L;
    public final InputStream R;
    public final p X = new p();
    public io2 B = new Object();

    static {
        int[] iArr = new int[288];
        d0 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        Arrays.fill(iArr2, 5);
        e0 = iArr2;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, io2] */
    public mu2(InputStream inputStream) {
        this.L = new o20(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.R = inputStream;
    }

    public static xz1 d(int[] iArr) {
        int[] iArr2 = new int[65];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 >= 0 && i2 <= 64) {
                i = Math.max(i, i2);
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                i.i(wh1.j("Invalid code ", i2, " in literal table"));
                return null;
            }
        }
        int i3 = i + 1;
        int[] copyOf = Arrays.copyOf(iArr2, i3);
        int[] iArr3 = new int[i3];
        int i4 = 0;
        for (int i5 = 0; i5 <= i; i5++) {
            i4 = (i4 + copyOf[i5]) << 1;
            iArr3[i5] = i4;
        }
        xz1 xz1Var = new xz1(0);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 != 0) {
                int i8 = i7 - 1;
                int i9 = iArr3[i8];
                xz1 xz1Var2 = xz1Var;
                int i10 = i8;
                while (true) {
                    int i11 = xz1Var2.b;
                    if (i10 >= 0) {
                        if (((1 << i10) & i9) == 0) {
                            if (((xz1) xz1Var2.d) == null && xz1Var2.c == -1) {
                                xz1Var2.d = new xz1(i11 + 1);
                            }
                            xz1Var2 = (xz1) xz1Var2.d;
                        } else {
                            if (((xz1) xz1Var2.e) == null && xz1Var2.c == -1) {
                                xz1Var2.e = new xz1(i11 + 1);
                            }
                            xz1Var2 = (xz1) xz1Var2.e;
                        }
                        if (xz1Var2 == null) {
                            i.n("node doesn't exist in Huffman tree");
                            return null;
                        }
                        i10--;
                    } else {
                        xz1Var2.c = i6;
                        xz1Var2.d = null;
                        xz1Var2.e = null;
                        iArr3[i8] = iArr3[i8] + 1;
                        break;
                    }
                }
            }
        }
        return xz1Var;
    }

    public static int p(o20 o20Var, xz1 xz1Var) {
        Object obj;
        while (xz1Var != null && xz1Var.c == -1) {
            if (w(o20Var, 1) == 0) {
                obj = xz1Var.d;
            } else {
                obj = xz1Var.e;
            }
            xz1Var = (xz1) obj;
        }
        if (xz1Var == null) {
            return -1;
        }
        return xz1Var.c;
    }

    public static long w(o20 o20Var, int i) {
        long d = o20Var.d(i);
        if (d != -1) {
            return d;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, io2] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = new Object();
        this.L = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int i(byte[] bArr, int i, int i2) {
        boolean z;
        o20 o20Var;
        int w;
        long w2;
        while (true) {
            if (this.A && !this.B.P()) {
                return -1;
            }
            if (this.B.n0() == nu2.INITIAL) {
                char c = 1;
                if (w(this.L, 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.A = z;
                int i3 = 2;
                int w3 = (int) w(this.L, 2);
                if (w3 != 0) {
                    if (w3 != 1) {
                        if (w3 == 2) {
                            int[][] iArr = {new int[(int) (w(this.L, 5) + 257)], new int[(int) (w(this.L, 5) + 1)]};
                            o20 o20Var2 = this.L;
                            int[] iArr2 = iArr[0];
                            int[] iArr3 = iArr[1];
                            int w4 = (int) (w(o20Var2, 4) + 4);
                            int[] iArr4 = new int[19];
                            int i4 = 0;
                            while (i4 < w4) {
                                iArr4[c0[i4]] = (int) w(o20Var2, 3);
                                i4++;
                                c = c;
                            }
                            char c2 = c;
                            xz1 d = d(iArr4);
                            int length = iArr2.length + iArr3.length;
                            int[] iArr5 = new int[length];
                            int i5 = 0;
                            int i6 = 0;
                            int i7 = -1;
                            while (i5 < length) {
                                if (i6 > 0) {
                                    iArr5[i5] = i7;
                                    i6--;
                                    i5++;
                                } else {
                                    int p = p(o20Var2, d);
                                    if (p < 16) {
                                        iArr5[i5] = p;
                                        w = i6;
                                        i5++;
                                        i7 = p;
                                        o20Var = o20Var2;
                                    } else {
                                        long j = 3;
                                        switch (p) {
                                            case 16:
                                                o20Var = o20Var2;
                                                w = (int) (w(o20Var2, i3) + 3);
                                                break;
                                            case 17:
                                                w2 = w(o20Var2, 3);
                                                i6 = (int) (w2 + j);
                                                i7 = 0;
                                                o20Var = o20Var2;
                                                w = i6;
                                                break;
                                            case 18:
                                                w2 = w(o20Var2, 7);
                                                j = 11;
                                                i6 = (int) (w2 + j);
                                                i7 = 0;
                                                o20Var = o20Var2;
                                                w = i6;
                                                break;
                                            default:
                                                o20Var = o20Var2;
                                                w = i6;
                                                break;
                                        }
                                    }
                                    i6 = w;
                                    o20Var2 = o20Var;
                                    i3 = 2;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.B = new ju2(this, nu2.DYNAMIC_CODES, iArr[0], iArr[c2]);
                        } else {
                            i.n(wh1.g(w3, "Unsupported compression: "));
                            return 0;
                        }
                    } else {
                        this.B = new ju2(this, nu2.FIXED_CODES, d0, e0);
                    }
                } else {
                    o20 o20Var3 = this.L;
                    int i8 = o20Var3.R % 8;
                    if (i8 > 0) {
                        o20Var3.i(i8);
                    }
                    long w5 = w(this.L, 16);
                    if ((65535 & (w5 ^ 65535)) == w(this.L, 16)) {
                        this.B = new lu2(this, w5);
                    } else {
                        i.n("Illegal LEN / NLEN values");
                        return 0;
                    }
                }
            } else {
                int i0 = this.B.i0(bArr, i, i2);
                if (i0 != 0) {
                    return i0;
                }
            }
        }
    }
}
