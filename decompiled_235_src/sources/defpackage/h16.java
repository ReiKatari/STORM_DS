package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import me.magnum.melonds.common.workers.CheatImportWorker;
import me.magnum.melonds.database.MelonDatabase;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h16  reason: default package */
/* loaded from: classes.dex */
public final class h16 implements hp0 {
    public final Context a;
    public final MelonDatabase b;
    public final jd6 c;

    public h16(Context context, MelonDatabase melonDatabase, jd6 jd6Var) {
        this.a = context;
        this.b = melonDatabase;
        this.c = jd6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(an0 an0Var, Cheat cheat, s41 s41Var) {
        r06 r06Var;
        int i;
        if (s41Var instanceof r06) {
            r06Var = (r06) s41Var;
            int i2 = r06Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r06Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = r06Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = r06Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Long l = an0Var.a;
                    l.getClass();
                    zm0 zm0Var = new zm0(null, l.longValue(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled());
                    vm0 s = this.b.s();
                    r06Var.Y = 1;
                    if (hv.S(r06Var, s.a, false, true, new y(10, s, zm0Var)) == x61Var) {
                        return x61Var;
                    }
                }
                this.c.i();
                return jg7.a;
            }
        }
        r06Var = new r06(this, s41Var);
        Object obj2 = r06Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = r06Var.Y;
        if (i == 0) {
        }
        this.c.i();
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, s41 s41Var) {
        s06 s06Var;
        int i;
        if (s41Var instanceof s06) {
            s06Var = (s06) s41Var;
            int i2 = s06Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s06Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = s06Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = s06Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        str = s06Var.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ym0 ym0Var = new ym0(str, null);
                    xm0 t = this.b.t();
                    s06Var.R = str;
                    s06Var.Z = 1;
                    obj = hv.S(s06Var, t.a, false, true, new y(11, t, ym0Var));
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                long longValue = ((Number) obj).longValue();
                this.c.i();
                return new wm0(str, new Long(longValue));
            }
        }
        s06Var = new s06(this, s41Var);
        Object obj2 = s06Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = s06Var.Z;
        if (i == 0) {
        }
        long longValue2 = ((Number) obj2).longValue();
        this.c.i();
        return new wm0(str, new Long(longValue2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0060, code lost:
        if (r13 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (defpackage.hv.S(r0, r11.a, false, true, new defpackage.y(13, r11, r2)) == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cp2 cp2Var, s41 s41Var) {
        t06 t06Var;
        int i;
        long longValue;
        if (s41Var instanceof t06) {
            t06Var = (t06) s41Var;
            int i2 = t06Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t06Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = t06Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = t06Var.Z;
                MelonDatabase melonDatabase = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            this.c.i();
                            return jg7.a;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = t06Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    Long l = cp2Var.a;
                    if (l == null) {
                        lp2 lp2Var = new lp2(null, cp2Var.b, cp2Var.c, cp2Var.d);
                        ip2 v = melonDatabase.v();
                        t06Var.R = str;
                        t06Var.Z = 1;
                        obj = hv.S(t06Var, v.a, false, true, new bi2(3, v, lp2Var));
                    } else {
                        longValue = l.longValue();
                        cn0 cn0Var = new cn0(null, longValue, str);
                        bn0 u = melonDatabase.u();
                        t06Var.R = null;
                        t06Var.Z = 2;
                    }
                }
                longValue = ((Number) obj).longValue();
                cn0 cn0Var2 = new cn0(null, longValue, str);
                bn0 u2 = melonDatabase.u();
                t06Var.R = null;
                t06Var.Z = 2;
            }
        }
        t06Var = new t06(this, s41Var);
        Object obj2 = t06Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = t06Var.Z;
        MelonDatabase melonDatabase2 = this.b;
        if (i == 0) {
        }
        longValue = ((Number) obj2).longValue();
        cn0 cn0Var22 = new cn0(null, longValue, str);
        bn0 u22 = melonDatabase2.u();
        t06Var.R = null;
        t06Var.Z = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(an0 an0Var, jo0 jo0Var, s41 s41Var) {
        u06 u06Var;
        int i;
        if (s41Var instanceof u06) {
            u06Var = (u06) s41Var;
            int i2 = u06Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u06Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = u06Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = u06Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Long l = an0Var.a;
                    l.getClass();
                    zm0 zm0Var = new zm0(null, l.longValue(), 0L, jo0Var.a, jo0Var.b, jo0Var.c, false);
                    vm0 s = this.b.s();
                    u06Var.Y = 1;
                    if (hv.S(u06Var, s.a, false, true, new y(10, s, zm0Var)) == x61Var) {
                        return x61Var;
                    }
                }
                this.c.i();
                return jg7.a;
            }
        }
        u06Var = new u06(this, s41Var);
        Object obj2 = u06Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = u06Var.Y;
        if (i == 0) {
        }
        this.c.i();
        return jg7.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        if (defpackage.hv.S(r3, r5.a, false, true, new defpackage.bi2(3, r5, r2)) == r4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r2 != r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x017f, code lost:
        if (defpackage.hv.S(r3, r2.a, false, true, new defpackage.rm0(r2, r5, 0)) != r4) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(cp2 cp2Var, s41 s41Var) {
        v06 v06Var;
        int i;
        cp2 cp2Var2;
        lp2 lp2Var;
        long j;
        int size;
        int i2;
        cp2 cp2Var3 = cp2Var;
        if (s41Var instanceof v06) {
            v06Var = (v06) s41Var;
            int i3 = v06Var.e0;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                v06Var.e0 = i3 - Integer.MIN_VALUE;
                Object obj = v06Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = v06Var.e0;
                MelonDatabase melonDatabase = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i == 4) {
                                    lp2Var = v06Var.X;
                                    oi2.Y(obj);
                                    this.c.i();
                                    return new cp2(lp2Var.a, lp2Var.b, lp2Var.c, lp2Var.d, yt1.A);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            j = v06Var.Y;
                            lp2Var = v06Var.X;
                            cp2Var2 = v06Var.R;
                            oi2.Y(obj);
                            ArrayList q1 = gt0.q1(cp2Var2.e, (List) obj);
                            ArrayList arrayList = new ArrayList();
                            size = q1.size();
                            i2 = 0;
                            while (i2 < size) {
                                Object obj2 = q1.get(i2);
                                i2++;
                                vr4 vr4Var = (vr4) obj2;
                                ArrayList arrayList2 = ((an0) vr4Var.A).c;
                                ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList2, 10));
                                int size2 = arrayList2.size();
                                int i4 = 0;
                                while (i4 < size2) {
                                    Object obj3 = arrayList2.get(i4);
                                    i4++;
                                    Cheat cheat = (Cheat) obj3;
                                    arrayList3.add(new zm0(null, ((Number) vr4Var.B).longValue(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), false));
                                    q1 = q1;
                                }
                                gt0.A0(arrayList, arrayList3);
                            }
                            vm0 s = melonDatabase.s();
                            v06Var.R = null;
                            v06Var.X = lp2Var;
                            v06Var.Y = j;
                            v06Var.e0 = 4;
                        } else {
                            cp2Var3 = v06Var.R;
                            oi2.Y(obj);
                            cp2Var2 = cp2Var3;
                            obj.getClass();
                            lp2 lp2Var2 = (lp2) obj;
                            Long l = lp2Var2.a;
                            l.getClass();
                            long longValue = l.longValue();
                            List<an0> list = cp2Var2.e;
                            ArrayList arrayList4 = new ArrayList(ht0.v0(list, 10));
                            for (an0 an0Var : list) {
                                arrayList4.add(new cn0(null, longValue, an0Var.b));
                            }
                            bn0 u = melonDatabase.u();
                            v06Var.R = cp2Var2;
                            v06Var.X = lp2Var2;
                            v06Var.Y = longValue;
                            v06Var.e0 = 3;
                            Object S = hv.S(v06Var, u.a, false, true, new y(12, u, arrayList4));
                            if (S != x61Var) {
                                obj = S;
                                lp2Var = lp2Var2;
                                j = longValue;
                                ArrayList q12 = gt0.q1(cp2Var2.e, (List) obj);
                                ArrayList arrayList5 = new ArrayList();
                                size = q12.size();
                                i2 = 0;
                                while (i2 < size) {
                                }
                                vm0 s2 = melonDatabase.s();
                                v06Var.R = null;
                                v06Var.X = lp2Var;
                                v06Var.Y = j;
                                v06Var.e0 = 4;
                            }
                            return x61Var;
                        }
                    } else {
                        cp2Var3 = v06Var.R;
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    lp2 lp2Var3 = new lp2(null, cp2Var3.b, cp2Var3.c, cp2Var3.d);
                    ip2 v = melonDatabase.v();
                    v06Var.R = cp2Var3;
                    v06Var.e0 = 1;
                }
                ip2 v2 = melonDatabase.v();
                String str = cp2Var3.c;
                String str2 = cp2Var3.d;
                v06Var.R = cp2Var3;
                v06Var.e0 = 2;
                obj = hv.S(v06Var, v2.a, true, false, new sm0(str, 1, str2));
            }
        }
        v06Var = new v06(this, s41Var);
        Object obj4 = v06Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = v06Var.e0;
        MelonDatabase melonDatabase2 = this.b;
        if (i == 0) {
        }
        ip2 v22 = melonDatabase2.v();
        String str3 = cp2Var3.c;
        String str22 = cp2Var3.d;
        v06Var.R = cp2Var3;
        v06Var.e0 = 2;
        obj4 = hv.S(v06Var, v22.a, true, false, new sm0(str3, 1, str22));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(Cheat cheat, s41 s41Var) {
        w06 w06Var;
        int i;
        if (s41Var instanceof w06) {
            w06Var = (w06) s41Var;
            int i2 = w06Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w06Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = w06Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = w06Var.Y;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Long id = cheat.getId();
                    if (id != null) {
                        long longValue = id.longValue();
                        vm0 s = this.b.s();
                        w06Var.Y = 1;
                        Object S = hv.S(w06Var, s.a, false, true, new t4(3, longValue));
                        if (S != x61Var) {
                            S = jg7Var;
                        }
                        if (S == x61Var) {
                            return x61Var;
                        }
                    }
                    return jg7Var;
                }
                this.c.i();
                return jg7Var;
            }
        }
        w06Var = new w06(this, s41Var);
        Object obj2 = w06Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = w06Var.Y;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        this.c.i();
        return jg7Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0063, code lost:
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007d, code lost:
        if (r10 != r1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r10 == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, s41 s41Var) {
        x06 x06Var;
        x61 x61Var;
        int i;
        Object S;
        if (s41Var instanceof x06) {
            x06Var = (x06) s41Var;
            int i2 = x06Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x06Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = x06Var.R;
                x61Var = x61.COROUTINE_SUSPENDED;
                i = x06Var.Y;
                MelonDatabase melonDatabase = this.b;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3) {
                                oi2.Y(obj);
                                this.c.i();
                                return jg7Var;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj);
                        ip2 v = melonDatabase.v();
                        x06Var.Y = 3;
                        Object S2 = hv.S(x06Var, v.a, false, true, new bz1(7));
                        if (S2 != x61Var) {
                            S2 = jg7Var;
                        }
                    } else {
                        oi2.Y(obj);
                    }
                } else {
                    oi2.Y(obj);
                    if (nb3.k(str, "__custom_cheat_database")) {
                        return jg7Var;
                    }
                    xm0 t = melonDatabase.t();
                    x06Var.Y = 1;
                    Object S3 = hv.S(x06Var, t.a, false, true, new c70(str, 1));
                    if (S3 != x61Var) {
                        S3 = jg7Var;
                    }
                }
                bn0 u = melonDatabase.u();
                x06Var.Y = 2;
                S = hv.S(x06Var, u.a, false, true, new k4(28));
                if (S != x61Var) {
                    S = jg7Var;
                }
            }
        }
        x06Var = new x06(this, s41Var);
        Object obj2 = x06Var.R;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = x06Var.Y;
        MelonDatabase melonDatabase2 = this.b;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        bn0 u2 = melonDatabase2.u();
        x06Var.Y = 2;
        S = hv.S(x06Var, u2.a, false, true, new k4(28));
        if (S != x61Var) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x02a8, code lost:
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02d2, code lost:
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0307, code lost:
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x017a, code lost:
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01a8, code lost:
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01ea, code lost:
        if (r2 == r4) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f4, code lost:
        if (((java.util.List) r2).isEmpty() != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0321 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(lx5 lx5Var, s41 s41Var) {
        y06 y06Var;
        int i;
        String upperCase;
        String b;
        String str;
        lp2 lp2Var;
        lx5 lx5Var2;
        String str2;
        String str3;
        String str4;
        String str5;
        lx5 lx5Var3;
        lx5 lx5Var4;
        String str6;
        String str7;
        lp2 lp2Var2;
        long j;
        String str8;
        Object d0;
        lx5 lx5Var5;
        String str9;
        String str10;
        boolean booleanValue;
        boolean z;
        lp2 lp2Var3;
        String str11;
        lx5 lx5Var6;
        String str12;
        lx5 lx5Var7;
        lx5 lx5Var8 = lx5Var;
        if (s41Var instanceof y06) {
            y06Var = (y06) s41Var;
            int i2 = y06Var.h0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y06Var.h0 = i2 - Integer.MIN_VALUE;
                Object obj = y06Var.f0;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = y06Var.h0;
                MelonDatabase melonDatabase = this.b;
                switch (i) {
                    case 0:
                        oi2.Y(obj);
                        String a = lx5Var8.a();
                        upperCase = qs6.S0(4, lx5Var8.a).toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        b = lx5Var8.b();
                        ip2 v = melonDatabase.v();
                        y06Var.R = lx5Var8;
                        y06Var.X = a;
                        y06Var.Y = upperCase;
                        y06Var.Z = b;
                        y06Var.h0 = 1;
                        Object S = hv.S(y06Var, v.a, true, false, new sm0(a, 1, b));
                        if (S != x61Var) {
                            str = a;
                            obj = S;
                            lp2Var = (lp2) obj;
                            if (lp2Var == null) {
                                if (!qs6.v0(b)) {
                                    ip2 v2 = melonDatabase.v();
                                    y06Var.R = lx5Var8;
                                    y06Var.X = str;
                                    y06Var.Y = upperCase;
                                    y06Var.Z = b;
                                    y06Var.h0 = 2;
                                    obj = v2.b(b, y06Var);
                                    if (obj != x61Var) {
                                        String str13 = str;
                                        lx5Var2 = lx5Var8;
                                        str2 = b;
                                        str3 = str13;
                                        lp2Var = (lp2) obj;
                                        String str14 = str3;
                                        b = str2;
                                        lx5Var8 = lx5Var2;
                                        str = str14;
                                        if (lp2Var == null) {
                                            ip2 v3 = melonDatabase.v();
                                            y06Var.R = lx5Var8;
                                            y06Var.X = str;
                                            y06Var.Y = upperCase;
                                            y06Var.Z = b;
                                            y06Var.h0 = 3;
                                            obj = v3.c(str, y06Var);
                                            if (obj != x61Var) {
                                                String str15 = str;
                                                lx5Var4 = lx5Var8;
                                                str6 = b;
                                                str7 = str15;
                                                lp2Var = (lp2) obj;
                                                if (lp2Var == null) {
                                                    if (!lx5Var4.e && upperCase.length() == 4) {
                                                        ip2 v4 = melonDatabase.v();
                                                        y06Var.R = lx5Var4;
                                                        y06Var.X = str7;
                                                        y06Var.Y = upperCase;
                                                        y06Var.Z = str6;
                                                        y06Var.h0 = 4;
                                                        obj = v4.c(upperCase, y06Var);
                                                        break;
                                                    } else {
                                                        lp2Var = null;
                                                        if (lp2Var == null) {
                                                            if (upperCase.length() >= 3) {
                                                                ip2 v5 = melonDatabase.v();
                                                                String S0 = qs6.S0(3, upperCase);
                                                                y06Var.R = lx5Var4;
                                                                y06Var.X = str7;
                                                                y06Var.Y = upperCase;
                                                                y06Var.Z = str6;
                                                                y06Var.h0 = 5;
                                                                obj = hv.S(y06Var, v5.a, true, false, new c70(S0, 9));
                                                                break;
                                                            } else {
                                                                lx5Var3 = lx5Var4;
                                                                str = str7;
                                                                str4 = upperCase;
                                                                str5 = str6;
                                                                lp2Var2 = null;
                                                                if (lp2Var2 != null) {
                                                                    bn0 u = melonDatabase.u();
                                                                    Long l = lp2Var2.a;
                                                                    if (l != null) {
                                                                        j = l.longValue();
                                                                    } else {
                                                                        j = -1;
                                                                    }
                                                                    long j2 = j;
                                                                    y06Var.R = lx5Var3;
                                                                    y06Var.X = str;
                                                                    y06Var.Y = str4;
                                                                    y06Var.Z = str5;
                                                                    y06Var.d0 = lp2Var2;
                                                                    y06Var.h0 = 6;
                                                                    obj = hv.S(y06Var, u.a, true, false, new t4(6, j2));
                                                                    break;
                                                                }
                                                                lx5 lx5Var9 = lx5Var3;
                                                                String str16 = str5;
                                                                String str17 = str4;
                                                                str8 = lx5Var9.c;
                                                                if (qs6.v0(str8)) {
                                                                    str8 = lx5Var9.d;
                                                                }
                                                                String str18 = str8;
                                                                y06Var.R = lx5Var9;
                                                                y06Var.X = str;
                                                                y06Var.Y = str17;
                                                                y06Var.Z = str16;
                                                                y06Var.d0 = lp2Var2;
                                                                y06Var.h0 = 7;
                                                                xe1 xe1Var = xk1.a;
                                                                d0 = hv.d0(de1.L, new ja1(str, str16, melonDatabase, str18, (r41) null), y06Var);
                                                                if (d0 != x61Var) {
                                                                    lx5Var5 = lx5Var9;
                                                                    str9 = str16;
                                                                    str10 = str17;
                                                                    obj = d0;
                                                                    booleanValue = ((Boolean) obj).booleanValue();
                                                                    if (booleanValue) {
                                                                        ip2 v6 = melonDatabase.v();
                                                                        y06Var.R = lx5Var5;
                                                                        y06Var.X = str;
                                                                        y06Var.Y = str10;
                                                                        y06Var.Z = str9;
                                                                        y06Var.d0 = null;
                                                                        y06Var.e0 = booleanValue;
                                                                        y06Var.h0 = 8;
                                                                        Object S2 = hv.S(y06Var, v6.a, true, false, new sm0(str, 1, str9));
                                                                        if (S2 != x61Var) {
                                                                            obj = S2;
                                                                            z = booleanValue;
                                                                            lp2Var3 = (lp2) obj;
                                                                            if (lp2Var3 == null) {
                                                                                if (!qs6.v0(str9)) {
                                                                                    ip2 v7 = melonDatabase.v();
                                                                                    y06Var.R = lx5Var5;
                                                                                    y06Var.X = str;
                                                                                    y06Var.Y = str10;
                                                                                    y06Var.Z = null;
                                                                                    y06Var.d0 = null;
                                                                                    y06Var.e0 = z;
                                                                                    y06Var.h0 = 9;
                                                                                    obj = v7.b(str9, y06Var);
                                                                                    if (obj != x61Var) {
                                                                                        str11 = str10;
                                                                                        str12 = str;
                                                                                        lx5Var7 = lx5Var5;
                                                                                        lp2Var3 = (lp2) obj;
                                                                                        lx5 lx5Var10 = lx5Var7;
                                                                                        str = str12;
                                                                                        lx5Var6 = lx5Var10;
                                                                                        if (lp2Var3 == null) {
                                                                                            ip2 v8 = melonDatabase.v();
                                                                                            y06Var.R = lx5Var6;
                                                                                            y06Var.X = null;
                                                                                            y06Var.Y = str11;
                                                                                            y06Var.Z = null;
                                                                                            y06Var.d0 = null;
                                                                                            y06Var.e0 = z;
                                                                                            y06Var.h0 = 10;
                                                                                            obj = v8.c(str, y06Var);
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    lp2Var3 = null;
                                                                                    str11 = str10;
                                                                                    lx5Var6 = lx5Var5;
                                                                                    if (lp2Var3 == null) {
                                                                                    }
                                                                                }
                                                                            }
                                                                            lp2Var2 = lp2Var3;
                                                                        }
                                                                    }
                                                                    if (lp2Var2 != null) {
                                                                        return null;
                                                                    }
                                                                    return new cp2(lp2Var2.a, lp2Var2.b, lp2Var2.c, lp2Var2.d, yt1.A);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                lx5Var3 = lx5Var4;
                                                str = str7;
                                                str4 = upperCase;
                                                str5 = str6;
                                                lp2Var2 = lp2Var;
                                                if (lp2Var2 != null) {
                                                }
                                                lx5 lx5Var92 = lx5Var3;
                                                String str162 = str5;
                                                String str172 = str4;
                                                str8 = lx5Var92.c;
                                                if (qs6.v0(str8)) {
                                                }
                                                String str182 = str8;
                                                y06Var.R = lx5Var92;
                                                y06Var.X = str;
                                                y06Var.Y = str172;
                                                y06Var.Z = str162;
                                                y06Var.d0 = lp2Var2;
                                                y06Var.h0 = 7;
                                                xe1 xe1Var2 = xk1.a;
                                                d0 = hv.d0(de1.L, new ja1(str, str162, melonDatabase, str182, (r41) null), y06Var);
                                                if (d0 != x61Var) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    lp2Var = null;
                                    if (lp2Var == null) {
                                    }
                                }
                            }
                            String str19 = b;
                            str4 = upperCase;
                            str5 = str19;
                            lx5Var3 = lx5Var8;
                            lp2Var2 = lp2Var;
                            if (lp2Var2 != null) {
                            }
                            lx5 lx5Var922 = lx5Var3;
                            String str1622 = str5;
                            String str1722 = str4;
                            str8 = lx5Var922.c;
                            if (qs6.v0(str8)) {
                            }
                            String str1822 = str8;
                            y06Var.R = lx5Var922;
                            y06Var.X = str;
                            y06Var.Y = str1722;
                            y06Var.Z = str1622;
                            y06Var.d0 = lp2Var2;
                            y06Var.h0 = 7;
                            xe1 xe1Var22 = xk1.a;
                            d0 = hv.d0(de1.L, new ja1(str, str1622, melonDatabase, str1822, (r41) null), y06Var);
                            if (d0 != x61Var) {
                            }
                        }
                        break;
                    case 1:
                        String str20 = y06Var.Z;
                        upperCase = y06Var.Y;
                        String str21 = y06Var.X;
                        lx5 lx5Var11 = y06Var.R;
                        oi2.Y(obj);
                        b = str20;
                        lx5Var8 = lx5Var11;
                        str = str21;
                        lp2Var = (lp2) obj;
                        if (lp2Var == null) {
                        }
                        String str192 = b;
                        str4 = upperCase;
                        str5 = str192;
                        lx5Var3 = lx5Var8;
                        lp2Var2 = lp2Var;
                        if (lp2Var2 != null) {
                        }
                        lx5 lx5Var9222 = lx5Var3;
                        String str16222 = str5;
                        String str17222 = str4;
                        str8 = lx5Var9222.c;
                        if (qs6.v0(str8)) {
                        }
                        String str18222 = str8;
                        y06Var.R = lx5Var9222;
                        y06Var.X = str;
                        y06Var.Y = str17222;
                        y06Var.Z = str16222;
                        y06Var.d0 = lp2Var2;
                        y06Var.h0 = 7;
                        xe1 xe1Var222 = xk1.a;
                        d0 = hv.d0(de1.L, new ja1(str, str16222, melonDatabase, str18222, (r41) null), y06Var);
                        if (d0 != x61Var) {
                        }
                        break;
                    case 2:
                        str2 = y06Var.Z;
                        upperCase = y06Var.Y;
                        str3 = y06Var.X;
                        lx5Var2 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var = (lp2) obj;
                        String str142 = str3;
                        b = str2;
                        lx5Var8 = lx5Var2;
                        str = str142;
                        if (lp2Var == null) {
                        }
                        String str1922 = b;
                        str4 = upperCase;
                        str5 = str1922;
                        lx5Var3 = lx5Var8;
                        lp2Var2 = lp2Var;
                        if (lp2Var2 != null) {
                        }
                        lx5 lx5Var92222 = lx5Var3;
                        String str162222 = str5;
                        String str172222 = str4;
                        str8 = lx5Var92222.c;
                        if (qs6.v0(str8)) {
                        }
                        String str182222 = str8;
                        y06Var.R = lx5Var92222;
                        y06Var.X = str;
                        y06Var.Y = str172222;
                        y06Var.Z = str162222;
                        y06Var.d0 = lp2Var2;
                        y06Var.h0 = 7;
                        xe1 xe1Var2222 = xk1.a;
                        d0 = hv.d0(de1.L, new ja1(str, str162222, melonDatabase, str182222, (r41) null), y06Var);
                        if (d0 != x61Var) {
                        }
                        break;
                    case 3:
                        str6 = y06Var.Z;
                        upperCase = y06Var.Y;
                        str7 = y06Var.X;
                        lx5Var4 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var = (lp2) obj;
                        if (lp2Var == null) {
                        }
                        lx5Var3 = lx5Var4;
                        str = str7;
                        str4 = upperCase;
                        str5 = str6;
                        lp2Var2 = lp2Var;
                        if (lp2Var2 != null) {
                        }
                        lx5 lx5Var922222 = lx5Var3;
                        String str1622222 = str5;
                        String str1722222 = str4;
                        str8 = lx5Var922222.c;
                        if (qs6.v0(str8)) {
                        }
                        String str1822222 = str8;
                        y06Var.R = lx5Var922222;
                        y06Var.X = str;
                        y06Var.Y = str1722222;
                        y06Var.Z = str1622222;
                        y06Var.d0 = lp2Var2;
                        y06Var.h0 = 7;
                        xe1 xe1Var22222 = xk1.a;
                        d0 = hv.d0(de1.L, new ja1(str, str1622222, melonDatabase, str1822222, (r41) null), y06Var);
                        if (d0 != x61Var) {
                        }
                        break;
                    case 4:
                        str6 = y06Var.Z;
                        upperCase = y06Var.Y;
                        str7 = y06Var.X;
                        lx5Var4 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var = (lp2) obj;
                        if (lp2Var == null) {
                        }
                        lx5Var3 = lx5Var4;
                        str = str7;
                        str4 = upperCase;
                        str5 = str6;
                        lp2Var2 = lp2Var;
                        if (lp2Var2 != null) {
                        }
                        lx5 lx5Var9222222 = lx5Var3;
                        String str16222222 = str5;
                        String str17222222 = str4;
                        str8 = lx5Var9222222.c;
                        if (qs6.v0(str8)) {
                        }
                        String str18222222 = str8;
                        y06Var.R = lx5Var9222222;
                        y06Var.X = str;
                        y06Var.Y = str17222222;
                        y06Var.Z = str16222222;
                        y06Var.d0 = lp2Var2;
                        y06Var.h0 = 7;
                        xe1 xe1Var222222 = xk1.a;
                        d0 = hv.d0(de1.L, new ja1(str, str16222222, melonDatabase, str18222222, (r41) null), y06Var);
                        if (d0 != x61Var) {
                        }
                        break;
                    case 5:
                        str6 = y06Var.Z;
                        upperCase = y06Var.Y;
                        str7 = y06Var.X;
                        lx5Var4 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var = (lp2) obj;
                        lx5Var3 = lx5Var4;
                        str = str7;
                        str4 = upperCase;
                        str5 = str6;
                        lp2Var2 = lp2Var;
                        if (lp2Var2 != null) {
                        }
                        lx5 lx5Var92222222 = lx5Var3;
                        String str162222222 = str5;
                        String str172222222 = str4;
                        str8 = lx5Var92222222.c;
                        if (qs6.v0(str8)) {
                        }
                        String str182222222 = str8;
                        y06Var.R = lx5Var92222222;
                        y06Var.X = str;
                        y06Var.Y = str172222222;
                        y06Var.Z = str162222222;
                        y06Var.d0 = lp2Var2;
                        y06Var.h0 = 7;
                        xe1 xe1Var2222222 = xk1.a;
                        d0 = hv.d0(de1.L, new ja1(str, str162222222, melonDatabase, str182222222, (r41) null), y06Var);
                        if (d0 != x61Var) {
                        }
                        break;
                    case 6:
                        lp2Var2 = y06Var.d0;
                        str5 = y06Var.Z;
                        str4 = y06Var.Y;
                        str = y06Var.X;
                        lx5Var3 = y06Var.R;
                        oi2.Y(obj);
                        break;
                    case 7:
                        lp2Var2 = y06Var.d0;
                        str9 = y06Var.Z;
                        str10 = y06Var.Y;
                        str = y06Var.X;
                        lx5Var5 = y06Var.R;
                        oi2.Y(obj);
                        booleanValue = ((Boolean) obj).booleanValue();
                        if (booleanValue) {
                        }
                        if (lp2Var2 != null) {
                        }
                        break;
                    case 8:
                        z = y06Var.e0;
                        str9 = y06Var.Z;
                        str10 = y06Var.Y;
                        str = y06Var.X;
                        lx5Var5 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var3 = (lp2) obj;
                        if (lp2Var3 == null) {
                        }
                        lp2Var2 = lp2Var3;
                        if (lp2Var2 != null) {
                        }
                        break;
                    case 9:
                        z = y06Var.e0;
                        str11 = y06Var.Y;
                        str12 = y06Var.X;
                        lx5Var7 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var3 = (lp2) obj;
                        lx5 lx5Var102 = lx5Var7;
                        str = str12;
                        lx5Var6 = lx5Var102;
                        if (lp2Var3 == null) {
                        }
                        lp2Var2 = lp2Var3;
                        if (lp2Var2 != null) {
                        }
                        break;
                    case 10:
                        z = y06Var.e0;
                        str11 = y06Var.Y;
                        lx5Var6 = y06Var.R;
                        oi2.Y(obj);
                        lp2Var3 = (lp2) obj;
                        if (lp2Var3 == null) {
                            if (!lx5Var6.e && str11.length() == 4) {
                                ip2 v9 = melonDatabase.v();
                                y06Var.R = null;
                                y06Var.X = null;
                                y06Var.Y = str11;
                                y06Var.Z = null;
                                y06Var.d0 = null;
                                y06Var.e0 = z;
                                y06Var.h0 = 11;
                                obj = v9.c(str11, y06Var);
                                break;
                            } else {
                                lp2Var3 = null;
                                if (lp2Var3 == null) {
                                    if (str11.length() >= 3) {
                                        ip2 v10 = melonDatabase.v();
                                        String S02 = qs6.S0(3, str11);
                                        y06Var.R = null;
                                        y06Var.X = null;
                                        y06Var.Y = null;
                                        y06Var.Z = null;
                                        y06Var.d0 = null;
                                        y06Var.e0 = z;
                                        y06Var.h0 = 12;
                                        obj = hv.S(y06Var, v10.a, true, false, new c70(S02, 9));
                                        break;
                                    } else {
                                        lp2Var2 = null;
                                        if (lp2Var2 != null) {
                                        }
                                    }
                                }
                            }
                        }
                        lp2Var2 = lp2Var3;
                        if (lp2Var2 != null) {
                        }
                        break;
                    case 11:
                        z = y06Var.e0;
                        str11 = y06Var.Y;
                        oi2.Y(obj);
                        lp2Var3 = (lp2) obj;
                        if (lp2Var3 == null) {
                        }
                        lp2Var2 = lp2Var3;
                        if (lp2Var2 != null) {
                        }
                        break;
                    case 12:
                        oi2.Y(obj);
                        lp2Var3 = (lp2) obj;
                        lp2Var2 = lp2Var3;
                        if (lp2Var2 != null) {
                        }
                        break;
                    default:
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
                return x61Var;
            }
        }
        y06Var = new y06(this, s41Var);
        Object obj2 = y06Var.f0;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = y06Var.h0;
        MelonDatabase melonDatabase2 = this.b;
        switch (i) {
        }
        return x61Var2;
    }

    public final le2 i(cp2 cp2Var) {
        cp2Var.getClass();
        Long l = cp2Var.a;
        if (l != null) {
            long longValue = l.longValue();
            ip2 v = this.b.v();
            return new a16(yv7.a(v.a, true, new String[]{"cheat", "cheat_folder"}, new hp2(v, longValue, 0)), 0);
        }
        return wt1.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061 A[LOOP:0: B:18:0x005b->B:20:0x0061, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable j(s41 s41Var) {
        d16 d16Var;
        int i;
        if (s41Var instanceof d16) {
            d16Var = (d16) s41Var;
            int i2 = d16Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d16Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = d16Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = d16Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ip2 v = this.b.v();
                    d16Var.Y = 1;
                    obj = hv.S(d16Var, v.a, true, false, new bz1(8));
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                Iterable<lp2> iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(ht0.v0(iterable, 10));
                for (lp2 lp2Var : iterable) {
                    arrayList.add(new cp2(lp2Var.a, lp2Var.b, lp2Var.c, lp2Var.d, yt1.A));
                }
                return arrayList;
            }
        }
        d16Var = new d16(this, s41Var);
        Object obj2 = d16Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = d16Var.Y;
        if (i == 0) {
        }
        Iterable<lp2> iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(ht0.v0(iterable2, 10));
        while (r8.hasNext()) {
        }
        return arrayList2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007d, code lost:
        if (r11 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007f, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097 A[LOOP:0: B:27:0x0091->B:29:0x0097, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable k(lx5 lx5Var, s41 s41Var) {
        e16 e16Var;
        int i;
        List<zm0> list;
        if (s41Var instanceof e16) {
            e16Var = (e16) s41Var;
            int i2 = e16Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e16Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = e16Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = e16Var.Z;
                MelonDatabase melonDatabase = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            list = (List) obj;
                            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                            for (zm0 zm0Var : list) {
                                arrayList.add(new Cheat(zm0Var.a, zm0Var.c, zm0Var.d, zm0Var.e, zm0Var.f, zm0Var.g));
                            }
                            return arrayList;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lx5Var = e16Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    String a = lx5Var.a();
                    vm0 s = melonDatabase.s();
                    String b = lx5Var.b();
                    e16Var.R = lx5Var;
                    e16Var.Z = 1;
                    obj = hv.S(e16Var, s.a, true, false, new sm0(a, 0, b));
                }
                list = (List) obj;
                if (list.isEmpty()) {
                    vm0 s2 = melonDatabase.s();
                    String str = lx5Var.a;
                    String b2 = lx5Var.b();
                    e16Var.R = null;
                    e16Var.Z = 2;
                    obj = hv.S(e16Var, s2.a, true, false, new sm0(str, 0, b2));
                }
                ArrayList arrayList2 = new ArrayList(ht0.v0(list, 10));
                while (r10.hasNext()) {
                }
                return arrayList2;
            }
        }
        e16Var = new e16(this, s41Var);
        Object obj2 = e16Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = e16Var.Z;
        MelonDatabase melonDatabase2 = this.b;
        if (i == 0) {
        }
        list = (List) obj2;
        if (list.isEmpty()) {
        }
        ArrayList arrayList22 = new ArrayList(ht0.v0(list, 10));
        while (r10.hasNext()) {
        }
        return arrayList22;
    }

    public final void l(Uri uri) {
        uri.getClass();
        bk1 bk1Var = new bk1(CheatImportWorker.class);
        vr4[] vr4VarArr = {new vr4("uri", uri.toString())};
        wb1 wb1Var = new wb1(0, (byte) 0);
        vr4 vr4Var = vr4VarArr[0];
        wb1Var.h(vr4Var.B, (String) vr4Var.A);
        ((yw7) bk1Var.B).e = wb1Var.e();
        gm4 c = bk1Var.c();
        lw7 b = lw7.b(this.a);
        b.getClass();
        b.a("cheat_import_worker", y72.KEEP, c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0066, code lost:
        if (r1 == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a4, code lost:
        if (defpackage.hv.S(r2, r1.a, false, true, new defpackage.y(10, r1, r11)) == r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a6, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Cheat cheat, s41 s41Var) {
        f16 f16Var;
        int i;
        Cheat cheat2;
        zm0 zm0Var;
        jg7 jg7Var;
        if (s41Var instanceof f16) {
            f16Var = (f16) s41Var;
            int i2 = f16Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f16Var.Z = i2 - Integer.MIN_VALUE;
                Object obj = f16Var.X;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = f16Var.Z;
                jg7 jg7Var2 = jg7.a;
                MelonDatabase melonDatabase = this.b;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj);
                            jg7Var = jg7Var2;
                            this.c.i();
                            return jg7Var;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cheat2 = f16Var.R;
                    oi2.Y(obj);
                } else {
                    oi2.Y(obj);
                    vm0 s = melonDatabase.s();
                    Long id = cheat.getId();
                    id.getClass();
                    long longValue = id.longValue();
                    cheat2 = cheat;
                    f16Var.R = cheat2;
                    f16Var.Z = 1;
                    obj = hv.S(f16Var, s.a, true, false, new t4(4, longValue));
                }
                zm0Var = (zm0) obj;
                if (zm0Var != null) {
                    return jg7Var2;
                }
                jg7Var = jg7Var2;
                zm0 zm0Var2 = new zm0(cheat2.getId(), zm0Var.b, zm0Var.c, cheat2.getName(), cheat2.getDescription(), cheat2.getCode(), cheat2.getEnabled());
                vm0 s2 = melonDatabase.s();
                f16Var.R = null;
                f16Var.Z = 2;
            }
        }
        f16Var = new f16(this, s41Var);
        Object obj2 = f16Var.X;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = f16Var.Z;
        jg7 jg7Var22 = jg7.a;
        MelonDatabase melonDatabase2 = this.b;
        if (i == 0) {
        }
        zm0Var = (zm0) obj2;
        if (zm0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(List list, s41 s41Var) {
        g16 g16Var;
        int i;
        if (s41Var instanceof g16) {
            g16Var = (g16) s41Var;
            int i2 = g16Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g16Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = g16Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = g16Var.Y;
                jg7 jg7Var = jg7.a;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Cheat cheat = (Cheat) it.next();
                        Long id = cheat.getId();
                        id.getClass();
                        arrayList.add(new io0(id.longValue(), cheat.getEnabled()));
                    }
                    vm0 s = this.b.s();
                    g16Var.Y = 1;
                    Object S = hv.S(g16Var, s.a, false, true, new rm0(s, arrayList, 1));
                    if (S != x61.COROUTINE_SUSPENDED) {
                        S = jg7Var;
                    }
                    if (S == x61Var) {
                        return x61Var;
                    }
                }
                this.c.i();
                return jg7Var;
            }
        }
        g16Var = new g16(this, s41Var);
        Object obj2 = g16Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = g16Var.Y;
        jg7 jg7Var2 = jg7.a;
        if (i == 0) {
        }
        this.c.i();
        return jg7Var2;
    }
}
