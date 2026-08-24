package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yl3  reason: default package */
/* loaded from: classes.dex */
public final class yl3 extends qo7 {
    public final wa3 b;
    public final ha3 c;
    public final ci0 d;
    public final kd6 e;
    public final UUID f;
    public fk3 g;
    public jf7 h;
    public final tp6 i;
    public final de5 j;
    public final tp6 k;
    public final de5 l;
    public final tp6 m;
    public final de5 n;
    public final tp6 o;
    public final de5 p;
    public final tp6 q;
    public final ex6 r;
    public final tp6 s;
    public final ex6 t;

    public yl3(wa3 wa3Var, ha3 ha3Var, ci0 ci0Var, kd6 kd6Var, v46 v46Var) {
        UUID uuid;
        wa3Var.getClass();
        ha3Var.getClass();
        kd6Var.getClass();
        v46Var.getClass();
        this.b = wa3Var;
        this.c = ha3Var;
        this.d = ci0Var;
        this.e = kd6Var;
        String str = (String) v46Var.a("layout_id");
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        this.f = uuid;
        tp6 a = up6.a(null);
        this.i = a;
        this.j = new de5(a);
        tp6 a2 = up6.a(null);
        this.k = a2;
        this.l = new de5(a2);
        tp6 a3 = up6.a(null);
        this.m = a3;
        this.n = new de5(a3);
        tp6 a4 = up6.a(null);
        this.o = a4;
        this.p = new de5(a4);
        this.q = up6.a(null);
        this.r = new ex6(new on2(this) { // from class: ol3
            public final /* synthetic */ yl3 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                yl3 yl3Var = this.B;
                switch (i) {
                    case 0:
                        hv.L(to7.a(yl3Var), null, null, new rl3(yl3Var, null, 4), 3);
                        return new de5(yl3Var.q);
                    default:
                        hv.L(to7.a(yl3Var), null, null, new rl3(yl3Var, null, 5), 3);
                        return new de5(yl3Var.s);
                }
            }
        });
        this.s = up6.a(null);
        this.t = new ex6(new on2(this) { // from class: ol3
            public final /* synthetic */ yl3 B;

            {
                this.B = this;
            }

            @Override // defpackage.on2
            public final Object c() {
                int i = r2;
                yl3 yl3Var = this.B;
                switch (i) {
                    case 0:
                        hv.L(to7.a(yl3Var), null, null, new rl3(yl3Var, null, 4), 3);
                        return new de5(yl3Var.q);
                    default:
                        hv.L(to7.a(yl3Var), null, null, new rl3(yl3Var, null, 5), 3);
                        return new de5(yl3Var.s);
                }
            }
        });
        Boolean bool = (Boolean) v46Var.a("is_external");
        if (uuid != null && !uuid.equals(fk3.h)) {
            hv.L(to7.a(this), null, null, new pl3(this, uuid, null, 0), 3);
        } else {
            hv.L(to7.a(this), null, null, new pl3(this, uuid, null, 1), 3);
        }
        hv.L(to7.a(this), null, null, new rl3(this, null, 0), 3);
        hv.L(to7.a(this), null, null, new rl3(this, null, 1), 3);
        hv.L(to7.a(this), null, null, new rl3(this, null, 2), 3);
        hv.L(to7.a(this), null, null, new rl3(this, null, 3), 3);
    }

    public static final void e(yl3 yl3Var, UUID uuid, BackgroundMode backgroundMode) {
        if (uuid == null) {
            tp6 tp6Var = yl3Var.k;
            t26 t26Var = new t26(null, backgroundMode);
            tp6Var.getClass();
            tp6Var.m(null, t26Var);
            return;
        }
        hv.L(to7.a(yl3Var), null, null, new ul3(yl3Var, uuid, backgroundMode, null, 0), 3);
    }

    public static final void f(yl3 yl3Var, UUID uuid, BackgroundMode backgroundMode) {
        if (uuid == null) {
            tp6 tp6Var = yl3Var.m;
            t26 t26Var = new t26(null, backgroundMode);
            tp6Var.getClass();
            tp6Var.m(null, t26Var);
            return;
        }
        hv.L(to7.a(yl3Var), null, null, new ul3(yl3Var, uuid, backgroundMode, null, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(UUID uuid, s41 s41Var) {
        tl3 tl3Var;
        int i;
        n00 n00Var;
        if (s41Var instanceof tl3) {
            tl3Var = (tl3) s41Var;
            int i2 = tl3Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tl3Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = tl3Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = tl3Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    tl3Var.Y = 1;
                    obj = this.c.c(uuid, tl3Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                n00Var = (n00) obj;
                if (n00Var != null) {
                    return null;
                }
                return n00Var.b;
            }
        }
        tl3Var = new tl3(this, s41Var);
        Object obj2 = tl3Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = tl3Var.Y;
        if (i == 0) {
        }
        n00Var = (n00) obj2;
        if (n00Var != null) {
        }
    }

    public final void h(ArrayList arrayList, ArrayList arrayList2) {
        jf7 jf7Var;
        tp6 tp6Var;
        Object value;
        fk3 fk3Var;
        ff7 ff7Var;
        if (arrayList != null || arrayList2 != null) {
            if ((arrayList == null || !arrayList.isEmpty() || arrayList2 != null) && (jf7Var = this.h) != null) {
                do {
                    tp6Var = this.i;
                    value = tp6Var.getValue();
                    fk3 fk3Var2 = (fk3) value;
                    fk3Var = null;
                    if (fk3Var2 != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap(fk3Var2.g);
                        ff7 ff7Var2 = (ff7) linkedHashMap.get(jf7Var);
                        if (ff7Var2 != null) {
                            z66 z66Var = ff7Var2.a;
                            if (arrayList != null) {
                                z66Var = z66.a(z66Var, null, null, arrayList, 3);
                            }
                            z66 z66Var2 = ff7Var2.b;
                            if (arrayList2 != null) {
                                z66Var2 = z66.a(z66Var2, null, null, arrayList2, 3);
                            }
                            ff7Var = ff7.a(z66Var, z66Var2);
                        } else {
                            ff7Var = new ff7(new z66(arrayList), new z66(arrayList2));
                        }
                        linkedHashMap.put(jf7Var, ff7Var);
                        fk3Var = fk3.a(fk3Var2, null, null, null, null, false, 0, linkedHashMap, 63);
                    }
                } while (!tp6Var.j(value, fk3Var));
            }
        }
    }

    public final void i(sn3 sn3Var, UUID uuid) {
        tp6 tp6Var;
        Object value;
        lj3 lj3Var;
        tp6 tp6Var2;
        Object value2;
        lj3 lj3Var2;
        sn3Var.getClass();
        int i = sl3.a[sn3Var.ordinal()];
        if (i != 1) {
            if (i == 2) {
                do {
                    tp6Var2 = this.s;
                    value2 = tp6Var2.getValue();
                    lj3 lj3Var3 = (lj3) value2;
                    if (lj3Var3 != null) {
                        lj3Var2 = lj3.a(lj3Var3, uuid, null, 2);
                    } else {
                        lj3Var2 = null;
                    }
                } while (!tp6Var2.j(value2, lj3Var2));
                return;
            }
            i.d();
            return;
        }
        do {
            tp6Var = this.q;
            value = tp6Var.getValue();
            lj3 lj3Var4 = (lj3) value;
            if (lj3Var4 != null) {
                lj3Var = lj3.a(lj3Var4, uuid, null, 2);
            } else {
                lj3Var = null;
            }
        } while (!tp6Var.j(value, lj3Var));
    }

    public final void j(String str) {
        String str2;
        fk3 fk3Var;
        str.getClass();
        while (true) {
            tp6 tp6Var = this.i;
            Object value = tp6Var.getValue();
            fk3 fk3Var2 = (fk3) value;
            if (fk3Var2 != null) {
                str2 = str;
                fk3Var = fk3.a(fk3Var2, null, str2, null, null, false, 0, null, 125);
            } else {
                str2 = str;
                fk3Var = null;
            }
            if (tp6Var.j(value, fk3Var)) {
                return;
            }
            str = str2;
        }
    }
}
