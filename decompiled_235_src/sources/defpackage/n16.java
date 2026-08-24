package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Range;
import android.view.View;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n16  reason: default package */
/* loaded from: classes.dex */
public abstract /* synthetic */ class n16 {
    public static final float[] a = new float[91];
    public static final zv0 b = new zv0(-1890422454, false, new fn0(8));
    public static final zv0 c = new zv0(-163762566, false, new kw0(18));
    public static final zv0 d = new zv0(803814188, false, new fn0(9));
    public static final zv0 e = new zv0(387696893, false, new fn0(10));
    public static final zv0 f = new zv0(899959196, false, new fn0(11));
    public static final zv0 g = new zv0(-2067582301, false, new fn0(12));
    public static final zv0 h = new zv0(28240038, false, new fn0(27));
    public static final zv0 i = new zv0(-1656633265, false, new fn0(28));
    public static final zv0 j = new zv0(1491343221, false, new iw0(5));
    public static final zv0 k = new zv0(2097151646, false, new iw0(6));
    public static final byte[] l = new byte[0];
    public static final bk m = new bk(3);
    public static final boolean[] n = new boolean[3];
    public static final sq1[] o = {new sq1(120000000000L), new sq1(300000000000L)};
    public static final long[] p = new long[0];
    public static final h37 q = new h37(9);
    public static e33 r;
    public static final /* synthetic */ int s = 0;

    public static final String A(xa6 xa6Var, Resources resources) {
        float f2;
        int q2;
        ta6 ta6Var = xa6Var.d;
        ta6 ta6Var2 = xa6Var.d;
        Object g2 = ta6Var.A.g(bb6.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        ja4 ja4Var = ta6Var2.A;
        Object g3 = ja4Var.g(bb6.K);
        if (g3 == null) {
            g3 = null;
        }
        a87 a87Var = (a87) g3;
        Object g4 = ja4Var.g(bb6.z);
        if (g4 == null) {
            g4 = null;
        }
        mq5 mq5Var = (mq5) g4;
        String str2 = g2;
        if (a87Var != null) {
            int i2 = af.a[a87Var.ordinal()];
            str2 = g2;
            str2 = g2;
            if (i2 != 1) {
                if (i2 != 2) {
                    str2 = g2;
                    if (i2 == 3) {
                        if (g2 == null) {
                            str2 = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        i.d();
                        return null;
                    }
                } else if (mq5Var != null) {
                    str2 = g2;
                    str2 = g2;
                    if (mq5Var.a == 2 && g2 == null) {
                        str2 = resources.getString(R.string.state_off);
                    }
                }
            } else if (mq5Var != null) {
                str2 = g2;
                str2 = g2;
                if (mq5Var.a == 2 && g2 == null) {
                    str2 = resources.getString(R.string.state_on);
                }
            }
        }
        Object g5 = ja4Var.g(bb6.J);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((mq5Var == null || mq5Var.a != 4) && str2 == null) {
                if (booleanValue) {
                    str2 = resources.getString(R.string.selected);
                } else {
                    str2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g6 = ja4Var.g(bb6.c);
        if (g6 == null) {
            g6 = null;
        }
        x35 x35Var = (x35) g6;
        String str3 = str2;
        if (x35Var != null) {
            str3 = str2;
            str3 = str2;
            if (x35Var != x35.d) {
                if (str2 == null) {
                    bs0 bs0Var = x35Var.b;
                    float f3 = bs0Var.b;
                    float f4 = bs0Var.a;
                    if (f3 - f4 == RecyclerView.B1) {
                        f2 = 0.0f;
                    } else {
                        f2 = (x35Var.a - f4) / (f3 - f4);
                    }
                    if (f2 < RecyclerView.B1) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == RecyclerView.B1) {
                        q2 = 0;
                    } else if (f2 == 1.0f) {
                        q2 = 100;
                    } else {
                        q2 = gi2.q(Math.round(f2 * 100.0f), 1, 99);
                    }
                    str3 = resources.getString(R.string.template_percent, Integer.valueOf(q2));
                }
            } else if (str2 == null) {
                str3 = resources.getString(R.string.in_progress);
            }
        }
        fb6 fb6Var = bb6.G;
        String str4 = str3;
        if (ja4Var.c(fb6Var)) {
            ja4 ja4Var2 = new xa6(xa6Var.a, true, xa6Var.c, ta6Var2).k().A;
            Object g7 = ja4Var2.g(bb6.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = ja4Var2.g(bb6.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = ja4Var2.g(fb6Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            str4 = str;
        }
        return str4;
    }

    public static final fp B(xa6 xa6Var) {
        Object g2 = xa6Var.d.A.g(bb6.G);
        fp fpVar = null;
        if (g2 == null) {
            g2 = null;
        }
        fp fpVar2 = (fp) g2;
        Object g3 = xa6Var.d.A.g(bb6.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        if (list != null) {
            fpVar = (fp) gt0.J0(list);
        }
        if (fpVar2 == null) {
            return fpVar;
        }
        return fpVar2;
    }

    public static final rj0 C(r41 r41Var) {
        if (!(r41Var instanceof nk1)) {
            return new rj0(1, r41Var);
        }
        rj0 m2 = ((nk1) r41Var).m();
        if (m2 != null) {
            if (!m2.F()) {
                m2 = null;
            }
            if (m2 != null) {
                return m2;
            }
        }
        return new rj0(2, r41Var);
    }

    public static boolean D(wl5 wl5Var, pa paVar) {
        paVar.getClass();
        int i2 = wl5Var.R;
        if (i2 != 200 && i2 != 410 && i2 != 414 && i2 != 501 && i2 != 203 && i2 != 204) {
            if (i2 != 307) {
                if (i2 != 308 && i2 != 404 && i2 != 405) {
                    switch (i2) {
                        case MlKitException.LOW_LIGHT_AUTO_EXPOSURE_COMPUTATION_FAILURE /* 300 */:
                        case MlKitException.LOW_LIGHT_IMAGE_CAPTURE_PROCESSING_FAILURE /* 301 */:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            String a2 = wl5Var.Y.a("Expires");
            if (a2 == null) {
                a2 = null;
            }
            if (a2 == null && wl5Var.e().c == -1 && !wl5Var.e().f && !wl5Var.e().e) {
                return false;
            }
        }
        if (!wl5Var.e().b && !paVar.h().b) {
            return true;
        }
        return false;
    }

    public static boolean E() {
        String str = Build.MANUFACTURER;
        str.getClass();
        if (!str.equalsIgnoreCase("Samsung")) {
            String str2 = Build.BRAND;
            str2.getClass();
            if (!str2.equalsIgnoreCase("Samsung")) {
                return false;
            }
        }
        LinkedHashMap linkedHashMap = ExtraCroppingQuirk.a;
        String str3 = Build.MODEL;
        str3.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = str3.toUpperCase(locale);
        upperCase.getClass();
        if (linkedHashMap.containsKey(upperCase)) {
            String upperCase2 = str3.toUpperCase(locale);
            upperCase2.getClass();
            Range range = (Range) linkedHashMap.get(upperCase2);
            if (range != null) {
                return range.contains((Range) Integer.valueOf(Build.VERSION.SDK_INT));
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(Collection collection, r41 r41Var) {
        tz tzVar;
        int i2;
        Iterator it;
        if (r41Var instanceof tz) {
            tz tzVar2 = (tz) r41Var;
            int i3 = tzVar2.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tzVar2.Y = i3 - Integer.MIN_VALUE;
                tzVar = tzVar2;
                Object obj = tzVar.X;
                Object obj2 = x61.COROUTINE_SUSPENDED;
                i2 = tzVar.Y;
                if (i2 == 0) {
                    if (i2 == 1) {
                        it = tzVar.R;
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    it = collection.iterator();
                }
                while (it.hasNext()) {
                    tzVar.R = it;
                    tzVar.Y = 1;
                    if (((rc3) it.next()).c0(tzVar) == obj2) {
                        return obj2;
                    }
                }
                return jg7.a;
            }
        }
        tzVar = new s41(r41Var);
        Object obj3 = tzVar.X;
        Object obj22 = x61.COROUTINE_SUSPENDED;
        i2 = tzVar.Y;
        if (i2 == 0) {
        }
        while (it.hasNext()) {
        }
        return jg7.a;
    }

    public static final a74 G(a74 a74Var, qn2 qn2Var) {
        return a74Var.d(new og2(qn2Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b8, code lost:
        if (r5 == r26.length()) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01c0, code lost:
        if (r26.charAt(r5) != 'S') goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01c2, code lost:
        r2 = (r14 * 1000000000) + r15;
        r14 = r9;
        r4 = defpackage.uq1.SECONDS;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d6, code lost:
        switch(defpackage.rq1.a[r4.ordinal()]) {
            case 1: goto L114;
            case 2: goto L113;
            case 3: goto L112;
            case 4: goto L111;
            case 5: goto L110;
            case 6: goto L109;
            case 7: goto L107;
            default: goto L105;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d9, code lost:
        defpackage.e41.h(r4, "Unknown unit: ");
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01e1, code lost:
        r21 = 0.0864d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01e7, code lost:
        r21 = 0.0036d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01ed, code lost:
        r21 = 6.0E-5d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
        r21 = 1.0E-6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01f9, code lost:
        r21 = 1.0E-9d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ff, code lost:
        r21 = 1.0E-15d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0205, code lost:
        r21 = 1.0E-12d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x020a, code lost:
        r2 = defpackage.u24.F(r2 * r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0210, code lost:
        r14 = r2 * r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b1, code lost:
        r25 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d1, code lost:
        if (r5 >= r26.length()) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d3, code lost:
        r3 = r26.charAt(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d9, code lost:
        if ('0' > r3) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
        if (r3 >= ':') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e6, code lost:
        if (r5 == r26.length()) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ea, code lost:
        if (r2 == '+') goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ee, code lost:
        if (r2 == '-') goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f0, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f2, code lost:
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
        if (r5 == (r23 + r2)) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f8, code lost:
        r20 = 4611686018427387903L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0104, code lost:
        defpackage.i.h("");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0107, code lost:
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0195 A[LOOP:7: B:105:0x0193->B:106:0x0195, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x029e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c A[LOOP:5: B:95:0x015a->B:96:0x015c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long H(String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        long j2;
        int i6;
        int i7;
        uq1 uq1Var;
        int i8;
        int min;
        int i9;
        char charAt;
        int i10;
        int i11;
        if (str.length() != 0) {
            char charAt2 = str.charAt(0);
            int i12 = 1;
            char c2 = '-';
            char c3 = '+';
            if (charAt2 != '+') {
                if (charAt2 != '-') {
                    i3 = 0;
                } else {
                    i3 = 1;
                }
                i2 = i3;
            } else {
                i2 = 0;
                i3 = 1;
            }
            if (str.length() > i3) {
                if (str.charAt(i3) == 'P') {
                    int i13 = i3 + 1;
                    if (i13 != str.length()) {
                        int i14 = 0;
                        uq1 uq1Var2 = null;
                        long j3 = 0;
                        long j4 = 0;
                        while (i13 < str.length()) {
                            char charAt3 = str.charAt(i13);
                            if (charAt3 == 'T') {
                                if (i14 == 0 && (i13 = i13 + 1) != str.length()) {
                                    i14 = i12;
                                } else {
                                    i.h("");
                                    return 0L;
                                }
                            } else {
                                xy3 xy3Var = xy3.c;
                                int i15 = i12;
                                char charAt4 = str.charAt(i13);
                                if (charAt4 != c3) {
                                    if (charAt4 != c2) {
                                        i4 = i13;
                                    } else {
                                        i4 = i13 + 1;
                                        i5 = -1;
                                        while (i4 < str.length() && str.charAt(i4) == '0') {
                                            i4++;
                                        }
                                        j2 = 0;
                                        while (true) {
                                            if (i4 >= str.length()) {
                                                char charAt5 = str.charAt(i4);
                                                i6 = i13;
                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                    i10 = charAt5 - '0';
                                                    i11 = i2;
                                                    int i16 = (j2 > xy3Var.a ? 1 : (j2 == xy3Var.a ? 0 : -1));
                                                    if (i16 <= 0 && (i16 != 0 || i10 <= xy3Var.b)) {
                                                        j2 = (j2 << 3) + (j2 << i15) + i10;
                                                        i4++;
                                                        i13 = i6;
                                                        xy3Var = xy3Var;
                                                        i2 = i11;
                                                    }
                                                }
                                            } else {
                                                i6 = i13;
                                            }
                                        }
                                        int i17 = i2;
                                        if (i4 != str.length()) {
                                            if (charAt3 != '+' && charAt3 != '-') {
                                                i7 = 0;
                                            } else {
                                                i7 = i15;
                                            }
                                            if (i4 == i6 + i7) {
                                            }
                                            long j5 = j2;
                                            if (str.charAt(i4) == '.') {
                                                int i18 = i4 + 1;
                                                int min2 = Math.min(i4 + 7, str.length());
                                                int i19 = 0;
                                                for (int i20 = i18; i20 < min2; i20++) {
                                                    char charAt6 = str.charAt(i20);
                                                    if ('0' <= charAt6 && charAt6 < ':') {
                                                        i19 = (charAt6 - '0') + (i19 << 3) + (i19 << 1);
                                                    }
                                                    for (i8 = 0; i8 < 6 - (i20 - i18); i8++) {
                                                        i19 = (i19 << 1) + (i19 << 3);
                                                    }
                                                    min = Math.min(i20 + 9, str.length());
                                                    i4 = i20;
                                                    int i21 = 0;
                                                    while (i4 < min) {
                                                        char charAt7 = str.charAt(i4);
                                                        int i22 = min;
                                                        if ('0' <= charAt7 && charAt7 < ':') {
                                                            i21 = (charAt7 - '0') + (i21 << 3) + (i21 << 1);
                                                            i4++;
                                                            min = i22;
                                                        }
                                                        for (i9 = 0; i9 < 9 - (i4 - i20); i9++) {
                                                            i21 = (i21 << 1) + (i21 << 3);
                                                        }
                                                        while (i4 < str.length() && '0' <= (charAt = str.charAt(i4)) && charAt < ':') {
                                                            i4++;
                                                        }
                                                        i.h("");
                                                        return 0L;
                                                    }
                                                    while (i9 < 9 - (i4 - i20)) {
                                                    }
                                                    while (i4 < str.length()) {
                                                        i4++;
                                                    }
                                                    i.h("");
                                                    return 0L;
                                                }
                                                while (i8 < 6 - (i20 - i18)) {
                                                }
                                                min = Math.min(i20 + 9, str.length());
                                                i4 = i20;
                                                int i212 = 0;
                                                while (i4 < min) {
                                                }
                                                while (i9 < 9 - (i4 - i20)) {
                                                }
                                                while (i4 < str.length()) {
                                                }
                                                i.h("");
                                                return 0L;
                                            }
                                            char charAt8 = str.charAt(i4);
                                            if (charAt8 != 'D') {
                                                if (charAt8 != 'H') {
                                                    if (charAt8 != 'M') {
                                                        if (charAt8 != 'S') {
                                                            uq1Var = null;
                                                        } else {
                                                            uq1Var = uq1.SECONDS;
                                                        }
                                                    } else {
                                                        uq1Var = uq1.MINUTES;
                                                    }
                                                } else {
                                                    uq1Var = uq1.HOURS;
                                                }
                                            } else {
                                                uq1Var = uq1.DAYS;
                                            }
                                            if (uq1Var != null) {
                                                if (uq1Var2 != null && uq1Var2.compareTo(uq1Var) <= 0) {
                                                    i.h("Unexpected order of duration components");
                                                    return 0L;
                                                }
                                                if (uq1Var == uq1.DAYS) {
                                                    if (i14 == 0) {
                                                        j3 = ge7.w(j5, uq1Var) * i5;
                                                    } else {
                                                        i.h("");
                                                        return 0L;
                                                    }
                                                } else if (i14 != 0) {
                                                    long k2 = k(j3, ge7.w(j5, uq1Var) * i5);
                                                    if (k2 != 9223372036854759646L) {
                                                        j3 = k2;
                                                    } else {
                                                        i.h("");
                                                        return 0L;
                                                    }
                                                } else {
                                                    i.h("");
                                                    return 0L;
                                                }
                                                i13 = i4 + 1;
                                                uq1Var2 = uq1Var;
                                                i12 = i15;
                                                i2 = i17;
                                                c2 = '-';
                                                c3 = '+';
                                            } else {
                                                throw new IllegalArgumentException("Unknown duration unit short name: " + str.charAt(i4));
                                            }
                                        }
                                        i.h("");
                                        return 0L;
                                    }
                                } else {
                                    i4 = i13 + 1;
                                }
                                i5 = i15;
                                while (i4 < str.length()) {
                                    i4++;
                                }
                                j2 = 0;
                                while (true) {
                                    if (i4 >= str.length()) {
                                    }
                                    j2 = (j2 << 3) + (j2 << i15) + i10;
                                    i4++;
                                    i13 = i6;
                                    xy3Var = xy3Var;
                                    i2 = i11;
                                }
                                int i172 = i2;
                                if (i4 != str.length()) {
                                }
                                i.h("");
                                return 0L;
                            }
                        }
                        int i23 = i2;
                        long j6 = oq1.j(M(j3, uq1.MILLISECONDS), M(j4, uq1.NANOSECONDS));
                        if (i23 != 0 && !oq1.d(j6, oq1.X)) {
                            return oq1.m(j6);
                        }
                        return j6;
                    }
                    i.h("");
                    return 0L;
                }
                i.h("");
                return 0L;
            }
            i.h("No components");
            return 0L;
        }
        i.h("The string is empty");
        return 0L;
    }

    public static final zv0 I(int i2, ao2 ao2Var, px0 px0Var) {
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        if (P == ox0.a) {
            P = new zv0(i2, true, ao2Var);
            xq2Var.l0(P);
        }
        zv0 zv0Var = (zv0) P;
        if (!zv0Var.L.equals(ao2Var)) {
            zv0Var.L = ao2Var;
            if (zv0Var.B) {
                cf5 cf5Var = zv0Var.R;
                if (cf5Var != null) {
                    ey0 ey0Var = cf5Var.a;
                    if (ey0Var != null) {
                        ey0Var.s(cf5Var, null);
                    }
                    zv0Var.R = null;
                }
                ArrayList arrayList = zv0Var.X;
                if (arrayList != null) {
                    int size = arrayList.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        cf5 cf5Var2 = (cf5) arrayList.get(i3);
                        ey0 ey0Var2 = cf5Var2.a;
                        if (ey0Var2 != null) {
                            ey0Var2.s(cf5Var2, null);
                        }
                    }
                    arrayList.clear();
                }
            }
        }
        return zv0Var;
    }

    public static final ga7 J(gx0 gx0Var, String str, px0 px0Var, int i2, int i3) {
        boolean z;
        qn2 qn2Var;
        boolean z2;
        if ((i3 & 2) != 0) {
            str = null;
        }
        int i4 = (i2 & 14) ^ 6;
        boolean z3 = true;
        if ((i4 > 4 && ((xq2) px0Var).f(gx0Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        Object obj = ox0.a;
        if (z || P == obj) {
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            try {
                Object ga7Var = new ga7(gx0Var, null, str);
                ln2.V(t, N, qn2Var);
                xq2Var.l0(ga7Var);
                P = ga7Var;
            } catch (Throwable th) {
                ln2.V(t, N, qn2Var);
                throw th;
            }
        }
        ga7 ga7Var2 = (ga7) P;
        if (gx0Var instanceof n96) {
            xq2Var.b0(-1357590553);
            Object P2 = xq2Var.P();
            if (P2 == obj) {
                P2 = mb3.w(xq2Var);
                xq2Var.l0(P2);
            }
            Object obj2 = (w61) P2;
            boolean h2 = xq2Var.h(obj2);
            if ((i4 > 4 && xq2Var.f(gx0Var)) || (i2 & 6) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h2 | z2;
            Object P3 = xq2Var.P();
            if (z4 || P3 == obj) {
                P3 = new qk4(29, gx0Var, obj2);
                xq2Var.l0(P3);
            }
            mb3.d(obj2, (qn2) P3, xq2Var);
            n96 n96Var = (n96) gx0Var;
            Object value = n96Var.c.getValue();
            Object value2 = n96Var.b.getValue();
            if ((i4 <= 4 || !xq2Var.f(gx0Var)) && (i2 & 6) != 4) {
                z3 = false;
            }
            Object P4 = xq2Var.P();
            if (z3 || P4 == obj) {
                P4 = new vy5(gx0Var, null, 15);
                xq2Var.l0(P4);
            }
            mb3.j(value, value2, (eo2) P4, xq2Var);
            xq2Var.p(false);
        } else {
            xq2Var.b0(-1356604288);
            ga7Var2.a(gx0Var.h(), xq2Var, 0);
            xq2Var.p(false);
        }
        boolean f2 = xq2Var.f(ga7Var2);
        Object P5 = xq2Var.P();
        if (f2 || P5 == obj) {
            P5 = new ia7(ga7Var2, 0);
            xq2Var.l0(P5);
        }
        mb3.d(ga7Var2, (qn2) P5, xq2Var);
        return ga7Var2;
    }

    public static final int K(s96 s96Var, int i2) {
        int i3;
        int[] iArr = s96Var.Y;
        int i4 = i2 + 1;
        int length = s96Var.X.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 < i4) {
                    i6 = i3 + 1;
                } else if (i7 <= i4) {
                    break;
                } else {
                    i5 = i3 - 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        if (i3 >= 0) {
            return i3;
        }
        return ~i3;
    }

    public static final long L(int i2, uq1 uq1Var) {
        uq1Var.getClass();
        if (uq1Var.compareTo(uq1.SECONDS) <= 0) {
            long j2 = i2;
            uq1 uq1Var2 = uq1.NANOSECONDS;
            uq1Var2.getClass();
            long convert = uq1Var2.getTimeUnit$kotlin_stdlib().convert(j2, uq1Var.getTimeUnit$kotlin_stdlib());
            jd1 jd1Var = oq1.B;
            long j3 = convert << 1;
            int i3 = qq1.a;
            return j3;
        }
        return M(i2, uq1Var);
    }

    public static final long M(long j2, uq1 uq1Var) {
        uq1Var.getClass();
        uq1 uq1Var2 = uq1.NANOSECONDS;
        uq1Var2.getClass();
        long convert = uq1Var.getTimeUnit$kotlin_stdlib().convert(4611686018426999999L, uq1Var2.getTimeUnit$kotlin_stdlib());
        if ((-convert) <= j2 && j2 <= convert) {
            long convert2 = uq1Var2.getTimeUnit$kotlin_stdlib().convert(j2, uq1Var.getTimeUnit$kotlin_stdlib());
            jd1 jd1Var = oq1.B;
            long j3 = convert2 << 1;
            int i2 = qq1.a;
            return j3;
        }
        uq1 uq1Var3 = uq1.MILLISECONDS;
        if (uq1Var.compareTo(uq1Var3) >= 0) {
            long signum = Long.signum(j2);
            if (j2 < -9223372036854775807L) {
                j2 = -9223372036854775807L;
            }
            return u(ge7.w(Math.abs(j2), uq1Var) * signum);
        }
        uq1Var3.getClass();
        return u(gi2.s(uq1Var3.getTimeUnit$kotlin_stdlib().convert(j2, uq1Var.getTimeUnit$kotlin_stdlib()), -4611686018427387903L, 4611686018427387903L));
    }

    public static final ga7 N(Object obj, String str, px0 px0Var, int i2, int i3) {
        if ((i3 & 2) != 0) {
            str = null;
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (P == vs0Var) {
            P = new ga7(new ta4(obj), null, str);
            xq2Var.l0(P);
        }
        ga7 ga7Var = (ga7) P;
        ga7Var.a(obj, xq2Var, (i2 & 8) | 48 | (i2 & 14));
        Object P2 = xq2Var.P();
        if (P2 == vs0Var) {
            P2 = new ia7(ga7Var, 1);
            xq2Var.l0(P2);
        }
        mb3.d(ga7Var, (qn2) P2, xq2Var);
        return ga7Var;
    }

    public static final void a(a74 a74Var, le2 le2Var, px0 px0Var, int i2) {
        int i3;
        int i4;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-2115049507);
        if (xq2Var.f(a74Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.h(le2Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i6 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = new w6();
                xq2Var.l0(P);
            }
            w6 w6Var = (w6) P;
            boolean h2 = xq2Var.h(le2Var) | xq2Var.h(w6Var);
            Object P2 = xq2Var.P();
            if (h2 || P2 == vs0Var) {
                P2 = new z(le2Var, w6Var, null, 2);
                xq2Var.l0(P2);
            }
            mb3.i(xq2Var, (eo2) P2, le2Var);
            boolean h3 = xq2Var.h(w6Var);
            Object P3 = xq2Var.P();
            if (h3 || P3 == vs0Var) {
                P3 = new k0(w6Var, 8);
                xq2Var.l0(P3);
            }
            gi2.e(a74Var, null, null, null, null, null, false, null, (qn2) P3, xq2Var, i6 & 14, 510);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x6(a74Var, le2Var, i2, 1);
        }
    }

    public static final void b(sz1 sz1Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        sz1Var.getClass();
        be5 be5Var = sz1Var.G0;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1053005445);
        if (xq2Var.h(sz1Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            boolean f2 = xq2Var.f(sz1Var);
            Object P = xq2Var.P();
            if (f2 || P == ox0.a) {
                P = f04.J(new b7(be5Var, 1), new b7(sz1Var.O0, 0));
                xq2Var.l0(P);
            }
            le2 le2Var = (le2) P;
            x64 x64Var = x64.a;
            a74 j0 = nc1.j0(dj6.c(x64Var, 1.0f), nc1.p);
            e40 e40Var = d90.L;
            e34 d2 = h70.d(e40Var, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, j0);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            a(dj6.n(vs0.Y.n(x64Var, e40Var), null, 3), be5Var, xq2Var, 0);
            f(dj6.c(x64Var, 1.0f), le2Var, xq2Var, 6);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(sz1Var, i2, 1);
        }
    }

    public static final void c(ga7 ga7Var, a74 a74Var, rc2 rc2Var, qn2 qn2Var, zv0 zv0Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        qn2 qn2Var2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        gx0 gx0Var = ga7Var.a;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1877370462);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(ga7Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(a74Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(rc2Var)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        int i8 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            if (xq2Var.h(zv0Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = ne.r0;
                xq2Var.l0(P);
            }
            qn2Var2 = (qn2) P;
            Object P2 = xq2Var.P();
            mm6 mm6Var = P2;
            if (P2 == vs0Var) {
                mm6 mm6Var2 = new mm6();
                mm6Var2.add(gx0Var.f());
                xq2Var.l0(mm6Var2);
                mm6Var = mm6Var2;
            }
            mm6 mm6Var3 = (mm6) mm6Var;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                long[] jArr = b66.a;
                P3 = new ja4();
                xq2Var.l0(P3);
            }
            ja4 ja4Var = (ja4) P3;
            vs4 vs4Var = ga7Var.d;
            if (nb3.k(gx0Var.f(), vs4Var.getValue())) {
                xq2Var.b0(321145192);
                if (mm6Var3.size() == 1 && nb3.k(mm6Var3.get(0), vs4Var.getValue())) {
                    xq2Var.b0(321469824);
                    xq2Var.p(false);
                } else {
                    xq2Var.b0(321279546);
                    if ((i8 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = xq2Var.P();
                    if (z2 || P4 == vs0Var) {
                        P4 = new mc(ga7Var, 11);
                        xq2Var.l0(P4);
                    }
                    gt0.W0(mm6Var3, (qn2) P4);
                    ja4Var.a();
                    xq2Var.p(false);
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(321475776);
                xq2Var.p(false);
            }
            if (!ja4Var.b(vs4Var.getValue())) {
                xq2Var.b0(321536443);
                ListIterator listIterator = mm6Var3.listIterator();
                int i9 = 0;
                while (true) {
                    xx2 xx2Var = (xx2) listIterator;
                    if (xx2Var.hasNext()) {
                        if (nb3.k(qn2Var2.g(xx2Var.next()), qn2Var2.g(vs4Var.getValue()))) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                if (i9 == -1) {
                    mm6Var3.add(vs4Var.getValue());
                } else {
                    mm6Var3.set(i9, vs4Var.getValue());
                }
                ja4Var.a();
                int size = mm6Var3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj = mm6Var3.get(i10);
                    ja4Var.m(obj, I(-934471669, new p71(ga7Var, rc2Var, obj, zv0Var), xq2Var));
                }
                xq2Var.p(false);
            } else {
                xq2Var.b0(322279296);
                xq2Var.p(false);
            }
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.x(xq2Var, Integer.valueOf(hashCode), ix0.g);
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            xq2Var.b0(-1312707512);
            int size2 = mm6Var3.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj2 = mm6Var3.get(i11);
                xq2Var.Z(1171574969, qn2Var2.g(obj2));
                eo2 eo2Var = (eo2) ja4Var.g(obj2);
                if (eo2Var == null) {
                    xq2Var.b0(1959122128);
                } else {
                    xq2Var.b0(1171576145);
                    eo2Var.o(xq2Var, 0);
                }
                xq2Var.p(false);
                xq2Var.p(false);
            }
            xq2Var.p(false);
            xq2Var.p(true);
        } else {
            xq2Var.V();
            qn2Var2 = qn2Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new q71(ga7Var, a74Var, rc2Var, qn2Var2, zv0Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Object obj, a74 a74Var, rc2 rc2Var, String str, zv0 zv0Var, px0 px0Var, int i2, int i3) {
        int i4;
        rc2 rc2Var2;
        int i5;
        int i6;
        String str2;
        int i7;
        boolean z;
        x64 x64Var;
        rc2 rc2Var3;
        cf5 t;
        sc7 sc7Var;
        String str3;
        int i8;
        boolean h2;
        int i9;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-513216493);
        if ((i2 & 6) == 0) {
            if ((i2 & 8) == 0) {
                h2 = xq2Var.f(obj);
            } else {
                h2 = xq2Var.h(obj);
            }
            if (h2) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i4 = i9 | i2;
        } else {
            i4 = i2;
        }
        int i10 = i4 | 48;
        int i11 = i3 & 4;
        if (i11 != 0) {
            i10 = i4 | 432;
        } else if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            rc2Var2 = rc2Var;
            if (xq2Var.h(rc2Var2)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i10 |= i5;
            i6 = i3 & 8;
            if (i6 == 0) {
                i10 |= 3072;
            } else if ((i2 & 3072) == 0) {
                str2 = str;
                if (xq2Var.f(str2)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i10 |= i7;
                if ((i2 & 24576) == 0) {
                    if (xq2Var.h(zv0Var)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i10 |= i8;
                }
                if ((i10 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq2Var.S(i10 & 1, z)) {
                    if (i11 != 0) {
                        sc7Var = ge7.Y(0, 0, null, 7);
                    } else {
                        sc7Var = rc2Var2;
                    }
                    if (i6 != 0) {
                        str3 = "Crossfade";
                    } else {
                        str3 = str2;
                    }
                    x64 x64Var2 = x64.a;
                    c(N(obj, str3, xq2Var, (i10 & 14) | ((i10 >> 6) & 112), 0), x64Var2, sc7Var, null, zv0Var, xq2Var, i10 & 58352);
                    str2 = str3;
                    x64Var = x64Var2;
                    rc2Var3 = sc7Var;
                } else {
                    xq2Var.V();
                    x64Var = a74Var;
                    rc2Var3 = rc2Var2;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new o71(obj, x64Var, rc2Var3, str2, zv0Var, i2, i3);
                    return;
                }
                return;
            }
            str2 = str;
            if ((i2 & 24576) == 0) {
            }
            if ((i10 & 9363) != 9362) {
            }
            if (xq2Var.S(i10 & 1, z)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        rc2Var2 = rc2Var;
        i6 = i3 & 8;
        if (i6 == 0) {
        }
        str2 = str;
        if ((i2 & 24576) == 0) {
        }
        if ((i10 & 9363) != 9362) {
        }
        if (xq2Var.S(i10 & 1, z)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static final void e(ij1 ij1Var, px0 px0Var, int i2) {
        int i3;
        boolean isAtLeast;
        mm6 mm6Var;
        ij1 ij1Var2 = ij1Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(294589392);
        if (xq2Var.h(ij1Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        if (((i3 | i2) & 3) == 2 && xq2Var.E()) {
            xq2Var.V();
        } else {
            p46 C = nj2.C(xq2Var);
            qa4 C2 = np2.C(ij1Var2.b().e, xq2Var);
            List list = (List) C2.getValue();
            boolean booleanValue = ((Boolean) xq2Var.j(q83.a)).booleanValue();
            boolean f2 = xq2Var.f(list);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            mm6 mm6Var2 = P;
            if (f2 || P == vs0Var) {
                mm6 mm6Var3 = new mm6();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    sb4 sb4Var = (sb4) obj;
                    if (booleanValue) {
                        isAtLeast = true;
                    } else {
                        isAtLeast = ((ku3) sb4Var.d0.k).d.isAtLeast(tt3.STARTED);
                    }
                    if (isAtLeast) {
                        arrayList.add(obj);
                    }
                }
                mm6Var3.addAll(arrayList);
                xq2Var.l0(mm6Var3);
                mm6Var2 = mm6Var3;
            }
            mm6 mm6Var4 = mm6Var2;
            g(mm6Var4, (List) C2.getValue(), xq2Var, 0);
            qa4 C3 = np2.C(ij1Var2.b().f, xq2Var);
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new mm6();
                xq2Var.l0(P2);
            }
            mm6 mm6Var5 = (mm6) P2;
            xq2Var.b0(-367418626);
            ListIterator listIterator = mm6Var4.listIterator();
            while (true) {
                xx2 xx2Var = (xx2) listIterator;
                if (!xx2Var.hasNext()) {
                    break;
                }
                sb4 sb4Var2 = (sb4) xx2Var.next();
                ic4 ic4Var = sb4Var2.B;
                ic4Var.getClass();
                hj1 hj1Var = (hj1) ic4Var;
                boolean h2 = xq2Var.h(ij1Var2) | xq2Var.h(sb4Var2);
                Object P3 = xq2Var.P();
                if (h2 || P3 == vs0Var) {
                    P3 = new q6(25, ij1Var2, sb4Var2);
                    xq2Var.l0(P3);
                }
                nw7.o((on2) P3, hj1Var.Y, I(1129586364, new ej1(sb4Var2, ij1Var2, C, mm6Var5, hj1Var), xq2Var), xq2Var, RendererDebugBridge.CAPTURE_HEIGHT, 0);
                ij1Var2 = ij1Var2;
                C = C;
                mm6Var5 = mm6Var5;
            }
            ij1 ij1Var3 = ij1Var2;
            mm6 mm6Var6 = mm6Var5;
            xq2Var.p(false);
            Set set = (Set) C3.getValue();
            boolean f3 = xq2Var.f(C3) | xq2Var.h(ij1Var3);
            Object P4 = xq2Var.P();
            if (!f3 && P4 != vs0Var) {
                ij1Var2 = ij1Var3;
                mm6Var = mm6Var6;
            } else {
                ij1Var2 = ij1Var3;
                mm6Var = mm6Var6;
                ag agVar = new ag(C3, ij1Var2, mm6Var, null, 5);
                xq2Var.l0(agVar);
                P4 = agVar;
            }
            mb3.j(set, mm6Var, (eo2) P4, xq2Var);
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new z5(ij1Var2, i2, 9);
        }
    }

    public static final void f(a74 a74Var, le2 le2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        le2 le2Var2;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1273173056);
        if (xq2Var.h(le2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i3 | i2;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i4 & 1, z)) {
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(null);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            Object P2 = xq2Var.P();
            if (P2 == vs0Var) {
                P2 = new rs4(-1.0f);
                xq2Var.l0(P2);
            }
            rs4 rs4Var = (rs4) P2;
            Object P3 = xq2Var.P();
            if (P3 == vs0Var) {
                P3 = np2.Y(null);
                xq2Var.l0(P3);
            }
            qa4 qa4Var2 = (qa4) P3;
            boolean h2 = xq2Var.h(le2Var);
            Object P4 = xq2Var.P();
            if (!h2 && P4 != vs0Var) {
                le2Var2 = le2Var;
            } else {
                le2Var2 = le2Var;
                P4 = new b0(le2Var2, qa4Var, rs4Var, (r41) null, 1);
                xq2Var.l0(P4);
            }
            mb3.i(xq2Var, (eo2) P4, le2Var2);
            e34 d2 = h70.d(d90.L, false);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E = l.E(xq2Var, a74Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, ix0.f, d2);
            yh2.K(xq2Var, ix0.e, l2);
            yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
            yh2.F(xq2Var, ix0.h);
            yh2.K(xq2Var, ix0.d, E);
            vs0 vs0Var2 = vs0.Y;
            zz4 zz4Var = (zz4) qa4Var.getValue();
            a74 n2 = vs0Var2.n(x64.a, d90.R);
            Object P5 = xq2Var.P();
            if (P5 == vs0Var) {
                P5 = new y(1, rs4Var, qa4Var2);
                xq2Var.l0(P5);
            }
            a74 L = g04.L(n2, (qn2) P5);
            Object P6 = xq2Var.P();
            if (P6 == vs0Var) {
                P6 = new j4(qa4Var2, 3);
                xq2Var.l0(P6);
            }
            a74 E2 = lb4.E(L, (qn2) P6);
            if (zz4Var instanceof wz4) {
                xq2Var.b0(4395501);
                u24.a(E2, ((wz4) zz4Var).a, xq2Var, 0);
                xq2Var.p(false);
            } else if (zz4Var instanceof yz4) {
                xq2Var.b0(4617399);
                qo2.i(E2, ((yz4) zz4Var).a, xq2Var, 0);
                xq2Var.p(false);
            } else if (zz4Var instanceof xz4) {
                xq2Var.b0(4827889);
                jx2.a(E2, ((xz4) zz4Var).a, xq2Var, 0);
                xq2Var.p(false);
            } else if (zz4Var == null) {
                xq2Var.b0(5014447);
                xq2Var.p(false);
            } else {
                throw xg6.f(xq2Var, -1385333472, false);
            }
            xq2Var.p(true);
        } else {
            le2Var2 = le2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new x6(a74Var, le2Var2, i2, 0);
        }
    }

    public static final void g(List list, Collection collection, px0 px0Var, int i2) {
        int i3;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1537894851);
        if (xq2Var.h(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (xq2Var.h(collection)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        if (((i5 | i4) & 19) == 18 && xq2Var.E()) {
            xq2Var.V();
        } else {
            boolean booleanValue = ((Boolean) xq2Var.j(q83.a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                sb4 sb4Var = (sb4) it.next();
                ku3 ku3Var = (ku3) sb4Var.d0.k;
                boolean g2 = xq2Var.g(booleanValue) | xq2Var.h(list) | xq2Var.h(sb4Var);
                Object P = xq2Var.P();
                if (g2 || P == ox0.a) {
                    P = new bj1(sb4Var, list, booleanValue);
                    xq2Var.l0(P);
                }
                mb3.d(ku3Var, (qn2) P, xq2Var);
            }
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(list, i2, 12, collection);
        }
    }

    public static final void h(ga7 ga7Var, ca7 ca7Var, Object obj, Object obj2, rc2 rc2Var, px0 px0Var, int i2) {
        int i3;
        boolean z;
        boolean h2;
        int i4;
        boolean h3;
        int i5;
        boolean h4;
        int i6;
        int i7;
        int i8;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(867041821);
        if ((i2 & 6) == 0) {
            if (xq2Var.f(ga7Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (xq2Var.f(ca7Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 |= i7;
        }
        if ((i2 & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if ((i2 & 512) == 0) {
                h4 = xq2Var.f(obj);
            } else {
                h4 = xq2Var.h(obj);
            }
            if (h4) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        if ((i2 & 3072) == 0) {
            if ((i2 & 4096) == 0) {
                h3 = xq2Var.f(obj2);
            } else {
                h3 = xq2Var.h(obj2);
            }
            if (h3) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        if ((i2 & 24576) == 0) {
            if ((32768 & i2) == 0) {
                h2 = xq2Var.f(rc2Var);
            } else {
                h2 = xq2Var.h(rc2Var);
            }
            if (h2) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            if (ga7Var.g()) {
                ca7Var.h(obj, obj2, rc2Var);
            } else {
                ca7Var.i(obj2, rc2Var);
            }
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new r4(ga7Var, ca7Var, obj, obj2, rc2Var, i2);
        }
    }

    public static final boolean i(xa6 xa6Var) {
        ta6 k2 = xa6Var.k();
        return !k2.A.c(bb6.j);
    }

    public static final boolean j(xa6 xa6Var, Resources resources) {
        boolean z;
        Object g2 = xa6Var.d.A.g(bb6.a);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        if (list != null) {
            str = (String) gt0.J0(list);
        }
        if (str == null && B(xa6Var) == null && A(xa6Var, resources) == null && !z(xa6Var)) {
            z = false;
        } else {
            z = true;
        }
        if (!u24.v(xa6Var) && (xa6Var.d.L || (xa6Var.q() && z))) {
            return true;
        }
        return false;
    }

    public static final long k(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            if (j3 != 4611686018427387903L && j3 != -4611686018427387903L) {
                return gi2.s(j2 + j3, -4611686018427387903L, 4611686018427387903L);
            }
            return j3;
        } else if (-4611686018427387903L < j3 && j3 < 4611686018427387903L) {
            return j2;
        } else {
            if ((j3 ^ j2) >= 0) {
                return j2;
            }
            return 9223372036854759646L;
        }
    }

    public static void l(StringBuilder sb, String str, Map map) {
        String valueOf;
        String valueOf2;
        if (map.isEmpty()) {
            sb.append(str.concat(": (None)\n"));
            return;
        }
        sb.append(str.concat("\n"));
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            if (key instanceof CameraCharacteristics.Key) {
                valueOf = ((CameraCharacteristics.Key) key).getName();
                valueOf.getClass();
            } else if (key instanceof CaptureRequest.Key) {
                valueOf = ((CaptureRequest.Key) key).getName();
                valueOf.getClass();
            } else if (key instanceof CaptureResult.Key) {
                valueOf = ((CaptureResult.Key) key).getName();
                valueOf.getClass();
            } else {
                valueOf = String.valueOf(key);
            }
            Object value = entry.getValue();
            if (value instanceof Object[]) {
                valueOf2 = fv.M0((Object[]) value, "[", "]", new vn0(20), 25);
            } else {
                valueOf2 = String.valueOf(value);
            }
            arrayList.add(new vr4(valueOf, valueOf2));
        }
        for (vr4 vr4Var : gt0.d1(arrayList, new zh2(11))) {
            sb.append("  " + qs6.A0(50, (String) vr4Var.A) + ' ' + ((String) vr4Var.B) + '\n');
        }
    }

    public static final Object m(Collection collection, s41 s41Var) {
        if (collection.isEmpty()) {
            return yt1.A;
        }
        jg1[] jg1VarArr = (jg1[]) collection.toArray(new jg1[0]);
        qz qzVar = new qz(jg1VarArr);
        rj0 rj0Var = new rj0(1, np2.V(s41Var));
        rj0Var.v();
        int length = jg1VarArr.length;
        oz[] ozVarArr = new oz[length];
        for (int i2 = 0; i2 < length; i2++) {
            jg1 jg1Var = jg1VarArr[i2];
            ((ed3) jg1Var).start();
            oz ozVar = new oz(qzVar, rj0Var);
            ozVar.e0 = yh2.y(jg1Var, true, ozVar);
            ozVarArr[i2] = ozVar;
        }
        pz pzVar = new pz(ozVarArr);
        for (int i3 = 0; i3 < length; i3++) {
            ozVarArr[i3].t(pzVar);
        }
        if (!(rj0Var.u() instanceof sg4)) {
            pzVar.a();
        } else {
            rj0Var.A(pzVar);
        }
        Object s2 = rj0Var.s();
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        return s2;
    }

    public static final int n(int i2, int i3) {
        return i2 << (((i3 % 10) * 3) + 1);
    }

    public static a74 o(a74 a74Var, float f2) {
        if (om1.a(f2, RecyclerView.B1) > 0) {
            om1.a(f2, RecyclerView.B1);
        }
        return hv.G(a74Var, new n50(f2, f2, 0, true));
    }

    public static final fi1 p(View view) {
        pv7 pv7Var;
        w60 w60Var;
        Context context = view.getContext();
        ContextWrapper contextWrapper = context;
        while (contextWrapper instanceof ContextWrapper) {
            if ((contextWrapper instanceof Activity) || (contextWrapper instanceof InputMethodService) || (contextWrapper instanceof Application)) {
                break;
            }
            ContextWrapper contextWrapper2 = (ContextWrapper) contextWrapper;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            contextWrapper = contextWrapper2.getBaseContext();
        }
        contextWrapper = null;
        if (contextWrapper != null) {
            nv7.a.getClass();
            mv7 mv7Var = mv7.a;
            ov7 ov7Var = mv7.b;
            ov7Var.getClass();
            ContextWrapper contextWrapper3 = contextWrapper;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                pv7Var = sh1.B;
            } else if (i2 >= 30) {
                pv7Var = b70.B;
            } else {
                pv7Var = d90.H0;
            }
            long height = (4294967295L & w60Var.c().height()) | (pv7Var.e(contextWrapper3, ov7Var.b).a.c().width() << 32);
            return new fi1(height, ak7.s(contextWrapper).q(qo2.S(height)));
        }
        Configuration configuration = context.getResources().getConfiguration();
        uh1 s2 = ak7.s(context);
        long f2 = nc1.f(configuration.screenWidthDp, configuration.screenHeightDp);
        long v0 = s2.v0(f2);
        return new fi1((((int) Float.intBitsToFloat((int) (v0 & 4294967295L))) & 4294967295L) | (((int) Float.intBitsToFloat((int) (v0 >> 32))) << 32), f2);
    }

    public static void q(m21 m21Var, jv3 jv3Var, l21 l21Var) {
        l21Var.o = -1;
        h11 h11Var = l21Var.M;
        h11 h11Var2 = l21Var.L;
        h11 h11Var3 = l21Var.J;
        h11 h11Var4 = l21Var.K;
        h11 h11Var5 = l21Var.I;
        l21Var.p = -1;
        k21 k21Var = m21Var.T[0];
        k21 k21Var2 = k21.WRAP_CONTENT;
        if (k21Var != k21Var2 && l21Var.T[0] == k21.MATCH_PARENT) {
            int i2 = h11Var5.g;
            int r2 = m21Var.r() - h11Var4.g;
            h11Var5.i = jv3Var.k(h11Var5);
            h11Var4.i = jv3Var.k(h11Var4);
            jv3Var.d(h11Var5.i, i2);
            jv3Var.d(h11Var4.i, r2);
            l21Var.o = 2;
            l21Var.Z = i2;
            int i3 = r2 - i2;
            l21Var.V = i3;
            int i4 = l21Var.c0;
            if (i3 < i4) {
                l21Var.V = i4;
            }
        }
        if (m21Var.T[1] != k21Var2 && l21Var.T[1] == k21.MATCH_PARENT) {
            int i5 = h11Var3.g;
            int l2 = m21Var.l() - h11Var2.g;
            h11Var3.i = jv3Var.k(h11Var3);
            h11Var2.i = jv3Var.k(h11Var2);
            jv3Var.d(h11Var3.i, i5);
            jv3Var.d(h11Var2.i, l2);
            if (l21Var.b0 > 0 || l21Var.h0 == 8) {
                en6 k2 = jv3Var.k(h11Var);
                h11Var.i = k2;
                jv3Var.d(k2, l21Var.b0 + i5);
            }
            l21Var.p = 2;
            l21Var.a0 = i5;
            int i6 = l2 - i5;
            l21Var.W = i6;
            int i7 = l21Var.d0;
            if (i6 < i7) {
                l21Var.W = i7;
            }
        }
    }

    public static final ga7 r(ga7 ga7Var, Object obj, Object obj2, String str, px0 px0Var, int i2) {
        boolean z;
        int i3 = (i2 & 14) ^ 6;
        boolean z2 = true;
        if ((i3 > 4 && ((xq2) px0Var).f(ga7Var)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (z || P == vs0Var) {
            P = new ga7(new ta4(obj), ga7Var, ga7Var.c + " > " + str);
            xq2Var.l0(P);
        }
        ga7 ga7Var2 = (ga7) P;
        if ((i3 <= 4 || !xq2Var.f(ga7Var)) && (i2 & 6) != 4) {
            z2 = false;
        }
        boolean f2 = xq2Var.f(ga7Var2) | z2;
        Object P2 = xq2Var.P();
        if (f2 || P2 == vs0Var) {
            P2 = new ja7(0, ga7Var, ga7Var2);
            xq2Var.l0(P2);
        }
        mb3.d(ga7Var2, (qn2) P2, xq2Var);
        if (ga7Var.g()) {
            ga7Var2.k(obj, obj2);
            return ga7Var2;
        }
        ga7Var2.p(obj2);
        ga7Var2.k.setValue(Boolean.FALSE);
        return ga7Var2;
    }

    public static final w97 s(ga7 ga7Var, wc7 wc7Var, String str, px0 px0Var, int i2, int i3) {
        v97 v97Var;
        if ((i3 & 2) != 0) {
            str = "DeferredAnimation";
        }
        boolean f2 = ((xq2) px0Var).f(ga7Var);
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (f2 || P == vs0Var) {
            P = new w97(ga7Var, wc7Var, str);
            xq2Var.l0(P);
        }
        w97 w97Var = (w97) P;
        boolean f3 = xq2Var.f(ga7Var) | xq2Var.h(w97Var);
        Object P2 = xq2Var.P();
        if (f3 || P2 == vs0Var) {
            P2 = new ja7(1, ga7Var, w97Var);
            xq2Var.l0(P2);
        }
        mb3.d(w97Var, (qn2) P2, xq2Var);
        if (ga7Var.g() && (v97Var = (v97) w97Var.b.getValue()) != null) {
            ga7 ga7Var2 = w97Var.c;
            v97Var.A.h(v97Var.L.g(ga7Var2.f().a()), v97Var.L.g(ga7Var2.f().c()), (rc2) v97Var.B.g(ga7Var2.f()));
        }
        return w97Var;
    }

    public static final ca7 t(ga7 ga7Var, Object obj, Object obj2, rc2 rc2Var, wc7 wc7Var, px0 px0Var, int i2) {
        qn2 qn2Var;
        boolean f2 = ((xq2) px0Var).f(ga7Var);
        xq2 xq2Var = (xq2) px0Var;
        Object P = xq2Var.P();
        vs0 vs0Var = ox0.a;
        if (f2 || P == vs0Var) {
            vl6 t = ln2.t();
            if (t != null) {
                qn2Var = t.e();
            } else {
                qn2Var = null;
            }
            vl6 N = ln2.N(t);
            try {
                ap apVar = (ap) wc7Var.a.g(obj2);
                apVar.d();
                ca7 ca7Var = new ca7(ga7Var, obj, apVar, wc7Var);
                ln2.V(t, N, qn2Var);
                xq2Var.l0(ca7Var);
                P = ca7Var;
            } catch (Throwable th) {
                ln2.V(t, N, qn2Var);
                throw th;
            }
        }
        ca7 ca7Var2 = (ca7) P;
        h(ga7Var, ca7Var2, obj, obj2, rc2Var, xq2Var, 0);
        boolean f3 = xq2Var.f(ga7Var) | xq2Var.f(ca7Var2);
        Object P2 = xq2Var.P();
        if (f3 || P2 == vs0Var) {
            P2 = new ja7(3, ga7Var, ca7Var2);
            xq2Var.l0(P2);
        }
        mb3.d(ca7Var2, (qn2) P2, xq2Var);
        return ca7Var2;
    }

    public static final long u(long j2) {
        long j3 = (j2 << 1) + 1;
        oq1.B.getClass();
        int i2 = qq1.a;
        return j3;
    }

    public static final boolean v(int i2, int i3) {
        if ((i2 & i3) == i3) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final c37 w(c37 c37Var) {
        char upperCase;
        c37Var.getClass();
        long j2 = c37Var.b;
        int i2 = k47.c;
        int i3 = (int) (j2 >> 32);
        StringBuilder sb = new StringBuilder();
        String str = c37Var.a.B;
        int i4 = 0;
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < str.length()) {
            char charAt = str.charAt(i4);
            int i9 = i5 + 1;
            if (i6 == 16) {
                sb.append('\n');
                if (charAt != '\n') {
                    if (i5 <= i3 + i7) {
                        i7++;
                        i6 = 0;
                        i8 = 0;
                        z = true;
                        upperCase = Character.toUpperCase(charAt);
                        if (('0' <= upperCase && upperCase < ':') || ('A' <= upperCase && upperCase < 'G')) {
                            sb.append(Character.toUpperCase(charAt));
                            i6++;
                            i8++;
                            if (!Character.isDigit(charAt)) {
                                if (Character.isUpperCase(charAt)) {
                                }
                            }
                            i4++;
                            i5 = i9;
                        }
                        z = true;
                        i4++;
                        i5 = i9;
                    } else {
                        i6 = 0;
                        i8 = 0;
                        upperCase = Character.toUpperCase(charAt);
                        if ('0' <= upperCase) {
                            sb.append(Character.toUpperCase(charAt));
                            i6++;
                            i8++;
                            if (!Character.isDigit(charAt)) {
                            }
                            i4++;
                            i5 = i9;
                        }
                        sb.append(Character.toUpperCase(charAt));
                        i6++;
                        i8++;
                        if (!Character.isDigit(charAt)) {
                        }
                        i4++;
                        i5 = i9;
                    }
                } else {
                    i6 = 0;
                    i8 = 0;
                    i4++;
                    i5 = i9;
                }
            } else {
                if (i8 == 8) {
                    sb.append(' ');
                    if (charAt != ' ') {
                        if (i5 <= i3 + i7) {
                            i7++;
                            i8 = 0;
                            z = true;
                        } else {
                            i8 = 0;
                        }
                    } else {
                        i8 = 0;
                        i4++;
                        i5 = i9;
                    }
                }
                upperCase = Character.toUpperCase(charAt);
                if ('0' <= upperCase) {
                }
                sb.append(Character.toUpperCase(charAt));
                i6++;
                i8++;
                if (!Character.isDigit(charAt)) {
                }
                i4++;
                i5 = i9;
            }
        }
        if (z) {
            int i10 = i3 + i7;
            return new c37(sb.toString(), 4, jx2.f(i10, i10));
        }
        return c37Var;
    }

    public static final ar0 x(wb6 wb6Var) {
        wb6Var.getClass();
        if (wb6Var instanceof h41) {
            return ((h41) wb6Var).b;
        }
        if (wb6Var instanceof xb6) {
            return x(((xb6) wb6Var).a);
        }
        return null;
    }

    public static final e33 y() {
        e33 e33Var = r;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Close", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(19.0f, 6.41f);
        ww2Var.m(17.59f, 5.0f);
        ww2Var.m(12.0f, 10.59f);
        ww2Var.m(6.41f, 5.0f);
        ww2Var.m(5.0f, 6.41f);
        ww2Var.m(10.59f, 12.0f);
        ww2Var.m(5.0f, 17.59f);
        ww2Var.m(6.41f, 19.0f);
        ww2Var.m(12.0f, 13.41f);
        ww2Var.m(17.59f, 19.0f);
        ww2Var.m(19.0f, 17.59f);
        ww2Var.m(13.41f, 12.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        r = b2;
        return b2;
    }

    public static final boolean z(xa6 xa6Var) {
        boolean z;
        Object g2 = xa6Var.d.A.g(bb6.K);
        Boolean bool = null;
        if (g2 == null) {
            g2 = null;
        }
        a87 a87Var = (a87) g2;
        ja4 ja4Var = xa6Var.d.A;
        Object g3 = ja4Var.g(bb6.z);
        if (g3 == null) {
            g3 = null;
        }
        mq5 mq5Var = (mq5) g3;
        if (a87Var != null) {
            z = true;
        } else {
            z = false;
        }
        Object g4 = ja4Var.g(bb6.J);
        if (g4 != null) {
            bool = g4;
        }
        if (bool != null && (mq5Var == null || mq5Var.a != 4)) {
            return true;
        }
        return z;
    }
}
