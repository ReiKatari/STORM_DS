package qa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends ArrayAdapter {
    public ColorStateList A;
    public ColorStateList B;
    public final /* synthetic */ s L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Context context, int i2, String[] strArr) {
        super(context, i2, strArr);
        this.L = sVar;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        s sVar = this.L;
        ColorStateList colorStateList2 = sVar.f12498i0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.B = colorStateList;
        if (sVar.f12497h0 != 0 && sVar.f12498i0 != null) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{q5.a.b(sVar.f12498i0.getColorForState(iArr3, 0), sVar.f12497h0), q5.a.b(sVar.f12498i0.getColorForState(iArr2, 0), sVar.f12497h0), sVar.f12497h0});
        }
        this.A = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i2, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            s sVar = this.L;
            RippleDrawable rippleDrawable = null;
            if (sVar.getText().toString().contentEquals(textView.getText()) && sVar.f12497h0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(sVar.f12497h0);
                if (this.B != null) {
                    colorDrawable.setTintList(this.A);
                    rippleDrawable = new RippleDrawable(this.B, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
