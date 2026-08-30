package z9;

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
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import ha.i;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TreeMap;
import l.i0;
import me.magnum.melonds.R;
import na.a0;
import na.b0;
import na.c0;
import na.d0;
import na.e0;
import na.n;
import na.z;
import org.xmlpull.v1.XmlPullParserException;
import rd.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d extends LinearLayout {
    public final ArrayList A;
    public final ArrayList B;
    public final k L;
    public final bc.a R;

    /* renamed from: b0  reason: collision with root package name */
    public Integer[] f14973b0;

    /* renamed from: c0  reason: collision with root package name */
    public z f14974c0;

    /* renamed from: d0  reason: collision with root package name */
    public b0 f14975d0;

    /* renamed from: e0  reason: collision with root package name */
    public int f14976e0;

    /* renamed from: f0  reason: collision with root package name */
    public e0 f14977f0;

    /* renamed from: g0  reason: collision with root package name */
    public boolean f14978g0;

    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, na.e0] */
    public d(Context context, AttributeSet attributeSet) {
        super(sa.a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952689), attributeSet, R.attr.materialButtonToggleGroupStyle);
        z b10;
        int next;
        XmlResourceParser xml;
        ?? obj;
        AttributeSet asAttributeSet;
        int next2;
        e0 e0Var;
        this.A = new ArrayList();
        this.B = new ArrayList();
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.L = new k(27, materialButtonToggleGroup);
        this.R = new bc.a(3, materialButtonToggleGroup);
        this.f14978g0 = true;
        Context context2 = getContext();
        TypedArray e6 = i.e(context2, attributeSet, t9.a.f13160k, R.attr.materialButtonToggleGroupStyle, 2131952689, new int[0]);
        if (e6.hasValue(2)) {
            int resourceId = e6.getResourceId(2, 0);
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    obj = new Object();
                    obj.f10141c = new int[10];
                    obj.f10142d = new i0[10];
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
                    e0Var = obj;
                    this.f14977f0 = e0Var;
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            }
            e0Var = null;
            this.f14977f0 = e0Var;
        }
        if (e6.hasValue(4)) {
            b0 b11 = b0.b(context2, e6, 4);
            this.f14975d0 = b11;
            if (b11 == null) {
                a0 a0Var = new a0(n.a(context2, e6.getResourceId(4, 0), e6.getResourceId(5, 0), new na.a(0)).a());
                this.f14975d0 = a0Var.f10118b != 0 ? new b0(a0Var) : null;
            }
        }
        if (e6.hasValue(3)) {
            na.a aVar = new na.a(0.0f);
            int resourceId2 = e6.getResourceId(3, 0);
            if (resourceId2 == 0) {
                b10 = z.b(n.c(e6, 3, aVar));
            } else if (!context2.getResources().getResourceTypeName(resourceId2).equals("xml")) {
                b10 = z.b(n.c(e6, 3, aVar));
            } else {
                try {
                    XmlResourceParser xml2 = context2.getResources().getXml(resourceId2);
                    b10 = new z();
                    AttributeSet asAttributeSet2 = Xml.asAttributeSet(xml2);
                    while (true) {
                        next = xml2.next();
                        if (next == 2 || next == 1) {
                            break;
                        }
                    }
                    if (next == 2) {
                        if (xml2.getName().equals("selector")) {
                            b10.d(context2, xml2, asAttributeSet2, context2.getTheme());
                        }
                        xml2.close();
                    } else {
                        throw new XmlPullParserException("No start tag found");
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    b10 = z.b(aVar);
                }
            }
            this.f14974c0 = b10;
        }
        this.f14976e0 = e6.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(e6.getBoolean(0, true));
        e6.recycle();
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (c(i2)) {
                return i2;
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
        int i2;
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i10 - 1);
                if (this.f14976e0 <= 0) {
                    i2 = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    i2 = 0;
                }
                ViewGroup.LayoutParams layoutParams2 = materialButton.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(this.f14976e0 - i2);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = this.f14976e0 - i2;
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
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        d();
        this.f14978g0 = true;
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.L);
        this.A.add(materialButton.getShapeAppearanceModel());
        this.B.add(materialButton.getStateListShapeAppearanceModel());
        materialButton.setEnabled(isEnabled());
    }

    public final void b() {
        int i2;
        MaterialButton materialButton;
        MaterialButton materialButton2;
        int allowedWidthDecrease;
        float max;
        if (this.f14977f0 != null && getChildCount() != 0) {
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i10 = Preference.DEFAULT_ORDER;
            for (int i11 = firstVisibleChildIndex; i11 <= lastVisibleChildIndex; i11++) {
                if (c(i11)) {
                    int i12 = 0;
                    if (c(i11) && this.f14977f0 != null) {
                        e0 e0Var = this.f14977f0;
                        int width = ((MaterialButton) getChildAt(i11)).getWidth();
                        int i13 = -width;
                        for (int i14 = 0; i14 < e0Var.f10139a; i14++) {
                            c0 c0Var = (c0) e0Var.f10142d[i14].B;
                            d0 d0Var = c0Var.f10137a;
                            float f8 = c0Var.f10138b;
                            if (d0Var == d0.PIXELS) {
                                max = Math.max(i13, f8);
                            } else if (d0Var == d0.PERCENT) {
                                max = Math.max(i13, width * f8);
                            }
                            i13 = (int) max;
                        }
                        int max2 = Math.max(0, i13);
                        int i15 = i11 - 1;
                        while (true) {
                            materialButton = null;
                            if (i15 >= 0) {
                                if (c(i15)) {
                                    materialButton2 = (MaterialButton) getChildAt(i15);
                                    break;
                                }
                                i15--;
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
                        int i16 = i11 + 1;
                        while (true) {
                            if (i16 >= childCount) {
                                break;
                            } else if (c(i16)) {
                                materialButton = (MaterialButton) getChildAt(i16);
                                break;
                            } else {
                                i16++;
                            }
                        }
                        if (materialButton != null) {
                            i12 = materialButton.getAllowedWidthDecrease();
                        }
                        i12 = Math.min(max2, allowedWidthDecrease + i12);
                    }
                    if (i11 != firstVisibleChildIndex && i11 != lastVisibleChildIndex) {
                        i12 /= 2;
                    }
                    i10 = Math.min(i10, i12);
                }
            }
            for (int i17 = firstVisibleChildIndex; i17 <= lastVisibleChildIndex; i17++) {
                if (c(i17)) {
                    ((MaterialButton) getChildAt(i17)).setSizeChange(this.f14977f0);
                    MaterialButton materialButton3 = (MaterialButton) getChildAt(i17);
                    if (i17 != firstVisibleChildIndex && i17 != lastVisibleChildIndex) {
                        i2 = i10 * 2;
                    } else {
                        i2 = i10;
                    }
                    materialButton3.setWidthChangeMax(i2);
                }
            }
        }
    }

    public final boolean c(int i2) {
        if (getChildAt(i2).getVisibility() != 8) {
            return true;
        }
        return false;
    }

    public final void d() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i2);
            LinearLayout.LayoutParams layoutParams = materialButton.f2992s0;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f2992s0 = null;
                materialButton.p0 = -1.0f;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.R);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            treeMap.put((MaterialButton) getChildAt(i2), Integer.valueOf(i2));
        }
        this.f14973b0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Type inference failed for: r14v1, types: [int[][], java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v2, types: [na.n[], java.io.Serializable] */
    public final void e() {
        boolean z10;
        boolean z11;
        a0 a0Var;
        boolean z12;
        boolean z13;
        int i2;
        b0 b0Var;
        if ((this.f14974c0 != null || this.f14975d0 != null) && this.f14978g0) {
            this.f14978g0 = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            for (int i10 = 0; i10 < childCount; i10++) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i10);
                if (materialButton.getVisibility() != 8) {
                    if (i10 == firstVisibleChildIndex) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i10 == lastVisibleChildIndex) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    b0 b0Var2 = this.f14975d0;
                    if (b0Var2 == null || (!z10 && !z11)) {
                        b0Var2 = (b0) this.B.get(i10);
                    }
                    if (b0Var2 == null) {
                        a0Var = new a0((n) this.A.get(i10));
                    } else {
                        a0 a0Var2 = new a0(0);
                        int i11 = b0Var2.f10128a;
                        a0Var2.f10118b = i11;
                        a0Var2.f10119c = b0Var2.f10129b;
                        int[][] iArr = b0Var2.f10130c;
                        ?? r14 = new int[iArr.length];
                        a0Var2.f10120d = r14;
                        n[] nVarArr = b0Var2.f10131d;
                        a0Var2.f10121e = new n[nVarArr.length];
                        System.arraycopy(iArr, 0, r14, 0, i11);
                        System.arraycopy(nVarArr, 0, (n[]) a0Var2.f10121e, 0, a0Var2.f10118b);
                        a0Var2.f10122f = b0Var2.f10132e;
                        a0Var2.f10123g = b0Var2.f10133f;
                        a0Var2.f10124h = b0Var2.f10134g;
                        a0Var2.f10125i = b0Var2.f10135h;
                        a0Var = a0Var2;
                    }
                    if (getOrientation() == 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (getLayoutDirection() == 1) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z12) {
                        if (z10) {
                            i2 = 5;
                        } else {
                            i2 = 0;
                        }
                        if (z11) {
                            i2 |= 10;
                        }
                        if (z13) {
                            i2 = ((i2 & 10) >> 1) | ((i2 & 5) << 1);
                        }
                    } else {
                        if (z10) {
                            i2 = 3;
                        } else {
                            i2 = 0;
                        }
                        if (z11) {
                            i2 |= 12;
                        }
                    }
                    int i12 = ~i2;
                    z zVar = this.f14974c0;
                    if ((i12 | 1) == i12) {
                        a0Var.f10122f = zVar;
                    }
                    if ((i12 | 2) == i12) {
                        a0Var.f10123g = zVar;
                    }
                    if ((i12 | 4) == i12) {
                        a0Var.f10124h = zVar;
                    }
                    if ((i12 | 8) == i12) {
                        a0Var.f10125i = zVar;
                    }
                    if (a0Var.f10118b == 0) {
                        b0Var = null;
                    } else {
                        b0Var = new b0(a0Var);
                    }
                    if (b0Var.d()) {
                        materialButton.setStateListShapeAppearanceModel(b0Var);
                    } else {
                        materialButton.setShapeAppearanceModel(b0Var.c());
                    }
                }
            }
        }
    }

    public e0 getButtonSizeChange() {
        return this.f14977f0;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i2, int i10) {
        Integer[] numArr = this.f14973b0;
        if (numArr != null && i10 < numArr.length) {
            return numArr[i10].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i10;
    }

    public na.d getInnerCornerSize() {
        return this.f14974c0.f10249b;
    }

    public z getInnerCornerSizeStateList() {
        return this.f14974c0;
    }

    public n getShapeAppearance() {
        b0 b0Var = this.f14975d0;
        if (b0Var == null) {
            return null;
        }
        return b0Var.c();
    }

    public int getSpacing() {
        return this.f14976e0;
    }

    public b0 getStateListShapeAppearance() {
        return this.f14975d0;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        if (z10) {
            d();
            b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i2, int i10) {
        e();
        a();
        super.onMeasure(i2, i10);
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
        this.f14978g0 = true;
        e();
        d();
        a();
    }

    public void setButtonSizeChange(e0 e0Var) {
        if (this.f14977f0 != e0Var) {
            this.f14977f0 = e0Var;
            b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setEnabled(z10);
        }
    }

    public void setInnerCornerSize(na.d dVar) {
        this.f14974c0 = z.b(dVar);
        this.f14978g0 = true;
        e();
        invalidate();
    }

    public void setInnerCornerSizeStateList(z zVar) {
        this.f14974c0 = zVar;
        this.f14978g0 = true;
        e();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (getOrientation() != i2) {
            this.f14978g0 = true;
        }
        super.setOrientation(i2);
    }

    public void setShapeAppearance(n nVar) {
        b0 b0Var;
        a0 a0Var = new a0(nVar);
        if (a0Var.f10118b == 0) {
            b0Var = null;
        } else {
            b0Var = new b0(a0Var);
        }
        this.f14975d0 = b0Var;
        this.f14978g0 = true;
        e();
        invalidate();
    }

    public void setSpacing(int i2) {
        this.f14976e0 = i2;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(b0 b0Var) {
        this.f14975d0 = b0Var;
        this.f14978g0 = true;
        e();
        invalidate();
    }
}
