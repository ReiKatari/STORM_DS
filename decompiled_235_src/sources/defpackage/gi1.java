package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gi1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gi1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ gi1(Object obj, Object obj2, int i, Object obj3, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.B = i;
        this.X = obj3;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        boolean z;
        j26 j26Var;
        lb4 lb4Var;
        int a;
        int i2 = this.A;
        int i3 = 0;
        jg7 jg7Var = jg7.a;
        a47 a47Var = null;
        int i4 = this.B;
        Object obj2 = this.X;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i2) {
            case 0:
                n93 n93Var = (n93) obj3;
                y94 y94Var = (y94) obj2;
                if (obj != ((ii1) obj4)) {
                    if (obj instanceof eq6) {
                        int i5 = n93Var.a - i4;
                        int d = y94Var.d(obj);
                        if (d >= 0) {
                            i = y94Var.c[d];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        y94Var.g(Math.min(i5, i), obj);
                        return jg7Var;
                    }
                    return jg7Var;
                }
                i.m("A derived state calculation cannot read itself");
                return null;
            case 1:
                iy2 iy2Var = (iy2) obj4;
                g34 g34Var = (g34) obj3;
                dx4 dx4Var = (dx4) obj2;
                cx4 cx4Var = (cx4) obj;
                int i6 = iy2Var.b;
                i27 i27Var = iy2Var.a;
                p97 p97Var = iy2Var.c;
                b47 b47Var = (b47) iy2Var.d.c();
                if (b47Var != null) {
                    a47Var = b47Var.a;
                }
                a47 a47Var2 = a47Var;
                if (g34Var.getLayoutDirection() == kk3.Rtl) {
                    z = true;
                } else {
                    z = false;
                }
                i27Var.a(lo4.Horizontal, xk2.f(cx4Var, i6, p97Var, a47Var2, z, dx4Var.A), i4, dx4Var.A);
                cx4.l(cx4Var, dx4Var, Math.round(-i27Var.a.h()), 0);
                return jg7Var;
            case 2:
                qn2 qn2Var = (qn2) obj4;
                ((gl1) obj).getClass();
                qn2Var.g(new sr5((ss5) obj3, i4, (ss4) obj2, 0));
                return new z3(qn2Var, 13);
            case 3:
                dx4[] dx4VarArr = (dx4[]) obj4;
                l26 l26Var = (l26) obj3;
                int[] iArr = (int[]) obj2;
                cx4 cx4Var2 = (cx4) obj;
                int length = dx4VarArr.length;
                int i7 = 0;
                while (i3 < length) {
                    dx4 dx4Var2 = dx4VarArr[i3];
                    int i8 = i7 + 1;
                    dx4Var2.getClass();
                    Object B = dx4Var2.B();
                    if (B instanceof j26) {
                        j26Var = (j26) B;
                    } else {
                        j26Var = null;
                    }
                    if (j26Var != null) {
                        lb4Var = j26Var.c;
                    } else {
                        lb4Var = null;
                    }
                    if (lb4Var != null) {
                        a = lb4Var.m(i4, dx4Var2.B, kk3.Ltr);
                    } else {
                        a = l26Var.b.a(dx4Var2.B, i4);
                    }
                    cx4.j(cx4Var2, dx4Var2, iArr[i7], a);
                    i3++;
                    i7 = i8;
                }
                return jg7Var;
            default:
                List list = (List) obj4;
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                er3Var.h0(list.size(), null, new j5(23, list), new zv0(2039820996, true, new pi6(list, (qn2) obj3, (on2) obj2, i4)));
                return jg7Var;
        }
    }

    public /* synthetic */ gi1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.B = i;
    }
}
