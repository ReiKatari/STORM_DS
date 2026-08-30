package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qm  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class qm implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ qm(j75 j75Var, s34 s34Var, b44 b44Var, Bundle bundle) {
        this.A = 9;
        this.X = j75Var;
        this.L = s34Var;
        this.R = b44Var;
        this.B = bundle;
    }

    /* JADX WARN: Type inference failed for: r1v30, types: [xf1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, n75] */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        long j;
        int i;
        long j2;
        int i2 = this.A;
        int i3 = 0;
        o27 o27Var = o27.a;
        Object obj2 = this.B;
        Object obj3 = this.X;
        Object obj4 = this.R;
        Object obj5 = this.L;
        switch (i2) {
            case 0:
                um umVar = (um) obj5;
                io ioVar = (io) obj4;
                mi2 mi2Var = (mi2) obj2;
                j75 j75Var = (j75) obj3;
                go goVar = (go) obj;
                io ioVar2 = umVar.c;
                gk2.g0(goVar, ioVar2);
                tj4 tj4Var = goVar.e;
                Object a = um.a(umVar, tj4Var.getValue());
                if (!b53.x(a, tj4Var.getValue())) {
                    ioVar2.B.setValue(a);
                    ioVar.B.setValue(a);
                    if (mi2Var != null) {
                        mi2Var.n(umVar);
                    }
                    goVar.a();
                    j75Var.A = true;
                } else if (mi2Var != null) {
                    mi2Var.n(umVar);
                }
                return o27Var;
            case 1:
                List list = (List) obj5;
                ek3 ek3Var = (ek3) obj;
                ek3Var.getClass();
                ek3Var.b0(list.size(), new s5(6, new xk0(2), list), new k5(4, list), new et0(2039820996, true, new t5(list, (mi2) obj2, (k24) obj4, (mi2) obj3)));
                ek3.a0(ek3Var, "cheats_footer_note", null, mh7.b, 2);
                return o27Var;
            case 2:
                pn0 pn0Var = (pn0) obj4;
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                tq5.w((o31) obj5, null, null, new m5((r96) obj2, (Resources) obj3, cheat, pn0Var, null, 4), 3);
                pn0Var.getClass();
                vk0 vk0Var = (vk0) pn0Var.c.a("selected_folder");
                if (vk0Var != null) {
                    tq5.w(ua7.a(pn0Var), null, null, new a0(pn0Var, cheat, vk0Var, (j11) null, 16), 3);
                }
                return o27Var;
            case 3:
                hm3 hm3Var = (hm3) obj5;
                zq6 zq6Var = (zq6) obj4;
                oq6 oq6Var = (oq6) obj2;
                hx2 hx2Var = (hx2) obj3;
                ch1 ch1Var = (ch1) obj;
                if (hm3Var.b()) {
                    k91 k91Var = hm3Var.d;
                    o21 o21Var = hm3Var.v;
                    o21 o21Var2 = hm3Var.w;
                    ?? obj6 = new Object();
                    cz czVar = new cz(k91Var, o21Var, (Object) obj6, 26);
                    cp4 cp4Var = zq6Var.a;
                    cp4Var.b(oq6Var, hx2Var, czVar, o21Var2);
                    er6 er6Var = new er6(zq6Var, cp4Var);
                    zq6Var.b.set(er6Var);
                    obj6.A = er6Var;
                    hm3Var.e = er6Var;
                }
                return new jj(1);
            case 4:
                List list2 = (List) obj5;
                ek3 ek3Var2 = (ek3) obj;
                ek3Var2.getClass();
                ek3Var2.b0(list2.size(), null, new k5(6, list2), new et0(802480018, true, new t5(list2, (mi2) obj2, (aj2) obj4, (ih4) obj3)));
                return o27Var;
            case 5:
                dz2 dz2Var = (dz2) obj4;
                k75 k75Var = (k75) obj2;
                o31 o31Var = (o31) obj3;
                long longValue = ((Long) obj).longValue();
                ae6 ae6Var = (ae6) ((k24) obj5).getValue();
                if (ae6Var != null) {
                    j = ((Number) ae6Var.getValue()).longValue();
                } else {
                    j = longValue;
                }
                long j3 = dz2Var.c;
                o24 o24Var = dz2Var.a;
                if (j3 == Long.MIN_VALUE || k75Var.A != gk2.O(o31Var.w())) {
                    dz2Var.c = longValue;
                    Object[] objArr = o24Var.A;
                    int i4 = o24Var.L;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((az2) objArr[i5]).Z = true;
                    }
                    k75Var.A = gk2.O(o31Var.w());
                }
                float f = k75Var.A;
                if (f == RecyclerView.A1) {
                    Object[] objArr2 = o24Var.A;
                    int i6 = o24Var.L;
                    while (i3 < i6) {
                        az2 az2Var = (az2) objArr2[i3];
                        az2Var.R.setValue(az2Var.X.L);
                        az2Var.Z = true;
                        i3++;
                    }
                } else {
                    long j4 = ((float) (j - dz2Var.c)) / f;
                    Object[] objArr3 = o24Var.A;
                    int i7 = o24Var.L;
                    boolean z = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        az2 az2Var2 = (az2) objArr3[i8];
                        if (!az2Var2.Y) {
                            az2Var2.d0.b.setValue(Boolean.FALSE);
                            if (az2Var2.Z) {
                                az2Var2.Z = false;
                                az2Var2.c0 = j4;
                            }
                            long j5 = j4 - az2Var2.c0;
                            az2Var2.R.setValue(az2Var2.X.c(j5));
                            az2Var2.Y = az2Var2.X.i(j5);
                        }
                        if (!az2Var2.Y) {
                            z = false;
                        }
                    }
                    dz2Var.d.setValue(Boolean.valueOf(!z));
                }
                return o27Var;
            case ig7.b /* 6 */:
                List list3 = (List) obj5;
                l75 l75Var = (l75) obj4;
                List list4 = (List) obj2;
                yh3 yh3Var = (yh3) obj3;
                ys4 ys4Var = (ys4) obj;
                wh6 wh6Var = ys4Var.e;
                if (wh6Var != null) {
                    i = wh6Var.a();
                } else {
                    i = 0;
                }
                int i9 = 0;
                while (i3 < i) {
                    jf4 jf4Var = yh3Var.q;
                    jf4 jf4Var2 = jf4.Vertical;
                    wh6 wh6Var2 = ys4Var.e;
                    long j6 = 0;
                    if (jf4Var == jf4Var2) {
                        if (wh6Var2 != null) {
                            j6 = wh6Var2.c(i3);
                        }
                        j2 = 4294967295L & j6;
                    } else {
                        if (wh6Var2 != null) {
                            j6 = wh6Var2.c(i3);
                        }
                        j2 = j6 >> 32;
                    }
                    i9 += (int) j2;
                    i3++;
                }
                if (list3 != null) {
                    list3.add(Integer.valueOf(i9));
                }
                if (l75Var.A != list4.size()) {
                    l75Var.A++;
                }
                return o27Var;
            case 7:
                qj3 qj3Var = (qj3) obj5;
                ch1 ch1Var2 = (ch1) obj;
                ?? obj7 = new Object();
                obj7.L = (dj3) obj4;
                obj7.B = (yh6) obj2;
                obj7.R = (zs4) obj3;
                obj7.A = true;
                qj3Var.c = obj7;
                return new y3(11, qj3Var);
            case 8:
                k75 k75Var2 = (k75) obj5;
                h04 h04Var = (h04) obj4;
                xw5 xw5Var = (xw5) obj2;
                e5 e5Var = (e5) obj3;
                go goVar2 = (go) obj;
                float floatValue = ((Number) goVar2.e.getValue()).floatValue() - k75Var2.A;
                if (!ve2.i(floatValue)) {
                    if (!ve2.i(floatValue - h04Var.e(xw5Var, floatValue))) {
                        goVar2.a();
                        return o27Var;
                    }
                    k75Var2.A += floatValue;
                }
                if (((Boolean) e5Var.n(Float.valueOf(k75Var2.A))).booleanValue()) {
                    goVar2.a();
                }
                return o27Var;
            case 9:
                l34 l34Var = (l34) obj;
                l34Var.getClass();
                ((j75) obj3).A = true;
                ((s34) obj5).a((b44) obj4, (Bundle) obj2, l34Var, pp1.A);
                return o27Var;
            default:
                List list5 = (List) obj5;
                ek3 ek3Var3 = (ek3) obj;
                ek3Var3.getClass();
                ek3Var3.b0(list5.size(), new s5(18, new qt0(24), list5), new k5(13, list5), new et0(2039820996, true, new t5(list5, (RewindWindow) obj4, (wc2) obj3, (mi2) obj2, 5)));
                return o27Var;
        }
    }

    public /* synthetic */ qm(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.B = obj3;
        this.X = obj4;
    }

    public /* synthetic */ qm(ArrayList arrayList, l75 l75Var, List list, int i, yh3 yh3Var) {
        this.A = 6;
        this.L = arrayList;
        this.R = l75Var;
        this.B = list;
        this.X = yh3Var;
    }

    public /* synthetic */ qm(List list, Object obj, mi2 mi2Var, Object obj2, int i) {
        this.A = i;
        this.L = list;
        this.B = mi2Var;
        this.R = obj;
        this.X = obj2;
    }

    public /* synthetic */ qm(List list, RewindWindow rewindWindow, wc2 wc2Var, mi2 mi2Var) {
        this.A = 10;
        this.L = list;
        this.R = rewindWindow;
        this.X = wc2Var;
        this.B = mi2Var;
    }
}
