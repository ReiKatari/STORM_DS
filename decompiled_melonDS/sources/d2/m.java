package d2;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import c8.d0;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3746a;

    /* renamed from: b  reason: collision with root package name */
    public final View f3747b;

    public m(View view) {
        this.f3747b = view;
        this.f3746a = p7.a.s(yb.h.NONE, new a2.n(8, this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yb.f, java.lang.Object] */
    public InputMethodManager a() {
        return (InputMethodManager) this.f3746a.getValue();
    }

    public AutofillId b(long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession g10 = e4.a.g(this.f3746a);
            b6.f B = q8.r.B(this.f3747b);
            Objects.requireNonNull(B);
            return d0.c(g10, c3.p.i(B.f2075b), j2);
        }
        return null;
    }

    public m(ContentCaptureSession contentCaptureSession, View view) {
        this.f3746a = contentCaptureSession;
        this.f3747b = view;
    }
}
