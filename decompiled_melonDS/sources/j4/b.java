package j4;

import a1.h0;
import a4.b2;
import a4.i1;
import a4.m0;
import a4.n1;
import a4.o0;
import a4.r1;
import a5.k0;
import android.os.Handler;
import b4.y1;
import c8.c0;
import i3.e0;
import i3.z;
import x4.j;
import x4.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final c0 f7417a;

    /* renamed from: b  reason: collision with root package name */
    public final e f7418b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f7419c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7420d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f7421e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7422f;

    /* renamed from: g  reason: collision with root package name */
    public k0 f7423g;

    /* renamed from: h  reason: collision with root package name */
    public long f7424h;

    /* renamed from: i  reason: collision with root package name */
    public final m0 f7425i;

    /* renamed from: j  reason: collision with root package name */
    public final h3.a f7426j;

    public b() {
        c0 c0Var = new c0(2);
        c0Var.f2625c = new long[192];
        c0Var.f2626d = new long[192];
        this.f7417a = c0Var;
        this.f7418b = new e();
        this.f7419c = new h0();
        this.f7424h = -1L;
        this.f7425i = new m0(10, this);
        this.f7426j = new h3.a();
    }

    public static boolean c(r1 r1Var) {
        b2 b2Var = r1Var.H0;
        if (b2Var != null && !z.p(((y1) b2Var).b())) {
            return true;
        }
        return false;
    }

    public static long g(o0 o0Var) {
        n1 n1Var = o0Var.A0;
        r1 r1Var = n1Var.f266d;
        long j2 = 0;
        for (r1 r1Var2 = n1Var.f265c; r1Var2 != null && r1Var2 != r1Var; r1Var2 = r1Var2.f319m0) {
            if (c(r1Var2)) {
                return 9223372034707292159L;
            }
            j2 = j.c(j2, r1Var2.f327v0);
        }
        return j2;
    }

    public static void i(o0 o0Var) {
        if (o0Var.L && !c(o0Var.A0.f266d)) {
            o0Var.L = false;
            if (o0Var.Z) {
                o0Var.Y = g(o0Var);
                o0Var.Z = false;
            }
            if (!j.a(o0Var.Y, 9223372034707292159L)) {
                p2.b z10 = o0Var.z();
                Object[] objArr = z10.A;
                int i2 = z10.L;
                for (int i10 = 0; i10 < i2; i10++) {
                    i((o0) objArr[i10]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.b.a():void");
    }

    public final long b(o0 o0Var) {
        long j2;
        int i2 = o0Var.B & 33554431;
        c0 c0Var = this.f7417a;
        long[] jArr = (long[]) c0Var.f2625c;
        int i10 = c0Var.f2624b;
        for (int i11 = 0; i11 < jArr.length - 2 && i11 < i10; i11 += 3) {
            if ((((int) jArr[i11 + 2]) & 33554431) == i2) {
                j2 = jArr[i11];
                break;
            }
        }
        j2 = Long.MAX_VALUE;
        if (j2 == Long.MAX_VALUE) {
            return 9223372034707292159L;
        }
        return (((int) (j2 >> 32)) << 32) | (((int) j2) & 4294967295L);
    }

    public final void d(o0 o0Var) {
        i1 i1Var;
        char c4;
        boolean z10;
        int i2;
        long b10;
        boolean z11 = true;
        o0Var.L = true;
        o0Var.R = 9223372034707292159L;
        n1 n1Var = o0Var.A0;
        r1 r1Var = n1Var.f266d;
        int n02 = o0Var.B0.f348p.n0();
        h3.a aVar = this.f7426j;
        aVar.f6046b = 0.0f;
        aVar.f6047c = 0.0f;
        aVar.f6048d = n02;
        aVar.f6049e = i1Var.j0();
        while (true) {
            c4 = ' ';
            if (r1Var == null) {
                break;
            }
            o0 o0Var2 = r1Var.f315i0;
            if (r1Var == o0Var2.A0.f266d && !o0Var2.L) {
                if (!j.a(b(o0Var2), 9223372034707292159L)) {
                    aVar.h((Float.floatToRawIntBits((int) (b10 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (b10 >> 32)) << 32));
                    break;
                }
            }
            b2 b2Var = r1Var.H0;
            if (b2Var != null) {
                float[] b11 = ((y1) b2Var).b();
                if (!z.p(b11)) {
                    e0.c(b11, aVar);
                }
            }
            long j2 = r1Var.f327v0;
            aVar.h((4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
            r1Var = r1Var.f319m0;
        }
        int i10 = (int) aVar.f6046b;
        int i11 = (int) aVar.f6047c;
        int i12 = (int) aVar.f6048d;
        int i13 = (int) aVar.f6049e;
        int i14 = o0Var.B;
        boolean z12 = o0Var.f278b0;
        o0Var.f278b0 = true;
        c0 c0Var = this.f7417a;
        if (z12) {
            int i15 = i14 & 33554431;
            long[] jArr = (long[]) c0Var.f2625c;
            int i16 = c0Var.f2624b;
            int i17 = 0;
            while (i17 < jArr.length - 2 && i17 < i16) {
                int i18 = i17 + 2;
                char c10 = c4;
                c0 c0Var2 = c0Var;
                long j10 = jArr[i18];
                z10 = z11;
                if ((((int) j10) & 33554431) == i15) {
                    jArr[i17] = (i10 << c10) | (i11 & 4294967295L);
                    jArr[i17 + 1] = (i13 & 4294967295L) | (i12 << c10);
                    jArr[i18] = (((j10 >> 63) & 1) << 60) | j10;
                    break;
                }
                i17 += 3;
                c4 = c10;
                c0Var = c0Var2;
                z11 = z10;
            }
        }
        z10 = z11;
        c0 c0Var3 = c0Var;
        o0 u4 = o0Var.u();
        if (u4 != null) {
            i2 = u4.B;
        } else {
            i2 = -1;
        }
        c0.i(c0Var3, i14, i10, i11, i12, i13, i2, n1Var.d(1024), n1Var.d(16), this.f7418b.f7442a.a(i14), 512);
        this.f7420d = z10;
        p2.b z13 = o0Var.z();
        Object[] objArr = z13.A;
        int i19 = z13.L;
        for (int i20 = 0; i20 < i19; i20++) {
            o0 o0Var3 = (o0) objArr[i20];
            if (o0Var3.I()) {
                d(o0Var3);
            }
        }
    }

    public final void e(o0 o0Var) {
        if (o0Var.f278b0) {
            this.f7420d = true;
            int i2 = o0Var.B & 33554431;
            c0 c0Var = this.f7417a;
            long[] jArr = (long[]) c0Var.f2625c;
            int i10 = c0Var.f2624b;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    break;
                }
                int i12 = i11 + 2;
                long j2 = jArr[i12];
                if ((((int) j2) & 33554431) == i2) {
                    jArr[i12] = (((j2 >> 63) & 1) << 60) | j2;
                    break;
                }
                i11 += 3;
            }
        }
        j();
    }

    public final void f(o0 o0Var, boolean z10) {
        long j2;
        boolean z11;
        boolean z12;
        int i2;
        int i10;
        int i11;
        int i12;
        boolean I = o0Var.I();
        n1 n1Var = o0Var.A0;
        if (!I) {
            return;
        }
        o0 u4 = o0Var.u();
        if (u4 != null && !u4.L) {
            if (u4.Z) {
                u4.Z = false;
                u4.Y = g(u4);
            }
            j2 = u4.Y;
        } else if (u4 == null) {
            j2 = 0;
        } else {
            j2 = 9223372034707292159L;
        }
        r1 r1Var = n1Var.f266d;
        if (!j.a(j2, 9223372034707292159L) && !c(r1Var)) {
            if (!o0Var.L) {
                long c4 = j.c(j2, r1Var.f327v0);
                i1 i1Var = o0Var.B0.f348p;
                int n02 = i1Var.n0();
                int j02 = i1Var.j0();
                long j10 = (n02 << 32) | (j02 & 4294967295L);
                int i13 = o0Var.B;
                boolean z13 = o0Var.f278b0;
                c0 c0Var = this.f7417a;
                if (z13) {
                    if (z10 || !j.a(c4, o0Var.R) || !l.b(j10, o0Var.X)) {
                        if (u4 != null) {
                            int i14 = u4.B;
                            int i15 = (int) (c4 >> 32);
                            int i16 = (int) (c4 & 4294967295L);
                            int i17 = i13 & 33554431;
                            long[] jArr = (long[]) c0Var.f2625c;
                            int i18 = c0Var.f2624b;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= jArr.length - 2 || i19 >= i18) {
                                    break;
                                }
                                int i20 = n02;
                                if ((((int) jArr[i19 + 2]) & 33554431) == i14) {
                                    long j11 = jArr[i19];
                                    i11 = i15;
                                    i12 = i16;
                                    int i21 = ((int) (j11 >> 32)) + i11;
                                    int i22 = ((int) j11) + i12;
                                    int i23 = i21 + i20;
                                    int i24 = i22 + j02;
                                    int i25 = i19 + 3;
                                    i2 = i14;
                                    while (i25 < jArr.length - 2 && i25 < i18) {
                                        int i26 = i25 + 2;
                                        int i27 = i18;
                                        long j12 = jArr[i26];
                                        int i28 = i25;
                                        if ((((int) j12) & 33554431) == i17) {
                                            long j13 = jArr[i28];
                                            int i29 = i21 - ((int) (j13 >> 32));
                                            int i30 = i22 - ((int) j13);
                                            jArr[i28] = (i21 << 32) | (i22 & 4294967295L);
                                            jArr[i28 + 1] = (i23 << 32) | (i24 & 4294967295L);
                                            jArr[i26] = j12 | (((j12 >> 63) & 1) << 60);
                                            if (i29 != 0 || i30 != 0) {
                                                c0Var.n((j12 & a.f7415b) | (((i28 + 3) & 33554431) << 25), i29, i30);
                                            }
                                        } else {
                                            i25 = i28 + 3;
                                            i18 = i27;
                                        }
                                    }
                                    i10 = i18;
                                    i19 = i25;
                                } else {
                                    i2 = i14;
                                    i10 = i18;
                                    i11 = i15;
                                    i12 = i16;
                                }
                                i19 += 3;
                                n02 = i20;
                                i15 = i11;
                                i16 = i12;
                                i14 = i2;
                                i18 = i10;
                            }
                        } else {
                            int i31 = (int) (c4 >> 32);
                            int i32 = (int) (c4 & 4294967295L);
                            int i33 = i31 + n02;
                            int i34 = i32 + j02;
                            int i35 = i13 & 33554431;
                            long[] jArr2 = (long[]) c0Var.f2625c;
                            int i36 = c0Var.f2624b;
                            int i37 = 0;
                            while (true) {
                                if (i37 >= jArr2.length - 2 || i37 >= i36) {
                                    break;
                                }
                                int i38 = i37 + 2;
                                int i39 = i36;
                                int i40 = i37;
                                long j14 = jArr2[i38];
                                long[] jArr3 = jArr2;
                                if ((((int) j14) & 33554431) == i35) {
                                    long j15 = jArr3[i40];
                                    jArr3[i40] = (i31 << 32) | (i32 & 4294967295L);
                                    jArr3[i40 + 1] = (i33 << 32) | (i34 & 4294967295L);
                                    jArr3[i38] = j14 | (((j14 >> 63) & 1) << 60);
                                    int i41 = i31 - ((int) (j15 >> 32));
                                    int i42 = i32 - ((int) j15);
                                    if (i41 != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (i42 != 0) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11 | z12) {
                                        c0Var.n((j14 & a.f7415b) | (((i40 + 3) & 33554431) << 25), i41, i42);
                                    }
                                } else {
                                    i37 = i40 + 3;
                                    i36 = i39;
                                    jArr2 = jArr3;
                                }
                            }
                        }
                        this.f7420d = true;
                    }
                } else {
                    o0Var.f278b0 = true;
                    boolean d4 = n1Var.d(1024);
                    boolean d10 = n1Var.d(16);
                    boolean a10 = this.f7418b.f7442a.a(i13);
                    if (u4 != null) {
                        int i43 = u4.B;
                        int i44 = (int) (c4 >> 32);
                        int i45 = (int) (c4 & 4294967295L);
                        int i46 = 33554431;
                        int i47 = i13 & 33554431;
                        long[] jArr4 = (long[]) c0Var.f2625c;
                        int i48 = c0Var.f2624b;
                        int i49 = 0;
                        while (true) {
                            if (i49 >= jArr4.length - 2 || i49 >= i48) {
                                break;
                            }
                            int i50 = i46;
                            long[] jArr5 = jArr4;
                            if ((((int) jArr5[i49 + 2]) & i50) == i43) {
                                long j16 = jArr5[i49];
                                int i51 = ((int) (j16 >> 32)) + i44;
                                int i52 = ((int) j16) + i45;
                                c0Var.h(i47, i51, i52, i51 + n02, i52 + j02, i43, d4, d10, a10, i49);
                                break;
                            }
                            jArr4 = jArr5;
                            i49 += 3;
                            i46 = i50;
                            i43 = i43;
                        }
                    } else {
                        int i53 = (int) (c4 >> 32);
                        int i54 = (int) (c4 & 4294967295L);
                        c0.i(c0Var, i13, i53, i54, i53 + n02, i54 + j02, 0, d4, d10, a10, 544);
                    }
                    this.f7420d = true;
                }
                o0Var.X = j10;
                o0Var.R = c4;
                return;
            }
            d(o0Var);
            i(o0Var);
            return;
        }
        d(o0Var);
    }

    public final void h(o0 o0Var) {
        if (o0Var.f278b0) {
            int i2 = o0Var.B & 33554431;
            c0 c0Var = this.f7417a;
            long[] jArr = (long[]) c0Var.f2625c;
            int i10 = c0Var.f2624b;
            int i11 = 0;
            while (true) {
                if (i11 >= jArr.length - 2 || i11 >= i10) {
                    break;
                }
                int i12 = i11 + 2;
                if ((((int) jArr[i12]) & 33554431) == i2) {
                    jArr[i11] = -1;
                    jArr[i11 + 1] = -1;
                    jArr[i12] = a.f7416c;
                    break;
                }
                i11 += 3;
            }
            o0Var.f278b0 = false;
            this.f7420d = true;
            this.f7422f = true;
        }
    }

    public final void j() {
        boolean z10;
        k0 k0Var = this.f7423g;
        if (k0Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        long j2 = this.f7418b.f7444c;
        if (j2 >= 0 || !z10) {
            if (this.f7424h == j2 && z10) {
                return;
            }
            if (k0Var != null) {
                Handler handler = b3.b.f1752a;
                b3.b.f1752a.removeCallbacks(k0Var);
            }
            Handler handler2 = b3.b.f1752a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j2, 16 + currentTimeMillis);
            this.f7424h = max;
            k0 k0Var2 = new k0(1, this.f7425i);
            b3.b.f1752a.postDelayed(k0Var2, max - currentTimeMillis);
            this.f7423g = k0Var2;
        }
    }
}
