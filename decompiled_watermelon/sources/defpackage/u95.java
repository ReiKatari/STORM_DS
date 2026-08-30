package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u95  reason: default package */
/* loaded from: classes.dex */
public final class u95 {
    public final int a;
    public final String b;

    public u95(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u95) {
                u95 u95Var = (u95) obj;
                if (this.a != u95Var.a || !this.b.equals(u95Var.b)) {
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
        return "Renderer2DCompModeItem(mode=" + this.a + ", label=" + this.b + ")";
    }
}
