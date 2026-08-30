package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dp1  reason: default package */
/* loaded from: classes.dex */
public final class dp1 extends ko1 implements Runnable {
    public final WeakReference A;

    public dp1(EditText editText) {
        this.A = new WeakReference(editText);
    }

    @Override // defpackage.ko1
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.A.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ep1.a((EditText) this.A.get(), 1);
    }
}
