package com.google.android.material.datepicker;

import a6.x0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {
    public final boolean A;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        x.c(null);
        if (o.m(getContext(), 16843277)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.A = o.m(getContext(), R.attr.nestedScrollable);
        x0.o(this, new h(2));
    }

    public final r a() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (r) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((r) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        r rVar = (r) super.getAdapter();
        rVar.getClass();
        int max = Math.max(rVar.a(), getFirstVisiblePosition());
        int min = Math.min(rVar.c(), getLastVisiblePosition());
        rVar.getItem(max);
        rVar.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z10, int i2, Rect rect) {
        if (z10) {
            if (i2 == 33) {
                setSelection(((r) super.getAdapter()).c());
                return;
            } else if (i2 == 130) {
                setSelection(((r) super.getAdapter()).a());
                return;
            } else {
                super.onFocusChanged(true, i2, rect);
                return;
            }
        }
        super.onFocusChanged(false, i2, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (!super.onKeyDown(i2, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((r) super.getAdapter()).a() && selectedItemPosition <= ((r) super.getAdapter()).c())) {
            return true;
        }
        if (19 != i2) {
            return false;
        }
        setSelection(((r) super.getAdapter()).a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i2, int i10) {
        if (this.A) {
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i2, i10);
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof r) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), r.class.getCanonicalName()));
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i2) {
        if (i2 < ((r) super.getAdapter()).a()) {
            super.setSelection(((r) super.getAdapter()).a());
        } else {
            super.setSelection(i2);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter  reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (r) super.getAdapter();
    }
}
