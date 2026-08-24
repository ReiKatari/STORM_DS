package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d60  reason: default package */
/* loaded from: classes.dex */
public final class d60 implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d60(Object obj, int i) {
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
                SearchView.SearchAutoComplete searchAutoComplete = searchView.o0;
                View view2 = searchView.w0;
                boolean z = true;
                if (view2.getWidth() > 1) {
                    Resources resources = searchView.getContext().getResources();
                    int paddingLeft = searchView.q0.getPaddingLeft();
                    Rect rect = new Rect();
                    boolean z2 = eq7.a;
                    int i10 = 0;
                    if (searchView.getLayoutDirection() != 1) {
                        z = false;
                    }
                    if (searchView.M0) {
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
