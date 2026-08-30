package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hr4  reason: default package */
/* loaded from: classes.dex */
public final class hr4 {
    @r06("rect")
    private final z55 a;
    @r06("component")
    private final String b;
    @r06("alpha")
    private final Float c;
    @r06("onTop")
    private final Boolean d;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: hr4$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public hr4(z55 z55Var, String str, Float f, Boolean bool) {
        str.getClass();
        this.a = z55Var;
        this.b = str;
        this.c = f;
        this.d = bool;
    }

    public final gr4 a() {
        float f;
        boolean z;
        Rect a2 = this.a.a();
        vc3 vc3Var = (vc3) se.t(this.b, vc3.values());
        Float f2 = this.c;
        if (f2 != null) {
            f = f2.floatValue();
        } else {
            f = 1.0f;
        }
        Boolean bool = this.d;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        return new gr4(a2, vc3Var, f, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr4)) {
            return false;
        }
        hr4 hr4Var = (hr4) obj;
        if (b53.x(this.a, hr4Var.a) && b53.x(this.b, hr4Var.b) && b53.x(this.c, hr4Var.c) && b53.x(this.d, hr4Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int b = ej6.b(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        int i = 0;
        if (f == null) {
            hashCode = 0;
        } else {
            hashCode = f.hashCode();
        }
        int i2 = (b + hashCode) * 31;
        Boolean bool = this.d;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        z55 z55Var = this.a;
        String str = this.b;
        Float f = this.c;
        Boolean bool = this.d;
        return "PositionedLayoutComponentDto(rect=" + z55Var + ", component=" + str + ", alpha=" + f + ", onTop=" + bool + ")";
    }
}
