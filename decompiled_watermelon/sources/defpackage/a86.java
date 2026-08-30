package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a86  reason: default package */
/* loaded from: classes.dex */
public final class a86 {
    public final mi2 a;
    public final sc6 b;

    public a86(mi2 mi2Var, sc6 sc6Var) {
        this.a = mi2Var;
        this.b = sc6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a86) {
                a86 a86Var = (a86) obj;
                if (!this.a.equals(a86Var.a) || !this.b.equals(a86Var.b)) {
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
        return "Slide(slideOffset=" + this.a + ", animationSpec=" + this.b + ')';
    }
}
