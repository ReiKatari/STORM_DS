package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ur7  reason: default package */
/* loaded from: classes.dex */
public final class ur7 {
    public int a;
    public me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig b;
    public defpackage.t26 c;
    public int d;
    public android.view.Surface e;

    public ur7() {
            r6 = this;
            t26 r3 = defpackage.t26.c
            r4 = 0
            r1 = 0
            r2 = 0
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public ur7(int r1, me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r2, defpackage.t26 r3, int r4, android.view.Surface r5) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ur7
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ur7 r5 = (defpackage.ur7) r5
            int r1 = r4.a
            int r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r1 = r4.b
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            t26 r1 = r4.c
            t26 r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L30
            return r2
        L30:
            android.view.Surface r4 = r4.e
            android.view.Surface r5 = r5.e
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L3b
            return r2
        L3b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r2 = r4.b
            r3 = 0
            if (r2 != 0) goto L10
            r2 = r3
            goto L14
        L10:
            int r2 = r2.hashCode()
        L14:
            int r0 = r0 + r2
            int r0 = r0 * r1
            t26 r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            int r0 = r4.d
            int r0 = defpackage.lb1.a(r0, r2, r1)
            android.view.Surface r4 = r4.e
            if (r4 != 0) goto L29
            goto L2d
        L29:
            int r3 = r4.hashCode()
        L2d:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            int r0 = r6.a
            me.magnum.melonds.ui.emulator.model.VulkanPresentationConfig r1 = r6.b
            t26 r2 = r6.c
            int r3 = r6.d
            android.view.Surface r6 = r6.e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ManagedSurface(surfaceId="
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = ", config="
            r4.append(r0)
            r4.append(r1)
            java.lang.String r0 = ", background="
            r4.append(r0)
            r4.append(r2)
            java.lang.String r0 = ", generation="
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = ", pendingSurface="
            r4.append(r0)
            r4.append(r6)
            java.lang.String r6 = ")"
            r4.append(r6)
            java.lang.String r6 = r4.toString()
            return r6
    }
}
