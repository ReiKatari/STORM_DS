package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp6  reason: default package */
/* loaded from: classes.dex */
public final class hp6 implements il7 {
    public final il7 A;
    public final long B;

    public hp6(il7 il7Var, long j) {
        this.A = il7Var;
        this.B = j;
    }

    @Override // defpackage.il7
    public final boolean a() {
        return this.A.a();
    }

    @Override // defpackage.il7
    public final long b(ap apVar, ap apVar2, ap apVar3) {
        return this.A.b(apVar, apVar2, apVar3) + this.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hp6)) {
            return false;
        }
        hp6 hp6Var = (hp6) obj;
        if (hp6Var.B != this.B || !nb3.k(hp6Var.A, this.A)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.il7
    public final ap h(long j, ap apVar, ap apVar2, ap apVar3) {
        long j2 = this.B;
        if (j < j2) {
            return apVar3;
        }
        return this.A.h(j - j2, apVar, apVar2, apVar3);
    }

    public final int hashCode() {
        return Long.hashCode(this.B) + (this.A.hashCode() * 31);
    }

    @Override // defpackage.il7
    public final ap q(long j, ap apVar, ap apVar2, ap apVar3) {
        long j2 = this.B;
        if (j < j2) {
            return apVar;
        }
        return this.A.q(j - j2, apVar, apVar2, apVar3);
    }
}
