package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] d0 = {16842801};
    public boolean A;
    public boolean B;
    public final Rect L;
    public final Rect R;
    public final q03 c0;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.L = rect;
        this.R = new Rect();
        q03 q03Var = new q03(20, this);
        this.c0 = q03Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sx4.a, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(d0);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, RecyclerView.A1);
        float dimension2 = obtainStyledAttributes.getDimension(4, RecyclerView.A1);
        float dimension3 = obtainStyledAttributes.getDimension(5, RecyclerView.A1);
        this.A = obtainStyledAttributes.getBoolean(7, false);
        this.B = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        br5 br5Var = new br5(valueOf, dimension);
        q03Var.B = br5Var;
        setBackgroundDrawable(br5Var);
        setClipToOutline(true);
        setElevation(dimension2);
        mh7.d0(q03Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((br5) this.c0.B).h;
    }

    public float getCardElevation() {
        return ((CardView) this.c0.L).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.L.bottom;
    }

    public int getContentPaddingLeft() {
        return this.L.left;
    }

    public int getContentPaddingRight() {
        return this.L.right;
    }

    public int getContentPaddingTop() {
        return this.L.top;
    }

    public float getMaxCardElevation() {
        return ((br5) this.c0.B).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.B;
    }

    public float getRadius() {
        return ((br5) this.c0.B).a;
    }

    public boolean getUseCompatPadding() {
        return this.A;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList valueOf = ColorStateList.valueOf(i);
        br5 br5Var = (br5) this.c0.B;
        if (valueOf == null) {
            br5Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        br5Var.h = valueOf;
        br5Var.b.setColor(valueOf.getColorForState(br5Var.getState(), br5Var.h.getDefaultColor()));
        br5Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.c0.L).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        mh7.d0(this.c0, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.B) {
            this.B = z;
            q03 q03Var = this.c0;
            mh7.d0(q03Var, ((br5) q03Var.B).e);
        }
    }

    public void setRadius(float f) {
        br5 br5Var = (br5) this.c0.B;
        if (f == br5Var.a) {
            return;
        }
        br5Var.a = f;
        br5Var.b(null);
        br5Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A != z) {
            this.A = z;
            q03 q03Var = this.c0;
            mh7.d0(q03Var, ((br5) q03Var.B).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        br5 br5Var = (br5) this.c0.B;
        if (colorStateList == null) {
            br5Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        br5Var.h = colorStateList;
        br5Var.b.setColor(colorStateList.getColorForState(br5Var.getState(), br5Var.h.getDefaultColor()));
        br5Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
