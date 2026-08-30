package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import k.a;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int A;
    public final int B;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7929t);
        this.B = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
