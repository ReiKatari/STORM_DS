package v0;

import a0.j;
import j0.h2;
import j0.q;
import j0.r;
import j0.s;
import j0.t;
import j0.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements u {
    public long A;
    public final Object B;
    public final Object L;

    public h() {
        w3.b bVar = w3.b.Lsq2;
        this.B = new w3.d(false, bVar);
        this.L = new w3.d(false, bVar);
    }

    @Override // j0.u
    public h2 a() {
        return (h2) this.L;
    }

    @Override // j0.u
    public t b() {
        u uVar = (u) this.B;
        if (uVar != null) {
            return uVar.b();
        }
        return t.UNKNOWN;
    }

    @Override // j0.u
    public long c() {
        u uVar = (u) this.B;
        if (uVar != null) {
            return uVar.c();
        }
        long j2 = this.A;
        if (j2 != -1) {
            return j2;
        }
        j.p("No timestamp is available.");
        return 0L;
    }

    public void d(long j2, long j10) {
        ((w3.d) this.B).a(j2, Float.intBitsToFloat((int) (j10 >> 32)));
        ((w3.d) this.L).a(j2, Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    @Override // j0.u
    public q e() {
        u uVar = (u) this.B;
        if (uVar != null) {
            return uVar.e();
        }
        return q.UNKNOWN;
    }

    @Override // j0.u
    public s h() {
        u uVar = (u) this.B;
        if (uVar != null) {
            return uVar.h();
        }
        return s.UNKNOWN;
    }

    @Override // j0.u
    public r n() {
        u uVar = (u) this.B;
        if (uVar != null) {
            return uVar.n();
        }
        return r.UNKNOWN;
    }

    public h(u uVar, h2 h2Var, long j2) {
        this.B = uVar;
        this.L = h2Var;
        this.A = j2;
    }
}
