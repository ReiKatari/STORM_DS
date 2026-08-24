package defpackage;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xi3  reason: default package */
/* loaded from: classes.dex */
public final class xi3 {
    public final int a;
    public final int[] b = new int[4];
    public final ga0 c = new ga0(8);
    public final short[][] d;
    public final short[] e;
    public final short[] f;
    public final short[] g;
    public final short[] h;
    public final short[][] i;
    public final short[][] j;
    public final short[][] k;
    public final short[] l;
    public final ui3 m;
    public final ao4 n;
    public final m42 o;
    public final s9 p;
    public final s9 q;

    public xi3(ui3 ui3Var, ao4 ao4Var, int i, int i2, int i3) {
        Class cls = Short.TYPE;
        this.d = (short[][]) Array.newInstance(cls, 12, 16);
        this.e = new short[12];
        this.f = new short[12];
        this.g = new short[12];
        this.h = new short[12];
        this.i = (short[][]) Array.newInstance(cls, 12, 16);
        this.j = (short[][]) Array.newInstance(cls, 4, 64);
        this.k = new short[][]{new short[2], new short[2], new short[4], new short[4], new short[8], new short[8], new short[16], new short[16], new short[32], new short[32]};
        this.l = new short[16];
        this.a = (1 << i3) - 1;
        this.p = new s9(this);
        this.q = new s9(this);
        this.m = ui3Var;
        this.n = ao4Var;
        this.o = new m42(this, i, i2);
        b();
    }

