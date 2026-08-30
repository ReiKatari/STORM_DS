package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a41  reason: default package */
/* loaded from: classes.dex */
public final class a41 extends b53 {
    public final h20 g;

    public a41(h20 h20Var) {
        this.g = h20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof a41) && b53.x(this.g, ((a41) obj).g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g.a);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.g + ')';
    }

    @Override // defpackage.b53
    public final int w(int i, int i2, sd3 sd3Var) {
        return this.g.a(i2, i, sd3Var);
    }
}
