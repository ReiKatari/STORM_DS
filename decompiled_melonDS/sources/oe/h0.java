package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: c  reason: collision with root package name */
    public static final h0 f10933c = new h0(null, ve.a.STRETCH);

    /* renamed from: a  reason: collision with root package name */
    public final a f10934a;

    /* renamed from: b  reason: collision with root package name */
    public final ve.a f10935b;

    public h0(a aVar, ve.a aVar2) {
        aVar2.getClass();
        this.f10934a = aVar;
        this.f10935b = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        if (nc.k.a(this.f10934a, h0Var.f10934a) && this.f10935b == h0Var.f10935b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        a aVar = this.f10934a;
        if (aVar == null) {
            hashCode = 0;
        } else {
            hashCode = aVar.hashCode();
        }
        return this.f10935b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "RuntimeBackground(background=" + this.f10934a + ", mode=" + this.f10935b + ")";
    }
}
