package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tg0  reason: default package */
/* loaded from: classes.dex */
public final class tg0 {
    public final boolean a;
    public final boolean b;

    public tg0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg0)) {
            return false;
        }
        tg0 tg0Var = (tg0) obj;
        if (this.a == tg0Var.a && this.b == tg0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ValidationCriteria(checkBack=");
        sb.append(this.a);
        sb.append(", checkFront=");
        return ej6.h(sb, this.b, ')');
    }
}
