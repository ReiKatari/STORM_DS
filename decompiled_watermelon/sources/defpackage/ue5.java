package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ue5  reason: default package */
/* loaded from: classes.dex */
public final class ue5 {
    public final String a;
    public final lf5 b;
    public final int c;
    public final long d;
    public final Map e;
    public final boolean f;

    public ue5(String str, lf5 lf5Var, int i, long j, Map map, boolean z) {
        lf5Var.getClass();
        map.getClass();
        this.a = str;
        this.b = lf5Var;
        this.c = i;
        this.d = j;
        this.e = map;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue5)) {
            return false;
        }
        ue5 ue5Var = (ue5) obj;
        if (b53.x(this.a, ue5Var.a) && this.b == ue5Var.b && this.c == ue5Var.c && this.d == ue5Var.d && b53.x(this.e, ue5Var.e) && this.f == ue5Var.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.b.hashCode();
        int c = b31.c(this.d, wh1.a(this.c, (hashCode2 + (hashCode * 31)) * 31, 31), 31);
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + c) * 31);
    }

    public final String toString() {
        return "RetroArchShaderConfiguration(presetPath=" + this.a + ", sourceResolution=" + this.b + ", passCount=" + this.c + ", sourceBytes=" + this.d + ", parameterOverrides=" + this.e + ", clearHistory=" + this.f + ")";
    }
}
