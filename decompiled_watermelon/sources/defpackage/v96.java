package defpackage;

import android.os.Handler;
import android.os.Message;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v96  reason: default package */
/* loaded from: classes.dex */
public final class v96 implements Handler.Callback {
    public final /* synthetic */ s2 a;

    public v96(s2 s2Var) {
        this.a = s2Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        s2 s2Var = this.a;
        if (message.obj != null) {
            c44.b();
            return false;
        }
        synchronized (s2Var.b) {
            throw null;
        }
    }
}
