package pa;

import android.os.Handler;
import android.os.Message;
import b6.f;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f11530a;

    public d(f fVar) {
        this.f11530a = fVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        f fVar = this.f11530a;
        if (message.obj != null) {
            o.b();
            return false;
        }
        synchronized (fVar.f2075b) {
            throw null;
        }
    }
}
