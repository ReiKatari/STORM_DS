package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int A;
    public final int B;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, by4.t);
        this.B = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.A = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
