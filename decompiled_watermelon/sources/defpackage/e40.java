package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e40  reason: default package */
/* loaded from: classes.dex */
public final class e40 {
    public final float a;
    public final mb6 b;

    public e40(float f, mb6 mb6Var) {
        this.a = f;
        this.b = mb6Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e40) {
                e40 e40Var = (e40) obj;
                if (!ji1.b(this.a, e40Var.a) || !this.b.equals(e40Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "BorderStroke(width=" + ((Object) ji1.c(this.a)) + ", brush=" + this.b + ')';
    }
}
