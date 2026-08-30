package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ur  reason: default package */
/* loaded from: classes.dex */
public final class ur extends io2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;
    public final /* synthetic */ WeakReference l;
    public final /* synthetic */ zr m;

    public ur(zr zrVar, int i, int i2, WeakReference weakReference) {
        this.m = zrVar;
        this.j = i;
        this.k = i2;
        this.l = weakReference;
    }

    @Override // defpackage.io2
    public final void d0(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.j) != -1) {
            if ((this.k & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = yr.a(typeface, i, z);
        }
        zr zrVar = this.m;
        if (zrVar.m) {
            zrVar.l = typeface;
            TextView textView = (TextView) this.l.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = zrVar.j;
                if (isAttachedToWindow) {
                    textView.post(new vr(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // defpackage.io2
    public final void c0(int i) {
    }
}
