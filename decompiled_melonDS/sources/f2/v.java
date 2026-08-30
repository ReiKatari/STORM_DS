package f2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final u f4796a;

    /* renamed from: b  reason: collision with root package name */
    public final u f4797b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f4798c;

    public v(u uVar, u uVar2, boolean z10) {
        this.f4796a = uVar;
        this.f4797b = uVar2;
        this.f4798c = z10;
    }

    public static v a(v vVar, u uVar, u uVar2, boolean z10, int i2) {
        if ((i2 & 1) != 0) {
            uVar = vVar.f4796a;
        }
        if ((i2 & 2) != 0) {
            uVar2 = vVar.f4797b;
        }
        vVar.getClass();
        return new v(uVar, uVar2, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (nc.k.a(this.f4796a, vVar.f4796a) && nc.k.a(this.f4797b, vVar.f4797b) && this.f4798c == vVar.f4798c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4797b.hashCode();
        return Boolean.hashCode(this.f4798c) + ((hashCode + (this.f4796a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Selection(start=" + this.f4796a + ", end=" + this.f4797b + ", handlesCrossed=" + this.f4798c + ')';
    }
}
