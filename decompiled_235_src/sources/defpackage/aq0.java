package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aq0  reason: default package */
/* loaded from: classes.dex */
public final class aq0 extends qo7 {
    public final hp0 b;
    public final v46 c;
    public final lx5 d;
    public final tp6 e;
    public final ArrayList f;
    public final yp0 g;
    public final yp0 h;
    public final ex6 i;
    public final ex6 j;
    public final ex6 k;
    public final ex6 l;
    public final vl0 m;
    public final v80 n;
    public final vl0 o;
    public final v80 p;
    public final vl0 q;
    public final v80 r;
    public final vl0 s;
    public final tp6 t;
    public final de5 u;
    public final v80 v;
    public final vl0 w;

    public aq0(hp0 hp0Var, v46 v46Var) {
        lx5 lx5Var;
        hp0Var.getClass();
        v46Var.getClass();
        this.b = hp0Var;
        this.c = v46Var;
        mx5 mx5Var = (mx5) v46Var.a("key_rom_info");
        if (mx5Var != null) {
            lx5Var = new lx5(mx5Var.A, mx5Var.B, mx5Var.L, mx5Var.R, mx5Var.X);
        } else {
            lx5Var = null;
        }
        this.d = lx5Var;
        Iterable<ho0> iterable = (List) v46Var.a("modified_cheats");
        iterable = iterable == null ? yt1.A : iterable;
        ArrayList arrayList = new ArrayList(ht0.v0(iterable, 10));
        for (ho0 ho0Var : iterable) {
            arrayList.add(ho0Var.a());
        }
        this.e = up6.a(arrayList);
        this.f = new ArrayList();
        this.g = new yp0(this.c.b("selected_game"), 0);
        this.h = new yp0(this.c.b("selected_folder"), 1);
        this.i = new ex6(new mp0(this, 1));
        this.j = new ex6(new mp0(this, 2));
        this.k = new ex6(new mp0(this, 3));
        this.l = new ex6(new mp0(this, 4));
        this.m = f04.N(nb3.c(-1, null, null, 6));
        v80 c = nb3.c(-1, null, null, 6);
        this.n = c;
        this.o = f04.N(c);
        v80 c2 = nb3.c(-1, null, null, 6);
        this.p = c2;
        this.q = f04.N(c2);
        v80 c3 = nb3.c(-1, null, null, 6);
        this.r = c3;
        this.s = f04.N(c3);
        tp6 a = up6.a(Boolean.FALSE);
        this.t = a;
        this.u = new de5(a);
        v80 c4 = nb3.c(-1, null, null, 6);
        this.v = c4;
        this.w = f04.N(c4);
    }

    public final void e(Cheat cheat) {
        tp6 tp6Var;
        Object value;
        ArrayList arrayList;
        cheat.getClass();
        if (!((Boolean) this.u.A.getValue()).booleanValue()) {
            do {
                tp6Var = this.e;
                value = tp6Var.getValue();
                List list = (List) value;
                Iterator it = list.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (nb3.k(((Cheat) it.next()).getId(), cheat.getId())) {
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
                ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Cheat cheat2 = (Cheat) obj;
                    cheat2.getClass();
                    arrayList2.add(new ho0(cheat2.getId(), cheat2.getCheatDatabaseId(), cheat2.getName(), cheat2.getDescription(), cheat2.getCode(), cheat2.getEnabled()));
                }
                this.c.c(arrayList2, "modified_cheats");
            } while (!tp6Var.j(value, arrayList));
        }
    }
}
