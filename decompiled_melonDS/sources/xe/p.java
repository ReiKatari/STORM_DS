package xe;

import java.net.URL;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public final long f14588a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14589b;

    /* renamed from: c  reason: collision with root package name */
    public final oi.c f14590c;

    /* renamed from: d  reason: collision with root package name */
    public final long f14591d;

    /* renamed from: e  reason: collision with root package name */
    public final URL f14592e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f14593f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f14594g;

    public p(long j2, long j10, String str, URL url, ArrayList arrayList, ArrayList arrayList2, oi.c cVar) {
        cVar.getClass();
        this.f14588a = j2;
        this.f14589b = str;
        this.f14590c = cVar;
        this.f14591d = j10;
        this.f14592e = url;
        this.f14593f = arrayList;
        this.f14594g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p) {
                p pVar = (p) obj;
                if (this.f14588a == pVar.f14588a && nc.k.a(this.f14589b, pVar.f14589b) && this.f14590c == pVar.f14590c && oi.g.a(this.f14591d, pVar.f14591d) && this.f14592e.equals(pVar.f14592e) && this.f14593f.equals(pVar.f14593f) && this.f14594g.equals(pVar.f14594g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Long.hashCode(this.f14588a) * 31;
        String str = this.f14589b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = this.f14590c.hashCode();
        int f8 = w.d.f(this.f14591d, (hashCode3 + ((hashCode2 + hashCode) * 31)) * 31, 31);
        int hashCode4 = this.f14593f.hashCode();
        return this.f14594g.hashCode() + ((hashCode4 + ((this.f14592e.hashCode() + f8) * 31)) * 31);
    }

    public final String toString() {
        String j02 = d0.d.j0(this.f14588a);
        String b10 = oi.g.b(this.f14591d);
        StringBuilder k10 = kc.a.k("RAUserAchievementSet(id=", j02, ", title=", this.f14589b, ", type=");
        k10.append(this.f14590c);
        k10.append(", gameId=");
        k10.append(b10);
        k10.append(", iconUrl=");
        k10.append(this.f14592e);
        k10.append(", achievements=");
        k10.append(this.f14593f);
        k10.append(", leaderboards=");
        k10.append(this.f14594g);
        k10.append(")");
        return k10.toString();
    }
}
