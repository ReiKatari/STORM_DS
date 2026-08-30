package zh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends y {

    /* renamed from: a  reason: collision with root package name */
    public final List f15142a;

    public x(List list) {
        this.f15142a = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof x) || !this.f15142a.equals(((x) obj).f15142a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15142a.hashCode();
    }

    public final String toString() {
        return "Ready(sets=" + this.f15142a + ")";
    }
}
