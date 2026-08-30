package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dj  reason: default package */
/* loaded from: classes.dex */
public final class dj extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dj(int i, Object obj) {
        super(0);
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.ki2
    public final Object c() {
        iv0 iv0Var;
        rd3 parentLayoutCoordinates;
        int i = this.B;
        rd3 rd3Var = null;
        boolean z = false;
        o27 o27Var = o27.a;
        Object obj = this.L;
        switch (i) {
            case 0:
                iq2.f(((fj) obj).L, null);
                return o27Var;
            case 1:
                return o27Var;
            case 2:
                kx6 kx6Var = (kx6) obj;
                Object f = kx6Var.a.f();
                k02 k02Var = k02.PostExit;
                if (f == k02Var && kx6Var.d.getValue() == k02Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((ki2) obj).c();
            case 4:
                return (lm0) obj;
            case 5:
                return (ab7) ((dj) obj).c();
            case ig7.b /* 6 */:
                boolean b = i33.b(0L, 0L);
                View view = ((qu0) obj).a;
                if (b) {
                    return b53.C(view);
                }
                return new be1(0L, ct3.z(view.getContext()).B(hk2.U(0L)));
            case 7:
                return new on(1, (ok1) obj);
            case 8:
                ((ed2) obj).T0();
                return o27Var;
            case 9:
                Object systemService = ((View) ((os) obj).B).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 10:
                zf3 zf3Var = ((vf3) obj).B0;
                zf3Var.p.u0 = true;
                ms3 ms3Var = zf3Var.q;
                if (ms3Var != null) {
                    ms3Var.o0 = true;
                }
                return o27Var;
            case 11:
                bg3 bg3Var = (bg3) obj;
                if (!((Boolean) bg3Var.g.getValue()).booleanValue() && (iv0Var = bg3Var.c) != null) {
                    iv0Var.l();
                }
                return o27Var;
            case mj2.L /* 12 */:
                ht3 ht3Var = (ht3) ((kn3) obj).a.B;
                if (!ht3Var.B) {
                    if (ht3Var.L) {
                        pr4.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    ht3Var.a();
                    ht3Var.L = true;
                }
                return o27Var;
            case 13:
                return (o31) ((q9) obj).X;
            case 14:
                return ((a64) obj).R0();
            case ig7.e /* 15 */:
                yq4 yq4Var = (yq4) obj;
                parentLayoutCoordinates = yq4Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.c0()) {
                    rd3Var = parentLayoutCoordinates;
                }
                if (rd3Var != null && yq4Var.m16getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                b65 b65Var = (b65) obj;
                b65Var.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    b65Var.a();
                    return o27Var;
                } finally {
                    Trace.endSection();
                }
            case 17:
                Collection values = ((g56) obj).c0.e().c.values();
                if (!((k0) values).isEmpty()) {
                    Iterator it = ((ju3) values).iterator();
                    while (it.hasNext() && !((u36) it.next()).d()) {
                    }
                }
                return o27Var;
            case 18:
                jg3 a = ((yh6) obj).a();
                vf3 vf3Var = a.A;
                if (a.i0 != ((o24) ((u14) vf3Var.o()).B).L) {
                    d24 d24Var = a.Y;
                    Object[] objArr = d24Var.c;
                    long[] jArr = d24Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((bg3) objArr[(i2 << 3) + i4]).d = true;
                                    }
                                    j >>= 8;
                                }
                                if (i3 != 8) {
                                }
                            }
                            if (i2 != length) {
                                i2++;
                            }
                        }
                    }
                    if (vf3Var.d0 != null) {
                        if (!vf3Var.B0.e) {
                            vf3.T(vf3Var, false, 7);
                        }
                    } else if (!vf3Var.q()) {
                        vf3.V(vf3Var, false, 7);
                    }
                }
                return o27Var;
            case 19:
                return new BaseInputConnection(((cr6) obj).a, false);
            case 20:
                ((h77) obj).c0.setValue(o27Var);
                return o27Var;
            default:
                ((ki2) ((n75) obj).A).c();
                return o27Var;
        }
    }
}
