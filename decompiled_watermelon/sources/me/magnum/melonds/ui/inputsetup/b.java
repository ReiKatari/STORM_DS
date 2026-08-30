package me.magnum.melonds.ui.inputsetup;

import android.util.Log;
import defpackage.n11;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class b extends ra7 {
    public final w16 b;
    public final vp5 c;
    public rg5 d;
    public final ee6 e;
    public final q45 f;
    public final ee6 g;
    public final q45 h;
    public final ee6 i;
    public final q45 j;
    public final ee6 k;
    public final q45 l;
    public final c46 m;
    public final o45 n;
    public boolean o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a X = new a("X", 0);
        public static final a Y = new a("Y", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{X, Y};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(w16 w16Var, vp5 vp5Var, pt5 pt5Var) {
        rg5 rg5Var;
        ti5 ti5Var;
        w16Var.getClass();
        vp5Var.getClass();
        pt5Var.getClass();
        this.b = w16Var;
        this.c = vp5Var;
        bp5 bp5Var = (bp5) pt5Var.a("rom");
        if (bp5Var != null) {
            rg5Var = bp5Var.A;
        } else {
            rg5Var = null;
        }
        this.d = rg5Var;
        m11 m11Var = (rg5Var == null || (ti5Var = rg5Var.f) == null || (m11Var = ti5Var.h) == null) ? (m11) ((ee6) ((b56) w16Var).g.getValue()).getValue() : m11Var;
        ee6 a2 = fe6.a(m11Var.a().b);
        this.e = a2;
        this.f = new q45(a2);
        ee6 a3 = fe6.a(m11Var.a);
        this.g = a3;
        this.h = new q45(a3);
        ee6 a4 = fe6.a(null);
        this.i = a4;
        this.j = new q45(a4);
        ee6 a5 = fe6.a(null);
        this.k = a5;
        this.l = new q45(a5);
        c46 f = ln2.f();
        this.m = f;
        this.n = new o45(f);
        rg5 rg5Var2 = this.d;
        if (rg5Var2 != null) {
            tq5.w(ua7.a(this), null, null, new ba1(this, rg5Var2, null, 18), 3);
        }
    }

    public final void e(yz2 yz2Var) {
        ee6 ee6Var = this.e;
        Iterator it = ((List) ee6Var.getValue()).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((f03) it.next()).a == yz2Var) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        f03 f03Var = (f03) tq0.N0(i + 1, (List) ee6Var.getValue());
        if (f03Var != null) {
            this.m.p(f03Var.a);
        }
    }

    public final void f(List list, u86 u86Var) {
        m11 m11Var = new m11(list, u86Var);
        this.o = true;
        rg5 rg5Var = this.d;
        if (rg5Var != null) {
            ti5 a2 = ti5.a(rg5Var.f, null, null, null, null, null, false, ym5.CUSTOM, m11Var, null, null, null, null, null, null, null, 32575);
            ((d72) this.c).y(rg5Var, a2);
            this.d = rg5.a(rg5Var, null, null, a2, null, false, null, 0L, false, 8159);
            return;
        }
        b56 b56Var = (b56) this.b;
        b56Var.getClass();
        ee6 ee6Var = (ee6) b56Var.g.getValue();
        ee6Var.getClass();
        ee6Var.l(null, m11Var);
        try {
            File file = new File(b56Var.a.getFilesDir(), "controller_config.json");
            n11.b bVar = n11.Companion;
            bVar.getClass();
            n11 a3 = n11.b.a(m11Var);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            t63 t63Var = b56Var.c;
            m93 serializer = bVar.serializer();
            serializer.getClass();
            oi oiVar = new oi(fileOutputStream);
            byte[] bArr = (byte[]) oiVar.R;
            try {
                ep2.p(t63Var, oiVar, serializer, a3);
                fileOutputStream.close();
            } finally {
                oiVar.b();
                ak0 ak0Var = ak0.c;
                char[] cArr = (char[]) oiVar.X;
                ak0Var.getClass();
                cArr.getClass();
                ak0Var.b(cArr);
                o70 o70Var = o70.c;
                o70Var.getClass();
                bArr.getClass();
                o70Var.a(bArr);
            }
        } catch (Exception e) {
            Log.w("SPSettingsRepository", "Failed to save controller configuration", e);
        }
        b56Var.e.i();
    }

    public final void g(yz2 yz2Var, e03 e03Var) {
        Object value;
        ArrayList p1;
        ee6 ee6Var = this.e;
        Iterator it = ((List) ee6Var.getValue()).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((f03) it.next()).a == yz2Var) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            do {
                value = ee6Var.getValue();
                p1 = tq0.p1((List) value);
                f03 f03Var = (f03) p1.get(i);
                e03 e03Var2 = f03Var.b;
                e03 e03Var3 = f03Var.c;
                d03 d03Var = d03.a;
                if (e03Var.equals(d03Var)) {
                    e03Var2 = d03Var;
                    e03Var3 = e03Var2;
                } else if (e03Var instanceof c03) {
                    if (!b53.x(e03Var2, d03Var) && !b53.x(e03Var2, e03Var)) {
                        if (!b53.x(e03Var3, d03Var)) {
                            b53.x(e03Var3, e03Var);
                        }
                        e03Var3 = e03Var;
                    }
                    e03Var2 = e03Var;
                } else if (e03Var instanceof b03) {
                    if (!b53.x(e03Var2, d03Var) && !b53.x(e03Var2, e03Var)) {
                        if (!b53.x(e03Var3, d03Var)) {
                            b53.x(e03Var3, e03Var);
                        }
                        e03Var3 = e03Var;
                    }
                    e03Var2 = e03Var;
                } else {
                    i.c();
                    return;
                }
                p1.set(i, f03.a(f03Var, e03Var2, e03Var3, 1));
                f(p1, (u86) this.g.getValue());
            } while (!ee6Var.j(value, p1));
            this.i.k(null);
        }
        this.i.k(null);
    }

    public final void h(u86 u86Var) {
        ee6 ee6Var = this.g;
        ee6Var.getClass();
        ee6Var.l(null, u86Var);
        f((List) this.e.getValue(), u86Var);
    }
}
