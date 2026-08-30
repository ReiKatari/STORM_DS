package q;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r0 extends p5.b {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f12004h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12005i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ WeakReference f12006j;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ v0 f12007k;

    public r0(v0 v0Var, int i2, int i10, WeakReference weakReference) {
        this.f12007k = v0Var;
        this.f12004h = i2;
        this.f12005i = i10;
        this.f12006j = weakReference;
    }

    @Override // p5.b
    public final void j(Typeface typeface) {
        int i2;
        boolean z10;
        if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f12004h) != -1) {
            if ((this.f12005i & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            typeface = u0.a(typeface, i2, z10);
        }
        v0 v0Var = this.f12007k;
        if (v0Var.m) {
            v0Var.f12041l = typeface;
            TextView textView = (TextView) this.f12006j.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i10 = v0Var.f12039j;
                if (isAttachedToWindow) {
                    textView.post(new m0.l(textView, typeface, i10));
                } else {
                    textView.setTypeface(typeface, i10);
                }
            }
        }
    }

    @Override // p5.b
    public final void i(int i2) {
    }
}
