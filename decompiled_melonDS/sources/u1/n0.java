package u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: b  reason: collision with root package name */
    public static final n0 f13368b = new n0(null, 63);

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f13369a;

    public n0(mc.l lVar, int i2) {
        this.f13369a = (i2 & 1) != 0 ? null : lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n0) {
            if (this.f13369a == ((n0) obj).f13369a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        mc.l lVar = this.f13369a;
        if (lVar != null) {
            i2 = lVar.hashCode();
        } else {
            i2 = 0;
        }
        return i2 * 28629151;
    }
}
