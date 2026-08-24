package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w50  reason: default package */
/* loaded from: classes.dex */
public final class w50 {
    public zh a = null;
    public wd b = null;
    public zj0 c = null;
    public hj d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof w50) {
                w50 w50Var = (w50) obj;
                if (!nb3.k(this.a, w50Var.a) || !nb3.k(this.b, w50Var.b) || !nb3.k(this.c, w50Var.c) || !nb3.k(this.d, w50Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        zh zhVar = this.a;
        int i = 0;
        if (zhVar == null) {
            hashCode = 0;
        } else {
            hashCode = zhVar.hashCode();
        }
        int i2 = hashCode * 31;
        wd wdVar = this.b;
        if (wdVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = wdVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        zj0 zj0Var = this.c;
        if (zj0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = zj0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        hj hjVar = this.d;
        if (hjVar != null) {
            i = hjVar.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
