package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ct4  reason: default package */
/* loaded from: classes.dex */
public final class ct4 {
    public boolean a;
    public int b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ct4)) {
            return false;
        }
        ct4 ct4Var = (ct4) obj;
        if (this.a == ct4Var.a && this.b == ct4Var.b) {
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
