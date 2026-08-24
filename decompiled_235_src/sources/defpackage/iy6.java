package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iy6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class iy6 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ zv0 B;
    public final /* synthetic */ eo2 L;
    public final /* synthetic */ fo2 R;

    public /* synthetic */ iy6(zv0 zv0Var, eo2 eo2Var, fo2 fo2Var, int i) {
        this.A = i;
        this.B = zv0Var;
        this.L = eo2Var;
        this.R = fo2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        Object obj3;
        final int i;
        int i2 = this.A;
        zv0 zv0Var = this.B;
        int i3 = 1;
        switch (i2) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    a74 c = dj6.c(x64.a, 1.0f);
                    boolean f = xq2Var.f(zv0Var);
                    eo2 eo2Var = this.L;
                    fo2 fo2Var = this.R;
                    boolean f2 = f | xq2Var.f(eo2Var) | xq2Var.f(fo2Var);
                    Object P = xq2Var.P();
                    if (f2 || P == ox0.a) {
                        P = new iy6(zv0Var, eo2Var, fo2Var, 1);
                        xq2Var.l0(P);
                    }
                    mt6.a(c, (eo2) P, xq2Var, 6, 0);
                } else {
                    xq2Var.V();
                }
                return jg7.a;
            default:
                final qt6 qt6Var = (qt6) obj;
                final q21 q21Var = (q21) obj2;
                final int h = q21.h(q21Var.a);
                List v = qt6Var.v(zv0Var, my6.Tabs);
                int size = v.size();
                final int i4 = h / size;
                final ArrayList arrayList = new ArrayList(v.size());
                int size2 = v.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    arrayList.add(((x24) v.get(i5)).y(q21.a(q21Var.a, i4, i4, 0, 0, 12)));
                }
                if (arrayList.isEmpty()) {
                    obj3 = null;
                } else {
                    obj3 = arrayList.get(0);
                    int i6 = ((dx4) obj3).B;
                    int size3 = arrayList.size() - 1;
                    if (1 <= size3) {
                        while (true) {
                            Object obj4 = arrayList.get(i3);
                            int i7 = ((dx4) obj4).B;
                            if (i6 < i7) {
                                obj3 = obj4;
                                i6 = i7;
                            }
                            if (i3 != size3) {
                                i3++;
                            }
                        }
                    }
                }
                dx4 dx4Var = (dx4) obj3;
                if (dx4Var != null) {
                    i = dx4Var.B;
                } else {
                    i = 0;
                }
                final ArrayList arrayList2 = new ArrayList(size);
                for (int i8 = 0; i8 < size; i8++) {
                    arrayList2.add(new fy6(qt6Var.Q(i4) * i8, qt6Var.Q(i4)));
                }
                final eo2 eo2Var2 = this.L;
                final fo2 fo2Var2 = this.R;
                return qt6Var.K(h, i, zt1.A, new qn2() { // from class: ky6
                    @Override // defpackage.qn2
                    public final Object g(Object obj5) {
                        int i9;
                        boolean z2;
                        boolean z3;
                        cx4 cx4Var = (cx4) obj5;
                        ArrayList arrayList3 = arrayList;
                        int size4 = arrayList3.size();
                        for (int i10 = 0; i10 < size4; i10++) {
                            cx4.l(cx4Var, (dx4) arrayList3.get(i10), i4 * i10, 0);
                        }
                        my6 my6Var = my6.Divider;
                        qt6 qt6Var2 = qt6Var;
                        List v2 = qt6Var2.v(eo2Var2, my6Var);
                        int size5 = v2.size();
                        int i11 = 0;
                        while (true) {
                            i9 = i;
                            if (i11 >= size5) {
                                break;
                            }
                            dx4 y = ((x24) v2.get(i11)).y(q21.a(q21Var.a, 0, 0, 0, 0, 11));
                            cx4.l(cx4Var, y, 0, i9 - y.B);
                            i11++;
                        }
                        List v3 = qt6Var2.v(new zv0(-220665376, true, new sa5(10, fo2Var2, arrayList2)), my6.Indicator);
                        int size6 = v3.size();
                        for (int i12 = 0; i12 < size6; i12++) {
                            x24 x24Var = (x24) v3.get(i12);
                            int i13 = h;
                            if (i13 >= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i9 >= 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!(z2 & z3)) {
                                r53.a("width and height must be >= 0");
                            }
                            cx4.l(cx4Var, x24Var.y(s21.h(i13, i13, i9, i9)), 0, 0);
                        }
                        return jg7.a;
                    }
                });
        }
    }
}
