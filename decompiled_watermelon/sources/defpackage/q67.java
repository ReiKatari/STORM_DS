package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q67  reason: default package */
/* loaded from: classes.dex */
public final class q67 extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ r67 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q67(r67 r67Var, int i) {
        super(1);
        this.B = i;
        this.L = r67Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.B;
        o27 o27Var = o27.a;
        r67 r67Var = this.L;
        switch (i) {
            case 0:
                j67 j67Var = (j67) obj;
                r67Var.d = true;
                r67Var.f.c();
                return o27Var;
            default:
                hk1 hk1Var = (hk1) obj;
                jo2 jo2Var = r67Var.b;
                float f = r67Var.k;
                float f2 = r67Var.l;
                os I = hk1Var.I();
                long E = I.E();
                I.s().m();
                try {
                    ((bq0) I.B).d0(f, f2, 0L);
                    jo2Var.a(hk1Var);
                    return o27Var;
                } finally {
                    wh1.u(I, E);
                }
        }
    }
}
