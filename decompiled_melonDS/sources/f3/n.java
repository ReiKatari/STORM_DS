package f3;

import a4.j1;
import a4.r1;
import b3.o;
import i3.n0;
import i3.s;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f4837a;

    /* renamed from: b  reason: collision with root package name */
    public final n0 f4838b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4839c;

    /* renamed from: d  reason: collision with root package name */
    public final long f4840d;

    /* renamed from: e  reason: collision with root package name */
    public final long f4841e;

    public n(float f8, n0 n0Var, boolean z10, long j2, long j10) {
        this.f4837a = f8;
        this.f4838b = n0Var;
        this.f4839c = z10;
        this.f4840d = j2;
        this.f4841e = j10;
    }

    @Override // a4.j1
    public final o e() {
        return new i3.n(new a4.a(13, this));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (!x4.f.b(this.f4837a, nVar.f4837a) || !nc.k.a(this.f4838b, nVar.f4838b) || this.f4839c != nVar.f4839c || !s.c(this.f4840d, nVar.f4840d) || !s.c(this.f4841e, nVar.f4841e)) {
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
        r1 r1Var;
        i3.n nVar = (i3.n) oVar;
        a4.a aVar = new a4.a(13, this);
        nVar.f6663i0 = aVar;
        if (nVar.A.f1777h0 && (r1Var = a4.l.r(nVar, 2).f318l0) != null) {
            r1Var.v1(aVar, true);
        }
    }

    public final int hashCode() {
        int e6 = w.d.e((this.f4838b.hashCode() + (Float.hashCode(this.f4837a) * 31)) * 31, this.f4839c, 31);
        int i2 = s.f6688i;
        return Long.hashCode(this.f4841e) + w.d.f(this.f4840d, e6, 31);
    }

    public final String toString() {
        return "ShadowGraphicsLayerElement(elevation=" + ((Object) x4.f.c(this.f4837a)) + ", shape=" + this.f4838b + ", clip=" + this.f4839c + ", ambientColor=" + ((Object) s.i(this.f4840d)) + ", spotColor=" + ((Object) s.i(this.f4841e)) + ')';
    }
}
