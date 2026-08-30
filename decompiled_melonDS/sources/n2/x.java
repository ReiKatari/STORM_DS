package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x implements a3.d {
    public final u A;

    public x(u uVar) {
        this.A = uVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            if (this.A.equals(((x) obj).A)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.A.hashCode() * 31;
    }
}
