package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg5  reason: default package */
/* loaded from: classes.dex */
public final class dg5 extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ eg5 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dg5(eg5 eg5Var, int i) {
        super(1);
        this.B = i;
        this.L = eg5Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        eg5 eg5Var = this.L;
        switch (i) {
            case 0:
                return Double.valueOf(eg5Var.n.a(io2.k(((Number) obj).doubleValue(), eg5Var.e, eg5Var.f)));
            default:
                return Double.valueOf(io2.k(eg5Var.k.a(((Number) obj).doubleValue()), eg5Var.e, eg5Var.f));
        }
    }
}
