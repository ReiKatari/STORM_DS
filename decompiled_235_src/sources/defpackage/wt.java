package defpackage;

import com.google.mlkit.common.MlKitException;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt  reason: default package */
/* loaded from: classes.dex */
public final class wt extends ak7 {
    public final double[] l;
    public final vt[] m;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
        if (r5 == r3) goto L93;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wt] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, vt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wt(int[] iArr, double[] dArr, double[][] dArr2) {
        double d;
        double d2;
        boolean z;
        int i;
        int i2;
        int i3;
        double d3;
        double[] dArr3;
        double[] dArr4;
        boolean z2;
        double[] dArr5 = dArr;
        ?? obj = new Object();
        obj.l = dArr5;
        int i4 = 1;
        obj.m = new vt[dArr5.length - 1];
        char c = 0;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        wt wtVar = obj;
        while (true) {
            vt[] vtVarArr = wtVar.m;
            if (i5 < vtVarArr.length) {
                int i8 = iArr[i5];
                if (i8 != 0) {
                    if (i8 != i4) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                if (i8 != 4) {
                                    if (i8 == 5) {
                                        i7 = 5;
                                    }
                                } else {
                                    i7 = 4;
                                }
                            }
                        }
                        i6 = 2;
                        i7 = i6;
                    }
                    i6 = i4;
                    i7 = i6;
                } else {
                    i7 = 3;
                }
                double d4 = dArr5[i5];
                int i9 = i5 + 1;
                double d5 = dArr5[i9];
                double[] dArr6 = dArr2[i5];
                double d6 = dArr6[c];
                int i10 = i4;
                int i11 = i5;
                double d7 = dArr6[i10];
                double[] dArr7 = dArr2[i9];
                boolean z3 = c;
                double d8 = dArr7[z3 ? 1 : 0];
                double d9 = dArr7[i10];
                ?? obj2 = new Object();
                obj2.r = z3;
                int i12 = i6;
                double d10 = d8 - d6;
                double d11 = d9 - d7;
                boolean z4 = i10;
                if (i7 != z4) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            obj2.q = false;
                        } else {
                            obj2.q = d11 < 0.0d;
                        }
                    } else {
                        if (d11 > 0.0d) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        obj2.q = z2;
                    }
                    d = d10;
                    d2 = d4;
                    z = true;
                } else {
                    obj2.q = z4;
                    d = d10;
                    d2 = d4;
                    z = z4;
                }
                obj2.c = d2;
                obj2.d = d5;
                double d12 = d5 - d2;
                double d13 = 1.0d / d12;
                obj2.i = d13;
                if (3 == i7) {
                    obj2.r = z;
                }
                if (obj2.r || Math.abs(d) < 0.001d || Math.abs(d11) < 0.001d) {
                    i = 1;
                    obj2.r = true;
                    obj2.e = d6;
                    obj2.f = d8;
                    obj2.g = d7;
                    obj2.h = d9;
                    double d14 = d;
                    double hypot = Math.hypot(d11, d14);
                    obj2.b = hypot;
                    obj2.n = hypot * d13;
                    obj2.l = d14 / d12;
                    obj2.m = d11 / d12;
                } else {
                    double[] dArr8 = new double[MlKitException.NOT_ENOUGH_SPACE];
                    obj2.a = dArr8;
                    boolean z5 = obj2.q;
                    if (z5) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    obj2.j = i2 * d;
                    if (z5) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    obj2.k = i3 * d11;
                    obj2.l = z5 ? d8 : d6;
                    if (z5) {
                        d3 = d7;
                    } else {
                        d3 = d9;
                    }
                    obj2.m = d3;
                    double d15 = d7 - d9;
                    double d16 = 0.0d;
                    double d17 = 0.0d;
                    double d18 = 0.0d;
                    int i13 = 0;
                    while (true) {
                        dArr3 = vt.s;
                        if (i13 >= 91) {
                            break;
                        }
                        double d19 = d18;
                        double radians = Math.toRadians((i13 * 90.0d) / 90.0d);
                        double sin = Math.sin(radians) * d;
                        double cos = Math.cos(radians) * d15;
                        if (i13 > 0) {
                            dArr4 = dArr8;
                            d16 += Math.hypot(sin - d17, cos - d19);
                            dArr3[i13] = d16;
                        } else {
                            dArr4 = dArr8;
                        }
                        i13++;
                        d18 = cos;
                        d17 = sin;
                        dArr8 = dArr4;
                    }
                    double[] dArr9 = dArr8;
                    obj2.b = d16;
                    for (int i14 = 0; i14 < 91; i14++) {
                        dArr3[i14] = dArr3[i14] / d16;
                    }
                    for (int i15 = 0; i15 < 101; i15++) {
                        double d20 = i15 / 100.0d;
                        int binarySearch = Arrays.binarySearch(dArr3, d20);
                        if (binarySearch >= 0) {
                            dArr9[i15] = binarySearch / 90.0d;
                        } else if (binarySearch == -1) {
                            dArr9[i15] = 0.0d;
                        } else {
                            int i16 = -binarySearch;
                            int i17 = i16 - 2;
                            double d21 = dArr3[i17];
                            dArr9[i15] = (((d20 - d21) / (dArr3[i16 - 1] - d21)) + i17) / 90.0d;
                        }
                    }
                    obj2.n = obj2.b * obj2.i;
                    i = 1;
                }
                vtVarArr[i11] = obj2;
                wtVar = this;
                dArr5 = dArr;
                i4 = i;
                i5 = i9;
                i6 = i12;
                c = 0;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ak7
    public final double Z(double d) {
        vt[] vtVarArr = this.m;
        vt vtVar = vtVarArr[0];
        double d2 = vtVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (vtVar.r) {
                return (d3 * vtVarArr[0].l) + vtVar.c(d2);
            }
            vtVar.g(d2);
            return (vtVarArr[0].a() * d3) + vtVarArr[0].e();
        } else if (d > vtVarArr[vtVarArr.length - 1].d) {
            double d4 = vtVarArr[vtVarArr.length - 1].d;
            double d5 = d - d4;
            int length = vtVarArr.length - 1;
            return (d5 * vtVarArr[length].l) + vtVarArr[length].c(d4);
        } else {
            for (int i = 0; i < vtVarArr.length; i++) {
                vt vtVar2 = vtVarArr[i];
                if (d <= vtVar2.d) {
                    if (vtVar2.r) {
                        return vtVar2.c(d);
                    }
                    vtVar2.g(d);
                    return vtVarArr[i].e();
                }
            }
            return Double.NaN;
        }
    }

    @Override // defpackage.ak7
    public final void a0(double d, double[] dArr) {
        vt[] vtVarArr = this.m;
        vt vtVar = vtVarArr[0];
        double d2 = vtVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (vtVar.r) {
                double c = vtVar.c(d2);
                vt vtVar2 = vtVarArr[0];
                dArr[0] = (vtVar2.l * d3) + c;
                dArr[1] = (d3 * vtVarArr[0].m) + vtVar2.d(d2);
                return;
            }
            vtVar.g(d2);
            dArr[0] = (vtVarArr[0].a() * d3) + vtVarArr[0].e();
            dArr[1] = (vtVarArr[0].b() * d3) + vtVarArr[0].f();
        } else if (d > vtVarArr[vtVarArr.length - 1].d) {
            double d4 = vtVarArr[vtVarArr.length - 1].d;
            double d5 = d - d4;
            int length = vtVarArr.length - 1;
            vt vtVar3 = vtVarArr[length];
            if (vtVar3.r) {
                double c2 = vtVar3.c(d4);
                vt vtVar4 = vtVarArr[length];
                dArr[0] = (vtVar4.l * d5) + c2;
                dArr[1] = (d5 * vtVarArr[length].m) + vtVar4.d(d4);
                return;
            }
            vtVar3.g(d);
            dArr[0] = (vtVarArr[length].a() * d5) + vtVarArr[length].e();
            dArr[1] = (vtVarArr[length].b() * d5) + vtVarArr[length].f();
        } else {
            for (int i = 0; i < vtVarArr.length; i++) {
                vt vtVar5 = vtVarArr[i];
                if (d <= vtVar5.d) {
                    if (vtVar5.r) {
                        dArr[0] = vtVar5.c(d);
                        dArr[1] = vtVarArr[i].d(d);
                        return;
                    }
                    vtVar5.g(d);
                    dArr[0] = vtVarArr[i].e();
                    dArr[1] = vtVarArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // defpackage.ak7
    public final void b0(double d, float[] fArr) {
        vt[] vtVarArr = this.m;
        vt vtVar = vtVarArr[0];
        double d2 = vtVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (vtVar.r) {
                double c = vtVar.c(d2);
                vt vtVar2 = vtVarArr[0];
                fArr[0] = (float) ((vtVar2.l * d3) + c);
                fArr[1] = (float) ((d3 * vtVarArr[0].m) + vtVar2.d(d2));
                return;
            }
            vtVar.g(d2);
            fArr[0] = (float) ((vtVarArr[0].a() * d3) + vtVarArr[0].e());
            fArr[1] = (float) ((vtVarArr[0].b() * d3) + vtVarArr[0].f());
        } else if (d > vtVarArr[vtVarArr.length - 1].d) {
            double d4 = vtVarArr[vtVarArr.length - 1].d;
            double d5 = d - d4;
            int length = vtVarArr.length - 1;
            vt vtVar3 = vtVarArr[length];
            if (vtVar3.r) {
                double c2 = vtVar3.c(d4);
                vt vtVar4 = vtVarArr[length];
                fArr[0] = (float) ((vtVar4.l * d5) + c2);
                fArr[1] = (float) ((d5 * vtVarArr[length].m) + vtVar4.d(d4));
                return;
            }
            vtVar3.g(d);
            fArr[0] = (float) vtVarArr[length].e();
            fArr[1] = (float) vtVarArr[length].f();
        } else {
            for (int i = 0; i < vtVarArr.length; i++) {
                vt vtVar5 = vtVarArr[i];
                if (d <= vtVar5.d) {
                    if (vtVar5.r) {
                        fArr[0] = (float) vtVar5.c(d);
                        fArr[1] = (float) vtVarArr[i].d(d);
                        return;
                    }
                    vtVar5.g(d);
                    fArr[0] = (float) vtVarArr[i].e();
                    fArr[1] = (float) vtVarArr[i].f();
                    return;
                }
            }
        }
    }

    @Override // defpackage.ak7
    public final void d0(double d, double[] dArr) {
        vt[] vtVarArr = this.m;
        double d2 = vtVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > vtVarArr[vtVarArr.length - 1].d) {
            d = vtVarArr[vtVarArr.length - 1].d;
        }
        for (int i = 0; i < vtVarArr.length; i++) {
            vt vtVar = vtVarArr[i];
            if (d <= vtVar.d) {
                if (vtVar.r) {
                    dArr[0] = vtVar.l;
                    dArr[1] = vtVar.m;
                    return;
                }
                vtVar.g(d);
                dArr[0] = vtVarArr[i].a();
                dArr[1] = vtVarArr[i].b();
                return;
            }
        }
    }

    @Override // defpackage.ak7
    public final double[] g0() {
        return this.l;
    }
}
