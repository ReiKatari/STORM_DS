package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bd1  reason: default package */
/* loaded from: classes.dex */
public final class bd1 implements yq0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bd1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yq0
    public final long a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                cd1 cd1Var = (cd1) obj;
                long a = cd1Var.o0.a();
                if (a == 16) {
                    hg5 hg5Var = (hg5) mh7.t(cd1Var, lg5.a);
                    if (hg5Var != null) {
                        long j = hg5Var.a;
                        if (j != 16) {
                            return j;
                        }
                    }
                    long j2 = ((xq0) mh7.t(cd1Var, e01.a)).a;
                    boolean k = ((hr0) mh7.t(cd1Var, ir0.a)).k();
                    float V = mh7.V(j2);
                    if (!k && V < 0.5d) {
                        return xq0.d;
                    }
                    return j2;
                }
                return a;
            default:
                return ((mg5) obj).c;
        }
    }
}
