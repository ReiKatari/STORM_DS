package e2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final String f4235a;

    /* renamed from: b  reason: collision with root package name */
    public String f4236b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4237c = false;

    /* renamed from: d  reason: collision with root package name */
    public e f4238d = null;

    public l(String str, String str2) {
        this.f4235a = str;
        this.f4236b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (nc.k.a(this.f4235a, lVar.f4235a) && nc.k.a(this.f4236b, lVar.f4236b) && this.f4237c == lVar.f4237c && nc.k.a(this.f4238d, lVar.f4238d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int e6 = w.d.e(w.d.d(this.f4235a.hashCode() * 31, 31, this.f4236b), this.f4237c, 31);
        e eVar = this.f4238d;
        if (eVar == null) {
            hashCode = 0;
        } else {
            hashCode = eVar.hashCode();
        }
        return e6 + hashCode;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.f4238d + ", isShowingSubstitution=" + this.f4237c + ')';
    }
}
