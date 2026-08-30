package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b41  reason: default package */
/* loaded from: classes.dex */
public final class b41 extends b53 {
    public final i20 g;

    public b41(i20 i20Var) {
        this.g = i20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof b41) && b53.x(this.g, ((b41) obj).g)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.g.a);
    }

    public final String toString() {
        return "VerticalCrossAxisAlignment(vertical=" + this.g + ')';
    }

    @Override // defpackage.b53
    public final int w(int i, int i2, sd3 sd3Var) {
        return this.g.a(i2, i);
    }
}
