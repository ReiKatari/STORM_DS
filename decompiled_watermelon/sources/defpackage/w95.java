package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w95  reason: default package */
/* loaded from: classes.dex */
public final class w95 {
    public final int a;
    public final String b;

    public w95(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w95) {
                w95 w95Var = (w95) obj;
                if (this.a != w95Var.a || !this.b.equals(w95Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Renderer2DModeItem(mode=" + this.a + ", label=" + this.b + ")";
    }
}
