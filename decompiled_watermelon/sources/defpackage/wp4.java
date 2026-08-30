package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wp4  reason: default package */
/* loaded from: classes.dex */
public final class wp4 {
    public final int a;

    public /* synthetic */ wp4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof wp4) {
            if (this.a != ((wp4) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ej6.e("PointerKeyboardModifiers(packedValue=", this.a, ')');
    }
}
