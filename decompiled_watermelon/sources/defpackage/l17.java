package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l17  reason: default package */
/* loaded from: classes.dex */
public final class l17 {
    @r06("mainScreenLayoutDto")
    private final ov5 a;
    @r06("secondaryScreenLayoutDto")
    private final ov5 b;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: l17$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public l17(ov5 ov5Var, ov5 ov5Var2) {
        this.a = ov5Var;
        this.b = ov5Var2;
    }

    public final k17 a() {
        return new k17(this.a.a(), this.b.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l17)) {
            return false;
        }
        l17 l17Var = (l17) obj;
        if (b53.x(this.a, l17Var.a) && b53.x(this.b, l17Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        ov5 ov5Var = this.a;
        ov5 ov5Var2 = this.b;
        return "UILayoutDto(mainScreenLayout=" + ov5Var + ", secondaryScreenLayout=" + ov5Var2 + ")";
    }
}
