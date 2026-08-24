package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rt4  reason: default package */
/* loaded from: classes.dex */
public final class rt4 extends hu4 {
    public final float c;

    public rt4(float f) {
        super(3);
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rt4) && Float.compare(this.c, ((rt4) obj).c) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.c);
    }

    public final String toString() {
        return xg6.p(new StringBuilder("HorizontalTo(x="), this.c, ')');
    }
}
