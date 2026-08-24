package defpackage;

import me.magnum.melonds.domain.model.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf5  reason: default package */
/* loaded from: classes.dex */
public final class pf5 {
    @gc6("x")
    private final int a;
    @gc6("y")
    private final int b;
    @gc6("width")
    private final int c;
    @gc6("height")
    private final int d;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: pf5$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    public pf5(int i, int i2, int i3, int i4) {
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
        if (!(obj instanceof pf5)) {
            return false;
        }
        pf5 pf5Var = (pf5) obj;
        if (this.a == pf5Var.a && this.b == pf5Var.b && this.c == pf5Var.c && this.d == pf5Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + lb1.a(this.c, lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        int i4 = this.d;
        StringBuilder q = i61.q(i, i2, "RectDto(x=", ", y=", ", width=");
        q.append(i3);
        q.append(", height=");
        q.append(i4);
        q.append(")");
        return q.toString();
    }
}
