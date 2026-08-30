package com.squareup.picasso;

import java.util.concurrent.ThreadFactory;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3246a;

    public /* synthetic */ j0(int i2) {
        this.f3246a = i2;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3246a) {
            case 0:
                return new i0(runnable);
            case DSiCameraSource.FrontCamera /* 1 */:
                Thread thread = new Thread(runnable);
                thread.setPriority(10);
                thread.setName("CameraX-camerax_high_priority");
                return thread;
            default:
                return new v5.h(runnable);
        }
    }
}
