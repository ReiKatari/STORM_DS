package defpackage;

import com.github.junrar.unpack.decode.Compress;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a00  reason: default package */
/* loaded from: classes.dex */
public final class a00 extends oy0 {
    public int A;
    public int B;
    public int L;
    public boolean R;
    public final ga0 X;
    public int Y;
    public n40 Z;
    public int d0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public char p0;
    public zz q0;

    public a00(InputStream inputStream) {
        ga0 ga0Var = new ga0(0);
        ga0Var.b = -1;
        this.X = ga0Var;
        this.d0 = 1;
        this.Z = new n40(inputStream == System.in ? zr0.h(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        n40 n40Var = this.Z;
        if (n40Var != null) {
            int e = (int) n40Var.e(8);
            int e2 = (int) this.Z.e(8);
            int e3 = (int) this.Z.e(8);
            if (e == 66 && e2 == 90 && e3 == 104) {
                int e4 = (int) this.Z.e(8);
                if (e4 >= 49 && e4 <= 57) {
                    this.L = e4 - 48;
                    this.g0 = 0;
                } else {
                    e41.i("BZip2 block size is invalid");
                }
            } else {
                throw new IOException("Stream is not in the BZip2 format");
            }
        } else {
            e41.i("No InputStream");
        }
        n();
    }

    public static int e(n40 n40Var, int i) {
        long e = n40Var.e(i);
        if (e >= 0) {
            return (int) e;
        }
        e41.i("Unexpected end of stream");
        return 0;
    }

    public static void h(int i, int i2, String str) {
        if (i >= 0) {
            if (i < i2) {
                return;
            }
            e41.i(lb1.A("Corrupted input, ", str, " value too big"));
            return;
        }
        e41.i(lb1.A("Corrupted input, ", str, " value negative"));
    }

    public final int A() {
        if (this.k0 <= this.A) {
            this.j0 = this.i0;
            zz zzVar = this.q0;
            byte[] bArr = zzVar.o;
            int i = this.o0;
            int i2 = bArr[i] & 255;
            h(i, zzVar.n.length, "su_tPos");
            this.o0 = this.q0.n[this.o0];
            int i3 = this.m0;
            int i4 = 0;
            if (i3 == 0) {
                int i5 = this.n0;
                this.m0 = g04.j[i5] - 1;
                int i6 = i5 + 1;
                this.n0 = i6;
                if (i6 == 512) {
                    this.n0 = 0;
                }
            } else {
                this.m0 = i3 - 1;
            }
            if (this.m0 == 1) {
                i4 = 1;
            }
            int i7 = i2 ^ i4;
            this.i0 = i7;
            this.k0++;
            this.d0 = 3;
            this.X.i(i7);
            return i7;
        }
        k();
        n();
        return u();
    }

    public final int D() {
        if (this.l0 < this.p0) {
            this.X.i(this.i0);
            this.l0++;
            return this.i0;
        }
        this.d0 = 2;
        this.k0++;
        this.h0 = 0;
        return A();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [zz, n40] */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        n40 n40Var = this.Z;
        if (n40Var != null) {
            try {
                n40Var.close();
            } finally {
                this.q0 = null;
                this.Z = null;
            }
        }
    }

    public final void k() {
        int i = ~this.X.b;
        int i2 = this.e0;
        if (i2 == i) {
            int i3 = this.g0;
            this.g0 = i ^ ((i3 >>> 31) | (i3 << 1));
            return;
        }
        int i4 = this.f0;
        this.g0 = ((i4 >>> 31) | (i4 << 1)) ^ i2;
        e41.i("BZip2 CRC error");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30, types: [int] */
    public final void n() {
        boolean z;
        char[] cArr;
        char c;
        int i;
        int i2;
        char c2;
        n40 n40Var = this.Z;
        char e = (char) e(n40Var, 8);
        char e2 = (char) e(n40Var, 8);
        char e3 = (char) e(n40Var, 8);
        char e4 = (char) e(n40Var, 8);
        char e5 = (char) e(n40Var, 8);
        char e6 = (char) e(n40Var, 8);
        char c3 = 0;
        if (e == 23 && e2 == 'r' && e3 == 'E' && e4 == '8' && e5 == 'P' && e6 == 144) {
            int e7 = e(this.Z, 32);
            this.f0 = e7;
            this.d0 = 0;
            this.q0 = null;
            if (e7 == this.g0) {
                return;
            }
            e41.i("BZip2 CRC error");
        } else if (e == '1' && e2 == 'A' && e3 == 'Y' && e4 == '&' && e5 == 'S' && e6 == 'Y') {
            this.e0 = e(n40Var, 32);
            int i3 = 1;
            if (e(n40Var, 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.R = z;
            if (this.q0 == null) {
                this.q0 = new zz(this.L);
            }
            n40 n40Var2 = this.Z;
            this.B = e(n40Var2, 24);
            n40 n40Var3 = this.Z;
            zz zzVar = this.q0;
            boolean[] zArr = zzVar.a;
            byte[] bArr = zzVar.m;
            byte[] bArr2 = zzVar.c;
            byte[] bArr3 = zzVar.d;
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                if (e(n40Var3, 1) != 0) {
                    i4 |= 1 << i5;
                }
            }
            Arrays.fill(zArr, false);
            for (int i6 = 0; i6 < 16; i6++) {
                if ((i4 & (1 << i6)) != 0) {
                    int i7 = i6 << 4;
                    for (int i8 = 0; i8 < 16; i8++) {
                        if (e(n40Var3, 1) != 0) {
                            zArr[i7 + i8] = true;
                        }
                    }
                }
            }
            zz zzVar2 = this.q0;
            boolean[] zArr2 = zzVar2.a;
            byte[] bArr4 = zzVar2.b;
            int i9 = 0;
            int i10 = 0;
            while (i9 < 256) {
                if (zArr2[i9]) {
                    c2 = c3;
                    bArr4[i10] = (byte) i9;
                    i10++;
                } else {
                    c2 = c3;
                }
                i9++;
                c3 = c2;
            }
            char c4 = c3;
            this.Y = i10;
            int i11 = i10 + 2;
            int e8 = e(n40Var3, 3);
            int e9 = e(n40Var3, 15);
            if (e9 >= 0) {
                h(i11, 259, "alphaSize");
                h(e8, 7, "nGroups");
                for (int i12 = c4; i12 < e9; i12++) {
                    int i13 = c4;
                    while (e(n40Var3, 1) != 0) {
                        i13++;
                    }
                    if (i12 < 18002) {
                        bArr3[i12] = (byte) i13;
                    }
                }
                int min = Math.min(e9, 18002);
                int i14 = e8;
                while (true) {
                    i14--;
                    if (i14 < 0) {
                        break;
                    }
                    bArr[i14] = (byte) i14;
                }
                for (int i15 = c4; i15 < min; i15++) {
                    int i16 = bArr3[i15] & 255;
                    h(i16, 6, "selectorMtf");
                    byte b = bArr[i16];
                    while (i16 > 0) {
                        bArr[i16] = bArr[i16 - 1];
                        i16--;
                    }
                    bArr[c4] = b;
                    bArr2[i15] = b;
                }
                char[][] cArr2 = zzVar.l;
                for (int i17 = c4; i17 < e8; i17++) {
                    int e10 = e(n40Var3, 5);
                    char[] cArr3 = cArr2[i17];
                    for (int i18 = c4; i18 < i11; i18++) {
                        while (e(n40Var3, 1) != 0) {
                            if (e(n40Var3, 1) != 0) {
                                i2 = -1;
                            } else {
                                i2 = 1;
                            }
                            e10 += i2;
                        }
                        cArr3[i18] = (char) e10;
                    }
                }
                zz zzVar3 = this.q0;
                char[][] cArr4 = zzVar3.l;
                int[] iArr = zzVar3.i;
                int[][] iArr2 = zzVar3.f;
                int[][] iArr3 = zzVar3.g;
                int[][] iArr4 = zzVar3.h;
                int i19 = c4;
                while (i19 < e8) {
                    char[] cArr5 = cArr4[i19];
                    int i20 = i3;
                    int i21 = i11;
                    char c5 = c4;
                    char c6 = ' ';
                    while (true) {
                        i21--;
                        if (i21 < 0) {
                            break;
                        }
                        char c7 = cArr5[i21];
                        if (c7 > c5) {
                            c5 = c7;
                        }
                        if (c7 < c6) {
                            c6 = c7;
                        }
                    }
                    int[] iArr5 = iArr2[i19];
                    int[] iArr6 = iArr3[i19];
                    int[] iArr7 = iArr4[i19];
                    char[] cArr6 = cArr4[i19];
                    char c8 = c4;
                    for (int i22 = c6; i22 <= c5; i22++) {
                        int i23 = c4;
                        while (i23 < i11) {
                            char c9 = c6;
                            if (cArr6[i23] == i22) {
                                iArr7[c8] = i23;
                                c8++;
                            }
                            i23++;
                            c6 = c9;
                        }
                    }
                    char c10 = c6;
                    int i24 = 23;
                    while (true) {
                        i24--;
                        if (i24 <= 0) {
                            break;
                        }
                        iArr6[i24] = c4;
                        iArr5[i24] = c4;
                    }
                    for (int i25 = c4; i25 < i11; i25++) {
                        char c11 = cArr6[i25];
                        h(c11, 258, "length");
                        int i26 = c11 + 1;
                        iArr6[i26] = iArr6[i26] + 1;
                    }
                    int i27 = iArr6[c4];
                    for (int i28 = i20; i28 < 23; i28++) {
                        i27 += iArr6[i28];
                        iArr6[i28] = i27;
                    }
                    int i29 = iArr6[c10];
                    int i30 = c4;
                    char c12 = c10;
                    while (c12 <= c5) {
                        ?? r22 = c12 + 1;
                        int i31 = iArr6[r22];
                        int i32 = (i31 - i29) + i30;
                        iArr5[c12] = i32 - 1;
                        i30 = i32 << 1;
                        c12 = r22;
                        i29 = i31;
                    }
                    for (int i33 = c10 + 1; i33 <= c5; i33++) {
                        iArr6[i33] = ((iArr5[i33 - 1] + 1) << 1) - iArr6[i33];
                    }
                    iArr[i19] = c10;
                    i19++;
                    i3 = i20;
                }
                int i34 = i3;
                zz zzVar4 = this.q0;
                byte[] bArr5 = zzVar4.o;
                int[] iArr8 = zzVar4.e;
                byte[] bArr6 = zzVar4.c;
                byte[] bArr7 = zzVar4.b;
                char[] cArr7 = zzVar4.k;
                int[] iArr9 = zzVar4.i;
                int[][] iArr10 = zzVar4.f;
                int[][] iArr11 = zzVar4.g;
                int[][] iArr12 = zzVar4.h;
                int i35 = this.L * 100000;
                int i36 = 256;
                while (true) {
                    i36--;
                    if (i36 < 0) {
                        break;
                    }
                    cArr7[i36] = (char) i36;
                    iArr8[i36] = c4;
                }
                int i37 = this.Y + 1;
                zz zzVar5 = this.q0;
                int i38 = zzVar5.c[c4] & 255;
                h(i38, 6, "zt");
                int[] iArr13 = zzVar5.f[i38];
                int i39 = zzVar5.i[i38];
                h(i39, 258, "zn");
                int e11 = e(this.Z, i39);
                int i40 = i39;
                while (e11 > iArr13[i40]) {
                    int i41 = i40 + 1;
                    h(i41, 258, "zn");
                    i40 = i41;
                    e11 = (e11 << 1) | e(this.Z, i34);
                    i34 = 1;
                }
                int i42 = e11 - zzVar5.g[i38][i40];
                h(i42, 258, "zvec");
                int i43 = zzVar5.h[i38][i42];
                int i44 = bArr6[c4] & 255;
                h(i44, 6, "zt");
                int[] iArr14 = iArr11[i44];
                int[] iArr15 = iArr10[i44];
                int[] iArr16 = iArr12[i44];
                int i45 = iArr9[i44];
                int i46 = -1;
                int[] iArr17 = iArr16;
                int i47 = 49;
                char c13 = c4;
                while (i43 != i37) {
                    int[] iArr18 = iArr9;
                    int[][] iArr19 = iArr10;
                    int[][] iArr20 = iArr11;
                    int i48 = i37;
                    if (i43 == 0 || i43 == 1) {
                        int[] iArr21 = iArr14;
                        int i49 = -1;
                        int i50 = 1;
                        while (true) {
                            if (i43 == 0) {
                                i49 += i50;
                                cArr = cArr7;
                            } else {
                                cArr = cArr7;
                                if (i43 != 1) {
                                    break;
                                }
                                i49 += i50 << 1;
                            }
                            if (i47 == 0) {
                                ?? r5 = c13 + 1;
                                h(r5, 18002, "groupNo");
                                int i51 = bArr6[r5] & 255;
                                h(i51, 6, "zt");
                                iArr21 = iArr20[i51];
                                int[] iArr22 = iArr19[i51];
                                iArr17 = iArr12[i51];
                                i45 = iArr18[i51];
                                c13 = r5;
                                iArr15 = iArr22;
                                i47 = 49;
                            } else {
                                i47--;
                            }
                            int i52 = i45;
                            h(i52, 258, "zn");
                            i45 = i52;
                            int e12 = e(n40Var2, i52);
                            int i53 = i45;
                            while (e12 > iArr15[i53]) {
                                int i54 = i53 + 1;
                                h(i54, 258, "zn");
                                e12 = (e12 << 1) | e(n40Var2, 1);
                                i53 = i54;
                            }
                            int i55 = e12 - iArr21[i53];
                            h(i55, 258, "zvec");
                            i50 <<= 1;
                            i43 = iArr17[i55];
                            cArr7 = cArr;
                        }
                        h(i49, this.q0.o.length, "s");
                        char c14 = cArr[0];
                        h(c14, 256, "yy");
                        byte b2 = bArr7[c14];
                        int i56 = b2 & 255;
                        iArr8[i56] = i49 + 1 + iArr8[i56];
                        int i57 = i46 + 1;
                        int i58 = i57 + i49;
                        h(i58, this.q0.o.length, "lastShadow");
                        Arrays.fill(bArr5, i57, i58 + 1, b2);
                        if (i58 < i35) {
                            i46 = i58;
                            iArr9 = iArr18;
                            iArr10 = iArr19;
                            iArr11 = iArr20;
                            i37 = i48;
                            iArr14 = iArr21;
                            cArr7 = cArr;
                        } else {
                            e41.i(lb1.j("Block overrun while expanding RLE in MTF, ", i58, i35, " exceeds "));
                            return;
                        }
                    } else {
                        i46++;
                        if (i46 < i35) {
                            h(i43, Compress.MC20, "nextSym");
                            int i59 = i43 - 1;
                            char c15 = cArr7[i59];
                            int[] iArr23 = iArr14;
                            h(c15, 256, "yy");
                            byte b3 = bArr7[c15];
                            int i60 = b3 & 255;
                            iArr8[i60] = iArr8[i60] + 1;
                            bArr5[i46] = b3;
                            if (i43 <= 16) {
                                while (i59 > 0) {
                                    int i61 = i59 - 1;
                                    cArr7[i59] = cArr7[i61];
                                    i59 = i61;
                                }
                                c = c4;
                            } else {
                                c = c4;
                                System.arraycopy(cArr7, c, cArr7, 1, i59);
                            }
                            cArr7[c] = c15;
                            if (i47 == 0) {
                                ?? r52 = c13 + 1;
                                h(r52, 18002, "groupNo");
                                int i62 = bArr6[r52] & 255;
                                h(i62, 6, "zt");
                                int[] iArr24 = iArr20[i62];
                                int[] iArr25 = iArr19[i62];
                                int[] iArr26 = iArr12[i62];
                                i = iArr18[i62];
                                c13 = r52;
                                iArr23 = iArr24;
                                iArr15 = iArr25;
                                iArr17 = iArr26;
                                i47 = 49;
                            } else {
                                i47--;
                                i = i45;
                            }
                            h(i, 258, "zn");
                            int e13 = e(n40Var2, i);
                            int i63 = i;
                            while (e13 > iArr15[i63]) {
                                i63++;
                                h(i63, 258, "zn");
                                e13 = (e13 << 1) | e(n40Var2, 1);
                            }
                            int i64 = e13 - iArr23[i63];
                            h(i64, 258, "zvec");
                            i43 = iArr17[i64];
                            i45 = i;
                            iArr9 = iArr18;
                            iArr10 = iArr19;
                            iArr11 = iArr20;
                            i37 = i48;
                            iArr14 = iArr23;
                        } else {
                            e41.i(lb1.j("Block overrun in MTF, ", i46, i35, " exceeds "));
                            return;
                        }
                    }
                    c4 = 0;
                }
                this.A = i46;
                this.X.b = -1;
                this.d0 = 1;
                return;
            }
            e41.i("Corrupted input, nSelectors value negative");
        } else {
            this.d0 = 0;
            e41.i("Bad block header");
        }
    }

    public final int r() {
        switch (this.d0) {
            case 0:
                return -1;
            case 1:
                return u();
            case 2:
                e41.m();
                return 0;
            case 3:
                if (this.i0 != this.j0) {
                    this.d0 = 2;
                    this.h0 = 1;
                    return A();
                }
                int i = this.h0 + 1;
                this.h0 = i;
                if (i < 4) {
                    this.d0 = 2;
                    return A();
                }
                zz zzVar = this.q0;
                byte[] bArr = zzVar.o;
                int i2 = this.o0;
                this.p0 = (char) (bArr[i2] & 255);
                h(i2, zzVar.n.length, "su_tPos");
                this.o0 = this.q0.n[this.o0];
                int i3 = this.m0;
                if (i3 == 0) {
                    int i4 = this.n0;
                    this.m0 = g04.j[i4] - 1;
                    int i5 = i4 + 1;
                    this.n0 = i5;
                    if (i5 == 512) {
                        this.n0 = 0;
                    }
                } else {
                    this.m0 = i3 - 1;
                }
                this.l0 = 0;
                this.d0 = 4;
                if (this.m0 == 1) {
                    this.p0 = (char) (this.p0 ^ 1);
                }
                return D();
            case 4:
                return D();
            case 5:
                e41.m();
                return 0;
            case 6:
                if (this.i0 != this.j0) {
                    this.h0 = 1;
                    return v();
                }
                int i6 = this.h0 + 1;
                this.h0 = i6;
                if (i6 >= 4) {
                    h(this.o0, this.q0.o.length, "su_tPos");
                    zz zzVar2 = this.q0;
                    byte[] bArr2 = zzVar2.o;
                    int i7 = this.o0;
                    this.p0 = (char) (bArr2[i7] & 255);
                    this.o0 = zzVar2.n[i7];
                    this.l0 = 0;
                    return x();
                }
                return v();
            case 7:
                return x();
            default:
                e41.m();
                return 0;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                int i3 = i + i2;
                if (i3 <= bArr.length) {
                    if (this.Z != null) {
                        if (i2 == 0) {
                            return 0;
                        }
                        int i4 = i;
                        while (i4 < i3) {
                            int r = r();
                            if (r < 0) {
                                break;
                            }
                            bArr[i4] = (byte) r;
                            i4++;
                        }
                        if (i4 == i) {
                            return -1;
                        }
                        return i4 - i;
                    }
                    e41.i("Stream closed");
                    return 0;
                }
                e41.q(lb1.o(i61.q(i, i2, "offs(", ") + len(", ") > dest.length("), bArr.length, ")."));
                return 0;
            }
            e41.q(lb1.k("len(", i2, ") < 0."));
            return 0;
        }
        e41.q(lb1.k("offs(", i, ") < 0."));
        return 0;
    }

    public final int u() {
        zz zzVar;
        if (this.d0 != 0 && (zzVar = this.q0) != null) {
            int[] iArr = zzVar.j;
            int i = this.A + 1;
            int[] iArr2 = zzVar.n;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
                zzVar.n = iArr2;
            }
            byte[] bArr = zzVar.o;
            iArr[0] = 0;
            System.arraycopy(zzVar.e, 0, iArr, 1, 256);
            int i2 = iArr[0];
            for (int i3 = 1; i3 <= 256; i3++) {
                i2 += iArr[i3];
                iArr[i3] = i2;
            }
            int i4 = this.A;
            for (int i5 = 0; i5 <= i4; i5++) {
                int i6 = bArr[i5] & 255;
                int i7 = iArr[i6];
                iArr[i6] = i7 + 1;
                h(i7, i, "tt index");
                iArr2[i7] = i5;
            }
            int i8 = this.B;
            if (i8 >= 0 && i8 < iArr2.length) {
                this.o0 = iArr2[i8];
                this.h0 = 0;
                this.k0 = 0;
                this.i0 = 256;
                if (this.R) {
                    this.m0 = 0;
                    this.n0 = 0;
                    return A();
                }
                return v();
            }
            e41.i("Stream corrupted");
            return 0;
        }
        return -1;
    }

    public final int v() {
        if (this.k0 <= this.A) {
            this.j0 = this.i0;
            zz zzVar = this.q0;
            byte[] bArr = zzVar.o;
            int i = this.o0;
            int i2 = bArr[i] & 255;
            this.i0 = i2;
            h(i, zzVar.n.length, "su_tPos");
            this.o0 = this.q0.n[this.o0];
            this.k0++;
            this.d0 = 6;
            this.X.i(i2);
            return i2;
        }
        this.d0 = 5;
        k();
        n();
        return u();
    }

    public final int x() {
        if (this.l0 < this.p0) {
            int i = this.i0;
            this.X.i(i);
            this.l0++;
            this.d0 = 7;
            return i;
        }
        this.k0++;
        this.h0 = 0;
        return v();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.Z != null) {
            return r();
        }
        e41.i("Stream closed");
        return 0;
    }
}
