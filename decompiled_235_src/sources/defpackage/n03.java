package defpackage;

import com.github.junrar.rarfile.BaseBlock;
import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n03  reason: default package */
/* loaded from: classes.dex */
public final class n03 implements Closeable {
    public static final short[] Y = {96, 128, BaseBlock.LHD_WINDOW2048, BaseBlock.LHD_WINDOW4096, 224, 256, 288, 320, 353, 417, 481, 545, 610, 738, 866, 994, 1123, 1379, 1635, 1891, 2148, 2660, 3172, 3684, 4197, 5221, 6245, 7269, 112};
    public static final int[] Z = {16, 32, 48, 64, 81, 113, 146, 210, 275, 403, 532, 788, 1045, 1557, 2070, 3094, 4119, 6167, 8216, 12312, 16409, 24601, 32794, 49178, 65563, 98331, 131100, 196636, 262173, 393245, 524318, 786462};
    public static final int[] d0 = {16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15};
    public static final int[] e0;
    public static final int[] f0;
    public boolean A;
    public oi2 B;
    public n40 L;
    public final InputStream R;
    public final q X;

    static {
        int[] iArr = new int[288];
        e0 = iArr;
        Arrays.fill(iArr, 0, 144, 8);
        Arrays.fill(iArr, 144, 256, 9);
        Arrays.fill(iArr, 256, 280, 7);
        Arrays.fill(iArr, 280, 288, 8);
        int[] iArr2 = new int[32];
        Arrays.fill(iArr2, 5);
        f0 = iArr2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [oi2, java.lang.Object] */
    public n03(InputStream inputStream) {
        ?? obj = new Object();
        obj.c = new byte[65536];
        this.X = obj;
        this.L = new n40(inputStream, ByteOrder.LITTLE_ENDIAN);
        this.R = inputStream;
        this.B = new Object();
    }

    public static m42 e(int[] iArr) {
        int[] iArr2 = new int[65];
        int i = 0;
        for (int i2 : iArr) {
            if (i2 >= 0 && i2 <= 64) {
                i = Math.max(i, i2);
                iArr2[i2] = iArr2[i2] + 1;
            } else {
                i.h(lb1.k("Invalid code ", i2, " in literal table"));
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
        m42 m42Var = new m42(0);
        for (int i6 = 0; i6 < iArr.length; i6++) {
            int i7 = iArr[i6];
            if (i7 != 0) {
                int i8 = i7 - 1;
                int i9 = iArr3[i8];
                m42 m42Var2 = m42Var;
                int i10 = i8;
                while (true) {
                    int i11 = m42Var2.b;
                    if (i10 >= 0) {
                        if (((1 << i10) & i9) == 0) {
                            if (((m42) m42Var2.d) == null && m42Var2.c == -1) {
                                m42Var2.d = new m42(i11 + 1);
                            }
                            m42Var2 = (m42) m42Var2.d;
                        } else {
                            if (((m42) m42Var2.e) == null && m42Var2.c == -1) {
                                m42Var2.e = new m42(i11 + 1);
                            }
                            m42Var2 = (m42) m42Var2.e;
                        }
                        if (m42Var2 == null) {
                            i.m("node doesn't exist in Huffman tree");
                            return null;
                        }
                        i10--;
                    } else {
                        m42Var2.c = i6;
                        m42Var2.d = null;
                        m42Var2.e = null;
                        iArr3[i8] = iArr3[i8] + 1;
                        break;
                    }
                }
            }
        }
        return m42Var;
    }

    public static int k(n40 n40Var, m42 m42Var) {
        Object obj;
        while (m42Var != null && m42Var.c == -1) {
            if (n(n40Var, 1) == 0) {
                obj = m42Var.d;
            } else {
                obj = m42Var.e;
            }
            m42Var = (m42) obj;
        }
        if (m42Var == null) {
            return -1;
        }
        return m42Var.c;
    }

    public static long n(n40 n40Var, int i) {
        long e = n40Var.e(i);
        if (e != -1) {
            return e;
        }
        throw new EOFException("Truncated Deflate64 Stream");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oi2, java.lang.Object] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B = new Object();
        this.L = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int h(byte[] bArr, int i, int i2) {
        boolean z;
        n40 n40Var;
        int n;
        long n2;
        while (true) {
            if (this.A && !this.B.G()) {
                return -1;
            }
            if (this.B.W() == o03.INITIAL) {
                char c = 1;
                if (n(this.L, 1) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.A = z;
                int i3 = 2;
                int n3 = (int) n(this.L, 2);
                if (n3 != 0) {
                    if (n3 != 1) {
                        if (n3 == 2) {
                            int[][] iArr = {new int[(int) (n(this.L, 5) + 257)], new int[(int) (n(this.L, 5) + 1)]};
                            n40 n40Var2 = this.L;
                            int[] iArr2 = iArr[0];
                            int[] iArr3 = iArr[1];
                            int n4 = (int) (n(n40Var2, 4) + 4);
                            int[] iArr4 = new int[19];
                            int i4 = 0;
                            while (i4 < n4) {
                                iArr4[d0[i4]] = (int) n(n40Var2, 3);
                                i4++;
                                c = c;
                            }
                            char c2 = c;
                            m42 e = e(iArr4);
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
                                    int k = k(n40Var2, e);
                                    if (k < 16) {
                                        iArr5[i5] = k;
                                        n = i6;
                                        i5++;
                                        i7 = k;
                                        n40Var = n40Var2;
                                    } else {
                                        long j = 3;
                                        switch (k) {
                                            case 16:
                                                n40Var = n40Var2;
                                                n = (int) (n(n40Var2, i3) + 3);
                                                break;
                                            case 17:
                                                n2 = n(n40Var2, 3);
                                                i6 = (int) (n2 + j);
                                                i7 = 0;
                                                n40Var = n40Var2;
                                                n = i6;
                                                break;
                                            case 18:
                                                n2 = n(n40Var2, 7);
                                                j = 11;
                                                i6 = (int) (n2 + j);
                                                i7 = 0;
                                                n40Var = n40Var2;
                                                n = i6;
                                                break;
                                            default:
                                                n40Var = n40Var2;
                                                n = i6;
                                                break;
                                        }
                                    }
                                    i6 = n;
                                    n40Var2 = n40Var;
                                    i3 = 2;
                                }
                            }
                            System.arraycopy(iArr5, 0, iArr2, 0, iArr2.length);
                            System.arraycopy(iArr5, iArr2.length, iArr3, 0, iArr3.length);
                            this.B = new k03(this, o03.DYNAMIC_CODES, iArr[0], iArr[c2]);
                        } else {
                            i.m(lb1.g(n3, "Unsupported compression: "));
                            return 0;
                        }
                    } else {
                        this.B = new k03(this, o03.FIXED_CODES, e0, f0);
                    }
                } else {
                    n40 n40Var3 = this.L;
                    int i8 = n40Var3.R % 8;
                    if (i8 > 0) {
                        n40Var3.h(i8);
                    }
                    long n5 = n(this.L, 16);
                    if ((65535 & (n5 ^ 65535)) == n(this.L, 16)) {
                        this.B = new m03(this, n5);
                    } else {
                        i.m("Illegal LEN / NLEN values");
                        return 0;
                    }
                }
            } else {
                int T = this.B.T(bArr, i, i2);
                if (T != 0) {
                    return T;
                }
            }
        }
    }
}
