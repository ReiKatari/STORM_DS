package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st0  reason: default package */
/* loaded from: classes.dex */
public final class st0 implements e37 {
    public final long a;

    public st0(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        q53.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.e37
    public final float a() {
        return kt0.e(this.a);
    }

    @Override // defpackage.e37
    public final long b() {
        return this.a;
    }

    @Override // defpackage.e37
    public final f80 c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof st0) && kt0.d(this.a, ((st0) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = kt0.i;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return "ColorStyle(value=" + ((Object) kt0.j(this.a)) + ')';
    }
}
