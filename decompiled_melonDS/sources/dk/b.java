package dk;

import a0.g;
import a7.v;
import d1.f2;
import java.lang.reflect.Array;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final int f4115a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f4116b = new int[4];

    /* renamed from: c  reason: collision with root package name */
    public final f2 f4117c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final short[][] f4118d;

    /* renamed from: e  reason: collision with root package name */
    public final short[] f4119e;

    /* renamed from: f  reason: collision with root package name */
    public final short[] f4120f;

    /* renamed from: g  reason: collision with root package name */
    public final short[] f4121g;

    /* renamed from: h  reason: collision with root package name */
    public final short[] f4122h;

    /* renamed from: i  reason: collision with root package name */
    public final short[][] f4123i;

    /* renamed from: j  reason: collision with root package name */
    public final short[][] f4124j;

    /* renamed from: k  reason: collision with root package name */
    public final short[][] f4125k;

    /* renamed from: l  reason: collision with root package name */
    public final short[] f4126l;
    public final ck.a m;

    /* renamed from: n  reason: collision with root package name */
    public final ek.a f4127n;

    /* renamed from: o  reason: collision with root package name */
    public final a f4128o;

    /* renamed from: p  reason: collision with root package name */
    public final v f4129p;

    /* renamed from: q  reason: collision with root package name */
    public final v f4130q;

    /* JADX WARN: Type inference failed for: r2v1, types: [d1.f2, java.lang.Object] */
    public b(ck.a aVar, ek.a aVar2, int i2, int i10, int i11) {
        Class cls = Short.TYPE;
        this.f4118d = (short[][]) Array.newInstance(cls, 12, 16);
        this.f4119e = new short[12];
        this.f4120f = new short[12];
        this.f4121g = new short[12];
        this.f4122h = new short[12];
        this.f4123i = (short[][]) Array.newInstance(cls, 12, 16);
        this.f4124j = (short[][]) Array.newInstance(cls, 4, 64);
        this.f4125k = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.f4126l = new short[16];
        this.f4115a = (1 << i11) - 1;
        this.f4129p = new v(this);
        this.f4130q = new v(this);
        this.m = aVar;
        this.f4127n = aVar2;
        this.f4128o = new a(this, i2, i10);
        b();
    }

    public final void a() {
        int i2;
        int i10;
        ck.a aVar = this.m;
        int i11 = aVar.f2908g;
        if (i11 > 0) {
            aVar.a(aVar.f2909h, i11);
        }
        while (true) {
            int i12 = aVar.f2905d;
            int i13 = aVar.f2907f;
            ek.a aVar2 = this.f4127n;
            if (i12 < i13) {
                int i14 = i12 & this.f4115a;
                short[][] sArr = this.f4118d;
                f2 f2Var = this.f4117c;
                int i15 = 9;
                int i16 = 3;
                int i17 = 7;
                int i18 = 1;
                if (aVar2.a(sArr[f2Var.A], i14) == 0) {
                    a aVar3 = this.f4128o;
                    ck.a aVar4 = ((b) aVar3.f4114e).m;
                    int i19 = aVar4.f2905d;
                    int i20 = i19 - 1;
                    if (i19 <= 0) {
                        i20 += aVar4.f2903b;
                    }
                    int i21 = aVar3.f4111b;
                    g gVar = ((g[]) aVar3.f4113d)[((aVar4.f2902a[i20] & 255) >> (8 - i21)) + ((i19 & aVar3.f4112c) << i21)];
                    short[] sArr2 = (short[]) gVar.B;
                    b bVar = (b) ((a) gVar.L).f4114e;
                    ck.a aVar5 = bVar.m;
                    ek.a aVar6 = bVar.f4127n;
                    f2 f2Var2 = bVar.f4117c;
                    if (f2Var2.A < 7) {
                        do {
                            i18 = (i18 << 1) | aVar6.a(sArr2, i18);
                        } while (i18 < 256);
                    } else {
                        int i22 = bVar.f4116b[0];
                        int i23 = aVar5.f2905d;
                        int i24 = (i23 - i22) - 1;
                        if (i22 >= i23) {
                            i24 += aVar5.f2903b;
                        }
                        int i25 = aVar5.f2902a[i24] & 255;
                        int i26 = 1;
                        int i27 = 256;
                        do {
                            i25 <<= 1;
                            int i28 = i25 & i27;
                            int a10 = aVar6.a(sArr2, i27 + i28 + i26);
                            i26 = (i26 << 1) | a10;
                            i27 &= (~i28) ^ (0 - a10);
                        } while (i26 < 256);
                        i18 = i26;
                    }
                    byte[] bArr = aVar5.f2902a;
                    int i29 = aVar5.f2905d;
                    int i30 = i29 + 1;
                    aVar5.f2905d = i30;
                    bArr[i29] = (byte) i18;
                    if (aVar5.f2906e < i30) {
                        aVar5.f2906e = i30;
                    }
                    int i31 = f2Var2.A;
                    if (i31 <= 3) {
                        f2Var2.A = 0;
                    } else if (i31 <= 9) {
                        f2Var2.A = i31 - 3;
                    } else {
                        f2Var2.A = i31 - 6;
                    }
                } else {
                    int a11 = aVar2.a(this.f4119e, f2Var.A);
                    int[] iArr = this.f4116b;
                    if (a11 == 0) {
                        if (f2Var.A >= 7) {
                            i17 = 10;
                        }
                        f2Var.A = i17;
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        i10 = this.f4129p.l(i14);
                        if (i10 < 6) {
                            i16 = i10 - 2;
                        }
                        int b10 = aVar2.b(this.f4124j[i16]);
                        if (b10 < 4) {
                            iArr[0] = b10;
                        } else {
                            int i32 = b10 >> 1;
                            int i33 = ((b10 & 1) | 2) << (i32 - 1);
                            iArr[0] = i33;
                            if (b10 < 14) {
                                short[] sArr3 = this.f4125k[b10 - 4];
                                int i34 = 1;
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    int a12 = aVar2.a(sArr3, i34);
                                    i34 = (i34 << 1) | a12;
                                    int i37 = i36 + 1;
                                    i35 |= a12 << i36;
                                    if (i34 >= sArr3.length) {
                                        break;
                                    }
                                    i36 = i37;
                                }
                                iArr[0] = i33 | i35;
                            } else {
                                int i38 = i32 - 5;
                                int i39 = 0;
                                do {
                                    aVar2.f();
                                    int i40 = aVar2.f4506b >>> 1;
                                    aVar2.f4506b = i40;
                                    int i41 = aVar2.f4507c;
                                    int i42 = (i41 - i40) >>> 31;
                                    aVar2.f4507c = i41 - (i40 & (i42 - 1));
                                    i39 = (i39 << 1) | (1 - i42);
                                    i38--;
                                } while (i38 != 0);
                                int i43 = i33 | (i39 << 4);
                                iArr[0] = i43;
                                int i44 = 1;
                                int i45 = 0;
                                int i46 = 0;
                                while (true) {
                                    short[] sArr4 = this.f4126l;
                                    int a13 = aVar2.a(sArr4, i44);
                                    i44 = (i44 << 1) | a13;
                                    int i47 = i46 + 1;
                                    i45 |= a13 << i46;
                                    if (i44 >= sArr4.length) {
                                        break;
                                    }
                                    i46 = i47;
                                }
                                iArr[0] = i43 | i45;
                            }
                        }
                    } else {
                        int i48 = 11;
                        if (aVar2.a(this.f4120f, f2Var.A) == 0) {
                            if (aVar2.a(this.f4123i[f2Var.A], i14) == 0) {
                                if (f2Var.A >= 7) {
                                    i15 = 11;
                                }
                                f2Var.A = i15;
                                i10 = i18;
                            }
                        } else {
                            if (aVar2.a(this.f4121g, f2Var.A) == 0) {
                                i2 = iArr[1];
                            } else {
                                if (aVar2.a(this.f4122h, f2Var.A) == 0) {
                                    i2 = iArr[2];
                                } else {
                                    i2 = iArr[3];
                                    iArr[3] = iArr[2];
                                }
                                iArr[2] = iArr[1];
                            }
                            iArr[1] = iArr[0];
                            iArr[0] = i2;
                        }
                        if (f2Var.A < 7) {
                            i48 = 8;
                        }
                        f2Var.A = i48;
                        i18 = this.f4130q.l(i14);
                        i10 = i18;
                    }
                    aVar.a(iArr[0], i10);
                }
            } else {
                aVar2.f();
                return;
            }
        }
    }

    public final void b() {
        int[] iArr = this.f4116b;
        int i2 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.f4117c.A = 0;
        int i10 = 0;
        while (true) {
            short[][] sArr = this.f4118d;
            if (i10 >= sArr.length) {
                break;
            }
            ek.a.e(sArr[i10]);
            i10++;
        }
        ek.a.e(this.f4119e);
        ek.a.e(this.f4120f);
        ek.a.e(this.f4121g);
        ek.a.e(this.f4122h);
        int i11 = 0;
        while (true) {
            short[][] sArr2 = this.f4123i;
            if (i11 >= sArr2.length) {
                break;
            }
            ek.a.e(sArr2[i11]);
            i11++;
        }
        int i12 = 0;
        while (true) {
            short[][] sArr3 = this.f4124j;
            if (i12 >= sArr3.length) {
                break;
            }
            ek.a.e(sArr3[i12]);
            i12++;
        }
        int i13 = 0;
        while (true) {
            short[][] sArr4 = this.f4125k;
            if (i13 >= sArr4.length) {
                break;
            }
            ek.a.e(sArr4[i13]);
            i13++;
        }
        ek.a.e(this.f4126l);
        while (true) {
            g[] gVarArr = (g[]) this.f4128o.f4113d;
            if (i2 < gVarArr.length) {
                ek.a.e((short[]) gVarArr[i2].B);
                i2++;
            } else {
                this.f4129p.v();
                this.f4130q.v();
                return;
            }
        }
    }
}
