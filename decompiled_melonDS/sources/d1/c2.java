package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c2 implements y1 {
    public final a2 A;
    public final o0 B;
    public final long L;
    public final long R;

    public c2(a2 a2Var, o0 o0Var, long j2) {
        this.A = a2Var;
        this.B = o0Var;
        this.L = (a2Var.J() + a2Var.A()) * 1000000;
        this.R = j2 * 1000000;
    }

    @Override // d1.y1
    public final p F(long j2, p pVar, p pVar2, p pVar3) {
        return this.A.F(b(j2), pVar, pVar2, d(j2, pVar, pVar3, pVar2));
    }

    @Override // d1.y1
    public final p L(long j2, p pVar, p pVar2, p pVar3) {
        return this.A.L(b(j2), pVar, pVar2, d(j2, pVar, pVar3, pVar2));
    }

    @Override // d1.y1
    public final boolean a() {
        return true;
    }

    public final long b(long j2) {
        long j10 = this.R;
        if (j2 + j10 <= 0) {
            return 0L;
        }
        long j11 = j2 + j10;
        long j12 = this.L;
        long j13 = j11 / j12;
        if (this.B != o0.Restart && j13 % 2 != 0) {
            return ((j13 + 1) * j12) - j11;
        }
        return j11 - (j13 * j12);
    }

    @Override // d1.y1
    public final long c(p pVar, p pVar2, p pVar3) {
        return Long.MAX_VALUE;
    }

    public final p d(long j2, p pVar, p pVar2, p pVar3) {
        long j10 = this.R;
        long j11 = this.L;
        if (j2 + j10 > j11) {
            return this.A.L(j11 - j10, pVar, pVar3, pVar2);
        }
        return pVar2;
    }
}
