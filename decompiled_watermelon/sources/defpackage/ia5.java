package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ia5  reason: default package */
/* loaded from: classes.dex */
public final class ia5 {
    public final String a;
    public final boolean b;
    public final File c;

    public ia5(File file, String str, boolean z) {
        this.a = str;
        this.b = z;
        this.c = file;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ia5) {
                ia5 ia5Var = (ia5) obj;
                if (!this.a.equals(ia5Var.a) || this.b != ia5Var.b || !b53.x(this.c, ia5Var.c)) {
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
        int c = ej6.c(this.a.hashCode() * 31, this.b, 31);
        File file = this.c;
        if (file == null) {
            hashCode = 0;
        } else {
            hashCode = file.hashCode();
        }
        return c + hashCode;
    }

    public final String toString() {
        return "RendererDebugCaptureResult(captureId=" + this.a + ", success=" + this.b + ", outputDir=" + this.c + ")";
    }
}
