package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rl0  reason: default package */
/* loaded from: classes.dex */
public final class rl0 {
    public final ql0 a;
    public final float b;
    public final String c;

    public rl0(ql0 ql0Var, float f, String str) {
        ql0Var.getClass();
        this.a = ql0Var;
        this.b = f;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rl0)) {
            return false;
        }
        rl0 rl0Var = (rl0) obj;
        if (this.a == rl0Var.a && Float.compare(this.b, rl0Var.b) == 0 && b53.x(this.c, rl0Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = ej6.a(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return a + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheatImportProgress(status=");
        sb.append(this.a);
        sb.append(", progress=");
        sb.append(this.b);
        sb.append(", ongoingItemName=");
        return b31.q(sb, this.c, ")");
    }
}
