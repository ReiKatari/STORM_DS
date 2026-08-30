package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cn0  reason: default package */
/* loaded from: classes.dex */
public final class cn0 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ l44 B;

    public /* synthetic */ cn0(l44 l44Var, int i) {
        this.A = i;
        this.B = l44Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        l44 l44Var = this.B;
        switch (i) {
            case 0:
                qd4 qd4Var = (qd4) obj;
                l44.b(l44Var, um0.INSTANCE);
                return o27Var;
            case 1:
                l44.b(l44Var, new tm0(((qd4) obj).a));
                return o27Var;
            case 2:
                l44.b(l44Var, new qm0(((qd4) obj).a));
                return o27Var;
            default:
                o27 o27Var2 = (o27) obj;
                l44.b(l44Var, nm0.INSTANCE);
                return o27Var;
        }
    }
}
