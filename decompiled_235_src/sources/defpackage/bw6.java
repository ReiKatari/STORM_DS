package defpackage;

import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bw6  reason: default package */
/* loaded from: classes.dex */
public final class bw6 {
    public final Object a = new Object();
    public final Size b;
    public final yq1 c;
    public final boolean d;
    public final tb0 e;
    public final qb0 f;
    public final tb0 g;
    public final qb0 h;
    public final qb0 i;
    public final o33 j;
    public cz k;
    public pk0 l;
    public ov2 m;

    static {
        Range range = yy.h;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, qb0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [hl5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [hl5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [hl5, java.lang.Object] */
    public bw6(Size size, boolean z, yq1 yq1Var, kv6 kv6Var) {
        this.b = size;
        this.d = z;
        np2.s("SurfaceRequest's DynamicRange must always be fully specified.", yq1Var.b());
        this.c = yq1Var;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        ?? obj = new Object();
        obj.c = new Object();
        tb0 tb0Var = new tb0(obj);
        obj.b = tb0Var;
        obj.a = i61.class;
        try {
            atomicReference.set(obj);
            obj.a = str.concat("-cancellation");
        } catch (Exception e) {
            tb0Var.b(e);
        }
        qb0 qb0Var = (qb0) atomicReference.get();
        qb0Var.getClass();
        this.i = qb0Var;
        AtomicReference atomicReference2 = new AtomicReference(null);
        ?? obj2 = new Object();
        obj2.c = new Object();
        tb0 tb0Var2 = new tb0(obj2);
        obj2.b = tb0Var2;
        obj2.a = i61.class;
        try {
            atomicReference2.set(obj2);
            obj2.a = str.concat("-status");
        } catch (Exception e2) {
            tb0Var2.b(e2);
        }
        this.g = tb0Var2;
        tb0Var2.a(u24.j(), new uo2(0, tb0Var2, new rr6(3, qb0Var, tb0Var)));
        qb0 qb0Var2 = (qb0) atomicReference2.get();
        qb0Var2.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        ?? obj3 = new Object();
        obj3.c = new Object();
        tb0 tb0Var3 = new tb0(obj3);
        obj3.b = tb0Var3;
        obj3.a = i61.class;
        try {
            atomicReference3.set(obj3);
            obj3.a = str.concat("-Surface");
        } catch (Exception e3) {
            tb0Var3.b(e3);
        }
        this.e = tb0Var3;
        qb0 qb0Var3 = (qb0) atomicReference3.get();
        qb0Var3.getClass();
        this.f = qb0Var3;
        o33 o33Var = new o33(this, size);
        this.j = o33Var;
        gx3 F = l.F(o33Var.e);
        tb0Var3.a(u24.j(), new uo2(0, tb0Var3, new m44(F, qb0Var2, str, 23)));
        F.a(u24.j(), new of1(this, 1));
        uj1 j = u24.j();
        AtomicReference atomicReference4 = new AtomicReference(null);
        tb0 W = ak7.W(new pk0(8, this, atomicReference4));
        W.a(j, new uo2(0, W, new s35(kv6Var)));
        qb0 qb0Var4 = (qb0) atomicReference4.get();
        qb0Var4.getClass();
        this.h = qb0Var4;
    }

    public final void a(final Surface surface, Executor executor, final b31 b31Var) {
        if (!surface.isValid()) {
            executor.execute(new Runnable() { // from class: zv6
                @Override // java.lang.Runnable
                public final void run() {
                    int i = r3;
                    Surface surface2 = surface;
                    b31 b31Var2 = b31Var;
                    switch (i) {
                        case 0:
                            b31Var2.accept(new bz(2, surface2));
                            return;
                        case 1:
                            b31Var2.accept(new bz(3, surface2));
                            return;
                        default:
                            b31Var2.accept(new bz(4, surface2));
                            return;
                    }
                }
            });
            return;
        }
        if (!this.f.a(surface)) {
            tb0 tb0Var = this.e;
            if (!tb0Var.isCancelled()) {
                np2.A(null, tb0Var.B.isDone());
                try {
                    tb0Var.get();
                    executor.execute(new Runnable() { // from class: zv6
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = r3;
                            Surface surface2 = surface;
                            b31 b31Var2 = b31Var;
                            switch (i) {
                                case 0:
                                    b31Var2.accept(new bz(2, surface2));
                                    return;
                                case 1:
                                    b31Var2.accept(new bz(3, surface2));
                                    return;
                                default:
                                    b31Var2.accept(new bz(4, surface2));
                                    return;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    executor.execute(new Runnable() { // from class: zv6
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = r3;
                            Surface surface2 = surface;
                            b31 b31Var2 = b31Var;
                            switch (i) {
                                case 0:
                                    b31Var2.accept(new bz(2, surface2));
                                    return;
                                case 1:
                                    b31Var2.accept(new bz(3, surface2));
                                    return;
                                default:
                                    b31Var2.accept(new bz(4, surface2));
                                    return;
                            }
                        }
                    });
                    return;
                }
            }
        }
        rr6 rr6Var = new rr6(4, b31Var, surface);
        tb0 tb0Var2 = this.g;
        tb0Var2.a(executor, new uo2(0, tb0Var2, rr6Var));
    }

    public final void b() {
        this.f.c(new Exception("Surface request will not complete."));
    }
}
