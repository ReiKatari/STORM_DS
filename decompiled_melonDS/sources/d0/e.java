package d0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final s f3360a;

    /* renamed from: b  reason: collision with root package name */
    public final f f3361b;

    public e(s sVar, f fVar) {
        if (sVar != null) {
            this.f3360a = sVar;
            this.f3361b = fVar;
            return;
        }
        m9.o.i("Null type");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f3360a.equals(eVar.f3360a)) {
                f fVar = eVar.f3361b;
                f fVar2 = this.f3361b;
                if (fVar2 != null ? fVar2.equals(fVar) : fVar == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3360a.hashCode() ^ 1000003) * 1000003;
        f fVar = this.f3361b;
        if (fVar == null) {
            hashCode = 0;
        } else {
            hashCode = fVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "CameraState{type=" + this.f3360a + ", error=" + this.f3361b + "}";
    }
}
