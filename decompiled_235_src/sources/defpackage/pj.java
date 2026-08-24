package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.Collection;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj  reason: default package */
/* loaded from: classes.dex */
public final class pj extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pj(Object obj, int i) {
        super(0);
        this.B = i;
        this.L = obj;
    }

    @Override // defpackage.on2
    public final Object c() {
        ey0 ey0Var;
        jk3 parentLayoutCoordinates;
        int i = this.B;
        jk3 jk3Var = null;
        boolean z = false;
        jg7 jg7Var = jg7.a;
        Object obj = this.L;
        switch (i) {
            case 0:
                g04.x(((rj) obj).L, null);
                return jg7Var;
            case 1:
                return jg7Var;
            case 2:
                ga7 ga7Var = (ga7) obj;
                Object f = ga7Var.a.f();
                z42 z42Var = z42.PostExit;
                if (f == z42Var && ga7Var.d.getValue() == z42Var) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return ((on2) obj).c();
            case 4:
                return (uo0) obj;
            case 5:
                return (bp7) ((pj) obj).c();
            case 6:
                boolean b = q93.b(0L, 0L);
                View view = ((mx0) obj).a;
                if (b) {
                    return n16.p(view);
                }
                return new fi1(0L, ak7.s(view.getContext()).q(qo2.S(0L)));
            case 7:
                return new ao((uo1) obj, 1);
            case 8:
                ((vh2) obj).T0();
                return jg7Var;
            case 9:
                Object systemService = ((View) ((bt) obj).B).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 10:
                wm3 wm3Var = ((sm3) obj).C0;
                wm3Var.p.v0 = true;
                rz3 rz3Var = wm3Var.q;
                if (rz3Var != null) {
                    rz3Var.p0 = true;
                }
                return jg7Var;
            case 11:
                ym3 ym3Var = (ym3) obj;
                if (!((Boolean) ym3Var.g.getValue()).booleanValue() && (ey0Var = ym3Var.c) != null) {
                    ey0Var.l();
                }
                return jg7Var;
            case 12:
                k04 k04Var = (k04) ((mu3) obj).a.B;
                if (!k04Var.B) {
                    if (k04Var.L) {
                        s05.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    k04Var.a();
                    k04Var.L = true;
                }
                return jg7Var;
            case 13:
                return (w61) ((eb) obj).X;
            case 14:
                return ((ge4) obj).R0();
            case 15:
                c05 c05Var = (c05) obj;
                parentLayoutCoordinates = c05Var.getParentLayoutCoordinates();
                if (parentLayoutCoordinates != null && parentLayoutCoordinates.t()) {
                    jk3Var = parentLayoutCoordinates;
                }
                if (jk3Var != null && c05Var.m0getPopupContentSizebOM6tXw() != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 16:
                rf5 rf5Var = (rf5) obj;
                rf5Var.h = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    rf5Var.a();
                    return jg7Var;
                } finally {
                    Trace.endSection();
                }
            case 17:
                Collection values = ((sg6) obj).d0.d().c.values();
                if (!((l0) values).isEmpty()) {
                    Iterator it = ((m14) values).iterator();
                    while (it.hasNext() && !((gf6) it.next()).d()) {
                    }
                }
                return jg7Var;
            case 18:
                gn3 a = ((pt6) obj).a();
                sm3 sm3Var = a.A;
                if (a.j0 != ((ua4) ((aa4) sm3Var.o()).B).L) {
                    ja4 ja4Var = a.Y;
                    Object[] objArr = ja4Var.c;
                    long[] jArr = ja4Var.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((255 & j) < 128) {
                                        ((ym3) objArr[(i2 << 3) + i4]).d = true;
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
                    if (sm3Var.e0 != null) {
                        if (!sm3Var.C0.e) {
                            sm3.T(sm3Var, false, 7);
                        }
                    } else if (!sm3Var.q()) {
                        sm3.V(sm3Var, false, 7);
                    }
                }
                return jg7Var;
            case 19:
                return new BaseInputConnection(((r37) obj).a, false);
            case 20:
                ((gl7) obj).d0.setValue(jg7Var);
                return jg7Var;
            default:
                ((on2) ((dh5) obj).A).c();
                return jg7Var;
        }
    }
}
