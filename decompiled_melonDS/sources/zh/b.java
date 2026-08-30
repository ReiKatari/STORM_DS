package zh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f15108a;

    /* renamed from: b  reason: collision with root package name */
    public final List f15109b;

    public b(a aVar, List list) {
        aVar.getClass();
        list.getClass();
        this.f15108a = aVar;
        this.f15109b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f15108a == bVar.f15108a && nc.k.a(this.f15109b, bVar.f15109b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15109b.hashCode() + (this.f15108a.hashCode() * 31);
    }

    public final String toString() {
        return "AchievementBucketUiModel(bucket=" + this.f15108a + ", achievements=" + this.f15109b + ")";
    }
}
