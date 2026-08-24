package defpackage;

import android.hardware.camera2.CameraManager;
import androidx.work.impl.WorkDatabase;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import defpackage.sz1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class q6 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ q6(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0188  */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        Object obj;
        List list;
        int i;
        br2 br2Var;
        bj5 bj5Var;
        br2 br2Var2;
        bj5 bj5Var2;
        vh4 vh4Var = null;
        switch (this.A) {
            case 0:
                mp2.V(((w6) this.B).a, new k0((m95) this.L, 7));
                return jg7.a;
            case 1:
                mp2.V(((w6) this.B).a, new k0((x95) this.L, 6));
                return jg7.a;
            case 2:
                mp2.V(((w6) this.B).a, new k0((o95) this.L, 5));
                return jg7.a;
            case 3:
                mp2.V(((w6) this.B).a, new t6((y95) this.L, 0));
                return jg7.a;
            case 4:
                mp2.V(((w6) this.B).a, new r6((u95) this.L, 0));
                return jg7.a;
            case 5:
                ((bg2) this.B).g((n8) this.L);
                return jg7.a;
            case 6:
                ((dh5) this.B).A = ((on2) this.L).c();
                return jg7.a;
            case 7:
                ((ul0) this.B).c(this.L);
                return jg7.a;
            case 8:
                ((pw0) this.B).c = (on2) this.L;
                return jg7.a;
            case 9:
                d10 d10Var = (d10) this.B;
                um3 um3Var = (um3) this.L;
                d10Var.s0 = d10Var.n0.a(um3Var.A.e(), um3Var.getLayoutDirection(), um3Var);
                return jg7.a;
            case 10:
                b20 b20Var = (b20) this.L;
                a21 a21Var = ((c20) this.B).a;
                a21Var.getClass();
                synchronized (a21Var.d) {
                    if (((LinkedHashSet) a21Var.f).remove(b20Var) && ((LinkedHashSet) a21Var.f).isEmpty()) {
                        a21Var.h();
                    }
                }
                return jg7.a;
            case 11:
                c37 c37Var = (c37) this.B;
                qa4 qa4Var = (qa4) this.L;
                if (!k47.b(c37Var.b, ((c37) qa4Var.getValue()).b) || !nb3.k(c37Var.c, ((c37) qa4Var.getValue()).c)) {
                    qa4Var.setValue(c37Var);
                }
                return jg7.a;
            case 12:
                f47 f47Var = (f47) this.B;
                fp fpVar = (fp) this.L;
                if (f47Var != null) {
                    mm6 mm6Var = f47Var.c;
                    boolean isEmpty = mm6Var.isEmpty();
                    fp fpVar2 = f47Var.b;
                    if (!isEmpty) {
                        d07 d07Var = new d07(fpVar2);
                        int size = mm6Var.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((qn2) mm6Var.get(i2)).g(d07Var);
                        }
                        fpVar2 = d07Var.b;
                    }
                    f47Var.b = fpVar2;
                    if (fpVar2 != null) {
                        return fpVar2;
                    }
                    return fpVar;
                }
                return fpVar;
            case 13:
                ((CameraManager) this.B).unregisterAvailabilityCallback((yb0) this.L);
                return jg7.a;
            case 14:
                ((sc0) this.B).L.unregisterAvailabilityCallback((rc0) this.L);
                return jg7.a;
            case 15:
                ((CameraManager) this.B).unregisterAvailabilityCallback((rc0) this.L);
                return jg7.a;
            case 16:
                lw7 lw7Var = (lw7) this.B;
                WorkDatabase workDatabase = lw7Var.c;
                workDatabase.getClass();
                workDatabase.o(new er2(new mf(10, lw7Var, (UUID) this.L), 26));
                h66.b(lw7Var.b, lw7Var.c, lw7Var.e);
                return jg7.a;
            case 17:
                rc4 rc4Var = (rc4) this.B;
                aq0 aq0Var = (aq0) this.L;
                Iterator it = gt0.a1(rc4Var.b.f).iterator();
                if (it.hasNext()) {
                    it.next();
                }
                Iterator it2 = ((f11) sb6.Y(it)).iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj = it2.next();
                        if (!(((sb4) obj).B instanceof mc4)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                if (((sb4) obj) == null) {
                    if (!((Boolean) aq0Var.u.A.getValue()).booleanValue()) {
                        if (((List) aq0Var.e.getValue()).isEmpty()) {
                            aq0Var.v.c(Boolean.TRUE);
                        } else {
                            tp6 tp6Var = aq0Var.t;
                            Boolean bool = Boolean.TRUE;
                            tp6Var.getClass();
                            tp6Var.m(null, bool);
                            hv.L(to7.a(aq0Var), null, null, new a6(aq0Var, null, 10), 3);
                        }
                    }
                    return jg7.a;
                }
                return Boolean.valueOf(rc4Var.c());
            case 18:
                Object obj2 = this.L;
                xq2 xq2Var = ((cy0) this.B).A;
                mk6 mk6Var = xq2Var.c;
                lk6 c = mk6Var.c();
                int i3 = 0;
                while (i3 < mk6Var.B) {
                    try {
                        if (c.l(i3)) {
                            Object n = c.n(i3);
                            if (n != obj2) {
                                if (n instanceof br2) {
                                    br2Var2 = (br2) n;
                                } else {
                                    br2Var2 = null;
                                }
                                if (br2Var2 != null) {
                                    bj5Var2 = br2Var2.a;
                                } else {
                                    bj5Var2 = null;
                                }
                                if (bj5Var2 == obj2) {
                                }
                            }
                            vh4 vh4Var2 = new vh4(i3, null);
                            c.c();
                            vh4Var = vh4Var2;
                            if (vh4Var != null) {
                                int i4 = vh4Var.a;
                                Integer num = vh4Var.b;
                                c = mk6Var.c();
                                try {
                                    ArrayList I0 = ak7.I0(c, i4, num);
                                    c.c();
                                    list = gt0.V0(I0, xq2Var.I());
                                } finally {
                                }
                            } else {
                                list = yt1.A;
                            }
                            return new fx0(list, xq2Var.C);
                        }
                        int[] iArr = c.b;
                        int b = ok6.b(iArr, i3);
                        int i5 = i3 + 1;
                        if (i5 < c.c) {
                            i = iArr[(i5 * 5) + 4];
                        } else {
                            i = c.e;
                        }
                        int i6 = i - b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            Object h = c.h(i3, i7);
                            if (h != obj2) {
                                if (h instanceof br2) {
                                    br2Var = (br2) h;
                                } else {
                                    br2Var = null;
                                }
                                if (br2Var != null) {
                                    bj5Var = br2Var.a;
                                } else {
                                    bj5Var = null;
                                }
                                if (bj5Var != obj2) {
                                }
                            }
                            vh4Var = new vh4(i3, Integer.valueOf(i7));
                            if (vh4Var != null) {
                            }
                            return new fx0(list, xq2Var.C);
                        }
                        i3 = i5;
                    } finally {
                    }
                }
                if (vh4Var != null) {
                }
                return new fx0(list, xq2Var.C);
            case 19:
                ((qn2) this.B).g((jq1) this.L);
                return jg7.a;
            case 20:
                ((qa4) this.L).setValue(Boolean.FALSE);
                ((j04) this.B).a(new vr4(null, new String[]{"*/*"}));
                return jg7.a;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ((qa4) this.L).setValue(Boolean.FALSE);
                ((qa4) this.B).setValue(Boolean.TRUE);
                return jg7.a;
            case 22:
                xc1 xc1Var = (xc1) this.B;
                on2 on2Var = (on2) this.L;
                if (xc1Var != xc1.DECRYPTING) {
                    on2Var.c();
                }
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                return new i93(kn2.a0(((m07) this.B).i((jk3) ((on2) this.L).c())));
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((s07) this.B).d.g((x07) this.L);
                return jg7.a;
            case 25:
                ((ij1) this.B).e((sb4) this.L, false);
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                return new ep1((fp1) this.B, (qn2) this.L);
            case 27:
                ((EmulatorActivity) this.B).Q1 = (ah2) this.L;
                return jg7.a;
            case 28:
                sz1 sz1Var = (sz1) this.B;
                sz1Var.N = null;
                sz1Var.O = sz1.c.DISABLED;
                sz1Var.K = false;
                ((dh5) this.L).A = sz1Var.j0();
                return jg7.a;
            default:
                Enum[] enumArr = ((v52) this.B).a;
                s52 s52Var = new s52((String) this.L, enumArr.length);
                for (Enum r4 : enumArr) {
                    s52Var.l(r4.name(), false);
                }
                return s52Var;
        }
    }
}
