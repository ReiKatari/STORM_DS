package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vd3  reason: default package */
/* loaded from: classes.dex */
public final class vd3 {
    @r06("id")
    private final int a;
    @r06("type")
    private final String b;
    @r06("width")
    private final int c;
    @r06("height")
    private final int d;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: vd3$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public vd3(String str, int i, int i2, int i3) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
    }

    public final ud3 a() {
        return new ud3(this.a, (td3) se.t(this.b, td3.values()), this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd3)) {
            return false;
        }
        vd3 vd3Var = (vd3) obj;
        if (this.a == vd3Var.a && b53.x(this.b, vd3Var.b) && this.c == vd3Var.c && this.d == vd3Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, ej6.b(Integer.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        int i = this.a;
        String str = this.b;
        int i2 = this.c;
        int i3 = this.d;
        return "LayoutDisplayDto(id=" + i + ", type=" + str + ", width=" + i2 + ", height=" + i3 + ")";
    }
}
