package defpackage;

import java.lang.reflect.Array;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fc3  reason: default package */
/* loaded from: classes.dex */
public final class fc3 {
    public final int a;
    public final int[] b = new int[4];
    public final y70 c = new y70(8);
    public final short[][] d;
    public final short[] e;
    public final short[] f;
    public final short[] g;
    public final short[] h;
    public final short[][] i;
    public final short[][] j;
    public final short[][] k;
    public final short[] l;
    public final cc3 m;
    public final ze4 n;
    public final xz1 o;
    public final r9 p;
    public final r9 q;

    public fc3(cc3 cc3Var, ze4 ze4Var, int i, int i2, int i3) {
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
        this.p = new r9(this);
        this.q = new r9(this);
        this.m = cc3Var;
        this.n = ze4Var;
        this.o = new xz1(this, i, i2);
        b();
    }

    public final void a() {
        int i;
        int i2;
        cc3 cc3Var = this.m;
        int i3 = cc3Var.g;
        if (i3 > 0) {
            cc3Var.a(cc3Var.h, i3);
        }
        while (true) {
            int i4 = cc3Var.d;
            int i5 = cc3Var.f;
            ze4 ze4Var = this.n;
            if (i4 < i5) {
                int i6 = i4 & this.a;
                short[][] sArr = this.d;
                y70 y70Var = this.c;
                int i7 = 9;
                int i8 = 3;
                int i9 = 7;
                int i10 = 1;
                if (ze4Var.a(sArr[y70Var.b], i6) == 0) {
                    xz1 xz1Var = this.o;
                    cc3 cc3Var2 = ((fc3) xz1Var.e).m;
                    int i11 = cc3Var2.d;
                    int i12 = i11 - 1;
                    if (i11 <= 0) {
                        i12 += cc3Var2.b;
                    }
                    int i13 = xz1Var.b;
                    k91 k91Var = ((k91[]) xz1Var.d)[((cc3Var2.a[i12] & 255) >> (8 - i13)) + ((i11 & xz1Var.c) << i13)];
                    short[] sArr2 = (short[]) k91Var.A;
                    fc3 fc3Var = (fc3) ((xz1) k91Var.B).e;
                    cc3 cc3Var3 = fc3Var.m;
                    ze4 ze4Var2 = fc3Var.n;
                    y70 y70Var2 = fc3Var.c;
                    if (y70Var2.b < 7) {
                        do {
                            i10 = (i10 << 1) | ze4Var2.a(sArr2, i10);
                        } while (i10 < 256);
                    } else {
                        int i14 = fc3Var.b[0];
                        int i15 = cc3Var3.d;
                        int i16 = (i15 - i14) - 1;
                        if (i14 >= i15) {
                            i16 += cc3Var3.b;
                        }
                        int i17 = cc3Var3.a[i16] & 255;
                        int i18 = 1;
                        int i19 = 256;
                        do {
                            i17 <<= 1;
                            int i20 = i17 & i19;
                            int a = ze4Var2.a(sArr2, i19 + i20 + i18);
                            i18 = (i18 << 1) | a;
                            i19 &= (~i20) ^ (0 - a);
                        } while (i18 < 256);
                        i10 = i18;
                    }
                    byte[] bArr = cc3Var3.a;
                    int i21 = cc3Var3.d;
                    int i22 = i21 + 1;
                    cc3Var3.d = i22;
                    bArr[i21] = (byte) i10;
                    if (cc3Var3.e < i22) {
                        cc3Var3.e = i22;
                    }
                    int i23 = y70Var2.b;
                    if (i23 <= 3) {
                        y70Var2.b = 0;
                    } else if (i23 <= 9) {
                        y70Var2.b = i23 - 3;
                    } else {
                        y70Var2.b = i23 - 6;
                    }
                } else {
                    int a2 = ze4Var.a(this.e, y70Var.b);
                    int[] iArr = this.b;
                    if (a2 == 0) {
                        if (y70Var.b >= 7) {
                            i9 = 10;
                        }
                        y70Var.b = i9;
                        iArr[3] = iArr[2];
                        iArr[2] = iArr[1];
                        iArr[1] = iArr[0];
                        i2 = this.p.t(i6);
                        if (i2 < 6) {
                            i8 = i2 - 2;
                        }
                        int b = ze4Var.b(this.j[i8]);
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
                                    int a3 = ze4Var.a(sArr3, i26);
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
                                    ze4Var.f();
                                    int i32 = ze4Var.b >>> 1;
                                    ze4Var.b = i32;
                                    int i33 = ze4Var.c;
                                    int i34 = (i33 - i32) >>> 31;
                                    ze4Var.c = i33 - (i32 & (i34 - 1));
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
                                    int a4 = ze4Var.a(sArr4, i36);
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
                        if (ze4Var.a(this.f, y70Var.b) == 0) {
                            if (ze4Var.a(this.i[y70Var.b], i6) == 0) {
                                if (y70Var.b >= 7) {
                                    i7 = 11;
                                }
                                y70Var.b = i7;
                                i2 = i10;
                            }
                        } else {
                            if (ze4Var.a(this.g, y70Var.b) == 0) {
                                i = iArr[1];
                            } else {
                                if (ze4Var.a(this.h, y70Var.b) == 0) {
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
                        if (y70Var.b < 7) {
                            i40 = 8;
                        }
                        y70Var.b = i40;
                        i10 = this.q.t(i6);
                        i2 = i10;
                    }
                    cc3Var.a(iArr[0], i2);
                }
            } else {
                ze4Var.f();
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
            ze4.e(sArr[i2]);
            i2++;
        }
        ze4.e(this.e);
        ze4.e(this.f);
        ze4.e(this.g);
        ze4.e(this.h);
        int i3 = 0;
        while (true) {
            short[][] sArr2 = this.i;
            if (i3 >= sArr2.length) {
                break;
            }
            ze4.e(sArr2[i3]);
            i3++;
        }
        int i4 = 0;
        while (true) {
            short[][] sArr3 = this.j;
            if (i4 >= sArr3.length) {
                break;
            }
            ze4.e(sArr3[i4]);
            i4++;
        }
        int i5 = 0;
        while (true) {
            short[][] sArr4 = this.k;
            if (i5 >= sArr4.length) {
                break;
            }
            ze4.e(sArr4[i5]);
            i5++;
        }
        ze4.e(this.l);
        while (true) {
            k91[] k91VarArr = (k91[]) this.o.d;
            if (i < k91VarArr.length) {
                ze4.e((short[]) k91VarArr[i].A);
                i++;
            } else {
                this.p.F();
                this.q.F();
                return;
            }
        }
    }
}
