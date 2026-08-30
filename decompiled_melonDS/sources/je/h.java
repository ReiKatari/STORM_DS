package je;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f7850a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7851b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7852c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7853d;

    /* renamed from: e  reason: collision with root package name */
    public final String f7854e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7855f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7856g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7857h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7858i;

    public h(long j2, long j10, long j11, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f7850a = j2;
        this.f7851b = j10;
        this.f7852c = j11;
        this.f7853d = str;
        this.f7854e = str2;
        this.f7855f = z10;
        this.f7856g = str3;
        this.f7857h = str4;
        this.f7858i = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f7850a == hVar.f7850a && this.f7851b == hVar.f7851b && this.f7852c == hVar.f7852c && k.a(this.f7853d, hVar.f7853d) && k.a(this.f7854e, hVar.f7854e) && this.f7855f == hVar.f7855f && k.a(this.f7856g, hVar.f7856g) && k.a(this.f7857h, hVar.f7857h) && this.f7858i == hVar.f7858i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f7858i) + w.d.d(w.d.d(w.d.e(w.d.d(w.d.d(w.d.f(this.f7852c, w.d.f(this.f7851b, Long.hashCode(this.f7850a) * 31, 31), 31), 31, this.f7853d), 31, this.f7854e), this.f7855f, 31), 31, this.f7856g), 31, this.f7857h);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RALeaderboardEntity(id=");
        sb2.append(this.f7850a);
        sb2.append(", gameId=");
        sb2.append(this.f7851b);
        sb2.append(", setId=");
        sb2.append(this.f7852c);
        sb2.append(", mem=");
        w.d.B(sb2, this.f7853d, ", format=", this.f7854e, ", lowerIsBetter=");
        sb2.append(this.f7855f);
        sb2.append(", title=");
        sb2.append(this.f7856g);
        sb2.append(", description=");
        sb2.append(this.f7857h);
        sb2.append(", hidden=");
        sb2.append(this.f7858i);
        sb2.append(")");
        return sb2.toString();
    }
}
