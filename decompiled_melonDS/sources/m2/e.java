package m2;

import java.util.ArrayList;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9196a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f9197b;

    public e(ArrayList arrayList, boolean z10) {
        this.f9196a = z10;
        this.f9197b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f9196a != eVar.f9196a || !this.f9197b.equals(eVar.f9197b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f9197b.hashCode() + (Boolean.hashCode(this.f9196a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Posture(isTabletop=");
        sb2.append(this.f9196a);
        sb2.append(", hinges=[");
        return w.d.s(sb2, l.Y(this.f9197b, ", ", null, null, null, 62), "])");
    }
}
