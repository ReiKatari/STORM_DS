package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy4  reason: default package */
/* loaded from: classes.dex */
public final class xy4 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public xy4(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = f2;
        this.l = j6;
        this.m = j7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xy4) {
                xy4 xy4Var = (xy4) obj;
                if (nj2.o(this.a, xy4Var.a) && this.b == xy4Var.b && jk4.c(this.c, xy4Var.c) && jk4.c(this.d, xy4Var.d) && this.e == xy4Var.e && Float.compare(this.f, xy4Var.f) == 0 && this.g == xy4Var.g && this.h == xy4Var.h && this.i.equals(xy4Var.i) && jk4.c(this.j, xy4Var.j) && Float.compare(this.k, xy4Var.k) == 0 && jk4.c(this.l, xy4Var.l) && jk4.c(this.m, xy4Var.m)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(lb1.a(this.g, xg6.a(this.f, xg6.e(i61.c(this.d, i61.c(this.c, i61.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), 31), 31), this.h, 31);
        return Long.hashCode(this.m) + i61.c(this.l, xg6.a(this.k, i61.c(this.j, (this.i.hashCode() + e) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) nj2.F(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) jk4.h(this.c)) + ", position=" + ((Object) jk4.h(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) bz4.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) jk4.h(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) jk4.h(this.l)) + ", originalEventPosition=" + ((Object) jk4.h(this.m)) + ')';
    }
}
