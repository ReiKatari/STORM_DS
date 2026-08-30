package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ja5  reason: default package */
/* loaded from: classes.dex */
public final class ja5 {
    public final String a;
    public final ki2 b;

    public ja5(String str, ki2 ki2Var) {
        this.a = str;
        this.b = ki2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ja5) {
                ja5 ja5Var = (ja5) obj;
                if (!this.a.equals(ja5Var.a) || !this.b.equals(ja5Var.b)) {
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
        return "RendererDebugMenuEntry(title=" + this.a + ", action=" + this.b + ")";
    }
}
