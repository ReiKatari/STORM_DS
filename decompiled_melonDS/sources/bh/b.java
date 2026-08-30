package bh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    public final oi.h f2257a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2258b;

    /* renamed from: c  reason: collision with root package name */
    public final String f2259c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2260d;

    public b(oi.h hVar, int i2, String str, boolean z10) {
        this.f2257a = hVar;
        this.f2258b = i2;
        this.f2259c = str;
        this.f2260d = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!this.f2257a.equals(bVar.f2257a) || this.f2258b != bVar.f2258b || !this.f2259c.equals(bVar.f2259c) || this.f2260d != bVar.f2260d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2260d) + w.d.d(w.d.c(this.f2258b, this.f2257a.hashCode() * 31, 31), 31, this.f2259c);
    }

    public final String toString() {
        return "LeaderboardEntrySubmission(leaderboard=" + this.f2257a + ", value=" + this.f2258b + ", formattedValue=" + this.f2259c + ", firstTry=" + this.f2260d + ")";
    }
}
