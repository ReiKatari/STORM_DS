package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean A;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        z57.c(null);
        if (bv3.m(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.A = bv3.m(getContext(), R.attr.nestedScrollable);
        aa7.n(this, new tu3(2));
    }

    public final iz3 a() {
        return (iz3) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (iz3) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((iz3) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        iz3 iz3Var = (iz3) super.getAdapter();
        iz3Var.getClass();
        int max = Math.max(iz3Var.a(), getFirstVisiblePosition());
        int min = Math.min(iz3Var.c(), getLastVisiblePosition());
        iz3Var.getItem(max);
        iz3Var.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (z) {
            if (i == 33) {
                setSelection(((iz3) super.getAdapter()).c());
                return;
            } else if (i == 130) {
                setSelection(((iz3) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i, rect);
                return;
            }
        }
        super.onFocusChanged(false, i, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((iz3) super.getAdapter()).a() && selectedItemPosition <= ((iz3) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((iz3) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.A) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof iz3) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), iz3.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((iz3) super.getAdapter()).a()) {
            super.setSelection(((iz3) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (iz3) super.getAdapter();
    }
}
