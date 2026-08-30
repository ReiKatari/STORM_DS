package hh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final long f6572a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6573b;

    /* renamed from: c  reason: collision with root package name */
    public final URL f6574c;

    /* renamed from: d  reason: collision with root package name */
    public final String f6575d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6576e;

    /* renamed from: f  reason: collision with root package name */
    public final int f6577f;

    public t0(long j2, String str, URL url, String str2, int i2, int i10) {
        str.getClass();
        this.f6572a = j2;
        this.f6573b = str;
        this.f6574c = url;
        this.f6575d = str2;
        this.f6576e = i2;
        this.f6577f = i10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof t0) {
                t0 t0Var = (t0) obj;
                if (this.f6572a != t0Var.f6572a || !nc.k.a(this.f6573b, t0Var.f6573b) || !this.f6574c.equals(t0Var.f6574c) || !this.f6575d.equals(t0Var.f6575d) || this.f6576e != t0Var.f6576e || this.f6577f != t0Var.f6577f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6577f) + w.d.c(this.f6576e, w.d.d((this.f6574c.hashCode() + w.d.d(Long.hashCode(this.f6572a) * 31, 31, this.f6573b)) * 31, 31, this.f6575d), 31);
    }

    public final String toString() {
        return "LeaderboardEntrySubmitted(leaderboardId=" + this.f6572a + ", title=" + this.f6573b + ", gameIcon=" + this.f6574c + ", formattedScore=" + this.f6575d + ", rank=" + this.f6576e + ", numberOfEntries=" + this.f6577f + ")";
    }
}
