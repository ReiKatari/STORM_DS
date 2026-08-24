package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ig2  reason: default package */
/* loaded from: classes.dex */
public final class ig2 implements i26 {
    public final fu a;
    public final iu b;
    public final float c;
    public final l71 d;
    public final float e;
    public final gg2 f;

    public ig2(fu fuVar, iu iuVar, float f, l71 l71Var, float f2, gg2 gg2Var) {
        this.a = fuVar;
        this.b = iuVar;
        this.c = f;
        this.d = l71Var;
        this.e = f2;
        this.f = gg2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int a(List list, int i, int i2, int i3, gg2 gg2Var) {
        int i4;
        int i5;
        boolean z;
        d93 d93Var;
        long a;
        int i6;
        int i7;
        boolean z2;
        d93 d93Var2;
        boolean z3;
        boolean z4;
        int i8;
        int i9 = 0;
        if (list.isEmpty()) {
            a = d93.a(0, 0);
        } else {
            int i10 = Integer.MAX_VALUE;
            ag2 ag2Var = new ag2(gg2Var, s21.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
            x24 x24Var = (x24) gt0.K0(0, list);
            if (x24Var != null) {
                i4 = x24Var.V(i);
            } else {
                i4 = 0;
            }
            if (x24Var != null) {
                i5 = x24Var.n(i4);
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
            long a2 = d93.a(i, Integer.MAX_VALUE);
            if (x24Var == null) {
                d93Var = null;
            } else {
                d93Var = new d93(d93.a(i5, i4));
            }
            int i11 = 0;
            if (ag2Var.b(z5, 0, a2, d93Var, 0, 0, 0, false, false).B) {
                if (x24Var != null) {
                    z4 = z;
                } else {
                    z4 = false;
                }
                d93 a3 = gg2Var.a(0, z4, 0);
                if (a3 != null) {
                    i8 = (int) (a3.a & 4294967295L);
                } else {
                    i8 = 0;
                }
                a = d93.a(i8, 0);
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
                    x24 x24Var2 = (x24) gt0.K0(i19, list);
                    if (x24Var2 != null) {
                        i6 = x24Var2.V(i);
                    } else {
                        i6 = i9;
                    }
                    if (x24Var2 != null) {
                        i7 = x24Var2.n(i6) + i2;
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
                    long a4 = d93.a(i18, i10);
                    if (x24Var2 == null) {
                        d93Var2 = null;
                    } else {
                        d93Var2 = new d93(d93.a(i7, i6));
                    }
                    int i22 = i6;
                    int i23 = i7;
                    zf2 b = ag2Var.b(z6, i20, a4, d93Var2, i21, i11, max, false, false);
                    if (b.A) {
                        int i24 = max + i3 + i11;
                        if (x24Var2 != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        yf2 a5 = ag2Var.a(b, z3, i21, i24, i18, i20);
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
                    i10 = Integer.MAX_VALUE;
                    i9 = 0;
                    z = true;
                }
                a = d93.a(i11 - i3, i14);
            }
        }
        return (int) (a >> 32);
    }

    @Override // defpackage.i26
    public final void b(int i, int[] iArr, int[] iArr2, g34 g34Var) {
        this.a.d(g34Var, i, iArr, g34Var.getLayoutDirection(), iArr2);
    }

    @Override // defpackage.i26
    public final long c(int i, int i2, int i3, boolean z) {
        l26 l26Var = k26.a;
        if (!z) {
            return s21.a(i, i2, 0, i3);
        }
        return nb3.t(i, i2, 0, i3);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ig2) {
                ig2 ig2Var = (ig2) obj;
                if (!this.a.equals(ig2Var.a) || !this.b.equals(ig2Var.b) || !om1.b(this.c, ig2Var.c) || !this.d.equals(ig2Var.d) || !om1.b(this.e, ig2Var.e) || !nb3.k(this.f, ig2Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.i26
    public final f34 f(final dx4[] dx4VarArr, g34 g34Var, final int[] iArr, int i, final int i2, final int[] iArr2, final int i3, final int i4, final int i5) {
        final kk3 kk3Var = kk3.Ltr;
        return g34Var.K(i, i2, zt1.A, new qn2() { // from class: hg2
            @Override // defpackage.qn2
            public final Object g(Object obj) {
                int i6;
                j26 j26Var;
                lb4 lb4Var;
                cx4 cx4Var = (cx4) obj;
                int[] iArr3 = iArr2;
                if (iArr3 != null) {
                    i6 = iArr3[i3];
                } else {
                    i6 = 0;
                }
                int i7 = i4;
                for (int i8 = i7; i8 < i5; i8++) {
                    dx4 dx4Var = dx4VarArr[i8];
                    dx4Var.getClass();
                    Object B = dx4Var.B();
                    if (B instanceof j26) {
                        j26Var = (j26) B;
                    } else {
                        j26Var = null;
                    }
                    if (j26Var == null || (lb4Var = j26Var.c) == null) {
                        lb4Var = this.d;
                    }
                    cx4.j(cx4Var, dx4Var, iArr[i8 - i7], lb4Var.m(i2, dx4Var.Z(), kk3Var) + i6);
                }
                return jg7.a;
            }
        });
    }

    @Override // defpackage.i26
    public final int h(dx4 dx4Var) {
        return dx4Var.Z();
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int a = xg6.a(this.c, (hashCode2 + ((hashCode + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31);
        return this.f.hashCode() + lb1.a(Integer.MAX_VALUE, lb1.a(Integer.MAX_VALUE, xg6.a(this.e, (this.d.hashCode() + a) * 31, 31), 31), 31);
    }

    @Override // defpackage.i26
    public final int j(dx4 dx4Var) {
        return dx4Var.d0();
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + ((Object) om1.c(this.c)) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + ((Object) om1.c(this.e)) + ", maxItemsInMainAxis=2147483647, maxLines=2147483647, overflow=" + this.f + ')';
    }
}
