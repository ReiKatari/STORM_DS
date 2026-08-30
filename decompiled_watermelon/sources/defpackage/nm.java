package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nm  reason: default package */
/* loaded from: classes.dex */
public final class nm extends ViewGroup {
    public final HashMap A;
    public final HashMap B;

    public nm(Context context) {
        super(context);
        setClipChildren(false);
        this.A = new HashMap();
        this.B = new HashMap();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<Object, vf3> getHolderToLayoutNode() {
        return this.A;
    }

    public final HashMap<vf3, Object> getLayoutNodeToHolder() {
        return this.B;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Iterator it = this.A.keySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        throw b31.m(it);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            mz2.a("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            mz2.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        Iterator it = this.A.keySet().iterator();
        if (!it.hasNext()) {
            return;
        }
        throw b31.m(it);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            vf3 vf3Var = (vf3) this.A.get(childAt);
            if (childAt.isLayoutRequested() && vf3Var != null) {
                vf3.V(vf3Var, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }
}
