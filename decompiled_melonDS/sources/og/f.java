package og;

import o3.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f10997a;

    /* renamed from: b  reason: collision with root package name */
    public final String f10998b;

    /* renamed from: c  reason: collision with root package name */
    public final n3.b f10999c;

    public f(int i2, String str, j0 j0Var) {
        str.getClass();
        j0Var.getClass();
        this.f10997a = i2;
        this.f10998b = str;
        this.f10999c = j0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (this.f10997a != fVar.f10997a || !nc.k.a(this.f10998b, fVar.f10998b) || !nc.k.a(this.f10999c, fVar.f10999c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10999c.hashCode() + w.d.d(Integer.hashCode(this.f10997a) * 31, 31, this.f10998b);
    }

    public final String toString() {
        return "FabActionItem(id=" + this.f10997a + ", title=" + this.f10998b + ", icon=" + this.f10999c + ")";
    }
}
