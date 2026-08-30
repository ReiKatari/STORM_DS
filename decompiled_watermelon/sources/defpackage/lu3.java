package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lu3  reason: default package */
/* loaded from: classes.dex */
public final class lu3 extends ArrayAdapter {
    public ColorStateList A;
    public ColorStateList B;
    public final /* synthetic */ mu3 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu3(mu3 mu3Var, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.L = mu3Var;
        a();
    }

    public final void a() {
        ColorStateList colorStateList;
        mu3 mu3Var = this.L;
        ColorStateList colorStateList2 = mu3Var.j0;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {16842919};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.B = colorStateList;
        if (mu3Var.i0 != 0 && mu3Var.j0 != null) {
            int[] iArr2 = {16843623, -16842919};
            int[] iArr3 = {16842913, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{gr0.b(mu3Var.j0.getColorForState(iArr3, 0), mu3Var.i0), gr0.b(mu3Var.j0.getColorForState(iArr2, 0), mu3Var.i0), mu3Var.i0});
        }
        this.A = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            mu3 mu3Var = this.L;
            RippleDrawable rippleDrawable = null;
            if (mu3Var.getText().toString().contentEquals(textView.getText()) && mu3Var.i0 != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(mu3Var.i0);
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
