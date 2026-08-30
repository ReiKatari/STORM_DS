package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yn3  reason: default package */
/* loaded from: classes.dex */
public final class yn3 implements he2 {
    public final float a;

    public yn3(float f) {
        this.a = f;
    }

    @Override // defpackage.he2
    public final float a(float f) {
        return f / this.a;
    }

    @Override // defpackage.he2
    public final float b(float f) {
        return f * this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof yn3) && Float.compare(this.a, ((yn3) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return ej6.f(new StringBuilder("LinearFontScaleConverter(fontScale="), this.a, ')');
    }
}
