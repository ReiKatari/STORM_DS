package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z56  reason: default package */
/* loaded from: classes.dex */
public final class z56 {
    public final long a;
    public final sc7 b;

    public z56(long j, sc7 sc7Var) {
        this.a = j;
        this.b = sc7Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof z56) {
                z56 z56Var = (z56) obj;
                if (Float.compare(0.92f, 0.92f) != 0 || !i97.a(this.a, z56Var.a) || !this.b.equals(z56Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = i97.c;
        return this.b.hashCode() + i61.c(this.a, Float.hashCode(0.92f) * 31, 31);
    }

    public final String toString() {
        return "Scale(scale=0.92, transformOrigin=" + ((Object) i97.b(this.a)) + ", animationSpec=" + this.b + ')';
    }
}
