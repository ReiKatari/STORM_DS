package a2;

import a4.j1;
import f2.s0;
import f2.u0;
import f2.v0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final a0.g f134a;

    /* renamed from: b  reason: collision with root package name */
    public final u0 f135b;

    /* renamed from: c  reason: collision with root package name */
    public final v0 f136c;

    /* renamed from: d  reason: collision with root package name */
    public final s0 f137d;

    public m(a0.g gVar, u0 u0Var, v0 v0Var, s0 s0Var) {
        this.f134a = gVar;
        this.f135b = u0Var;
        this.f136c = v0Var;
        this.f137d = s0Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new p(this.f134a, this.f135b, this.f136c, this.f137d);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m) {
                m mVar = (m) obj;
                if (this.f134a != mVar.f134a || this.f135b != mVar.f135b || this.f136c != mVar.f136c || this.f137d != mVar.f137d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        q qVar;
        p pVar = (p) oVar;
        pVar.f140k0.B = null;
        a0.g gVar = this.f134a;
        pVar.f140k0 = gVar;
        gVar.B = pVar;
        if (pVar.f1777h0) {
            qVar = q.Attached;
        } else {
            qVar = q.Detached;
        }
        gVar.L = qVar;
        pVar.f141l0 = this.f135b;
        pVar.f142m0 = this.f136c;
        pVar.f143n0 = this.f137d;
    }

    public final int hashCode() {
        int hashCode = this.f135b.hashCode();
        int hashCode2 = this.f136c.hashCode();
        return this.f137d.hashCode() + ((hashCode2 + ((hashCode + (this.f134a.hashCode() * 31)) * 31)) * 31);
    }
}
