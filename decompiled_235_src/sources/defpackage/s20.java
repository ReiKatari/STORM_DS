package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s20  reason: default package */
/* loaded from: classes.dex */
public final class s20 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            throw i61.i(message.obj);
        }
        throw i61.i(message.obj);
    }
}
