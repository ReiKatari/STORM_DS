package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: er1  reason: default package */
/* loaded from: classes.dex */
public final class er1 {
    public final Rect a;
    public final Rect b;
    public final float c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final Rect g;
    public final Rect h;
    public final float i;
    public final boolean j;

    public er1(Rect rect, Rect rect2, float f, float f2, boolean z, boolean z2, Rect rect3, Rect rect4, float f3, boolean z3) {
        this.a = rect;
        this.b = rect2;
        this.c = f;
        this.d = f2;
        this.e = z;
        this.f = z2;
        this.g = rect3;
        this.h = rect4;
        this.i = f3;
        this.j = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er1)) {
            return false;
        }
        er1 er1Var = (er1) obj;
        if (b53.x(this.a, er1Var.a) && b53.x(this.b, er1Var.b) && Float.compare(this.c, er1Var.c) == 0 && Float.compare(this.d, er1Var.d) == 0 && this.e == er1Var.e && this.f == er1Var.f && b53.x(this.g, er1Var.g) && b53.x(this.h, er1Var.h) && Float.compare(this.i, er1Var.i) == 0 && this.j == er1Var.j) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = 0;
        Rect rect = this.a;
        if (rect == null) {
            hashCode = 0;
        } else {
            hashCode = rect.hashCode();
        }
        int i2 = hashCode * 31;
        Rect rect2 = this.b;
        if (rect2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = rect2.hashCode();
        }
        int c = ej6.c(ej6.c(ej6.a(this.d, ej6.a(this.c, (i2 + hashCode2) * 31, 31), 31), this.e, 31), this.f, 31);
        Rect rect3 = this.g;
        if (rect3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = rect3.hashCode();
        }
        int i3 = (c + hashCode3) * 31;
        Rect rect4 = this.h;
        if (rect4 != null) {
            i = rect4.hashCode();
        }
        return Boolean.hashCode(this.j) + ej6.a(this.i, (i3 + i) * 31, 31);
    }

    public final String toString() {
        return "ScreenPresentationAreas(topScreenRect=" + this.a + ", bottomScreenRect=" + this.b + ", topAlpha=" + this.c + ", bottomAlpha=" + this.d + ", topOnTop=" + this.e + ", bottomOnTop=" + this.f + ", hybridTopScreenRect=" + this.g + ", hybridBottomScreenRect=" + this.h + ", hybridAlpha=" + this.i + ", hybridOnTop=" + this.j + ")";
    }
}
