package qi;

import fj.g0;
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
import nc.k;
import pi.d0;
import pi.q;
import pi.r;
import pi.x;
import vc.h;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final TimeZone f12552a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f12553b;

    static {
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        timeZone.getClass();
        f12552a = timeZone;
        f12553b = h.r0(h.q0(x.class.getName(), "okhttp3."), "Client");
    }

    public static final boolean a(r rVar, r rVar2) {
        rVar.getClass();
        rVar2.getClass();
        if (k.a(rVar.f11784d, rVar2.f11784d) && rVar.f11785e == rVar2.f11785e && k.a(rVar.f11781a, rVar2.f11781a)) {
            return true;
        }
        return false;
    }

    public static final void b(Socket socket) {
        socket.getClass();
        try {
            socket.close();
        } catch (AssertionError e6) {
            throw e6;
        } catch (RuntimeException e10) {
            if (k.a(e10.getMessage(), "bio == null")) {
                return;
            }
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String c(String str, Object... objArr) {
        Locale locale = Locale.US;
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        return String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
    }

    public static final long d(d0 d0Var) {
        String a10 = d0Var.Y.a("Content-Length");
        if (a10 == null) {
            return -1L;
        }
        byte[] bArr = e.f12548a;
        try {
            return Long.parseLong(a10);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public static final Charset e(fj.g gVar, Charset charset) {
        gVar.getClass();
        charset.getClass();
        int V = gVar.V(e.f12549b);
        if (V != -1) {
            if (V != 0) {
                if (V != 1) {
                    if (V != 2) {
                        if (V != 3) {
                            if (V == 4) {
                                Charset charset2 = vc.a.f13781a;
                                Charset charset3 = vc.a.f13785e;
                                if (charset3 == null) {
                                    Charset forName = Charset.forName("UTF-32BE");
                                    forName.getClass();
                                    vc.a.f13785e = forName;
                                    return forName;
                                }
                                return charset3;
                            }
                            throw new AssertionError();
                        }
                        return vc.a.f13783c;
                    }
                    Charset charset4 = vc.a.f13781a;
                    Charset charset5 = vc.a.f13784d;
                    if (charset5 == null) {
                        Charset forName2 = Charset.forName("UTF-32LE");
                        forName2.getClass();
                        vc.a.f13784d = forName2;
                        return forName2;
                    }
                    return charset5;
                }
                return vc.a.f13782b;
            }
            return vc.a.f13781a;
        }
        return charset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [fj.e, java.lang.Object] */
    public static final boolean f(g0 g0Var, int i2) {
        long j2;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        long nanoTime = System.nanoTime();
        if (g0Var.f().e()) {
            j2 = g0Var.f().c() - nanoTime;
        } else {
            j2 = Long.MAX_VALUE;
        }
        g0Var.f().d(Math.min(j2, timeUnit.toNanos(i2)) + nanoTime);
        try {
            ?? obj = new Object();
            while (g0Var.k(obj, 8192L) != -1) {
                obj.t();
            }
            if (j2 == Long.MAX_VALUE) {
                g0Var.f().a();
                return true;
            }
            g0Var.f().d(nanoTime + j2);
            return true;
        } catch (InterruptedIOException unused) {
            if (j2 == Long.MAX_VALUE) {
                g0Var.f().a();
                return false;
            }
            g0Var.f().d(nanoTime + j2);
            return false;
        } catch (Throwable th2) {
            if (j2 == Long.MAX_VALUE) {
                g0Var.f().a();
            } else {
                g0Var.f().d(nanoTime + j2);
            }
            throw th2;
        }
    }

    public static final q g(List list) {
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wi.e eVar = (wi.e) it.next();
            fj.h hVar = eVar.f14233a;
            fj.h hVar2 = eVar.f14234b;
            String r5 = hVar.r();
            String r10 = hVar2.r();
            arrayList.add(r5);
            arrayList.add(h.C0(r10).toString());
        }
        return new q((String[]) arrayList.toArray(new String[0]));
    }

    public static final String h(r rVar, boolean z10) {
        int i2;
        rVar.getClass();
        int i10 = rVar.f11785e;
        String str = rVar.f11784d;
        if (h.Y(str, ":", false)) {
            str = kc.a.c(']', "[", str);
        }
        if (!z10) {
            String str2 = rVar.f11781a;
            str2.getClass();
            if (str2.equals("http")) {
                i2 = 80;
            } else if (str2.equals("https")) {
                i2 = 443;
            } else {
                i2 = -1;
            }
            if (i10 == i2) {
                return str;
            }
        }
        return str + ':' + i10;
    }

    public static final List i(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return zb.q.A;
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
            Object[] objArr2 = (Object[]) objArr.clone();
            objArr2.getClass();
            List asList = Arrays.asList(objArr2);
            asList.getClass();
            List unmodifiableList = Collections.unmodifiableList(asList);
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        return zb.q.A;
    }
}
