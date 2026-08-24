package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw7  reason: default package */
/* loaded from: classes.dex */
public final class jw7 {
    public final java.util.UUID a;
    public final defpackage.iw7 b;
    public final java.util.HashSet c;
    public final defpackage.xb1 d;
    public final defpackage.xb1 e;
    public final int f;
    public final int g;
    public final defpackage.p21 h;
    public final long i;
    public final defpackage.hw7 j;
    public final long k;
    public final int l;

    public jw7(java.util.UUID r1, defpackage.iw7 r2, java.util.HashSet r3, defpackage.xb1 r4, defpackage.xb1 r5, int r6, int r7, defpackage.p21 r8, long r9, defpackage.hw7 r11, long r12, int r14) {
            r0 = this;
            r2.getClass()
            r4.getClass()
            r5.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r11
            r0.k = r12
            r0.l = r14
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            r4 = 1
            return r4
        L4:
            if (r5 == 0) goto L85
            java.lang.Class<jw7> r0 = defpackage.jw7.class
            java.lang.Class r1 = r5.getClass()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14
            goto L85
        L14:
            jw7 r5 = (defpackage.jw7) r5
            int r0 = r4.f
            int r1 = r5.f
            if (r0 == r1) goto L1e
            goto L85
        L1e:
            int r0 = r4.g
            int r1 = r5.g
            if (r0 == r1) goto L25
            goto L85
        L25:
            java.util.UUID r0 = r4.a
            java.util.UUID r1 = r5.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L30
            goto L85
        L30:
            iw7 r0 = r4.b
            iw7 r1 = r5.b
            if (r0 == r1) goto L37
            goto L85
        L37:
            xb1 r0 = r4.d
            xb1 r1 = r5.d
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L42
            goto L85
        L42:
            p21 r0 = r4.h
            p21 r1 = r5.h
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4d
            goto L85
        L4d:
            long r0 = r4.i
            long r2 = r5.i
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L56
            goto L85
        L56:
            hw7 r0 = r4.j
            hw7 r1 = r5.j
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 != 0) goto L61
            goto L85
        L61:
            long r0 = r4.k
            long r2 = r5.k
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L6a
            goto L85
        L6a:
            int r0 = r4.l
            int r1 = r5.l
            if (r0 == r1) goto L71
            goto L85
        L71:
            java.util.HashSet r0 = r4.c
            java.util.HashSet r1 = r5.c
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L7c
            goto L85
        L7c:
            xb1 r4 = r4.e
            xb1 r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            return r4
        L85:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            java.util.UUID r0 = r5.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            iw7 r2 = r5.b
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            xb1 r0 = r5.d
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.util.HashSet r2 = r5.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            xb1 r0 = r5.e
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r5.f
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r5.g
            int r0 = r0 + r2
            int r0 = r0 * r1
            p21 r2 = r5.h
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.i
            int r0 = defpackage.i61.c(r3, r2, r1)
            hw7 r2 = r5.j
            if (r2 == 0) goto L48
            int r2 = r2.hashCode()
            goto L49
        L48:
            r2 = 0
        L49:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r5.k
            int r0 = defpackage.i61.c(r2, r0, r1)
            int r5 = r5.l
            int r5 = java.lang.Integer.hashCode(r5)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WorkInfo{id='"
            r0.<init>(r1)
            java.util.UUID r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = "', state="
            r0.append(r1)
            iw7 r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", outputData="
            r0.append(r1)
            xb1 r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", tags="
            r0.append(r1)
            java.util.HashSet r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", progress="
            r0.append(r1)
            xb1 r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", runAttemptCount="
            r0.append(r1)
            int r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", generation="
            r0.append(r1)
            int r1 = r3.g
            r0.append(r1)
            java.lang.String r1 = ", constraints="
            r0.append(r1)
            p21 r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", initialDelayMillis="
            r0.append(r1)
            long r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", periodicityInfo="
            r0.append(r1)
            hw7 r1 = r3.j
            r0.append(r1)
            java.lang.String r1 = ", nextScheduleTimeMillis="
            r0.append(r1)
            long r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = "}, stopReason="
            r0.append(r1)
            int r3 = r3.l
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
