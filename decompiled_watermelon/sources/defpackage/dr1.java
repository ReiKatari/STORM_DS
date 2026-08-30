package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dr1  reason: default package */
/* loaded from: classes.dex */
public final class dr1 {
    public final List a;
    public final boolean b;
    public final mi2 c;

    public dr1(List list, boolean z, mi2 mi2Var) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = mi2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dr1) {
                dr1 dr1Var = (dr1) obj;
                if (!b53.x(this.a, dr1Var.a) || this.b != dr1Var.b || !this.c.equals(dr1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "SaveStatesOverlayData(slots=" + this.a + ", isSaving=" + this.b + ", onSlotPicked=" + this.c + ")";
    }
}
