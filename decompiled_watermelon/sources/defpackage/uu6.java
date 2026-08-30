package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uu6  reason: default package */
/* loaded from: classes.dex */
public final class uu6 extends gv6 {
    public final String a;

    public uu6(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof uu6) || !this.a.equals(((uu6) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wh1.A("RendererDebugCaptureLogged(captureId=", this.a, ")");
    }
}
