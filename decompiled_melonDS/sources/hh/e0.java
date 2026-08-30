package hh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final List f6516a;

    public e0(List list) {
        this.f6516a = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof e0) || !this.f6516a.equals(((e0) obj).f6516a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6516a.hashCode();
    }

    public final String toString() {
        return "PauseMenu(options=" + this.f6516a + ")";
    }
}
