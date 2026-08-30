package androidx.preference;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import j7.j1;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends j1 {

    /* renamed from: u  reason: collision with root package name */
    public final Drawable f1565u;

    /* renamed from: v  reason: collision with root package name */
    public final ColorStateList f1566v;

    /* renamed from: w  reason: collision with root package name */
    public final SparseArray f1567w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f1568x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f1569y;

    public i0(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.f1567w = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.f1565u = view.getBackground();
        if (textView != null) {
            this.f1566v = textView.getTextColors();
        }
    }

    public final View q(int i2) {
        SparseArray sparseArray = this.f1567w;
        View view = (View) sparseArray.get(i2);
        if (view != null) {
            return view;
        }
        View findViewById = this.f7594a.findViewById(i2);
        if (findViewById != null) {
            sparseArray.put(i2, findViewById);
        }
        return findViewById;
    }
}
