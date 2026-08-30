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
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import me.magnum.melondualds.R;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qu3  reason: default package */
/* loaded from: classes.dex */
public abstract class qu3 extends LinearLayout {
    public final ArrayList A;
    public final ArrayList B;
    public final ka3 L;
    public final fs0 R;
    public Integer[] c0;
    public he6 d0;
    public ie6 e0;
    public int f0;
    public le6 g0;
    public boolean h0;

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, le6] */
    public qu3(Context context, AttributeSet attributeSet) {
        super(mh7.n0(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2132018244), attributeSet, R.attr.materialButtonToggleGroupStyle);
        he6 b;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        le6 le6Var;
        this.A = new ArrayList();
        this.B = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.L = new ka3(12, materialButtonToggleGroup);
        this.R = new fs0(1, materialButtonToggleGroup);
        this.h0 = true;
        Context context2 = getContext();
        TypedArray Y = n40.Y(context2, attributeSet, ay4.k, R.attr.materialButtonToggleGroupStyle, 2132018244, new int[0]);
        if (Y.hasValue(2)) {
            int resourceId = Y.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    obj = new Object();
                    obj.c = new int[10];
                    obj.d = new dz4[10];
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
                    le6Var = obj;
                    this.g0 = le6Var;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            le6Var = null;
            this.g0 = le6Var;
        }
        if (Y.hasValue(4)) {
            ie6 b2 = ie6.b(context2, Y, 4);
            this.e0 = b2;
            if (b2 == null) {
                gu2 gu2Var = new gu2(a36.a(context2, Y.getResourceId(4, 0), Y.getResourceId(5, 0), new s(RecyclerView.A1)).a());
                this.e0 = gu2Var.b != 0 ? new ie6(gu2Var) : null;
            }
        }
        if (Y.hasValue(3)) {
            s sVar = new s(RecyclerView.A1);
            int resourceId2 = Y.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b = he6.b(a36.c(Y, 3, sVar));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b = he6.b(a36.c(Y, 3, sVar));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    b = new he6();
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
                    b = he6.b(sVar);
                }
            }
            this.d0 = b;
        }
        this.f0 = Y.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(Y.getBoolean(0, true));
        Y.recycle();
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
                if (this.f0 <= 0) {
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
                    layoutParams.setMarginStart(this.f0 - i);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.f0 - i;
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
        this.h0 = true;
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
        if (this.g0 != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i2 = Preference.DEFAULT_ORDER;
            for (int i3 = firstVisibleChildIndex; i3 <= lastVisibleChildIndex; i3++) {
                if (c(i3)) {
                    int i4 = 0;
                    if (c(i3) && this.g0 != null) {
                        le6 le6Var = this.g0;
                        int width = ((MaterialButton) getChildAt(i3)).getWidth();
                        int i5 = -width;
                        for (int i6 = 0; i6 < le6Var.a; i6++) {
                            je6 je6Var = (je6) le6Var.d[i6].A;
                            ke6 ke6Var = je6Var.a;
                            float f = je6Var.b;
                            if (ke6Var == ke6.PIXELS) {
                                max = Math.max(i5, f);
                            } else if (ke6Var == ke6.PERCENT) {
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
                    ((MaterialButton) getChildAt(i9)).setSizeChange(this.g0);
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
            LinearLayout.LayoutParams layoutParams = materialButton.t0;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.t0 = null;
                materialButton.q0 = -1.0f;
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
        this.c0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, int[][], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v3, types: [a36[], java.io.Serializable] */
    public final void e() {
        boolean z;
        boolean z2;
        gu2 gu2Var;
        boolean z3;
        boolean z4;
        int i;
        ie6 ie6Var;
        if ((this.d0 != null || this.e0 != null) && this.h0) {
            this.h0 = false;
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
                    ie6 ie6Var2 = this.e0;
                    if (ie6Var2 == null || (!z && !z2)) {
                        ie6Var2 = (ie6) this.B.get(i2);
                    }
                    if (ie6Var2 == null) {
                        gu2Var = new gu2((a36) this.A.get(i2));
                    } else {
                        gu2 gu2Var2 = new gu2(1);
                        int i3 = ie6Var2.a;
                        gu2Var2.b = i3;
                        gu2Var2.c = ie6Var2.b;
                        int[][] iArr = ie6Var2.c;
                        ?? r14 = new int[iArr.length];
                        gu2Var2.d = r14;
                        a36[] a36VarArr = ie6Var2.d;
                        gu2Var2.e = new a36[a36VarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i3);
                        System.arraycopy(a36VarArr, 0, (a36[]) gu2Var2.e, 0, gu2Var2.b);
                        gu2Var2.f = ie6Var2.e;
                        gu2Var2.g = ie6Var2.f;
                        gu2Var2.h = ie6Var2.g;
                        gu2Var2.i = ie6Var2.h;
                        gu2Var = gu2Var2;
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
                    he6 he6Var = this.d0;
                    if ((i4 | 1) == i4) {
                        gu2Var.f = he6Var;
                    }
                    if ((i4 | 2) == i4) {
                        gu2Var.g = he6Var;
                    }
                    if ((i4 | 4) == i4) {
                        gu2Var.h = he6Var;
                    }
                    if ((i4 | 8) == i4) {
                        gu2Var.i = he6Var;
                    }
                    if (gu2Var.b == 0) {
                        ie6Var = null;
                    } else {
                        ie6Var = new ie6(gu2Var);
                    }
                    if (ie6Var.d()) {
                        materialButton.setStateListShapeAppearanceModel(ie6Var);
                    } else {
                        materialButton.setShapeAppearanceModel(ie6Var.c());
                    }
                }
            }
        }
    }

    public le6 getButtonSizeChange() {
        return this.g0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.c0;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i2;
    }

    public y21 getInnerCornerSize() {
        return this.d0.b;
    }

    public he6 getInnerCornerSizeStateList() {
        return this.d0;
    }

    public a36 getShapeAppearance() {
        ie6 ie6Var = this.e0;
        if (ie6Var == null) {
            return null;
        }
        return ie6Var.c();
    }

    public int getSpacing() {
        return this.f0;
    }

    public ie6 getStateListShapeAppearance() {
        return this.e0;
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
        this.h0 = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(le6 le6Var) {
        if (this.g0 != le6Var) {
            this.g0 = le6Var;
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

    public void setInnerCornerSize(y21 y21Var) {
        this.d0 = he6.b(y21Var);
        this.h0 = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(he6 he6Var) {
        this.d0 = he6Var;
        this.h0 = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.h0 = true;
        }
        super.setOrientation(i);
    }

    public void setShapeAppearance(a36 a36Var) {
        ie6 ie6Var;
        gu2 gu2Var = new gu2(a36Var);
        if (gu2Var.b == 0) {
            ie6Var = null;
        } else {
            ie6Var = new ie6(gu2Var);
        }
        this.e0 = ie6Var;
        this.h0 = true;
        e();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f0 = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(ie6 ie6Var) {
        this.e0 = ie6Var;
        this.h0 = true;
        e();
        invalidate();
    }
}
