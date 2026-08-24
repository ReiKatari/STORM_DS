package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx1  reason: default package */
/* loaded from: classes.dex */
public final class yx1 extends hy1 {
    public final xq7 a;

    public yx1(xq7 xq7Var) {
        this.a = xq7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yx1) && nb3.k(this.a, ((yx1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        xq7 xq7Var = this.a;
        if (xq7Var == null) {
            return 0;
        }
        return xq7Var.hashCode();
    }

    public final String toString() {
        return "LoadingFirmware(vulkanCompileProgress=" + this.a + ")";
    }
}
