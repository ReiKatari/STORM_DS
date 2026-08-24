package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pq3  reason: default package */
/* loaded from: classes.dex */
public final class pq3 {
    public final qn2 a;
    public bk1 c;
    public int f;
    public final m44 b = new m44(6, (byte) 0);
    public int d = -1;
    public int e = -1;

    public pq3(qn2 qn2Var) {
        this.a = qn2Var;
    }

    public final oq3 a(int i, long j, boolean z, qn2 qn2Var) {
        bk1 bk1Var = this.c;
        if (bk1Var != null) {
            b25 b25Var = (b25) bk1Var.R;
            boolean z2 = b25Var instanceof dk;
            a25 a25Var = new a25(bk1Var, i, this.b, qn2Var);
            a25Var.d = new q21(j);
            if (z2) {
                if (z) {
                    dk dkVar = (dk) b25Var;
                    dkVar.B.add(new e35(1, a25Var));
                    if (!dkVar.L) {
                        dkVar.L = true;
                        dkVar.A.post(dkVar);
                    }
                } else {
                    dk dkVar2 = (dk) b25Var;
                    dkVar2.B.add(new e35(0, a25Var));
                    if (!dkVar2.L) {
                        dkVar2.L = true;
                        dkVar2.A.post(dkVar2);
                    }
                }
            } else {
                b25Var.a(a25Var);
            }
            lb4.J(i, "compose:lazy:schedule_prefetch:index");
            return a25Var;
        }
        return nq1.a;
    }
}
