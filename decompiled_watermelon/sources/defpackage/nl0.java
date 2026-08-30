package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.domain.model.DSiWareTitle;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nl0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nl0 implements mi2 {
    public final /* synthetic */ int A;

    public /* synthetic */ nl0(int i) {
        this.A = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        oq6 oq6Var;
        oq6 oq6Var2;
        oq6 oq6Var3;
        int i = this.A;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                mi2 mi2Var = (mi2) oq6.d.L;
                Object obj2 = list.get(0);
                obj2.getClass();
                pl0 pl0Var = new pl0(((Boolean) obj2).booleanValue());
                Object obj3 = list.get(1);
                if (obj3 == null || (oq6Var = (oq6) mi2Var.n(obj3)) == null) {
                    oq6Var = new oq6((String) null, 7, 0L);
                }
                pl0Var.b.setValue(oq6Var);
                Object obj4 = list.get(2);
                if (obj4 == null || (oq6Var2 = (oq6) mi2Var.n(obj4)) == null) {
                    oq6Var2 = new oq6((String) null, 7, 0L);
                }
                pl0Var.c.setValue(oq6Var2);
                Object obj5 = list.get(3);
                if (obj5 == null || (oq6Var3 = (oq6) mi2Var.n(obj5)) == null) {
                    oq6Var3 = new oq6((String) null, 7, 0L);
                }
                pl0Var.d.setValue(oq6Var3);
                return pl0Var;
            case 1:
                ((mn) obj).getClass();
                return t02.h(new nl0(6));
            case 2:
                ((mn) obj).getClass();
                return t02.j(1, new nl0(7));
            case 3:
                ((mn) obj).getClass();
                return t02.h(new nl0(5));
            case 4:
                ((mn) obj).getClass();
                return t02.j(1, new nl0(6));
            case 5:
                return Integer.valueOf(-((Integer) obj).intValue());
            case ig7.b /* 6 */:
                Integer num = (Integer) obj;
                num.intValue();
                return num;
            case 7:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 8:
                oc2 oc2Var = (oc2) obj;
                oc2Var.getClass();
                oc2Var.b();
                return o27Var;
            case 9:
                oc2 oc2Var2 = (oc2) obj;
                oc2Var2.getClass();
                oc2Var2.b();
                return o27Var;
            case 10:
                oc2 oc2Var3 = (oc2) obj;
                oc2Var3.getClass();
                oc2Var3.b();
                return o27Var;
            case 11:
                oc2 oc2Var4 = (oc2) obj;
                oc2Var4.getClass();
                oc2Var4.b();
                return o27Var;
            case mj2.L /* 12 */:
                oc2 oc2Var5 = (oc2) obj;
                oc2Var5.getClass();
                oc2Var5.b();
                return o27Var;
            case 13:
                oc2 oc2Var6 = (oc2) obj;
                oc2Var6.getClass();
                oc2Var6.b();
                return o27Var;
            case 14:
                oc2 oc2Var7 = (oc2) obj;
                oc2Var7.getClass();
                oc2Var7.b();
                return o27Var;
            case ig7.e /* 15 */:
                oc2 oc2Var8 = (oc2) obj;
                oc2Var8.getClass();
                oc2Var8.b();
                return o27Var;
            case 16:
                c31 c31Var = (c31) obj;
                if (!(c31Var instanceof g31)) {
                    return null;
                }
                return (g31) c31Var;
            case 17:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                dSiWareTitle.getClass();
                return Long.valueOf(dSiWareTitle.getTitleId());
            case 18:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                Object value = entry.getValue();
                StringBuilder t = b31.t((String) entry.getKey(), " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                t.append(value);
                return t.toString();
            case 19:
                if (obj instanceof Object[]) {
                    return nu.y0((Object[]) obj, "[", "]", new nl0(19), 25);
                }
                return String.valueOf(obj);
            case 20:
                List list2 = (List) obj;
                Object obj6 = list2.get(0);
                obj6.getClass();
                int intValue = ((Integer) obj6).intValue();
                Object obj7 = list2.get(1);
                obj7.getClass();
                return new ya1(intValue, ((Float) obj7).floatValue(), new c5(1, list2));
            case 21:
                mb4 mb4Var = (mb4) obj;
                return o27Var;
            case 22:
                xp4 xp4Var = (xp4) obj;
                return Boolean.TRUE;
            case 23:
                zk1 zk1Var = (zk1) obj;
                xy6 xy6Var = xk1.a;
                return Boolean.TRUE;
            case 24:
                Map.Entry entry2 = (Map.Entry) obj;
                int i2 = EmulatorActivity.P1;
                entry2.getClass();
                Object key = entry2.getKey();
                Object value2 = entry2.getValue();
                return key + "=" + value2;
            case 25:
                w15 w15Var = (w15) obj;
                w15Var.getClass();
                return new mu(1, w15Var.f);
            case 26:
                u15 u15Var = (u15) obj;
                u15Var.getClass();
                dy4 dy4Var = u15Var.a;
                return new va4(dy4Var.a, dy4Var.l);
            case 27:
                va4 va4Var = (va4) obj;
                va4Var.getClass();
                return Long.valueOf(va4Var.a);
            case 28:
                w15 w15Var2 = (w15) obj;
                w15Var2.getClass();
                return new mu(1, w15Var2.g);
            default:
                j15 j15Var = (j15) obj;
                j15Var.getClass();
                return new bb4(j15Var.a, j15Var.d, j15Var.e);
        }
    }
}
