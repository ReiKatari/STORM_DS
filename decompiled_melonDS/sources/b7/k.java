package b7;

import b4.o0;
import g2.t4;
import g2.w4;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ k(a7.i iVar, List list, boolean z10) {
        this.A = 0;
        this.L = iVar;
        this.B = z10;
        this.R = list;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2 = this.A;
        yb.y yVar = yb.y.f14813a;
        Object obj2 = this.R;
        Object obj3 = this.L;
        final boolean z10 = this.B;
        switch (i2) {
            case 0:
                final a7.i iVar = (a7.i) obj3;
                final List list = (List) obj2;
                h0 h0Var = (h0) obj;
                androidx.lifecycle.v vVar = new androidx.lifecycle.v() { // from class: b7.l
                    @Override // androidx.lifecycle.v
                    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
                        boolean z11 = z10;
                        List list2 = list;
                        a7.i iVar2 = iVar;
                        if (z11 && !list2.contains(iVar2)) {
                            list2.add(iVar2);
                        }
                        if (pVar == androidx.lifecycle.p.ON_START && !list2.contains(iVar2)) {
                            list2.add(iVar2);
                        }
                        if (pVar == androidx.lifecycle.p.ON_STOP) {
                            list2.remove(iVar2);
                        }
                    }
                };
                ((androidx.lifecycle.z) iVar.f576b0.f3262k).a(vVar);
                return new o0(2, iVar, vVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                String str = (String) obj3;
                w4 w4Var = (w4) obj2;
                i4.x xVar = (i4.x) obj;
                if (z10) {
                    tc.c[] cVarArr = i4.v.f6808a;
                    i4.w wVar = i4.t.f6790j;
                    tc.c cVar = i4.v.f6808a[3];
                    xVar.a(wVar, new Object());
                }
                tc.c[] cVarArr2 = i4.v.f6808a;
                i4.w wVar2 = i4.t.f6784d;
                tc.c cVar2 = i4.v.f6808a[2];
                xVar.a(wVar2, str);
                xVar.a(i4.l.f6760v, new i4.a(null, new t4(w4Var, 0)));
                return yVar;
            default:
                final q1.a0 a0Var = (q1.a0) obj3;
                final zc.u uVar = (zc.u) obj2;
                i4.x xVar2 = (i4.x) obj;
                if (z10) {
                    mc.a aVar = new mc.a() { // from class: q1.n
                        @Override // mc.a
                        public final Object b() {
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            boolean z14;
                            switch (r3) {
                                case 0:
                                    a0 a0Var2 = a0Var;
                                    if (a0Var2.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var2, null, 0), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    a0 a0Var3 = a0Var;
                                    if (a0Var3.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var3, null, 1), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                case 2:
                                    a0 a0Var4 = a0Var;
                                    if (a0Var4.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var4, null, 0), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                default:
                                    a0 a0Var5 = a0Var;
                                    if (a0Var5.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var5, null, 1), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                            }
                        }
                    };
                    tc.c[] cVarArr3 = i4.v.f6808a;
                    xVar2.a(i4.l.f6763y, new i4.a(null, aVar));
                    xVar2.a(i4.l.A, new i4.a(null, new mc.a() { // from class: q1.n
                        @Override // mc.a
                        public final Object b() {
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            boolean z14;
                            switch (r3) {
                                case 0:
                                    a0 a0Var2 = a0Var;
                                    if (a0Var2.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var2, null, 0), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    a0 a0Var3 = a0Var;
                                    if (a0Var3.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var3, null, 1), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                case 2:
                                    a0 a0Var4 = a0Var;
                                    if (a0Var4.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var4, null, 0), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                default:
                                    a0 a0Var5 = a0Var;
                                    if (a0Var5.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var5, null, 1), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                            }
                        }
                    }));
                } else {
                    mc.a aVar2 = new mc.a() { // from class: q1.n
                        @Override // mc.a
                        public final Object b() {
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            boolean z14;
                            switch (r3) {
                                case 0:
                                    a0 a0Var2 = a0Var;
                                    if (a0Var2.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var2, null, 0), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    a0 a0Var3 = a0Var;
                                    if (a0Var3.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var3, null, 1), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                case 2:
                                    a0 a0Var4 = a0Var;
                                    if (a0Var4.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var4, null, 0), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                default:
                                    a0 a0Var5 = a0Var;
                                    if (a0Var5.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var5, null, 1), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                            }
                        }
                    };
                    tc.c[] cVarArr4 = i4.v.f6808a;
                    xVar2.a(i4.l.f6764z, new i4.a(null, aVar2));
                    xVar2.a(i4.l.B, new i4.a(null, new mc.a() { // from class: q1.n
                        @Override // mc.a
                        public final Object b() {
                            boolean z11;
                            boolean z12;
                            boolean z13;
                            boolean z14;
                            switch (r3) {
                                case 0:
                                    a0 a0Var2 = a0Var;
                                    if (a0Var2.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var2, null, 0), 3);
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    return Boolean.valueOf(z11);
                                case DSiCameraSource.FrontCamera /* 1 */:
                                    a0 a0Var3 = a0Var;
                                    if (a0Var3.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var3, null, 1), 3);
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    return Boolean.valueOf(z12);
                                case 2:
                                    a0 a0Var4 = a0Var;
                                    if (a0Var4.a()) {
                                        zc.x.v(uVar, null, null, new o(a0Var4, null, 0), 3);
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    return Boolean.valueOf(z13);
                                default:
                                    a0 a0Var5 = a0Var;
                                    if (a0Var5.d()) {
                                        zc.x.v(uVar, null, null, new o(a0Var5, null, 1), 3);
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    return Boolean.valueOf(z14);
                            }
                        }
                    }));
                }
                return yVar;
        }
    }

    public /* synthetic */ k(int i2, Object obj, Object obj2, boolean z10) {
        this.A = i2;
        this.B = z10;
        this.L = obj;
        this.R = obj2;
    }
}
