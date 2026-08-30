package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 implements y1 {
    public final y1 A;
    public final long B;

    public c1(y1 y1Var, long j2) {
        this.A = y1Var;
        this.B = j2;
    }

    @Override // d1.y1
    public final p F(long j2, p pVar, p pVar2, p pVar3) {
        long j10 = this.B;
        if (j2 < j10) {
            return pVar;
        }
        return this.A.F(j2 - j10, pVar, pVar2, pVar3);
    }

    @Override // d1.y1
    public final p L(long j2, p pVar, p pVar2, p pVar3) {
        long j10 = this.B;
        if (j2 < j10) {
            return pVar3;
        }
        return this.A.L(j2 - j10, pVar, pVar2, pVar3);
    }

    @Override // d1.y1
    public final boolean a() {
        return this.A.a();
    }

    @Override // d1.y1
    public final long c(p pVar, p pVar2, p pVar3) {
        return this.A.c(pVar, pVar2, pVar3) + this.B;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (c1Var.B != this.B || !nc.k.a(c1Var.A, this.A)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.B) + (this.A.hashCode() * 31);
    }
}
