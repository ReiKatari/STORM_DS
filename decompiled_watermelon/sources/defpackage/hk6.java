package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hk6  reason: default package */
/* loaded from: classes.dex */
public final class hk6 {
    public final Object a = new Object();
    public final Size b;
    public final sm1 c;
    public final boolean d;
    public final l90 e;
    public final i90 f;
    public final l90 g;
    public final i90 h;
    public final i90 i;
    public final kx2 j;
    public nx k;
    public hi0 l;
    public np2 m;

    static {
        Range range = jx.h;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [i90, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [pb5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [pb5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [pb5, java.lang.Object] */
    public hk6(Size size, boolean z, sm1 sm1Var, qj6 qj6Var) {
        this.b = size;
        this.d = z;
        nl2.y("SurfaceRequest's DynamicRange must always be fully specified.", sm1Var.b());
        this.c = sm1Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        ?? obj = new Object();
        obj.c = new Object();
        l90 l90Var = new l90(obj);
        obj.b = l90Var;
        obj.a = b31.class;
        try {
            atomicReference.set(obj);
            obj.a = str.concat("-cancellation");
        } catch (Exception e) {
            l90Var.b(e);
        }
        i90 i90Var = (i90) atomicReference.get();
        i90Var.getClass();
        this.i = i90Var;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ?? obj2 = new Object();
        obj2.c = new Object();
        l90 l90Var2 = new l90(obj2);
        obj2.b = l90Var2;
        obj2.a = b31.class;
        try {
            atomicReference2.set(obj2);
            obj2.a = str.concat("-status");
        } catch (Exception e2) {
            l90Var2.b(e2);
        }
        this.g = l90Var2;
        l90Var2.a(new qj2(0, l90Var2, new ci3(27, i90Var, l90Var)), iq2.l());
        i90 i90Var2 = (i90) atomicReference2.get();
        i90Var2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        ?? obj3 = new Object();
        obj3.c = new Object();
        l90 l90Var3 = new l90(obj3);
        obj3.b = l90Var3;
        obj3.a = b31.class;
        try {
            atomicReference3.set(obj3);
            obj3.a = str.concat("-Surface");
        } catch (Exception e3) {
            l90Var3.b(e3);
        }
        this.e = l90Var3;
        i90 i90Var3 = (i90) atomicReference3.get();
        i90Var3.getClass();
        this.f = i90Var3;
        kx2 kx2Var = new kx2(this, size);
        this.j = kx2Var;
        fq3 N = jv3.N(kx2Var.e);
        l90Var3.a(new qj2(0, l90Var3, new n85(N, i90Var2, str, 12)), iq2.l());
        N.a(new qb1(this, 1), iq2.l());
        qf1 l = iq2.l();
        AtomicReference atomicReference4 = new AtomicReference(null);
        l90 k0 = ct3.k0(new hi0(9, this, atomicReference4));
        k0.a(new qj2(0, k0, new dz4(qj6Var)), l);
        i90 i90Var4 = (i90) atomicReference4.get();
        i90Var4.getClass();
        this.h = i90Var4;
    }

    public final void a(final Surface surface, Executor executor, final wz0 wz0Var) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: fk6
                @Override // java.lang.Runnable
                public final void run() {
                    int i = r3;
                    Surface surface2 = surface;
                    wz0 wz0Var2 = wz0Var;
                    switch (i) {
                        case 0:
                            wz0Var2.accept(new mx(2, surface2));
                            return;
                        case 1:
                            wz0Var2.accept(new mx(3, surface2));
                            return;
                        default:
                            wz0Var2.accept(new mx(4, surface2));
                            return;
                    }
                }
            });
            return;
        }
        if (!this.f.a(surface)) {
            l90 l90Var = this.e;
            if (!l90Var.isCancelled()) {
                nl2.D(null, l90Var.B.isDone());
                try {
                    l90Var.get();
                    executor.execute(new Runnable() { // from class: fk6
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = r3;
                            Surface surface2 = surface;
                            wz0 wz0Var2 = wz0Var;
                            switch (i) {
                                case 0:
                                    wz0Var2.accept(new mx(2, surface2));
                                    return;
                                case 1:
                                    wz0Var2.accept(new mx(3, surface2));
                                    return;
                                default:
                                    wz0Var2.accept(new mx(4, surface2));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: fk6
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = r3;
                            Surface surface2 = surface;
                            wz0 wz0Var2 = wz0Var;
                            switch (i) {
                                case 0:
                                    wz0Var2.accept(new mx(2, surface2));
                                    return;
                                case 1:
                                    wz0Var2.accept(new mx(3, surface2));
                                    return;
                                default:
                                    wz0Var2.accept(new mx(4, surface2));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        ci3 ci3Var = new ci3(28, wz0Var, surface);
        l90 l90Var2 = this.g;
        l90Var2.a(new qj2(0, l90Var2, ci3Var), executor);
    }

    public final void b() {
        this.f.c(new Exception("Surface request will not complete."));
    }
}
