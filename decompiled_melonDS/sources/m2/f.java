package m2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final i8.a f9198a;

    /* renamed from: b  reason: collision with root package name */
    public final e f9199b;

    public f(i8.a aVar, e eVar) {
        this.f9198a = aVar;
        this.f9199b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f) {
                f fVar = (f) obj;
                if (!this.f9198a.equals(fVar.f9198a) || !this.f9199b.equals(fVar.f9199b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9199b.hashCode() + (this.f9198a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.f9198a + ", windowPosture=" + this.f9199b + ')';
    }
}
