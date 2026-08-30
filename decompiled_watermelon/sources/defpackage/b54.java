package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b54  reason: default package */
/* loaded from: classes.dex */
public final class b54 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public b54(int i, float f, float f2, float f3, long j) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b54.class == obj.getClass()) {
            b54 b54Var = (b54) obj;
            if (this.c == b54Var.c && this.d == b54Var.d && this.b == b54Var.b && this.a == b54Var.a && this.e == b54Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + wh1.a(this.a, ej6.a(this.b, ej6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
