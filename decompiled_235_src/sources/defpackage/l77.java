package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l77  reason: default package */
/* loaded from: classes.dex */
public final class l77 extends x77 {
    public final String a;

    public l77(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof l77) || !this.a.equals(((l77) obj).a)) {
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
        return lb1.A("RendererDebugCaptureLogged(captureId=", this.a, ")");
    }
}
