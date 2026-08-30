package b5;

import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Object f2051a;

    /* renamed from: b  reason: collision with root package name */
    public l f2052b;

    /* renamed from: c  reason: collision with root package name */
    public n f2053c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2054d;

    public final void a(Runnable runnable, Executor executor) {
        n nVar = this.f2053c;
        if (nVar != null) {
            nVar.a(runnable, executor);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            r4.f2054d = r0
            b5.l r1 = r4.f2052b
            r2 = 0
            if (r1 == 0) goto L1d
            b5.k r1 = r1.B
            r1.getClass()
            if (r5 != 0) goto L11
            java.lang.Object r5 = b5.h.Z
        L11:
            q8.r r3 = b5.h.Y
            boolean r5 = r3.m(r1, r2, r5)
            if (r5 == 0) goto L1d
            b5.h.c(r1)
            goto L1e
        L1d:
            r0 = 0
        L1e:
            if (r0 == 0) goto L26
            r4.f2051a = r2
            r4.f2052b = r2
            r4.f2053c = r2
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.i.b(java.lang.Object):boolean");
    }

    public final boolean c(Throwable th2) {
        boolean z10 = true;
        this.f2054d = true;
        l lVar = this.f2052b;
        z10 = (lVar == null || !lVar.B.i(th2)) ? false : false;
        if (z10) {
            this.f2051a = null;
            this.f2052b = null;
            this.f2053c = null;
        }
        return z10;
    }

    public final void finalize() {
        n nVar;
        l lVar = this.f2052b;
        if (lVar != null && !lVar.B.isDone()) {
            lVar.b(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f2051a, 1));
        }
        if (!this.f2054d && (nVar = this.f2053c) != null) {
            nVar.j(null);
        }
    }
}
