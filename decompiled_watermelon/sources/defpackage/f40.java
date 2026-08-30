package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f40  reason: default package */
/* loaded from: classes.dex */
public final class f40 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f40(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        switch (this.a) {
            case 0:
                throw null;
            default:
                SearchView searchView = (SearchView) this.b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.n0;
                View view2 = searchView.v0;
                boolean z = true;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.p0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z2 = dc7.a;
                    int i10 = 0;
                    if (searchView.getLayoutDirection() != 1) {
                        z = false;
                    }
                    if (searchView.L0) {
                        i10 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i11 = rect.left;
                    if (z) {
                        i9 = -i11;
                    } else {
                        i9 = paddingLeft - (i11 + i10);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i9);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
                    return;
                }
                return;
        }
    }
}
