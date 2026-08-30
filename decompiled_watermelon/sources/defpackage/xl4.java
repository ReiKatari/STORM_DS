package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xl4  reason: default package */
/* loaded from: classes.dex */
public final class xl4 {
    public final wl4 a;
    public final zl4 b;

    public xl4(wl4 wl4Var, zl4 zl4Var) {
        zl4Var.getClass();
        this.a = wl4Var;
        this.b = zl4Var;
    }

    public static xl4 a(xl4 xl4Var, zl4 zl4Var) {
        wl4 wl4Var = xl4Var.a;
        xl4Var.getClass();
        zl4Var.getClass();
        return new xl4(wl4Var, zl4Var);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xl4) {
                xl4 xl4Var = (xl4) obj;
                if (!this.a.equals(xl4Var.a) || this.b != xl4Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PendingRaSubmissionRecord(submission=" + this.a + ", status=" + this.b + ")";
    }
}
