package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qj3  reason: default package */
/* loaded from: classes.dex */
public final class qj3 {
    public final mi2 a;
    public xf1 c;
    public int f;
    public final os b = new os(27);
    public int d = -1;
    public int e = -1;

    public qj3(mi2 mi2Var) {
        this.a = mi2Var;
    }

    public final pj3 a(int i, long j, boolean z, mi2 mi2Var) {
        xf1 xf1Var = this.c;
        if (xf1Var != null) {
            zs4 zs4Var = (zs4) xf1Var.R;
            boolean z2 = zs4Var instanceof rj;
            ys4 ys4Var = new ys4(xf1Var, i, this.b, mi2Var);
            ys4Var.d = new lz0(j);
            if (z2) {
                if (z) {
                    rj rjVar = (rj) zs4Var;
                    rjVar.B.add(new au4(1, ys4Var));
                    if (!rjVar.L) {
                        rjVar.L = true;
                        rjVar.A.post(rjVar);
                    }
                } else {
                    rj rjVar2 = (rj) zs4Var;
                    rjVar2.B.add(new au4(0, ys4Var));
                    if (!rjVar2.L) {
                        rjVar2.L = true;
                        rjVar2.A.post(rjVar2);
                    }
                }
            } else {
                zs4Var.a(ys4Var);
            }
            a53.U(i, "compose:lazy:schedule_prefetch:index");
            return ys4Var;
        }
        return gm1.a;
    }
}