    public final void a() {
        int i;
        int i2;
        ui3 ui3Var = this.m;
        int i3 = ui3Var.g;
        if (i3 > 0) {
            ui3Var.a(ui3Var.h, i3);
        }
        while (true) {
            int i4 = ui3Var.d;
            int i5 = ui3Var.f;
            ao4 ao4Var = this.n;
            if (i4 < i5) {
                int i6 = i4 & this.a;
                short[][] sArr = this.d;
                ga0 ga0Var = this.c;
                int i7 = 9;
                int i8 = 3;
                int i9 = 7;
                int i10 = 1;
                if (ao4Var.a(sArr[ga0Var.b], i6) == 0) {
                    m42 m42Var = this.o;
                    ui3 ui3Var2 = ((xi3) m42Var.e).m;
                    int i11 = ui3Var2.d;
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        i12 += ui3Var2.b;
                    }
                    int i13 = m42Var.b;
                    yc1 yc1Var = ((yc1[]) m42Var.d)[((ui3Var2.a[i12] & 255) >> (8 - i13)) + ((i11 & m42Var.c) << i13)];
                    short[] sArr2 = (short[]) yc1Var.A;
                    xi3 xi3Var = (xi3) ((m42) yc1Var.B).e;
                    ui3 ui3Var3 = xi3Var.m;
                    ao4 ao4Var2 = xi3Var.n;
                    ga0 ga0Var2 = xi3Var.c;
                    if (ga0Var2.b < 7) {
                        do {
                            i10 = (i10 << 1) | ao4Var2.a(sArr2, i10);
                        } while (i10 < 256);
                    } else {
                        int i14 = xi3Var.b[0];
                        int i15 = ui3Var3.d;
                        int i16 = (i15 - i14) - 1;
                        if (i14 >= i15) {
                            i16 += ui3Var3.b;
                        }
                        int i17 = ui3Var3.a[i16] & 255;
                        int i18 = 1;
                        int i19 = 256;
                        do {
                            i17 <<= 1;
                            int i20 = i17 & i19;
                            int a = ao4Var2.a(sArr2, i19 + i20 + i18);
                            i18 = (i18 << 1) | a;
                            i19 &= (~i20) ^ (0 - a);
                        } while (i18 < 256);
                        i10 = i18;
                    }
                    byte[] bArr = ui3Var3.a;
                    int i21 = ui3Var3.d;
                    int i22 = i21 + 1;
                    ui3Var3.d = i22;
                    bArr[i21] = (byte) i10;
                    if (ui3Var3.e < i22) {
                        ui3Var3.e = i22;
                    }
                    int i23 = ga0Var2.b;
                    if (i23 <= 3) {
                        ga0Var2.b = 0;
                    } else if (i23 <= 9) {
                        ga0Var2.b = i23 - 3;
                    } else {
                        ga0Var2.b = i23 - 6;
                    }
                } else {
                    int a2 = ao4Var.a(this.e, ga0Var.b);
                    int[] iArr = this.b;
                    if (a2 == 0) {
                        if (ga0Var.b >= 7) {
                            i9 = 10;
                        }
                        ga0Var.b = i9;
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        i2 = this.p.t(i6);
                        if (i2 < 6) {
                            i8 = i2 - 2;
                        }
                        int b = ao4Var.b(this.j[i8]);
                        if (b < 4) {
                            iArr[0] = b;
                        } else {
                            int i24 = b >> 1;
                            int i25 = ((b & 1) | 2) << (i24 - 1);
                            iArr[0] = i25;
                            if (b < 14) {
                                short[] sArr3 = this.k[b - 4];
                                int i26 = 1;
                                int i27 = 0;
                                int i28 = 0;
                                while (true) {
                                    int a3 = ao4Var.a(sArr3, i26);
                                    i26 = (i26 << 1) | a3;
                                    int i29 = i28 + 1;
                                    i27 |= a3 << i28;
                                    if (i26 >= sArr3.length) {
                                        break;
                                    }
                                    i28 = i29;
                                }
                                iArr[0] = i25 | i27;
                            } else {
                                int i30 = i24 - 5;
                                int i31 = 0;
                                do {
                                    ao4Var.f();
                                    int i32 = ao4Var.b >>> 1;
                                    ao4Var.b = i32;
                                    int i33 = ao4Var.c;
                                    int i34 = (i33 - i32) >>> 31;
                                    ao4Var.c = i33 - (i32 & (i34 - 1));
                                    i31 = (i31 << 1) | (1 - i34);
                                    i30--;
                                } while (i30 != 0);
                                int i35 = i25 | (i31 << 4);
                                iArr[0] = i35;
                                int i36 = 1;
                                int i37 = 0;
                                int i38 = 0;
                                while (true) {
                                    short[] sArr4 = this.l;
                                    int a4 = ao4Var.a(sArr4, i36);
                                    i36 = (i36 << 1) | a4;
                                    int i39 = i38 + 1;
                                    i37 |= a4 << i38;
                                    if (i36 >= sArr4.length) {
                                        break;
                                    }
                                    i38 = i39;
                                }
                                iArr[0] = i35 | i37;
                            }
                        }
                    } else {
                        int i40 = 11;
                        if (ao4Var.a(this.f, ga0Var.b) == 0) {
                            if (ao4Var.a(this.i[ga0Var.b], i6) == 0) {
                                if (ga0Var.b >= 7) {
                                    i7 = 11;
                                }
                                ga0Var.b = i7;
                                i2 = i10;
                            }
                        } else {
                            if (ao4Var.a(this.g, ga0Var.b) == 0) {
                                i = iArr[1];
                            } else {
                                if (ao4Var.a(this.h, ga0Var.b) == 0) {
                                    i = iArr[2];
                                } else {
                                    i = iArr[3];
                                    iArr[3] = iArr[2];
                                }
                                iArr[2] = iArr[1];
                            }
                            iArr[1] = iArr[0];
                            iArr[0] = i;
                        }
                        if (ga0Var.b < 7) {
                            i40 = 8;
                        }
                        ga0Var.b = i40;
                        i10 = this.q.t(i6);
                        i2 = i10;
                    }
                    ui3Var.a(iArr[0], i2);
                }
            } else {
                ao4Var.f();
                return;
            }
        }
    }

    public final void b() {
        int[] iArr = this.b;
        int i = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        iArr[2] = 0;
        iArr[3] = 0;
        this.c.b = 0;
        int i2 = 0;
        while (true) {
            short[][] sArr = this.d;
            if (i2 >= sArr.length) {
                break;
            }
            ao4.e(sArr[i2]);
            i2++;
        }
        ao4.e(this.e);
        ao4.e(this.f);
        ao4.e(this.g);
        ao4.e(this.h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.i;
            if (i3 >= sArr2.length) {
                break;
            }
            ao4.e(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.j;
            if (i4 >= sArr3.length) {
                break;
            }
            ao4.e(sArr3[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            short[][] sArr4 = this.k;
            if (i5 >= sArr4.length) {
                break;
            }
            ao4.e(sArr4[i5]);
            i5++;
        }
        ao4.e(this.l);
        while (true) {
            yc1[] yc1VarArr = (yc1[]) this.o.d;
            if (i < yc1VarArr.length) {
                ao4.e((short[]) yc1VarArr[i].A);
                i++;
            } else {
                this.p.F();
                this.q.F();
                return;
            }
        }
    }
}
