package bh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: a  reason: collision with root package name */
    public final List f2263a;

    public e(List list) {
        list.getClass();
        this.f2263a = list;
    }

    @Override // bh.f
    public final List a() {
        return this.f2263a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && nc.k.a(this.f2263a, ((e) obj).f2263a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2263a.hashCode();
    }

    public final String toString() {
        return "Success(uiEvents=" + this.f2263a + ")";
    }
}
