package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int A;
    public final int B;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m75.t);
        this.B = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
