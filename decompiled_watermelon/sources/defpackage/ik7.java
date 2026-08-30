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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ik7  reason: default package */
/* loaded from: classes.dex */
public abstract class ik7 {
    public static final TimeZone a;
    public static final String b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        a = timeZone;
        b = zg6.K0(zg6.J0(zb4.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(hu2 hu2Var, hu2 hu2Var2) {
        hu2Var.getClass();
        hu2Var2.getClass();
        if (b53.x(hu2Var.d, hu2Var2.d) && hu2Var.e == hu2Var2.e && b53.x(hu2Var.a, hu2Var2.a)) {
            return true;
        }
        return false;
    }

    public static final void b(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e) {
            throw e;
        } catch (RuntimeException e2) {
            if (b53.x(e2.getMessage(), "bio == null")) {
                return;
            }
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final String c(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long d(ec5 ec5Var) {
        String b2 = ec5Var.Y.b("Content-Length");
        if (b2 == null) {
            return -1L;
        }
        byte[] bArr = gk7.a;
        try {
            return Long.parseLong(b2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset e(u60 u60Var, Charset charset) {
        u60Var.getClass();
        charset.getClass();
        int H = u60Var.H(gk7.b);
        if (H != -1) {
            if (H != 0) {
                if (H != 1) {
                    if (H != 2) {
                        if (H != 3) {
                            if (H == 4) {
                                Charset charset2 = hk0.a;
                                Charset charset3 = hk0.e;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32BE");
                                    forName.getClass();
                                    hk0.e = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        return hk0.c;
                    }
                    Charset charset4 = hk0.a;
                    Charset charset5 = hk0.d;
                    if (charset5 == null) {
                        Charset forName2 = Charset.forName("UTF-32LE");
                        forName2.getClass();
                        hk0.d = forName2;
                        return forName2;
                    }
                    return charset5;
                }
                return hk0.b;
            }
            return hk0.a;
        }
        return charset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [f60, java.lang.Object] */
    public static final boolean f(sb6 sb6Var, int i) {
        long j;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (sb6Var.f().e()) {
            j = sb6Var.f().c() - nanoTime;
        } else {
            j = Long.MAX_VALUE;
        }
        sb6Var.f().d(Math.min(j, timeUnit.toNanos(i)) + nanoTime);
        try {
            ?? obj = new Object();
            while (sb6Var.L(obj, 8192L) != -1) {
                obj.w();
            }
            if (j == Long.MAX_VALUE) {
                sb6Var.f().a();
                return true;
            }
            sb6Var.f().d(nanoTime + j);
            return true;
        } catch (InterruptedIOException unused) {
            if (j == Long.MAX_VALUE) {
                sb6Var.f().a();
                return false;
            }
            sb6Var.f().d(nanoTime + j);
            return false;
        } catch (Throwable th) {
            if (j == Long.MAX_VALUE) {
                sb6Var.f().a();
            } else {
                sb6Var.f().d(nanoTime + j);
            }
            throw th;
        }
    }

    public static final xq2 g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tq2 tq2Var = (tq2) it.next();
            w70 w70Var = tq2Var.a;
            w70 w70Var2 = tq2Var.b;
            String r = w70Var.r();
            String r2 = w70Var2.r();
            arrayList.add(r);
            arrayList.add(zg6.Z0(r2).toString());
        }
        return new xq2((String[]) arrayList.toArray(new String[0]));
    }

    public static final String h(hu2 hu2Var, boolean z) {
        int i;
        hu2Var.getClass();
        int i2 = hu2Var.e;
        String str = hu2Var.d;
        if (zg6.q0(str, ":", false)) {
            str = b31.n(']', "[", str);
        }
        if (!z) {
            String str2 = hu2Var.a;
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

    public static final List i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return pp1.A;
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

    public static final List j(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr.length == 1) {
                List singletonList = Collections.singletonList(objArr[0]);
                singletonList.getClass();
                return singletonList;
            }
            List unmodifiableList = Collections.unmodifiableList(nu.X((Object[]) objArr.clone()));
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return pp1.A;
    }
}
