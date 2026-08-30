package d0;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f3445a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Size f3446b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f3447c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f3448d;

    /* renamed from: e  reason: collision with root package name */
    public final b5.l f3449e;

    /* renamed from: f  reason: collision with root package name */
    public final b5.i f3450f;

    /* renamed from: g  reason: collision with root package name */
    public final b5.l f3451g;

    /* renamed from: h  reason: collision with root package name */
    public final b5.i f3452h;

    /* renamed from: i  reason: collision with root package name */
    public final b5.i f3453i;

    /* renamed from: j  reason: collision with root package name */
    public final p1 f3454j;

    /* renamed from: k  reason: collision with root package name */
    public k f3455k;

    /* renamed from: l  reason: collision with root package name */
    public bi.h f3456l;
    public l0.d m;

    static {
        Range range = j0.k.f7234h;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, b5.n] */
    public r1(Size size, boolean z10, a0 a0Var, r0.f fVar) {
        this.f3446b = size;
        this.f3448d = z10;
        p7.m.g("SurfaceRequest's DynamicRange must always be fully specified.", a0Var.b());
        this.f3447c = a0Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        ?? obj = new Object();
        obj.f2053c = new Object();
        b5.l lVar = new b5.l(obj);
        obj.f2052b = lVar;
        obj.f2051a = w.d.class;
        try {
            atomicReference.set(obj);
            obj.f2051a = str.concat("-cancellation");
        } catch (Exception e6) {
            lVar.b(e6);
        }
        b5.i iVar = (b5.i) atomicReference.get();
        iVar.getClass();
        this.f3453i = iVar;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ?? obj2 = new Object();
        obj2.f2053c = new Object();
        b5.l lVar2 = new b5.l(obj2);
        obj2.f2052b = lVar2;
        obj2.f2051a = w.d.class;
        try {
            atomicReference2.set(obj2);
            obj2.f2051a = str.concat("-status");
        } catch (Exception e10) {
            lVar2.b(e10);
        }
        this.f3451g = lVar2;
        lVar2.a(new m0.h(0, lVar2, new z(1, iVar, lVar)), ij.a.D());
        b5.i iVar2 = (b5.i) atomicReference2.get();
        iVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        ?? obj3 = new Object();
        obj3.f2053c = new Object();
        b5.l lVar3 = new b5.l(obj3);
        obj3.f2052b = lVar3;
        obj3.f2051a = w.d.class;
        try {
            atomicReference3.set(obj3);
            obj3.f2051a = str.concat("-Surface");
        } catch (Exception e11) {
            lVar3.b(e11);
        }
        this.f3449e = lVar3;
        b5.i iVar3 = (b5.i) atomicReference3.get();
        iVar3.getClass();
        this.f3450f = iVar3;
        p1 p1Var = new p1(this, size);
        this.f3454j = p1Var;
        ta.a d4 = m0.i.d(p1Var.f7299e);
        lVar3.a(new m0.h(0, lVar3, new a4.n(d4, iVar2, str, 8)), ij.a.D());
        d4.a(new n1(this, 0), ij.a.D());
        l0.a D = ij.a.D();
        AtomicReference atomicReference4 = new AtomicReference(null);
        b5.l A = a.a.A(new bi.h(5, this, atomicReference4));
        A.a(new m0.h(0, A, new a0.b(24, fVar)), D);
        b5.i iVar4 = (b5.i) atomicReference4.get();
        iVar4.getClass();
        this.f3452h = iVar4;
    }

    public final void a(final Surface surface, Executor executor, final z5.a aVar) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: d0.o1
                @Override // java.lang.Runnable
                public final void run() {
                    switch (r3) {
                        case 0:
                            aVar.accept(new j(2, surface));
                            return;
                        case DSiCameraSource.FrontCamera /* 1 */:
                            aVar.accept(new j(3, surface));
                            return;
                        default:
                            aVar.accept(new j(4, surface));
                            return;
                    }
                }
            });
            return;
        }
        if (!this.f3450f.b(surface)) {
            b5.l lVar = this.f3449e;
            if (!lVar.isCancelled()) {
                p7.m.o(null, lVar.B.isDone());
                try {
                    lVar.get();
                    executor.execute(new Runnable() { // from class: d0.o1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    aVar.accept(new j(2, surface));
                                    return;
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    aVar.accept(new j(3, surface));
                                    return;
                                default:
                                    aVar.accept(new j(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: d0.o1
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    aVar.accept(new j(2, surface));
                                    return;
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    aVar.accept(new j(3, surface));
                                    return;
                                default:
                                    aVar.accept(new j(4, surface));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        z zVar = new z(2, aVar, surface);
        b5.l lVar2 = this.f3451g;
        lVar2.a(new m0.h(0, lVar2, zVar), executor);
    }

    public final void b() {
        this.f3450f.c(new Exception("Surface request will not complete."));
    }
}
