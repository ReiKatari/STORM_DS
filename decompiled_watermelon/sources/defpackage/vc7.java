package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vc7  reason: default package */
/* loaded from: classes.dex */
public final class vc7 {
    public final int a;
    public final int b;
    public final int c;

    public vc7(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc7)) {
            return false;
        }
        vc7 vc7Var = (vc7) obj;
        if (this.a == vc7Var.a && this.b == vc7Var.b && this.c == vc7Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + wh1.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return wh1.m(b31.s(this.a, this.b, "VulkanCompileProgress(stageId=", ", current=", ", total="), this.c, ")");
    }
}
