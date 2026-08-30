package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n77  reason: default package */
/* loaded from: classes.dex */
public final class n77 implements j77 {
    public final l77 A;
    public final ka5 B;
    public final long L;
    public final long R = 0;

    public n77(l77 l77Var, ka5 ka5Var) {
        this.A = l77Var;
        this.B = ka5Var;
        this.L = (l77Var.o() + l77Var.k()) * 1000000;
    }

    @Override // defpackage.j77
    public final boolean a() {
        return true;
    }

    @Override // defpackage.j77
    public final long b(oo ooVar, oo ooVar2, oo ooVar3) {
        return Long.MAX_VALUE;
    }

    public final long c(long j) {
        long j2 = this.R;
        if (j + j2 <= 0) {
            return 0L;
        }
        long j3 = j + j2;
        long j4 = this.L;
        long j5 = j3 / j4;
        if (this.B != ka5.Restart && j5 % 2 != 0) {
            return ((j5 + 1) * j4) - j3;
        }
        return j3 - (j5 * j4);
    }

    public final oo d(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        long j2 = this.R;
        long j3 = this.L;
        if (j + j2 > j3) {
            return this.A.l(j3 - j2, ooVar, ooVar3, ooVar2);
        }
        return ooVar2;
    }

    @Override // defpackage.j77
    public final oo l(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        return this.A.l(c(j), ooVar, ooVar2, d(j, ooVar, ooVar3, ooVar2));
    }

    @Override // defpackage.j77
    public final oo p(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        return this.A.p(c(j), ooVar, ooVar2, d(j, ooVar, ooVar3, ooVar2));
    }
}
