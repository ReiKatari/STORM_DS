package defpackage;

import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.p;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class py5 implements eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ a B;
    public final /* synthetic */ boolean L;

    public /* synthetic */ py5(a aVar, boolean z, int i) {
        this.A = i;
        this.B = aVar;
        this.L = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0167, code lost:
        if (r7 != false) goto L164;
     */
    @Override // defpackage.eo2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        Object obj3;
        mr5 mr5Var;
        qn2 qn2Var;
        qn2 qn2Var2;
        qn2 qn2Var3;
        qn2 qn2Var4;
        qa4 qa4Var;
        qa4 qa4Var2;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                px0 px0Var = (px0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                xq2 xq2Var = (xq2) px0Var;
                if (xq2Var.S(intValue & 1, z)) {
                    bl2.e(false, n16.I(4967943, new py5(this.B, this.L, 1), xq2Var), xq2Var, 48, 1);
                } else {
                    xq2Var.V();
                }
                return jg7Var;
            default:
                px0 px0Var2 = (px0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                xq2 xq2Var2 = (xq2) px0Var2;
                if (xq2Var2.S(intValue2 & 1, z2)) {
                    final a aVar = this.B;
                    qa4 C = np2.C(aVar.j().I, xq2Var2);
                    qa4 B = np2.B(aVar.j().C, m06.NOT_SCANNING, null, xq2Var2, 48, 2);
                    qa4 C2 = np2.C(aVar.j().t, xq2Var2);
                    qa4 C3 = np2.C(aVar.j().v, xq2Var2);
                    qa4 C4 = np2.C(aVar.j().w, xq2Var2);
                    qa4 C5 = np2.C(aVar.j().m, xq2Var2);
                    Object P = xq2Var2.P();
                    Object obj4 = ox0.a;
                    if (P == obj4) {
                        P = np2.Y(null);
                        xq2Var2.l0(P);
                    }
                    qa4 qa4Var3 = (qa4) P;
                    Object P2 = xq2Var2.P();
                    if (P2 == obj4) {
                        P2 = np2.Y("");
                        xq2Var2.l0(P2);
                    }
                    qa4 qa4Var4 = (qa4) P2;
                    Object P3 = xq2Var2.P();
                    if (P3 == obj4) {
                        P3 = np2.Y(null);
                        xq2Var2.l0(P3);
                    }
                    qa4 qa4Var5 = (qa4) P3;
                    Object P4 = xq2Var2.P();
                    if (P4 == obj4) {
                        P4 = np2.Y(xc1.CONFIRM);
                        xq2Var2.l0(P4);
                    }
                    qa4 qa4Var6 = (qa4) P4;
                    Object P5 = xq2Var2.P();
                    if (P5 == obj4) {
                        P5 = np2.Y(Float.valueOf((float) RecyclerView.B1));
                        xq2Var2.l0(P5);
                    }
                    qa4 qa4Var7 = (qa4) P5;
                    Object P6 = xq2Var2.P();
                    if (P6 == obj4) {
                        P6 = mb3.w(xq2Var2);
                        xq2Var2.l0(P6);
                    }
                    Object obj5 = (w61) P6;
                    d00 d00Var = aVar.d0;
                    if (d00Var != null) {
                        if (((ss5) C.getValue()).c && !((ss5) C.getValue()).d) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        d00Var.f(z3);
                        boolean f = xq2Var2.f((String) qa4Var3.getValue()) | xq2Var2.f(((ss5) C.getValue()).a) | xq2Var2.f(((ss5) C.getValue()).j);
                        Object P7 = xq2Var2.P();
                        if (f || P7 == obj4) {
                            String str = (String) qa4Var3.getValue();
                            if (str == null) {
                                P7 = null;
                            } else {
                                Iterator it = ((ss5) C.getValue()).a.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        nr5 nr5Var = (nr5) it.next();
                                        Iterator it2 = it;
                                        if (nr5Var instanceof mr5) {
                                            mr5Var = (mr5) nr5Var;
                                        } else {
                                            mr5Var = null;
                                        }
                                        if (mr5Var != null) {
                                            pq5 pq5Var = mr5Var.a;
                                            boolean k = nb3.k(pq5Var.d.toString(), str);
                                            P7 = pq5Var;
                                            break;
                                        }
                                        P7 = null;
                                        if (P7 == null) {
                                            it = it2;
                                        }
                                    } else {
                                        P7 = null;
                                    }
                                }
                                if (P7 == null) {
                                    Iterator it3 = ((ss5) C.getValue()).j.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            obj3 = it3.next();
                                            Iterator it4 = it3;
                                            if (!nb3.k(((pq5) obj3).d.toString(), str)) {
                                                it3 = it4;
                                            }
                                        } else {
                                            obj3 = null;
                                        }
                                    }
                                    P7 = (pq5) obj3;
                                }
                            }
                            xq2Var2.l0(P7);
                        }
                        pq5 pq5Var2 = (pq5) P7;
                        boolean h = xq2Var2.h(aVar);
                        Object P8 = xq2Var2.P();
                        if (h || P8 == obj4) {
                            P8 = new t00(aVar, qa4Var5, qa4Var6, 22);
                            xq2Var2.l0(P8);
                        }
                        qn2 qn2Var5 = (qn2) P8;
                        ss5 ss5Var = (ss5) C.getValue();
                        Map map = (Map) C4.getValue();
                        Map map2 = (Map) C5.getValue();
                        String str2 = (String) qa4Var4.getValue();
                        m06 m06Var = (m06) B.getValue();
                        Set set = (Set) C2.getValue();
                        boolean booleanValue = ((Boolean) C3.getValue()).booleanValue();
                        boolean h2 = xq2Var2.h(aVar);
                        Object P9 = xq2Var2.P();
                        if (h2 || P9 == obj4) {
                            P9 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P9);
                        }
                        qn2 qn2Var6 = (qn2) P9;
                        boolean h3 = xq2Var2.h(aVar) | xq2Var2.f(qn2Var5);
                        Object P10 = xq2Var2.P();
                        if (!h3 && P10 != obj4) {
                            qn2Var = qn2Var6;
                        } else {
                            qn2Var = qn2Var6;
                            P10 = new qk4(14, aVar, qn2Var5);
                            xq2Var2.l0(P10);
                        }
                        qn2 qn2Var7 = (qn2) P10;
                        Object P11 = xq2Var2.P();
                        if (P11 == obj4) {
                            qn2Var2 = qn2Var7;
                            P11 = new j4(qa4Var3, 21);
                            xq2Var2.l0(P11);
                        } else {
                            qn2Var2 = qn2Var7;
                        }
                        qn2 qn2Var8 = (qn2) P11;
                        Object P12 = xq2Var2.P();
                        if (P12 == obj4) {
                            qn2Var3 = qn2Var8;
                            P12 = new j4(qa4Var3, 22);
                            xq2Var2.l0(P12);
                        } else {
                            qn2Var3 = qn2Var8;
                        }
                        qn2 qn2Var9 = (qn2) P12;
                        boolean h4 = xq2Var2.h(aVar);
                        Object P13 = xq2Var2.P();
                        if (!h4 && P13 != obj4) {
                            qn2Var4 = qn2Var9;
                        } else {
                            qn2Var4 = qn2Var9;
                            P13 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P13);
                        }
                        qn2 qn2Var10 = (qn2) P13;
                        boolean h5 = xq2Var2.h(aVar);
                        Object P14 = xq2Var2.P();
                        if (h5 || P14 == obj4) {
                            P14 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P14);
                        }
                        qn2 qn2Var11 = (qn2) P14;
                        boolean h6 = xq2Var2.h(aVar);
                        Object P15 = xq2Var2.P();
                        if (h6 || P15 == obj4) {
                            P15 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P15);
                        }
                        on2 on2Var = (on2) P15;
                        boolean h7 = xq2Var2.h(aVar);
                        Object P16 = xq2Var2.P();
                        if (h7 || P16 == obj4) {
                            P16 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P16);
                        }
                        on2 on2Var2 = (on2) P16;
                        boolean h8 = xq2Var2.h(aVar);
                        Object P17 = xq2Var2.P();
                        if (h8 || P17 == obj4) {
                            P17 = new qk4(15, aVar, qa4Var4);
                            xq2Var2.l0(P17);
                        }
                        qn2 qn2Var12 = (qn2) P17;
                        boolean h9 = xq2Var2.h(aVar);
                        Object P18 = xq2Var2.P();
                        if (h9 || P18 == obj4) {
                            P18 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P18);
                        }
                        on2 on2Var3 = (on2) P18;
                        boolean h10 = xq2Var2.h(aVar);
                        Object P19 = xq2Var2.P();
                        if (h10 || P19 == obj4) {
                            P19 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P19);
                        }
                        on2 on2Var4 = (on2) P19;
                        boolean h11 = xq2Var2.h(aVar);
                        Object P20 = xq2Var2.P();
                        if (h11 || P20 == obj4) {
                            P20 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P20);
                        }
                        on2 on2Var5 = (on2) P20;
                        boolean h12 = xq2Var2.h(aVar);
                        Object P21 = xq2Var2.P();
                        if (h12 || P21 == obj4) {
                            P21 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P21);
                        }
                        on2 on2Var6 = (on2) P21;
                        boolean h13 = xq2Var2.h(aVar);
                        Object P22 = xq2Var2.P();
                        if (h13 || P22 == obj4) {
                            P22 = new on2() { // from class: ry5
                                @Override // defpackage.on2
                                public final Object c() {
                                    RomListActivity romListActivity;
                                    RomListActivity romListActivity2;
                                    int i2 = r2;
                                    RomListActivity romListActivity3 = null;
                                    jg7 jg7Var2 = jg7.a;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            tp6 tp6Var = aVar2.j().G;
                                            List list = (List) tp6Var.getValue();
                                            if (list.size() > 1) {
                                                tp6Var.m(null, gt0.E0(list));
                                            }
                                            return jg7Var2;
                                        case 1:
                                            tz5 j = aVar2.j();
                                            j.p();
                                            xb2 xb2Var = (xb2) j.b;
                                            hv.L(xb2Var.h, null, null, new ib2(xb2Var, null, 3), 3);
                                            return jg7Var2;
                                        case 2:
                                            aVar2.j().r();
                                            return jg7Var2;
                                        case 3:
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null) {
                                                ConsoleType consoleType = ConsoleType.DS;
                                                consoleType.getClass();
                                                s9 s9Var = romListActivity.E0;
                                                if (s9Var != null) {
                                                    vw1 A = s9Var.A();
                                                    A.f = new tw1(consoleType);
                                                    hv.L(to7.a(A), null, null, new xd1(A, consoleType, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 4:
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            } else {
                                                romListActivity2 = null;
                                            }
                                            if (romListActivity2 != null) {
                                                ConsoleType consoleType2 = ConsoleType.DSi;
                                                consoleType2.getClass();
                                                s9 s9Var2 = romListActivity2.E0;
                                                if (s9Var2 != null) {
                                                    vw1 A2 = s9Var2.A();
                                                    A2.f = new tw1(consoleType2);
                                                    hv.L(to7.a(A2), null, null, new xd1(A2, consoleType2, null, 5), 3);
                                                } else {
                                                    nb3.a0("emulatorLauncherValidatorDelegate");
                                                    throw null;
                                                }
                                            }
                                            return jg7Var2;
                                        case 5:
                                            p activity3 = aVar2.getActivity();
                                            if (activity3 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity3;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, DSiWareManagerActivity.class));
                                            }
                                            return jg7Var2;
                                        default:
                                            p activity4 = aVar2.getActivity();
                                            if (activity4 instanceof RomListActivity) {
                                                romListActivity3 = (RomListActivity) activity4;
                                            }
                                            if (romListActivity3 != null) {
                                                romListActivity3.startActivity(new Intent(romListActivity3, SettingsActivity.class));
                                            }
                                            return jg7Var2;
                                    }
                                }
                            };
                            xq2Var2.l0(P22);
                        }
                        on2 on2Var7 = (on2) P22;
                        boolean h14 = xq2Var2.h(aVar);
                        Object P23 = xq2Var2.P();
                        if (h14 || P23 == obj4) {
                            P23 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var8 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var8;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P23);
                        }
                        qn2 qn2Var13 = (qn2) P23;
                        boolean h15 = xq2Var2.h(aVar);
                        Object P24 = xq2Var2.P();
                        if (h15 || P24 == obj4) {
                            P24 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var8 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var8;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P24);
                        }
                        qn2 qn2Var14 = (qn2) P24;
                        boolean h16 = xq2Var2.h(aVar);
                        Object P25 = xq2Var2.P();
                        if (h16 || P25 == obj4) {
                            P25 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var8 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var8;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P25);
                        }
                        nw7.D(ss5Var, map, map2, str2, this.L, m06Var, set, booleanValue, qn2Var, qn2Var2, qn2Var3, qn2Var4, qn2Var10, qn2Var11, on2Var, on2Var2, qn2Var12, on2Var3, on2Var4, on2Var5, on2Var6, on2Var7, qn2Var13, qn2Var14, (qn2) P25, xq2Var2, 0);
                        Object P26 = xq2Var2.P();
                        if (P26 == obj4) {
                            P26 = new oe4(qa4Var3, 15);
                            xq2Var2.l0(P26);
                        }
                        on2 on2Var8 = (on2) P26;
                        boolean h17 = xq2Var2.h(aVar);
                        Object P27 = xq2Var2.P();
                        if (h17 || P27 == obj4) {
                            P27 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var82 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var82;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P27);
                        }
                        qn2 qn2Var15 = (qn2) P27;
                        boolean h18 = xq2Var2.h(aVar);
                        Object P28 = xq2Var2.P();
                        if (h18 || P28 == obj4) {
                            P28 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var82 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var82;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P28);
                        }
                        qn2 qn2Var16 = (qn2) P28;
                        boolean h19 = xq2Var2.h(aVar);
                        Object P29 = xq2Var2.P();
                        if (h19 || P29 == obj4) {
                            P29 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var82 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var82;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P29);
                        }
                        qn2 qn2Var17 = (qn2) P29;
                        boolean h20 = xq2Var2.h(aVar);
                        Object P30 = xq2Var2.P();
                        if (h20 || P30 == obj4) {
                            P30 = new qn2() { // from class: qy5
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r4v8, types: [wz5, android.os.Parcelable, java.lang.Object] */
                                @Override // defpackage.qn2
                                public final Object g(Object obj6) {
                                    RomListActivity romListActivity;
                                    int i2 = r2;
                                    int i3 = 0;
                                    RomListActivity romListActivity2 = null;
                                    a aVar2 = aVar;
                                    switch (i2) {
                                        case 0:
                                            pq5 pq5Var3 = (pq5) obj6;
                                            p activity = aVar2.getActivity();
                                            if (activity instanceof RomListActivity) {
                                                romListActivity = (RomListActivity) activity;
                                            } else {
                                                romListActivity = null;
                                            }
                                            if (romListActivity != null && pq5Var3 != null) {
                                                tp6 tp6Var = romListActivity.I0;
                                                tp6Var.getClass();
                                                tp6Var.m(null, pq5Var3);
                                            }
                                            return jg7.a;
                                        case 1:
                                            on2 on2Var82 = (on2) obj6;
                                            p activity2 = aVar2.getActivity();
                                            if (activity2 instanceof RomListActivity) {
                                                romListActivity2 = (RomListActivity) activity2;
                                            }
                                            if (romListActivity2 != null) {
                                                romListActivity2.G0 = on2Var82;
                                            }
                                            return jg7.a;
                                        case 2:
                                            pq5 pq5Var4 = (pq5) obj6;
                                            pq5Var4.getClass();
                                            p06 p06Var = aVar2.j().b;
                                            boolean z4 = !pq5Var4.k;
                                            xb2 xb2Var = (xb2) p06Var;
                                            xb2Var.getClass();
                                            CopyOnWriteArrayList copyOnWriteArrayList = xb2Var.m;
                                            Iterator it5 = copyOnWriteArrayList.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!((pq5) it5.next()).b(pq5Var4)) {
                                                        i3++;
                                                    }
                                                } else {
                                                    i3 = -1;
                                                }
                                            }
                                            if (i3 >= 0) {
                                                pq5 pq5Var5 = (pq5) copyOnWriteArrayList.get(i3);
                                                if (pq5Var5.k != z4) {
                                                    copyOnWriteArrayList.set(i3, pq5.a(pq5Var5, null, null, null, null, false, null, 0L, z4, null, 7167));
                                                    xb2Var.t(true);
                                                }
                                            }
                                            return jg7.a;
                                        case 3:
                                            lr5 lr5Var = (lr5) obj6;
                                            lr5Var.getClass();
                                            tz5 j = aVar2.j();
                                            String str3 = lr5Var.a;
                                            str3.getClass();
                                            tp6 tp6Var2 = j.G;
                                            ArrayList m1 = gt0.m1((Collection) tp6Var2.getValue());
                                            hz5 hz5Var = (hz5) gt0.R0(m1);
                                            if (!(hz5Var instanceof fz5) || !nb3.k(((fz5) hz5Var).a, str3)) {
                                                m1.add(new fz5(str3));
                                                tp6Var2.m(null, m1);
                                            }
                                            return jg7.a;
                                        case 4:
                                            pq5 pq5Var6 = (pq5) obj6;
                                            pq5Var6.getClass();
                                            Intent intent = new Intent(aVar2.requireContext(), RomDetailsActivity.class);
                                            ?? obj7 = new Object();
                                            obj7.A = pq5Var6;
                                            intent.putExtra("rom", (Parcelable) obj7);
                                            aVar2.startActivity(intent);
                                            return jg7.a;
                                        case 5:
                                            pq5 pq5Var7 = (pq5) obj6;
                                            pq5Var7.getClass();
                                            hu3 viewLifecycleOwner = aVar2.getViewLifecycleOwner();
                                            viewLifecycleOwner.getClass();
                                            hv.L(bl2.C(viewLifecycleOwner), null, null, new vy5(aVar2, pq5Var7, (r41) null, 0), 3);
                                            return jg7.a;
                                        case 6:
                                            pq5 pq5Var8 = (pq5) obj6;
                                            pq5Var8.getClass();
                                            aVar2.f0 = pq5Var8;
                                            aVar2.g0.a(new String[]{"*/*"});
                                            return jg7.a;
                                        case 7:
                                            qw5 qw5Var = (qw5) obj6;
                                            qw5Var.getClass();
                                            tp6 tp6Var3 = aVar2.j().r;
                                            tp6Var3.getClass();
                                            tp6Var3.m(null, qw5Var);
                                            return jg7.a;
                                        case 8:
                                            gn6 gn6Var = (gn6) obj6;
                                            gn6Var.getClass();
                                            aVar2.j().q(gn6Var);
                                            return jg7.a;
                                        default:
                                            pq5 pq5Var9 = (pq5) obj6;
                                            pq5Var9.getClass();
                                            tz5 j2 = aVar2.j();
                                            String uri = pq5Var9.d.toString();
                                            uri.getClass();
                                            if (!((Map) j2.l.getValue()).containsKey(uri)) {
                                                synchronized (j2.n) {
                                                    if (j2.n.add(uri)) {
                                                        as0 a = to7.a(j2);
                                                        xe1 xe1Var = xk1.a;
                                                        hv.L(a, de1.L, null, new qz5(j2, pq5Var9, uri, null), 2);
                                                    }
                                                }
                                            }
                                            return jg7.a;
                                    }
                                }
                            };
                            xq2Var2.l0(P30);
                        }
                        qn2 qn2Var18 = (qn2) P30;
                        boolean f2 = xq2Var2.f(qn2Var5);
                        Object P31 = xq2Var2.P();
                        if (f2 || P31 == obj4) {
                            P31 = new y00(24, qn2Var5);
                            xq2Var2.l0(P31);
                        }
                        qn2 qn2Var19 = (qn2) P31;
                        Object P32 = xq2Var2.P();
                        if (P32 == obj4) {
                            P32 = new w4(qa4Var5, qa4Var6, 1);
                            xq2Var2.l0(P32);
                        }
                        zu5.b(pq5Var2, on2Var8, qn2Var15, qn2Var16, qn2Var17, qn2Var18, qn2Var19, (qn2) P32, xq2Var2, 12582960);
                        Object obj6 = (pq5) qa4Var5.getValue();
                        if (obj6 == null) {
                            xq2Var2.b0(1976964136);
                            xq2Var2.p(false);
                            return jg7Var;
                        }
                        xq2Var2.b0(1976964137);
                        Object P33 = xq2Var2.P();
                        if (P33 == obj4) {
                            P33 = new oe4(qa4Var5, 16);
                            xq2Var2.l0(P33);
                        }
                        on2 on2Var9 = (on2) P33;
                        boolean h21 = xq2Var2.h(obj5) | xq2Var2.h(aVar) | xq2Var2.h(obj6);
                        Object P34 = xq2Var2.P();
                        if (!h21 && P34 != obj4) {
                            qa4Var = qa4Var7;
                            qa4Var2 = qa4Var6;
                        } else {
                            qa4Var = qa4Var7;
                            qa4Var2 = qa4Var6;
                            Object jn3Var = new jn3(obj5, qa4Var2, qa4Var, aVar, obj6, 4);
                            xq2Var2.l0(jn3Var);
                            P34 = jn3Var;
                        }
                        nw7.n(on2Var9, (on2) P34, (xc1) qa4Var2.getValue(), ((Number) qa4Var.getValue()).floatValue(), xq2Var2, 54);
                        xq2Var2.p(false);
                        return jg7Var;
                    }
                    nb3.a0("backPressedCallback");
                    throw null;
                }
                xq2Var2.V();
                return jg7Var;
        }
    }
}
