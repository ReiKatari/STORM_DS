package com.google.android.material.transformation;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
            r0 = this;
            r0.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            return
    }

    public FabTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            return
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, defpackage.e51
    public final void f(android.view.View r1) {
            r0 = this;
            int r0 = r1.getVisibility()
            r1 = 8
            if (r0 == r1) goto L9
            return
        L9:
            java.lang.String r0 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            defpackage.i.m(r0)
            return
    }

    @Override // defpackage.e51
    public final void g(defpackage.h51 r1) {
            r0 = this;
            int r0 = r1.h
            if (r0 != 0) goto L8
            r0 = 80
            r1.h = r0
        L8:
            return
    }
}
