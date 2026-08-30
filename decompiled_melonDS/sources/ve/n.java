package ve;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final m f13821a;

    /* renamed from: b  reason: collision with root package name */
    public final m f13822b;

    public n(m mVar, m mVar2) {
        mVar.getClass();
        mVar2.getClass();
        this.f13821a = mVar;
        this.f13822b = mVar2;
    }

    public static n a(n nVar, m mVar, m mVar2, int i2) {
        if ((i2 & 1) != 0) {
            mVar = nVar.f13821a;
        }
        if ((i2 & 2) != 0) {
            mVar2 = nVar.f13822b;
        }
        nVar.getClass();
        mVar.getClass();
        mVar2.getClass();
        return new n(mVar, mVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nc.k.a(this.f13821a, nVar.f13821a) && nc.k.a(this.f13822b, nVar.f13822b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f13822b.hashCode() + (this.f13821a.hashCode() * 31);
    }

    public final String toString() {
        return "UILayout(mainScreenLayout=" + this.f13821a + ", secondaryScreenLayout=" + this.f13822b + ")";
    }
}
