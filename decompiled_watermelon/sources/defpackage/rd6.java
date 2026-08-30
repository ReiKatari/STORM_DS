package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rd6  reason: default package */
/* loaded from: classes.dex */
public final class rd6 implements j77 {
    public final j77 A;
    public final long B;

    public rd6(j77 j77Var, long j) {
        this.A = j77Var;
        this.B = j;
    }

    @Override // defpackage.j77
    public final boolean a() {
        return this.A.a();
    }

    @Override // defpackage.j77
    public final long b(oo ooVar, oo ooVar2, oo ooVar3) {
        return this.A.b(ooVar, ooVar2, ooVar3) + this.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rd6)) {
            return false;
        }
        rd6 rd6Var = (rd6) obj;
        if (rd6Var.B != this.B || !b53.x(rd6Var.A, this.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.B) + (this.A.hashCode() * 31);
    }

    @Override // defpackage.j77
    public final oo l(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        long j2 = this.B;
        if (j < j2) {
            return ooVar3;
        }
        return this.A.l(j - j2, ooVar, ooVar2, ooVar3);
    }

    @Override // defpackage.j77
    public final oo p(long j, oo ooVar, oo ooVar2, oo ooVar3) {
        long j2 = this.B;
        if (j < j2) {
            return ooVar;
        }
        return this.A.p(j - j2, ooVar, ooVar2, ooVar3);
    }
}
