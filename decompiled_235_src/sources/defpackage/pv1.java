package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pv1  reason: default package */
/* loaded from: classes.dex */
public final class pv1 {
    public final List a;
    public final boolean b;
    public final qn2 c;

    public pv1(List list, boolean z, qn2 qn2Var) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = qn2Var;
    }

    public static pv1 a(pv1 pv1Var, List list) {
        boolean z = pv1Var.b;
        qn2 qn2Var = pv1Var.c;
        list.getClass();
        return new pv1(list, z, qn2Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pv1) {
                pv1 pv1Var = (pv1) obj;
                if (!nb3.k(this.a, pv1Var.a) || this.b != pv1Var.b || !this.c.equals(pv1Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + xg6.e(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "SaveStatesOverlayData(slots=" + this.a + ", isSaving=" + this.b + ", onSlotPicked=" + this.c + ")";
    }
}
