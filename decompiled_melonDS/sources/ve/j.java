package ve;

import oe.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f13811a;

    /* renamed from: b  reason: collision with root package name */
    public final c f13812b;

    /* renamed from: c  reason: collision with root package name */
    public final float f13813c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13814d;

    public j(b0 b0Var, c cVar, float f8, boolean z10) {
        cVar.getClass();
        this.f13811a = b0Var;
        this.f13812b = cVar;
        this.f13813c = f8;
        this.f13814d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (nc.k.a(this.f13811a, jVar.f13811a) && this.f13812b == jVar.f13812b && Float.compare(this.f13813c, jVar.f13813c) == 0 && this.f13814d == jVar.f13814d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f13812b.hashCode();
        return Boolean.hashCode(this.f13814d) + w.d.b(this.f13813c, (hashCode + (this.f13811a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PositionedLayoutComponent(rect=" + this.f13811a + ", component=" + this.f13812b + ", alpha=" + this.f13813c + ", onTop=" + this.f13814d + ")";
    }
}
