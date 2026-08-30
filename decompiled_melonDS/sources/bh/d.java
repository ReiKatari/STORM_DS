package bh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: a  reason: collision with root package name */
    public final c f2261a;

    /* renamed from: b  reason: collision with root package name */
    public final List f2262b;

    public d(c cVar, List list) {
        this.f2261a = cVar;
        this.f2262b = list;
    }

    @Override // bh.f
    public final List a() {
        return this.f2262b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (!this.f2261a.equals(dVar.f2261a) || !this.f2262b.equals(dVar.f2262b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f2262b.hashCode() + (this.f2261a.hashCode() * 31);
    }

    public final String toString() {
        return "Failure(nextSubmissionAttempt=" + this.f2261a + ", uiEvents=" + this.f2262b + ")";
    }
}
