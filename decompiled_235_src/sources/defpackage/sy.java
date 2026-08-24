package defpackage;

import android.opengl.EGLSurface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sy  reason: default package */
/* loaded from: classes.dex */
public final class sy {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public sy(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.a = eGLSurface;
            this.b = i;
            this.c = i2;
            return;
        }
        u34.x("Null eglSurface");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sy) {
            sy syVar = (sy) obj;
            if (this.a.equals(syVar.a) && this.b == syVar.b && this.c == syVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutputSurface{eglSurface=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return lb1.o(sb, this.c, "}");
    }
}
