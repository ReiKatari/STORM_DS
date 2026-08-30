package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Float f3566a;

    /* renamed from: b  reason: collision with root package name */
    public v f3567b;

    public f0(Float f8, v vVar) {
        this.f3566a = f8;
        this.f3567b = vVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            f0 f0Var = (f0) obj;
            if (f0Var.f3566a.equals(this.f3566a) && nc.k.a(f0Var.f3567b, this.f3567b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f3567b.hashCode() + w.d.c(0, this.f3566a.hashCode() * 31, 31);
    }
}
