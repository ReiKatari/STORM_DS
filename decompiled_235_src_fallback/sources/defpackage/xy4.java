package defpackage;
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
    public final java.util.ArrayList i;
    public final long j;
    public final float k;
    public final long l;
    public final long m;

    public xy4(long r1, long r3, long r5, long r7, boolean r9, float r10, int r11, boolean r12, java.util.ArrayList r13, long r14, float r16, long r17, long r19) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r5
            r0.d = r7
            r0.e = r9
            r0.f = r10
            r0.g = r11
            r0.h = r12
            r0.i = r13
            r0.j = r14
            r1 = r16
            r0.k = r1
            r1 = r17
            r0.l = r1
            r1 = r19
            r0.m = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L4
            goto L8f
        L4:
            boolean r0 = r5 instanceof defpackage.xy4
            if (r0 != 0) goto La
            goto L91
        La:
            xy4 r5 = (defpackage.xy4) r5
            long r0 = r4.a
            long r2 = r5.a
            boolean r0 = defpackage.nj2.o(r0, r2)
            if (r0 != 0) goto L18
            goto L91
        L18:
            long r0 = r4.b
            long r2 = r5.b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L22
            goto L91
        L22:
            long r0 = r4.c
            long r2 = r5.c
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L2e
            goto L91
        L2e:
            long r0 = r4.d
            long r2 = r5.d
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L39
            goto L91
        L39:
            boolean r0 = r4.e
            boolean r1 = r5.e
            if (r0 == r1) goto L40
            goto L91
        L40:
            float r0 = r4.f
            float r1 = r5.f
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L4b
            goto L91
        L4b:
            int r0 = r4.g
            int r1 = r5.g
            if (r0 != r1) goto L91
            boolean r0 = r4.h
            boolean r1 = r5.h
            if (r0 == r1) goto L58
            goto L91
        L58:
            java.util.ArrayList r0 = r4.i
            java.util.ArrayList r1 = r5.i
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L63
            goto L91
        L63:
            long r0 = r4.j
            long r2 = r5.j
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L6e
            goto L91
        L6e:
            float r0 = r4.k
            float r1 = r5.k
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L79
            goto L91
        L79:
            long r0 = r4.l
            long r2 = r5.l
            boolean r0 = defpackage.jk4.c(r0, r2)
            if (r0 != 0) goto L84
            goto L91
        L84:
            long r0 = r4.m
            long r4 = r5.m
            boolean r4 = defpackage.jk4.c(r0, r4)
            if (r4 != 0) goto L8f
            goto L91
        L8f:
            r4 = 1
            return r4
        L91:
            r4 = 0
            return r4
    }

    public final int hashCode() {
            r5 = this;
            long r0 = r5.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r5.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r5.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            boolean r2 = r5.e
            int r0 = defpackage.xg6.e(r0, r2, r1)
            float r2 = r5.f
            int r0 = defpackage.xg6.a(r2, r0, r1)
            int r2 = r5.g
            int r0 = defpackage.lb1.a(r2, r0, r1)
            boolean r2 = r5.h
            int r0 = defpackage.xg6.e(r0, r2, r1)
            java.util.ArrayList r2 = r5.i
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            long r3 = r5.j
            int r0 = defpackage.i61.c(r3, r2, r1)
            float r2 = r5.k
            int r0 = defpackage.xg6.a(r2, r0, r1)
            long r2 = r5.l
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r1 = r5.m
            int r5 = java.lang.Long.hashCode(r1)
            int r5 = r5 + r0
            return r5
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PointerInputEventData(id="
            r0.<init>(r1)
            long r1 = r3.a
            java.lang.String r1 = defpackage.nj2.F(r1)
            r0.append(r1)
            java.lang.String r1 = ", uptime="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", positionOnScreen="
            r0.append(r1)
            long r1 = r3.c
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", position="
            r0.append(r1)
            long r1 = r3.d
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", down="
            r0.append(r1)
            boolean r1 = r3.e
            r0.append(r1)
            java.lang.String r1 = ", pressure="
            r0.append(r1)
            float r1 = r3.f
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            int r1 = r3.g
            java.lang.String r1 = defpackage.bz4.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", activeHover="
            r0.append(r1)
            boolean r1 = r3.h
            r0.append(r1)
            java.lang.String r1 = ", historical="
            r0.append(r1)
            java.util.ArrayList r1 = r3.i
            r0.append(r1)
            java.lang.String r1 = ", scrollDelta="
            r0.append(r1)
            long r1 = r3.j
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", scaleGestureFactor="
            r0.append(r1)
            float r1 = r3.k
            r0.append(r1)
            java.lang.String r1 = ", panGestureOffset="
            r0.append(r1)
            long r1 = r3.l
            java.lang.String r1 = defpackage.jk4.h(r1)
            r0.append(r1)
            java.lang.String r1 = ", originalEventPosition="
            r0.append(r1)
            long r1 = r3.m
            java.lang.String r3 = defpackage.jk4.h(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
