package qa;

import a6.d1;
import a6.e1;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends n {

    /* renamed from: e  reason: collision with root package name */
    public final int f12425e;

    /* renamed from: f  reason: collision with root package name */
    public final int f12426f;

    /* renamed from: g  reason: collision with root package name */
    public final TimeInterpolator f12427g;

    /* renamed from: h  reason: collision with root package name */
    public AutoCompleteTextView f12428h;

    /* renamed from: i  reason: collision with root package name */
    public final ah.f f12429i;

    /* renamed from: j  reason: collision with root package name */
    public final jh.a f12430j;

    /* renamed from: k  reason: collision with root package name */
    public final i f12431k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f12432l;
    public boolean m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f12433n;

    /* renamed from: o  reason: collision with root package name */
    public long f12434o;

    /* renamed from: p  reason: collision with root package name */
    public AccessibilityManager f12435p;

    /* renamed from: q  reason: collision with root package name */
    public ValueAnimator f12436q;

    /* renamed from: r  reason: collision with root package name */
    public ValueAnimator f12437r;

    /* JADX WARN: Type inference failed for: r0v2, types: [qa.i] */
    public j(m mVar) {
        super(mVar);
        this.f12429i = new ah.f(4, this);
        this.f12430j = new jh.a(2, this);
        this.f12431k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: qa.i
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z10) {
                int i2;
                j jVar = j.this;
                AutoCompleteTextView autoCompleteTextView = jVar.f12428h;
                if (autoCompleteTextView == null || autoCompleteTextView.getInputType() != 0) {
                    return;
                }
                CheckableImageButton checkableImageButton = jVar.f12459d;
                if (z10) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
                checkableImageButton.setImportantForAccessibility(i2);
            }
        };
        this.f12434o = Long.MAX_VALUE;
        this.f12426f = a.a.T(mVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f12425e = a.a.T(mVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f12427g = a.a.U(mVar.getContext(), R.attr.motionEasingLinearInterpolator, u9.a.f13510a);
    }

    @Override // qa.n
    public final void a() {
        if (this.f12435p.isTouchExplorationEnabled() && this.f12428h.getInputType() != 0 && !this.f12459d.hasFocus()) {
            this.f12428h.dismissDropDown();
        }
        this.f12428h.post(new a8.f(28, this));
    }

    @Override // qa.n
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // qa.n
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // qa.n
    public final View.OnFocusChangeListener e() {
        return this.f12430j;
    }

    @Override // qa.n
    public final View.OnClickListener f() {
        return this.f12429i;
    }

    @Override // qa.n
    public final AccessibilityManager.TouchExplorationStateChangeListener h() {
        return this.f12431k;
    }

    @Override // qa.n
    public final boolean i(int i2) {
        if (i2 != 0) {
            return true;
        }
        return false;
    }

    @Override // qa.n
    public final boolean k() {
        return this.f12433n;
    }

    @Override // qa.n
    public final void l(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.f12428h = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: qa.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        j jVar = j.this;
                        long j2 = uptimeMillis - jVar.f12434o;
                        if (j2 < 0 || j2 > 300) {
                            jVar.m = false;
                        }
                        jVar.t();
                        jVar.m = true;
                        jVar.f12434o = SystemClock.uptimeMillis();
                    }
                    return false;
                }
            });
            this.f12428h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: qa.h
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    j jVar = j.this;
                    jVar.m = true;
                    jVar.f12434o = SystemClock.uptimeMillis();
                    jVar.s(false);
                }
            });
            this.f12428h.setThreshold(0);
            TextInputLayout textInputLayout = this.f12456a;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (editText.getInputType() == 0 && this.f12435p.isTouchExplorationEnabled()) {
                this.f12459d.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        m9.o.r("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // qa.n
    public final void m(b6.g gVar) {
        boolean e6;
        AccessibilityNodeInfo accessibilityNodeInfo = gVar.f2077a;
        if (this.f12428h.getInputType() == 0) {
            gVar.i(Spinner.class.getName());
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            e6 = accessibilityNodeInfo.isShowingHintText();
        } else {
            e6 = gVar.e(4);
        }
        if (e6) {
            if (i2 >= 26) {
                accessibilityNodeInfo.setHintText(null);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", null);
            }
        }
    }

    @Override // qa.n
    public final void n(AccessibilityEvent accessibilityEvent) {
        boolean z10;
        if (!this.f12435p.isEnabled() || this.f12428h.getInputType() != 0) {
            return;
        }
        if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f12433n && !this.f12428h.isPopupShowing()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (accessibilityEvent.getEventType() == 1 || z10) {
            t();
            this.m = true;
            this.f12434o = SystemClock.uptimeMillis();
        }
    }

    @Override // qa.n
    public final void q() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f12427g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f12426f);
        ofFloat.addUpdateListener(new d1(this));
        this.f12437r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f12425e);
        ofFloat2.addUpdateListener(new d1(this));
        this.f12436q = ofFloat2;
        ofFloat2.addListener(new e1(4, this));
        this.f12435p = (AccessibilityManager) this.f12458c.getSystemService("accessibility");
    }

    @Override // qa.n
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.f12428h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f12428h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z10) {
        if (this.f12433n != z10) {
            this.f12433n = z10;
            this.f12437r.cancel();
            this.f12436q.start();
        }
    }

    public final void t() {
        if (this.f12428h == null) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - this.f12434o;
        if (uptimeMillis < 0 || uptimeMillis > 300) {
            this.m = false;
        }
        if (!this.m) {
            s(!this.f12433n);
            boolean z10 = this.f12433n;
            AutoCompleteTextView autoCompleteTextView = this.f12428h;
            if (z10) {
                autoCompleteTextView.requestFocus();
                this.f12428h.showDropDown();
                return;
            }
            autoCompleteTextView.dismissDropDown();
            return;
        }
        this.m = false;
    }
}
