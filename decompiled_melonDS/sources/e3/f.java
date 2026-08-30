package e3;

import a4.l;
import a4.q0;
import a4.q2;
import a4.z;
import b3.o;
import d2.t;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends o implements q2, z {

    /* renamed from: i0  reason: collision with root package name */
    public f f4255i0;

    /* renamed from: j0  reason: collision with root package name */
    public f f4256j0;

    /* renamed from: k0  reason: collision with root package name */
    public long f4257k0;

    @Override // b3.o
    public final void H0() {
        this.f4256j0 = null;
        this.f4255i0 = null;
    }

    public final boolean O0() {
        f fVar = this.f4255i0;
        if (fVar == null) {
            f fVar2 = this.f4256j0;
            if (fVar2 != null) {
                return fVar2.O0();
            }
            return false;
        }
        return fVar.O0();
    }

    public final void P0() {
        f fVar = this.f4256j0;
        if (fVar == null) {
            f fVar2 = this.f4255i0;
            if (fVar2 != null) {
                fVar2.P0();
                return;
            }
            return;
        }
        fVar.P0();
    }

    public final void Q0() {
        f fVar = this.f4256j0;
        if (fVar != null) {
            fVar.Q0();
        }
        f fVar2 = this.f4255i0;
        if (fVar2 != null) {
            fVar2.Q0();
        }
        this.f4255i0 = null;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [nc.t, java.lang.Object] */
    public final void R0(t tVar) {
        q2 q2Var;
        f fVar;
        f fVar2 = this.f4255i0;
        if (fVar2 != null && l0.f.c(fVar2, pc.a.z(tVar))) {
            fVar = fVar2;
        } else {
            if (!this.A.f1777h0) {
                q2Var = null;
            } else {
                ?? obj = new Object();
                l.z(this, new q0(obj, this, tVar, 6));
                q2Var = (q2) obj.A;
            }
            fVar = (f) q2Var;
        }
        if (fVar != null && fVar2 == null) {
            fVar.P0();
            fVar.R0(tVar);
            f fVar3 = this.f4256j0;
            if (fVar3 != null) {
                fVar3.Q0();
            }
        } else if (fVar == null && fVar2 != null) {
            f fVar4 = this.f4256j0;
            if (fVar4 != null) {
                fVar4.P0();
                fVar4.R0(tVar);
            }
            fVar2.Q0();
        } else if (!k.a(fVar, fVar2)) {
            if (fVar != null) {
                fVar.P0();
                fVar.R0(tVar);
            }
            if (fVar2 != null) {
                fVar2.Q0();
            }
        } else if (fVar != null) {
            fVar.R0(tVar);
        } else {
            f fVar5 = this.f4256j0;
            if (fVar5 != null) {
                fVar5.R0(tVar);
            }
        }
        this.f4255i0 = fVar;
    }

    public final void S0() {
        f fVar = this.f4256j0;
        if (fVar == null) {
            f fVar2 = this.f4255i0;
            if (fVar2 != null) {
                fVar2.S0();
                return;
            }
            return;
        }
        fVar.S0();
    }

    @Override // a4.q2
    public final Object k() {
        return d.f4254a;
    }

    @Override // a4.z
    public final void o(long j2) {
        this.f4257k0 = j2;
    }
}
