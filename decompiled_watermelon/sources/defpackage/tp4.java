package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tp4  reason: default package */
/* loaded from: classes.dex */
public final class tp4 {
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

    public tp4(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
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
            if (obj instanceof tp4) {
                tp4 tp4Var = (tp4) obj;
                if (cg2.y(this.a, tp4Var.a) && this.b == tp4Var.b && mb4.b(this.c, tp4Var.c) && mb4.b(this.d, tp4Var.d) && this.e == tp4Var.e && Float.compare(this.f, tp4Var.f) == 0 && this.g == tp4Var.g && this.h == tp4Var.h && this.i.equals(tp4Var.i) && mb4.b(this.j, tp4Var.j) && Float.compare(this.k, tp4Var.k) == 0 && mb4.b(this.l, tp4Var.l) && mb4.b(this.m, tp4Var.m)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(wh1.a(this.g, ej6.a(this.f, ej6.c(b31.c(this.d, b31.c(this.c, b31.c(this.b, Long.hashCode(this.a) * 31, 31), 31), 31), this.e, 31), 31), 31), this.h, 31);
        return Long.hashCode(this.m) + b31.c(this.l, ej6.a(this.k, b31.c(this.j, (this.i.hashCode() + c) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) cg2.V(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) mb4.g(this.c)) + ", position=" + ((Object) mb4.g(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) xp4.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) mb4.g(this.j)) + ", scaleGestureFactor=" + this.k + ", panGestureOffset=" + ((Object) mb4.g(this.l)) + ", originalEventPosition=" + ((Object) mb4.g(this.m)) + ')';
    }
}
