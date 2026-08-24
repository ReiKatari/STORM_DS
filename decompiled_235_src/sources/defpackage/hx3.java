package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hx3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hx3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ AtomicBoolean B;

    public /* synthetic */ hx3(AtomicBoolean atomicBoolean, int i) {
        this.A = i;
        this.B = atomicBoolean;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        AtomicBoolean atomicBoolean = this.B;
        switch (i) {
            case 0:
                atomicBoolean.set(true);
                return;
            default:
                atomicBoolean.set(true);
                return;
        }
    }
}
