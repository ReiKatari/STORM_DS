package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc  reason: default package */
/* loaded from: classes.dex */
public final class mc extends aj3 implements qn2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mc(um3 um3Var, of5 of5Var, gf6 gf6Var) {
        super(1);
        this.B = 25;
        this.L = um3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        fv7[] fv7VarArr;
        int i = this.B;
        float f = RecyclerView.B1;
        int i2 = 0;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                nc ncVar = (nc) obj;
                tm3 tm3Var = (tm3) obj2;
                if (ncVar.o() != Integer.MAX_VALUE) {
                    if (ncVar.b().b) {
                        ncVar.I();
                    }
                    for (Map.Entry entry : ncVar.b().i.entrySet()) {
                        tm3.a(tm3Var, (ey2) entry.getKey(), ((Number) entry.getValue()).intValue(), ncVar.f());
                    }
                    eg4 eg4Var = ncVar.f().o0;
                    eg4Var.getClass();
                    while (!eg4Var.equals(tm3Var.a.f())) {
                        for (ey2 ey2Var : tm3Var.b(eg4Var).keySet()) {
                            tm3.a(tm3Var, ey2Var, tm3Var.c(eg4Var, ey2Var), eg4Var);
                        }
                        eg4Var = eg4Var.o0;
                        eg4Var.getClass();
                    }
                }
                return jg7Var;
            case 1:
                return Boolean.valueOf(((vh2) obj).Y0(((qg2) obj2).a));
            case 2:
                iz3 iz3Var = (iz3) obj;
                te teVar = ((ie) obj2).l0;
                if (teVar.getInsetsListener().Z.h() > 0) {
                    p94 p94Var = hv7.a;
                    iz3Var.A = true;
                    kz3 kz3Var = iz3Var.R;
                    jk3 A0 = kz3Var.A0();
                    if (i93.a(iz3Var.B, 9223372034707292159L)) {
                        iz3Var.B = kn2.a0(A0.w(0L));
                        iz3Var.L = A0.m();
                    }
                    kz3Var.F0().C0.b();
                    long m = A0.m();
                    ja4 ja4Var = teVar.getInsetsListener().Y;
                    int i3 = (int) (m >> 32);
                    int i4 = (int) (m & 4294967295L);
                    for (fv7 fv7Var : hv7.b) {
                        Object g = ja4Var.g(fv7Var);
                        g.getClass();
                        xv7 xv7Var = (xv7) g;
                        hv7.a(iz3Var, ((gv7) fv7Var).c, xv7Var.h, i3, i4);
                        if (((Boolean) xv7Var.b.getValue()).booleanValue()) {
                            hv7.a(iz3Var, xv7Var.f, xv7Var.j, i3, i4);
                            hv7.a(iz3Var, xv7Var.g, xv7Var.k, i3, i4);
                        }
                        hv7.a(iz3Var, ((gv7) fv7Var).d, xv7Var.i, i3, i4);
                    }
                    ca4 ca4Var = teVar.getInsetsListener().d0;
                    if (ca4Var.i()) {
                        mm6 mm6Var = teVar.getInsetsListener().e0;
                        Object[] objArr = ca4Var.a;
                        int i5 = ca4Var.b;
                        while (i2 < i5) {
                            z53 z53Var = (z53) mm6Var.get(i2);
                            Rect rect = (Rect) ((qa4) objArr[i2]).getValue();
                            iz3Var.b(z53Var.b(), rect.left);
                            iz3Var.b(z53Var.d(), rect.top);
                            iz3Var.b(z53Var.c(), rect.right);
                            iz3Var.b(z53Var.a(), rect.bottom);
                            i2++;
                        }
                    }
                }
                return jg7Var;
            case 3:
                return Boolean.valueOf(((g93) obj2).a(((xa6) obj).f));
            case 4:
                return Boolean.valueOf(n16.j((xa6) obj, (Resources) obj2));
            case 5:
                return Boolean.valueOf(nb3.k(obj, obj2));
            case 6:
                eb6.c((gb6) obj, (d41) obj2);
                return jg7Var;
            case 7:
                aa7 aa7Var = (aa7) obj;
                return ((x60) obj2).f;
            case 8:
                zo zoVar = (zo) obj;
                float f2 = zoVar.b;
                if (f2 < RecyclerView.B1) {
                    f2 = 0.0f;
                }
                float f3 = 1.0f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                float f4 = zoVar.c;
                float f5 = -0.5f;
                if (f4 < -0.5f) {
                    f4 = -0.5f;
                }
                float f6 = 0.5f;
                if (f4 > 0.5f) {
                    f4 = 0.5f;
                }
                float f7 = zoVar.d;
                if (f7 >= -0.5f) {
                    f5 = f7;
                }
                if (f5 <= 0.5f) {
                    f6 = f5;
                }
                float f8 = zoVar.a;
                if (f8 >= RecyclerView.B1) {
                    f = f8;
                }
                if (f <= 1.0f) {
                    f3 = f;
                }
                return new kt0(kt0.b(hv.a(f2, f4, f6, f3, qt0.x), (nt0) obj2));
            case 9:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) obj2).cancel();
                }
                return jg7Var;
            case 10:
                gl1 gl1Var = (gl1) obj;
                return new z3((jl1) obj2, 7);
            case 11:
                return Boolean.valueOf(!nb3.k(obj, ((ga7) obj2).d.getValue()));
            case 12:
                ((op5) obj).c(((Number) ((pp6) obj2).getValue()).floatValue());
                return jg7Var;
            case 13:
                ym1 ym1Var = (ym1) obj;
                if (!ym1Var.A.j0) {
                    return tb7.SkipSubtreeAndContinueTraversal;
                }
                ym1 ym1Var2 = ym1Var.l0;
                if (ym1Var2 != null) {
                    mc mcVar = new mc((d51) obj2, 13);
                    if (mcVar.g(ym1Var2) == tb7.ContinueTraversal) {
                        ii2.Y(ym1Var2, mcVar);
                    }
                }
                ym1Var.l0 = null;
                ym1Var.k0 = null;
                return tb7.ContinueTraversal;
            case 14:
                if (ps2.b.compareAndSet(false, true)) {
                    ((v80) obj2).c(jg7Var);
                }
                return jg7Var;
            case 15:
                no1 no1Var = (no1) obj;
                ut2 ut2Var = (ut2) obj2;
                hj hjVar = ut2Var.l;
                if (ut2Var.n && ut2Var.w && hjVar != null) {
                    bt i0 = no1Var.i0();
                    long L = i0.L();
                    i0.G().h();
                    try {
                        ((bt) ((os0) i0.B).B).G().m(hjVar);
                        ut2Var.c(no1Var);
                    } finally {
                        xg6.v(i0, L);
                    }
                } else {
                    ut2Var.c(no1Var);
                }
                return jg7Var;
            case 16:
                no1 no1Var2 = (no1) obj;
                xj0 G = no1Var2.i0().G();
                eo2 eo2Var = ((xt2) obj2).R;
                if (eo2Var != null) {
                    eo2Var.o(G, (ut2) no1Var2.i0().L);
                }
                return jg7Var;
            case 17:
                gk7 gk7Var = (gk7) obj;
                mu2 mu2Var = (mu2) obj2;
                mu2Var.g(gk7Var);
                qn2 qn2Var = mu2Var.i;
                if (qn2Var != null) {
                    qn2Var.g(gk7Var);
                }
                return jg7Var;
            case 18:
                gh4 gh4Var = (gh4) obj;
                lf5 lf5Var = gh4Var.b;
                if (lf5Var != null) {
                    lf5Var.closeConnection();
                    gh4Var.b = null;
                }
                v63 v63Var = (v63) obj2;
                ua4 ua4Var = v63Var.d;
                Object[] objArr2 = ua4Var.A;
                int i6 = ua4Var.L;
                while (true) {
                    if (i2 < i6) {
                        if (!nb3.k((ss7) objArr2[i2], gh4Var)) {
                            i2++;
                        }
                    } else {
                        i2 = -1;
                    }
                }
                if (i2 >= 0) {
                    ua4Var.l(i2);
                }
                if (ua4Var.L == 0) {
                    v63Var.b.c();
                }
                return jg7Var;
            case 19:
                Throwable th = (Throwable) obj;
                ((gx3) obj2).cancel(false);
                return jg7Var;
            case 20:
                ((ua4) obj2).b((y64) obj);
                return Boolean.TRUE;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                eb6.d((gb6) obj, ((mq5) obj2).a);
                return jg7Var;
            case 22:
                eb6.b((gb6) obj, (String) obj2);
                return jg7Var;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((List) obj).add((Float) ((yq3) obj2).c());
                return true;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                op5 op5Var = (op5) obj;
                he6 he6Var = (he6) obj2;
                op5Var.m(op5Var.l0.a() * he6Var.a);
                op5Var.n(he6Var.b);
                op5Var.f(he6Var.c);
                op5Var.d(he6Var.d);
                op5Var.o(he6Var.e);
                return jg7Var;
            case 25:
                no1 no1Var3 = (no1) obj;
                ((um3) obj2).b();
                return jg7Var;
            case SubAllocator.N4 /* 26 */:
                op5 op5Var2 = (op5) obj;
                ei6 ei6Var = (ei6) obj2;
                op5Var2.k(ei6Var.k0);
                op5Var2.l(ei6Var.l0);
                op5Var2.c(ei6Var.m0);
                float f9 = ei6Var.n0;
                if (op5Var2.X != f9) {
                    op5Var2.A |= 8;
                    op5Var2.X = f9;
                }
                op5Var2.t(ei6Var.o0);
                op5Var2.m(RecyclerView.B1);
                op5Var2.j(RecyclerView.B1);
                float f10 = ei6Var.p0;
                if (op5Var2.g0 != f10) {
                    op5Var2.A |= 2048;
                    op5Var2.g0 = f10;
                }
                op5Var2.r(ei6Var.q0);
                op5Var2.n(ei6Var.r0);
                op5Var2.f(ei6Var.s0);
                op5Var2.i(null);
                op5Var2.d(ei6Var.t0);
                op5Var2.o(ei6Var.u0);
                int i7 = ei6Var.v0;
                if (op5Var2.o0 != i7) {
                    op5Var2.A |= 524288;
                    op5Var2.o0 = i7;
                }
                return jg7Var;
            default:
                Throwable th2 = (Throwable) obj;
                mw6 mw6Var = (mw6) obj2;
                rj0 rj0Var = mw6Var.L;
                if (rj0Var != null) {
                    rj0Var.w(th2);
                }
                mw6Var.L = null;
                return jg7Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(Object obj, int i) {
        super(1);
        this.B = i;
        this.L = obj;
    }
}
