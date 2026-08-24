package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cv0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ mv0 B;

    public /* synthetic */ cv0(mv0 mv0Var, int i) {
        this.A = i;
        this.B = mv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        mv0 mv0Var = this.B;
        switch (i) {
            case 0:
                mv0.p(mv0Var);
                return;
            default:
                mv0Var.invalidateOptionsMenu();
                return;
        }
    }
}
