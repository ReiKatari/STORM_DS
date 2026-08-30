package defpackage;

import androidx.preference.Preference;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rb2  reason: default package */
/* loaded from: classes.dex */
public final class rb2 implements pr5 {
    public final nt a;
    public final qt b;
    public final float c;
    public final b41 d;
    public final float e;
    public final pb2 f;

    public rb2(nt ntVar, qt qtVar, float f, b41 b41Var, float f2, pb2 pb2Var) {
        this.a = ntVar;
        this.b = qtVar;
        this.c = f;
        this.d = b41Var;
        this.e = f2;
        this.f = pb2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(List list, int i, int i2, int i3, pb2 pb2Var) {
        int i4;
        int i5;
        boolean z;
        v23 v23Var;
        long a;
        int i6;
        int i7;
        boolean z2;
        v23 v23Var2;
        boolean z3;
        boolean z4;
        int i8;
        int i9 = 0;
        if (list.isEmpty()) {
            a = v23.a(0, 0);
        } else {
            int i10 = Preference.DEFAULT_ORDER;
            jb2 jb2Var = new jb2(pb2Var, nz0.a(0, i, 0, Preference.DEFAULT_ORDER), i2, i3);
            mv3 mv3Var = (mv3) tq0.N0(0, list);
            if (mv3Var != null) {
                i4 = mv3Var.g0(i);
            } else {
                i4 = 0;
            }
            if (mv3Var != null) {
                i5 = mv3Var.T(i4);
            } else {
                i5 = 0;
            }
            boolean z5 = true;
            if (list.size() > 1) {
                z = true;
            } else {
                z = true;
                z5 = false;
            }
            long a2 = v23.a(i, Preference.DEFAULT_ORDER);
            if (mv3Var == null) {
                v23Var = null;
            } else {
                v23Var = new v23(v23.a(i5, i4));
            }
            int i11 = 0;
            if (jb2Var.b(z5, 0, a2, v23Var, 0, 0, 0, false, false).B) {
                if (mv3Var != null) {
                    z4 = z;
                } else {
                    z4 = false;
                }
                v23 a3 = pb2Var.a(0, z4, 0);
                if (a3 != null) {
                    i8 = (int) (a3.a & 4294967295L);
                } else {
                    i8 = 0;
                }
                a = v23.a(i8, 0);
            } else {
                int size = list.size();
                int i12 = i;
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                int i16 = 0;
                int i17 = 0;
                while (true) {
                    if (i13 >= size) {
                        break;
                    }
                    int i18 = i12 - i5;
                    int i19 = i13 + 1;
                    int max = Math.max(i17, i4);
                    mv3 mv3Var2 = (mv3) tq0.N0(i19, list);
                    if (mv3Var2 != null) {
                        i6 = mv3Var2.g0(i);
                    } else {
                        i6 = i9;
                    }
                    if (mv3Var2 != null) {
                        i7 = mv3Var2.T(i6) + i2;
                    } else {
                        i7 = i9;
                    }
                    if (i13 + 2 < list.size()) {
                        z2 = z;
                    } else {
                        z2 = i9;
                    }
                    int i20 = i19 - i15;
                    boolean z6 = z2;
                    int i21 = i16;
                    long a4 = v23.a(i18, i10);
                    if (mv3Var2 == null) {
                        v23Var2 = null;
                    } else {
                        v23Var2 = new v23(v23.a(i7, i6));
                    }
                    int i22 = i6;
                    int i23 = i7;
                    ib2 b = jb2Var.b(z6, i20, a4, v23Var2, i21, i11, max, false, false);
                    if (b.A) {
                        int i24 = max + i3 + i11;
                        if (mv3Var2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        hb2 a5 = jb2Var.a(b, z3, i21, i24, i18, i20);
                        int i25 = i23 - i2;
                        i16 = i21 + 1;
                        if (b.B) {
                            if (a5 != null) {
                                long j = a5.c;
                                if (!a5.d) {
                                    i24 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i11 = i24;
                            i14 = i19;
                        } else {
                            i15 = i19;
                            i11 = i24;
                            i5 = i25;
                            i17 = 0;
                            i12 = i;
                        }
                    } else {
                        i5 = i23;
                        i12 = i18;
                        i16 = i21;
                        i17 = max;
                    }
                    i13 = i19;
                    i14 = i13;
                    i4 = i22;
                    i10 = Preference.DEFAULT_ORDER;
                    i9 = 0;
                    z = true;
                }
                a = v23.a(i11 - i3, i14);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.pr5
    public final void c(int i, int[] iArr, int[] iArr2, vv3 vv3Var) {
        this.a.g(vv3Var, i, iArr, vv3Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.pr5
    public final long d(int i, int i2, int i3, boolean z) {
        sr5 sr5Var = rr5.a;
        if (!z) {
            return nz0.a(i, i2, 0, i3);
        }
        return w81.m(i, i2, 0, i3);
    }

    @Override // defpackage.pr5
    public final int e(yn4 yn4Var) {
        return yn4Var.k0();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rb2) {
                rb2 rb2Var = (rb2) obj;
                if (!this.a.equals(rb2Var.a) || !this.b.equals(rb2Var.b) || !ji1.b(this.c, rb2Var.c) || !this.d.equals(rb2Var.d) || !ji1.b(this.e, rb2Var.e) || !b53.x(this.f, rb2Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.pr5
    public final int h(yn4 yn4Var) {
        return yn4Var.l0();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int a = ej6.a(this.c, (hashCode2 + ((hashCode + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31);
        return this.f.hashCode() + wh1.a(Preference.DEFAULT_ORDER, wh1.a(Preference.DEFAULT_ORDER, ej6.a(this.e, (this.d.hashCode() + a) * 31, 31), 31), 31);
    }

    @Override // defpackage.pr5
    public final uv3 j(final yn4[] yn4VarArr, vv3 vv3Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final sd3 sd3Var = sd3.Ltr;
        return vv3Var.s0(i, i2, qp1.A, new mi2() { // from class: qb2
            @Override // defpackage.mi2
            public final Object n(Object obj) {
                int i6;
                qr5 qr5Var;
                b53 b53Var;
                xn4 xn4Var = (xn4) obj;
                int[] iArr3 = iArr2;
                if (iArr3 != null) {
                    i6 = iArr3[i3];
                } else {
                    i6 = 0;
                }
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    yn4 yn4Var = yn4VarArr[i8];
                    yn4Var.getClass();
                    Object l = yn4Var.l();
                    if (l instanceof qr5) {
                        qr5Var = (qr5) l;
                    } else {
                        qr5Var = null;
                    }
                    if (qr5Var == null || (b53Var = qr5Var.c) == null) {
                        b53Var = this.d;
                    }
                    xn4.k(xn4Var, yn4Var, iArr[i8 - i7], b53Var.w(i2, yn4Var.k0(), sd3Var) + i6);
                }
                return o27.a;
            }
        });
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) ji1.c(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) ji1.c(this.e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ')';
    }
}
