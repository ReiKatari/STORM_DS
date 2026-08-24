package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hd4  reason: default package */
/* loaded from: classes.dex */
public final class hd4 {
    public final int a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;

    public hd4(float f, float f2, float f3, int i, long j) {
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
        if (obj != null && hd4.class == obj.getClass()) {
            hd4 hd4Var = (hd4) obj;
            if (this.c == hd4Var.c && this.d == hd4Var.d && this.b == hd4Var.b && this.a == hd4Var.a && this.e == hd4Var.e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + lb1.a(this.a, xg6.a(this.b, xg6.a(this.d, Float.hashCode(this.c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "NavigationEvent(touchX=" + this.c + ", touchY=" + this.d + ", progress=" + this.b + ", swipeEdge=" + this.a + ", frameTimeMillis=" + this.e + ')';
    }
}
