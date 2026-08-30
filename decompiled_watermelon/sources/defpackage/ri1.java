package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ri1  reason: default package */
/* loaded from: classes.dex */
public final class ri1 extends ic3 implements mi2 {
    public final /* synthetic */ int B = 1;
    public final /* synthetic */ j75 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri1(t71 t71Var, si1 si1Var, j75 j75Var) {
        super(1);
        this.L = j75Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        j75 j75Var = this.L;
        switch (i) {
            case 0:
                si1 si1Var = (si1) obj;
                if (!si1Var.i0) {
                    return yx6.SkipSubtreeAndContinueTraversal;
                }
                if (si1Var.k0 != null) {
                    mz2.c("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                }
                si1Var.k0 = null;
                j75Var.A = j75Var.A;
                return yx6.ContinueTraversal;
            default:
                if (((ms2) obj).l0) {
                    j75Var.A = false;
                    return yx6.CancelTraversal;
                }
                return yx6.ContinueTraversal;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri1(j75 j75Var) {
        super(1);
        this.L = j75Var;
    }
}
