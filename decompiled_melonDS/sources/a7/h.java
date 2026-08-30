package a7;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final k0 f571a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f572b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f573c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f574d;

    public h(k0 k0Var, boolean z10, boolean z11) {
        if (!k0Var.f594a && z10) {
            a0.j.e(k0Var.b().concat(" does not allow nullable values"));
            throw null;
        }
        this.f571a = k0Var;
        this.f572b = z10;
        this.f573c = z11;
        this.f574d = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && h.class == obj.getClass()) {
            h hVar = (h) obj;
            if (this.f572b == hVar.f572b && this.f573c == hVar.f573c && this.f571a.equals(hVar.f571a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f571a.hashCode() * 31) + (this.f572b ? 1 : 0)) * 31) + (this.f573c ? 1 : 0)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(nc.u.a(h.class).c());
        sb2.append(" Type: " + this.f571a);
        sb2.append(" Nullable: " + this.f572b);
        if (this.f573c) {
            sb2.append(" DefaultValue: null");
        }
        return sb2.toString();
    }
}
