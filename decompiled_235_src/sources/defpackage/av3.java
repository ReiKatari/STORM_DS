package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: av3  reason: default package */
/* loaded from: classes.dex */
public final class av3 implements fj2 {
    public final float a;

    public av3(float f) {
        this.a = f;
    }

    @Override // defpackage.fj2
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.fj2
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof av3) && Float.compare(this.a, ((av3) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return xg6.p(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
