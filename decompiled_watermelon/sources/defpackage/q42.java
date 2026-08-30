package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q42  reason: default package */
/* loaded from: classes.dex */
public final class q42 {
    public final Object a;
    public final et0 b;

    public q42(p96 p96Var, et0 et0Var) {
        this.a = p96Var;
        this.b = et0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q42) {
            q42 q42Var = (q42) obj;
            if (b53.x(this.a, q42Var.a) && this.b == q42Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.b.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.a + ", transition=" + this.b + ')';
    }
}
