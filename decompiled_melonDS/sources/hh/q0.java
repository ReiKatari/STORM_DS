package hh;

import java.net.URL;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q0 extends w0 {

    /* renamed from: a  reason: collision with root package name */
    public final oi.h f6562a;

    /* renamed from: b  reason: collision with root package name */
    public final URL f6563b;

    public q0(oi.h hVar, URL url) {
        hVar.getClass();
        this.f6562a = hVar;
        this.f6563b = url;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q0) {
                q0 q0Var = (q0) obj;
                if (!nc.k.a(this.f6562a, q0Var.f6562a) || !this.f6563b.equals(q0Var.f6563b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6563b.hashCode() + (this.f6562a.hashCode() * 31);
    }

    public final String toString() {
        return "LeaderboardAttemptStarted(leaderboard=" + this.f6562a + ", gameIcon=" + this.f6563b + ")";
    }
}
