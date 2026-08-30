package mh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    public final oi.h f9673a;

    /* renamed from: b  reason: collision with root package name */
    public final URL f9674b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9675c;

    /* renamed from: d  reason: collision with root package name */
    public final a4.n f9676d;

    public c(oi.h hVar, URL url, String str, a4.n nVar) {
        hVar.getClass();
        this.f9673a = hVar;
        this.f9674b = url;
        this.f9675c = str;
        this.f9676d = nVar;
    }

    @Override // mh.h
    public final a4.n a() {
        return this.f9676d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!nc.k.a(this.f9673a, cVar.f9673a) || !this.f9674b.equals(cVar.f9674b) || !this.f9675c.equals(cVar.f9675c) || !this.f9676d.equals(cVar.f9676d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9676d.hashCode() + w.d.d((this.f9674b.hashCode() + (this.f9673a.hashCode() * 31)) * 31, 31, this.f9675c);
    }

    public final String toString() {
        return "LeaderboardAttempt(leaderboard=" + this.f9673a + ", gameIcon=" + this.f9674b + ", currentValue=" + this.f9675c + ", state=" + this.f9676d + ")";
    }
}
