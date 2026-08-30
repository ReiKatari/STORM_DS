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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ol1  reason: default package */
/* loaded from: classes.dex */
public final class ol1 extends zz1 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final xo0 i;
    public final yo0 j;
    public final nl1 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    /* JADX WARN: Type inference failed for: r0v2, types: [nl1] */
    public ol1(yz1 yz1Var) {
        super(yz1Var);
        this.i = new xo0(1, this);
        this.j = new yo0(1, this);
        this.k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: nl1
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                int i;
                ol1 ol1Var = ol1.this;
                AutoCompleteTextView autoCompleteTextView = ol1Var.h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = ol1Var.d;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                checkableImageButton.setImportantForAccessibility(i);
            }
        };
        this.o = Long.MAX_VALUE;
        this.f = me2.M(yz1Var.getContext(), R.attr.motionDurationShort3, 67);
        this.e = me2.M(yz1Var.getContext(), R.attr.motionDurationShort3, 50);
        this.g = me2.N(yz1Var.getContext(), R.attr.motionEasingLinearInterpolator, jo.a);
    }

    @Override // defpackage.zz1
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new m0(19, this));
    }

    @Override // defpackage.zz1
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.zz1
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // defpackage.zz1
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.zz1
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.zz1
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.k;
    }

    @Override // defpackage.zz1
    public final boolean i(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.zz1
    public final boolean k() {
        return this.n;
    }

    @Override // defpackage.zz1
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new ll1(0, this));
            this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: ml1
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    ol1 ol1Var = ol1.this;
                    ol1Var.m = true;
                    ol1Var.o = SystemClock.uptimeMillis();
                    ol1Var.s(false);
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
        f81.w("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // defpackage.zz1
    public final void m(t2 t2Var) {
        boolean e;
        AccessibilityNodeInfo accessibilityNodeInfo = t2Var.a;
        if (this.h.getInputType() == 0) {
            t2Var.i(Spinner.class.getName());
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            e = accessibilityNodeInfo.isShowingHintText();
        } else {
            e = t2Var.e(4);
        }
        if (e) {
            if (i >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // defpackage.zz1
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

    @Override // defpackage.zz1
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.A1, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f);
        ofFloat.addUpdateListener(new kl1(this));
        this.r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, RecyclerView.A1);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.e);
        ofFloat2.addUpdateListener(new kl1(this));
        this.q = ofFloat2;
        ofFloat2.addListener(new r7(2, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.zz1
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
