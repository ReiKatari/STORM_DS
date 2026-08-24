package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nv0  reason: default package */
/* loaded from: classes.dex */
public abstract class nv0 {
    public static final android.view.ViewGroup.LayoutParams a = null;

    static {
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -2
            r0.<init>(r1, r1)
            defpackage.nv0.a = r0
            return
    }

    public static void a(defpackage.mv0 r3, defpackage.zv0 r4) {
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.ComposeView
            r2 = 0
            if (r1 == 0) goto L1e
            androidx.compose.ui.platform.ComposeView r0 = (androidx.compose.ui.platform.ComposeView) r0
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L28
            r0.setParentCompositionContext(r2)
            r0.setContent(r4)
            return
        L28:
            androidx.compose.ui.platform.ComposeView r0 = new androidx.compose.ui.platform.ComposeView
            r1 = 6
            r0.<init>(r3, r2, r1)
            r0.setParentCompositionContext(r2)
            r0.setContent(r4)
            android.view.Window r4 = r3.getWindow()
            android.view.View r4 = r4.getDecorView()
            hu3 r1 = defpackage.bl2.B(r4)
            if (r1 != 0) goto L48
            r1 = 2131428076(0x7f0b02ec, float:1.8477786E38)
            r4.setTag(r1, r3)
        L48:
            bp7 r1 = defpackage.ln2.r(r4)
            if (r1 != 0) goto L54
            r1 = 2131428080(0x7f0b02f0, float:1.8477794E38)
            r4.setTag(r1, r3)
        L54:
            g56 r1 = defpackage.kn2.C(r4)
            if (r1 != 0) goto L60
            r1 = 2131428079(0x7f0b02ef, float:1.8477792E38)
            r4.setTag(r1, r3)
        L60:
            android.view.ViewGroup$LayoutParams r4 = defpackage.nv0.a
            r3.setContentView(r0, r4)
            return
    }
}
