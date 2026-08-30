package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nr5  reason: default package */
/* loaded from: classes.dex */
public final class nr5 {
    public final or5 a;
    public final or5 b;
    public final Throwable c;

    public nr5(or5 or5Var, mw0 mw0Var, Throwable th) {
        this.a = or5Var;
        this.b = mw0Var;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr5)) {
            return false;
        }
        nr5 nr5Var = (nr5) obj;
        if (b53.x(this.a, nr5Var.a) && b53.x(this.b, nr5Var.b) && b53.x(this.c, nr5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        or5 or5Var = this.b;
        if (or5Var == null) {
            hashCode = 0;
        } else {
            hashCode = or5Var.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Throwable th = this.c;
        if (th != null) {
            i = th.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }

    public /* synthetic */ nr5(or5 or5Var, Throwable th, int i) {
        this(or5Var, (mw0) null, (i & 4) != 0 ? null : th);
    }
}
