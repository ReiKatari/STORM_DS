package l2;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends ViewGroup {
    public final int A;
    public final ArrayList B;
    public final ArrayList L;
    public final jb.c R;

    /* renamed from: b0  reason: collision with root package name */
    public int f8672b0;

    public d(Context context) {
        super(context);
        this.A = 5;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.R = new jb.c(6);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.f8672b0 = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i10) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
    }
}
