package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj2  reason: default package */
/* loaded from: classes.dex */
public final class lj2 {
    public final int a;

    public lj2(int i) {
        this.a = i;
    }

    public final String a() {
        return "wght";
    }

    public final float b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lj2) && this.a == ((lj2) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return xg6.q(new StringBuilder("FontVariation.Setting(axisName='wght', value="), this.a, ')');
    }
}
