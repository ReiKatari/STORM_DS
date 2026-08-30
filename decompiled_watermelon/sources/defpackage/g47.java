package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g47  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class g47 implements fw4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h47 b;

    public /* synthetic */ g47(h47 h47Var, int i) {
        this.a = i;
        this.b = h47Var;
    }

    @Override // defpackage.fw4
    public final Object get() {
        int i = this.a;
        h47 h47Var = this.b;
        switch (i) {
            case 0:
                return (jd0) h47Var.a.n(((fd0) h47Var.d.getValue()).a);
            default:
                return ((fd0) h47Var.d.getValue()).b;
        }
    }
}
