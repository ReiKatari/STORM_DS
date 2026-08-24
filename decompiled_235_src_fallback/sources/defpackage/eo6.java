package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo6  reason: default package */
/* loaded from: classes.dex */
public abstract class eo6 {
    public static final float a = 0.0f;

    static {
            float r0 = android.view.ViewConfiguration.getScrollFriction()
            defpackage.eo6.a = r0
            return
    }

    public static final defpackage.oc1 a(defpackage.px0 r3) {
            nq6 r0 = defpackage.ky0.h
            xq2 r3 = (defpackage.xq2) r3
            java.lang.Object r0 = r3.j(r0)
            qh1 r0 = (defpackage.qh1) r0
            float r1 = r0.a()
            boolean r1 = r3.c(r1)
            java.lang.Object r2 = r3.P()
            if (r1 != 0) goto L1c
            vs0 r1 = defpackage.ox0.a
            if (r2 != r1) goto L29
        L1c:
            s35 r1 = new s35
            r1.<init>(r0)
            oc1 r2 = new oc1
            r2.<init>(r1)
            r3.l0(r2)
        L29:
            oc1 r2 = (defpackage.oc1) r2
            return r2
    }
}
