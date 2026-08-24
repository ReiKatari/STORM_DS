package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj  reason: default package */
/* loaded from: classes.dex */
public final class xj implements e34 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ xj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.e34
    public final f34 d(final g34 g34Var, List list, long j) {
        dx4 dx4Var;
        final dx4 dx4Var2;
        int i;
        int i2;
        float f;
        final Integer num;
        final Integer num2;
        ArrayList arrayList;
        int i3;
        int i4;
        vr4 vr4Var;
        int i5 = this.a;
        zt1 zt1Var = zt1.A;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i5) {
            case 0:
                ((c05) obj).setParentLayoutDirection((kk3) obj2);
                return g34Var.K(0, 0, zt1Var, ne.e0);
            case 1:
                if (((eo2) obj) != null) {
                    int size = list.size();
                    for (int i6 = 0; i6 < size; i6++) {
                        x24 x24Var = (x24) list.get(i6);
                        if (nb3.k(lb4.u(x24Var), "text")) {
                            dx4Var = x24Var.y(q21.a(j, 0, 0, 0, 0, 11));
                        }
                    }
                    ex3.b("Collection contains no element matching the predicate.");
                    e41.c();
                    return null;
                }
                dx4Var = null;
                if (((eo2) obj2) != null) {
                    int size2 = list.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        x24 x24Var2 = (x24) list.get(i7);
                        if (nb3.k(lb4.u(x24Var2), "icon")) {
                            dx4Var2 = x24Var2.y(j);
                        }
                    }
                    ex3.b("Collection contains no element matching the predicate.");
                    e41.c();
                    return null;
                }
                dx4Var2 = null;
                if (dx4Var != null) {
                    i = dx4Var.A;
                } else {
                    i = 0;
                }
                if (dx4Var2 != null) {
                    i2 = dx4Var2.A;
                } else {
                    i2 = 0;
                }
                final int max = Math.max(i, i2);
                if (dx4Var != null && dx4Var2 != null) {
                    int i8 = ey6.b;
                    f = 72.0f;
                } else {
                    int i9 = ey6.b;
                    f = 48.0f;
                }
                final int r0 = g34Var.r0(f);
                if (dx4Var != null) {
                    num = Integer.valueOf(dx4Var.X(lc.a));
                } else {
                    num = null;
                }
                if (dx4Var != null) {
                    num2 = Integer.valueOf(dx4Var.X(lc.b));
                } else {
                    num2 = null;
                }
                final dx4 dx4Var3 = dx4Var;
                return g34Var.K(max, r0, zt1Var, new qn2() { // from class: dy6
                    @Override // defpackage.qn2
                    public final Object g(Object obj3) {
                        float f2;
                        cx4 cx4Var = (cx4) obj3;
                        dx4 dx4Var4 = dx4.this;
                        dx4 dx4Var5 = dx4Var2;
                        int i10 = r0;
                        if (dx4Var4 != null && dx4Var5 != null) {
                            Integer num3 = num;
                            num3.getClass();
                            int intValue = num3.intValue();
                            Integer num4 = num2;
                            num4.getClass();
                            int intValue2 = num4.intValue();
                            int i11 = ey6.b;
                            if (intValue == intValue2) {
                                f2 = 14.0f;
                            } else {
                                f2 = 6.0f;
                            }
                            g34 g34Var2 = g34Var;
                            int r02 = g34Var2.r0(2.0f) + g34Var2.r0(f2);
                            int k0 = (g34Var2.k0(ey6.a) + dx4Var5.B) - intValue;
                            int i12 = dx4Var4.A;
                            int i13 = max;
                            int i14 = (i10 - intValue2) - r02;
                            cx4.l(cx4Var, dx4Var4, (i13 - i12) / 2, i14);
                            cx4.l(cx4Var, dx4Var5, (i13 - dx4Var5.A) / 2, i14 - k0);
                        } else if (dx4Var4 != null) {
                            int i15 = ey6.b;
                            cx4.l(cx4Var, dx4Var4, 0, (i10 - dx4Var4.B) / 2);
                        } else if (dx4Var5 != null) {
                            int i16 = ey6.b;
                            cx4.l(cx4Var, dx4Var5, 0, (i10 - dx4Var5.B) / 2);
                        }
                        return jg7.a;
                    }
                });
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i10 = 0; i10 < size3; i10++) {
                    Object obj3 = list.get(i10);
                    if (!(((x24) obj3).B() instanceof l47)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((on2) obj2).c();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size4 = list2.size();
                    int i11 = 0;
                    while (i11 < size4) {
                        of5 of5Var = (of5) list2.get(i11);
                        if (of5Var != null) {
                            float f2 = of5Var.b;
                            float f3 = of5Var.a;
                            i3 = size4;
                            i4 = i11;
                            dx4 y = ((x24) arrayList2.get(i11)).y(s21.b(0, (int) Math.floor(of5Var.c - f3), 0, (int) Math.floor(of5Var.d - f2), 5));
                            int round = Math.round(f3);
                            vr4Var = new vr4(y, new i93((Math.round(f2) & 4294967295L) | (round << 32)));
                        } else {
                            i3 = size4;
                            i4 = i11;
                            vr4Var = null;
                        }
                        if (vr4Var != null) {
                            arrayList3.add(vr4Var);
                        }
                        i11 = i4 + 1;
                        size4 = i3;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size5 = list.size();
                for (int i12 = 0; i12 < size5; i12++) {
                    Object obj4 = list.get(i12);
                    if (((x24) obj4).B() instanceof l47) {
                        arrayList4.add(obj4);
                    }
                }
                return g34Var.K(q21.h(j), q21.g(j), zt1Var, new qk4(27, arrayList, jw2.i(arrayList4, (on2) obj)));
        }
    }
}
