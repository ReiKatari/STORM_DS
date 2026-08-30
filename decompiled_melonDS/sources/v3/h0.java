package v3;

import a4.h2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import u1.m1;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h0 extends b3.o implements w, x4.c, h2 {

    /* renamed from: i0  reason: collision with root package name */
    public Object f13658i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f13659j0;

    /* renamed from: k0  reason: collision with root package name */
    public Object[] f13660k0;

    /* renamed from: l0  reason: collision with root package name */
    public PointerInputEventHandler f13661l0;

    /* renamed from: m0  reason: collision with root package name */
    public l1 f13662m0;

    /* renamed from: n0  reason: collision with root package name */
    public k f13663n0 = c0.f13637a;

    /* renamed from: o0  reason: collision with root package name */
    public final p2.b f13664o0;
    public final p2.b p0;

    /* renamed from: q0  reason: collision with root package name */
    public final p2.b f13665q0;

    /* renamed from: r0  reason: collision with root package name */
    public k f13666r0;

    /* renamed from: s0  reason: collision with root package name */
    public long f13667s0;

    public h0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.f13658i0 = obj;
        this.f13659j0 = obj2;
        this.f13660k0 = objArr;
        this.f13661l0 = pointerInputEventHandler;
        p2.b bVar = new p2.b(new f0[16]);
        this.f13664o0 = bVar;
        this.p0 = bVar;
        this.f13665q0 = new p2.b(new f0[16]);
        this.f13667s0 = 0L;
    }

    @Override // b3.o
    public final void H0() {
        Q0();
    }

    public final Object O0(mc.p pVar, cc.c cVar) {
        zc.h hVar = new zc.h(1, pc.a.A(cVar));
        hVar.v();
        f0 f0Var = new f0(this, hVar);
        synchronized (this.p0) {
            this.f13664o0.b(f0Var);
            new cc.i(pc.a.A(pc.a.q(pVar, f0Var, f0Var)), dc.a.COROUTINE_SUSPENDED).h(yb.y.f14813a);
        }
        hVar.x(new a4.a(21, f0Var));
        return hVar.u();
    }

    public final void P0(k kVar, l lVar) {
        zc.h hVar;
        zc.h hVar2;
        synchronized (this.p0) {
            p2.b bVar = this.f13665q0;
            bVar.d(bVar.L, this.f13664o0);
        }
        try {
            int i2 = g0.f13650a[lVar.ordinal()];
            if (i2 != 1 && i2 != 2) {
                if (i2 == 3) {
                    p2.b bVar2 = this.f13665q0;
                    int i10 = bVar2.L - 1;
                    Object[] objArr = bVar2.A;
                    if (i10 < objArr.length) {
                        while (i10 >= 0) {
                            f0 f0Var = (f0) objArr[i10];
                            if (lVar == f0Var.R && (hVar2 = f0Var.L) != null) {
                                f0Var.L = null;
                                hVar2.h(kVar);
                            }
                            i10--;
                        }
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                p2.b bVar3 = this.f13665q0;
                Object[] objArr2 = bVar3.A;
                int i11 = bVar3.L;
                for (int i12 = 0; i12 < i11; i12++) {
                    f0 f0Var2 = (f0) objArr2[i12];
                    if (lVar == f0Var2.R && (hVar = f0Var2.L) != null) {
                        f0Var2.L = null;
                        hVar.h(kVar);
                    }
                }
            }
            this.f13665q0.g();
        } catch (Throwable th2) {
            this.f13665q0.g();
            throw th2;
        }
    }

    public final void Q0() {
        l1 l1Var = this.f13662m0;
        if (l1Var != null) {
            l1Var.x(new k1.c("Pointer input was reset", 2));
            this.f13662m0 = null;
        }
    }

    @Override // a4.j, a4.h2
    public final void a() {
        Q0();
    }

    @Override // a4.h2
    public final void a0() {
        Q0();
    }

    @Override // x4.c
    public final float b() {
        return a4.l.t(this).f295t0.b();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // a4.h2
    public final void g0() {
        k kVar = this.f13666r0;
        if (kVar != null) {
            ?? r12 = kVar.f13678a;
            int size = r12.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((t) r12.get(i2)).f13694d) {
                    ArrayList arrayList = new ArrayList(r12.size());
                    int size2 = r12.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        t tVar = (t) r12.get(i10);
                        long j2 = tVar.f13691a;
                        long j10 = tVar.f13693c;
                        long j11 = tVar.f13692b;
                        float f8 = tVar.f13695e;
                        boolean z10 = tVar.f13694d;
                        arrayList.add(new t(j2, j11, j10, false, f8, j11, j10, z10, z10, tVar.f13699i, 0L));
                    }
                    k kVar2 = new k(arrayList, null);
                    this.f13663n0 = kVar2;
                    P0(kVar2, l.Initial);
                    P0(kVar2, l.Main);
                    P0(kVar2, l.Final);
                    this.f13666r0 = null;
                    return;
                }
            }
        }
    }

    @Override // x4.c
    public final float j() {
        return a4.l.t(this).f295t0.j();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // a4.h2
    public final void s0(k kVar, l lVar, long j2) {
        this.f13667s0 = j2;
        if (lVar == l.Initial) {
            this.f13663n0 = kVar;
        }
        if (this.f13662m0 == null) {
            this.f13662m0 = zc.x.v(C0(), null, zc.w.UNDISPATCHED, new m1(1, null, this), 1);
        }
        P0(kVar, lVar);
        ?? r5 = kVar.f13678a;
        int size = r5.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (!s.d((t) r5.get(i2))) {
                    break;
                }
                i2++;
            } else {
                kVar = null;
                break;
            }
        }
        this.f13666r0 = kVar;
    }
}
