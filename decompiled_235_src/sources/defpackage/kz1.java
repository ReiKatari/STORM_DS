package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kz1  reason: default package */
/* loaded from: classes.dex */
public final class kz1 {
    public final long a;
    public final yv2 b;

    public kz1(long j, yv2 yv2Var) {
        yv2Var.getClass();
        this.a = j;
        this.b = yv2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz1)) {
            return false;
        }
        kz1 kz1Var = (kz1) obj;
        if (this.a == kz1Var.a && this.b == kz1Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "HardcoreExitChoiceResponse(requestId=" + this.a + ", choice=" + this.b + ")";
    }
}
