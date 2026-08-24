package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm1  reason: default package */
/* loaded from: classes.dex */
public final class xm1 extends aj3 implements qn2 {
    public final /* synthetic */ int B = 0;
    public final /* synthetic */ zg5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(d51 d51Var, ym1 ym1Var, zg5 zg5Var) {
        super(1);
        this.L = zg5Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.B;
        zg5 zg5Var = this.L;
        switch (i) {
            case 0:
                ym1 ym1Var = (ym1) obj;
                if (!ym1Var.j0) {
                    return tb7.SkipSubtreeAndContinueTraversal;
                }
                if (ym1Var.l0 != null) {
                    p53.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                ym1Var.l0 = null;
                zg5Var.A = zg5Var.A;
                return tb7.ContinueTraversal;
            default:
                if (((ny2) obj).m0) {
                    zg5Var.A = false;
                    return tb7.CancelTraversal;
                }
                return tb7.ContinueTraversal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm1(zg5 zg5Var) {
        super(1);
        this.L = zg5Var;
    }
}
