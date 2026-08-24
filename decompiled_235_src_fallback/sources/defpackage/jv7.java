package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jv7  reason: default package */
/* loaded from: classes.dex */
public abstract class jv7 {
    public static final defpackage.aj a(defpackage.le2 r7, int r8) {
            tl0 r0 = defpackage.ul0.h
            r0.getClass()
            int r0 = defpackage.tl0.b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof defpackage.wl0
            if (r1 == 0) goto L3b
            r1 = r7
            wl0 r1 = (defpackage.wl0) r1
            m80 r2 = r1.L
            le2 r3 = r1.g()
            if (r3 == 0) goto L3b
            aj r7 = new aj
            int r4 = r1.B
            r5 = -3
            if (r4 == r5) goto L29
            r5 = -2
            if (r4 == r5) goto L29
            if (r4 == 0) goto L29
            r0 = r4
            goto L35
        L29:
            m80 r5 = defpackage.m80.SUSPEND
            r6 = 0
            if (r2 != r5) goto L32
            if (r4 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            l61 r8 = r1.A
            r7.<init>(r0, r2, r8, r3)
            return r7
        L3b:
            aj r8 = new aj
            m80 r1 = defpackage.m80.SUSPEND
            vt1 r2 = defpackage.vt1.A
            r8.<init>(r0, r1, r2, r7)
            return r8
    }

    public static final defpackage.p83 b(defpackage.e83 r4) {
            p83 r0 = new p83
            int r1 = r4.a
            int r2 = r4.b
            int r3 = r4.c
            int r4 = r4.d
            r0.<init>(r1, r2, r3, r4)
            return r0
    }
}
