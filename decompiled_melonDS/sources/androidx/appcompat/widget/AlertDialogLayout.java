package androidx.appcompat.widget;

import a6.x0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import q.v1;
import q.w1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class AlertDialogLayout extends w1 {
    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public static int j(View view) {
        WeakHashMap weakHashMap = x0.f533a;
        int minimumHeight = view.getMinimumHeight();
        if (minimumHeight > 0) {
            return minimumHeight;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return j(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    @Override // q.w1, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            int r10 = r9.getPaddingLeft()
            int r13 = r13 - r11
            int r11 = r9.getPaddingRight()
            int r11 = r13 - r11
            int r13 = r13 - r10
            int r0 = r9.getPaddingRight()
            int r13 = r13 - r0
            int r0 = r9.getMeasuredHeight()
            int r1 = r9.getChildCount()
            int r2 = r9.getGravity()
            r3 = r2 & 112(0x70, float:1.57E-43)
            r4 = 8388615(0x800007, float:1.1754953E-38)
            r2 = r2 & r4
            r4 = 16
            if (r3 == r4) goto L39
            r4 = 80
            if (r3 == r4) goto L30
            int r12 = r9.getPaddingTop()
            goto L43
        L30:
            int r3 = r9.getPaddingTop()
            int r3 = r3 + r14
            int r3 = r3 - r12
            int r12 = r3 - r0
            goto L43
        L39:
            int r3 = r9.getPaddingTop()
            int r14 = r14 - r12
            int r14 = r14 - r0
            int r14 = r14 / 2
            int r12 = r14 + r3
        L43:
            android.graphics.drawable.Drawable r14 = r9.getDividerDrawable()
            r0 = 0
            if (r14 != 0) goto L4c
            r14 = r0
            goto L50
        L4c:
            int r14 = r14.getIntrinsicHeight()
        L50:
            if (r0 >= r1) goto Lb0
            android.view.View r3 = r9.getChildAt(r0)
            if (r3 == 0) goto Lad
            int r4 = r3.getVisibility()
            r5 = 8
            if (r4 == r5) goto Lad
            int r4 = r3.getMeasuredWidth()
            int r5 = r3.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            q.v1 r6 = (q.v1) r6
            int r7 = r6.gravity
            if (r7 >= 0) goto L73
            r7 = r2
        L73:
            int r8 = r9.getLayoutDirection()
            int r7 = android.view.Gravity.getAbsoluteGravity(r7, r8)
            r7 = r7 & 7
            r8 = 1
            if (r7 == r8) goto L8d
            r8 = 5
            if (r7 == r8) goto L87
            int r7 = r6.leftMargin
            int r7 = r7 + r10
            goto L98
        L87:
            int r7 = r11 - r4
            int r8 = r6.rightMargin
        L8b:
            int r7 = r7 - r8
            goto L98
        L8d:
            int r7 = r13 - r4
            int r7 = r7 / 2
            int r7 = r7 + r10
            int r8 = r6.leftMargin
            int r7 = r7 + r8
            int r8 = r6.rightMargin
            goto L8b
        L98:
            boolean r8 = r9.i(r0)
            if (r8 == 0) goto L9f
            int r12 = r12 + r14
        L9f:
            int r8 = r6.topMargin
            int r12 = r12 + r8
            int r4 = r4 + r7
            int r8 = r12 + r5
            r3.layout(r7, r12, r4, r8)
            int r3 = r6.bottomMargin
            int r5 = r5 + r3
            int r5 = r5 + r12
            r12 = r5
        Lad:
            int r0 = r0 + 1
            goto L50
        Lb0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // q.w1, android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int makeMeasureSpec;
        AlertDialogLayout alertDialogLayout = this;
        int childCount = alertDialogLayout.getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = alertDialogLayout.getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == R.id.topPanel) {
                    view = childAt;
                } else if (id2 == R.id.buttonPanel) {
                    view2 = childAt;
                } else if ((id2 != R.id.contentPanel && id2 != R.id.customPanel) || view3 != null) {
                    super.onMeasure(i2, i10);
                    return;
                } else {
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i2);
        int paddingBottom = alertDialogLayout.getPaddingBottom() + alertDialogLayout.getPaddingTop();
        if (view != null) {
            view.measure(i2, 0);
            paddingBottom += view.getMeasuredHeight();
            i11 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i11 = 0;
        }
        if (view2 != null) {
            view2.measure(i2, 0);
            i12 = j(view2);
            i13 = view2.getMeasuredHeight() - i12;
            paddingBottom += i12;
            i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
        } else {
            i12 = 0;
            i13 = 0;
        }
        if (view3 != null) {
            if (mode == 0) {
                makeMeasureSpec = 0;
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode);
            }
            view3.measure(i2, makeMeasureSpec);
            i14 = view3.getMeasuredHeight();
            paddingBottom += i14;
            i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
        } else {
            i14 = 0;
        }
        int i16 = size - paddingBottom;
        if (view2 != null) {
            int i17 = paddingBottom - i12;
            int min = Math.min(i16, i13);
            if (min > 0) {
                i16 -= min;
                i12 += min;
            }
            view2.measure(i2, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            paddingBottom = i17 + view2.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, view2.getMeasuredState());
        }
        if (view3 != null && i16 > 0) {
            view3.measure(i2, View.MeasureSpec.makeMeasureSpec(i14 + i16, mode));
            paddingBottom = (paddingBottom - i14) + view3.getMeasuredHeight();
            i11 = View.combineMeasuredStates(i11, view3.getMeasuredState());
        }
        int i18 = 0;
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt2 = alertDialogLayout.getChildAt(i19);
            if (childAt2.getVisibility() != 8) {
                i18 = Math.max(i18, childAt2.getMeasuredWidth());
            }
        }
        int i20 = i10;
        alertDialogLayout.setMeasuredDimension(View.resolveSizeAndState(alertDialogLayout.getPaddingRight() + alertDialogLayout.getPaddingLeft() + i18, i2, i11), View.resolveSizeAndState(paddingBottom, i20, 0));
        if (mode2 != 1073741824) {
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(alertDialogLayout.getMeasuredWidth(), 1073741824);
            int i21 = 0;
            while (i21 < childCount) {
                View childAt3 = alertDialogLayout.getChildAt(i21);
                if (childAt3.getVisibility() != 8) {
                    v1 v1Var = (v1) childAt3.getLayoutParams();
                    if (((LinearLayout.LayoutParams) v1Var).width == -1) {
                        int i22 = ((LinearLayout.LayoutParams) v1Var).height;
                        ((LinearLayout.LayoutParams) v1Var).height = childAt3.getMeasuredHeight();
                        alertDialogLayout.measureChildWithMargins(childAt3, makeMeasureSpec2, 0, i20, 0);
                        ((LinearLayout.LayoutParams) v1Var).height = i22;
                    }
                }
                i21++;
                alertDialogLayout = this;
                i20 = i10;
            }
        }
    }
}
