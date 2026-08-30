package defpackage;

import android.opengl.EGLSurface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gx  reason: default package */
/* loaded from: classes.dex */
public final class gx {
    public final EGLSurface a;
    public final int b;
    public final int c;

    public gx(EGLSurface eGLSurface, int i, int i2) {
        if (eGLSurface != null) {
            this.a = eGLSurface;
            this.b = i;
            this.c = i2;
            return;
        }
        c44.i("Null eglSurface");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gx) {
            gx gxVar = (gx) obj;
            if (this.a.equals(gxVar.a) && this.b == gxVar.b && this.c == gxVar.c) {
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
        return wh1.m(sb, this.c, "}");
    }
}
