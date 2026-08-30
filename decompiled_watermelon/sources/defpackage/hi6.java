package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hi6  reason: default package */
/* loaded from: classes.dex */
public final class hi6 extends ww2 {
    public final Drawable a;
    public final vw2 b;
    public final i81 c;
    public final ow3 d;
    public final String e;
    public final boolean f;
    public final boolean g;

    public hi6(Drawable drawable, vw2 vw2Var, i81 i81Var, ow3 ow3Var, String str, boolean z, boolean z2) {
        this.a = drawable;
        this.b = vw2Var;
        this.c = i81Var;
        this.d = ow3Var;
        this.e = str;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.ww2
    public final Drawable a() {
        return this.a;
    }

    @Override // defpackage.ww2
    public final vw2 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hi6) {
            hi6 hi6Var = (hi6) obj;
            if (b53.x(this.a, hi6Var.a) && b53.x(this.b, hi6Var.b) && this.c == hi6Var.c && b53.x(this.d, hi6Var.d) && b53.x(this.e, hi6Var.e) && this.f == hi6Var.f && this.g == hi6Var.g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        int i2 = 0;
        ow3 ow3Var = this.d;
        if (ow3Var != null) {
            i = ow3Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str = this.e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return Boolean.hashCode(this.g) + ej6.c((i3 + i2) * 31, this.f, 31);
    }
}
