package defpackage;
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
    public final java.util.ArrayList m;
    public final long n;
    public boolean o;
    public boolean p;
    public defpackage.vy4 q;

    public vy4(long r22, long r24, long r26, boolean r28, float r29, long r30, long r32, boolean r34, int r35, java.util.ArrayList r36, long r37, float r39, long r40, long r42) {
            r21 = this;
            r14 = 0
            r0 = r21
            r1 = r22
            r3 = r24
            r5 = r26
            r7 = r28
            r8 = r29
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r35
            r16 = r37
            r18 = r39
            r19 = r40
            r0.<init>(r1, r3, r5, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19)
            r1 = r36
            r0.m = r1
            r1 = r42
            r0.n = r1
            return
    }

    public vy4(long r1, long r3, long r5, boolean r7, float r8, long r9, long r11, boolean r13, boolean r14, int r15, long r16, float r18, long r19) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r8
            r0.f = r9
            r0.g = r11
            r0.h = r13
            r1 = r15
            r0.i = r1
            r1 = r16
            r0.j = r1
            r1 = r18
            r0.k = r1
            r1 = r19
            r0.l = r1
            r1 = 0
            r0.n = r1
            r0.o = r14
            r0.p = r14
            return
    }

    public final void a() {
            r1 = this;
            vy4 r0 = r1.q
            if (r0 != 0) goto La
            r0 = 1
            r1.o = r0
            r1.p = r0
            return
        La:
            if (r0 == 0) goto Lf
            r0.a()
        Lf:
            return
    }

    public final java.util.List b() {
            r0 = this;
            java.util.ArrayList r0 = r0.m
            if (r0 != 0) goto L6
            yt1 r0 = defpackage.yt1.A
        L6:
            return r0
    }

    public final boolean c() {
            r1 = this;
            vy4 r0 = r1.q
            if (r0 == 0) goto L9
            boolean r1 = r0.c()
            return r1
        L9:
            boolean r0 = r1.o
            if (r0 != 0) goto L14
            boolean r1 = r1.p
            if (r1 == 0) goto L12
            goto L14
        L12:
            r1 = 0
            return r1
        L14:
            r1 = 1
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerInputChange(id="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.nj2.F(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptimeMillis="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.c
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", pressed="
            r0.append(r1)
            boolean r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", previousUptimeMillis="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", previousPosition="
            r0.append(r1)
            long r1 = r3.g
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", previousPressed="
            r0.append(r1)
            boolean r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", isConsumed="
            r0.append(r1)
            boolean r1 = r3.c()
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.i
            java.lang.String r1 = defpackage.bz4.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", historical="
            r0.append(r1)
            java.util.List r1 = r3.b()
            r0.append(r1)
            java.lang.String r1 = ", scrollDelta="
            r0.append(r1)
            long r1 = r3.j
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleFactor="
            r0.append(r1)
            float r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", panOffset="
            r0.append(r1)
            long r1 = r3.l
            java.lang.String r3 = defpackage.jk4.h(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
