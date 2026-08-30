package com.squareup.picasso;

import android.os.Message;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Message B;

    public /* synthetic */ i(Message message, int i2) {
        this.A = i2;
        this.B = message;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                throw new AssertionError("Unknown handler message received: " + this.B.what);
            default:
                throw new AssertionError("Unhandled stats message." + this.B.what);
        }
    }
}
