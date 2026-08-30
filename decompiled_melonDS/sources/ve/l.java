package ve;

import oe.b0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final bf.a f13815a;

    /* renamed from: b  reason: collision with root package name */
    public final k f13816b;

    /* renamed from: c  reason: collision with root package name */
    public final b0 f13817c;

    public l(bf.a aVar, k kVar, b0 b0Var) {
        aVar.getClass();
        kVar.getClass();
        this.f13815a = aVar;
        this.f13816b = kVar;
        this.f13817c = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l) {
                l lVar = (l) obj;
                if (this.f13815a != lVar.f13815a || this.f13816b != lVar.f13816b || !this.f13817c.equals(lVar.f13817c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f13816b.hashCode();
        return this.f13817c.hashCode() + ((hashCode + (this.f13815a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ScreenFold(orientation=" + this.f13815a + ", type=" + this.f13816b + ", foldBounds=" + this.f13817c + ")";
    }
}
