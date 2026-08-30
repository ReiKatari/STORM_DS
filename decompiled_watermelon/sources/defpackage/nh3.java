package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nh3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nh3 implements aj2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ mi2 B;

    public /* synthetic */ nh3(int i, mi2 mi2Var) {
        this.A = i;
        this.B = mi2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        int i = this.A;
        o27 o27Var = o27.a;
        mi2 mi2Var = this.B;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                return (fo2) mi2Var.n((ei3) obj);
            case 1:
                mi2Var.n(new xe5(((Integer) obj).intValue(), ((Integer) obj2).intValue()));
                return o27Var;
            default:
                o27 o27Var2 = (o27) obj2;
                mi2Var.n(obj);
                return o27Var;
        }
    }
}
