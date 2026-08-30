package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: di0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class di0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ je0 B;

    public /* synthetic */ di0(je0 je0Var, int i) {
        this.A = i;
        this.B = je0Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        boolean Y;
        int i = this.A;
        je0 je0Var = this.B;
        switch (i) {
            case 0:
                Y = l07.Y(je0Var);
                break;
            default:
                be0 be0Var = ce0.g;
                ce0 ce0Var = je0Var.b;
                be0Var.getClass();
                Y = be0.c(ce0Var);
                break;
        }
        return Boolean.valueOf(Y);
    }
}
