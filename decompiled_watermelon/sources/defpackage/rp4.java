package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rp4  reason: default package */
/* loaded from: classes.dex */
public final class rp4 {
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
    public rp4 q;

    public rp4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
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
        rp4 rp4Var = this.q;
        if (rp4Var == null) {
            this.o = true;
            this.p = true;
        } else if (rp4Var != null) {
            rp4Var.a();
        }
    }

    public final boolean b() {
        rp4 rp4Var = this.q;
        if (rp4Var != null) {
            return rp4Var.b();
        }
        if (!this.o && !this.p) {
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) cg2.V(this.a));
        sb.append(", uptimeMillis=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append((Object) mb4.g(this.c));
        sb.append(", pressed=");
        sb.append(this.d);
        sb.append(", pressure=");
        sb.append(this.e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f);
        sb.append(", previousPosition=");
        sb.append((Object) mb4.g(this.g));
        sb.append(", previousPressed=");
        sb.append(this.h);
        sb.append(", isConsumed=");
        sb.append(b());
        sb.append(", type=");
        sb.append((Object) xp4.a(this.i));
        sb.append(", historical=");
        Object obj = this.m;
        if (obj == null) {
            obj = pp1.A;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) mb4.g(this.j));
        sb.append(", scaleFactor=");
        sb.append(this.k);
        sb.append(", panOffset=");
        sb.append((Object) mb4.g(this.l));
        sb.append(')');
        return sb.toString();
    }

    public rp4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.m = arrayList;
        this.n = j8;
    }
}
