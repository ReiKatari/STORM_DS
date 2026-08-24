package defpackage;

import android.graphics.Shader;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn6  reason: default package */
/* loaded from: classes.dex */
public final class cn6 extends f80 {
    public final long a;

    public cn6(long j) {
        this.a = j;
    }

    @Override // defpackage.f80
    public final void a(float f, long j, aj ajVar) {
        ajVar.j(1.0f);
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j2 = this.a;
        if (i != 0) {
            j2 = kt0.c(kt0.e(j2) * f, j2);
        }
        ajVar.l(j2);
        if (((Shader) ajVar.R) != null) {
            ajVar.p(null);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn6)) {
            return false;
        }
        if (kt0.d(this.a, ((cn6) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "SolidColor(value=" + ((Object) kt0.j(this.a)) + ')';
    }
}
