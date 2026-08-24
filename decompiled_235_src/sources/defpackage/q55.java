package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q55  reason: default package */
/* loaded from: classes.dex */
public final class q55 implements s55 {
    public final df0 a;

    public q55(df0 df0Var) {
        this.a = df0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof q55) && nb3.k(this.a, ((q55) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        df0 df0Var = this.a;
        if (df0Var == null) {
            return 0;
        }
        return Integer.hashCode(df0Var.a);
    }

    public final String toString() {
        return "Error(lastCameraError=" + this.a + ')';
    }
}
