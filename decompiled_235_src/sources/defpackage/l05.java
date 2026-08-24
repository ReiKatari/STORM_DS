package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l05  reason: default package */
/* loaded from: classes.dex */
public final class l05 {
    public final boolean a;
    public final ArrayList b;

    public l05(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l05) {
                l05 l05Var = (l05) obj;
                if (this.a != l05Var.a || !this.b.equals(l05Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Posture(isTabletop=");
        sb.append(this.a);
        sb.append(", hinges=[");
        return i61.n(sb, gt0.P0(this.b, ", ", null, null, null, 62), "])");
    }
}
