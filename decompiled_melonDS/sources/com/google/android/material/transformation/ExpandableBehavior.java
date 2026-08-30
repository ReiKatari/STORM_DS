package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import k5.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends a {
    public ExpandableBehavior() {
    }

    @Override // k5.a
    public abstract void b(View view);

    @Override // k5.a
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        view2.getClass();
        throw new ClassCastException();
    }

    @Override // k5.a
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (!view.isLaidOut()) {
            ArrayList j2 = coordinatorLayout.j(view);
            int size = j2.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view2 = (View) j2.get(i10);
                b(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}
