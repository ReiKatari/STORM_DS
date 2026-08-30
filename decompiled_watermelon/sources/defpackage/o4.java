package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o4 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ pk3 B;
    public final /* synthetic */ o31 L;
    public final /* synthetic */ float R;

    public /* synthetic */ o4(pk3 pk3Var, o31 o31Var, float f, int i) {
        this.A = i;
        this.B = pk3Var;
        this.L = o31Var;
        this.R = f;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        float f = this.R;
        o31 o31Var = this.L;
        pk3 pk3Var = this.B;
        switch (i) {
            case 0:
                dh0 dh0Var = (dh0) obj;
                dh0Var.getClass();
                int i2 = dh0Var.a;
                if (i2 == 5) {
                    if (pk3Var.a()) {
                        dh0Var.b = true;
                        tq5.w(o31Var, null, null, new p5(pk3Var, f, null, 0), 3);
                    } else if (pk3Var.h() == 0) {
                        dh0Var.b = true;
                    }
                } else if (i2 == 6 && pk3Var.c()) {
                    dh0Var.b = true;
                    tq5.w(o31Var, null, null, new p5(pk3Var, f, null, 1), 3);
                }
                return o27Var;
            default:
                oc2 oc2Var = (oc2) obj;
                oc2Var.getClass();
                oc2Var.e(new o4(pk3Var, o31Var, f, 0));
                return o27Var;
        }
    }
}
