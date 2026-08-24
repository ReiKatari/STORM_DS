package defpackage;

import android.net.Uri;
import android.os.Handler;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.domain.model.VideoFiltering;
import me.magnum.melonds.ui.dldi.DldiFileManagerActivity;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class y implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        qh1 qh1Var;
        int i;
        float f;
        long j;
        boolean z = false;
        UUID uuid = null;
        switch (this.A) {
            case 0:
                Throwable th = (Throwable) obj;
                ((r94) this.B).b((k25) this.L);
                return jg7.a;
            case 1:
                ((qh1) obj).getClass();
                float h = ((rs4) this.B).h();
                Integer num = (Integer) ((qa4) this.L).getValue();
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = Integer.MAX_VALUE;
                }
                return new i93(qh1Var.r0(h * i) & 4294967295L);
            case 2:
                rz rzVar = (rz) this.B;
                sz szVar = (sz) this.L;
                gi5 gi5Var = (gi5) obj;
                jg7 jg7Var = jg7.a;
                u57 u57Var = rzVar.k0;
                if (u57Var != null) {
                    u57Var.b();
                }
                rzVar.k0 = null;
                tu0 tu0Var = szVar.b;
                if (tu0Var != null) {
                    tu0Var.b0(jg7Var);
                }
                szVar.b = null;
                return jg7Var;
            case 3:
                e00 e00Var = (e00) this.B;
                pw0 pw0Var = (pw0) this.L;
                gl1 gl1Var = (gl1) obj;
                e00Var.a(pw0Var);
                return new j00(0, e00Var, pw0Var);
            case 4:
                String str = (String) obj;
                str.getClass();
                ((v10) this.L).e(new n00(null, str, (Uri) this.B));
                return jg7.a;
            case 5:
                qn2 qn2Var = (qn2) this.L;
                n00 n00Var = (n00) obj;
                tp6 tp6Var = ((v10) this.B).f;
                if (n00Var != null) {
                    uuid = n00Var.a;
                }
                tp6Var.l(uuid);
                qn2Var.g(n00Var);
                return jg7.a;
            case 6:
                qn2 qn2Var2 = (qn2) this.L;
                c37 c37Var = (c37) obj;
                if (!nb3.k((c37) this.B, c37Var)) {
                    qn2Var2.g(c37Var);
                }
                return jg7.a;
            case 7:
                um3 um3Var = (um3) obj;
                um3Var.b();
                no1.b0(um3Var, (hj) this.B, (f80) this.L, RecyclerView.B1, null, 60);
                return jg7.a;
            case 8:
                um3 um3Var2 = (um3) obj;
                um3Var2.b();
                no1.b0(um3Var2, ((po4) this.B).f, (f80) this.L, RecyclerView.B1, null, 60);
                return jg7.a;
            case 9:
                Throwable th2 = (Throwable) obj;
                ((p70) this.B).a.j((l31) this.L);
                return jg7.a;
            case 10:
                e36 e36Var = (e36) obj;
                e36Var.getClass();
                return Long.valueOf(((vm0) this.B).b.Z(e36Var, (zm0) this.L));
            case 11:
                e36 e36Var2 = (e36) obj;
                e36Var2.getClass();
                return Long.valueOf(((xm0) this.B).b.Z(e36Var2, (ym0) this.L));
            case 12:
                e36 e36Var3 = (e36) obj;
                e36Var3.getClass();
                return ((bn0) this.B).b.a0(e36Var3, (ArrayList) this.L);
            case 13:
                e36 e36Var4 = (e36) obj;
                e36Var4.getClass();
                return Long.valueOf(((bn0) this.B).b.Z(e36Var4, (cn0) this.L));
            case 14:
                zg5 zg5Var = (zg5) this.L;
                boolean y = ((ur2) obj).y((s43) this.B);
                if (zg5Var.A || y) {
                    z = true;
                }
                zg5Var.A = z;
                return Boolean.valueOf(!z);
            case 15:
                zg5 zg5Var2 = (zg5) this.L;
                boolean V = ((ur2) obj).V((vy4) this.B);
                if (zg5Var2.A || V) {
                    z = true;
                }
                zg5Var2.A = z;
                return Boolean.valueOf(!z);
            case 16:
                jt3 jt3Var = (jt3) this.B;
                f80 f80Var = (f80) this.L;
                um3 um3Var3 = (um3) obj;
                um3Var3.b();
                if (((Boolean) jt3Var.s.getValue()).booleanValue() || ((Boolean) jt3Var.t.getValue()).booleanValue()) {
                    no1.D0(um3Var3, f80Var, 0L, 0L, RecyclerView.B1, null, 126);
                }
                return jg7.a;
            case 17:
                jg1 jg1Var = (jg1) this.B;
                tu0 tu0Var2 = (tu0) this.L;
                Throwable th3 = (Throwable) obj;
                jg1Var.getClass();
                tu0Var2.getClass();
                if (th3 != null) {
                    if (th3 instanceof CancellationException) {
                        tu0Var2.z((CancellationException) th3);
                    } else {
                        tu0Var2.v0(th3);
                    }
                } else {
                    tu0Var2.b0(jg1Var.k());
                }
                return jg7.a;
            case 18:
                qb0 qb0Var = (qb0) this.B;
                tu0 tu0Var3 = (tu0) this.L;
                Throwable th4 = (Throwable) obj;
                if (th4 != null) {
                    if (th4 instanceof CancellationException) {
                        qb0Var.b();
                    } else {
                        qb0Var.c(th4);
                    }
                } else {
                    qb0Var.a(tu0Var3.J());
                }
                return jg7.a;
            case 19:
                la1 la1Var = (la1) this.B;
                DSiWareTitle dSiWareTitle = (DSiWareTitle) this.L;
                String str2 = (String) obj;
                str2.getClass();
                dSiWareTitle.getClass();
                hv.L(to7.a(la1Var), null, null, new ka1(la1Var, dSiWareTitle, str2, null, 1), 3);
                return jg7.a;
            case 20:
                pq5 pq5Var = (pq5) obj;
                pq5Var.getClass();
                ((la1) this.B).e(pq5Var.d);
                ((qa4) this.L).setValue(Boolean.FALSE);
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                dSiWareTitle2.getClass();
                j37.c((j37) this.B, dSiWareTitle2.getName(), new y(19, (la1) this.L, dSiWareTitle2));
                return jg7.a;
            case 22:
                e36 e36Var5 = (e36) obj;
                e36Var5.getClass();
                ((zh1) this.B).b.Y(e36Var5, (vh1) this.L);
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                kk1 kk1Var = (kk1) this.B;
                bk1 bk1Var = (bk1) this.L;
                ((IOException) obj).getClass();
                synchronized (kk1Var) {
                    bk1Var.g();
                }
                return jg7.a;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                er3 er3Var = (er3) obj;
                int i2 = DldiFileManagerActivity.r0;
                er3Var.getClass();
                List list = (List) ((qa4) this.B).getValue();
                er3Var.h0(list.size(), null, new j5(7, list), new zv0(802480018, true, new s5(list, (es7) this.L, 1)));
                return jg7.a;
            case 25:
                cd cdVar = (cd) this.B;
                fo1 fo1Var = (fo1) this.L;
                long j2 = ((fn1) obj).a;
                if (fo1Var.K0) {
                    f = -1.0f;
                } else {
                    f = 1.0f;
                }
                long g = jk4.g(f, j2);
                lo4 lo4Var = fo1Var.G0;
                do1 do1Var = eo1.a;
                if (lo4Var == lo4.Vertical) {
                    j = g & 4294967295L;
                } else {
                    j = g >> 32;
                }
                cdVar.a(Float.intBitsToFloat((int) j));
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                EmulatorActivity emulatorActivity = (EmulatorActivity) this.B;
                int intValue = ((Integer) obj).intValue();
                int i3 = EmulatorActivity.Z1;
                sz1 W = emulatorActivity.W();
                a36 a36Var = (a36) ((List) this.L).get(intValue);
                W.getClass();
                a36Var.getClass();
                W.j1(new k0(a36Var, 28));
                Handler handler = emulatorActivity.N0;
                if (handler != null) {
                    handler.post(new gu1(emulatorActivity, 8));
                    return jg7.a;
                }
                nb3.a0("handler");
                throw null;
            case 27:
                EmulatorActivity emulatorActivity2 = (EmulatorActivity) this.B;
                int intValue2 = ((Integer) obj).intValue();
                int i4 = EmulatorActivity.Z1;
                sz1 W2 = emulatorActivity2.W();
                W2.getClass();
                W2.j1(new k0((VideoFiltering) ((ArrayList) this.L).get(intValue2), 27));
                Handler handler2 = emulatorActivity2.N0;
                if (handler2 != null) {
                    handler2.post(new gu1(emulatorActivity2, 9));
                    return jg7.a;
                }
                nb3.a0("handler");
                throw null;
            case 28:
                Integer num2 = (Integer) obj;
                num2.getClass();
                int i5 = EmulatorActivity.Z1;
                ((mv1) ((ov1) this.B)).d.g(num2);
                ((EmulatorActivity) this.L).b0();
                return jg7.a;
            default:
                Throwable th5 = (Throwable) obj;
                ((g62) this.B).b.b((f62) this.L);
                return jg7.a;
        }
    }
}
