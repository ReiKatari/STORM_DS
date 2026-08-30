package pg;

import nc.k;
import xe.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final n f11649a;

    public a(n nVar) {
        nVar.getClass();
        this.f11649a = nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a) && k.a(this.f11649a, ((a) obj).f11649a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f11649a.hashCode();
    }

    public final String toString() {
        return "RuntimeAchievementUiModel(runtimeAchievement=" + this.f11649a + ")";
    }
}
