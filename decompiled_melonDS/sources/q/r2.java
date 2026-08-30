package q;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r2 implements View.OnLayoutChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12016a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f12017b;

    public /* synthetic */ r2(int i2, Object obj) {
        this.f12016a = i2;
        this.f12017b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i2, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int i17;
        switch (this.f12016a) {
            case 0:
                SearchView searchView = (SearchView) this.f12017b;
                SearchView.SearchAutoComplete searchAutoComplete = searchView.f966m0;
                View view2 = searchView.f973u0;
                boolean z10 = true;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.f968o0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z11 = u3.f12027a;
                    int i18 = 0;
                    if (searchView.getLayoutDirection() != 1) {
                        z10 = false;
                    }
                    if (searchView.K0) {
                        i18 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
                    }
                    searchAutoComplete.getDropDownBackground().getPadding(rect);
                    int i19 = rect.left;
                    if (z10) {
                        i17 = -i19;
                    } else {
                        i17 = paddingLeft - (i19 + i18);
                    }
                    searchAutoComplete.setDropDownHorizontalOffset(i17);
                    searchAutoComplete.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + i18) - paddingLeft);
                    return;
                }
                return;
            default:
                throw null;
        }
    }
}
