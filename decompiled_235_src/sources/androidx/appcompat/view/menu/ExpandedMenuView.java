package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements h44, d54, AdapterView.OnItemClickListener {
    public static final int[] B = {16842964, 16843049};
    public i44 A;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        m44 A = m44.A(context, attributeSet, B, 16842868);
        TypedArray typedArray = (TypedArray) A.L;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A.k(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A.k(1));
        }
        A.D();
    }

    @Override // defpackage.h44
    public final boolean a(o44 o44Var) {
        return this.A.q(o44Var, null, 0);
    }

    @Override // defpackage.d54
    public final void b(i44 i44Var) {
        this.A = i44Var;
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
        a((o44) getAdapter().getItem(i));
    }
}
