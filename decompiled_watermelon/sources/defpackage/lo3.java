package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lo3  reason: default package */
/* loaded from: classes.dex */
public final class lo3 extends no3 {
    public final String a;
    public final rr6 b;

    public lo3(String str, rr6 rr6Var) {
        this.a = str;
        this.b = rr6Var;
    }

    @Override // defpackage.no3
    public final rr6 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo3)) {
            return false;
        }
        lo3 lo3Var = (lo3) obj;
        if (b53.x(this.a, lo3Var.a) && b53.x(this.b, lo3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        rr6 rr6Var = this.b;
        if (rr6Var != null) {
            i = rr6Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return wh1.o(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
