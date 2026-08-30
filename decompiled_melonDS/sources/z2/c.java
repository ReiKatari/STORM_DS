package z2;

import a1.n0;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: o  reason: collision with root package name */
    public final b f14893o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f14894p;

    public c(long j2, j jVar, mc.l lVar, mc.l lVar2, b bVar) {
        super(j2, jVar, lVar, lVar2);
        this.f14893o = bVar;
        bVar.k();
    }

    @Override // z2.b, z2.f
    public final void c() {
        if (!this.f14912c) {
            super.c();
            if (!this.f14894p) {
                this.f14894p = true;
                this.f14893o.l();
            }
        }
    }

    @Override // z2.b
    public final q w() {
        HashMap hashMap;
        c cVar;
        b bVar = this.f14893o;
        if (!bVar.m && !bVar.f14912c) {
            n0 n0Var = this.f14888h;
            long j2 = this.f14911b;
            if (n0Var != null) {
                hashMap = l.b(bVar.g(), this, this.f14893o.d());
            } else {
                hashMap = null;
            }
            Object obj = l.f14919c;
            synchronized (obj) {
                try {
                    l.c(this);
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    if (n0Var == null || n0Var.f77d == 0) {
                        cVar = this;
                        a();
                    } else {
                        cVar = this;
                        q z10 = cVar.z(this.f14893o.g(), n0Var, hashMap, this.f14893o.d());
                        if (!z10.equals(h.f14915c)) {
                            return z10;
                        }
                        n0 x9 = cVar.f14893o.x();
                        if (x9 != null) {
                            x9.j(n0Var);
                        } else {
                            cVar.f14893o.B(n0Var);
                            cVar.f14888h = null;
                        }
                    }
                    if (nc.k.c(cVar.f14893o.g(), j2) < 0) {
                        cVar.f14893o.v();
                    }
                    b bVar2 = cVar.f14893o;
                    bVar2.r(bVar2.d().b(j2).a(cVar.f14890j));
                    cVar.f14893o.A(j2);
                    b bVar3 = cVar.f14893o;
                    int i2 = cVar.f14913d;
                    cVar.f14913d = -1;
                    if (i2 >= 0) {
                        int[] iArr = bVar3.f14891k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i2;
                        bVar3.f14891k = copyOf;
                    } else {
                        bVar3.getClass();
                    }
                    b bVar4 = cVar.f14893o;
                    j jVar = cVar.f14890j;
                    bVar4.getClass();
                    synchronized (obj) {
                        bVar4.f14890j = bVar4.f14890j.d(jVar);
                        b bVar5 = cVar.f14893o;
                        int[] iArr2 = cVar.f14891k;
                        bVar5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = bVar5.f14891k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            bVar5.f14891k = iArr2;
                        }
                    }
                    cVar.m = true;
                    if (!cVar.f14894p) {
                        cVar.f14894p = true;
                        cVar.f14893o.l();
                    }
                    return h.f14915c;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        }
        return new g(this);
    }
}
