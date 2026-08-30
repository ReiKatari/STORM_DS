package je;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f7835a;

    /* renamed from: b  reason: collision with root package name */
    public final List f7836b;

    /* renamed from: c  reason: collision with root package name */
    public final List f7837c;

    public c(b bVar, List list, List list2) {
        this.f7835a = bVar;
        this.f7836b = list;
        this.f7837c = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!this.f7835a.equals(cVar.f7835a) || !this.f7836b.equals(cVar.f7836b) || !this.f7837c.equals(cVar.f7837c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.f7836b.hashCode();
        return this.f7837c.hashCode() + ((hashCode + (this.f7835a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "RAAchievementSetWithDataEntity(set=" + this.f7835a + ", achievements=" + this.f7836b + ", leaderboards=" + this.f7837c + ")";
    }
}
