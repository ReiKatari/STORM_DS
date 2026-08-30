package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pn0  reason: default package */
/* loaded from: classes.dex */
public final class pn0 extends ra7 {
    public final xm0 b;
    public final pt5 c;
    public final wm5 d;
    public final ee6 e;
    public final ArrayList f;
    public final nn0 g;
    public final nn0 h;
    public final il6 i;
    public final il6 j;
    public final il6 k;
    public final il6 l;
    public final mj0 m;
    public final q60 n;
    public final mj0 o;
    public final q60 p;
    public final mj0 q;
    public final q60 r;
    public final mj0 s;
    public final ee6 t;
    public final q45 u;
    public final q60 v;
    public final mj0 w;

    public pn0(xm0 xm0Var, pt5 pt5Var) {
        wm5 wm5Var;
        xm0Var.getClass();
        pt5Var.getClass();
        this.b = xm0Var;
        this.c = pt5Var;
        xm5 xm5Var = (xm5) pt5Var.a("key_rom_info");
        if (xm5Var != null) {
            wm5Var = new wm5(xm5Var.B, xm5Var.A, xm5Var.L, xm5Var.R);
        } else {
            wm5Var = null;
        }
        this.d = wm5Var;
        Iterable<zl0> iterable = (List) pt5Var.a("modified_cheats");
        iterable = iterable == null ? pp1.A : iterable;
        ArrayList arrayList = new ArrayList(uq0.y0(iterable, 10));
        for (zl0 zl0Var : iterable) {
            arrayList.add(zl0Var.a());
        }
        this.e = fe6.a(arrayList);
        this.f = new ArrayList();
        this.g = new nn0(this.c.b("selected_game"), 0);
        this.h = new nn0(this.c.b("selected_folder"), 1);
        this.i = new il6(new bn0(this, 1));
        this.j = new il6(new bn0(this, 2));
        this.k = new il6(new bn0(this, 3));
        this.l = new il6(new bn0(this, 4));
        this.m = se.Q(n40.f(-1, null, null, 6));
        q60 f = n40.f(-1, null, null, 6);
        this.n = f;
        this.o = se.Q(f);
        q60 f2 = n40.f(-1, null, null, 6);
        this.p = f2;
        this.q = se.Q(f2);
        q60 f3 = n40.f(-1, null, null, 6);
        this.r = f3;
        this.s = se.Q(f3);
        ee6 a = fe6.a(Boolean.FALSE);
        this.t = a;
        this.u = new q45(a);
        q60 f4 = n40.f(-1, null, null, 6);
        this.v = f4;
        this.w = se.Q(f4);
    }

    public final void e(Cheat cheat) {
        ee6 ee6Var;
        Object value;
        ArrayList arrayList;
        cheat.getClass();
        if (!((Boolean) this.u.A.getValue()).booleanValue()) {
            do {
                ee6Var = this.e;
                value = ee6Var.getValue();
                List list = (List) value;
                Iterator it = list.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (b53.x(((Cheat) it.next()).getId(), cheat.getId())) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                Cheat copy$default = Cheat.copy$default(cheat, null, 0L, null, null, null, !cheat.getEnabled(), 31, null);
                arrayList = new ArrayList(list);
                if (i2 >= 0) {
                    arrayList.set(i2, copy$default);
                } else {
                    arrayList.add(copy$default);
                }
                ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Cheat cheat2 = (Cheat) obj;
                    cheat2.getClass();
                    arrayList2.add(new zl0(cheat2.getId(), cheat2.getCheatDatabaseId(), cheat2.getName(), cheat2.getDescription(), cheat2.getCode(), cheat2.getEnabled()));
                }
                this.c.c(arrayList2, "modified_cheats");
            } while (!ee6Var.j(value, arrayList));
        }
    }
}
