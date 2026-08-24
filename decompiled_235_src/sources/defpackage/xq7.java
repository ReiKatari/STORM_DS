package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xq7  reason: default package */
/* loaded from: classes.dex */
public final class xq7 {
    public final int a;
    public final int b;
    public final int c;

    public xq7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq7)) {
            return false;
        }
        xq7 xq7Var = (xq7) obj;
        if (this.a == xq7Var.a && this.b == xq7Var.b && this.c == xq7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + lb1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return lb1.o(i61.q(this.a, this.b, "VulkanCompileProgress(stageId=", ", current=", ", total="), this.c, ")");
    }
}
