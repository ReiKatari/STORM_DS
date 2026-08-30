package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y00  reason: default package */
/* loaded from: classes.dex */
public final class y00 implements Handler.Callback {
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            throw b31.l(message.obj);
        }
        throw b31.l(message.obj);
    }
}
