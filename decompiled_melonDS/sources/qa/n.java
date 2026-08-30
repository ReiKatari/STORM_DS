package qa;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public final TextInputLayout f12456a;

    /* renamed from: b  reason: collision with root package name */
    public final m f12457b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f12458c;

    /* renamed from: d  reason: collision with root package name */
    public final CheckableImageButton f12459d;

    public n(m mVar) {
        this.f12456a = mVar.A;
        this.f12457b = mVar;
        this.f12458c = mVar.getContext();
        this.f12459d = mVar.f12441d0;
    }

    public int c() {
        return 0;
    }

    public int d() {
        return 0;
    }

    public View.OnFocusChangeListener e() {
        return null;
    }

    public View.OnClickListener f() {
        return null;
    }

    public View.OnFocusChangeListener g() {
        return null;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    public boolean i(int i2) {
        return true;
    }

    public boolean j() {
        return this instanceof j;
    }

    public boolean k() {
        return false;
    }

    public final void p() {
        this.f12457b.f(false);
    }

    public void a() {
    }

    public void b() {
    }

    public void q() {
    }

    public void r() {
    }

    public void l(EditText editText) {
    }

    public void m(b6.g gVar) {
    }

    public void n(AccessibilityEvent accessibilityEvent) {
    }

    public void o(boolean z10) {
    }
}
