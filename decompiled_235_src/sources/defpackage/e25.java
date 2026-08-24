package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e25  reason: default package */
/* loaded from: classes.dex */
public final class e25 {
    public boolean a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e25)) {
            return false;
        }
        e25 e25Var = (e25) obj;
        if (this.a == e25Var.a && this.b == e25Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        return "PresentFrameWrapper(isValidFrame=" + z + ", textureId=" + i + ")";
    }
}
