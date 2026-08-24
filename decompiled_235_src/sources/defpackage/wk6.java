package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk6  reason: default package */
/* loaded from: classes.dex */
public final class wk6 {
    public final ek4 a;

    public wk6(ek4 ek4Var) {
        ek4Var.getClass();
        this.a = ek4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof wk6) && nb3.k(this.a, ((wk6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SmartSyncPlanItem(unlock=" + this.a + ")";
    }
}
