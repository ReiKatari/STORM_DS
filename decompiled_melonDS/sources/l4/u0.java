package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f8902a;

    public u0(String str) {
        this.f8902a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u0) {
                if (!this.f8902a.equals(((u0) obj).f8902a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f8902a.hashCode();
    }

    public final String toString() {
        return w.d.r(new StringBuilder("VerbatimTtsAnnotation(verbatim="), this.f8902a, ')');
    }
}
