package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.stormds.emulator.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z14  reason: default package */
/* loaded from: classes.dex */
public abstract class z14 extends LinearLayout {
    public final ArrayList A;
    public final ArrayList B;
    public final s63 L;
    public final su0 R;
    public Integer[] d0;
    public wp6 e0;
    public xp6 f0;
    public int g0;
    public aq6 h0;
    public boolean i0;

    /* JADX WARN: Type inference failed for: r0v21, types: [aq6, java.lang.Object] */
    public z14(Context context, AttributeSet attributeSet) {
        super(q60.e0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018252), attributeSet, R.attr.materialButtonToggleGroupStyle);
        wp6 b;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        aq6 aq6Var;
        this.A = new ArrayList();
        this.B = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.L = new s63(materialButtonToggleGroup, 16);
        this.R = new su0(materialButtonToggleGroup, 1);
        this.i0 = true;
        Context context2 = getContext();
        TypedArray K = f04.K(context2, attributeSet, a75.k, R.attr.materialButtonToggleGroupStyle, 2132018252, new int[0]);
        if (K.hasValue(2)) {
            int resourceId = K.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    obj = new Object();
                    obj.c = new int[10];
                    obj.d = new s35[10];
                    asAttributeSet = Xml.asAttributeSet(xml);
                    while (true) {
                        next2 = xml.next();
                        if (next2 == 2 || next2 == 1) {
                            break;
                        }
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
                if (next2 == 2) {
                    if (xml.getName().equals("selector")) {
                        obj.a(context2, xml, asAttributeSet, context2.getTheme());
                    }
                    xml.close();
                    aq6Var = obj;
                    this.h0 = aq6Var;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            aq6Var = null;
            this.h0 = aq6Var;
        }
        if (K.hasValue(4)) {
            xp6 b2 = xp6.b(context2, K, 4);
            this.f0 = b2;
            if (b2 == null) {
                h03 h03Var = new h03(me6.a(context2, K.getResourceId(4, 0), K.getResourceId(5, 0), new t(RecyclerView.B1)).a());
                this.f0 = h03Var.b != 0 ? new xp6(h03Var) : null;
            }
        }
        if (K.hasValue(3)) {
            t tVar = new t(RecyclerView.B1);
            int resourceId2 = K.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = wp6.b(me6.c(K, 3, tVar));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b = wp6.b(me6.c(K, 3, tVar));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    b = new wp6();
                    AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                    while (true) {
                        next = xml2.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next == 2) {
                        if (xml2.getName().equals("selector")) {
                            b.d(context2, xml2, asAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b = wp6.b(tVar);
                }
            }
            this.e0 = b;
        }
        this.g0 = K.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(K.getBoolean(0, true));
        K.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    public final void a() {
        int i;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i2 = firstVisibleChildIndex + 1; i2 < getChildCount(); i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i2 - 1);
                if (this.g0 <= 0) {
                    i = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.g0 - i);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.g0 - i;
                    layoutParams.setMarginStart(0);
                }
                materialButton.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.i0 = true;
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.L);
        this.A.add(materialButton.getShapeAppearanceModel());
        this.B.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.h0 != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = Integer.MAX_VALUE;
            for (int i3 = firstVisibleChildIndex; i3 <= lastVisibleChildIndex; i3++) {
                if (c(i3)) {
                    int i4 = 0;
                    if (c(i3) && this.h0 != null) {
                        aq6 aq6Var = this.h0;
                        int width = ((MaterialButton) getChildAt(i3)).getWidth();
                        int i5 = -width;
                        for (int i6 = 0; i6 < aq6Var.a; i6++) {
                            yp6 yp6Var = (yp6) aq6Var.d[i6].A;
                            zp6 zp6Var = yp6Var.a;
                            float f = yp6Var.b;
                            if (zp6Var == zp6.PIXELS) {
                                max = Math.max(i5, f);
                            } else if (zp6Var == zp6.PERCENT) {
                                max = Math.max(i5, width * f);
                            }
                            i5 = (int) max;
                        }
                        int max2 = Math.max(0, i5);
                        int i7 = i3 - 1;
                        while (true) {
                            materialButton = null;
                            if (i7 >= 0) {
                                if (c(i7)) {
                                    materialButton2 = (MaterialButton) getChildAt(i7);
                                    break;
                                }
                                i7--;
                            } else {
                                materialButton2 = null;
                                break;
                            }
                        }
                        if (materialButton2 == null) {
                            allowedWidthDecrease = 0;
                        } else {
                            allowedWidthDecrease = materialButton2.getAllowedWidthDecrease();
                        }
                        int childCount = getChildCount();
                        int i8 = i3 + 1;
                        while (true) {
                            if (i8 >= childCount) {
                                break;
                            } else if (c(i8)) {
                                materialButton = (MaterialButton) getChildAt(i8);
                                break;
                            } else {
                                i8++;
                            }
                        }
                        if (materialButton != null) {
                            i4 = materialButton.getAllowedWidthDecrease();
                        }
                        i4 = Math.min(max2, allowedWidthDecrease + i4);
                    }
                    if (i3 != firstVisibleChildIndex && i3 != lastVisibleChildIndex) {
                        i4 /= 2;
                    }
                    i2 = Math.min(i2, i4);
                }
            }
            for (int i9 = firstVisibleChildIndex; i9 <= lastVisibleChildIndex; i9++) {
                if (c(i9)) {
                    ((MaterialButton) getChildAt(i9)).setSizeChange(this.h0);
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i9);
                    if (i9 != firstVisibleChildIndex && i9 != lastVisibleChildIndex) {
                        i = i2 * 2;
                    } else {
                        i = i2;
                    }
                    materialButton3.setWidthChangeMax(i);
                }
            }
        }
    }

    public final boolean c(int i) {
        if (getChildAt(i).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.u0;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.u0 = null;
                materialButton.r0 = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.R);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.d0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [me6[], java.io.Serializable] */
    public final void e() {
        boolean z;
        boolean z2;
        h03 h03Var;
        boolean z3;
        boolean z4;
        int i;
        xp6 xp6Var;
        if ((this.e0 != null || this.f0 != null) && this.i0) {
            this.i0 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i2 = 0; i2 < childCount; i2++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i2);
                if (materialButton.getVisibility() != 8) {
                    if (i2 == firstVisibleChildIndex) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i2 == lastVisibleChildIndex) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xp6 xp6Var2 = this.f0;
                    if (xp6Var2 == null || (!z && !z2)) {
                        xp6Var2 = (xp6) this.B.get(i2);
                    }
                    if (xp6Var2 == null) {
                        h03Var = new h03((me6) this.A.get(i2));
                    } else {
                        h03 h03Var2 = new h03(1);
                        int i3 = xp6Var2.a;
                        h03Var2.b = i3;
                        h03Var2.c = xp6Var2.b;
                        int[][] iArr = xp6Var2.c;
                        ?? r14 = new int[iArr.length];
                        h03Var2.d = r14;
                        me6[] me6VarArr = xp6Var2.d;
                        h03Var2.e = new me6[me6VarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(me6VarArr, 0, (me6[]) h03Var2.e, 0, h03Var2.b);
                        h03Var2.f = xp6Var2.e;
                        h03Var2.g = xp6Var2.f;
                        h03Var2.h = xp6Var2.g;
                        h03Var2.i = xp6Var2.h;
                        h03Var = h03Var2;
                    }
                    if (getOrientation() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z3) {
                        if (z) {
                            i = 5;
                        } else {
                            i = 0;
                        }
                        if (z2) {
                            i |= 10;
                        }
                        if (z4) {
                            i = ((i & 10) >> 1) | ((i & 5) << 1);
                        }
                    } else {
                        if (z) {
                            i = 3;
                        } else {
                            i = 0;
                        }
                        if (z2) {
                            i |= 12;
                        }
                    }
                    int i4 = ~i;
                    wp6 wp6Var = this.e0;
                    if ((i4 | 1) == i4) {
                        h03Var.f = wp6Var;
                    }
                    if ((i4 | 2) == i4) {
                        h03Var.g = wp6Var;
                    }
                    if ((i4 | 4) == i4) {
                        h03Var.h = wp6Var;
                    }
                    if ((i4 | 8) == i4) {
                        h03Var.i = wp6Var;
                    }
                    if (h03Var.b == 0) {
                        xp6Var = null;
                    } else {
                        xp6Var = new xp6(h03Var);
                    }
                    if (xp6Var.d()) {
                        materialButton.setStateListShapeAppearanceModel(xp6Var);
                    } else {
                        materialButton.setShapeAppearanceModel(xp6Var.c());
                    }
                }
            }
        }
    }

    public aq6 getButtonSizeChange() {
        return this.h0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.d0;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public f61 getInnerCornerSize() {
        return this.e0.b;
    }

    public wp6 getInnerCornerSizeStateList() {
        return this.e0;
    }

    public me6 getShapeAppearance() {
        xp6 xp6Var = this.f0;
        if (xp6Var == null) {
            return null;
        }
        return xp6Var.c();
    }

    public int getSpacing() {
        return this.g0;
    }

    public xp6 getStateListShapeAppearance() {
        return this.f0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        e();
        a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.A.remove(indexOfChild);
            this.B.remove(indexOfChild);
        }
        this.i0 = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(aq6 aq6Var) {
        if (this.h0 != aq6Var) {
            this.h0 = aq6Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z);
        }
    }

    public void setInnerCornerSize(f61 f61Var) {
        this.e0 = wp6.b(f61Var);
        this.i0 = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(wp6 wp6Var) {
        this.e0 = wp6Var;
        this.i0 = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.i0 = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(me6 me6Var) {
        xp6 xp6Var;
        h03 h03Var = new h03(me6Var);
        if (h03Var.b == 0) {
            xp6Var = null;
        } else {
            xp6Var = new xp6(h03Var);
        }
        this.f0 = xp6Var;
        this.i0 = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.g0 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(xp6 xp6Var) {
        this.f0 = xp6Var;
        this.i0 = true;
        e();
        invalidate();
    }
}
