package je;

import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final long f7818a;

    /* renamed from: b  reason: collision with root package name */
    public final long f7819b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7820c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7821d;

    /* renamed from: e  reason: collision with root package name */
    public final int f7822e;

    /* renamed from: f  reason: collision with root package name */
    public final String f7823f;

    /* renamed from: g  reason: collision with root package name */
    public final String f7824g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7825h;

    /* renamed from: i  reason: collision with root package name */
    public final int f7826i;

    /* renamed from: j  reason: collision with root package name */
    public final String f7827j;

    /* renamed from: k  reason: collision with root package name */
    public final String f7828k;

    /* renamed from: l  reason: collision with root package name */
    public final String f7829l;
    public final int m;

    public a(long j2, long j10, long j11, int i2, int i10, String str, String str2, int i11, int i12, String str3, String str4, String str5, int i13) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.f7818a = j2;
        this.f7819b = j10;
        this.f7820c = j11;
        this.f7821d = i2;
        this.f7822e = i10;
        this.f7823f = str;
        this.f7824g = str2;
        this.f7825h = i11;
        this.f7826i = i12;
        this.f7827j = str3;
        this.f7828k = str4;
        this.f7829l = str5;
        this.m = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7818a == aVar.f7818a && this.f7819b == aVar.f7819b && this.f7820c == aVar.f7820c && this.f7821d == aVar.f7821d && this.f7822e == aVar.f7822e && k.a(this.f7823f, aVar.f7823f) && k.a(this.f7824g, aVar.f7824g) && this.f7825h == aVar.f7825h && this.f7826i == aVar.f7826i && k.a(this.f7827j, aVar.f7827j) && k.a(this.f7828k, aVar.f7828k) && k.a(this.f7829l, aVar.f7829l) && this.m == aVar.m) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + w.d.d(w.d.d(w.d.d(w.d.c(this.f7826i, w.d.c(this.f7825h, w.d.d(w.d.d(w.d.c(this.f7822e, w.d.c(this.f7821d, w.d.f(this.f7820c, w.d.f(this.f7819b, Long.hashCode(this.f7818a) * 31, 31), 31), 31), 31), 31, this.f7823f), 31, this.f7824g), 31), 31), 31, this.f7827j), 31, this.f7828k), 31, this.f7829l);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RAAchievementEntity(id=");
        sb2.append(this.f7818a);
        sb2.append(", gameId=");
        sb2.append(this.f7819b);
        sb2.append(", setId=");
        sb2.append(this.f7820c);
        sb2.append(", totalAwardsCasual=");
        sb2.append(this.f7821d);
        sb2.append(", totalAwardsHardcore=");
        sb2.append(this.f7822e);
        sb2.append(", title=");
        w.d.B(sb2, this.f7823f, ", description=", this.f7824g, ", points=");
        sb2.append(this.f7825h);
        sb2.append(", displayOrder=");
        sb2.append(this.f7826i);
        sb2.append(", badgeUrlUnlocked=");
        w.d.B(sb2, this.f7827j, ", badgeUrlLocked=", this.f7828k, ", memoryAddress=");
        sb2.append(this.f7829l);
        sb2.append(", type=");
        sb2.append(this.m);
        sb2.append(")");
        return sb2.toString();
    }
}
