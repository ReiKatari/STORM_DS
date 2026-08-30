package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;
import java.util.Currency;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k07  reason: default package */
/* loaded from: classes.dex */
public abstract class k07 {
    public static final s84 A;
    public static final zz6 B;
    public static final zz6 C;
    public static final h12 D;
    public static final zz6 a = new zz6(0, new pz6().a(), Class.class);
    public static final zz6 b = new zz6(0, new yz6().a(), BitSet.class);
    public static final d07 c;
    public static final a07 d;
    public static final a07 e;
    public static final a07 f;
    public static final a07 g;
    public static final zz6 h;
    public static final zz6 i;
    public static final zz6 j;
    public static final iz6 k;
    public static final jz6 l;
    public static final i07 m;
    public static final i07 n;
    public static final a07 o;
    public static final zz6 p;
    public static final zz6 q;
    public static final zz6 r;
    public static final zz6 s;
    public static final zz6 t;
    public static final zz6 u;
    public static final zz6 v;
    public static final zz6 w;
    public static final zz6 x;
    public static final zz6 y;
    public static final zz6 z;

    static {
        c07 c07Var = new c07();
        c = new d07();
        d = new a07(Boolean.TYPE, Boolean.class, c07Var);
        e = new a07(Byte.TYPE, Byte.class, new e07());
        f = new a07(Short.TYPE, Short.class, new f07());
        g = new a07(Integer.TYPE, Integer.class, new g07());
        h = new zz6(0, new h07().a(), AtomicInteger.class);
        i = new zz6(0, new fz6().a(), AtomicBoolean.class);
        j = new zz6(0, new gz6().a(), AtomicIntegerArray.class);
        k = new iz6();
        l = new jz6();
        new i07(1, false);
        m = new i07(1, true);
        new i07(0, false);
        n = new i07(0, true);
        o = new a07(Character.TYPE, Character.class, new kz6());
        lz6 lz6Var = new lz6();
        p = new zz6(0, new mz6(), BigDecimal.class);
        q = new zz6(0, new nz6(), BigInteger.class);
        r = new zz6(0, new oz6(), fh3.class);
        s = new zz6(0, lz6Var, String.class);
        t = new zz6(0, new qz6(), StringBuilder.class);
        u = new zz6(0, new rz6(), StringBuffer.class);
        v = new zz6(0, new sz6(), URL.class);
        w = new zz6(0, new tz6(), URI.class);
        x = new zz6(1, new uz6(), InetAddress.class);
        y = new zz6(0, new vz6(), UUID.class);
        z = new zz6(0, new wz6().a(), Currency.class);
        A = new s84(2, new u53(new String[]{"year", "month", "dayOfMonth", "hourOfDay", "minute", "second"}, 8));
        B = new zz6(0, new xz6(), Locale.class);
        C = new zz6(1, r73.a, l73.class);
        D = i12.d;
    }

    public static void a(double d2) {
        if (!Double.isNaN(d2) && !Double.isInfinite(d2)) {
            return;
        }
        throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    public static int b(long j2) {
        int i2 = (int) j2;
        if (i2 == j2) {
            return i2;
        }
        i.i(wh1.h(j2, "Too big for an int: "));
        return 0;
    }
}
