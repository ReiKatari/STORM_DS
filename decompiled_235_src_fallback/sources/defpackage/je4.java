package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je4  reason: default package */
/* loaded from: classes.dex */
public final class je4 {
    public android.view.ViewParent a;
    public android.view.ViewParent b;
    public final android.view.ViewGroup c;
    public boolean d;
    public int[] e;

    public je4(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    public final boolean a(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.d
            r1 = 0
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r2.e(r1)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = r2.c
            boolean r2 = r0.onNestedFling(r2, r3, r4, r5)     // Catch: java.lang.AbstractMethodError -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " does not implement interface method onNestedFling"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r3, r2)
        L2b:
            return r1
    }

    public final boolean b(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.d
            r1 = 0
            if (r0 == 0) goto L2b
            android.view.ViewParent r0 = r2.e(r1)
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = r2.c
            boolean r2 = r0.onNestedPreFling(r2, r3, r4)     // Catch: java.lang.AbstractMethodError -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ViewParent "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " does not implement interface method onNestedPreFling"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "ViewParentCompat"
            android.util.Log.e(r4, r3, r2)
        L2b:
            return r1
    }

    public final boolean c(int r12, int r13, int r14, int[] r15, int[] r16) {
            r11 = this;
            r6 = r16
            boolean r1 = r11.d
            r7 = 0
            if (r1 == 0) goto L87
            android.view.ViewParent r1 = r11.e(r14)
            if (r1 != 0) goto Lf
            goto L87
        Lf:
            r8 = 1
            if (r12 != 0) goto L1c
            if (r13 == 0) goto L15
            goto L1c
        L15:
            if (r6 == 0) goto L87
            r6[r7] = r7
            r6[r8] = r7
            return r7
        L1c:
            android.view.ViewGroup r2 = r11.c
            if (r6 == 0) goto L2a
            r2.getLocationInWindow(r6)
            r3 = r6[r7]
            r4 = r6[r8]
            r9 = r3
            r10 = r4
            goto L2c
        L2a:
            r9 = r7
            r10 = r9
        L2c:
            if (r15 != 0) goto L3b
            int[] r3 = r11.e
            if (r3 != 0) goto L37
            r3 = 2
            int[] r3 = new int[r3]
            r11.e = r3
        L37:
            int[] r0 = r11.e
            r4 = r0
            goto L3c
        L3b:
            r4 = r15
        L3c:
            r4[r7] = r7
            r4[r8] = r7
            boolean r0 = r1 instanceof defpackage.ke4
            if (r0 == 0) goto L50
            r0 = r1
            ke4 r0 = (defpackage.ke4) r0
            r3 = r13
            r5 = r14
            r1 = r2
            r2 = r12
            r0.f(r1, r2, r3, r4, r5)
            r2 = r1
            goto L6f
        L50:
            if (r14 != 0) goto L6f
            r1.onNestedPreScroll(r2, r12, r13, r4)     // Catch: java.lang.AbstractMethodError -> L56
            goto L6f
        L56:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "ViewParent "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = " does not implement interface method onNestedPreScroll"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "ViewParentCompat"
            android.util.Log.e(r3, r1, r0)
        L6f:
            if (r6 == 0) goto L7e
            r2.getLocationInWindow(r6)
            r0 = r6[r7]
            int r0 = r0 - r9
            r6[r7] = r0
            r0 = r6[r8]
            int r0 = r0 - r10
            r6[r8] = r0
        L7e:
            r0 = r4[r7]
            if (r0 != 0) goto L86
            r0 = r4[r8]
            if (r0 == 0) goto L87
        L86:
            r7 = r8
        L87:
            return r7
    }

    public final boolean d(int r15, int r16, int r17, int r18, int[] r19, int r20, int[] r21) {
            r14 = this;
            r1 = r19
            r8 = r20
            boolean r0 = r14.d
            r10 = 0
            if (r0 == 0) goto Lae
            android.view.ViewParent r2 = r14.e(r8)
            if (r2 != 0) goto L11
            goto Lae
        L11:
            r11 = 1
            if (r15 != 0) goto L22
            if (r16 != 0) goto L22
            if (r17 != 0) goto L22
            if (r18 == 0) goto L1b
            goto L22
        L1b:
            if (r1 == 0) goto Lae
            r1[r10] = r10
            r1[r11] = r10
            return r10
        L22:
            android.view.ViewGroup r3 = r14.c
            if (r1 == 0) goto L30
            r3.getLocationInWindow(r1)
            r0 = r1[r10]
            r4 = r1[r11]
            r12 = r0
            r13 = r4
            goto L32
        L30:
            r12 = r10
            r13 = r12
        L32:
            if (r21 != 0) goto L45
            int[] r0 = r14.e
            if (r0 != 0) goto L3d
            r0 = 2
            int[] r0 = new int[r0]
            r14.e = r0
        L3d:
            int[] r14 = r14.e
            r14[r10] = r10
            r14[r11] = r10
            r9 = r14
            goto L47
        L45:
            r9 = r21
        L47:
            boolean r14 = r2 instanceof defpackage.le4
            if (r14 == 0) goto L58
            le4 r2 = (defpackage.le4) r2
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2.a(r3, r4, r5, r6, r7, r8, r9)
            goto L9e
        L58:
            r14 = r9[r10]
            int r14 = r14 + r17
            r9[r10] = r14
            r14 = r9[r11]
            int r14 = r14 + r18
            r9[r11] = r14
            boolean r14 = r2 instanceof defpackage.ke4
            if (r14 == 0) goto L77
            ke4 r2 = (defpackage.ke4) r2
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r20
            r2.b(r3, r4, r5, r6, r7, r8)
            goto L9e
        L77:
            if (r20 != 0) goto L9e
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r2.onNestedScroll(r3, r4, r5, r6, r7)     // Catch: java.lang.AbstractMethodError -> L84
            goto L9e
        L84:
            r0 = move-exception
            r14 = r0
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "ViewParent "
            r15.<init>(r0)
            r15.append(r2)
            java.lang.String r0 = " does not implement interface method onNestedScroll"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.String r0 = "ViewParentCompat"
            android.util.Log.e(r0, r15, r14)
        L9e:
            if (r1 == 0) goto Lad
            r3.getLocationInWindow(r1)
            r14 = r1[r10]
            int r14 = r14 - r12
            r1[r10] = r14
            r14 = r1[r11]
            int r14 = r14 - r13
            r1[r11] = r14
        Lad:
            return r11
        Lae:
            return r10
    }

    public final android.view.ViewParent e(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            android.view.ViewParent r1 = r1.b
            return r1
        La:
            android.view.ViewParent r1 = r1.a
            return r1
    }

    public final boolean f(int r1) {
            r0 = this;
            android.view.ViewParent r0 = r0.e(r1)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean g(int r12, int r13) {
            r11 = this;
            boolean r0 = r11.f(r13)
            r1 = 1
            if (r0 == 0) goto L9
            goto L73
        L9:
            boolean r0 = r11.d
            r2 = 0
            if (r0 == 0) goto L80
            android.view.ViewGroup r0 = r11.c
            android.view.ViewParent r3 = r0.getParent()
            r4 = r0
        L15:
            if (r3 == 0) goto L80
            boolean r5 = r3 instanceof defpackage.ke4
            java.lang.String r6 = "ViewParent "
            java.lang.String r7 = "ViewParentCompat"
            if (r5 == 0) goto L27
            r8 = r3
            ke4 r8 = (defpackage.ke4) r8
            boolean r8 = r8.c(r4, r0, r12, r13)
            goto L44
        L27:
            if (r13 != 0) goto L43
            boolean r8 = r3.onStartNestedScroll(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L2e
            goto L44
        L2e:
            r8 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r3)
            java.lang.String r10 = " does not implement interface method onStartNestedScroll"
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r7, r9, r8)
        L43:
            r8 = r2
        L44:
            if (r8 == 0) goto L74
            if (r13 == 0) goto L4e
            if (r13 == r1) goto L4b
            goto L50
        L4b:
            r11.b = r3
            goto L50
        L4e:
            r11.a = r3
        L50:
            if (r5 == 0) goto L58
            ke4 r3 = (defpackage.ke4) r3
            r3.d(r4, r0, r12, r13)
            goto L73
        L58:
            if (r13 != 0) goto L73
            r3.onNestedScrollAccepted(r4, r0, r12)     // Catch: java.lang.AbstractMethodError -> L5e
            goto L73
        L5e:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r6)
            r12.append(r3)
            java.lang.String r13 = " does not implement interface method onNestedScrollAccepted"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.util.Log.e(r7, r12, r11)
        L73:
            return r1
        L74:
            boolean r5 = r3 instanceof android.view.View
            if (r5 == 0) goto L7b
            r4 = r3
            android.view.View r4 = (android.view.View) r4
        L7b:
            android.view.ViewParent r3 = r3.getParent()
            goto L15
        L80:
            return r2
    }

    public final void h(int r5) {
            r4 = this;
            android.view.ViewParent r0 = r4.e(r5)
            if (r0 == 0) goto L3d
            boolean r1 = r0 instanceof defpackage.ke4
            android.view.ViewGroup r2 = r4.c
            if (r1 == 0) goto L12
            ke4 r0 = (defpackage.ke4) r0
            r0.e(r2, r5)
            goto L31
        L12:
            if (r5 != 0) goto L31
            r0.onStopNestedScroll(r2)     // Catch: java.lang.AbstractMethodError -> L18
            goto L31
        L18:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ViewParent "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = " does not implement interface method onStopNestedScroll"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r2 = "ViewParentCompat"
            android.util.Log.e(r2, r0, r1)
        L31:
            r0 = 0
            if (r5 == 0) goto L3b
            r1 = 1
            if (r5 == r1) goto L38
            goto L3d
        L38:
            r4.b = r0
            goto L3d
        L3b:
            r4.a = r0
        L3d:
            return
    }
}
