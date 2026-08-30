package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jy  reason: default package */
/* loaded from: classes.dex */
public final class jy extends sv0 {
    public int A;
    public int B;
    public int L;
    public boolean R;
    public final y70 X;
    public int Y;
    public o20 Z;
    public int c0;
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
    public char o0;
    public iy p0;

    public jy(InputStream inputStream) {
        y70 y70Var = new y70(0);
        y70Var.b = -1;
        this.X = y70Var;
        this.c0 = 1;
        this.Z = new o20(inputStream == System.in ? mp0.i(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        o20 o20Var = this.Z;
        if (o20Var != null) {
            int d = (int) o20Var.d(8);
            int d2 = (int) this.Z.d(8);
            int d3 = (int) this.Z.d(8);
            if (d == 66 && d2 == 90 && d3 == 104) {
                int d4 = (int) this.Z.d(8);
                if (d4 >= 49 && d4 <= 57) {
                    this.L = d4 - 48;
                    this.f0 = 0;
                } else {
                    f81.j("BZip2 block size is invalid");
                }
            } else {
                throw new IOException("Stream is not in the BZip2 format");
            }
        } else {
            f81.j("No InputStream");
        }
        w();
    }

    public static int d(o20 o20Var, int i) {
        long d = o20Var.d(i);
        if (d >= 0) {
            return (int) d;
        }
        f81.j("Unexpected end of stream");
        return 0;
    }

    public static void i(int i, int i2, String str) {
        if (i >= 0) {
            if (i < i2) {
                return;
            }
            f81.j(wh1.A("Corrupted input, ", str, " value too big"));
            return;
        }
        f81.j(wh1.A("Corrupted input, ", str, " value negative"));
    }

    public final int B() {
        iy iyVar;
        if (this.c0 != 0 && (iyVar = this.p0) != null) {
            int[] iArr = iyVar.j;
            int i = this.A + 1;
            int[] iArr2 = iyVar.n;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
                iyVar.n = iArr2;
            }
            byte[] bArr = iyVar.o;
            iArr[0] = 0;
            System.arraycopy(iyVar.e, 0, iArr, 1, 256);
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
                i(i7, i, "tt index");
                iArr2[i7] = i5;
            }
            int i8 = this.B;
            if (i8 >= 0 && i8 < iArr2.length) {
                this.n0 = iArr2[i8];
                this.g0 = 0;
                this.j0 = 0;
                this.h0 = 256;
                if (this.R) {
                    this.l0 = 0;
                    this.m0 = 0;
                    return F();
                }
                return C();
            }
            f81.j("Stream corrupted");
            return 0;
        }
        return -1;
    }

    public final int C() {
        if (this.j0 <= this.A) {
            this.i0 = this.h0;
            iy iyVar = this.p0;
            byte[] bArr = iyVar.o;
            int i = this.n0;
            int i2 = bArr[i] & 255;
            this.h0 = i2;
            i(i, iyVar.n.length, "su_tPos");
            this.n0 = this.p0.n[this.n0];
            this.j0++;
            this.c0 = 6;
            this.X.i(i2);
            return i2;
        }
        this.c0 = 5;
        p();
        w();
        return B();
    }

    public final int D() {
        if (this.k0 < this.o0) {
            int i = this.h0;
            this.X.i(i);
            this.k0++;
            this.c0 = 7;
            return i;
        }
        this.j0++;
        this.g0 = 0;
        return C();
    }

    public final int F() {
        if (this.j0 <= this.A) {
            this.i0 = this.h0;
            iy iyVar = this.p0;
            byte[] bArr = iyVar.o;
            int i = this.n0;
            int i2 = bArr[i] & 255;
            i(i, iyVar.n.length, "su_tPos");
            this.n0 = this.p0.n[this.n0];
            int i3 = this.l0;
            int i4 = 0;
            if (i3 == 0) {
                int i5 = this.m0;
                this.l0 = w81.o[i5] - 1;
                int i6 = i5 + 1;
                this.m0 = i6;
                if (i6 == 512) {
                    this.m0 = 0;
                }
            } else {
                this.l0 = i3 - 1;
            }
            if (this.l0 == 1) {
                i4 = 1;
            }
            int i7 = i2 ^ i4;
            this.h0 = i7;
            this.j0++;
            this.c0 = 3;
            this.X.i(i7);
            return i7;
        }
        p();
        w();
        return B();
    }

