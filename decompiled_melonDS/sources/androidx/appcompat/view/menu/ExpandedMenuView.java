package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p.k;
import p.l;
import p.n;
import p.z;
import p1.c1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {
    public static final int[] B = {16842964, 16843049};
    public l A;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        c1 o5 = c1.o(context, attributeSet, B, 16842868);
        TypedArray typedArray = (TypedArray) o5.B;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(o5.h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(o5.h(1));
        }
        o5.p();
    }

    @Override // p.z
    public final void a(l lVar) {
        this.A = lVar;
    }

    @Override // p.k
    public final boolean c(n nVar) {
        return this.A.q(nVar, null, 0);
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
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        c((n) getAdapter().getItem(i2));
    }
}
