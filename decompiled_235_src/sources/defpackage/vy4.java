package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vy4  reason: default package */
/* loaded from: classes.dex */
public final class vy4 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final float e;
    public final long f;
    public final long g;
    public final boolean h;
    public final int i;
    public final long j;
    public final float k;
    public final long l;
    public final ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public vy4 q;

    public vy4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = f;
        this.f = j4;
        this.g = j5;
        this.h = z2;
        this.i = i;
        this.j = j6;
        this.k = f2;
        this.l = j7;
        this.n = 0L;
        this.o = z3;
        this.p = z3;
    }

    public final void a() {
        vy4 vy4Var = this.q;
        if (vy4Var == null) {
            this.o = true;
            this.p = true;
        } else if (vy4Var != null) {
            vy4Var.a();
        }
    }

    public final List b() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return yt1.A;
        }
        return arrayList;
    }

    public final boolean c() {
        vy4 vy4Var = this.q;
        if (vy4Var != null) {
            return vy4Var.c();
        }
        if (!this.o && !this.p) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "PointerInputChange(id=" + ((Object) nj2.F(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) jk4.h(this.c)) + ", pressed=" + this.d + ", pressure=" + this.e + ", previousUptimeMillis=" + this.f + ", previousPosition=" + ((Object) jk4.h(this.g)) + ", previousPressed=" + this.h + ", isConsumed=" + c() + ", type=" + ((Object) bz4.a(this.i)) + ", historical=" + b() + ", scrollDelta=" + ((Object) jk4.h(this.j)) + ", scaleFactor=" + this.k + ", panOffset=" + ((Object) jk4.h(this.l)) + ')';
    }

    public vy4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
