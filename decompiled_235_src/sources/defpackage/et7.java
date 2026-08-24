package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et7  reason: default package */
/* loaded from: classes.dex */
public final class et7 {
    public final vv7 a;
    public final l05 b;

    public et7(vv7 vv7Var, l05 l05Var) {
        this.a = vv7Var;
        this.b = l05Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof et7) {
                et7 et7Var = (et7) obj;
                if (!this.a.equals(et7Var.a) || !this.b.equals(et7Var.b)) {
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
        return "WindowAdaptiveInfo(windowSizeClass=" + this.a + ", windowPosture=" + this.b + ')';
    }
}
