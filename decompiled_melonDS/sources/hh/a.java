package hh;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f6507a;

    public a(ArrayList arrayList) {
        this.f6507a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a) || !this.f6507a.equals(((a) obj).f6507a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6507a.hashCode();
    }

    public final String toString() {
        return "ControllersConnected(assignedInputs=" + this.f6507a + ")";
    }
}
