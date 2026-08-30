package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rl  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class rl implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ vl B;
    public final /* synthetic */ ao6 L;

    public /* synthetic */ rl(vl vlVar, ao6 ao6Var, int i) {
        this.A = i;
        this.B = vlVar;
        this.L = ao6Var;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, n75] */
    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        rd3 rd3Var = null;
        ao6 ao6Var = this.L;
        vl vlVar = this.B;
        switch (i) {
            case 0:
                ql qlVar = vlVar.f;
                b5 b5Var = new b5(3, ao6Var);
                ?? obj = new Object();
                vlVar.e.d("dataBuilder", qlVar, new p6(6, obj, b5Var));
                Object obj2 = obj.A;
                if (obj2 != null) {
                    return (zn6) obj2;
                }
                b53.g0("result");
                throw null;
            case 1:
                ql qlVar2 = vlVar.g;
                rl rlVar = new rl(vlVar, ao6Var, 2);
                ?? obj3 = new Object();
                vlVar.e.d("positioner", qlVar2, new p6(6, obj3, rlVar));
                Object obj4 = obj3.A;
                if (obj4 != null) {
                    return (y55) obj4;
                }
                b53.g0("result");
                throw null;
            default:
                Object c = vlVar.c.c();
                if (((rd3) c).c0()) {
                    rd3Var = c;
                }
                rd3 rd3Var2 = rd3Var;
                if (rd3Var2 == null) {
                    return y55.e;
                }
                return ao6Var.p(rd3Var2).i(rd3Var2.Q(0L));
        }
    }
}
