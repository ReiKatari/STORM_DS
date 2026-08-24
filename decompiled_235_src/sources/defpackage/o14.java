package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o14  reason: default package */
/* loaded from: classes.dex */
public final class o14 extends ArrayAdapter {
    public ColorStateList A;
    public ColorStateList B;
    public final /* synthetic */ p14 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o14(p14 p14Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.L = p14Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        p14 p14Var = this.L;
        ColorStateList colorStateList2 = p14Var.k0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.B = colorStateList;
        if (p14Var.j0 != 0 && p14Var.k0 != null) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{tt0.b(p14Var.k0.getColorForState(iArr3, 0), p14Var.j0), tt0.b(p14Var.k0.getColorForState(iArr2, 0), p14Var.j0), p14Var.j0});
        }
        this.A = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            p14 p14Var = this.L;
            RippleDrawable rippleDrawable = null;
            if (p14Var.getText().toString().contentEquals(textView.getText()) && p14Var.j0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(p14Var.j0);
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
