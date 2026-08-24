package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pr0  reason: default package */
/* loaded from: classes.dex */
public abstract class pr0 {
    public static final long a = 0;

    static {
            int r0 = android.view.ViewConfiguration.getTapTimeout()
            long r0 = (long) r0
            defpackage.pr0.a = r0
            return
    }

    public static final boolean a(defpackage.h0 r1) {
            android.view.View r1 = defpackage.jw2.z(r1)
            android.view.ViewParent r1 = r1.getParent()
        L8:
            if (r1 == 0) goto L1d
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r0 = r1.shouldDelayChildPressedState()
            if (r0 == 0) goto L18
            r1 = 1
            return r1
        L18:
            android.view.ViewParent r1 = r1.getParent()
            goto L8
        L1d:
            r1 = 0
            return r1
    }
}
