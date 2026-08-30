package com.google.android.material.transformation;

import a0.j;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import k5.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public FabTransformationBehavior() {
        new Rect();
        new RectF();
        new RectF();
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, k5.a
    public final void b(View view) {
        if (view.getVisibility() != 8) {
            return;
        }
        j.p("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // k5.a
    public final void c(d dVar) {
        if (dVar.f7975h == 0) {
            dVar.f7975h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new Rect();
        new RectF();
        new RectF();
    }
}
