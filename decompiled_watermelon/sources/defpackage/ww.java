package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ww  reason: default package */
/* loaded from: classes.dex */
public final class ww {
    public final fx a;
    public final fx b;

    public ww(fx fxVar, fx fxVar2) {
        this.a = fxVar;
        this.b = fxVar2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ww) {
                ww wwVar = (ww) obj;
                if (this.a.equals(wwVar.a) && this.b.equals(wwVar.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.a + ", secondaryOutConfig=" + this.b + "}";
    }
}
