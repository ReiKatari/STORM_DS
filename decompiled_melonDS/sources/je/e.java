package je;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final String f7842a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7843b;

    public e(long j2, String str) {
        str.getClass();
        this.f7842a = str;
        this.f7843b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (k.a(this.f7842a, eVar.f7842a) && this.f7843b == eVar.f7843b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7843b) + (this.f7842a.hashCode() * 31);
    }

    public final String toString() {
        return "RAGameHashEntity(gameHash=" + this.f7842a + ", gameId=" + this.f7843b + ")";
    }
}
