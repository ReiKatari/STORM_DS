package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl6  reason: default package */
/* loaded from: classes.dex */
public final class kl6 implements Handler.Callback {
    public final /* synthetic */ u2 a;

    public kl6(u2 u2Var) {
        this.a = u2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        u2 u2Var = this.a;
        if (message.obj != null) {
            u34.a();
            return false;
        }
        synchronized (u2Var.b) {
            throw null;
        }
    }
}
