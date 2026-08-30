package oi;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final long f11039a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11040b;

    /* renamed from: c  reason: collision with root package name */
    public final long f11041c;

    /* renamed from: d  reason: collision with root package name */
    public final String f11042d;

    /* renamed from: e  reason: collision with root package name */
    public final String f11043e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f11044f;

    /* renamed from: g  reason: collision with root package name */
    public final String f11045g;

    /* renamed from: h  reason: collision with root package name */
    public final String f11046h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f11047i;

    public h(long j2, long j10, long j11, String str, String str2, boolean z10, String str3, String str4, boolean z11) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f11039a = j2;
        this.f11040b = j10;
        this.f11041c = j11;
        this.f11042d = str;
        this.f11043e = str2;
        this.f11044f = z10;
        this.f11045g = str3;
        this.f11046h = str4;
        this.f11047i = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (this.f11039a == hVar.f11039a && g.a(this.f11040b, hVar.f11040b) && this.f11041c == hVar.f11041c && k.a(this.f11042d, hVar.f11042d) && k.a(this.f11043e, hVar.f11043e) && this.f11044f == hVar.f11044f && k.a(this.f11045g, hVar.f11045g) && k.a(this.f11046h, hVar.f11046h) && this.f11047i == hVar.f11047i) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11047i) + w.d.d(w.d.d(w.d.e(w.d.d(w.d.d(w.d.f(this.f11041c, w.d.f(this.f11040b, Long.hashCode(this.f11039a) * 31, 31), 31), 31, this.f11042d), 31, this.f11043e), this.f11044f, 31), 31, this.f11045g), 31, this.f11046h);
    }

    public final String toString() {
        String b10 = g.b(this.f11040b);
        String j02 = d0.d.j0(this.f11041c);
        StringBuilder sb2 = new StringBuilder("RALeaderboard(id=");
        sb2.append(this.f11039a);
        sb2.append(", gameId=");
        sb2.append(b10);
        w.d.B(sb2, ", setId=", j02, ", mem=", this.f11042d);
        sb2.append(", format=");
        sb2.append(this.f11043e);
        sb2.append(", lowerIsBetter=");
        sb2.append(this.f11044f);
        w.d.B(sb2, ", title=", this.f11045g, ", description=", this.f11046h);
        sb2.append(", hidden=");
        sb2.append(this.f11047i);
        sb2.append(")");
        return sb2.toString();
    }
}
