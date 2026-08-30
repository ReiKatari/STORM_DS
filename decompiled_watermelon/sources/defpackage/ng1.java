package defpackage;

import android.os.Message;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ng1  reason: default package */
/* loaded from: classes.dex */
public final class ng1 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Message B;

    public /* synthetic */ ng1(Message message, int i) {
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
