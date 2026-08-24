package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw7  reason: default package */
/* loaded from: classes.dex */
public final class xw7 {
    public final java.lang.String a;
    public final defpackage.iw7 b;
    public final defpackage.xb1 c;
    public final long d;
    public final long e;
    public final long f;
    public final defpackage.p21 g;
    public final int h;
    public final defpackage.w10 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final java.util.List p;
    public final java.util.List q;

    public xw7(java.lang.String r1, defpackage.iw7 r2, defpackage.xb1 r3, long r4, long r6, long r8, defpackage.p21 r10, int r11, defpackage.w10 r12, long r13, long r15, int r17, int r18, long r19, int r21, java.util.List r22, java.util.List r23) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r12.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            r0.f = r8
            r0.g = r10
            r0.h = r11
            r0.i = r12
            r0.j = r13
            r1 = r15
            r0.k = r1
            r1 = r17
            r0.l = r1
            r1 = r18
            r0.m = r1
            r1 = r19
            r0.n = r1
            r1 = r21
            r0.o = r1
            r1 = r22
            r0.p = r1
            r1 = r23
            r0.q = r1
            return
    }

    public final defpackage.jw7 a() {
            r27 = this;
            r0 = r27
            java.util.List r1 = r0.q
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 != 0) goto L13
            java.lang.Object r1 = r1.get(r3)
            xb1 r1 = (defpackage.xb1) r1
        L11:
            r9 = r1
            goto L16
        L13:
            xb1 r1 = defpackage.xb1.b
            goto L11
        L16:
            jw7 r4 = new jw7
            java.lang.String r1 = r0.a
            java.util.UUID r5 = java.util.UUID.fromString(r1)
            r5.getClass()
            java.util.HashSet r7 = new java.util.HashSet
            java.util.List r1 = r0.p
            r7.<init>(r1)
            long r1 = r0.e
            r10 = 0
            int r6 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r6 == 0) goto L38
            hw7 r8 = new hw7
            long r10 = r0.f
            r8.<init>(r1, r10)
            goto L39
        L38:
            r8 = 0
        L39:
            iw7 r10 = defpackage.iw7.ENQUEUED
            int r11 = r0.h
            long r13 = r0.d
            iw7 r12 = r0.b
            if (r12 != r10) goto L74
            fa6 r15 = defpackage.yw7.z
            r15 = 1
            if (r12 != r10) goto L4c
            if (r11 <= 0) goto L4c
            r10 = r15
            goto L4d
        L4c:
            r10 = r3
        L4d:
            if (r6 == 0) goto L54
            r18 = r15
        L51:
            r23 = r1
            goto L57
        L54:
            r18 = r3
            goto L51
        L57:
            long r1 = r0.f
            r21 = r1
            long r1 = r0.n
            w10 r12 = r0.i
            r19 = r13
            long r13 = r0.j
            r25 = r1
            long r1 = r0.k
            int r3 = r0.l
            r15 = r1
            r17 = r3
            long r1 = defpackage.vw7.c(r10, r11, r12, r13, r15, r17, r18, r19, r21, r23, r25)
            r10 = r11
        L71:
            r16 = r1
            goto L7d
        L74:
            r10 = r11
            r19 = r13
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L71
        L7d:
            int r1 = r0.o
            iw7 r6 = r0.b
            r15 = r8
            xb1 r8 = r0.c
            int r11 = r0.m
            p21 r12 = r0.g
            r18 = r1
            r13 = r19
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r16, r18)
            return r4
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto Laa
        L4:
            boolean r0 = r5 instanceof defpackage.xw7
            if (r0 != 0) goto La
            goto La8
        La:
            xw7 r5 = (defpackage.xw7) r5
            java.lang.String r0 = r4.a
            java.lang.String r1 = r5.a
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L18
            goto La8
        L18:
            iw7 r0 = r4.b
            iw7 r1 = r5.b
            if (r0 == r1) goto L20
            goto La8
        L20:
            xb1 r0 = r4.c
            xb1 r1 = r5.c
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L2c
            goto La8
        L2c:
            long r0 = r4.d
            long r2 = r5.d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L36
            goto La8
        L36:
            long r0 = r4.e
            long r2 = r5.e
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L40
            goto La8
        L40:
            long r0 = r4.f
            long r2 = r5.f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4a
            goto La8
        L4a:
            p21 r0 = r4.g
            p21 r1 = r5.g
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
            goto La8
        L55:
            int r0 = r4.h
            int r1 = r5.h
            if (r0 == r1) goto L5c
            goto La8
        L5c:
            w10 r0 = r4.i
            w10 r1 = r5.i
            if (r0 == r1) goto L63
            goto La8
        L63:
            long r0 = r4.j
            long r2 = r5.j
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6c
            goto La8
        L6c:
            long r0 = r4.k
            long r2 = r5.k
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            goto La8
        L75:
            int r0 = r4.l
            int r1 = r5.l
            if (r0 == r1) goto L7c
            goto La8
        L7c:
            int r0 = r4.m
            int r1 = r5.m
            if (r0 == r1) goto L83
            goto La8
        L83:
            long r0 = r4.n
            long r2 = r5.n
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L8c
            goto La8
        L8c:
            int r0 = r4.o
            int r1 = r5.o
            if (r0 == r1) goto L93
            goto La8
        L93:
            java.util.List r0 = r4.p
            java.util.List r1 = r5.p
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L9e
            goto La8
        L9e:
            java.util.List r4 = r4.q
            java.util.List r5 = r5.q
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto Laa
        La8:
            r4 = 0
            return r4
        Laa:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            iw7 r2 = r5.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            xb1 r0 = r5.c
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r5.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.f
            int r0 = defpackage.i61.c(r2, r0, r1)
            p21 r2 = r5.g
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r5.h
            int r0 = defpackage.lb1.a(r0, r2, r1)
            w10 r2 = r5.i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.j
            int r0 = defpackage.i61.c(r3, r2, r1)
            long r2 = r5.k
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r2 = r5.l
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r5.m
            int r0 = defpackage.lb1.a(r2, r0, r1)
            long r2 = r5.n
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r2 = r5.o
            int r0 = defpackage.lb1.a(r2, r0, r1)
            java.util.List r2 = r5.p
            int r0 = defpackage.i61.b(r0, r2, r1)
            java.util.List r5 = r5.q
            int r5 = r5.hashCode()
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WorkInfoPojo(id="
            r0.<init>(r1)
            java.lang.String r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", state="
            r0.append(r1)
            iw7 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", output="
            r0.append(r1)
            xb1 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", initialDelay="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", intervalDuration="
            r0.append(r1)
            long r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", flexDuration="
            r0.append(r1)
            long r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            p21 r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", runAttemptCount="
            r0.append(r1)
            int r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", backoffPolicy="
            r0.append(r1)
            w10 r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", backoffDelayDuration="
            r0.append(r1)
            long r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", lastEnqueueTime="
            r0.append(r1)
            long r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", periodCount="
            r0.append(r1)
            int r1 = r3.l
            r0.append(r1)
            java.lang.String r1 = ", generation="
            r0.append(r1)
            int r1 = r3.m
            r0.append(r1)
            java.lang.String r1 = ", nextScheduleTimeOverride="
            r0.append(r1)
            long r1 = r3.n
            r0.append(r1)
            java.lang.String r1 = ", stopReason="
            r0.append(r1)
            int r1 = r3.o
            r0.append(r1)
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.List r1 = r3.p
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            java.util.List r3 = r3.q
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
