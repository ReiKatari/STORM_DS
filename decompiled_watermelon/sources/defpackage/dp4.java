package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dp4  reason: default package */
/* loaded from: classes.dex */
public final class dp4 {
    public final yo4 a;
    public final qo4 b;

    public dp4(yo4 yo4Var, qo4 qo4Var) {
        this.a = yo4Var;
        this.b = qo4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp4)) {
            return false;
        }
        dp4 dp4Var = (dp4) obj;
        if (b53.x(this.b, dp4Var.b) && b53.x(this.a, dp4Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        yo4 yo4Var = this.a;
        if (yo4Var != null) {
            i = yo4Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        qo4 qo4Var = this.b;
        if (qo4Var != null) {
            i2 = qo4Var.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }
}
