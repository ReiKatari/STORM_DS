package sh;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f12923a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f12924b;

    public e(boolean z10, boolean z11) {
        this.f12923a = z10;
        this.f12924b = z11;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (this.f12923a != eVar.f12923a || this.f12924b != eVar.f12924b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f12924b) + w.d.e(Boolean.hashCode(false) * 31, this.f12923a, 31);
    }

    public final String toString() {
        return "ScreenEditorState(isMenuShown=false, isPropertiesDialogShown=" + this.f12923a + ", isBackgroundPropertiesDialogShown=" + this.f12924b + ")";
    }
}
