package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a11  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a11 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    public /* synthetic */ a11(Object obj, int i, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = i;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.A;
        boolean z3 = false;
        jg7 jg7Var = jg7.a;
        int i2 = this.B;
        Object obj3 = this.L;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                f04.m((c11) obj3, (px0) obj, ii2.a0(i2 | 1));
                return jg7Var;
            case 1:
                po3 po3Var = (po3) obj3;
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z3 = true;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z3)) {
                    bb3 d = po3Var.b.i.d(i2);
                    ((mo3) d.c).d.l(ro3.a, Integer.valueOf(i2 - d.a), xq2Var, 6);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            case 2:
                fr3 fr3Var = (fr3) obj3;
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z)) {
                    bb3 d2 = fr3Var.b.h.d(i2);
                    ((br3) d2.c).c.l(fr3Var.c, Integer.valueOf(i2 - d2.a), xq2Var2, 0);
                } else {
                    xq2Var2.V();
                }
                return jg7Var;
            default:
                ar4 ar4Var = (ar4) obj3;
                px0 px0Var3 = (px0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var3 = (xq2) px0Var3;
                if (xq2Var3.S(intValue3 & 1, z2)) {
                    bb3 d3 = ar4Var.b.J().d(i2);
                    ((vq4) d3.c).b.l(dr4.a, Integer.valueOf(i2 - d3.a), xq2Var3, 0);
                } else {
                    xq2Var3.V();
                }
                return jg7Var;
        }
    }
}
