package androidx.compose.ui.platform;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ComposeView extends defpackage.p0 {
    public final defpackage.vs4 i0;
    public boolean j0;

    public ComposeView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r2, r3, r0)
            return
    }

    public ComposeView(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r4 = r4 & 2
            r0 = 0
            if (r4 == 0) goto L6
            r3 = r0
        L6:
            r1.<init>(r2, r3)
            vs4 r2 = defpackage.np2.Y(r0)
            r1.i0 = r2
            return
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
            return
    }

    @Override // defpackage.p0
    public final void a(defpackage.px0 r6, int r7) {
            r5 = this;
            xq2 r6 = (defpackage.xq2) r6
            r0 = 420213850(0x190bf45a, float:7.235478E-24)
            r6.d0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 1
            r4 = 0
            if (r2 == r1) goto L1b
            r1 = r3
            goto L1c
        L1b:
            r1 = r4
        L1c:
            r0 = r0 & r3
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L45
            vs4 r0 = r5.i0
            java.lang.Object r0 = r0.getValue()
            eo2 r0 = (defpackage.eo2) r0
            if (r0 != 0) goto L37
            r0 = -1238823553(0xffffffffb6290d7f, float:-2.5190818E-6)
            r6.b0(r0)
        L33:
            r6.p(r4)
            goto L48
        L37:
            r1 = 98585282(0x5e04ac2, float:2.109232E-35)
            r6.b0(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.o(r6, r1)
            goto L33
        L45:
            r6.V()
        L48:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L56
            o0 r0 = new o0
            r1 = 3
            r0.<init>(r5, r7, r1)
            r6.d = r0
        L56:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r0 = this;
            java.lang.String r0 = "androidx.compose.ui.platform.ComposeView"
            return r0
    }

    @Override // defpackage.p0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.j0
            return r0
    }

    public final void setContent(defpackage.eo2 r2) {
            r1 = this;
            r0 = 1
            r1.j0 = r0
            vs4 r0 = r1.i0
            r0.setValue(r2)
            boolean r2 = r1.isAttachedToWindow()
            if (r2 != 0) goto L16
            mx0 r2 = r1.getComposeViewContext$ui()
            if (r2 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            r1.d()
            return
    }
}
