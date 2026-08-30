package t8;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f13138a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f13139b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f13140c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f13141d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13142e;

    public e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        this.f13138a = z10;
        this.f13139b = z11;
        this.f13140c = z12;
        this.f13141d = z13;
        this.f13142e = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (this.f13138a == eVar.f13138a && this.f13139b == eVar.f13139b && this.f13140c == eVar.f13140c && this.f13141d == eVar.f13141d && this.f13142e == eVar.f13142e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13142e) + w.d.e(w.d.e(w.d.e(Boolean.hashCode(this.f13138a) * 31, this.f13139b, 31), this.f13140c, 31), this.f13141d, 31);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f13138a + ", isValidated=" + this.f13139b + ", isMetered=" + this.f13140c + ", isNotRoaming=" + this.f13141d + ", isBlocked=" + this.f13142e + ')';
    }
}
