package g2;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class l5 implements mc.l {
    public final /* synthetic */ int A;

    @Override // mc.l
    public final Object k(Object obj) {
        Long valueOf;
        Integer num;
        int i2 = this.A;
        boolean z10 = false;
        yb.y yVar = yb.y.f14813a;
        switch (i2) {
            case 0:
                return Float.valueOf(((Float) obj).floatValue() * 0.7f);
            case DSiCameraSource.FrontCamera /* 1 */:
                l4.o0 o0Var = (l4.o0) obj;
                n2.b0 b0Var = e7.f5133a;
                return yVar;
            case 2:
                v2.g gVar = (v2.g) obj;
                n2.t2 t2Var = b4.r0.f1937b;
                gVar.getClass();
                if (!((Context) n2.s.x(gVar, t2Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    h1.d.f5884a.getClass();
                    return h1.c.f5867c;
                }
                return h1.f.f5892b;
            case 3:
                v3.y yVar2 = (v3.y) obj;
                return Boolean.TRUE;
            case 4:
                v3.y yVar3 = (v3.y) obj;
                if (yVar3 != null && yVar3.f13720a == 2) {
                    z10 = true;
                }
                return Boolean.valueOf(!z10);
            case l1.c.f8511g /* 5 */:
                ((Float) obj).getClass();
                return yVar;
            case l1.c.f8509e /* 6 */:
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                try {
                    aVar.T("DELETE FROM cheat_folder WHERE id NOT IN (SELECT DISTINCT cheat_folder_id FROM cheat)").N();
                    return yVar;
                } finally {
                }
            case 7:
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                try {
                    aVar2.T("DELETE FROM game WHERE id NOT IN (SELECT DISTINCT game_id FROM cheat_folder)").N();
                    return yVar;
                } finally {
                }
            case 8:
                t7.a aVar3 = (t7.a) obj;
                aVar3.getClass();
                t7.c T = aVar3.T("SELECT * FROM game");
                try {
                    int t5 = p7.m.t(T, "id");
                    int t10 = p7.m.t(T, "name");
                    int t11 = p7.m.t(T, "game_code");
                    int t12 = p7.m.t(T, "game_checksum");
                    ArrayList arrayList = new ArrayList();
                    while (T.N()) {
                        if (T.isNull(t5)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(T.getLong(t5));
                        }
                        arrayList.add(new ie.f(valueOf, T.n(t10), T.n(t11), T.n(t12)));
                    }
                    return arrayList;
                } finally {
                }
            case l1.c.f8508d /* 9 */:
                t7.a aVar4 = (t7.a) obj;
                aVar4.getClass();
                try {
                    aVar4.T("DELETE FROM ra_user_achievement").N();
                    return yVar;
                } finally {
                }
            case l1.c.f8510f /* 10 */:
                t7.a aVar5 = (t7.a) obj;
                aVar5.getClass();
                try {
                    aVar5.T("UPDATE ra_game_set_metadata SET last_user_data_updated = NULL, last_hardcore_user_data_updated = NULL").N();
                    return yVar;
                } finally {
                }
            case 11:
                t7.a aVar6 = (t7.a) obj;
                aVar6.getClass();
                try {
                    aVar6.T("DELETE FROM ra_pending_achievement_award").N();
                    return yVar;
                } finally {
                }
            case 12:
                t7.a aVar7 = (t7.a) obj;
                aVar7.getClass();
                try {
                    aVar7.T("DELETE FROM ra_game_hash_library").N();
                    return yVar;
                } finally {
                }
            case 13:
                int i10 = BackgroundsActivity.f9488y0;
                ((c1.v) obj).getClass();
                return c1.w0.d(null, 3);
            case 14:
                int i11 = BackgroundsActivity.f9488y0;
                ((c1.v) obj).getClass();
                return c1.c1.f2396b;
            case l1.c.f8512h /* 15 */:
                int i12 = BackgroundsActivity.f9488y0;
                ((c1.v) obj).getClass();
                return c1.w0.e(null, 3);
            case 16:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 17:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 18:
                j8.l lVar = (j8.l) obj;
                lVar.getClass();
                return lVar;
            case 19:
                nc.e eVar = (nc.e) obj;
                eVar.getClass();
                jd.a a02 = aj.g.a0(eVar);
                if (a02 == null) {
                    if (!nd.a1.g(eVar)) {
                        return null;
                    }
                    return new jd.d(eVar);
                }
                return a02;
            case 20:
                nc.e eVar2 = (nc.e) obj;
                eVar2.getClass();
                jd.a a03 = aj.g.a0(eVar2);
                if (a03 == null) {
                    if (nd.a1.g(eVar2)) {
                        a03 = new jd.d(eVar2);
                    } else {
                        a03 = null;
                    }
                }
                if (a03 == null) {
                    return null;
                }
                return a.a.C(a03);
            case 21:
                ((k7.b) obj).getClass();
                throw new yb.i(0);
            case 22:
                t7.c cVar = (t7.c) obj;
                cVar.getClass();
                return Boolean.valueOf(cVar.N());
            case 23:
                t7.c cVar2 = (t7.c) obj;
                cVar2.getClass();
                ac.h hVar = new ac.h();
                while (cVar2.N()) {
                    hVar.add(Integer.valueOf((int) cVar2.getLong(0)));
                }
                return p7.j.d(hVar);
            case 24:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                if (obj2 instanceof Integer) {
                    num = (Integer) obj2;
                } else {
                    num = null;
                }
                if (num != null && num.intValue() == 0) {
                    return kg.b.f8292b;
                }
                if (num != null && num.intValue() == 1) {
                    return kg.c.f8293b;
                }
                if (num == null || num.intValue() != 2) {
                    return null;
                }
                Object obj3 = list.get(1);
                obj3.getClass();
                return new kg.a(((fg.b) obj3).a());
            case 25:
                String str = (String) obj;
                if (str != null && vc.o.V(str, "User already has", false)) {
                    return yVar;
                }
                if (str == null) {
                    str = "Unknown reason";
                }
                throw new Exception(str);
            case 26:
                return ((l1.c2) obj).f8530l;
            case 27:
                return ((l1.c2) obj).f8524f;
            case 28:
                return ((l1.c2) obj).f8520b;
            default:
                return ((l1.c2) obj).f8525g;
        }
    }

    public /* synthetic */ l5(int i2) {
        this.A = i2;
    }
}