    public final int I() {
        if (this.k0 < this.o0) {
            this.X.i(this.h0);
            this.k0++;
            return this.h0;
        }
        this.c0 = 2;
        this.j0++;
        this.g0 = 0;
        return F();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [iy, o20] */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o20 o20Var = this.Z;
        if (o20Var != null) {
            try {
                o20Var.close();
            } finally {
                this.p0 = null;
                this.Z = null;
            }
        }
    }

    public final void p() {
        int i = ~this.X.b;
        int i2 = this.d0;
        if (i2 == i) {
            int i3 = this.f0;
            this.f0 = i ^ ((i3 >>> 31) | (i3 << 1));
            return;
        }
        int i4 = this.e0;
        this.f0 = ((i4 >>> 31) | (i4 << 1)) ^ i2;
        f81.j("BZip2 CRC error");
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
                            int x = x();
                            if (x < 0) {
                                break;
                            }
                            bArr[i4] = (byte) x;
                            i4++;
                        }
                        if (i4 == i) {
                            return -1;
                        }
                        return i4 - i;
                    }
                    f81.j("Stream closed");
                    return 0;
                }
                f81.q(wh1.m(b31.s(i, i2, "offs(", ") + len(", ") > dest.length("), bArr.length, ")."));
                return 0;
            }
            f81.q(wh1.j("len(", i2, ") < 0."));
            return 0;
        }
        f81.q(wh1.j("offs(", i, ") < 0."));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30, types: [int] */
    public final void w() {
        boolean z;
        char[] cArr;
        char c;
        int i;
        int i2;
        char c2;
        o20 o20Var = this.Z;
        char d = (char) d(o20Var, 8);
        char d2 = (char) d(o20Var, 8);
        char d3 = (char) d(o20Var, 8);
        char d4 = (char) d(o20Var, 8);
        char d5 = (char) d(o20Var, 8);
        char d6 = (char) d(o20Var, 8);
        char c3 = 0;
        if (d == 23 && d2 == 'r' && d3 == 'E' && d4 == '8' && d5 == 'P' && d6 == 144) {
            int d7 = d(this.Z, 32);
            this.e0 = d7;
            this.c0 = 0;
            this.p0 = null;
            if (d7 == this.f0) {
                return;
            }
            f81.j("BZip2 CRC error");
        } else if (d == '1' && d2 == 'A' && d3 == 'Y' && d4 == '&' && d5 == 'S' && d6 == 'Y') {
            this.d0 = d(o20Var, 32);
            int i3 = 1;
            if (d(o20Var, 1) == 1) {
                z = true;
            } else {
                z = false;
            }
            this.R = z;
            if (this.p0 == null) {
                this.p0 = new iy(this.L);
            }
            o20 o20Var2 = this.Z;
            this.B = d(o20Var2, 24);
            o20 o20Var3 = this.Z;
            iy iyVar = this.p0;
            boolean[] zArr = iyVar.a;
            byte[] bArr = iyVar.m;
            byte[] bArr2 = iyVar.c;
            byte[] bArr3 = iyVar.d;
            int i4 = 0;
            for (int i5 = 0; i5 < 16; i5++) {
                if (d(o20Var3, 1) != 0) {
                    i4 |= 1 << i5;
                }
            }
            Arrays.fill(zArr, false);
            for (int i6 = 0; i6 < 16; i6++) {
                if ((i4 & (1 << i6)) != 0) {
                    int i7 = i6 << 4;
                    for (int i8 = 0; i8 < 16; i8++) {
                        if (d(o20Var3, 1) != 0) {
                            zArr[i7 + i8] = true;
                        }
                    }
                }
            }
            iy iyVar2 = this.p0;
            boolean[] zArr2 = iyVar2.a;
            byte[] bArr4 = iyVar2.b;
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
            int d8 = d(o20Var3, 3);
            int d9 = d(o20Var3, 15);
            if (d9 >= 0) {
                i(i11, 259, "alphaSize");
                i(d8, 7, "nGroups");
                for (int i12 = c4; i12 < d9; i12++) {
                    int i13 = c4;
                    while (d(o20Var3, 1) != 0) {
                        i13++;
                    }
                    if (i12 < 18002) {
                        bArr3[i12] = (byte) i13;
                    }
                }
                int min = Math.min(d9, 18002);
                int i14 = d8;
                while (true) {
                    i14--;
                    if (i14 < 0) {
                        break;
                    }
                    bArr[i14] = (byte) i14;
                }
                for (int i15 = c4; i15 < min; i15++) {
                    int i16 = bArr3[i15] & 255;
                    i(i16, 6, "selectorMtf");
                    byte b = bArr[i16];
                    while (i16 > 0) {
                        bArr[i16] = bArr[i16 - 1];
                        i16--;
                    }
                    bArr[c4] = b;
                    bArr2[i15] = b;
                }
                char[][] cArr2 = iyVar.l;
                for (int i17 = c4; i17 < d8; i17++) {
                    int d10 = d(o20Var3, 5);
                    char[] cArr3 = cArr2[i17];
                    for (int i18 = c4; i18 < i11; i18++) {
                        while (d(o20Var3, 1) != 0) {
                            if (d(o20Var3, 1) != 0) {
                                i2 = -1;
                            } else {
                                i2 = 1;
                            }
                            d10 += i2;
                        }
                        cArr3[i18] = (char) d10;
                    }
                }
                iy iyVar3 = this.p0;
                char[][] cArr4 = iyVar3.l;
                int[] iArr = iyVar3.i;
                int[][] iArr2 = iyVar3.f;
                int[][] iArr3 = iyVar3.g;
                int[][] iArr4 = iyVar3.h;
                int i19 = c4;
                while (i19 < d8) {
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
                        i(c11, 258, "length");
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
                iy iyVar4 = this.p0;
                byte[] bArr5 = iyVar4.o;
                int[] iArr8 = iyVar4.e;
                byte[] bArr6 = iyVar4.c;
                byte[] bArr7 = iyVar4.b;
                char[] cArr7 = iyVar4.k;
                int[] iArr9 = iyVar4.i;
                int[][] iArr10 = iyVar4.f;
                int[][] iArr11 = iyVar4.g;
                int[][] iArr12 = iyVar4.h;
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
                iy iyVar5 = this.p0;
                int i38 = iyVar5.c[c4] & 255;
                i(i38, 6, "zt");
                int[] iArr13 = iyVar5.f[i38];
                int i39 = iyVar5.i[i38];
                i(i39, 258, "zn");
                int d11 = d(this.Z, i39);
                int i40 = i39;
                while (d11 > iArr13[i40]) {
                    int i41 = i40 + 1;
                    i(i41, 258, "zn");
                    i40 = i41;
                    d11 = (d11 << 1) | d(this.Z, i34);
                    i34 = 1;
                }
                int i42 = d11 - iyVar5.g[i38][i40];
                i(i42, 258, "zvec");
                int i43 = iyVar5.h[i38][i42];
                int i44 = bArr6[c4] & 255;
                i(i44, 6, "zt");
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
                                i(r5, 18002, "groupNo");
                                int i51 = bArr6[r5] & 255;
                                i(i51, 6, "zt");
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
                            i(i52, 258, "zn");
                            i45 = i52;
                            int d12 = d(o20Var2, i52);
                            int i53 = i45;
                            while (d12 > iArr15[i53]) {
                                int i54 = i53 + 1;
                                i(i54, 258, "zn");
                                d12 = (d12 << 1) | d(o20Var2, 1);
                                i53 = i54;
                            }
                            int i55 = d12 - iArr21[i53];
                            i(i55, 258, "zvec");
                            i50 <<= 1;
                            i43 = iArr17[i55];
                            cArr7 = cArr;
                        }
                        i(i49, this.p0.o.length, "s");
                        char c14 = cArr[0];
                        i(c14, 256, "yy");
                        byte b2 = bArr7[c14];
                        int i56 = b2 & 255;
                        iArr8[i56] = i49 + 1 + iArr8[i56];
                        int i57 = i46 + 1;
                        int i58 = i57 + i49;
                        i(i58, this.p0.o.length, "lastShadow");
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
                            f81.j(wh1.f(i58, i35, "Block overrun while expanding RLE in MTF, ", " exceeds "));
                            return;
                        }
                    } else {
                        i46++;
                        if (i46 < i35) {
                            i(i43, 257, "nextSym");
                            int i59 = i43 - 1;
                            char c15 = cArr7[i59];
                            int[] iArr23 = iArr14;
                            i(c15, 256, "yy");
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
                                i(r52, 18002, "groupNo");
                                int i62 = bArr6[r52] & 255;
                                i(i62, 6, "zt");
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
                            i(i, 258, "zn");
                            int d13 = d(o20Var2, i);
                            int i63 = i;
                            while (d13 > iArr15[i63]) {
                                i63++;
                                i(i63, 258, "zn");
                                d13 = (d13 << 1) | d(o20Var2, 1);
                            }
                            int i64 = d13 - iArr23[i63];
                            i(i64, 258, "zvec");
                            i43 = iArr17[i64];
                            i45 = i;
                            iArr9 = iArr18;
                            iArr10 = iArr19;
                            iArr11 = iArr20;
                            i37 = i48;
                            iArr14 = iArr23;
                        } else {
                            f81.j(wh1.f(i46, i35, "Block overrun in MTF, ", " exceeds "));
                            return;
                        }
                    }
                    c4 = 0;
                }
                this.A = i46;
                this.X.b = -1;
                this.c0 = 1;
                return;
            }
            f81.j("Corrupted input, nSelectors value negative");
        } else {
            this.c0 = 0;
            f81.j("Bad block header");
        }
    }

    public final int x() {
        switch (this.c0) {
            case 0:
                return -1;
            case 1:
                return B();
            case 2:
                f81.o();
                return 0;
            case 3:
                if (this.h0 != this.i0) {
                    this.c0 = 2;
                    this.g0 = 1;
                    return F();
                }
                int i = this.g0 + 1;
                this.g0 = i;
                if (i < 4) {
                    this.c0 = 2;
                    return F();
                }
                iy iyVar = this.p0;
                byte[] bArr = iyVar.o;
                int i2 = this.n0;
                this.o0 = (char) (bArr[i2] & 255);
                i(i2, iyVar.n.length, "su_tPos");
                this.n0 = this.p0.n[this.n0];
                int i3 = this.l0;
                if (i3 == 0) {
                    int i4 = this.m0;
                    this.l0 = w81.o[i4] - 1;
                    int i5 = i4 + 1;
                    this.m0 = i5;
                    if (i5 == 512) {
                        this.m0 = 0;
                    }
                } else {
                    this.l0 = i3 - 1;
                }
                this.k0 = 0;
                this.c0 = 4;
                if (this.l0 == 1) {
                    this.o0 = (char) (this.o0 ^ 1);
                }
                return I();
            case 4:
                return I();
            case 5:
                f81.o();
                return 0;
            case ig7.b /* 6 */:
                if (this.h0 != this.i0) {
                    this.g0 = 1;
                    return C();
                }
                int i6 = this.g0 + 1;
                this.g0 = i6;
                if (i6 >= 4) {
                    i(this.n0, this.p0.o.length, "su_tPos");
                    iy iyVar2 = this.p0;
                    byte[] bArr2 = iyVar2.o;
                    int i7 = this.n0;
                    this.o0 = (char) (bArr2[i7] & 255);
                    this.n0 = iyVar2.n[i7];
                    this.k0 = 0;
                    return D();
                }
                return C();
            case 7:
                return D();
            default:
                f81.o();
                return 0;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.Z != null) {
            return x();
        }
        f81.j("Stream closed");
        return 0;
    }
}
