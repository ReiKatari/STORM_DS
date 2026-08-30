package c0;

import android.hardware.camera2.CaptureRequest;
import bi.h;
import d0.b0;
import d0.f1;
import d0.i0;
import d0.s0;
import d0.w;
import fj.j;
import j0.b1;
import j0.g;
import j0.g1;
import j0.i1;
import j0.j1;
import j0.l2;
import j0.n2;
import j0.q0;
import j0.r0;
import j0.y0;
import j0.z0;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n0.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2373a;

    /* renamed from: b  reason: collision with root package name */
    public final g1 f2374b;

    public f(g1 g1Var, int i2) {
        this.f2373a = i2;
        switch (i2) {
            case 3:
                this.f2374b = g1Var;
                g gVar = k.V;
                Class cls = (Class) g1Var.h(gVar, null);
                if (cls != null && !cls.equals(s0.class)) {
                    j.s("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                g1Var.o(l2.N, n2.IMAGE_CAPTURE);
                g1Var.o(gVar, s0.class);
                g gVar2 = k.U;
                if (g1Var.h(gVar2, null) == null) {
                    g1Var.o(gVar2, s0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 4:
                this.f2374b = g1Var;
                g gVar3 = k.V;
                Class cls2 = (Class) g1Var.h(gVar3, null);
                if (cls2 != null && !cls2.equals(f1.class)) {
                    j.s("Invalid target class configuration for ", this, ": ", cls2);
                    throw null;
                }
                g1Var.o(l2.N, n2.PREVIEW);
                g1Var.o(gVar3, f1.class);
                g gVar4 = k.U;
                if (g1Var.h(gVar4, null) == null) {
                    g1Var.o(gVar4, f1.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                g gVar5 = b1.f7156t;
                if (((Integer) g1Var.h(gVar5, -1)).intValue() == -1) {
                    g1Var.o(gVar5, 2);
                    return;
                }
                return;
            case l1.c.f8511g /* 5 */:
            default:
                this.f2374b = g1Var;
                g gVar6 = k.V;
                Class cls3 = (Class) g1Var.h(gVar6, null);
                if (cls3 != null && !cls3.equals(i0.class)) {
                    j.s("Invalid target class configuration for ", this, ": ", cls3);
                    throw null;
                }
                g1Var.o(l2.N, n2.IMAGE_ANALYSIS);
                g1Var.o(gVar6, i0.class);
                g gVar7 = k.U;
                if (g1Var.h(gVar7, null) == null) {
                    g1Var.o(gVar7, i0.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case l1.c.f8509e /* 6 */:
                this.f2374b = g1Var;
                g gVar8 = k.V;
                Class cls4 = (Class) g1Var.h(gVar8, null);
                if (cls4 != null && !cls4.equals(v0.d.class)) {
                    j.s("Invalid target class configuration for ", this, ": ", cls4);
                    throw null;
                }
                g1Var.o(l2.N, n2.STREAM_SHARING);
                g1Var.o(gVar8, v0.d.class);
                g gVar9 = k.U;
                if (g1Var.h(gVar9, null) == null) {
                    g1Var.o(gVar9, v0.d.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    public static f c(r0 r0Var) {
        f fVar = new f(0);
        r0Var.i(new h(1, fVar, r0Var));
        return fVar;
    }

    @Override // d0.b0
    public g1 a() {
        switch (this.f2373a) {
            case 0:
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
            default:
                return this.f2374b;
            case 2:
                return this.f2374b;
            case 3:
                return this.f2374b;
            case 4:
                return this.f2374b;
            case l1.c.f8511g /* 5 */:
                throw null;
        }
    }

    public a0.b b() {
        return new a0.b(13, i1.a(this.f2374b));
    }

    public l2 d() {
        switch (this.f2373a) {
            case 2:
                return new y0(i1.a(this.f2374b));
            case 3:
                return new z0(i1.a(this.f2374b));
            case 4:
                return new j1(i1.a(this.f2374b));
            default:
                return new v0.e(i1.a(this.f2374b));
        }
    }

    public void e(CaptureRequest.Key key, Object obj, q0 q0Var) {
        this.f2374b.j(v.a.Z(key), q0Var, obj);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(int i2) {
        this(g1.b(), 4);
        this.f2373a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                g1 b10 = g1.b();
                this.f2374b = b10;
                g gVar = k.V;
                Class cls = (Class) b10.h(gVar, null);
                if (cls != null && !cls.equals(w.class)) {
                    j.s("Invalid target class configuration for ", this, ": ", cls);
                    throw null;
                }
                b10.o(gVar, w.class);
                g gVar2 = k.U;
                if (b10.h(gVar2, null) == null) {
                    b10.o(gVar2, w.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this(g1.b(), 2);
                return;
            case 3:
                this(g1.b(), 3);
                return;
            case 4:
                return;
            case l1.c.f8511g /* 5 */:
                this.f2374b = g1.b();
                return;
            default:
                this.f2374b = g1.b();
                return;
        }
    }
}
