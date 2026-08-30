package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xd3  reason: default package */
/* loaded from: classes.dex */
public final class xd3 {
    @r06("mainScreenDisplay")
    private final vd3 a;
    @r06("secondaryScreenDisplay")
    private final vd3 b;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: xd3$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public xd3(vd3 vd3Var, vd3 vd3Var2) {
        this.a = vd3Var;
        this.b = vd3Var2;
    }

    public final wd3 a() {
        ud3 ud3Var;
        ud3 a2 = this.a.a();
        vd3 vd3Var = this.b;
        if (vd3Var != null) {
            ud3Var = vd3Var.a();
        } else {
            ud3Var = null;
        }
        return new wd3(a2, ud3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xd3)) {
            return false;
        }
        xd3 xd3Var = (xd3) obj;
        if (b53.x(this.a, xd3Var.a) && b53.x(this.b, xd3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        vd3 vd3Var = this.b;
        if (vd3Var == null) {
            hashCode = 0;
        } else {
            hashCode = vd3Var.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        vd3 vd3Var = this.a;
        vd3 vd3Var2 = this.b;
        return "LayoutDisplayPairDto(mainScreenDisplay=" + vd3Var + ", secondaryScreenDisplay=" + vd3Var2 + ")";
    }
}
