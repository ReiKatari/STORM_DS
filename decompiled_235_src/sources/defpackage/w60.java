package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w60  reason: default package */
/* loaded from: classes.dex */
public final class w60 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new w60(0, 0, 0, 0);
    }

    public w60(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            i.f(lb1.j("top must be less than or equal to bottom, top: ", i2, i4, ", bottom: "));
            throw null;
        }
        i.f(lb1.j("Left must be less than or equal to right, left: ", i, i3, ", right: "));
        throw null;
    }

    public final int a() {
        return this.d - this.b;
    }

    public final int b() {
        return this.c - this.a;
    }

    public final Rect c() {
        return new Rect(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!w60.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        w60 w60Var = (w60) obj;
        if (this.a == w60Var.a && this.b == w60Var.b && this.c == w60Var.c && this.d == w60Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(w60.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return lb1.o(sb, this.d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public w60(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
