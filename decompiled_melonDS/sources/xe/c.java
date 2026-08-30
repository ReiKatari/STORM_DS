package xe;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final long f14560a;

    /* renamed from: b  reason: collision with root package name */
    public final long f14561b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14562c;

    /* renamed from: d  reason: collision with root package name */
    public final oi.c f14563d;

    /* renamed from: e  reason: collision with root package name */
    public final URL f14564e;

    public c(long j2, long j10, String str, oi.c cVar, URL url) {
        this.f14560a = j2;
        this.f14561b = j10;
        this.f14562c = str;
        this.f14563d = cVar;
        this.f14564e = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (this.f14560a != cVar.f14560a || !oi.g.a(this.f14561b, cVar.f14561b) || !nc.k.a(this.f14562c, cVar.f14562c) || this.f14563d != cVar.f14563d || !this.f14564e.equals(cVar.f14564e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int f8 = w.d.f(this.f14561b, Long.hashCode(this.f14560a) * 31, 31);
        String str = this.f14562c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.f14563d.hashCode();
        return this.f14564e.hashCode() + ((hashCode2 + ((f8 + hashCode) * 31)) * 31);
    }

    public final String toString() {
        String b10 = oi.g.b(this.f14561b);
        return "RAAchievementSetSummary(setId=" + this.f14560a + ", gameId=" + b10 + ", title=" + this.f14562c + ", type=" + this.f14563d + ", iconUrl=" + this.f14564e + ")";
    }
}
