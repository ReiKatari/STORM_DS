package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bn0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bn0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pn0 B;

    public /* synthetic */ bn0(pn0 pn0Var, int i) {
        this.A = i;
        this.B = pn0Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        pn0 pn0Var = this.B;
        switch (i) {
            case 0:
                q60 q60Var = pn0Var.r;
                o27 o27Var = o27.a;
                q60Var.c(o27Var);
                return o27Var;
            case 1:
                return se.U(new bz0(6, new y(pn0Var, (j11) null, 18)), ua7.a(pn0Var), new xd6(1000L, Long.MAX_VALUE), 1);
            case 2:
                return se.U(se.X(pn0Var.g, new hn0(null, pn0Var, 2)), ua7.a(pn0Var), new xd6(1000L, Long.MAX_VALUE), 1);
            case 3:
                return se.U(se.X(se.X(new a7(pn0Var.h, 10), new hn0(null, pn0Var, 0)), new hn0(null, pn0Var, 1)), ua7.a(pn0Var), new xd6(1000L, Long.MAX_VALUE), 1);
            default:
                return se.U(se.X(se.X(pn0Var.g, new hn0(null, pn0Var, 3)), new hn0(null, pn0Var, 4)), ua7.a(pn0Var), new xd6(0L, Long.MAX_VALUE), 1);
        }
    }
}
