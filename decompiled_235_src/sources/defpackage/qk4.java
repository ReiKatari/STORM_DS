package defpackage;

import android.content.Context;
import android.database.SQLException;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qk4 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ qk4(f47 f47Var, ep epVar, vv3 vv3Var) {
        this.A = 26;
        this.L = epVar;
        this.B = vv3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0199  */
    @Override // defpackage.qn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        String str;
        float f;
        long a;
        fp fpVar;
        a47 a47Var;
        hj i;
        z37 z37Var;
        nn6 nn6Var;
        nn6 nn6Var2;
        nn6 nn6Var3;
        g47 a2;
        g47 a3;
        g47 a4;
        long j;
        int i2 = this.A;
        float f2 = RecyclerView.B1;
        int i3 = 0;
        Throwable th = null;
        r7 = null;
        nn6 nn6Var4 = null;
        e47 e47Var = null;
        Throwable th2 = null;
        boolean z = true;
        switch (i2) {
            case 0:
                rk4 rk4Var = (rk4) this.L;
                dx4 dx4Var = (dx4) this.B;
                cx4 cx4Var = (cx4) obj;
                long j2 = ((i93) rk4Var.k0.g(cx4Var)).a;
                if (rk4Var.l0) {
                    cx4.m(cx4Var, dx4Var, (int) (j2 >> 32), (int) (j2 & 4294967295L));
                } else {
                    cx4.o(cx4Var, dx4Var, (int) (j2 >> 32), (int) (j2 & 4294967295L), null, 12);
                }
                return jg7.a;
            case 1:
                kq4 kq4Var = (kq4) this.L;
                dx4 dx4Var2 = (dx4) this.B;
                cx4 cx4Var2 = (cx4) obj;
                boolean z2 = kq4Var.o0;
                float f3 = kq4Var.k0;
                if (z2) {
                    cx4.l(cx4Var2, dx4Var2, cx4Var2.r0(f3), cx4Var2.r0(kq4Var.l0));
                } else {
                    cx4.j(cx4Var2, dx4Var2, cx4Var2.r0(f3), cx4Var2.r0(kq4Var.l0));
                }
                return jg7.a;
            case 2:
                ((eo2) this.L).o(Integer.valueOf(((a25) obj).a), Integer.valueOf(((m44) this.B).q().b));
                return jg7.a;
            case 3:
                cx4 cx4Var3 = (cx4) obj;
                ip ipVar = new ip(2, (ArrayList) this.B);
                cx4Var3.A = true;
                ipVar.g(cx4Var3);
                cx4Var3.A = false;
                ((qa4) this.L).getValue();
                return jg7.a;
            case 4:
                e00 e00Var = (e00) this.L;
                ax0 ax0Var = (ax0) this.B;
                gl1 gl1Var = (gl1) obj;
                e00Var.a(ax0Var);
                return new j00(5, e00Var, ax0Var);
            case 5:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                ((c15) this.L).b.Y(e36Var, (b15) this.B);
                return jg7.a;
            case 6:
                tu0 tu0Var = (tu0) this.L;
                ad5 ad5Var = (ad5) this.B;
                Throwable th3 = (Throwable) obj;
                if (!tu0Var.W()) {
                    if (th3 instanceof CancellationException) {
                        tu0Var.s((CancellationException) th3);
                    } else if (th3 == null) {
                        tu0Var.s(new CancellationException("Pending submission sync ended without a result"));
                    } else {
                        tu0Var.v0(th3);
                    }
                }
                synchronized (ad5Var.d) {
                    if (ad5Var.e == tu0Var) {
                        ad5Var.e = null;
                        ad5Var.f = null;
                    }
                }
                return jg7.a;
            case 7:
                pp6 pp6Var = (pp6) this.L;
                pp6 pp6Var2 = (pp6) this.B;
                no1 no1Var = (no1) obj;
                float e0 = no1Var.e0(2.0f);
                float f4 = e0 / 2.0f;
                no1.j0(no1Var, ((kt0) pp6Var.getValue()).a, no1Var.e0(kd5.a) - f4, 0L, new ys6(e0, RecyclerView.B1, 0, 0, null, 30), 108);
                if (om1.a(((om1) pp6Var2.getValue()).A, RecyclerView.B1) > 0) {
                    no1.j0(no1Var, ((kt0) pp6Var.getValue()).a, no1Var.e0(((om1) pp6Var2.getValue()).A) - f4, 0L, kc2.a, 108);
                }
                return jg7.a;
            case 8:
                ka4 ka4Var = (ka4) this.B;
                ((ey0) this.L).z(obj);
                if (ka4Var != null) {
                    ka4Var.a(obj);
                }
                return jg7.a;
            case 9:
                if5 if5Var = (if5) this.L;
                Throwable th4 = (Throwable) this.B;
                Throwable th5 = (Throwable) obj;
                synchronized (if5Var.c) {
                    if (th4 != null) {
                        if (th5 != null) {
                            try {
                                if (!(th5 instanceof CancellationException)) {
                                    th2 = th5;
                                }
                                if (th2 != null) {
                                    mb3.q(th4, th2);
                                }
                            } catch (Throwable th6) {
                                throw th6;
                            }
                        }
                        th = th4;
                    }
                    if5Var.e = th;
                    if5Var.u.l(ff5.ShutDown);
                }
                return jg7.a;
            case 10:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                ((bn5) this.L).e.Y(e36Var2, (fb5) this.B);
                return jg7.a;
            case 11:
                ea5 ea5Var = (ea5) this.B;
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                yc1 yc1Var = ((bn5) this.L).i;
                yc1Var.getClass();
                try {
                    ((tm0) yc1Var.A).Y(e36Var3, ea5Var);
                } catch (SQLException e) {
                    String message = e.getMessage();
                    if (message != null) {
                        if (!qs6.j0(message, "unique", true) && !qs6.j0(message, "2067", false) && !qs6.j0(message, "1555", false)) {
                            throw e;
                        }
                        ((um0) yc1Var.B).x(e36Var3, ea5Var);
                    } else {
                        throw e;
                    }
                }
                return jg7.a;
            case 12:
                return qo2.P((Context) this.L, (Boolean) obj, ((zt5) this.B).z);
            case 13:
                Context context = (Context) this.L;
                String str2 = (String) this.B;
                Boolean bool = (Boolean) obj;
                if (nb3.k(bool, Boolean.TRUE)) {
                    String string = context.getString(R.string.on);
                    string.getClass();
                    return string;
                } else if (nb3.k(bool, Boolean.FALSE)) {
                    String string2 = context.getString(R.string.off);
                    string2.getClass();
                    return string2;
                } else if (bool == null) {
                    return qo2.c(context, str2);
                } else {
                    i.d();
                    return null;
                }
            case 14:
                qn2 qn2Var = (qn2) this.B;
                pq5 pq5Var = (pq5) obj;
                pq5Var.getClass();
                p06 p06Var = ((a) this.L).j().b;
                Date time = Calendar.getInstance().getTime();
                time.getClass();
                xb2 xb2Var = (xb2) p06Var;
                xb2Var.getClass();
                CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                Iterator it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((pq5) it.next()).b(pq5Var)) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (i3 >= 0) {
                    pq5Var.g = time;
                    copyOnWriteArrayList.set(i3, pq5Var);
                    xb2Var.t(true);
                }
                qn2Var.g(pq5Var);
                return jg7.a;
            case 15:
                String str3 = "";
                a aVar = (a) this.L;
                qa4 qa4Var = (qa4) this.B;
                String str4 = (String) obj;
                if (str4 == null) {
                    str = "";
                } else {
                    str = str4;
                }
                qa4Var.setValue(str);
                tp6 tp6Var = aVar.j().k;
                if (str4 != null) {
                    str3 = str4;
                }
                tp6Var.getClass();
                tp6Var.m(null, str3);
                return jg7.a;
            case 16:
                ((wa4) this.L).a.setValue(new x62((tt7) this.B, (tt7) obj));
                return jg7.a;
            case 17:
                k86 k86Var = (k86) this.L;
                m86 m86Var = (m86) this.B;
                fn1 fn1Var = (fn1) obj;
                if (fn1Var.b) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long j3 = fn1Var.a;
                if (m86Var.d == lo4.Horizontal) {
                    a = jk4.a(j3, RecyclerView.B1, 1);
                } else {
                    a = jk4.a(j3, RecyclerView.B1, 2);
                }
                k86Var.a(1, jk4.g(f, a));
                return jg7.a;
            case 18:
                ah5 ah5Var = (ah5) this.B;
                gn gnVar = (gn) obj;
                ((cd) this.L).a(((Number) gnVar.d()).floatValue() - ah5Var.A);
                ah5Var.A = ((Number) gnVar.d()).floatValue();
                return jg7.a;
            case 19:
                List<tu0> list = (List) this.L;
                op6 op6Var = (op6) this.B;
                Throwable th7 = (Throwable) obj;
                if (th7 != null) {
                    for (tu0 tu0Var2 : list) {
                        tu0Var2.v0(th7);
                    }
                } else {
                    for (tu0 tu0Var3 : list) {
                        tu0Var3.b0(jg7.a);
                    }
                }
                synchronized (op6Var.d) {
                    op6Var.f.removeAll(list);
                }
                return jg7.a;
            case 20:
                cg0 cg0Var = (cg0) this.B;
                di7 di7Var = (di7) obj;
                di7Var.getClass();
                Object obj2 = ((HashMap) this.L).get(di7Var);
                if (obj2 != null) {
                    ui0 ui0Var = (ui0) obj2;
                    zi7 p = di7Var.p(cg0Var, ui0Var.a, ui0Var.b);
                    p.getClass();
                    return p;
                }
                i.h("Required value was null.");
                return null;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                ((px6) this.L).b.Y(e36Var4, (nx6) this.B);
                return jg7.a;
            case 22:
                gl1 gl1Var2 = (gl1) obj;
                return new j00(6, (qa4) this.L, (r94) this.B);
            case ConnectionResult.API_DISABLED /* 23 */:
                on2 on2Var = (on2) this.B;
                x07 x07Var = (x07) obj;
                ((on2) this.L).c();
                if (on2Var != null) {
                    z = ((Boolean) on2Var.c()).booleanValue();
                }
                if (z) {
                    x07Var.close();
                }
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                j37 j37Var = (j37) this.L;
                ((uh3) obj).getClass();
                if (!((Boolean) ((qa4) this.B).getValue()).booleanValue()) {
                    j37Var.b();
                }
                return jg7.a;
            case 25:
                f47 f47Var = (f47) this.L;
                ep epVar = (ep) this.B;
                op5 op5Var = (op5) obj;
                fp fpVar2 = f47Var.b;
                vs4 vs4Var = f47Var.a;
                a47 a47Var2 = (a47) vs4Var.getValue();
                if (a47Var2 != null && (z37Var = a47Var2.a) != null) {
                    fpVar = z37Var.a;
                } else {
                    fpVar = null;
                }
                if (nb3.k(fpVar2, fpVar) && (a47Var = (a47) vs4Var.getValue()) != null) {
                    v84 v84Var = a47Var.b;
                    ep c = f47.c(epVar, a47Var);
                    if (c != null) {
                        int i4 = c.c;
                        int i5 = c.b;
                        i = a47Var.i(i5, i4);
                        of5 b = a47Var.b(i5);
                        int i6 = i4 - 1;
                        of5 b2 = a47Var.b(i6);
                        if (v84Var.d(i5) == v84Var.d(i6)) {
                            f2 = Math.min(b2.a, b.a);
                        }
                        i.i(((Float.floatToRawIntBits(b.b) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32)) ^ (-9223372034707292160L));
                        if (i != null) {
                            e47Var = new e47(i);
                        }
                        if (e47Var != null) {
                            op5Var.n(e47Var);
                            op5Var.f(true);
                        }
                        return jg7.a;
                    }
                }
                i = null;
                if (i != null) {
                }
                if (e47Var != null) {
                }
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                ep epVar2 = (ep) this.L;
                ss4 ss4Var = ((vv3) this.B).b;
                d07 d07Var = (d07) obj;
                pv3 pv3Var = (pv3) epVar2.a;
                g47 a5 = pv3Var.a();
                if (a5 != null) {
                    nn6Var = a5.a;
                } else {
                    nn6Var = null;
                }
                if ((ss4Var.h() & 1) != 0 && (a4 = pv3Var.a()) != null) {
                    nn6Var2 = a4.b;
                } else {
                    nn6Var2 = null;
                }
                if (nn6Var != null) {
                    nn6Var2 = nn6Var.c(nn6Var2);
                }
                if ((ss4Var.h() & 2) != 0 && (a3 = pv3Var.a()) != null) {
                    nn6Var3 = a3.c;
                } else {
                    nn6Var3 = null;
                }
                if (nn6Var2 != null) {
                    nn6Var3 = nn6Var2.c(nn6Var3);
                }
                if ((ss4Var.h() & 4) != 0 && (a2 = pv3Var.a()) != null) {
                    nn6Var4 = a2.d;
                }
                if (nn6Var3 != null) {
                    nn6Var4 = nn6Var3.c(nn6Var4);
                }
                d07Var.b = d07Var.a.b(new t00(new Object(), epVar2, nn6Var4, 27));
                return jg7.a;
            case 27:
                List list2 = (List) this.L;
                List list3 = (List) this.B;
                cx4 cx4Var4 = (cx4) obj;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        vr4 vr4Var = (vr4) list2.get(i7);
                        cx4.k(cx4Var4, (dx4) vr4Var.A, ((i93) vr4Var.B).a);
                    }
                }
                if (list3 != null) {
                    int size2 = list3.size();
                    while (i3 < size2) {
                        vr4 vr4Var2 = (vr4) list3.get(i3);
                        dx4 dx4Var3 = (dx4) vr4Var2.A;
                        on2 on2Var2 = (on2) vr4Var2.B;
                        if (on2Var2 != null) {
                            j = ((i93) on2Var2.c()).a;
                        } else {
                            j = 0;
                        }
                        cx4.k(cx4Var4, dx4Var3, j);
                        i3++;
                    }
                }
                return jg7.a;
            case 28:
                gl1 gl1Var3 = (gl1) obj;
                hv.L((w61) this.L, null, a71.UNDISPATCHED, new wc4((ga7) this.B, null), 1);
                return new vj(3);
            default:
                gx0 gx0Var = (gx0) this.L;
                gl1 gl1Var4 = (gl1) obj;
                ((n96) gx0Var).y(new qm6(new ja7(2, Thread.currentThread(), (w61) this.B)));
                return new z3(gx0Var, 14);
        }
    }

    public /* synthetic */ qk4(int i, Object obj, Object obj2) {
        this.A = i;
        this.L = obj;
        this.B = obj2;
    }
}
