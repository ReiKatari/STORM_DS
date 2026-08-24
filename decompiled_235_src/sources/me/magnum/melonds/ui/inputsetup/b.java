package me.magnum.melonds.ui.inputsetup;

import android.util.Log;
import defpackage.v41;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class b extends qo7 {
    public final kd6 b;
    public final p06 c;
    public pq5 d;
    public final tp6 e;
    public final de5 f;
    public final tp6 g;
    public final de5 h;
    public final tp6 i;
    public final de5 j;
    public final tp6 k;
    public final de5 l;
    public final of6 m;
    public final be5 n;
    public boolean o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a X = new a("X", 0);
        public static final a Y = new a("Y", 1);

        private static final /* synthetic */ a[] $values() {
            return new a[]{X, Y};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public b(kd6 kd6Var, p06 p06Var, v46 v46Var) {
        pq5 pq5Var;
        jt5 jt5Var;
        kd6Var.getClass();
        p06Var.getClass();
        v46Var.getClass();
        this.b = kd6Var;
        this.c = p06Var;
        wz5 wz5Var = (wz5) v46Var.a("rom");
        if (wz5Var != null) {
            pq5Var = wz5Var.A;
        } else {
            pq5Var = null;
        }
        this.d = pq5Var;
        u41 u41Var = (pq5Var == null || (jt5Var = pq5Var.f) == null || (u41Var = jt5Var.h) == null) ? (u41) ((tp6) ((ng6) kd6Var).g.getValue()).getValue() : u41Var;
        tp6 a2 = up6.a(u41Var.a().b);
        this.e = a2;
        this.f = new de5(a2);
        tp6 a3 = up6.a(u41Var.a);
        this.g = a3;
        this.h = new de5(a3);
        tp6 a4 = up6.a(null);
        this.i = a4;
        this.j = new de5(a4);
        tp6 a5 = up6.a(null);
        this.k = a5;
        this.l = new de5(a5);
        of6 a6 = bl2.a();
        this.m = a6;
        this.n = new be5(a6);
        pq5 pq5Var2 = this.d;
        if (pq5Var2 != null) {
            hv.L(to7.a(this), null, null, new xd1(this, pq5Var2, null, 20), 3);
        }
    }

    public final void e(b63 b63Var) {
        tp6 tp6Var = this.e;
        Iterator it = ((List) tp6Var.getValue()).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((i63) it.next()).a == b63Var) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        i63 i63Var = (i63) gt0.K0(i + 1, (List) tp6Var.getValue());
        if (i63Var != null) {
            this.m.k(i63Var.a);
        }
    }

    public final void f(List list, kk6 kk6Var) {
        u41 u41Var = new u41(list, kk6Var);
        this.o = true;
        pq5 pq5Var = this.d;
        if (pq5Var != null) {
            jt5 a2 = jt5.a(pq5Var.f, null, null, null, null, null, false, nx5.CUSTOM, u41Var, null, null, null, null, null, null, null, null, null, null, 261951);
            ((xb2) this.c).B(pq5Var, a2);
            this.d = pq5.a(pq5Var, null, null, a2, null, false, null, 0L, false, null, 8159);
            return;
        }
        ng6 ng6Var = (ng6) this.b;
        ng6Var.getClass();
        tp6 tp6Var = (tp6) ng6Var.g.getValue();
        tp6Var.getClass();
        tp6Var.m(null, u41Var);
        try {
            File file = new File(ng6Var.a.getFilesDir(), "controller_config.json");
            v41.b bVar = v41.Companion;
            bVar.getClass();
            v41 a3 = v41.b.a(u41Var);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            id3 id3Var = ng6Var.c;
            gg3 serializer = bVar.serializer();
            serializer.getClass();
            aj ajVar = new aj(fileOutputStream);
            byte[] bArr = (byte[]) ajVar.R;
            oi2.v(id3Var, ajVar, serializer, a3);
            ajVar.b();
            jm0 jm0Var = jm0.c;
            char[] cArr = (char[]) ajVar.X;
            jm0Var.getClass();
            cArr.getClass();
            jm0Var.b(cArr);
            v90 v90Var = v90.c;
            v90Var.getClass();
            bArr.getClass();
            v90Var.a(bArr);
            fileOutputStream.close();
        } catch (Exception e) {
            Log.w("SPSettingsRepository", "Failed to save controller configuration", e);
        }
        ng6Var.e.i();
    }

    public final void g(b63 b63Var, h63 h63Var) {
        Object value;
        ArrayList m1;
        tp6 tp6Var = this.e;
        Iterator it = ((List) tp6Var.getValue()).iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (((i63) it.next()).a == b63Var) {
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
                value = tp6Var.getValue();
                m1 = gt0.m1((List) value);
                i63 i63Var = (i63) m1.get(i);
                h63 h63Var2 = i63Var.b;
                h63 h63Var3 = i63Var.c;
                g63 g63Var = g63.a;
                if (h63Var.equals(g63Var)) {
                    h63Var2 = g63Var;
                    h63Var3 = h63Var2;
                } else if (h63Var instanceof f63) {
                    if (!nb3.k(h63Var2, g63Var) && !nb3.k(h63Var2, h63Var)) {
                        if (!nb3.k(h63Var3, g63Var)) {
                            nb3.k(h63Var3, h63Var);
                        }
                        h63Var3 = h63Var;
                    }
                    h63Var2 = h63Var;
                } else if (h63Var instanceof e63) {
                    if (!nb3.k(h63Var2, g63Var) && !nb3.k(h63Var2, h63Var)) {
                        if (!nb3.k(h63Var3, g63Var)) {
                            nb3.k(h63Var3, h63Var);
                        }
                        h63Var3 = h63Var;
                    }
                    h63Var2 = h63Var;
                } else {
                    i.d();
                    return;
                }
                m1.set(i, i63.a(i63Var, h63Var2, h63Var3, 1));
                f(m1, (kk6) this.g.getValue());
            } while (!tp6Var.j(value, m1));
            this.i.l(null);
        }
        this.i.l(null);
    }

    public final void h(kk6 kk6Var) {
        tp6 tp6Var = this.g;
        tp6Var.getClass();
        tp6Var.m(null, kk6Var);
        f((List) this.e.getValue(), kk6Var);
    }
}
