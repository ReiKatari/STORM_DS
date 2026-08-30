package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hv5  reason: default package */
/* loaded from: classes.dex */
public final class hv5 {
    public final boolean a;
    public final boolean b;

    public hv5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hv5) {
                hv5 hv5Var = (hv5) obj;
                if (this.a != hv5Var.a || this.b != hv5Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + ej6.c(Boolean.hashCode(false) * 31, this.a, 31);
    }

    public final String toString() {
        return "ScreenEditorState(isMenuShown=false, isPropertiesDialogShown=" + this.a + ", isBackgroundPropertiesDialogShown=" + this.b + ")";
    }
}
