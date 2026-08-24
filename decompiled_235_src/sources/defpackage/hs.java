package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs  reason: default package */
/* loaded from: classes.dex */
public final class hs extends gi2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ WeakReference g;
    public final /* synthetic */ ms h;

    public hs(ms msVar, int i, int i2, WeakReference weakReference) {
        this.h = msVar;
        this.e = i;
        this.f = i2;
        this.g = weakReference;
    }

    @Override // defpackage.gi2
    public final void L(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.e) != -1) {
            if ((this.f & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = ls.a(typeface, i, z);
        }
        ms msVar = this.h;
        if (msVar.m) {
            msVar.l = typeface;
            TextView textView = (TextView) this.g.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = msVar.j;
                if (isAttachedToWindow) {
                    textView.post(new is(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.gi2
    public final void K(int i) {
    }
}
