package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t40  reason: default package */
/* loaded from: classes.dex */
public final class t40 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        new t40(0, 0, 0, 0);
    }

    public t40(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        if (i <= i3) {
            if (i2 <= i4) {
                return;
            }
            i.g(wh1.f(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
            throw null;
        }
        i.g(wh1.f(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
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
        if (!t40.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        t40 t40Var = (t40) obj;
        if (this.a == t40Var.a && this.b == t40Var.b && this.c == t40Var.c && this.d == t40Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t40.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.a);
        sb.append(',');
        sb.append(this.b);
        sb.append(',');
        sb.append(this.c);
        sb.append(',');
        return wh1.m(sb, this.d, "] }");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public t40(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
