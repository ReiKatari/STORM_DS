package kj;

import fj.j;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import java.util.Arrays;
import me.magnum.melonds.common.camera.DSiCameraSource;
import rj.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends jj.a {
    public int A;
    public int B;
    public int L;
    public boolean R;
    public final c X;
    public int Y;
    public mj.a Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f8331b0;

    /* renamed from: c0  reason: collision with root package name */
    public int f8332c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f8333d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f8334e0;

    /* renamed from: f0  reason: collision with root package name */
    public int f8335f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f8336g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f8337h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f8338i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f8339j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f8340k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f8341l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f8342m0;

    /* renamed from: n0  reason: collision with root package name */
    public char f8343n0;

    /* renamed from: o0  reason: collision with root package name */
    public a f8344o0;

    /* JADX WARN: Type inference failed for: r0v0, types: [kj.c, java.lang.Object] */
    public b(InputStream inputStream) {
        ?? obj = new Object();
        obj.f8346a = -1;
        this.X = obj;
        this.f8331b0 = 1;
        this.Z = new mj.a(inputStream == System.in ? e.i(inputStream) : inputStream, ByteOrder.BIG_ENDIAN);
        mj.a aVar = this.Z;
        if (aVar != null) {
            int d4 = (int) aVar.d(8);
            int d10 = (int) this.Z.d(8);
            int d11 = (int) this.Z.d(8);
            if (d4 == 66 && d10 == 90 && d11 == 104) {
                int d12 = (int) this.Z.d(8);
                if (d12 >= 49 && d12 <= 57) {
                    this.L = d12 - 48;
                    this.f8334e0 = 0;
                } else {
                    j.h("BZip2 block size is invalid");
                }
            } else {
                throw new IOException("Stream is not in the BZip2 format");
            }
        } else {
            j.h("No InputStream");
        }
        t();
    }

    public static int d(mj.a aVar, int i2) {
        long d4 = aVar.d(i2);
        if (d4 >= 0) {
            return (int) d4;
        }
        j.h("Unexpected end of stream");
        return 0;
    }

    public static void i(int i2, int i10, String str) {
        if (i2 >= 0) {
            if (i2 < i10) {
                return;
            }
            j.h(kc.a.g("Corrupted input, ", str, " value too big"));
            return;
        }
        j.h(kc.a.g("Corrupted input, ", str, " value negative"));
    }

    public final int B() {
        if (this.f8339j0 < this.f8343n0) {
            int i2 = this.f8336g0;
            this.X.a(i2);
            this.f8339j0++;
            this.f8331b0 = 7;
            return i2;
        }
        this.f8338i0++;
        this.f8335f0 = 0;
        return z();
    }

    public final int F() {
        if (this.f8338i0 <= this.A) {
            this.f8337h0 = this.f8336g0;
            a aVar = this.f8344o0;
            byte[] bArr = aVar.f8330o;
            int i2 = this.f8342m0;
            int i10 = bArr[i2] & 255;
            i(i2, aVar.f8329n.length, "su_tPos");
            this.f8342m0 = this.f8344o0.f8329n[this.f8342m0];
            int i11 = this.f8340k0;
            int i12 = 0;
            if (i11 == 0) {
                int i13 = this.f8341l0;
                this.f8340k0 = d.f8347a[i13] - 1;
                int i14 = i13 + 1;
                this.f8341l0 = i14;
                if (i14 == 512) {
                    this.f8341l0 = 0;
                }
            } else {
                this.f8340k0 = i11 - 1;
            }
            if (this.f8340k0 == 1) {
                i12 = 1;
            }
            int i15 = i10 ^ i12;
            this.f8336g0 = i15;
            this.f8338i0++;
            this.f8331b0 = 3;
            this.X.a(i15);
            return i15;
        }
        m();
        t();
        return w();
    }

    public final int G() {
        if (this.f8339j0 < this.f8343n0) {
            this.X.a(this.f8336g0);
            this.f8339j0++;
            return this.f8336g0;
        }
        this.f8331b0 = 2;
        this.f8338i0++;
        this.f8335f0 = 0;
        return F();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kj.a, mj.a] */
    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        mj.a aVar = this.Z;
        if (aVar != null) {
            try {
                aVar.close();
            } finally {
                this.f8344o0 = null;
                this.Z = null;
            }
        }
    }

    public final void m() {
        int i2 = ~this.X.f8346a;
        int i10 = this.f8332c0;
        if (i10 == i2) {
            int i11 = this.f8334e0;
            this.f8334e0 = i2 ^ ((i11 >>> 31) | (i11 << 1));
            return;
        }
        int i12 = this.f8333d0;
        this.f8334e0 = ((i12 >>> 31) | (i12 << 1)) ^ i10;
        j.h("BZip2 CRC error");
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        if (i2 >= 0) {
            if (i10 >= 0) {
                int i11 = i2 + i10;
                if (i11 <= bArr.length) {
                    if (this.Z != null) {
                        if (i10 == 0) {
                            return 0;
                        }
                        int i12 = i2;
                        while (i12 < i11) {
                            int v10 = v();
                            if (v10 < 0) {
                                break;
                            }
                            bArr[i12] = (byte) v10;
                            i12++;
                        }
                        if (i12 == i2) {
                            return -1;
                        }
                        return i12 - i2;
                    }
                    j.h("Stream closed");
                    return 0;
                }
                wa.b.f(w.d.q(kc.a.j("offs(", i2, ") + len(", i10, ") > dest.length("), bArr.length, ")."));
                return 0;
            }
            wa.b.f(w.d.m("len(", i10, ") < 0."));
            return 0;
        }
        wa.b.f(w.d.m("offs(", i2, ") < 0."));
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v49, types: [int] */
    /* JADX WARN: Type inference failed for: r5v24, types: [int] */
    /* JADX WARN: Type inference failed for: r5v30, types: [int] */
    public final void t() {
        boolean z10;
        char[] cArr;
        char c4;
        int i2;
        int i10;
        char c10;
        mj.a aVar = this.Z;
        char d4 = (char) d(aVar, 8);
        char d10 = (char) d(aVar, 8);
        char d11 = (char) d(aVar, 8);
        char d12 = (char) d(aVar, 8);
        char d13 = (char) d(aVar, 8);
        char d14 = (char) d(aVar, 8);
        char c11 = 0;
        if (d4 == 23 && d10 == 'r' && d11 == 'E' && d12 == '8' && d13 == 'P' && d14 == 144) {
            int d15 = d(this.Z, 32);
            this.f8333d0 = d15;
            this.f8331b0 = 0;
            this.f8344o0 = null;
            if (d15 == this.f8334e0) {
                return;
            }
            j.h("BZip2 CRC error");
        } else if (d4 == '1' && d10 == 'A' && d11 == 'Y' && d12 == '&' && d13 == 'S' && d14 == 'Y') {
            this.f8332c0 = d(aVar, 32);
            int i11 = 1;
            if (d(aVar, 1) == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.R = z10;
            if (this.f8344o0 == null) {
                this.f8344o0 = new a(this.L);
            }
            mj.a aVar2 = this.Z;
            this.B = d(aVar2, 24);
            mj.a aVar3 = this.Z;
            a aVar4 = this.f8344o0;
            boolean[] zArr = aVar4.f8317a;
            byte[] bArr = aVar4.m;
            byte[] bArr2 = aVar4.f8319c;
            byte[] bArr3 = aVar4.f8320d;
            int i12 = 0;
            for (int i13 = 0; i13 < 16; i13++) {
                if (d(aVar3, 1) != 0) {
                    i12 |= 1 << i13;
                }
            }
            Arrays.fill(zArr, false);
            for (int i14 = 0; i14 < 16; i14++) {
                if ((i12 & (1 << i14)) != 0) {
                    int i15 = i14 << 4;
                    for (int i16 = 0; i16 < 16; i16++) {
                        if (d(aVar3, 1) != 0) {
                            zArr[i15 + i16] = true;
                        }
                    }
                }
            }
            a aVar5 = this.f8344o0;
            boolean[] zArr2 = aVar5.f8317a;
            byte[] bArr4 = aVar5.f8318b;
            int i17 = 0;
            int i18 = 0;
            while (i17 < 256) {
                if (zArr2[i17]) {
                    c10 = c11;
                    bArr4[i18] = (byte) i17;
                    i18++;
                } else {
                    c10 = c11;
                }
                i17++;
                c11 = c10;
            }
            char c12 = c11;
            this.Y = i18;
            int i19 = i18 + 2;
            int d16 = d(aVar3, 3);
            int d17 = d(aVar3, 15);
            if (d17 >= 0) {
                i(i19, 259, "alphaSize");
                i(d16, 7, "nGroups");
                for (int i20 = c12; i20 < d17; i20++) {
                    int i21 = c12;
                    while (d(aVar3, 1) != 0) {
                        i21++;
                    }
                    if (i20 < 18002) {
                        bArr3[i20] = (byte) i21;
                    }
                }
                int min = Math.min(d17, 18002);
                int i22 = d16;
                while (true) {
                    i22--;
                    if (i22 < 0) {
                        break;
                    }
                    bArr[i22] = (byte) i22;
                }
                for (int i23 = c12; i23 < min; i23++) {
                    int i24 = bArr3[i23] & 255;
                    i(i24, 6, "selectorMtf");
                    byte b10 = bArr[i24];
                    while (i24 > 0) {
                        bArr[i24] = bArr[i24 - 1];
                        i24--;
                    }
                    bArr[c12] = b10;
                    bArr2[i23] = b10;
                }
                char[][] cArr2 = aVar4.f8328l;
                for (int i25 = c12; i25 < d16; i25++) {
                    int d18 = d(aVar3, 5);
                    char[] cArr3 = cArr2[i25];
                    for (int i26 = c12; i26 < i19; i26++) {
                        while (d(aVar3, 1) != 0) {
                            if (d(aVar3, 1) != 0) {
                                i10 = -1;
                            } else {
                                i10 = 1;
                            }
                            d18 += i10;
                        }
                        cArr3[i26] = (char) d18;
                    }
                }
                a aVar6 = this.f8344o0;
                char[][] cArr4 = aVar6.f8328l;
                int[] iArr = aVar6.f8325i;
                int[][] iArr2 = aVar6.f8322f;
                int[][] iArr3 = aVar6.f8323g;
                int[][] iArr4 = aVar6.f8324h;
                int i27 = c12;
                while (i27 < d16) {
                    char[] cArr5 = cArr4[i27];
                    int i28 = i11;
                    int i29 = i19;
                    char c13 = c12;
                    char c14 = ' ';
                    while (true) {
                        i29--;
                        if (i29 < 0) {
                            break;
                        }
                        char c15 = cArr5[i29];
                        if (c15 > c13) {
                            c13 = c15;
                        }
                        if (c15 < c14) {
                            c14 = c15;
                        }
                    }
                    int[] iArr5 = iArr2[i27];
                    int[] iArr6 = iArr3[i27];
                    int[] iArr7 = iArr4[i27];
                    char[] cArr6 = cArr4[i27];
                    char c16 = c12;
                    for (int i30 = c14; i30 <= c13; i30++) {
                        int i31 = c12;
                        while (i31 < i19) {
                            char c17 = c14;
                            if (cArr6[i31] == i30) {
                                iArr7[c16] = i31;
                                c16++;
                            }
                            i31++;
                            c14 = c17;
                        }
                    }
                    char c18 = c14;
                    int i32 = 23;
                    while (true) {
                        i32--;
                        if (i32 <= 0) {
                            break;
                        }
                        iArr6[i32] = c12;
                        iArr5[i32] = c12;
                    }
                    for (int i33 = c12; i33 < i19; i33++) {
                        char c19 = cArr6[i33];
                        i(c19, 258, "length");
                        int i34 = c19 + 1;
                        iArr6[i34] = iArr6[i34] + 1;
                    }
                    int i35 = iArr6[c12];
                    for (int i36 = i28; i36 < 23; i36++) {
                        i35 += iArr6[i36];
                        iArr6[i36] = i35;
                    }
                    int i37 = iArr6[c18];
                    int i38 = c12;
                    char c20 = c18;
                    while (c20 <= c13) {
                        ?? r22 = c20 + 1;
                        int i39 = iArr6[r22];
                        int i40 = (i39 - i37) + i38;
                        iArr5[c20] = i40 - 1;
                        i38 = i40 << 1;
                        c20 = r22;
                        i37 = i39;
                    }
                    for (int i41 = c18 + 1; i41 <= c13; i41++) {
                        iArr6[i41] = ((iArr5[i41 - 1] + 1) << 1) - iArr6[i41];
                    }
                    iArr[i27] = c18;
                    i27++;
                    i11 = i28;
                }
                int i42 = i11;
                a aVar7 = this.f8344o0;
                byte[] bArr5 = aVar7.f8330o;
                int[] iArr8 = aVar7.f8321e;
                byte[] bArr6 = aVar7.f8319c;
                byte[] bArr7 = aVar7.f8318b;
                char[] cArr7 = aVar7.f8327k;
                int[] iArr9 = aVar7.f8325i;
                int[][] iArr10 = aVar7.f8322f;
                int[][] iArr11 = aVar7.f8323g;
                int[][] iArr12 = aVar7.f8324h;
                int i43 = this.L * 100000;
                int i44 = 256;
                while (true) {
                    i44--;
                    if (i44 < 0) {
                        break;
                    }
                    cArr7[i44] = (char) i44;
                    iArr8[i44] = c12;
                }
                int i45 = this.Y + 1;
                a aVar8 = this.f8344o0;
                int i46 = aVar8.f8319c[c12] & 255;
                i(i46, 6, "zt");
                int[] iArr13 = aVar8.f8322f[i46];
                int i47 = aVar8.f8325i[i46];
                i(i47, 258, "zn");
                int d19 = d(this.Z, i47);
                int i48 = i47;
                while (d19 > iArr13[i48]) {
                    int i49 = i48 + 1;
                    i(i49, 258, "zn");
                    i48 = i49;
                    d19 = (d19 << 1) | d(this.Z, i42);
                    i42 = 1;
                }
                int i50 = d19 - aVar8.f8323g[i46][i48];
                i(i50, 258, "zvec");
                int i51 = aVar8.f8324h[i46][i50];
                int i52 = bArr6[c12] & 255;
                i(i52, 6, "zt");
                int[] iArr14 = iArr11[i52];
                int[] iArr15 = iArr10[i52];
                int[] iArr16 = iArr12[i52];
                int i53 = iArr9[i52];
                int i54 = -1;
                int[] iArr17 = iArr16;
                int i55 = 49;
                char c21 = c12;
                while (i51 != i45) {
                    int[] iArr18 = iArr9;
                    int[][] iArr19 = iArr10;
                    int[][] iArr20 = iArr11;
                    int i56 = i45;
                    if (i51 == 0 || i51 == 1) {
                        int[] iArr21 = iArr14;
                        int i57 = -1;
                        int i58 = 1;
                        while (true) {
                            if (i51 == 0) {
                                i57 += i58;
                                cArr = cArr7;
                            } else {
                                cArr = cArr7;
                                if (i51 != 1) {
                                    break;
                                }
                                i57 += i58 << 1;
                            }
                            if (i55 == 0) {
                                ?? r5 = c21 + 1;
                                i(r5, 18002, "groupNo");
                                int i59 = bArr6[r5] & 255;
                                i(i59, 6, "zt");
                                iArr21 = iArr20[i59];
                                int[] iArr22 = iArr19[i59];
                                iArr17 = iArr12[i59];
                                i53 = iArr18[i59];
                                c21 = r5;
                                iArr15 = iArr22;
                                i55 = 49;
                            } else {
                                i55--;
                            }
                            int i60 = i53;
                            i(i60, 258, "zn");
                            i53 = i60;
                            int d20 = d(aVar2, i60);
                            int i61 = i53;
                            while (d20 > iArr15[i61]) {
                                int i62 = i61 + 1;
                                i(i62, 258, "zn");
                                d20 = (d20 << 1) | d(aVar2, 1);
                                i61 = i62;
                            }
                            int i63 = d20 - iArr21[i61];
                            i(i63, 258, "zvec");
                            i58 <<= 1;
                            i51 = iArr17[i63];
                            cArr7 = cArr;
                        }
                        i(i57, this.f8344o0.f8330o.length, "s");
                        char c22 = cArr[0];
                        i(c22, 256, "yy");
                        byte b11 = bArr7[c22];
                        int i64 = b11 & 255;
                        iArr8[i64] = i57 + 1 + iArr8[i64];
                        int i65 = i54 + 1;
                        int i66 = i65 + i57;
                        i(i66, this.f8344o0.f8330o.length, "lastShadow");
                        Arrays.fill(bArr5, i65, i66 + 1, b11);
                        if (i66 < i43) {
                            i54 = i66;
                            iArr9 = iArr18;
                            iArr10 = iArr19;
                            iArr11 = iArr20;
                            i45 = i56;
                            iArr14 = iArr21;
                            cArr7 = cArr;
                        } else {
                            j.h(kc.a.d(i66, i43, "Block overrun while expanding RLE in MTF, ", " exceeds "));
                            return;
                        }
                    } else {
                        i54++;
                        if (i54 < i43) {
                            i(i51, 257, "nextSym");
                            int i67 = i51 - 1;
                            char c23 = cArr7[i67];
                            int[] iArr23 = iArr14;
                            i(c23, 256, "yy");
                            byte b12 = bArr7[c23];
                            int i68 = b12 & 255;
                            iArr8[i68] = iArr8[i68] + 1;
                            bArr5[i54] = b12;
                            if (i51 <= 16) {
                                while (i67 > 0) {
                                    int i69 = i67 - 1;
                                    cArr7[i67] = cArr7[i69];
                                    i67 = i69;
                                }
                                c4 = c12;
                            } else {
                                c4 = c12;
                                System.arraycopy(cArr7, c4, cArr7, 1, i67);
                            }
                            cArr7[c4] = c23;
                            if (i55 == 0) {
                                ?? r52 = c21 + 1;
                                i(r52, 18002, "groupNo");
                                int i70 = bArr6[r52] & 255;
                                i(i70, 6, "zt");
                                int[] iArr24 = iArr20[i70];
                                int[] iArr25 = iArr19[i70];
                                int[] iArr26 = iArr12[i70];
                                i2 = iArr18[i70];
                                c21 = r52;
                                iArr23 = iArr24;
                                iArr15 = iArr25;
                                iArr17 = iArr26;
                                i55 = 49;
                            } else {
                                i55--;
                                i2 = i53;
                            }
                            i(i2, 258, "zn");
                            int d21 = d(aVar2, i2);
                            int i71 = i2;
                            while (d21 > iArr15[i71]) {
                                i71++;
                                i(i71, 258, "zn");
                                d21 = (d21 << 1) | d(aVar2, 1);
                            }
                            int i72 = d21 - iArr23[i71];
                            i(i72, 258, "zvec");
                            i51 = iArr17[i72];
                            i53 = i2;
                            iArr9 = iArr18;
                            iArr10 = iArr19;
                            iArr11 = iArr20;
                            i45 = i56;
                            iArr14 = iArr23;
                        } else {
                            j.h(kc.a.d(i54, i43, "Block overrun in MTF, ", " exceeds "));
                            return;
                        }
                    }
                    c12 = 0;
                }
                this.A = i54;
                this.X.f8346a = -1;
                this.f8331b0 = 1;
                return;
            }
            j.h("Corrupted input, nSelectors value negative");
        } else {
            this.f8331b0 = 0;
            j.h("Bad block header");
        }
    }

    public final int v() {
        switch (this.f8331b0) {
            case 0:
                return -1;
            case DSiCameraSource.FrontCamera /* 1 */:
                return w();
            case 2:
                throw new IllegalStateException();
            case 3:
                if (this.f8336g0 != this.f8337h0) {
                    this.f8331b0 = 2;
                    this.f8335f0 = 1;
                    return F();
                }
                int i2 = this.f8335f0 + 1;
                this.f8335f0 = i2;
                if (i2 < 4) {
                    this.f8331b0 = 2;
                    return F();
                }
                a aVar = this.f8344o0;
                byte[] bArr = aVar.f8330o;
                int i10 = this.f8342m0;
                this.f8343n0 = (char) (bArr[i10] & 255);
                i(i10, aVar.f8329n.length, "su_tPos");
                this.f8342m0 = this.f8344o0.f8329n[this.f8342m0];
                int i11 = this.f8340k0;
                if (i11 == 0) {
                    int i12 = this.f8341l0;
                    this.f8340k0 = d.f8347a[i12] - 1;
                    int i13 = i12 + 1;
                    this.f8341l0 = i13;
                    if (i13 == 512) {
                        this.f8341l0 = 0;
                    }
                } else {
                    this.f8340k0 = i11 - 1;
                }
                this.f8339j0 = 0;
                this.f8331b0 = 4;
                if (this.f8340k0 == 1) {
                    this.f8343n0 = (char) (this.f8343n0 ^ 1);
                }
                return G();
            case 4:
                return G();
            case l1.c.f8511g /* 5 */:
                throw new IllegalStateException();
            case l1.c.f8509e /* 6 */:
                if (this.f8336g0 != this.f8337h0) {
                    this.f8335f0 = 1;
                    return z();
                }
                int i14 = this.f8335f0 + 1;
                this.f8335f0 = i14;
                if (i14 >= 4) {
                    i(this.f8342m0, this.f8344o0.f8330o.length, "su_tPos");
                    a aVar2 = this.f8344o0;
                    byte[] bArr2 = aVar2.f8330o;
                    int i15 = this.f8342m0;
                    this.f8343n0 = (char) (bArr2[i15] & 255);
                    this.f8342m0 = aVar2.f8329n[i15];
                    this.f8339j0 = 0;
                    return B();
                }
                return z();
            case 7:
                return B();
            default:
                throw new IllegalStateException();
        }
    }

    public final int w() {
        a aVar;
        if (this.f8331b0 != 0 && (aVar = this.f8344o0) != null) {
            int[] iArr = aVar.f8326j;
            int i2 = this.A + 1;
            int[] iArr2 = aVar.f8329n;
            if (iArr2 == null || iArr2.length < i2) {
                iArr2 = new int[i2];
                aVar.f8329n = iArr2;
            }
            byte[] bArr = aVar.f8330o;
            iArr[0] = 0;
            System.arraycopy(aVar.f8321e, 0, iArr, 1, 256);
            int i10 = iArr[0];
            for (int i11 = 1; i11 <= 256; i11++) {
                i10 += iArr[i11];
                iArr[i11] = i10;
            }
            int i12 = this.A;
            for (int i13 = 0; i13 <= i12; i13++) {
                int i14 = bArr[i13] & 255;
                int i15 = iArr[i14];
                iArr[i14] = i15 + 1;
                i(i15, i2, "tt index");
                iArr2[i15] = i13;
            }
            int i16 = this.B;
            if (i16 >= 0 && i16 < iArr2.length) {
                this.f8342m0 = iArr2[i16];
                this.f8335f0 = 0;
                this.f8338i0 = 0;
                this.f8336g0 = 256;
                if (this.R) {
                    this.f8340k0 = 0;
                    this.f8341l0 = 0;
                    return F();
                }
                return z();
            }
            j.h("Stream corrupted");
            return 0;
        }
        return -1;
    }

    public final int z() {
        if (this.f8338i0 <= this.A) {
            this.f8337h0 = this.f8336g0;
            a aVar = this.f8344o0;
            byte[] bArr = aVar.f8330o;
            int i2 = this.f8342m0;
            int i10 = bArr[i2] & 255;
            this.f8336g0 = i10;
            i(i2, aVar.f8329n.length, "su_tPos");
            this.f8342m0 = this.f8344o0.f8329n[this.f8342m0];
            this.f8338i0++;
            this.f8331b0 = 6;
            this.X.a(i10);
            return i10;
        }
        this.f8331b0 = 5;
        m();
        t();
        return w();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (this.Z != null) {
            return v();
        }
        j.h("Stream closed");
        return 0;
    }
}
