package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bh3  reason: default package */
/* loaded from: classes.dex */
public final class bh3 implements ki2 {
    public final /* synthetic */ int A = 0;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public bh3(h24 h24Var, nd3 nd3Var, mi2 mi2Var) {
        this.L = h24Var;
        this.R = nd3Var;
        this.B = mi2Var;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj = this.R;
        mi2 mi2Var = this.B;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                nd3 nd3Var = (nd3) obj;
                ((h24) obj2).p(nd3Var);
                mi2Var.n(nd3Var);
                return o27Var;
            default:
                ll4 ll4Var = (ll4) obj2;
                int i2 = ol4.b;
                if (ll4Var != cp5.RESET && ll4Var != cp5.EXIT && ll4Var != k82.RESET && ll4Var != k82.EXIT) {
                    mi2Var.n(ll4Var);
                } else {
                    ((k24) obj).setValue(ll4Var);
                }
                return o27Var;
        }
    }

    public bh3(ll4 ll4Var, mi2 mi2Var, k24 k24Var) {
        this.L = ll4Var;
        this.B = mi2Var;
        this.R = k24Var;
    }
}
