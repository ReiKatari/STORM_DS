package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bu4  reason: default package */
/* loaded from: classes.dex */
public final class bu4 extends hu4 {
    public final float c;
    public final float d;

    public bu4(float f, float f2) {
        super(3);
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu4)) {
            return false;
        }
        bu4 bu4Var = (bu4) obj;
        if (Float.compare(this.c, bu4Var.c) == 0 && Float.compare(this.d, bu4Var.d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + (Float.hashCode(this.c) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RelativeMoveTo(dx=");
        sb.append(this.c);
        sb.append(", dy=");
        return xg6.p(sb, this.d, ')');
    }
}
