package defpackage;

import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: az7  reason: default package */
/* loaded from: classes.dex */
public abstract class az7 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = qs6.E0(qs6.D0(xk4.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(i03 i03Var, i03 i03Var2) {
        i03Var.getClass();
        i03Var2.getClass();
        if (nb3.k(i03Var.d, i03Var2.d) && i03Var.e == i03Var2.e && nb3.k(i03Var.a, i03Var2.a)) {
            return true;
        }
        return false;
    }

    public static final int b(long j) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            long millis = timeUnit.toMillis(j);
            if (millis <= 2147483647L) {
                if (millis == 0 && i > 0) {
                    i.f("timeout".concat(" too small"));
                    return 0;
                }
                return (int) millis;
            }
            i.f("timeout".concat(" too large"));
            return 0;
        }
        u34.f("timeout".concat(" < 0"));
        return 0;
    }

    public static final void c(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (nb3.k(e2.getMessage(), "bio == null")) {
                return;
            }
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final String d(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long e(wl5 wl5Var) {
        String a2 = wl5Var.Y.a("Content-Length");
        if (a2 == null) {
            return -1L;
        }
        byte[] bArr = yy7.a;
        try {
            return Long.parseLong(a2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset f(z80 z80Var, Charset charset) {
        z80Var.getClass();
        charset.getClass();
        int t = z80Var.t(yy7.b);
        if (t != -1) {
            if (t != 0) {
                if (t != 1) {
                    if (t != 2) {
                        if (t != 3) {
                            if (t == 4) {
                                Charset charset2 = qm0.a;
                                Charset charset3 = qm0.f;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32BE");
                                    forName.getClass();
                                    qm0.f = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        return qm0.c;
                    }
                    Charset charset4 = qm0.a;
                    Charset charset5 = qm0.e;
                    if (charset5 == null) {
                        Charset forName2 = Charset.forName("UTF-32LE");
                        forName2.getClass();
                        qm0.e = forName2;
                        return forName2;
                    }
                    return charset5;
                }
                return qm0.b;
            }
            return qm0.a;
        }
        return charset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [k80, java.lang.Object] */
    public static final boolean g(in6 in6Var, int i) {
        long j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (in6Var.b().e()) {
            j = in6Var.b().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        in6Var.b().d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (in6Var.b0(obj, 8192L) != -1) {
                obj.e();
            }
            if (j == Long.MAX_VALUE) {
                in6Var.b().a();
                return true;
            }
            in6Var.b().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                in6Var.b().a();
                return false;
            }
            in6Var.b().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                in6Var.b().a();
            } else {
                in6Var.b().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final yw2 h(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            uw2 uw2Var = (uw2) it.next();
            da0 da0Var = uw2Var.a;
            da0 da0Var2 = uw2Var.b;
            String s = da0Var.s();
            String s2 = da0Var2.s();
            arrayList.add(s);
            arrayList.add(qs6.T0(s2).toString());
        }
        return new yw2((String[]) arrayList.toArray(new String[0]));
    }

    public static final String i(i03 i03Var, boolean z) {
        int i;
        i03Var.getClass();
        int i2 = i03Var.e;
        String str = i03Var.d;
        if (qs6.j0(str, ":", false)) {
            str = i61.k(']', "[", str);
        }
        if (!z) {
            String str2 = i03Var.a;
            str2.getClass();
            if (str2.equals("http")) {
                i = 80;
            } else if (str2.equals("https")) {
                i = 443;
            } else {
                i = -1;
            }
            if (i2 == i) {
                return str;
            }
        }
        return str + ':' + i2;
    }

    public static final List j(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return yt1.A;
        }
        if (list.size() == 1) {
            List singletonList = Collections.singletonList(list.get(0));
            singletonList.getClass();
            return singletonList;
        }
        Object[] array = list.toArray();
        array.getClass();
        List asList = Arrays.asList(array);
        asList.getClass();
        List unmodifiableList = Collections.unmodifiableList(asList);
        unmodifiableList.getClass();
        return unmodifiableList;
    }

    public static final List k(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr.length == 1) {
                List singletonList = Collections.singletonList(objArr[0]);
                singletonList.getClass();
                return singletonList;
            }
            List unmodifiableList = Collections.unmodifiableList(fv.l0((Object[]) objArr.clone()));
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return yt1.A;
    }
}
