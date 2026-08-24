package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.emulator.rewind.model.RewindWindow;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cn  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class cn implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ cn(zg5 zg5Var, zb4 zb4Var, ic4 ic4Var, Bundle bundle) {
        this.A = 9;
        this.X = zg5Var;
        this.L = zb4Var;
        this.R = ic4Var;
        this.B = bundle;
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [bk1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [dh5, java.lang.Object] */
    @Override // defpackage.qn2
    public final Object g(Object obj) {
        long j;
        int i;
        long j2;
        int i2 = this.A;
        int i3 = 0;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.X;
        Object obj3 = this.B;
        Object obj4 = this.R;
        Object obj5 = this.L;
        switch (i2) {
            case 0:
                gn gnVar = (gn) obj5;
                uo uoVar = (uo) obj4;
                qn2 qn2Var = (qn2) obj3;
                zg5 zg5Var = (zg5) obj2;
                so soVar = (so) obj;
                uo uoVar2 = gnVar.c;
                kj2.d0(soVar, uoVar2);
                vs4 vs4Var = soVar.e;
                Object a = gn.a(gnVar, vs4Var.getValue());
                if (!nb3.k(a, vs4Var.getValue())) {
                    uoVar2.B.setValue(a);
                    uoVar.B.setValue(a);
                    if (qn2Var != null) {
                        qn2Var.g(gnVar);
                    }
                    soVar.a();
                    zg5Var.A = true;
                } else if (qn2Var != null) {
                    qn2Var.g(gnVar);
                }
                return jg7Var;
            case 1:
                List list = (List) obj5;
                er3 er3Var = (er3) obj;
                er3Var.getClass();
                er3Var.h0(list.size(), new r5(6, new fn0(2), list), new j5(4, list), new zv0(2039820996, true, new t5(list, (qn2) obj3, (qa4) obj4, (qn2) obj2)));
                er3.g0(er3Var, "cheats_footer_note", null, ak7.c, 2);
                return jg7Var;
            case 2:
                aq0 aq0Var = (aq0) obj4;
                Cheat cheat = (Cheat) obj;
                cheat.getClass();
                hv.L((w61) obj5, null, null, new l5((gl6) obj3, (Resources) obj2, cheat, aq0Var, null, 3), 3);
                aq0Var.getClass();
                dn0 dn0Var = (dn0) aq0Var.c.a("selected_folder");
                if (dn0Var != null) {
                    hv.L(to7.a(aq0Var), null, null, new b0(aq0Var, cheat, dn0Var, (r41) null, 15), 3);
                }
                return jg7Var;
            case 3:
                jt3 jt3Var = (jt3) obj5;
                o37 o37Var = (o37) obj4;
                c37 c37Var = (c37) obj3;
                l33 l33Var = (l33) obj2;
                gl1 gl1Var = (gl1) obj;
                if (jt3Var.b()) {
                    yc1 yc1Var = jt3Var.d;
                    w51 w51Var = jt3Var.v;
                    w51 w51Var2 = jt3Var.w;
                    ?? obj6 = new Object();
                    t00 t00Var = new t00(yc1Var, w51Var, (Object) obj6, 28);
                    gy4 gy4Var = o37Var.a;
                    gy4Var.e(c37Var, l33Var, t00Var, w51Var2);
                    t37 t37Var = new t37(o37Var, gy4Var);
                    o37Var.b.set(t37Var);
                    obj6.A = t37Var;
                    jt3Var.e = t37Var;
                }
                return new vj(1);
            case 4:
                List list2 = (List) obj5;
                er3 er3Var2 = (er3) obj;
                er3Var2.getClass();
                er3Var2.h0(list2.size(), null, new j5(6, list2), new zv0(802480018, true, new t5(list2, (qn2) obj3, (eo2) obj4, (lq4) obj2)));
                return jg7Var;
            case 5:
                g53 g53Var = (g53) obj4;
                ah5 ah5Var = (ah5) obj3;
                w61 w61Var = (w61) obj2;
                long longValue = ((Long) obj).longValue();
                pp6 pp6Var = (pp6) ((qa4) obj5).getValue();
                if (pp6Var != null) {
                    j = ((Number) pp6Var.getValue()).longValue();
                } else {
                    j = longValue;
                }
                long j3 = g53Var.c;
                ua4 ua4Var = g53Var.a;
                if (j3 == Long.MIN_VALUE || ah5Var.A != kj2.y(w61Var.A())) {
                    g53Var.c = longValue;
                    Object[] objArr = ua4Var.A;
                    int i4 = ua4Var.L;
                    for (int i5 = 0; i5 < i4; i5++) {
                        ((e53) objArr[i5]).Z = true;
                    }
                    ah5Var.A = kj2.y(w61Var.A());
                }
                float f = ah5Var.A;
                if (f == RecyclerView.B1) {
                    Object[] objArr2 = ua4Var.A;
                    int i6 = ua4Var.L;
                    while (i3 < i6) {
                        e53 e53Var = (e53) objArr2[i3];
                        e53Var.R.setValue(e53Var.X.L);
                        e53Var.Z = true;
                        i3++;
                    }
                } else {
                    long j4 = ((float) (j - g53Var.c)) / f;
                    Object[] objArr3 = ua4Var.A;
                    int i7 = ua4Var.L;
                    boolean z = true;
                    for (int i8 = 0; i8 < i7; i8++) {
                        e53 e53Var2 = (e53) objArr3[i8];
                        if (!e53Var2.Y) {
                            e53Var2.e0.b.setValue(Boolean.FALSE);
                            if (e53Var2.Z) {
                                e53Var2.Z = false;
                                e53Var2.d0 = j4;
                            }
                            long j5 = j4 - e53Var2.d0;
                            e53Var2.R.setValue(e53Var2.X.g(j5));
                            e53Var2.Y = e53Var2.X.e(j5);
                        }
                        if (!e53Var2.Y) {
                            z = false;
                        }
                    }
                    g53Var.d.setValue(Boolean.valueOf(!z));
                }
                return jg7Var;
            case 6:
                List list3 = (List) obj5;
                bh5 bh5Var = (bh5) obj4;
                List list4 = (List) obj3;
                wo3 wo3Var = (wo3) obj2;
                a25 a25Var = (a25) obj;
                nt6 nt6Var = a25Var.e;
                if (nt6Var != null) {
                    i = nt6Var.a();
                } else {
                    i = 0;
                }
                int i9 = 0;
                while (i3 < i) {
                    lo4 lo4Var = wo3Var.q;
                    lo4 lo4Var2 = lo4.Vertical;
                    nt6 nt6Var2 = a25Var.e;
                    long j6 = 0;
                    if (lo4Var == lo4Var2) {
                        if (nt6Var2 != null) {
                            j6 = nt6Var2.c(i3);
                        }
                        j2 = 4294967295L & j6;
                    } else {
                        if (nt6Var2 != null) {
                            j6 = nt6Var2.c(i3);
                        }
                        j2 = j6 >> 32;
                    }
                    i9 += (int) j2;
                    i3++;
                }
                if (list3 != null) {
                    list3.add(Integer.valueOf(i9));
                }
                if (bh5Var.A != list4.size()) {
                    bh5Var.A++;
                }
                return jg7Var;
            case 7:
                pq3 pq3Var = (pq3) obj5;
                gl1 gl1Var2 = (gl1) obj;
                ?? obj7 = new Object();
                obj7.L = (bq3) obj4;
                obj7.B = (pt6) obj3;
                obj7.R = (b25) obj2;
                obj7.A = true;
                pq3Var.c = obj7;
                return new z3(pq3Var, 11);
            case 8:
                ah5 ah5Var2 = (ah5) obj5;
                m84 m84Var = (m84) obj4;
                k86 k86Var = (k86) obj3;
                d5 d5Var = (d5) obj2;
                so soVar2 = (so) obj;
                float floatValue = ((Number) soVar2.e.getValue()).floatValue() - ah5Var2.A;
                if (!nj2.f(floatValue)) {
                    if (!nj2.f(floatValue - m84Var.e(k86Var, floatValue))) {
                        soVar2.a();
                        return jg7Var;
                    }
                    ah5Var2.A += floatValue;
                }
                if (((Boolean) d5Var.g(Float.valueOf(ah5Var2.A))).booleanValue()) {
                    soVar2.a();
                }
                return jg7Var;
            case 9:
                sb4 sb4Var = (sb4) obj;
                sb4Var.getClass();
                ((zg5) obj2).A = true;
                ((zb4) obj5).a((ic4) obj4, (Bundle) obj3, sb4Var, yt1.A);
                return jg7Var;
            case 10:
                List list5 = (List) obj5;
                er3 er3Var3 = (er3) obj;
                er3Var3.getClass();
                er3Var3.h0(list5.size(), new r5(19, new ep3(9, (byte) 0), list5), new j5(16, list5), new zv0(2039820996, true, new t5(4, (qn2) obj3, (RewindWindow) obj4, (nh2) obj2, list5)));
                return jg7Var;
            case 11:
                eo2 eo2Var = (eo2) obj5;
                qa4 qa4Var = (qa4) obj3;
                qa4 qa4Var2 = (qa4) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((qa4) obj4).setValue(bool);
                eo2Var.o("translator_local_voice_actor_studio", bool);
                if (booleanValue) {
                    Boolean bool2 = Boolean.TRUE;
                    qa4Var.setValue(bool2);
                    eo2Var.o("translator_tts_enabled", bool2);
                    qa4Var2.setValue("local_multi");
                    eo2Var.o("translator_tts_voice_engine", "local_multi");
                    eo2Var.o("translator_tts_neural_enabled", Boolean.FALSE);
                    eo2Var.o("translator_tts_multi_voice", bool2);
                }
                return jg7Var;
            default:
                List list6 = (List) obj5;
                er3 er3Var4 = (er3) obj;
                er3Var4.getClass();
                er3Var4.h0(list6.size(), null, up3.L, new zv0(1074997387, true, new jb7(list6, (eo2) obj4, (qa4) obj3, (qa4) obj2, 0)));
                return jg7Var;
        }
    }

    public /* synthetic */ cn(int i, qn2 qn2Var, Object obj, Object obj2, List list) {
        this.A = i;
        this.L = list;
        this.B = qn2Var;
        this.R = obj;
        this.X = obj2;
    }

    public /* synthetic */ cn(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.L = obj;
        this.R = obj2;
        this.B = obj3;
        this.X = obj4;
    }

    public /* synthetic */ cn(ArrayList arrayList, bh5 bh5Var, List list, int i, wo3 wo3Var) {
        this.A = 6;
        this.L = arrayList;
        this.R = bh5Var;
        this.B = list;
        this.X = wo3Var;
    }

    public /* synthetic */ cn(List list, RewindWindow rewindWindow, nh2 nh2Var, qn2 qn2Var) {
        this.A = 10;
        this.L = list;
        this.R = rewindWindow;
        this.X = nh2Var;
        this.B = qn2Var;
    }
}
