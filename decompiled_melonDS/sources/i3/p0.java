package i3;

import android.graphics.Shader;
import cd.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p0 extends o {

    /* renamed from: a  reason: collision with root package name */
    public final long f6676a;

    public p0(long j2) {
        this.f6676a = j2;
    }

    @Override // i3.o
    public final void a(float f8, long j2, h1 h1Var) {
        h1Var.h(1.0f);
        int i2 = (f8 > 1.0f ? 1 : (f8 == 1.0f ? 0 : -1));
        long j10 = this.f6676a;
        if (i2 != 0) {
            j10 = s.b(j10, s.d(j10) * f8);
        }
        h1Var.j(j10);
        if (((Shader) h1Var.L) != null) {
            h1Var.m(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        if (s.c(this.f6676a, ((p0) obj).f6676a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2 = s.f6688i;
        return Long.hashCode(this.f6676a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) s.i(this.f6676a)) + ')';
    }
}
