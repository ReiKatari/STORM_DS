package te;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends g {

    /* renamed from: a  reason: collision with root package name */
    public final p7.a f13182a;

    public e(p7.a aVar) {
        this.f13182a = aVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e) || !this.f13182a.equals(((e) obj).f13182a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13182a.hashCode();
    }

    public final String toString() {
        return "DSiWareTitleValidationFailed(reason=" + this.f13182a + ")";
    }
}
