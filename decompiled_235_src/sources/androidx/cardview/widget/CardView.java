package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] e0 = {16842801};
    public boolean A;
    public boolean B;
    public final Rect L;
    public final Rect R;
    public final u63 d0;

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.L = rect;
        this.R = new Rect();
        u63 u63Var = new u63(this, 20);
        this.d0 = u63Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d75.a, R.attr.cardViewStyle, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(e0);
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
        float dimension = obtainStyledAttributes.getDimension(3, RecyclerView.B1);
        float dimension2 = obtainStyledAttributes.getDimension(4, RecyclerView.B1);
        float dimension3 = obtainStyledAttributes.getDimension(5, RecyclerView.B1);
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
        v16 v16Var = new v16(valueOf, dimension);
        u63Var.B = v16Var;
        setBackgroundDrawable(v16Var);
        setClipToOutline(true);
        setElevation(dimension2);
        hv.Z(u63Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((v16) this.d0.B).h;
    }

    public float getCardElevation() {
        return ((CardView) this.d0.L).getElevation();
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
        return ((v16) this.d0.B).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.B;
    }

    public float getRadius() {
        return ((v16) this.d0.B).a;
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
        v16 v16Var = (v16) this.d0.B;
        if (valueOf == null) {
            v16Var.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        v16Var.h = valueOf;
        v16Var.b.setColor(valueOf.getColorForState(v16Var.getState(), v16Var.h.getDefaultColor()));
        v16Var.invalidateSelf();
    }

    public void setCardElevation(float f) {
        ((CardView) this.d0.L).setElevation(f);
    }

    public void setMaxCardElevation(float f) {
        hv.Z(this.d0, f);
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
            u63 u63Var = this.d0;
            hv.Z(u63Var, ((v16) u63Var.B).e);
        }
    }

    public void setRadius(float f) {
        v16 v16Var = (v16) this.d0.B;
        if (f == v16Var.a) {
            return;
        }
        v16Var.a = f;
        v16Var.b(null);
        v16Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A != z) {
            this.A = z;
            u63 u63Var = this.d0;
            hv.Z(u63Var, ((v16) u63Var.B).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        v16 v16Var = (v16) this.d0.B;
        if (colorStateList == null) {
            v16Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        v16Var.h = colorStateList;
        v16Var.b.setColor(colorStateList.getColorForState(v16Var.getState(), v16Var.h.getDefaultColor()));
        v16Var.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }
}
