package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zx1  reason: default package */
/* loaded from: classes.dex */
public final class zx1 extends hy1 {
    public final xq7 a;
    public final in5 b;

    public zx1(xq7 xq7Var, in5 in5Var) {
        this.a = xq7Var;
        this.b = in5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx1)) {
            return false;
        }
        zx1 zx1Var = (zx1) obj;
        if (nb3.k(this.a, zx1Var.a) && this.b == zx1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        xq7 xq7Var = this.a;
        if (xq7Var == null) {
            hashCode = 0;
        } else {
            hashCode = xq7Var.hashCode();
        }
        int i2 = hashCode * 31;
        in5 in5Var = this.b;
        if (in5Var != null) {
            i = in5Var.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "LoadingRom(vulkanCompileProgress=" + this.a + ", retroAchievementsLoadStage=" + this.b + ")";
    }
}
