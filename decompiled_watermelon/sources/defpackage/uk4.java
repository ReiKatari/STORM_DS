package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uk4  reason: default package */
/* loaded from: classes.dex */
public final class uk4 extends fl4 {
    public final float c;
    public final float d;

    public uk4(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk4)) {
            return false;
        }
        uk4 uk4Var = (uk4) obj;
        if (Float.compare(this.c, uk4Var.c) == 0 && Float.compare(this.d, uk4Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.c);
        sb.append(", y=");
        return ej6.f(sb, this.d, ')');
    }
}
