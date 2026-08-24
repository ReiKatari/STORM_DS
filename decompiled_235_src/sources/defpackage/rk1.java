package defpackage;

import android.os.Message;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rk1  reason: default package */
/* loaded from: classes.dex */
public final class rk1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Message B;

    public /* synthetic */ rk1(Message message, int i) {
        this.A = i;
        this.B = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        Message message = this.B;
        switch (i) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + message.what);
            default:
                throw new AssertionError("Unhandled stats message." + message.what);
        }
    }
}
