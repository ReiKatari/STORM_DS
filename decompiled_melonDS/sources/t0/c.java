package t0;

import android.opengl.EGLSurface;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final EGLSurface f13052a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13053b;

    /* renamed from: c  reason: collision with root package name */
    public final int f13054c;

    public c(EGLSurface eGLSurface, int i2, int i10) {
        if (eGLSurface != null) {
            this.f13052a = eGLSurface;
            this.f13053b = i2;
            this.f13054c = i10;
            return;
        }
        o.i("Null eglSurface");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f13052a.equals(cVar.f13052a) && this.f13053b == cVar.f13053b && this.f13054c == cVar.f13054c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f13052a.hashCode() ^ 1000003) * 1000003) ^ this.f13053b) * 1000003) ^ this.f13054c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OutputSurface{eglSurface=");
        sb2.append(this.f13052a);
        sb2.append(", width=");
        sb2.append(this.f13053b);
        sb2.append(", height=");
        return w.d.q(sb2, this.f13054c, "}");
    }
}
