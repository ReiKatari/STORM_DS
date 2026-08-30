package mh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends h {

    /* renamed from: a  reason: collision with root package name */
    public final long f9677a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9678b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f9679c;

    /* renamed from: d  reason: collision with root package name */
    public final String f9680d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9681e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9682f;

    /* renamed from: g  reason: collision with root package name */
    public final a4.n f9683g;

    public d(long j2, String str, URL url, String str2, int i2, int i10, a4.n nVar) {
        str.getClass();
        this.f9677a = j2;
        this.f9678b = str;
        this.f9679c = url;
        this.f9680d = str2;
        this.f9681e = i2;
        this.f9682f = i10;
        this.f9683g = nVar;
    }

    @Override // mh.h
    public final a4.n a() {
        return this.f9683g;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f9677a != dVar.f9677a || !nc.k.a(this.f9678b, dVar.f9678b) || !this.f9679c.equals(dVar.f9679c) || !this.f9680d.equals(dVar.f9680d) || this.f9681e != dVar.f9681e || this.f9682f != dVar.f9682f || !this.f9683g.equals(dVar.f9683g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9683g.hashCode() + w.d.c(this.f9682f, w.d.c(this.f9681e, w.d.d((this.f9679c.hashCode() + w.d.d(Long.hashCode(this.f9677a) * 31, 31, this.f9678b)) * 31, 31, this.f9680d), 31), 31);
    }

    public final String toString() {
        return "LeaderboardEntrySubmitted(leaderboardId=" + this.f9677a + ", title=" + this.f9678b + ", gameIcon=" + this.f9679c + ", formattedScore=" + this.f9680d + ", rank=" + this.f9681e + ", numberOfEntries=" + this.f9682f + ", state=" + this.f9683g + ")";
    }
}
