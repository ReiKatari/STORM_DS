package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fr0  reason: default package */
/* loaded from: classes.dex */
public final class fr0 implements qq6 {
    public final long a;

    public fr0(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        nz2.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.qq6
    public final float a() {
        return xq0.d(this.a);
    }

    @Override // defpackage.qq6
    public final long b() {
        return this.a;
    }

    @Override // defpackage.qq6
    public final b60 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fr0) && xq0.c(this.a, ((fr0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = xq0.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) xq0.i(this.a)) + ')';
    }
}
