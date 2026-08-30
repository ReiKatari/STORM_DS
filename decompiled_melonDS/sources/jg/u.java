package jg;

import androidx.lifecycle.p0;
import androidx.lifecycle.y0;
import cd.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.domain.model.Cheat;
import oe.e0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final cf.a f7876b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f7877c;

    /* renamed from: d  reason: collision with root package name */
    public final e0 f7878d;

    /* renamed from: e  reason: collision with root package name */
    public final q1 f7879e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f7880f;

    /* renamed from: g  reason: collision with root package name */
    public final s f7881g;

    /* renamed from: h  reason: collision with root package name */
    public final s f7882h;

    /* renamed from: i  reason: collision with root package name */
    public final yb.n f7883i;

    /* renamed from: j  reason: collision with root package name */
    public final yb.n f7884j;

    /* renamed from: k  reason: collision with root package name */
    public final yb.n f7885k;

    /* renamed from: l  reason: collision with root package name */
    public final yb.n f7886l;
    public final cd.d m;

    /* renamed from: n  reason: collision with root package name */
    public final bd.h f7887n;

    /* renamed from: o  reason: collision with root package name */
    public final cd.d f7888o;

    /* renamed from: p  reason: collision with root package name */
    public final bd.h f7889p;

    /* renamed from: q  reason: collision with root package name */
    public final cd.d f7890q;

    /* renamed from: r  reason: collision with root package name */
    public final bd.h f7891r;

    /* renamed from: s  reason: collision with root package name */
    public final cd.d f7892s;

    /* renamed from: t  reason: collision with root package name */
    public final q1 f7893t;

    /* renamed from: u  reason: collision with root package name */
    public final cd.y0 f7894u;

    /* renamed from: v  reason: collision with root package name */
    public final bd.h f7895v;

    /* renamed from: w  reason: collision with root package name */
    public final cd.d f7896w;

    public u(cf.a aVar, p0 p0Var) {
        e0 e0Var;
        aVar.getClass();
        p0Var.getClass();
        this.f7876b = aVar;
        this.f7877c = p0Var;
        eg.h hVar = (eg.h) p0Var.a("key_rom_info");
        if (hVar != null) {
            e0Var = new e0(hVar.B, hVar.A, hVar.L, hVar.R);
        } else {
            e0Var = null;
        }
        this.f7878d = e0Var;
        Iterable<fg.b> iterable = (List) p0Var.a("modified_cheats");
        iterable = iterable == null ? zb.q.A : iterable;
        ArrayList arrayList = new ArrayList(zb.m.G(iterable, 10));
        for (fg.b bVar : iterable) {
            arrayList.add(bVar.a());
        }
        this.f7879e = cd.q.c(arrayList);
        this.f7880f = new ArrayList();
        this.f7881g = new s(this.f7877c.b("selected_game"), 0);
        this.f7882h = new s(this.f7877c.b("selected_folder"), 1);
        this.f7883i = new yb.n(new m(this, 0));
        this.f7884j = new yb.n(new m(this, 1));
        this.f7885k = new yb.n(new m(this, 2));
        this.f7886l = new yb.n(new m(this, 3));
        this.m = cd.q.x(ij.a.s(-1, 6, null));
        bd.h s10 = ij.a.s(-1, 6, null);
        this.f7887n = s10;
        this.f7888o = cd.q.x(s10);
        bd.h s11 = ij.a.s(-1, 6, null);
        this.f7889p = s11;
        this.f7890q = cd.q.x(s11);
        bd.h s12 = ij.a.s(-1, 6, null);
        this.f7891r = s12;
        this.f7892s = cd.q.x(s12);
        q1 c4 = cd.q.c(Boolean.FALSE);
        this.f7893t = c4;
        this.f7894u = new cd.y0(c4);
        bd.h s13 = ij.a.s(-1, 6, null);
        this.f7895v = s13;
        this.f7896w = cd.q.x(s13);
    }

    public final void e(Cheat cheat) {
        q1 q1Var;
        Object value;
        ArrayList arrayList;
        cheat.getClass();
        if (!((Boolean) this.f7894u.A.getValue()).booleanValue()) {
            do {
                q1Var = this.f7879e;
                value = q1Var.getValue();
                List list = (List) value;
                Iterator it = list.iterator();
                int i2 = 0;
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (nc.k.a(((Cheat) it.next()).getId(), cheat.getId())) {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                Cheat copy$default = Cheat.copy$default(cheat, null, 0L, null, null, null, !cheat.getEnabled(), 31, null);
                arrayList = new ArrayList(list);
                if (i10 >= 0) {
                    arrayList.set(i10, copy$default);
                } else {
                    arrayList.add(copy$default);
                }
                ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    Cheat cheat2 = (Cheat) obj;
                    cheat2.getClass();
                    arrayList2.add(new fg.b(cheat2.getId(), cheat2.getCheatDatabaseId(), cheat2.getName(), cheat2.getDescription(), cheat2.getCode(), cheat2.getEnabled()));
                }
                this.f7877c.c(arrayList2, "modified_cheats");
            } while (!q1Var.i(value, arrayList));
        }
    }
}
