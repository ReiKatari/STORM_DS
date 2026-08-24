package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qt3  reason: default package */
/* loaded from: classes.dex */
public final class qt3 {
    public static defpackage.st3 a(defpackage.tt3 r1) {
            r1.getClass()
            int[] r0 = defpackage.pt3.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L16
            r1 = 0
            return r1
        L16:
            st3 r1 = defpackage.st3.ON_PAUSE
            return r1
        L19:
            st3 r1 = defpackage.st3.ON_STOP
            return r1
        L1c:
            st3 r1 = defpackage.st3.ON_DESTROY
            return r1
    }

    public static defpackage.st3 b(defpackage.tt3 r1) {
            r1.getClass()
            int[] r0 = defpackage.pt3.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 5
            if (r1 == r0) goto L16
            r1 = 0
            return r1
        L16:
            st3 r1 = defpackage.st3.ON_CREATE
            return r1
        L19:
            st3 r1 = defpackage.st3.ON_RESUME
            return r1
        L1c:
            st3 r1 = defpackage.st3.ON_START
            return r1
    }

    public static defpackage.st3 c(defpackage.tt3 r1) {
            r1.getClass()
            int[] r0 = defpackage.pt3.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L19
            r0 = 3
            if (r1 == r0) goto L16
            r1 = 0
            return r1
        L16:
            st3 r1 = defpackage.st3.ON_RESUME
            return r1
        L19:
            st3 r1 = defpackage.st3.ON_START
            return r1
        L1c:
            st3 r1 = defpackage.st3.ON_CREATE
            return r1
    }
}
