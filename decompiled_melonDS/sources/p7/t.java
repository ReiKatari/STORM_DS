package p7;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import c8.c0;
import j0.o1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import l4.q0;
import pi.d0;
import pi.z;
import q.n3;
import q.p3;
import q4.x;
import w.x0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11448a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f11449b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f11450c = 0;

    public static ArrayList A(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new zb.i(objArr, true));
    }

    public static final List B(List list) {
        int size = list.size();
        if (size != 0) {
            if (size != 1) {
                return list;
            }
            return x(list.get(0));
        }
        return zb.q.A;
    }

    public static final long C(long j2, float f8) {
        long floatToRawIntBits = j2 | (Float.floatToRawIntBits(f8) & 4294967295L);
        x4.p[] pVarArr = x4.o.f14348b;
        return floatToRawIntBits;
    }

    public static c0 D(String str) {
        z zVar;
        int i2;
        String str2;
        if (vc.o.V(str, "HTTP/1.", false)) {
            i2 = 9;
            if (str.length() >= 9 && str.charAt(8) == ' ') {
                int charAt = str.charAt(7) - '0';
                if (charAt != 0) {
                    if (charAt == 1) {
                        zVar = z.HTTP_1_1;
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    zVar = z.HTTP_1_0;
                }
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else if (vc.o.V(str, "ICY ", false)) {
            zVar = z.HTTP_1_0;
            i2 = 4;
        } else if (vc.o.V(str, "SOURCETABLE ", false)) {
            zVar = z.HTTP_1_1;
            i2 = 12;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i10 = i2 + 3;
        if (str.length() >= i10) {
            Integer W = vc.o.W(str.substring(i2, i10));
            if (W != null) {
                int intValue = W.intValue();
                if (str.length() > i10) {
                    if (str.charAt(i10) == ' ') {
                        str2 = str.substring(i2 + 4);
                    } else {
                        throw new ProtocolException("Unexpected status line: ".concat(str));
                    }
                } else {
                    str2 = "";
                }
                return new c0(zVar, intValue, str2);
            }
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        throw new ProtocolException("Unexpected status line: ".concat(str));
    }

    public static void E(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            n3.a(view, charSequence);
            return;
        }
        p3 p3Var = p3.f11987e0;
        if (p3Var != null && p3Var.A == view) {
            p3.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            p3 p3Var2 = p3.f11988f0;
            if (p3Var2 != null && p3Var2.A == view) {
                p3Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new p3(view, charSequence);
    }

    public static void F() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static void a(Throwable th2, Throwable th3) {
        boolean z10;
        th2.getClass();
        th3.getClass();
        if (th2 != th3) {
            Integer num = hc.a.f6443a;
            if (num != null && num.intValue() < 19) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                th2.addSuppressed(th3);
                return;
            }
            Method method = gc.a.f5636a;
            if (method != null) {
                method.invoke(th2, th3);
            }
        }
    }

    public static ArrayList b(Object... objArr) {
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new zb.i(objArr, true));
    }

    public static int c(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        arrayList.getClass();
        int size2 = arrayList.size();
        if (size >= 0) {
            if (size > size2) {
                m9.o.c(size, size2, ") is greater than size (", "toIndex (");
            }
        } else {
            a0.j.h(w.d.m("fromIndex (0) is greater than toIndex (", size, ")."));
        }
        int i2 = size - 1;
        int i10 = 0;
        while (i10 <= i2) {
            int i11 = (i10 + i2) >>> 1;
            int M = d0.d.M((Comparable) arrayList.get(i11), comparable);
            if (M < 0) {
                i10 = i11 + 1;
            } else if (M > 0) {
                i2 = i11 - 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public static ac.b d(List list) {
        list.getClass();
        ac.b bVar = (ac.b) list;
        bVar.f();
        bVar.L = true;
        if (bVar.B > 0) {
            return bVar;
        }
        return ac.b.R;
    }

    public static final void e(o1 o1Var, String str, String str2) {
        o1Var.getClass();
        str.getClass();
        str2.getClass();
        ArrayList arrayList = o1Var.f7269a;
        arrayList.add(str);
        arrayList.add(vc.h.C0(str2).toString());
    }

    public static Handler f(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a6.k.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e6) {
            e = e6;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e12) {
            Throwable cause = e12.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static ac.b g() {
        return new ac.b(10);
    }

    public static final boolean h(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    int i12 = i11 + 1;
                    if (i11 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt != '(') {
                        if (charAt == ')' && i10 - 1 == 0 && i11 != str.length() - 1) {
                            break;
                        }
                    } else {
                        i10++;
                    }
                    i2++;
                    i11 = i12;
                } else if (i10 == 0) {
                    return nc.k.a(vc.h.C0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final String i(Collection collection) {
        collection.getClass();
        if (!collection.isEmpty()) {
            return vc.i.I(zb.l.Y(collection, ",\n", "\n", "\n", null, 56)).concat("},");
        }
        return " }";
    }

    /* JADX WARN: Code restructure failed: missing block: B:301:0x051a, code lost:
        if ("gta8wifi".equalsIgnoreCase(r7) == false) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0529, code lost:
        if ("Spreadtrum".equalsIgnoreCase(r7) == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0563, code lost:
        if (vc.o.V(r3, "sp", false) != false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x05c0, code lost:
        if ("Spreadtrum".equalsIgnoreCase(r7) == false) goto L216;
     */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0624  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0632  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0645  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j0.o1 j(x.j r16) {
        /*
            Method dump skipped, instructions count: 1645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.t.j(x.j):j0.o1");
    }

    public static final int k(Bitmap bitmap) {
        int i2;
        Bitmap.Config config;
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (Exception unused) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                Bitmap.Config config2 = bitmap.getConfig();
                if (config2 == Bitmap.Config.ALPHA_8) {
                    i2 = 1;
                } else if (config2 == Bitmap.Config.RGB_565 || config2 == Bitmap.Config.ARGB_4444) {
                    i2 = 2;
                } else {
                    if (Build.VERSION.SDK_INT >= 26) {
                        config = Bitmap.Config.RGBA_F16;
                        if (config2 == config) {
                            i2 = 8;
                        }
                    }
                    i2 = 4;
                }
                return height * i2;
            }
        }
        StringBuilder sb2 = new StringBuilder("Cannot obtain size for recycled bitmap: ");
        sb2.append(bitmap);
        int width = bitmap.getWidth();
        int height2 = bitmap.getHeight();
        Bitmap.Config config3 = bitmap.getConfig();
        sb2.append(" [");
        sb2.append(width);
        sb2.append(" x ");
        sb2.append(height2);
        sb2.append("] + ");
        sb2.append(config3);
        throw new IllegalStateException(sb2.toString().toString());
    }

    public static int l(List list) {
        list.getClass();
        return list.size() - 1;
    }

    public static final l4.h m(x xVar) {
        l4.h hVar = xVar.f12276a;
        long j2 = xVar.f12277b;
        hVar.getClass();
        return hVar.subSequence(q0.f(j2), q0.e(j2));
    }

    public static final long n(double d4) {
        return C(4294967296L, (float) d4);
    }

    public static final long o(int i2) {
        return C(4294967296L, i2);
    }

    public static final l4.h p(x xVar, int i2) {
        l4.h hVar = xVar.f12276a;
        l4.h hVar2 = xVar.f12276a;
        long j2 = xVar.f12277b;
        int e6 = q0.e(j2);
        int e10 = q0.e(j2);
        int i10 = e10 + i2;
        if (((i2 ^ i10) & (e10 ^ i10)) < 0) {
            i10 = hVar2.B.length();
        }
        return hVar.subSequence(e6, Math.min(i10, hVar2.B.length()));
    }

    public static final l4.h q(x xVar, int i2) {
        l4.h hVar = xVar.f12276a;
        long j2 = xVar.f12277b;
        int f8 = q0.f(j2);
        int i10 = f8 - i2;
        if (((f8 ^ i10) & (i2 ^ f8)) < 0) {
            i10 = 0;
        }
        return hVar.subSequence(Math.max(0, i10), q0.f(j2));
    }

    public static final void r(String str) {
        str.getClass();
        if (str.length() > 0) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = str.charAt(i2);
                if ('!' > charAt || charAt >= 127) {
                    StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                    k.f(16);
                    String num = Integer.toString(charAt, 16);
                    num.getClass();
                    if (num.length() < 2) {
                        num = "0".concat(num);
                    }
                    sb2.append(num);
                    sb2.append(" at ");
                    sb2.append(i2);
                    sb2.append(" in header name: ");
                    sb2.append(str);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
            }
            return;
        }
        a0.j.h("name is empty");
    }

    public static final void s(String str, String str2) {
        String concat;
        str.getClass();
        str2.getClass();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb2 = new StringBuilder("Unexpected char 0x");
                k.f(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb2.append(num);
                sb2.append(" at ");
                sb2.append(i2);
                sb2.append(" in ");
                sb2.append(str2);
                sb2.append(" value");
                if (qi.e.l(str2)) {
                    concat = "";
                } else {
                    concat = ": ".concat(str);
                }
                sb2.append(concat);
                throw new IllegalArgumentException(sb2.toString().toString());
            }
        }
    }

    public static boolean t(d0 d0Var, x0 x0Var) {
        x0Var.getClass();
        int i2 = d0Var.R;
        if (i2 != 200 && i2 != 410 && i2 != 414 && i2 != 501 && i2 != 203 && i2 != 204) {
            if (i2 != 307) {
                if (i2 != 308 && i2 != 404 && i2 != 405) {
                    switch (i2) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String a10 = d0Var.Y.a("Expires");
            if (a10 == null) {
                a10 = null;
            }
            if (a10 == null && d0Var.d().f11715c == -1 && !d0Var.d().f11718f && !d0Var.d().f11717e) {
                return false;
            }
        }
        if (!d0Var.d().f11714b && !x0Var.b().f11714b) {
            return true;
        }
        return false;
    }

    public static final boolean u(Bitmap.Config config) {
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config2 = Bitmap.Config.HARDWARE;
            if (config == config2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final String v(Collection collection) {
        return vc.i.I(zb.l.Y(collection, ",", null, null, null, 62)).concat(vc.i.I(" }"));
    }

    public static final String w(Collection collection) {
        return vc.i.I(zb.l.Y(collection, ",", null, null, null, 62)).concat(vc.i.I("},"));
    }

    public static List x(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public static List y(Object... objArr) {
        objArr.getClass();
        if (objArr.length > 0) {
            List asList = Arrays.asList(objArr);
            asList.getClass();
            return asList;
        }
        return zb.q.A;
    }

    public static final long z(long j2, float f8) {
        if (!Float.isNaN(f8) && f8 < 1.0f) {
            return i3.s.b(j2, i3.s.d(j2) * f8);
        }
        return j2;
    }
}
