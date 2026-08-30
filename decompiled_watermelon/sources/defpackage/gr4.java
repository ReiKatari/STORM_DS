package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gr4  reason: default package */
/* loaded from: classes.dex */
public final class gr4 {
    public final Rect a;
    public final vc3 b;
    public final float c;
    public final boolean d;

    public gr4(Rect rect, vc3 vc3Var, float f, boolean z) {
        vc3Var.getClass();
        this.a = rect;
        this.b = vc3Var;
        this.c = f;
        this.d = z;
    }

    public static gr4 a(gr4 gr4Var, Rect rect) {
        vc3 vc3Var = gr4Var.b;
        float f = gr4Var.c;
        boolean z = gr4Var.d;
        gr4Var.getClass();
        rect.getClass();
        vc3Var.getClass();
        return new gr4(rect, vc3Var, f, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr4)) {
            return false;
        }
        gr4 gr4Var = (gr4) obj;
        if (b53.x(this.a, gr4Var.a) && this.b == gr4Var.b && Float.compare(this.c, gr4Var.c) == 0 && this.d == gr4Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.d) + ej6.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "PositionedLayoutComponent(rect=" + this.a + ", component=" + this.b + ", alpha=" + this.c + ", onTop=" + this.d + ")";
    }
}
