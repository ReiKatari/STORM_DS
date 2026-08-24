package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vp1  reason: default package */
/* loaded from: classes.dex */
public final class vp1 extends o42 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final hr0 i;
    public final ir0 j;
    public final up1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [up1] */
    public vp1(n42 n42Var) {
        super(n42Var);
        this.i = new hr0(this, 1);
        this.j = new ir0(this, 1);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: up1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                int i;
                vp1 vp1Var = vp1.this;
                AutoCompleteTextView autoCompleteTextView = vp1Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = vp1Var.d;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                checkableImageButton.setImportantForAccessibility(i);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = kj2.W(n42Var.getContext(), R.attr.motionDurationShort3, 67);
        this.e = kj2.W(n42Var.getContext(), R.attr.motionDurationShort3, 50);
        this.g = kj2.X(n42Var.getContext(), R.attr.motionEasingLinearInterpolator, vo.a);
    }

    @Override // defpackage.o42
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new n0(this, 19));
    }

    @Override // defpackage.o42
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.o42
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.o42
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.o42
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.o42
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.o42
    public final boolean i(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o42
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.o42
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new sp1(this, 0));
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: tp1
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    vp1 vp1Var = vp1.this;
                    vp1Var.m = true;
                    vp1Var.o = SystemClock.uptimeMillis();
                    vp1Var.s(false);
                }
            });
            this.h.setThreshold(0);
            TextInputLayout textInputLayout = this.a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.p.isTouchExplorationEnabled()) {
                this.d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        u34.j("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.o42
    public final void m(v2 v2Var) {
        boolean e;
        AccessibilityNodeInfo accessibilityNodeInfo = v2Var.a;
        if (this.h.getInputType() == 0) {
            v2Var.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            e = accessibilityNodeInfo.isShowingHintText();
        } else {
            e = v2Var.e(4);
        }
        if (e) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // defpackage.o42
    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (!this.p.isEnabled() || this.h.getInputType() != 0) {
            return;
        }
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing()) {
            z = true;
        } else {
            z = false;
        }
        if (accessibilityEvent.getEventType() == 1 || z) {
            t();
            this.m = true;
            this.o = SystemClock.uptimeMillis();
        }
    }

    @Override // defpackage.o42
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.B1, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new rp1(this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.B1);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new rp1(this));
        this.q = ofFloat2;
        ofFloat2.addListener(new s7(this, 3));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.o42
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (!this.m) {
            s(!this.n);
            boolean z = this.n;
            AutoCompleteTextView autoCompleteTextView = this.h;
            if (z) {
                autoCompleteTextView.requestFocus();
                this.h.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.m = false;
    }
}
