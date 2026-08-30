package androidx.appcompat.widget;

import a6.x0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {
    public boolean A;
    public boolean B;
    public int L;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = -1;
        int[] iArr = k.a.f7921k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        x0.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.A = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.A);
        }
    }

    private void setStacked(boolean z10) {
        int i2;
        int i10;
        if (this.B != z10) {
            if (!z10 || this.A) {
                this.B = z10;
                setOrientation(z10 ? 1 : 0);
                if (z10) {
                    i2 = 8388613;
                } else {
                    i2 = 80;
                }
                setGravity(i2);
                View findViewById = findViewById(R.id.spacer);
                if (findViewById != null) {
                    if (z10) {
                        i10 = 8;
                    } else {
                        i10 = 4;
                    }
                    findViewById.setVisibility(i10);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int size = View.MeasureSpec.getSize(i2);
        int i13 = 0;
        if (this.A) {
            if (size > this.L && this.B) {
                setStacked(false);
            }
            this.L = size;
        }
        if (!this.B && View.MeasureSpec.getMode(i2) == 1073741824) {
            i11 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        } else {
            i11 = i2;
            z10 = false;
        }
        super.onMeasure(i11, i10);
        if (this.A && !this.B && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z10 = true;
        }
        if (z10) {
            super.onMeasure(i2, i10);
        }
        int childCount = getChildCount();
        int i14 = 0;
        while (true) {
            i12 = -1;
            if (i14 < childCount) {
                if (getChildAt(i14).getVisibility() == 0) {
                    break;
                }
                i14++;
            } else {
                i14 = -1;
                break;
            }
        }
        if (i14 >= 0) {
            View childAt = getChildAt(i14);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.B) {
                int i15 = i14 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i15 >= childCount2) {
                        break;
                    } else if (getChildAt(i15).getVisibility() == 0) {
                        i12 = i15;
                        break;
                    } else {
                        i15++;
                    }
                }
                if (i12 >= 0) {
                    i13 = getChildAt(i12).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight;
                } else {
                    i13 = measuredHeight;
                }
            } else {
                i13 = getPaddingBottom() + measuredHeight;
            }
        }
        WeakHashMap weakHashMap = x0.f533a;
        if (getMinimumHeight() != i13) {
            setMinimumHeight(i13);
            if (i10 == 0) {
                super.onMeasure(i2, i10);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.A != z10) {
            this.A = z10;
            if (!z10 && this.B) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
