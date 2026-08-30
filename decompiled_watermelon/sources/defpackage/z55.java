package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z55  reason: default package */
/* loaded from: classes.dex */
public final class z55 {
    @r06("x")
    private final int a;
    @r06("y")
    private final int b;
    @r06("width")
    private final int c;
    @r06("height")
    private final int d;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: z55$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public z55(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final Rect a() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z55)) {
            return false;
        }
        z55 z55Var = (z55) obj;
        if (this.a == z55Var.a && this.b == z55Var.b && this.c == z55Var.c && this.d == z55Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + wh1.a(this.c, wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder s = b31.s(i, i2, "RectDto(x=", ", y=", ", width=");
        s.append(i3);
        s.append(", height=");
        s.append(i4);
        s.append(")");
        return s.toString();
    }
}
