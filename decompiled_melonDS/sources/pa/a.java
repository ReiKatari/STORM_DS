package pa;

import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            throw w.d.j(message.obj);
        }
        throw w.d.j(message.obj);
    }
}
