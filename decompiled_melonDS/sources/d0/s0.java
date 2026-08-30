package d0;

import android.util.Log;
import android.util.Pair;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import j0.l2;
import j0.o2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import q.q3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 extends v1 {

    /* renamed from: y  reason: collision with root package name */
    public static final q0 f3457y = new Object();

    /* renamed from: p  reason: collision with root package name */
    public final int f3458p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicReference f3459q;

    /* renamed from: r  reason: collision with root package name */
    public final int f3460r;

    /* renamed from: s  reason: collision with root package name */
    public final n0.h f3461s;

    /* renamed from: t  reason: collision with root package name */
    public j0.r1 f3462t;

    /* renamed from: u  reason: collision with root package name */
    public b9.e f3463u;

    /* renamed from: v  reason: collision with root package name */
    public i0.e f3464v;

    /* renamed from: w  reason: collision with root package name */
    public j0.s1 f3465w;

    /* renamed from: x  reason: collision with root package name */
    public final na.f f3466x;

    public s0(j0.z0 z0Var) {
        super(z0Var);
        this.f3459q = new AtomicReference(null);
        this.f3460r = -1;
        this.f3466x = new na.f(this);
        j0.z0 z0Var2 = (j0.z0) this.f3474g;
        j0.g gVar = j0.z0.B;
        if (z0Var2.e(gVar)) {
            this.f3458p = ((Integer) z0Var2.g(gVar)).intValue();
        } else {
            this.f3458p = 1;
        }
        ((Integer) z0Var2.h(j0.z0.f7328b0, 0)).getClass();
        this.f3461s = new n0.h((n0.h) z0Var2.h(j0.z0.f7329c0, null));
    }

    public static boolean F(int i2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i2))) {
                return true;
            }
        }
        return false;
    }

    public final void C(boolean z10) {
        i0.e eVar;
        Log.d("ImageCapture", "clearPipeline");
        l0.f.e();
        j0.s1 s1Var = this.f3465w;
        if (s1Var != null) {
            s1Var.b();
            this.f3465w = null;
        }
        b9.e eVar2 = this.f3463u;
        if (eVar2 != null) {
            eVar2.n();
            this.f3463u = null;
        }
        if (!z10 && (eVar = this.f3464v) != null) {
            eVar.a();
            this.f3464v = null;
        }
        d().e();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j0.r1 D(java.lang.String r13, j0.z0 r14, j0.k r15) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.s0.D(java.lang.String, j0.z0, j0.k):j0.r1");
    }

    public final int E() {
        int i2;
        synchronized (this.f3459q) {
            i2 = this.f3460r;
            if (i2 == -1) {
                i2 = ((Integer) ((j0.z0) this.f3474g).h(j0.z0.L, 2)).intValue();
            }
        }
        return i2;
    }

    @Override // d0.v1
    public final l2 f(boolean z10, o2 o2Var) {
        f3457y.getClass();
        j0.z0 z0Var = q0.f3441a;
        j0.r0 a10 = o2Var.a(z0Var.r(), this.f3458p);
        if (z10) {
            a10 = j0.r0.m(a10, z0Var);
        }
        if (a10 == null) {
            return null;
        }
        return new j0.z0(j0.i1.a(l(a10).f2374b));
    }

    @Override // d0.v1
    public final Set k() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // d0.v1
    public final c0.f l(j0.r0 r0Var) {
        return new c0.f(j0.g1.c(r0Var), 3);
    }

    @Override // d0.v1
    public final void q() {
        int i2;
        p7.m.l(c(), "Attached camera cannot be null");
        if (E() == 3) {
            j0.d0 c4 = c();
            if (c4 != null) {
                i2 = c4.b().c();
            } else {
                i2 = -1;
            }
            if (i2 != 0) {
                a0.j.h("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // d0.v1
    public final void r() {
        aj.g.o("ImageCapture", "onCameraControlReady");
        synchronized (this.f3459q) {
            try {
                if (this.f3459q.get() == null) {
                    d().d(E());
                }
            } finally {
            }
        }
        d().f(this.f3461s);
    }

    @Override // d0.v1
    public final l2 s(j0.b0 b0Var, c0.f fVar) {
        int i2 = 35;
        HashSet<e0.b> hashSet = this.f3473f;
        boolean z10 = false;
        if (hashSet != null) {
            int i10 = 0;
            for (e0.b bVar : hashSet) {
                if (bVar instanceof g0.d) {
                    i10 = ((g0.d) bVar).f5007a;
                }
            }
            fVar.a().o(j0.z0.X, Integer.valueOf(i10));
        }
        if (b0Var.i().h(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            j0.g1 a10 = fVar.a();
            j0.g gVar = j0.z0.Z;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(a10.h(gVar, bool2))) {
                aj.g.y0("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                aj.g.I("ImageCapture", "Requesting software JPEG due to device quirk.");
                fVar.a().o(gVar, bool2);
            }
        }
        j0.g1 a11 = fVar.a();
        Boolean bool3 = Boolean.TRUE;
        j0.g gVar2 = j0.z0.Z;
        Boolean bool4 = Boolean.FALSE;
        if (bool3.equals(a11.h(gVar2, bool4))) {
            if (c() != null) {
                c().p().s();
            }
            Integer num = (Integer) a11.h(j0.z0.R, null);
            if (num != null && num.intValue() != 256) {
                aj.g.y0("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            } else {
                z10 = true;
            }
            if (!z10) {
                aj.g.y0("ImageCapture", "Unable to support software JPEG. Disabling.");
                a11.o(gVar2, bool4);
            }
        }
        Integer num2 = (Integer) fVar.a().h(j0.z0.R, null);
        if (num2 != null) {
            if (c() != null) {
                c().p().s();
            }
            j0.g1 a12 = fVar.a();
            j0.g gVar3 = j0.a1.f7148n;
            if (!z10) {
                i2 = num2.intValue();
            }
            a12.o(gVar3, Integer.valueOf(i2));
        } else {
            j0.g1 a13 = fVar.a();
            j0.g gVar4 = j0.z0.X;
            if (Objects.equals(a13.h(gVar4, null), 2)) {
                fVar.a().o(j0.a1.f7148n, 32);
            } else if (Objects.equals(fVar.a().h(gVar4, null), 3)) {
                fVar.a().o(j0.a1.f7148n, 32);
                fVar.a().o(j0.a1.f7149o, 256);
            } else if (Objects.equals(fVar.a().h(gVar4, null), 1)) {
                fVar.a().o(j0.a1.f7148n, 4101);
                fVar.a().o(j0.a1.f7150p, a0.f3319c);
            } else if (z10) {
                fVar.a().o(j0.a1.f7148n, 35);
            } else {
                List list = (List) fVar.a().h(j0.b1.f7160x, null);
                if (list == null) {
                    fVar.a().o(j0.a1.f7148n, 256);
                } else if (F(256, list)) {
                    fVar.a().o(j0.a1.f7148n, 256);
                } else if (F(35, list)) {
                    fVar.a().o(j0.a1.f7148n, 35);
                }
            }
        }
        return fVar.d();
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    @Override // d0.v1
    public final void u() {
        n0.h hVar = this.f3461s;
        hVar.b();
        hVar.a();
        i0.e eVar = this.f3464v;
        if (eVar != null) {
            eVar.a();
        }
    }

    @Override // d0.v1
    public final j0.k v(j0.r0 r0Var) {
        this.f3462t.a(r0Var);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.f3462t.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        q3 b10 = this.f3475h.b();
        b10.f11999f = r0Var;
        return b10.c();
    }

    @Override // d0.v1
    public final j0.k w(j0.k kVar, j0.k kVar2) {
        aj.g.o("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + kVar + ", secondaryStreamSpec " + kVar2);
        j0.r1 D = D(e(), (j0.z0) this.f3474g, kVar);
        this.f3462t = D;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{D.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        B(Collections.unmodifiableList(arrayList));
        this.f3470c = t1.ACTIVE;
        p();
        return kVar;
    }

    @Override // d0.v1
    public final void x() {
        n0.h hVar = this.f3461s;
        hVar.b();
        hVar.a();
        i0.e eVar = this.f3464v;
        if (eVar != null) {
            eVar.a();
        }
        C(false);
        d().f(null);
    }
}
