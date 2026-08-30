package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xk0 implements aj2 {
    public final /* synthetic */ int A;

    public /* synthetic */ xk0(int i) {
        this.A = i;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        int i = this.A;
        wy3 wy3Var = wy3.a;
        o27 o27Var = o27.a;
        int i2 = 2;
        boolean z4 = false;
        switch (i) {
            case 0:
                bl0 bl0Var = (bl0) obj2;
                ((it5) obj).getClass();
                bl0Var.getClass();
                ip3 C = l07.C();
                if (bl0Var.equals(zk0.b)) {
                    i2 = 0;
                } else if (bl0Var.equals(al0.b)) {
                    i2 = 1;
                } else if (!(bl0Var instanceof yk0)) {
                    i.c();
                    return null;
                }
                C.add(Integer.valueOf(i2));
                if (bl0Var instanceof yk0) {
                    Cheat cheat = ((yk0) bl0Var).b;
                    cheat.getClass();
                    C.add(new zl0(cheat.getId(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled()));
                }
                return l07.t(C);
            case 1:
                it5 it5Var = (it5) obj;
                pl0 pl0Var = (pl0) obj2;
                it5Var.getClass();
                pl0Var.getClass();
                Boolean valueOf = Boolean.valueOf(pl0Var.a);
                aj2 aj2Var = (aj2) oq6.d.B;
                return l07.c0(valueOf, aj2Var.j(it5Var, (oq6) pl0Var.b.getValue()), aj2Var.j(it5Var, (oq6) pl0Var.c.getValue()), aj2Var.j(it5Var, (oq6) pl0Var.d.getValue()));
            case 2:
                ((Integer) obj).intValue();
                Cheat cheat2 = (Cheat) obj2;
                cheat2.getClass();
                Long id = cheat2.getId();
                if (id == null) {
                    return cheat2.getCode();
                }
                return id;
            case 3:
                String str = (String) obj;
                c31 c31Var = (c31) obj2;
                str.getClass();
                c31Var.getClass();
                if (str.length() == 0) {
                    return c31Var.toString();
                }
                return str + ", " + c31Var;
            case 4:
                tu0 tu0Var = (tu0) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var = (sk2) tu0Var;
                if (sk2Var.O(intValue & 1, z4)) {
                    ev2.a(se.A(), me2.X(sk2Var, R.string.navigate_back), null, 0L, sk2Var, 0, 12);
                } else {
                    sk2Var.R();
                }
                return o27Var;
            case 5:
                tu0 tu0Var2 = (tu0) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var2 = (sk2) tu0Var2;
                if (sk2Var2.O(intValue2 & 1, z4)) {
                    ev2.a(me2.y(), me2.X(sk2Var2, R.string.leaderboard_open_on_ra), null, ((hr0) sk2Var2.j(ir0.a)).i(), sk2Var2, 0, 4);
                } else {
                    sk2Var2.R();
                }
                return o27Var;
            case ig7.b /* 6 */:
                tu0 tu0Var3 = (tu0) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var3 = (sk2) tu0Var3;
                if (!sk2Var3.O(intValue3 & 1, z4)) {
                    sk2Var3.R();
                }
                return o27Var;
            case 7:
                tu0 tu0Var4 = (tu0) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var4 = (sk2) tu0Var4;
                if (sk2Var4.O(intValue4 & 1, z4)) {
                    ev2.b(jk2.P(se.A(), sk2Var4), null, null, 0L, sk2Var4, 56, 12);
                } else {
                    sk2Var4.R();
                }
                return o27Var;
            case 8:
                tu0 tu0Var5 = (tu0) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var5 = (sk2) tu0Var5;
                if (sk2Var5.O(intValue5 & 1, z4)) {
                    ev2.b(jk2.P(ct3.i0(), sk2Var5), me2.X(sk2Var5, R.string.cancel), null, 0L, sk2Var5, 8, 12);
                } else {
                    sk2Var5.R();
                }
                return o27Var;
            case 9:
                tu0 tu0Var6 = (tu0) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var6 = (sk2) tu0Var6;
                if (sk2Var6.O(intValue6 & 1, z4)) {
                    ir6.b(me2.X(sk2Var6, R.string.cheat_name), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var6, 0, 0, 131070);
                } else {
                    sk2Var6.R();
                }
                return o27Var;
            case 10:
                tu0 tu0Var7 = (tu0) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if ((intValue7 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var7 = (sk2) tu0Var7;
                if (sk2Var7.O(intValue7 & 1, z4)) {
                    ir6.b(me2.X(sk2Var7, R.string.error_name_cannot_be_empty), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var7, 0, 0, 131070);
                } else {
                    sk2Var7.R();
                }
                return o27Var;
            case 11:
                tu0 tu0Var8 = (tu0) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var8 = (sk2) tu0Var8;
                if (sk2Var8.O(intValue8 & 1, z4)) {
                    ir6.b(me2.X(sk2Var8, R.string.description), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var8, 0, 0, 131070);
                } else {
                    sk2Var8.R();
                }
                return o27Var;
            case mj2.L /* 12 */:
                tu0 tu0Var9 = (tu0) obj;
                int intValue9 = ((Integer) obj2).intValue();
                if ((intValue9 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var9 = (sk2) tu0Var9;
                if (sk2Var9.O(intValue9 & 1, z4)) {
                    ir6.b(me2.X(sk2Var9, R.string.cheat_code), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var9, 0, 0, 131070);
                } else {
                    sk2Var9.R();
                }
                return o27Var;
            case 13:
                tu0 tu0Var10 = (tu0) obj;
                int intValue10 = ((Integer) obj2).intValue();
                if ((intValue10 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                sk2 sk2Var10 = (sk2) tu0Var10;
                if (sk2Var10.O(intValue10 & 1, z)) {
                    ax2 ax2Var = oo2.b;
                    if (ax2Var == null) {
                        zw2 zw2Var = new zw2("AutoMirrored.Filled.PlaylistAdd", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
                        int i3 = f77.a;
                        mb6 mb6Var = new mb6(xq0.b);
                        vq2 vq2Var = new vq2(1, (byte) 0);
                        vq2Var.o(14.0f, 10.0f);
                        vq2Var.k(3.0f);
                        vq2Var.u(2.0f);
                        vq2Var.l(11.0f);
                        vq2Var.t(10.0f);
                        vq2Var.g();
                        vq2Var.o(14.0f, 6.0f);
                        vq2Var.k(3.0f);
                        vq2Var.u(2.0f);
                        vq2Var.l(11.0f);
                        vq2Var.t(6.0f);
                        vq2Var.g();
                        vq2Var.o(18.0f, 14.0f);
                        vq2Var.u(-4.0f);
                        vq2Var.l(-2.0f);
                        vq2Var.u(4.0f);
                        vq2Var.l(-4.0f);
                        vq2Var.u(2.0f);
                        vq2Var.l(4.0f);
                        vq2Var.u(4.0f);
                        vq2Var.l(2.0f);
                        vq2Var.u(-4.0f);
                        vq2Var.l(4.0f);
                        vq2Var.u(-2.0f);
                        vq2Var.k(18.0f);
                        vq2Var.g();
                        vq2Var.o(3.0f, 16.0f);
                        vq2Var.l(7.0f);
                        vq2Var.u(-2.0f);
                        vq2Var.k(3.0f);
                        vq2Var.t(16.0f);
                        vq2Var.g();
                        zw2.a(zw2Var, vq2Var.b, 0, mb6Var);
                        ax2Var = zw2Var.b();
                        oo2.b = ax2Var;
                    }
                    ev2.b(jk2.P(ax2Var, sk2Var10), me2.X(sk2Var10, R.string.add_cheat_folder), null, 0L, sk2Var10, 8, 12);
                } else {
                    sk2Var10.R();
                }
                return o27Var;
            case 14:
                tu0 tu0Var11 = (tu0) obj;
                int intValue11 = ((Integer) obj2).intValue();
                if ((intValue11 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var11 = (sk2) tu0Var11;
                if (sk2Var11.O(intValue11 & 1, z4)) {
                    oo2.b(l07.c0(new lk2(null, me2.X(sk2Var11, R.string.pause_hint_navigate)), new lk2("A", me2.X(sk2Var11, R.string.pause_hint_accept)), new lk2("B", me2.X(sk2Var11, R.string.pause_hint_back))), mh7.m0(dk7.i(wy3Var, mj2.C(sk2Var11).b, iq2.g), mh7.r), false, sk2Var11, 0, 4);
                } else {
                    sk2Var11.R();
                }
                return o27Var;
            case ig7.e /* 15 */:
                tu0 tu0Var12 = (tu0) obj;
                int intValue12 = ((Integer) obj2).intValue();
                if ((intValue12 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var12 = (sk2) tu0Var12;
                if (sk2Var12.O(intValue12 & 1, z4)) {
                    ev2.a(nk2.E(), null, o76.h(wy3Var, 20.0f), xq0.b(0.5f, xq0.d), sk2Var12, 3504, 0);
                } else {
                    sk2Var12.R();
                }
                return o27Var;
            case 16:
                tu0 tu0Var13 = (tu0) obj;
                int intValue13 = ((Integer) obj2).intValue();
                if ((intValue13 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var13 = (sk2) tu0Var13;
                if (sk2Var13.O(intValue13 & 1, z4)) {
                    ev2.a(nk2.E(), null, o76.h(wy3Var, 20.0f), xq0.b(0.5f, xq0.d), sk2Var13, 3504, 0);
                } else {
                    sk2Var13.R();
                }
                return o27Var;
            case 17:
                tu0 tu0Var14 = (tu0) obj;
                int intValue14 = ((Integer) obj2).intValue();
                if ((intValue14 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var14 = (sk2) tu0Var14;
                if (!sk2Var14.O(intValue14 & 1, z4)) {
                    sk2Var14.R();
                }
                return o27Var;
            case 18:
                tu0 tu0Var15 = (tu0) obj;
                int intValue15 = ((Integer) obj2).intValue();
                if ((intValue15 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var15 = (sk2) tu0Var15;
                if (sk2Var15.O(intValue15 & 1, z4)) {
                    yu4.a(null, mj2.C(sk2Var15).j, RecyclerView.A1, 0L, 0, sk2Var15, 0, 29);
                } else {
                    sk2Var15.R();
                }
                return o27Var;
            case 19:
                tu0 tu0Var16 = (tu0) obj;
                int intValue16 = ((Integer) obj2).intValue();
                if ((intValue16 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var16 = (sk2) tu0Var16;
                if (sk2Var16.O(intValue16 & 1, z4)) {
                    ir6.b(me2.X(sk2Var16, R.string.select_dsiware_title), null, ((hr0) sk2Var16.j(ir0.a)).d(), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var16, 0, 0, 131066);
                } else {
                    sk2Var16.R();
                }
                return o27Var;
            case 20:
                tu0 tu0Var17 = (tu0) obj;
                int intValue17 = ((Integer) obj2).intValue();
                if ((intValue17 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var17 = (sk2) tu0Var17;
                if (sk2Var17.O(intValue17 & 1, z4)) {
                    ev2.a(ct3.i0(), me2.X(sk2Var17, R.string.close), null, ((hr0) sk2Var17.j(ir0.a)).d(), sk2Var17, 0, 4);
                } else {
                    sk2Var17.R();
                }
                return o27Var;
            case 21:
                tu0 tu0Var18 = (tu0) obj;
                int intValue18 = ((Integer) obj2).intValue();
                if ((intValue18 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var18 = (sk2) tu0Var18;
                if (!sk2Var18.O(intValue18 & 1, z4)) {
                    sk2Var18.R();
                }
                return o27Var;
            case 22:
                tu0 tu0Var19 = (tu0) obj;
                int intValue19 = ((Integer) obj2).intValue();
                if ((intValue19 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                sk2 sk2Var19 = (sk2) tu0Var19;
                if (sk2Var19.O(intValue19 & 1, z2)) {
                    ax2 ax2Var2 = a53.q;
                    if (ax2Var2 == null) {
                        zw2 zw2Var2 = new zw2("Filled.CreateNewFolder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i4 = f77.a;
                        mb6 mb6Var2 = new mb6(xq0.b);
                        vq2 vq2Var2 = new vq2(1, (byte) 0);
                        vq2Var2.o(20.0f, 6.0f);
                        vq2Var2.l(-8.0f);
                        vq2Var2.n(-2.0f, -2.0f);
                        vq2Var2.m(4.0f, 4.0f);
                        vq2Var2.i(-1.11f, RecyclerView.A1, -1.99f, 0.89f, -1.99f, 2.0f);
                        vq2Var2.m(2.0f, 18.0f);
                        vq2Var2.i(RecyclerView.A1, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
                        vq2Var2.l(16.0f);
                        vq2Var2.i(1.11f, RecyclerView.A1, 2.0f, -0.89f, 2.0f, -2.0f);
                        vq2Var2.m(22.0f, 8.0f);
                        vq2Var2.i(RecyclerView.A1, -1.11f, -0.89f, -2.0f, -2.0f, -2.0f);
                        vq2Var2.g();
                        vq2Var2.o(19.0f, 14.0f);
                        vq2Var2.l(-3.0f);
                        vq2Var2.u(3.0f);
                        vq2Var2.l(-2.0f);
                        vq2Var2.u(-3.0f);
                        vq2Var2.l(-3.0f);
                        vq2Var2.u(-2.0f);
                        vq2Var2.l(3.0f);
                        vq2Var2.m(14.0f, 9.0f);
                        vq2Var2.l(2.0f);
                        vq2Var2.u(3.0f);
                        vq2Var2.l(3.0f);
                        vq2Var2.u(2.0f);
                        vq2Var2.g();
                        zw2.a(zw2Var2, vq2Var2.b, 0, mb6Var2);
                        ax2Var2 = zw2Var2.b();
                        a53.q = ax2Var2;
                    }
                    ev2.b(jk2.P(ax2Var2, sk2Var19), me2.X(sk2Var19, R.string.add_cheat_folder), null, 0L, sk2Var19, 8, 12);
                } else {
                    sk2Var19.R();
                }
                return o27Var;
            case 23:
                tu0 tu0Var20 = (tu0) obj;
                int intValue20 = ((Integer) obj2).intValue();
                if ((intValue20 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var20 = (sk2) tu0Var20;
                if (!sk2Var20.O(intValue20 & 1, z4)) {
                    sk2Var20.R();
                }
                return o27Var;
            case 24:
                tu0 tu0Var21 = (tu0) obj;
                int intValue21 = ((Integer) obj2).intValue();
                if ((intValue21 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                sk2 sk2Var21 = (sk2) tu0Var21;
                if (sk2Var21.O(intValue21 & 1, z3)) {
                    ax2 ax2Var3 = iq2.j;
                    if (ax2Var3 == null) {
                        zw2 zw2Var3 = new zw2("Filled.Clear", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i5 = f77.a;
                        mb6 mb6Var3 = new mb6(xq0.b);
                        vq2 vq2Var3 = new vq2(1, (byte) 0);
                        vq2Var3.o(19.0f, 6.41f);
                        vq2Var3.m(17.59f, 5.0f);
                        vq2Var3.m(12.0f, 10.59f);
                        vq2Var3.m(6.41f, 5.0f);
                        vq2Var3.m(5.0f, 6.41f);
                        vq2Var3.m(10.59f, 12.0f);
                        vq2Var3.m(5.0f, 17.59f);
                        vq2Var3.m(6.41f, 19.0f);
                        vq2Var3.m(12.0f, 13.41f);
                        vq2Var3.m(17.59f, 19.0f);
                        vq2Var3.m(19.0f, 17.59f);
                        vq2Var3.m(13.41f, 12.0f);
                        vq2Var3.g();
                        zw2.a(zw2Var3, vq2Var3.b, 0, mb6Var3);
                        ax2Var3 = zw2Var3.b();
                        iq2.j = ax2Var3;
                    }
                    ev2.a(ax2Var3, me2.X(sk2Var21, R.string.clear), null, 0L, sk2Var21, 0, 12);
                } else {
                    sk2Var21.R();
                }
                return o27Var;
            case 25:
                tu0 tu0Var22 = (tu0) obj;
                int intValue22 = ((Integer) obj2).intValue();
                if ((intValue22 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var22 = (sk2) tu0Var22;
                if (sk2Var22.O(intValue22 & 1, z4)) {
                    ev2.a(oo2.J(), me2.X(sk2Var22, R.string.options), null, 0L, sk2Var22, 0, 12);
                } else {
                    sk2Var22.R();
                }
                return o27Var;
            case 26:
                tu0 tu0Var23 = (tu0) obj;
                int intValue23 = ((Integer) obj2).intValue();
                if ((intValue23 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var23 = (sk2) tu0Var23;
                if (sk2Var23.O(intValue23 & 1, z4)) {
                    ir6.b(me2.X(sk2Var23, R.string.username), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var23, 0, 0, 131070);
                } else {
                    sk2Var23.R();
                }
                return o27Var;
            case 27:
                tu0 tu0Var24 = (tu0) obj;
                int intValue24 = ((Integer) obj2).intValue();
                if ((intValue24 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var24 = (sk2) tu0Var24;
                if (sk2Var24.O(intValue24 & 1, z4)) {
                    ir6.b(me2.X(sk2Var24, R.string.password), null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, sk2Var24, 0, 0, 131070);
                } else {
                    sk2Var24.R();
                }
                return o27Var;
            case 28:
                tu0 tu0Var25 = (tu0) obj;
                int intValue25 = ((Integer) obj2).intValue();
                if ((intValue25 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var25 = (sk2) tu0Var25;
                if (!sk2Var25.O(intValue25 & 1, z4)) {
                    sk2Var25.R();
                }
                return o27Var;
            default:
                tu0 tu0Var26 = (tu0) obj;
                int intValue26 = ((Integer) obj2).intValue();
                if ((intValue26 & 3) != 2) {
                    z4 = true;
                }
                sk2 sk2Var26 = (sk2) tu0Var26;
                if (!sk2Var26.O(intValue26 & 1, z4)) {
                    sk2Var26.R();
                }
                return o27Var;
        }
    }
}
