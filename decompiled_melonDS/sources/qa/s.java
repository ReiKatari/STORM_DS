package qa;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.R;
import q.d2;
import q.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s extends q.n {

    /* renamed from: b0  reason: collision with root package name */
    public final d2 f12491b0;

    /* renamed from: c0  reason: collision with root package name */
    public final AccessibilityManager f12492c0;

    /* renamed from: d0  reason: collision with root package name */
    public final Rect f12493d0;

    /* renamed from: e0  reason: collision with root package name */
    public final int f12494e0;

    /* renamed from: f0  reason: collision with root package name */
    public final float f12495f0;

    /* renamed from: g0  reason: collision with root package name */
    public ColorStateList f12496g0;

    /* renamed from: h0  reason: collision with root package name */
    public int f12497h0;

    /* renamed from: i0  reason: collision with root package name */
    public ColorStateList f12498i0;

    public s(Context context, AttributeSet attributeSet) {
        super(sa.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f12493d0 = new Rect();
        Context context2 = getContext();
        TypedArray e6 = ha.i.e(context2, attributeSet, t9.a.f13158i, R.attr.autoCompleteTextViewStyle, 2131952500, new int[0]);
        if (e6.hasValue(0) && e6.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f12494e0 = e6.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f12495f0 = e6.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (e6.hasValue(2)) {
            this.f12496g0 = ColorStateList.valueOf(e6.getColor(2, 0));
        }
        this.f12497h0 = e6.getColor(4, 0);
        this.f12498i0 = k7.w.m(context2, e6, 5);
        this.f12492c0 = (AccessibilityManager) context2.getSystemService("accessibility");
        d2 d2Var = new d2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f12491b0 = d2Var;
        d2Var.f11881s0 = true;
        d2Var.f11882t0.setFocusable(true);
        d2Var.f11872i0 = this;
        d2Var.f11882t0.setInputMethodMode(2);
        d2Var.p(getAdapter());
        d2Var.f11873j0 = new j0(2, this);
        if (e6.hasValue(6)) {
            setSimpleItems(e6.getResourceId(6, 0));
        }
        e6.recycle();
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f12492c0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() != null && accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (c()) {
            this.f12491b0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f12496g0;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b10 = b();
        if (b10 != null && b10.C0) {
            return b10.getHint();
        }
        return super.getHint();
    }

    public float getPopupElevation() {
        return this.f12495f0;
    }

    public int getSimpleItemSelectedColor() {
        return this.f12497h0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f12498i0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout b10 = b();
        if (b10 != null && b10.C0 && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f12491b0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i2, int i10) {
        int selectedItemPosition;
        super.onMeasure(i2, i10);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b10 = b();
            int i11 = 0;
            if (adapter != null && b10 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                d2 d2Var = this.f12491b0;
                if (!d2Var.f11882t0.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = d2Var.L.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i12 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i11) {
                        view = null;
                        i11 = itemViewType;
                    }
                    view = adapter.getView(max, view, b10);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i12 = Math.max(i12, view.getMeasuredWidth());
                }
                Drawable background = d2Var.f11882t0.getBackground();
                if (background != null) {
                    Rect rect = this.f12493d0;
                    background.getPadding(rect);
                    i12 += rect.left + rect.right;
                }
                i11 = b10.getEndIconView().getMeasuredWidth() + i12;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i11), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t5) {
        super.setAdapter(t5);
        this.f12491b0.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        d2 d2Var = this.f12491b0;
        if (d2Var != null) {
            d2Var.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i2) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i2));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f12496g0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof na.j) {
            ((na.j) dropDownBackground).n(this.f12496g0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f12491b0.f11874k0 = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i2) {
        super.setRawInputType(i2);
        TextInputLayout b10 = b();
        if (b10 != null) {
            b10.u();
        }
    }

    public void setSimpleItemSelectedColor(int i2) {
        this.f12497h0 = i2;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f12498i0 = colorStateList;
        if (getAdapter() instanceof r) {
            ((r) getAdapter()).a();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new r(this, getContext(), this.f12494e0, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (c()) {
            this.f12491b0.c();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(int i2) {
        setSimpleItems(getResources().getStringArray(i2));
    }
}
