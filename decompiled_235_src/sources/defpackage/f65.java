package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f65  reason: default package */
/* loaded from: classes.dex */
public final class f65 {
    public static final da0 b = new da0(Arrays.copyOf(new byte[]{42}, 1));
    public static final List c = hf.b0("*");
    public static final f65 d = new f65(new pa(3));
    public final pa a;

    public f65(pa paVar) {
        this.a = paVar;
    }

    public static List b(String str) {
        List J0 = qs6.J0(str, new char[]{'.'}, 6);
        if (nb3.k(gt0.Q0(J0), "")) {
            return gt0.E0(J0);
        }
        return J0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x016f, code lost:
        return defpackage.sb6.a0(r13, ".");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0170, code lost:
        defpackage.i.f(defpackage.lb1.k("Requested element count ", r0, " is less than zero."));
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x017b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r1 <= 1) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0090, code lost:
        r5 = (defpackage.da0[]) r2.clone();
        r9 = r5.length - 1;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r10 >= r9) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        r5[r10] = defpackage.f65.b;
        r11 = (defpackage.da0) r12.R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
        if (r11 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a5, code lost:
        r11 = defpackage.w31.l(r11, r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a9, code lost:
        if (r11 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00af, code lost:
        defpackage.nb3.a0("bytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b2, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b3, code lost:
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b4, code lost:
        if (r11 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
        r1 = r1 - 1;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b8, code lost:
        if (r5 >= r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
        r6 = (defpackage.da0) r12.X;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00be, code lost:
        if (r6 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
        r6 = defpackage.w31.l(r6, r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
        if (r6 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ca, code lost:
        defpackage.nb3.a0("exceptionBytes");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00cf, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d0, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d4, code lost:
        if (r6 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
        r12 = defpackage.qs6.J0("!".concat(r6), new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e5, code lost:
        if (r8 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e7, code lost:
        if (r11 != null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e9, code lost:
        r12 = defpackage.f65.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00ec, code lost:
        r2 = defpackage.yt1.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00ee, code lost:
        if (r8 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00f0, code lost:
        r5 = defpackage.qs6.J0(r8, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00f9, code lost:
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fa, code lost:
        if (r11 == null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00fc, code lost:
        r2 = defpackage.qs6.J0(r11, new char[]{'.'}, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x010c, code lost:
        if (r5.size() <= r2.size()) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x010e, code lost:
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0110, code lost:
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x011b, code lost:
        if (r0.size() != r12.size()) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0127, code lost:
        if (((java.lang.String) r12.get(0)).charAt(0) == '!') goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0129, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0134, code lost:
        if (((java.lang.String) r12.get(0)).charAt(0) != '!') goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0136, code lost:
        r0 = r0.size();
        r12 = r12.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013e, code lost:
        r0 = r0 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0140, code lost:
        r0 = r0.size();
        r12 = r12.size() + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x014a, code lost:
        r13 = new defpackage.ev(b(r13), 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0153, code lost:
        if (r0 < 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0155, code lost:
        if (r0 != 0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015a, code lost:
        if ((r13 instanceof defpackage.qp1) == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x015c, code lost:
        r13 = ((defpackage.qp1) r13).a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0163, code lost:
        r13 = new defpackage.pp1(r13, r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(String str) {
        String str2;
        String unicode = IDN.toUnicode(str);
        unicode.getClass();
        List b2 = b(unicode);
        pa paVar = this.a;
        AtomicBoolean atomicBoolean = (AtomicBoolean) paVar.B;
        if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
            boolean z = false;
            while (true) {
                try {
                    try {
                        paVar.r();
                        break;
                    } catch (InterruptedIOException unused) {
                        Thread.interrupted();
                        z = true;
                    } catch (IOException e) {
                        paVar.Y = e;
                        if (z) {
                        }
                    }
                } finally {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        } else {
            try {
                ((CountDownLatch) paVar.L).await();
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
        if (((da0) paVar.R) != null) {
            int size = b2.size();
            da0[] da0VarArr = new da0[size];
            for (int i = 0; i < size; i++) {
                da0 da0Var = da0.R;
                da0VarArr[i] = xd5.o((String) b2.get(i));
            }
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    da0 da0Var2 = (da0) paVar.R;
                    if (da0Var2 != null) {
                        str2 = w31.l(da0Var2, da0VarArr, i2);
                        if (str2 != null) {
                            break;
                        }
                        i2++;
                    } else {
                        nb3.a0("bytes");
                        throw null;
                    }
                } else {
                    str2 = null;
                    break;
                }
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("Unable to load " + ((Object) ((String) paVar.Z)) + " resource.");
            illegalStateException.initCause((IOException) paVar.Y);
            throw illegalStateException;
        }
    }
}
