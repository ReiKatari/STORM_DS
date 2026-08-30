package androidx.work;

import android.content.Context;
import b5.l;
import cc.c;
import p7.k;
import p8.f;
import p8.g;
import p8.u;
import pc.a;
import zc.a1;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class CoroutineWorker extends u {

    /* renamed from: e  reason: collision with root package name */
    public final WorkerParameters f1711e;

    /* renamed from: f  reason: collision with root package name */
    public final f f1712f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.f1711e = workerParameters;
        this.f1712f = f.L;
    }

    @Override // p8.u
    public final l a() {
        a1 b10 = x.b();
        f fVar = this.f1712f;
        fVar.getClass();
        return k.t(a.G(fVar, b10), new g(this, null, 0));
    }

    @Override // p8.u
    public final l b() {
        f fVar = f.L;
        cc.g gVar = this.f1712f;
        if (nc.k.a(gVar, fVar)) {
            gVar = this.f1711e.f1717d;
        }
        gVar.getClass();
        return k.t(gVar.H(x.b()), new g(this, null, 1));
    }

    public abstract Object c(c cVar);

    public Object d() {
        throw new IllegalStateException("Not implemented");
    }
}
