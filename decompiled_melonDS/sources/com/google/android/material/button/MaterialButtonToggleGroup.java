package com.google.android.material.button;

import a6.x0;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.preference.g0;
import ha.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.R;
import na.z;
import sa.a;
import z9.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends d {

    /* renamed from: n0  reason: collision with root package name */
    public static final /* synthetic */ int f3000n0 = 0;

    /* renamed from: h0  reason: collision with root package name */
    public final LinkedHashSet f3001h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3002i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3003j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f3004k0;

    /* renamed from: l0  reason: collision with root package name */
    public final int f3005l0;

    /* renamed from: m0  reason: collision with root package name */
    public HashSet f3006m0;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, 2131952829), attributeSet);
        this.f3001h0 = new LinkedHashSet();
        this.f3002i0 = false;
        this.f3006m0 = new HashSet();
        TypedArray e6 = i.e(getContext(), attributeSet, t9.a.f13161l, R.attr.materialButtonToggleGroupStyle, 2131952829, new int[0]);
        setSingleSelection(e6.getBoolean(7, false));
        this.f3005l0 = e6.getResourceId(2, -1);
        this.f3004k0 = e6.getBoolean(4, false);
        if (this.f14974c0 == null) {
            this.f14974c0 = z.b(new na.a(0.0f));
        }
        setEnabled(e6.getBoolean(0, true));
        e6.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        Class cls;
        if (this.f3003j0) {
            cls = RadioButton.class;
        } else {
            cls = ToggleButton.class;
        }
        return cls.getName();
    }

    private int getVisibleButtonCount() {
        int i2 = 0;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            if ((getChildAt(i10) instanceof MaterialButton) && getChildAt(i10).getVisibility() != 8) {
                i2++;
            }
        }
        return i2;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // z9.d, android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i2, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        f(materialButton.getId(), materialButton.f2986l0);
        x0.o(materialButton, new g0(4, this));
    }

    public final void f(int i2, boolean z10) {
        if (i2 == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i2);
            return;
        }
        HashSet hashSet = new HashSet(this.f3006m0);
        if (z10 && !hashSet.contains(Integer.valueOf(i2))) {
            if (this.f3003j0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i2));
        } else if (!z10 && hashSet.contains(Integer.valueOf(i2))) {
            if (!this.f3004k0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i2));
            }
        } else {
            return;
        }
        g(hashSet);
    }

    public final void g(Set set) {
        HashSet hashSet = this.f3006m0;
        this.f3006m0 = new HashSet(set);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id2 = ((MaterialButton) getChildAt(i2)).getId();
            boolean contains = set.contains(Integer.valueOf(id2));
            View findViewById = findViewById(id2);
            if (findViewById instanceof MaterialButton) {
                this.f3002i0 = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3002i0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id2)) != set.contains(Integer.valueOf(id2))) {
                set.contains(Integer.valueOf(id2));
                Iterator it = this.f3001h0.iterator();
                while (it.hasNext()) {
                    ((com.google.android.material.timepicker.i) it.next()).a();
                }
            }
        }
        invalidate();
    }

    public int getCheckedButtonId() {
        if (this.f3003j0 && !this.f3006m0.isEmpty()) {
            return ((Integer) this.f3006m0.iterator().next()).intValue();
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            int id2 = ((MaterialButton) getChildAt(i2)).getId();
            if (this.f3006m0.contains(Integer.valueOf(id2))) {
                arrayList.add(Integer.valueOf(id2));
            }
        }
        return arrayList;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i2 = this.f3005l0;
        if (i2 != -1) {
            g(Collections.singleton(Integer.valueOf(i2)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i2;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        int visibleButtonCount = getVisibleButtonCount();
        if (this.f3003j0) {
            i2 = 1;
        } else {
            i2 = 2;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, visibleButtonCount, false, i2));
    }

    public void setSelectionRequired(boolean z10) {
        this.f3004k0 = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.f3003j0 != z10) {
            this.f3003j0 = z10;
            g(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            ((MaterialButton) getChildAt(i2)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i2) {
        setSingleSelection(getResources().getBoolean(i2));
    }
}
