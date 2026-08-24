package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by3  reason: default package */
/* loaded from: classes.dex */
public abstract class by3 {
    public static final defpackage.py0 a = null;

    static {
            pi3 r0 = new pi3
            r1 = 9
            r0.<init>(r1)
            py0 r1 = new py0
            r1.<init>(r0)
            defpackage.by3.a = r1
            return
    }

    public static defpackage.jl4 a(defpackage.px0 r5) {
            xq2 r5 = (defpackage.xq2) r5
            py0 r0 = defpackage.by3.a
            java.lang.Object r0 = r5.j(r0)
            jl4 r0 = (defpackage.jl4) r0
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L46
            r0 = 1208426157(0x48071ead, float:138362.7)
            r5.b0(r0)
            nq6 r0 = defpackage.kf.f
            java.lang.Object r0 = r5.j(r0)
            android.view.View r0 = (android.view.View) r0
            r0.getClass()
        L1f:
            if (r0 == 0) goto L41
            r3 = 2131428078(0x7f0b02ee, float:1.847779E38)
            java.lang.Object r3 = r0.getTag(r3)
            boolean r4 = r3 instanceof defpackage.jl4
            if (r4 == 0) goto L2f
            jl4 r3 = (defpackage.jl4) r3
            goto L30
        L2f:
            r3 = r1
        L30:
            if (r3 == 0) goto L34
            r0 = r3
            goto L42
        L34:
            android.view.ViewParent r0 = defpackage.xk2.s(r0)
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L3f
            android.view.View r0 = (android.view.View) r0
            goto L1f
        L3f:
            r0 = r1
            goto L1f
        L41:
            r0 = r1
        L42:
            r5.p(r2)
            goto L4d
        L46:
            r3 = 1208423708(0x4807151c, float:138324.44)
            r5.b0(r3)
            goto L42
        L4d:
            if (r0 != 0) goto L74
            r0 = 1208428160(0x48072680, float:138394.0)
            r5.b0(r0)
            nq6 r0 = defpackage.kf.b
            java.lang.Object r0 = r5.j(r0)
            android.content.Context r0 = (android.content.Context) r0
        L5d:
            boolean r3 = r0 instanceof android.content.ContextWrapper
            if (r3 == 0) goto L6e
            boolean r3 = r0 instanceof defpackage.jl4
            if (r3 == 0) goto L67
            r1 = r0
            goto L6e
        L67:
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L5d
        L6e:
            jl4 r1 = (defpackage.jl4) r1
            r5.p(r2)
            return r1
        L74:
            r1 = 1208423789(0x4807156d, float:138325.7)
            r5.b0(r1)
            r5.p(r2)
            return r0
    }
}
