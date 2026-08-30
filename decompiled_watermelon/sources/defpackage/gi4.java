package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gi4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gi4 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ki4 B;

    public /* synthetic */ gi4(ki4 ki4Var, int i) {
        this.A = i;
        this.B = ki4Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int k;
        int k2;
        int j;
        int i = this.A;
        ki4 ki4Var = this.B;
        switch (i) {
            case 0:
                if (ki4Var.k.b()) {
                    k = ki4Var.r.h();
                } else {
                    k = ki4Var.k();
                }
                return Integer.valueOf(k);
            case 1:
                boolean b = ki4Var.k.b();
                qj4 qj4Var = ki4Var.q;
                if (!b) {
                    k2 = ki4Var.k();
                } else if (qj4Var.h() != -1) {
                    k2 = qj4Var.h();
                } else {
                    float abs = Math.abs(ki4Var.l());
                    od1 od1Var = ki4Var.n;
                    mi4 mi4Var = ni4.a;
                    if (abs >= Math.abs(Math.min(od1Var.C(56.0f), ki4Var.o() / 2.0f) / ki4Var.o())) {
                        boolean booleanValue = ((Boolean) ki4Var.D.getValue()).booleanValue();
                        int i2 = ki4Var.e;
                        if (booleanValue) {
                            k2 = i2 + 1;
                        } else {
                            k2 = i2;
                        }
                    } else {
                        k2 = ki4Var.k();
                    }
                }
                j = ki4Var.j(k2);
                break;
            default:
                j = ki4Var.n();
                break;
        }
        return Integer.valueOf(j);
    }
}
