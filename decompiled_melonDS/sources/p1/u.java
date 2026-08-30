package p1;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends b3.o implements a4.p {

    /* renamed from: i0  reason: collision with root package name */
    public w f11265i0;

    @Override // b3.o
    public final void G0() {
        this.f11265i0.getClass();
    }

    @Override // b3.o
    public final void H0() {
        w wVar = this.f11265i0;
        wVar.d();
        wVar.f11273b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u) && nc.k.a(this.f11265i0, ((u) obj).f11265i0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11265i0.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f11265i0 + ')';
    }

    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        ArrayList arrayList = this.f11265i0.f11279h;
        if (arrayList.size() <= 0) {
            r0Var.a();
        } else {
            w.d.A(arrayList.get(0));
            throw null;
        }
    }
}
