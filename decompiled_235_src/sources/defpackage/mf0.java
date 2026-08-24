package defpackage;

import android.os.Build;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mf0  reason: default package */
/* loaded from: classes.dex */
public final class mf0 {
    public final boolean a;
    public final zb b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        if (r0.contains(r3) == true) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mf0(boolean z, zb zbVar, int i, boolean z2, int i2) {
        boolean z3;
        if ((i2 & 2) != 0) {
            if (Build.VERSION.SDK_INT >= 30) {
                z = true;
            } else {
                z = false;
            }
        }
        zbVar = (i2 & 4) != 0 ? new zb(0, nf0.AT_LEAST) : zbVar;
        i = (i2 & 16) != 0 ? 0 : i;
        if ((i2 & 32) != 0) {
            Map map = nd0.c;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 > 27) {
                String str = Build.HARDWARE;
                if (!nb3.k(str, "samsungexynos7870") && (!xs6.Z(str, "qcom", true) || i3 > 31)) {
                    Map map2 = nd0.d;
                    String str2 = Build.BRAND;
                    str2.getClass();
                    Locale locale = Locale.ROOT;
                    String lowerCase = str2.toLowerCase(locale);
                    lowerCase.getClass();
                    Set set = (Set) map2.get(lowerCase);
                    if (set != null) {
                        String str3 = Build.MODEL;
                        str3.getClass();
                        String lowerCase2 = str3.toLowerCase(locale);
                        lowerCase2.getClass();
                    }
                    z3 = false;
                    z2 = (i2 & 64) != 0 ? false : z2;
                    boolean z4 = (i2 & 128) == 0;
                    this.a = z;
                    this.b = zbVar;
                    this.c = i;
                    this.d = z3;
                    this.e = z2;
                    this.f = z4;
                }
            }
        }
        z3 = true;
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) == 0) {
        }
        this.a = z;
        this.b = zbVar;
        this.c = i;
        this.d = z3;
        this.e = z2;
        this.f = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mf0) {
                mf0 mf0Var = (mf0) obj;
                if (this.a == mf0Var.a && nb3.k(this.b, mf0Var.b) && this.c == mf0Var.c && this.d == mf0Var.d && this.e == mf0Var.e && this.f == mf0Var.f) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(Boolean.hashCode(false) * 31, this.a, 31);
        return Boolean.hashCode(this.f) + xg6.e(xg6.e(lb1.a(this.c, (this.b.hashCode() + e) * 961, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb.append(this.a);
        sb.append(", awaitRepeatingRequestBeforeCapture=");
        sb.append(this.b);
        sb.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.c + ')'));
        sb.append(", closeCaptureSessionOnDisconnect=");
        sb.append(this.d);
        sb.append(", closeCameraDeviceOnClose=");
        sb.append(this.e);
        sb.append(", enableRestartDelays=");
        return xg6.r(sb, this.f, ')');
    }
}
