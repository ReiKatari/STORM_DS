package pi;

import java.util.ArrayList;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: c  reason: collision with root package name */
    public static final i f11728c = new i(zb.l.s0(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set f11729a;

    /* renamed from: b  reason: collision with root package name */
    public final q8.r f11730b;

    public i(Set set, q8.r rVar) {
        this.f11729a = set;
        this.f11730b = rVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (iVar.f11729a.equals(this.f11729a) && nc.k.a(iVar.f11730b, this.f11730b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f11729a.hashCode() + 1517) * 41;
        q8.r rVar = this.f11730b;
        if (rVar != null) {
            i2 = rVar.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }
}
