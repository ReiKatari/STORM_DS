package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nu1  reason: default package */
/* loaded from: classes.dex */
public final class nu1 extends pu1 {
    public final List a;
    public final mu1 b;

    public nu1(List list, mu1 mu1Var) {
        list.getClass();
        mu1Var.getClass();
        this.a = list;
        this.b = mu1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu1)) {
            return false;
        }
        nu1 nu1Var = (nu1) obj;
        if (b53.x(this.a, nu1Var.a) && this.b == nu1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowRomSaveStates(saveStates=" + this.a + ", reason=" + this.b + ")";
    }
}
