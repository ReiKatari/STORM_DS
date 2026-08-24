package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ak5  reason: default package */
/* loaded from: classes.dex */
public final class ak5 {
    public final String a;
    public final boolean b;
    public final File c;

    public ak5(File file, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ak5) {
                ak5 ak5Var = (ak5) obj;
                if (!this.a.equals(ak5Var.a) || this.b != ak5Var.b || !nb3.k(this.c, ak5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int e = xg6.e(this.a.hashCode() * 31, this.b, 31);
        File file = this.c;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        return e + hashCode;
    }

    public final String toString() {
        return "RendererDebugCaptureResult(captureId=" + this.a + ", success=" + this.b + ", outputDir=" + this.c + ")";
    }
}
