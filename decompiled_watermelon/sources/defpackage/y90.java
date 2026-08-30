package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y90  reason: default package */
/* loaded from: classes.dex */
public final class y90 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ca0 B;

    public /* synthetic */ y90(ca0 ca0Var, int i) {
        this.A = i;
        this.B = ca0Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        ca0 ca0Var = this.B;
        switch (i) {
            case 0:
                zf0 zf0Var = (zf0) obj;
                bd0 bd0Var = ca0Var.d;
                if (zf0Var instanceof vf0) {
                    if (((vf0) zf0Var).a.equals(bd0Var.a)) {
                        ca0.a(ca0Var, zf0Var);
                        return o27Var;
                    }
                    i.n("Check failed.");
                } else if (zf0Var instanceof xf0) {
                    if (b53.x(((xf0) zf0Var).a, bd0Var.a)) {
                        ca0.a(ca0Var, zf0Var);
                        return o27Var;
                    }
                    i.n("Check failed.");
                } else {
                    return o27Var;
                }
                return null;
            default:
                o27 o27Var2 = (o27) obj;
                ca0.a(ca0Var, wf0.a);
                return o27Var;
        }
    }
}
