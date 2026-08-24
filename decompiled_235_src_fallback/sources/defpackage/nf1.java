package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nf1  reason: default package */
/* loaded from: classes.dex */
public final class nf1 extends androidx.fragment.app.f {
    public final java.lang.Object b;
    public final boolean c;
    public final java.lang.Object d;

    public nf1(androidx.fragment.app.b0 r4, boolean r5, boolean r6) {
            r3 = this;
            androidx.fragment.app.o r0 = r4.c
            r3.<init>(r4)
            ao6 r1 = r4.a
            ao6 r2 = defpackage.ao6.VISIBLE
            if (r1 != r2) goto L17
            if (r5 == 0) goto L12
            java.lang.Object r1 = r0.getReenterTransition()
            goto L22
        L12:
            java.lang.Object r1 = r0.getEnterTransition()
            goto L22
        L17:
            if (r5 == 0) goto L1e
            java.lang.Object r1 = r0.getReturnTransition()
            goto L22
        L1e:
            java.lang.Object r1 = r0.getExitTransition()
        L22:
            r3.b = r1
            ao6 r4 = r4.a
            if (r4 != r2) goto L34
            if (r5 == 0) goto L2f
            boolean r4 = r0.getAllowReturnTransitionOverlap()
            goto L35
        L2f:
            boolean r4 = r0.getAllowEnterTransitionOverlap()
            goto L35
        L34:
            r4 = 1
        L35:
            r3.c = r4
            if (r6 == 0) goto L45
            if (r5 == 0) goto L40
            java.lang.Object r4 = r0.getSharedElementReturnTransition()
            goto L46
        L40:
            java.lang.Object r4 = r0.getSharedElementEnterTransition()
            goto L46
        L45:
            r4 = 0
        L46:
            r3.d = r4
            return
    }

    public final defpackage.dm2 b() {
            r6 = this;
            java.lang.Object r3 = r6.b
            dm2 r0 = r6.c(r3)
            java.lang.Object r5 = r6.d
            dm2 r1 = r6.c(r5)
            if (r0 == 0) goto L22
            if (r1 == 0) goto L22
            if (r0 != r1) goto L13
            goto L22
        L13:
            androidx.fragment.app.b0 r6 = r6.a
            androidx.fragment.app.o r1 = r6.c
            java.lang.String r2 = " returned Transition "
            java.lang.String r4 = " which uses a different Transition  type than its shared element transition "
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            defpackage.u34.n(r0, r1, r2, r3, r4, r5)
            r6 = 0
            return r6
        L22:
            if (r0 != 0) goto L25
            return r1
        L25:
            return r0
    }

    public final defpackage.dm2 c(java.lang.Object r4) {
            r3 = this;
            if (r4 != 0) goto L4
            r3 = 0
            return r3
        L4:
            bm2 r0 = defpackage.wl2.a
            boolean r1 = r4 instanceof android.transition.Transition
            if (r1 == 0) goto Lb
            return r0
        Lb:
            dm2 r0 = defpackage.wl2.b
            if (r0 == 0) goto L16
            boolean r1 = r0.g(r4)
            if (r1 == 0) goto L16
            return r0
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Transition "
            r1.<init>(r2)
            r1.append(r4)
            androidx.fragment.app.b0 r3 = r3.a
            androidx.fragment.app.o r3 = r3.c
            java.lang.String r4 = " for fragment "
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = " is not a valid framework Transition or AndroidX Transition"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }
}
