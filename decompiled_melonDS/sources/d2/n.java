package d2;

import a4.j1;
import f2.b1;
import u1.p0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final c f3748a;

    /* renamed from: b  reason: collision with root package name */
    public final p0 f3749b;

    /* renamed from: c  reason: collision with root package name */
    public final b1 f3750c;

    public n(c cVar, p0 p0Var, b1 b1Var) {
        this.f3748a = cVar;
        this.f3749b = p0Var;
        this.f3750c = b1Var;
    }

    @Override // a4.j1
    public final b3.o e() {
        return new o(this.f3748a, this.f3749b, this.f3750c);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof n) {
                n nVar = (n) obj;
                if (!nc.k.a(this.f3748a, nVar.f3748a) || !this.f3749b.equals(nVar.f3749b) || !this.f3750c.equals(nVar.f3750c)) {
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
        o oVar2 = (o) oVar;
        if (oVar2.f1777h0) {
            oVar2.f3751i0.h();
            oVar2.f3751i0.k(oVar2);
        }
        c cVar = this.f3748a;
        oVar2.f3751i0 = cVar;
        if (oVar2.f1777h0) {
            if (cVar.f3719a != null) {
                k1.b.c("Expected textInputModifierNode to be null");
            }
            cVar.f3719a = oVar2;
        }
        oVar2.f3752j0 = this.f3749b;
        oVar2.f3753k0 = this.f3750c;
    }

    public final int hashCode() {
        int hashCode = this.f3749b.hashCode();
        return this.f3750c.hashCode() + ((hashCode + (this.f3748a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f3748a + ", legacyTextFieldState=" + this.f3749b + ", textFieldSelectionManager=" + this.f3750c + ')';
    }
}
