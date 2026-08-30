package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gq3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class gq3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ AtomicBoolean B;

    public /* synthetic */ gq3(AtomicBoolean atomicBoolean, int i) {
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
