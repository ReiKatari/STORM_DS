package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eu4  reason: default package */
/* loaded from: classes.dex */
public final class eu4 extends hu4 {
    public final float c;
    public final float d;

    public eu4(float f, float f2) {
        super(1);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eu4)) {
            return false;
        }
        eu4 eu4Var = (eu4) obj;
        if (Float.compare(this.c, eu4Var.c) == 0 && Float.compare(this.d, eu4Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return xg6.p(sb, this.d, ')');
    }
}
