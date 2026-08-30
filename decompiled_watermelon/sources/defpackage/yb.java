package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yb  reason: default package */
/* loaded from: classes.dex */
public final class yb extends ic3 implements mi2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(xf3 xf3Var, y55 y55Var, u36 u36Var) {
        super(1);
        this.B = 26;
        this.L = xf3Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        fg7[] fg7VarArr;
        int i = this.B;
        float f = RecyclerView.A1;
        int i2 = 0;
        o27 o27Var = o27.a;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                zb zbVar = (zb) obj;
                wf3 wf3Var = (wf3) obj2;
                if (zbVar.Z() != Integer.MAX_VALUE) {
                    if (zbVar.e().b) {
                        zbVar.v();
                    }
                    for (Map.Entry entry : zbVar.e().i.entrySet()) {
                        wf3.a(wf3Var, (ds2) entry.getKey(), ((Number) entry.getValue()).intValue(), zbVar.r());
                    }
                    m74 m74Var = zbVar.r().n0;
                    m74Var.getClass();
                    while (!m74Var.equals(wf3Var.a.r())) {
                        for (ds2 ds2Var : wf3Var.b(m74Var).keySet()) {
                            wf3.a(wf3Var, ds2Var, wf3Var.c(m74Var, ds2Var), m74Var);
                        }
                        m74Var = m74Var.n0;
                        m74Var.getClass();
                    }
                }
                return o27Var;
            case 1:
                return Boolean.valueOf(((ed2) obj).Y0(((zb2) obj2).a));
            case 2:
                ds3 ds3Var = (ds3) obj;
                ee eeVar = ((td) obj2).k0;
                if (eeVar.getInsetsListener().Z.h() > 0) {
                    j14 j14Var = hg7.a;
                    ds3Var.A = true;
                    fs3 fs3Var = ds3Var.R;
                    rd3 B0 = fs3Var.B0();
                    if (a33.a(ds3Var.B, 9223372034707292159L)) {
                        ds3Var.B = mj2.P(B0.a(0L));
                        ds3Var.L = B0.O();
                    }
                    fs3Var.F0().B0.b();
                    long O = B0.O();
                    d24 d24Var = eeVar.getInsetsListener().Y;
                    int i3 = (int) (O >> 32);
                    int i4 = (int) (O & 4294967295L);
                    for (fg7 fg7Var : hg7.b) {
                        Object g = d24Var.g(fg7Var);
                        g.getClass();
                        xg7 xg7Var = (xg7) g;
                        hg7.a(ds3Var, ((gg7) fg7Var).c, xg7Var.h, i3, i4);
                        if (((Boolean) xg7Var.b.getValue()).booleanValue()) {
                            hg7.a(ds3Var, xg7Var.f, xg7Var.j, i3, i4);
                            hg7.a(ds3Var, xg7Var.g, xg7Var.k, i3, i4);
                        }
                        hg7.a(ds3Var, ((gg7) fg7Var).d, xg7Var.i, i3, i4);
                    }
                    w14 w14Var = eeVar.getInsetsListener().c0;
                    if (w14Var.i()) {
                        xa6 xa6Var = eeVar.getInsetsListener().d0;
                        Object[] objArr = w14Var.a;
                        int i5 = w14Var.b;
                        while (i2 < i5) {
                            wz2 wz2Var = (wz2) xa6Var.get(i2);
                            Rect rect = (Rect) ((k24) objArr[i2]).getValue();
                            ds3Var.a(wz2Var.b(), rect.left);
                            ds3Var.a(wz2Var.d(), rect.top);
                            ds3Var.a(wz2Var.c(), rect.right);
                            ds3Var.a(wz2Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return o27Var;
            case 3:
                return Boolean.valueOf(((y23) obj2).a(((iz5) obj).f));
            case 4:
                return Boolean.valueOf(a53.l((iz5) obj, (Resources) obj2));
            case 5:
                return Boolean.valueOf(b53.x(obj, obj2));
            case ig7.b /* 6 */:
                pz5.c((rz5) obj, (w01) obj2);
                return o27Var;
            case 7:
                ex6 ex6Var = (ex6) obj;
                return ((u40) obj2).f;
            case 8:
                xf3 xf3Var = (xf3) obj;
                ((n95) obj2).n(xf3Var);
                xf3Var.a();
                return o27Var;
            case 9:
                no noVar = (no) obj;
                float f2 = noVar.b;
                if (f2 < RecyclerView.A1) {
                    f2 = 0.0f;
                }
                float f3 = 1.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f4 = noVar.c;
                float f5 = -0.5f;
                if (f4 < -0.5f) {
                    f4 = -0.5f;
                }
                float f6 = 0.5f;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f7 = noVar.d;
                if (f7 >= -0.5f) {
                    f5 = f7;
                }
                if (f5 <= 0.5f) {
                    f6 = f5;
                }
                float f8 = noVar.a;
                if (f8 >= RecyclerView.A1) {
                    f = f8;
                }
                if (f <= 1.0f) {
                    f3 = f;
                }
                return new xq0(xq0.a(mh7.b(f2, f4, f6, f3, dr0.x), (ar0) obj2));
            case 10:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return o27Var;
            case 11:
                ch1 ch1Var = (ch1) obj;
                return new y3(7, (fh1) obj2);
            case mj2.L /* 12 */:
                return Boolean.valueOf(!b53.x(obj, ((kx6) obj2).d.getValue()));
            case 13:
                ((rf5) obj).c(((Number) ((ae6) obj2).getValue()).floatValue());
                return o27Var;
            case 14:
                si1 si1Var = (si1) obj;
                if (!si1Var.A.i0) {
                    return yx6.SkipSubtreeAndContinueTraversal;
                }
                si1 si1Var2 = si1Var.k0;
                if (si1Var2 != null) {
                    yb ybVar = new yb(14, (t71) obj2);
                    if (ybVar.n(si1Var2) == yx6.ContinueTraversal) {
                        ve2.Z(si1Var2, ybVar);
                    }
                }
                si1Var.k0 = null;
                si1Var.j0 = null;
                return yx6.ContinueTraversal;
            case ig7.e /* 15 */:
                if (km2.b.compareAndSet(false, true)) {
                    ((q60) obj2).c(o27Var);
                }
                return o27Var;
            case 16:
                hk1 hk1Var = (hk1) obj;
                pn2 pn2Var = (pn2) obj2;
                vi viVar = pn2Var.l;
                if (pn2Var.n && pn2Var.w && viVar != null) {
                    os I = hk1Var.I();
                    long E = I.E();
                    I.s().m();
                    try {
                        ((os) ((bq0) I.B).B).s().u(viVar);
                        pn2Var.c(hk1Var);
                    } finally {
                        wh1.u(I, E);
                    }
                } else {
                    pn2Var.c(hk1Var);
                }
                return o27Var;
            case 17:
                hk1 hk1Var2 = (hk1) obj;
                oh0 s = hk1Var2.I().s();
                aj2 aj2Var = ((tn2) obj2).R;
                if (aj2Var != null) {
                    aj2Var.j(s, (pn2) hk1Var2.I().L);
                }
                return o27Var;
            case 18:
                j67 j67Var = (j67) obj;
                jo2 jo2Var = (jo2) obj2;
                jo2Var.g(j67Var);
                mi2 mi2Var = jo2Var.i;
                if (mi2Var != null) {
                    mi2Var.n(j67Var);
                }
                return o27Var;
            case 19:
                o84 o84Var = (o84) obj;
                v55 v55Var = o84Var.b;
                if (v55Var != null) {
                    v55Var.closeConnection();
                    o84Var.b = null;
                }
                r03 r03Var = (r03) obj2;
                o24 o24Var = r03Var.d;
                Object[] objArr2 = o24Var.A;
                int i6 = o24Var.L;
                while (true) {
                    if (i2 < i6) {
                        if (!b53.x((vd7) objArr2[i2], o84Var)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 >= 0) {
                    o24Var.l(i2);
                }
                if (o24Var.L == 0) {
                    r03Var.b.c();
                }
                return o27Var;
            case 20:
                Throwable th = (Throwable) obj;
                ((fq3) obj2).cancel(false);
                return o27Var;
            case 21:
                ((o24) obj2).b((xy3) obj);
                return Boolean.TRUE;
            case 22:
                pz5.d((rz5) obj, ((og5) obj2).a);
                return o27Var;
            case 23:
                pz5.b((rz5) obj, (String) obj2);
                return o27Var;
            case 24:
                ((List) obj).add((Float) ((zj3) obj2).c());
                return true;
            case 25:
                rf5 rf5Var = (rf5) obj;
                v26 v26Var = (v26) obj2;
                rf5Var.n(rf5Var.j0.b() * v26Var.a);
                rf5Var.p(v26Var.b);
                rf5Var.f(v26Var.c);
                rf5Var.e(v26Var.d);
                rf5Var.r(v26Var.e);
                return o27Var;
            case 26:
                hk1 hk1Var3 = (hk1) obj;
                ((xf3) obj2).a();
                return o27Var;
            case 27:
                rf5 rf5Var2 = (rf5) obj;
                o66 o66Var = (o66) obj2;
                rf5Var2.l(o66Var.j0);
                rf5Var2.m(o66Var.k0);
                rf5Var2.c(o66Var.l0);
                rf5Var2.t(RecyclerView.A1);
                rf5Var2.n(RecyclerView.A1);
                rf5Var2.k(RecyclerView.A1);
                float f9 = o66Var.m0;
                if (rf5Var2.e0 != f9) {
                    rf5Var2.A |= 2048;
                    rf5Var2.e0 = f9;
                }
                rf5Var2.s(o66Var.n0);
                rf5Var2.p(o66Var.o0);
                rf5Var2.f(o66Var.p0);
                rf5Var2.h(null);
                rf5Var2.e(o66Var.q0);
                rf5Var2.r(o66Var.r0);
                int i7 = o66Var.s0;
                if (rf5Var2.m0 != i7) {
                    rf5Var2.A |= 524288;
                    rf5Var2.m0 = i7;
                }
                return o27Var;
            default:
                Throwable th2 = (Throwable) obj;
                sk6 sk6Var = (sk6) obj2;
                ih0 ih0Var = sk6Var.L;
                if (ih0Var != null) {
                    ih0Var.r(th2);
                }
                sk6Var.L = null;
                return o27Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yb(int i, Object obj) {
        super(1);
        this.B = i;
        this.L = obj;
    }
}
