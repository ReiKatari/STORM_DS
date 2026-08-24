package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mv6 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ig1 B;

    public /* synthetic */ mv6(ig1 ig1Var, int i) {
        this.A = i;
        this.B = ig1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ig1 ig1Var = this.B;
        switch (i) {
            case 0:
                ig1Var.a();
                return;
            default:
                ig1Var.b();
                return;
        }
    }
}
