package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i7 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ i7(long j, el6 el6Var, String str) {
        this.A = 3;
        this.B = j;
        this.L = el6Var;
        this.R = str;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj3 = this.R;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ge7.a((List) obj4, this.B, (qn2) obj3, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 1:
                ((Integer) obj2).getClass();
                vf.a((ok4) obj4, (a74) obj3, this.B, (px0) obj, ii2.a0(1));
                return jg7Var;
            case 2:
                ((Integer) obj2).getClass();
                k65.a((n65) obj4, this.B, (a74) obj3, (px0) obj, ii2.a0(385));
                return jg7Var;
            default:
                el6 el6Var = (el6) obj4;
                String str = (String) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bd1 b = k90.b(this.B, xq2Var, 5);
                    boolean h = xq2Var.h(el6Var);
                    Object P = xq2Var.P();
                    if (h || P == ox0.a) {
                        P = new cl6(el6Var, 1);
                        xq2Var.l0(P);
                    }
                    mb3.o((on2) P, null, false, b, n16.I(-929149933, new e20(str, 1), xq2Var), xq2Var, 805306368, 382);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
        }
    }

    public /* synthetic */ i7(ok4 ok4Var, a74 a74Var, long j, int i) {
        this.A = 1;
        this.L = ok4Var;
        this.R = a74Var;
        this.B = j;
    }

    public /* synthetic */ i7(Object obj, long j, Object obj2, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = j;
        this.R = obj2;
    }
}
