package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u66  reason: default package */
/* loaded from: classes.dex */
public final class u66 {
    public final boolean a;
    public final boolean b;

    public u66(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u66) {
                u66 u66Var = (u66) obj;
                if (this.a != u66Var.a || this.b != u66Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + xg6.e(Boolean.hashCode(false) * 31, this.a, 31);
    }

    public final String toString() {
        return "ScreenEditorState(isMenuShown=false, isPropertiesDialogShown=" + this.a + ", isBackgroundPropertiesDialogShown=" + this.b + ")";
    }
}
