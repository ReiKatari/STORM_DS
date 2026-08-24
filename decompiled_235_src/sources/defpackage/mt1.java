package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt1  reason: default package */
/* loaded from: classes.dex */
public final class mt1 extends us1 implements Runnable {
    public final WeakReference A;

    public mt1(EditText editText) {
        this.A = new WeakReference(editText);
    }

    @Override // defpackage.us1
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
        nt1.a((EditText) this.A.get(), 1);
    }
}
