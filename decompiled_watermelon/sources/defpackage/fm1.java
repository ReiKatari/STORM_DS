package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fm1  reason: default package */
/* loaded from: classes.dex */
public final class fm1 implements dk6, SurfaceTexture.OnFrameAvailableListener {
    public final bm1 a;
    public final HandlerThread b;
    public final np2 c;
    public final Handler d;
    public int e;
    public boolean f;
    public final AtomicBoolean g;
    public final LinkedHashMap h;
    public SurfaceTexture i;
    public SurfaceTexture j;

    public fm1(sm1 sm1Var, q03 q03Var, q03 q03Var2) {
        Map map = Collections.EMPTY_MAP;
        this.e = 0;
        this.f = false;
        this.g = new AtomicBoolean(false);
        this.h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new np2(handler);
        this.a = new bm1(q03Var, q03Var2);
        try {
            f(sm1Var);
        } catch (RuntimeException e) {
            a();
            throw e;
        }
    }

    @Override // defpackage.dk6
    public final void a() {
        if (this.g.getAndSet(true)) {
            return;
        }
        e(new m0(20, this), new rd(4));
    }

    @Override // defpackage.dk6
    public final void b(ck6 ck6Var) {
        if (this.g.get()) {
            ck6Var.close();
            return;
        }
        we weVar = new we(20, this, ck6Var);
        Objects.requireNonNull(ck6Var);
        e(weVar, new m0(17, ck6Var));
    }

    @Override // defpackage.dk6
    public final void c(hk6 hk6Var) {
        if (this.g.get()) {
            hk6Var.b();
        } else {
            e(new we(19, this, hk6Var), new qb1(hk6Var, 0));
        }
    }

    public final void d() {
        if (this.f && this.e == 0) {
            LinkedHashMap linkedHashMap = this.h;
            for (ck6 ck6Var : linkedHashMap.keySet()) {
                ck6Var.close();
            }
            linkedHashMap.clear();
            bm1 bm1Var = this.a;
            if (((AtomicBoolean) bm1Var.L).getAndSet(false)) {
                xj2.c((Thread) bm1Var.X);
                bm1Var.r();
            }
            bm1Var.i0 = -1;
            bm1Var.j0 = -1;
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new u(this, runnable2, runnable, 14));
        } catch (RejectedExecutionException e) {
            ve2.d0("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [pb5, java.lang.Object] */
    public final void f(sm1 sm1Var) {
        Map map = Collections.EMPTY_MAP;
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            e(new u(this, sm1Var, (i90) obj), new rd(4));
            obj.a = "Init GlRenderer";
        } catch (Exception e) {
            l90Var.b(e);
        }
        try {
            l90Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.g.get() && (surfaceTexture2 = this.i) != null && this.j != null) {
            surfaceTexture2.updateTexImage();
            this.j.updateTexImage();
            for (Map.Entry entry : this.h.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                ck6 ck6Var = (ck6) entry.getKey();
                if (ck6Var.L == 34) {
                    try {
                        this.a.v(surfaceTexture.getTimestamp(), surface, ck6Var, this.i, this.j);
                    } catch (RuntimeException e) {
                        ve2.x("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                    }
                }
            }
        }
    }
}
