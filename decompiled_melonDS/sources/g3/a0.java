package g3;

import a4.j1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final z f5499a;

    public a0(z zVar) {
        this.f5499a = zVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g3.c0, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f5501i0 = this.f5499a;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a0) && nc.k.a(this.f5499a, ((a0) obj).f5499a)) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        c0 c0Var = (c0) oVar;
        c0Var.f5501i0.f5554a.j(c0Var);
        z zVar = this.f5499a;
        c0Var.f5501i0 = zVar;
        zVar.f5554a.b(c0Var);
    }

    public final int hashCode() {
        return this.f5499a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f5499a + ')';
    }
}
