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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fe7  reason: default package */
/* loaded from: classes.dex */
public abstract class fe7 {
    public static final kh4 A;
    public static final ud7 B;
    public static final ud7 C;
    public static final w52 D;
    public static final ud7 a = new ud7(0, new kd7().a(), Class.class);
    public static final ud7 b = new ud7(0, new td7().a(), BitSet.class);
    public static final yd7 c;
    public static final vd7 d;
    public static final vd7 e;
    public static final vd7 f;
    public static final vd7 g;
    public static final ud7 h;
    public static final ud7 i;
    public static final ud7 j;
    public static final dd7 k;
    public static final ed7 l;
    public static final de7 m;
    public static final de7 n;
    public static final vd7 o;
    public static final ud7 p;
    public static final ud7 q;
    public static final ud7 r;
    public static final ud7 s;
    public static final ud7 t;
    public static final ud7 u;
    public static final ud7 v;
    public static final ud7 w;
    public static final ud7 x;
    public static final ud7 y;
    public static final ud7 z;

    static {
        xd7 xd7Var = new xd7();
        c = new yd7();
        d = new vd7(Boolean.TYPE, Boolean.class, xd7Var);
        e = new vd7(Byte.TYPE, Byte.class, new zd7());
        f = new vd7(Short.TYPE, Short.class, new ae7());
        g = new vd7(Integer.TYPE, Integer.class, new be7());
        h = new ud7(0, new ce7().a(), AtomicInteger.class);
        i = new ud7(0, new ad7().a(), AtomicBoolean.class);
        j = new ud7(0, new bd7().a(), AtomicIntegerArray.class);
        k = new dd7();
        l = new ed7();
        new de7(false, 1);
        m = new de7(true, 1);
        new de7(false, 0);
        n = new de7(true, 0);
        o = new vd7(Character.TYPE, Character.class, new fd7());
        gd7 gd7Var = new gd7();
        p = new ud7(0, new hd7(), BigDecimal.class);
        q = new ud7(0, new id7(), BigInteger.class);
        r = new ud7(0, new jd7(), fo3.class);
        s = new ud7(0, gd7Var, String.class);
        t = new ud7(0, new ld7(), StringBuilder.class);
        u = new ud7(0, new md7(), StringBuffer.class);
        v = new ud7(0, new nd7(), URL.class);
        w = new ud7(0, new od7(), URI.class);
        x = new ud7(1, new pd7(), InetAddress.class);
        y = new ud7(0, new qd7(), UUID.class);
        z = new ud7(0, new rd7().a(), Currency.class);
        A = new kh4(new ic3(new String[]{"year", "month", "dayOfMonth", "hourOfDay", "minute", "second"}, 8), 2);
        B = new ud7(0, new sd7(), Locale.class);
        C = new ud7(1, ke3.a, ee3.class);
        D = x52.d;
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
        i.h(lb1.h(j2, "Too big for an int: "));
        return 0;
    }
}
