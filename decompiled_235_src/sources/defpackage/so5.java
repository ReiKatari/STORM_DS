package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so5  reason: default package */
/* loaded from: classes.dex */
public final class so5 implements vo5 {
    public final lm1 a;

    public so5(lm1 lm1Var) {
        this.a = lm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof so5) && this.a == ((so5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Downloading(update=" + this.a + ")";
    }
}
