package ve;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    public static final b f13792e = new b(0, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f13793a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13794b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13795c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13796d;

    public b(int i2, int i10, int i11, int i12) {
        this.f13793a = i2;
        this.f13794b = i10;
        this.f13795c = i11;
        this.f13796d = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f13793a == bVar.f13793a && this.f13794b == bVar.f13794b && this.f13795c == bVar.f13795c && this.f13796d == bVar.f13796d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13796d) + w.d.c(this.f13795c, w.d.c(this.f13794b, Integer.hashCode(this.f13793a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder j2 = kc.a.j("Insets(left=", this.f13793a, ", top=", this.f13794b, ", right=");
        j2.append(this.f13795c);
        j2.append(", bottom=");
        j2.append(this.f13796d);
        j2.append(")");
        return j2.toString();
    }
}
