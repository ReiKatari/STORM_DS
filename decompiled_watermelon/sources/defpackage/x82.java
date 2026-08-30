package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x82  reason: default package */
/* loaded from: classes.dex */
public final class x82 {
    public final int a;

    static {
        l07.c0(new x82(0), new x82(1), new x82(2));
    }

    public /* synthetic */ x82(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x82) {
            if (this.a != ((x82) obj).a) {
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
        return ej6.e("FlashMode(value=", this.a, ')');
    }
}
