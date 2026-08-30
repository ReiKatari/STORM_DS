package defpackage;

import android.graphics.Shader;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mb6  reason: default package */
/* loaded from: classes.dex */
public final class mb6 extends b60 {
    public final long a;

    public mb6(long j) {
        this.a = j;
    }

    @Override // defpackage.b60
    public final void a(float f, long j, oi oiVar) {
        oiVar.j(1.0f);
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j2 = this.a;
        if (i != 0) {
            j2 = xq0.b(xq0.d(j2) * f, j2);
        }
        oiVar.l(j2);
        if (((Shader) oiVar.R) != null) {
            oiVar.p(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mb6)) {
            return false;
        }
        if (xq0.c(this.a, ((mb6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) xq0.i(this.a)) + ')';
    }
}
