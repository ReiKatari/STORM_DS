package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y30  reason: default package */
/* loaded from: classes.dex */
public final class y30 {
    public nh a = null;
    public id b = null;
    public rh0 c = null;
    public vi d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y30) {
                y30 y30Var = (y30) obj;
                if (!b53.x(this.a, y30Var.a) || !b53.x(this.b, y30Var.b) || !b53.x(this.c, y30Var.c) || !b53.x(this.d, y30Var.d)) {
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
        nh nhVar = this.a;
        int i = 0;
        if (nhVar == null) {
            hashCode = 0;
        } else {
            hashCode = nhVar.hashCode();
        }
        int i2 = hashCode * 31;
        id idVar = this.b;
        if (idVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = idVar.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        rh0 rh0Var = this.c;
        if (rh0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = rh0Var.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        vi viVar = this.d;
        if (viVar != null) {
            i = viVar.hashCode();
        }
        return i4 + i;
    }

    public final String toString() {
        return "BorderCache(imageBitmap=" + this.a + ", canvas=" + this.b + ", canvasDrawScope=" + this.c + ", borderPath=" + this.d + ')';
    }
}
