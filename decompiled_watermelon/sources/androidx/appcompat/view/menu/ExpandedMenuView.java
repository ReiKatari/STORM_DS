package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements tw3, ox3, AdapterView.OnItemClickListener {
    public static final int[] B = {16842964, 16843049};
    public uw3 A;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        n85 q = n85.q(context, attributeSet, B, 16842868);
        TypedArray typedArray = (TypedArray) q.L;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(q.f(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(q.f(1));
        }
        q.t();
    }

    @Override // defpackage.tw3
    public final boolean a(zw3 zw3Var) {
        return this.A.q(zw3Var, null, 0);
    }

    @Override // defpackage.ox3
    public final void b(uw3 uw3Var) {
        this.A = uw3Var;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((zw3) getAdapter().getItem(i));
    }
}
