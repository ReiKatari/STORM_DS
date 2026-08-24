package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm1  reason: default package */
/* loaded from: classes.dex */
public final class pm1 implements g61 {
    public final float a;

    public pm1(float f) {
        this.a = f;
    }

    @Override // defpackage.g61
    public final float a(long j, qh1 qh1Var) {
        return qh1Var.e0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof pm1) || !om1.b(this.a, ((pm1) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return "CornerSize(size = " + this.a + ".dp)";
    }
}
