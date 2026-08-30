package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: el4  reason: default package */
/* loaded from: classes.dex */
public final class el4 extends fl4 {
    public final float c;

    public el4(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof el4) && Float.compare(this.c, ((el4) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ej6.f(new StringBuilder("VerticalTo(y="), this.c, ')');
    }
}
