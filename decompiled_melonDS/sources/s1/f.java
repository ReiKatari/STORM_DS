package s1;

import a4.j1;
import a4.l;
import b3.o;
import f1.a1;
import j1.i;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class f extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final k4.a f12811a;

    /* renamed from: b  reason: collision with root package name */
    public final i f12812b;

    /* renamed from: c  reason: collision with root package name */
    public final a1 f12813c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f12814d;

    /* renamed from: e  reason: collision with root package name */
    public final i4.i f12815e;

    /* renamed from: f  reason: collision with root package name */
    public final mc.a f12816f;

    public f(k4.a aVar, i iVar, a1 a1Var, boolean z10, i4.i iVar2, mc.a aVar2) {
        this.f12811a = aVar;
        this.f12812b = iVar;
        this.f12813c = a1Var;
        this.f12814d = z10;
        this.f12815e = iVar2;
        this.f12816f = aVar2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s1.g, f1.g, b3.o] */
    @Override // a4.j1
    public final o e() {
        ?? gVar = new f1.g(this.f12812b, this.f12813c, false, this.f12814d, null, this.f12815e, this.f12816f);
        gVar.H0 = this.f12811a;
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f.class == obj.getClass()) {
                f fVar = (f) obj;
                if (this.f12811a != fVar.f12811a || !k.a(this.f12812b, fVar.f12812b) || !k.a(this.f12813c, fVar.f12813c) || this.f12814d != fVar.f12814d || !this.f12815e.equals(fVar.f12815e) || this.f12816f != fVar.f12816f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(o oVar) {
        g gVar = (g) oVar;
        k4.a aVar = gVar.H0;
        k4.a aVar2 = this.f12811a;
        if (aVar != aVar2) {
            gVar.H0 = aVar2;
            l.l(gVar);
        }
        gVar.c1(this.f12812b, this.f12813c, false, this.f12814d, null, this.f12815e, this.f12816f);
    }

    public final int hashCode() {
        int i2;
        int i10;
        int hashCode = this.f12811a.hashCode() * 31;
        i iVar = this.f12812b;
        if (iVar != null) {
            i2 = iVar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = (hashCode + i2) * 31;
        a1 a1Var = this.f12813c;
        if (a1Var != null) {
            i10 = a1Var.hashCode();
        } else {
            i10 = 0;
        }
        return this.f12816f.hashCode() + w.d.c(this.f12815e.f6722a, w.d.e(w.d.e((i11 + i10) * 31, false, 31), this.f12814d, 31), 31);
    }
}
