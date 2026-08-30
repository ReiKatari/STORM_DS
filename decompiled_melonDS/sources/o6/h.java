package o6;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends m6.g implements Runnable {
    public final WeakReference A;

    public h(EditText editText) {
        this.A = new WeakReference(editText);
    }

    @Override // m6.g
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
        i.a((EditText) this.A.get(), 1);
    }
}
