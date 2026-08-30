package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ir4  reason: default package */
/* loaded from: classes.dex */
public final class ir4 {
    public final boolean a;
    public final ArrayList b;

    public ir4(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ir4) {
                ir4 ir4Var = (ir4) obj;
                if (this.a != ir4Var.a || !this.b.equals(ir4Var.b)) {
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
        return b31.q(sb, tq0.S0(this.b, ", ", null, null, null, 62), "])");
    }
}
