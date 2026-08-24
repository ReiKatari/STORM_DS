package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug6  reason: default package */
/* loaded from: classes.dex */
public final class ug6 extends aj3 implements fo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ug6(Object obj, int i) {
        super(3);
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.fo2
    public final Object e(Object obj, Object obj2, Object obj3) {
        int i = this.B;
        Object obj4 = this.L;
        switch (i) {
            case 0:
                sz3 sz3Var = (sz3) obj;
                ((Number) obj3).intValue();
                xq2 xq2Var = (xq2) ((px0) obj2);
                Object P = xq2Var.P();
                vs0 vs0Var = ox0.a;
                if (P == vs0Var) {
                    P = mb3.w(xq2Var);
                    xq2Var.l0(P);
                }
                w61 w61Var = (w61) P;
                Object P2 = xq2Var.P();
                if (P2 == vs0Var) {
                    P2 = new sg6(sz3Var, w61Var);
                    xq2Var.l0(P2);
                }
                sg6 sg6Var = (sg6) P2;
                ((zv0) obj4).l(sg6Var, new wg6(sg6Var), xq2Var, 6);
                return jg7.a;
            default:
                dx4 y = ((x24) obj2).y(((q21) obj3).a);
                return ((g34) obj).K(y.A, y.B, zt1.A, new qj(5, y, (b41) obj4));
        }
    }
}
