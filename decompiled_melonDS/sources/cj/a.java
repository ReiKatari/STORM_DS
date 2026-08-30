package cj;

import a0.j;
import fj.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import nc.k;
import p7.t;
import w.d;
import w.x0;
import zb.l;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final h f2898b = new h(Arrays.copyOf(new byte[]{42}, 1));

    /* renamed from: c  reason: collision with root package name */
    public static final List f2899c = t.x("*");

    /* renamed from: d  reason: collision with root package name */
    public static final a f2900d = new a(new x0(1));

    /* renamed from: a  reason: collision with root package name */
    public final x0 f2901a;

    public a(x0 x0Var) {
        this.f2901a = x0Var;
    }

    public static List b(String str) {
        int i2 = 0;
        List<Object> u02 = vc.h.u0(str, new char[]{'.'});
        if (k.a(l.Z(u02), "")) {
            int size = u02.size() - 1;
            if (size < 0) {
                size = 0;
            }
            if (size >= 0) {
                if (size == 0) {
                    return q.A;
                }
                if (size >= u02.size()) {
                    return l.p0(u02);
                }
                if (size == 1) {
                    return t.x(l.Q(u02));
                }
                ArrayList arrayList = new ArrayList(size);
                for (Object obj : u02) {
                    arrayList.add(obj);
                    i2++;
                    if (i2 == size) {
                        break;
                    }
                }
                return t.B(arrayList);
            }
            j.e(d.m("Requested element count ", size, " is less than zero."));
            return null;
        }
        return u02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016f, code lost:
        return uc.h.K(r1, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0170, code lost:
        a0.j.e(w.d.m("Requested element count ", r0, " is less than zero."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r2 <= 1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
        r6 = (fj.h[]) r3.clone();
        r10 = r6.length - 1;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r11 >= r10) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        r6[r11] = cj.a.f2898b;
        r12 = (fj.h) r1.f14091d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r12 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r12 = na.f.b(r12, r6, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
        if (r12 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
        nc.k.f("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
        if (r12 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
        r2 = r2 - 1;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
        if (r6 >= r2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
        r7 = (fj.h) r1.f14092e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
        if (r7 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
        r7 = na.f.b(r7, r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
        if (r7 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ca, code lost:
        nc.k.f("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
        if (r7 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d5, code lost:
        r1 = vc.h.u0("!".concat(r7), new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e4, code lost:
        if (r9 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e6, code lost:
        if (r12 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e8, code lost:
        r1 = cj.a.f2899c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00eb, code lost:
        r2 = zb.q.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ed, code lost:
        if (r9 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00ef, code lost:
        r3 = vc.h.u0(r9, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f8, code lost:
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f9, code lost:
        if (r12 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fb, code lost:
        r2 = vc.h.u0(r12, new char[]{'.'});
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010b, code lost:
        if (r3.size() <= r2.size()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010d, code lost:
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x010f, code lost:
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011a, code lost:
        if (r0.size() != r1.size()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0126, code lost:
        if (((java.lang.String) r1.get(0)).charAt(0) == '!') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0128, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0133, code lost:
        if (((java.lang.String) r1.get(0)).charAt(0) != '!') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0135, code lost:
        r0 = r0.size();
        r1 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013d, code lost:
        r0 = r0 - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x013f, code lost:
        r0 = r0.size();
        r1 = r1.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0149, code lost:
        r1 = new a6.a1(4, b(r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
        if (r0 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
        if (r0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015a, code lost:
        if ((r1 instanceof uc.d) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015c, code lost:
        r1 = ((uc.d) r1).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0163, code lost:
        r1 = new uc.c(r1, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cj.a.a(java.lang.String):java.lang.String");
    }
}
