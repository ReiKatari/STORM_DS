package defpackage;

import android.graphics.Path;
import java.lang.reflect.Method;
import java.security.Provider;
import java.util.Collections;
import java.util.List;
import javax.crypto.Cipher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: so1  reason: default package */
/* loaded from: classes.dex */
public class so1 implements i02, p33, a57, pb4, d31, so4, y31, r56 {
    public final /* synthetic */ int A;

    public so1() {
        this.A = 29;
        List list = Collections.EMPTY_LIST;
    }

    public static final boolean e(jk4 jk4Var) {
        jk4 jk4Var2 = sb5.X;
        w70 w70Var = jk4Var.A;
        int k = w70.k(w70Var, f.a);
        if (k == -1) {
            k = w70.k(jk4Var.A, f.b);
        }
        if (k != -1) {
            w70Var = w70.p(w70Var, k + 1, 0, 2);
        } else if (jk4Var.e() != null && w70Var.d() == 2) {
            w70Var = w70.R;
        }
        return !gh6.f0(w70Var.r(), ".class", true);
    }

    public static final int f(int i, long j) {
        int i2 = fw6.b;
        return ((int) (j >> (i * 15))) & 32767;
    }

    public static Path h(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
        if (r10 != (-1)) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(defpackage.to1 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.so1.i(to1, android.text.Editable, int, int, boolean):boolean");
    }

    public static long l(int i, int i2, int i3, int i4) {
        return ((i2 & 32767) << 15) | (i & 32767) | ((i3 & 32767) << 30) | ((i4 & 32767) << 45) | Long.MIN_VALUE;
    }

    @Override // defpackage.i02
    public Object a(String str, Provider provider) {
        if (provider == null) {
            return Cipher.getInstance(str);
        }
        return Cipher.getInstance(str, provider);
    }

    @Override // defpackage.k32
    public x14 b() {
        return x14.f();
    }

    @Override // defpackage.r56
    public u92 c(gi6 gi6Var) {
        return new bz0(6, new v74(gi6Var, (j11) null, 19));
    }

    @Override // defpackage.a57
    public b57 d() {
        return new by3();
    }

    public String g(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object j(Object obj, Method method, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean k(Method method) {
        return false;
    }

    public String toString() {
        switch (this.A) {
            case 22:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ so1(int i) {
        this.A = i;
    }

    @Override // defpackage.pb4
    public int n(int i) {
        return i;
    }

    @Override // defpackage.pb4
    public int r(int i) {
        return i;
    }
}
