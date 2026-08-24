package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l60  reason: default package */
/* loaded from: classes.dex */
public final class l60 extends defpackage.b2 {
    public final /* synthetic */ int R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ l60(java.lang.Object r1, int r2) {
            r0 = this;
            r0.R = r2
            r0.X = r1
            r0.<init>()
            return
    }

    @Override // defpackage.b2
    public void c(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
            r1 = this;
            int r0 = r1.R
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.c(r2, r3)
            return
        L9:
            super.c(r2, r3)
            java.lang.Object r1 = r1.X
            com.google.android.material.internal.CheckableImageButton r1 = (com.google.android.material.internal.CheckableImageButton) r1
            boolean r1 = r1.R
            r3.setChecked(r1)
            return
    }

    @Override // defpackage.b2
    public final void d(android.view.View r8, defpackage.v2 r9) {
            r7 = this;
            int r0 = r7.R
            r1 = 1
            r2 = 0
            r3 = -1
            android.view.View$AccessibilityDelegate r4 = r7.A
            java.lang.Object r7 = r7.X
            switch(r0) {
                case 0: goto Lc8;
                case 1: goto Lb6;
                case 2: goto L73;
                case 3: goto L4a;
                case 4: goto L3d;
                default: goto Lc;
            }
        Lc:
            w15 r7 = (defpackage.w15) r7
            xg5 r0 = r7.Z
            r0.d(r8, r9)
            androidx.recyclerview.widget.RecyclerView r7 = r7.Y
            r7.getClass()
            wg5 r8 = androidx.recyclerview.widget.RecyclerView.N(r8)
            if (r8 == 0) goto L27
            androidx.recyclerview.widget.RecyclerView r0 = r8.r
            if (r0 != 0) goto L23
            goto L27
        L23:
            int r3 = r0.K(r8)
        L27:
            wf5 r7 = r7.getAdapter()
            boolean r8 = r7 instanceof defpackage.t15
            if (r8 != 0) goto L30
            goto L3c
        L30:
            t15 r7 = (defpackage.t15) r7
            androidx.preference.Preference r7 = r7.j(r3)
            if (r7 != 0) goto L39
            goto L3c
        L39:
            r7.onInitializeAccessibilityNodeInfo(r9)
        L3c:
            return
        L3d:
            android.view.accessibility.AccessibilityNodeInfo r9 = r9.a
            r4.onInitializeAccessibilityNodeInfo(r8, r9)
            com.google.android.material.internal.NavigationMenuItemView r7 = (com.google.android.material.internal.NavigationMenuItemView) r7
            boolean r7 = r7.w0
            r9.setCheckable(r7)
            return
        L4a:
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.a
            r4.onInitializeAccessibilityNodeInfo(r8, r0)
            f24 r7 = (defpackage.f24) r7
            android.view.View r8 = r7.h0
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L61
            r8 = 2131952270(0x7f13028e, float:1.9540978E38)
            java.lang.String r7 = r7.getString(r8)
            goto L68
        L61:
            r8 = 2131952268(0x7f13028c, float:1.9540974E38)
            java.lang.String r7 = r7.getString(r8)
        L68:
            p2 r8 = new p2
            r0 = 16
            r8.<init>(r0, r7)
            r9.b(r8)
            return
        L73:
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.a
            r4.onInitializeAccessibilityNodeInfo(r8, r0)
            com.google.android.material.button.MaterialButtonToggleGroup r7 = (com.google.android.material.button.MaterialButtonToggleGroup) r7
            int r0 = com.google.android.material.button.MaterialButtonToggleGroup.p0
            boolean r0 = r8 instanceof com.google.android.material.button.MaterialButton
            if (r0 != 0) goto L81
            goto Laa
        L81:
            r0 = r2
            r4 = r0
        L83:
            int r5 = r7.getChildCount()
            if (r0 >= r5) goto Laa
            android.view.View r5 = r7.getChildAt(r0)
            if (r5 != r8) goto L91
            r3 = r4
            goto Laa
        L91:
            android.view.View r5 = r7.getChildAt(r0)
            boolean r5 = r5 instanceof com.google.android.material.button.MaterialButton
            if (r5 == 0) goto La7
            android.view.View r5 = r7.getChildAt(r0)
            int r5 = r5.getVisibility()
            r6 = 8
            if (r5 == r6) goto La7
            int r4 = r4 + 1
        La7:
            int r0 = r0 + 1
            goto L83
        Laa:
            com.google.android.material.button.MaterialButton r8 = (com.google.android.material.button.MaterialButton) r8
            boolean r7 = r8.n0
            u2 r7 = defpackage.u2.b(r7, r2, r1, r3, r1)
            r9.k(r7)
            return
        Lb6:
            android.view.accessibility.AccessibilityNodeInfo r9 = r9.a
            r4.onInitializeAccessibilityNodeInfo(r8, r9)
            com.google.android.material.internal.CheckableImageButton r7 = (com.google.android.material.internal.CheckableImageButton) r7
            boolean r8 = r7.d0
            r9.setCheckable(r8)
            boolean r7 = r7.R
            r9.setChecked(r7)
            return
        Lc8:
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.a
            r4.onInitializeAccessibilityNodeInfo(r8, r0)
            o60 r7 = (defpackage.o60) r7
            boolean r7 = r7.g0
            if (r7 == 0) goto Ldc
            r7 = 1048576(0x100000, float:1.469368E-39)
            r9.a(r7)
            r0.setDismissable(r1)
            goto Ldf
        Ldc:
            r0.setDismissable(r2)
        Ldf:
            return
    }

    @Override // defpackage.b2
    public boolean g(android.view.View r3, int r4, android.os.Bundle r5) {
            r2 = this;
            int r0 = r2.R
            java.lang.Object r1 = r2.X
            switch(r0) {
                case 0: goto L15;
                case 5: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r2 = super.g(r3, r4, r5)
            return r2
        Lc:
            w15 r1 = (defpackage.w15) r1
            xg5 r2 = r1.Z
            boolean r2 = r2.g(r3, r4, r5)
            return r2
        L15:
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r4 != r0) goto L24
            o60 r1 = (defpackage.o60) r1
            boolean r0 = r1.g0
            if (r0 == 0) goto L24
            r1.cancel()
            r2 = 1
            goto L28
        L24:
            boolean r2 = super.g(r3, r4, r5)
        L28:
            return r2
    }
}
