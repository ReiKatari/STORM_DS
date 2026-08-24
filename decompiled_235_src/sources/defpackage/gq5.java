package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gq5  reason: default package */
/* loaded from: classes.dex */
public final class gq5 extends ViewGroup {
    public final int A;
    public final ArrayList B;
    public final ArrayList L;
    public final ap3 R;
    public int d0;

    public gq5(Context context) {
        super(context);
        this.A = 5;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.R = new ap3(25);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.d0 = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
