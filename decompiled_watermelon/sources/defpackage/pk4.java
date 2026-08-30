package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pk4  reason: default package */
/* loaded from: classes.dex */
public final class pk4 extends fl4 {
    public final float c;

    public pk4(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof pk4) && Float.compare(this.c, ((pk4) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return ej6.f(new StringBuilder("HorizontalTo(x="), this.c, ')');
    }
}
