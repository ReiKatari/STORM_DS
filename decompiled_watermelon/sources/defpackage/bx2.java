package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bx2  reason: default package */
/* loaded from: classes.dex */
public final class bx2 {
    public final ax2 a;
    public final int b;

    public bx2(ax2 ax2Var, int i) {
        this.a = ax2Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bx2) {
                bx2 bx2Var = (bx2) obj;
                if (!this.a.equals(bx2Var.a) || this.b != bx2Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageVectorEntry(imageVector=");
        sb.append(this.a);
        sb.append(", configFlags=");
        return ej6.g(sb, this.b, ')');
    }
}
