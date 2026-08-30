package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q85  reason: default package */
/* loaded from: classes.dex */
public final class q85 extends yf2 {
    public final yf2 e;
    public final int f;

    public q85(yf2 yf2Var, int i) {
        this.e = yf2Var;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q85) {
            q85 q85Var = (q85) obj;
            if (q85Var.e.equals(this.e) && q85Var.f == this.f) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.f * 31);
    }
}
