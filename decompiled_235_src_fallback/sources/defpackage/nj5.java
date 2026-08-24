package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nj5  reason: default package */
/* loaded from: classes.dex */
public final class nj5 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;

    public /* synthetic */ nj5() {
            r14 = this;
            r12 = 0
            r13 = 524287(0x7ffff, float:7.34683E-40)
            r1 = -1
            r2 = -1
            r3 = -1
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
    }

    public nj5(int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
            r0 = this;
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
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.nj5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nj5 r5 = (defpackage.nj5) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L21
            return r2
        L21:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L28
            return r2
        L28:
            int r1 = r4.e
            int r3 = r5.e
            if (r1 == r3) goto L2f
            return r2
        L2f:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L36
            return r2
        L36:
            int r1 = r4.g
            int r3 = r5.g
            if (r1 == r3) goto L3d
            return r2
        L3d:
            int r1 = r4.h
            int r3 = r5.h
            if (r1 == r3) goto L44
            return r2
        L44:
            int r1 = r4.i
            int r3 = r5.i
            if (r1 == r3) goto L4b
            return r2
        L4b:
            int r1 = r4.j
            int r3 = r5.j
            if (r1 == r3) goto L52
            return r2
        L52:
            int r1 = r4.k
            int r3 = r5.k
            if (r1 == r3) goto L59
            return r2
        L59:
            int r1 = r4.l
            int r3 = r5.l
            if (r1 == r3) goto L60
            return r2
        L60:
            int r4 = r4.m
            int r5 = r5.m
            if (r4 == r5) goto L67
            return r2
        L67:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.b
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.d
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.e
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.f
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.g
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.h
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.i
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.j
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.k
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.l
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.m
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r15 = this;
            int r0 = r15.a
            int r1 = r15.b
            int r2 = r15.c
            int r3 = r15.d
            int r4 = r15.e
            int r5 = r15.f
            int r6 = r15.g
            int r7 = r15.h
            int r8 = r15.i
            int r9 = r15.j
            int r10 = r15.k
            int r11 = r15.l
            int r15 = r15.m
            java.lang.String r12 = ", subForcedMode="
            java.lang.String r13 = ", topForcedCompMode="
            java.lang.String r14 = "Renderer2DDebugControlState(mainForcedMode="
            java.lang.StringBuilder r0 = defpackage.i61.q(r0, r1, r14, r12, r13)
            java.lang.String r1 = ", bottomForcedCompMode="
            java.lang.String r12 = ", disabledMainBgMask="
            defpackage.lb1.x(r0, r2, r1, r3, r12)
            java.lang.String r1 = ", disabledSubBgMask="
            java.lang.String r2 = ", disabledMainBgPriorityMask="
            defpackage.lb1.x(r0, r4, r1, r5, r2)
            java.lang.String r1 = ", disabledSubBgPriorityMask="
            java.lang.String r2 = ", disabledMainObjPriorityMask="
            defpackage.lb1.x(r0, r6, r1, r7, r2)
            java.lang.String r1 = ", disabledSubObjPriorityMask="
            java.lang.String r2 = ", disabledMainObjOrderMask="
            defpackage.lb1.x(r0, r8, r1, r9, r2)
            java.lang.String r1 = ", disabledSubObjOrderMask="
            java.lang.String r2 = ", featureMask="
            defpackage.lb1.x(r0, r10, r1, r11, r2)
            java.lang.String r1 = ")"
            java.lang.String r15 = defpackage.lb1.o(r0, r15, r1)
            return r15
    }
}
