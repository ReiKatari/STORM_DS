package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ig5  reason: default package */
/* loaded from: classes.dex */
public final class ig5 extends ViewGroup {
    public final int A;
    public final ArrayList B;
    public final ArrayList L;
    public final ci3 R;
    public int c0;

    public ig5(Context context) {
        super(context);
        this.A = 5;
        ArrayList arrayList = new ArrayList();
        this.B = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.L = arrayList2;
        this.R = new ci3(20);
        setClipChildren(false);
        View view = new View(context);
        addView(view);
        arrayList.add(view);
        arrayList2.add(view);
        this.c0 = 1;
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
