package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vs4  reason: default package */
/* loaded from: classes.dex */
public final class vs4 extends g75 {
    public final Drawable u;
    public final ColorStateList v;
    public final SparseArray w;
    public boolean x;
    public boolean y;

    public vs4(View view) {
        super(view);
        SparseArray sparseArray = new SparseArray(4);
        this.w = sparseArray;
        TextView textView = (TextView) view.findViewById(16908310);
        sparseArray.put(16908310, textView);
        sparseArray.put(16908304, view.findViewById(16908304));
        sparseArray.put(16908294, view.findViewById(16908294));
        sparseArray.put(R.id.icon_frame, view.findViewById(R.id.icon_frame));
        sparseArray.put(16908350, view.findViewById(16908350));
        this.u = view.getBackground();
        if (textView != null) {
            this.v = textView.getTextColors();
        }
    }

    public final View q(int i) {
        SparseArray sparseArray = this.w;
        View view = (View) sparseArray.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = this.a.findViewById(i);
        if (findViewById != null) {
            sparseArray.put(i, findViewById);
        }
        return findViewById;
    }
}
