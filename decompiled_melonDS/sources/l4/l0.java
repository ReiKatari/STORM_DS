package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l0 implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f8847a;

    public /* synthetic */ l0(String str) {
        this.f8847a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            if (!this.f8847a.equals(((l0) obj).f8847a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8847a.hashCode();
    }

    public final String toString() {
        return kc.a.c(')', "StringAnnotation(value=", this.f8847a);
    }
}
