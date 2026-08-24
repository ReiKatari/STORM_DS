package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wm5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wm5 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ bn5 B;
    public final /* synthetic */ List L;

    public /* synthetic */ wm5(bn5 bn5Var, List list, int i) {
        this.A = i;
        this.B = bn5Var;
        this.L = list;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        List list = this.L;
        bn5 bn5Var = this.B;
        e36 e36Var = (e36) obj;
        switch (i) {
            case 0:
                e36Var.getClass();
                bn5Var.b.X(e36Var, list);
                return jg7Var;
            case 1:
                e36Var.getClass();
                bn5Var.c.X(e36Var, list);
                return jg7Var;
            case 2:
                e36Var.getClass();
                bn5Var.e.X(e36Var, list);
                return jg7Var;
            case 3:
                e36Var.getClass();
                bn5Var.d.X(e36Var, list);
                return jg7Var;
            default:
                e36Var.getClass();
                bn5Var.g.X(e36Var, list);
                return jg7Var;
        }
    }
}
