package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jp4  reason: default package */
/* loaded from: classes.dex */
public final class jp4 {
    @r06("x")
    private final int a;
    @r06("y")
    private final int b;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: jp4$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public jp4(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final ip4 a() {
        return new ip4(this.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jp4)) {
            return false;
        }
        jp4 jp4Var = (jp4) obj;
        if (this.a == jp4Var.a && this.b == jp4Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        return "PointDto(x=" + i + ", y=" + i2 + ")";
    }
}
