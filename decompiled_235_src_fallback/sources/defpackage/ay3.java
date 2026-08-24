package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ay3  reason: default package */
/* loaded from: classes.dex */
public abstract class ay3 {
    public static final defpackage.py0 a = null;

    static {
            pi3 r0 = new pi3
            r1 = 8
            r0.<init>(r1)
            py0 r1 = new py0
            r1.<init>(r0)
            defpackage.ay3.a = r1
            return
    }

    public static defpackage.id4 a(defpackage.px0 r5) {
            xq2 r5 = (defpackage.xq2) r5
            py0 r0 = defpackage.ay3.a
            java.lang.Object r0 = r5.j(r0)
            id4 r0 = (defpackage.id4) r0
            r1 = 0
            if (r0 != 0) goto L45
            r0 = 950836184(0x38ac9bd8, float:8.230627E-5)
            r5.b0(r0)
            nq6 r0 = defpackage.kf.f
            java.lang.Object r0 = r5.j(r0)
            android.view.View r0 = (android.view.View) r0
            r0.getClass()
        L1e:
            r2 = 0
            if (r0 == 0) goto L41
            r3 = 2131428077(0x7f0b02ed, float:1.8477788E38)
            java.lang.Object r3 = r0.getTag(r3)
            boolean r4 = r3 instanceof defpackage.id4
            if (r4 == 0) goto L2f
            id4 r3 = (defpackage.id4) r3
            goto L30
        L2f:
            r3 = r2
        L30:
            if (r3 == 0) goto L34
            r2 = r3
            goto L41
        L34:
            android.view.ViewParent r0 = defpackage.xk2.s(r0)
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L3f
            android.view.View r0 = (android.view.View) r0
            goto L1e
        L3f:
            r0 = r2
            goto L1e
        L41:
            r5.p(r1)
            return r2
        L45:
            r2 = 950834231(0x38ac9437, float:8.229206E-5)
            r5.b0(r2)
            r5.p(r1)
            return r0
    }
}
