package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.HandwritingGesture;
import android.widget.Toast;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.ModelPPM;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.mlkit.vision.common.InputImage;
import com.stormds.emulator.R;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bl2  reason: default package */
/* loaded from: classes.dex */
public abstract class bl2 implements mo2 {
    public static final int A = 9;
    public static final int B = 10;
    public static final int L = 12;
    public static e33 R;
    public static final /* synthetic */ int X = 0;
    public static e33 Y;

    public bl2() {
        new ConcurrentHashMap();
    }

    public static s83 A(int i, long j) {
        long j2 = i;
        long j3 = j2 / 1000000000;
        if ((j2 ^ 1000000000) < 0 && j3 * 1000000000 != j2) {
            j3--;
        }
        long j4 = j + j3;
        if ((j ^ j4) < 0 && (j3 ^ j) >= 0) {
            if (j > 0) {
                return s83.R;
            }
            return s83.L;
        } else if (j4 < -31557014167219200L) {
            return s83.L;
        } else {
            if (j4 > 31556889864403199L) {
                return s83.R;
            }
            long j5 = j2 % 1000000000;
            return new s83((int) (j5 + ((((j5 ^ 1000000000) & ((-j5) | j5)) >> 63) & 1000000000)), j4);
        }
    }

    public static final hu3 B(View view) {
        hu3 hu3Var;
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            if (tag instanceof hu3) {
                hu3Var = (hu3) tag;
            } else {
                hu3Var = null;
            }
            if (hu3Var != null) {
                return hu3Var;
            }
            ViewParent s = xk2.s(view);
            if (s instanceof View) {
                view = (View) s;
            } else {
                view = null;
            }
        }
        return null;
    }

    public static final au3 C(hu3 hu3Var) {
        hu3Var.getClass();
        ut3 lifecycle = hu3Var.getLifecycle();
        lifecycle.getClass();
        os0 os0Var = lifecycle.a;
        while (true) {
            au3 au3Var = (au3) ((AtomicReference) os0Var.B).get();
            if (au3Var != null) {
                return au3Var;
            }
            gu6 c = oi2.c();
            xe1 xe1Var = xk1.a;
            au3 au3Var2 = new au3(lifecycle, jw2.y(c, e04.a.Y));
            AtomicReference atomicReference = (AtomicReference) os0Var.B;
            while (!atomicReference.compareAndSet(null, au3Var2)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            xe1 xe1Var2 = xk1.a;
            hv.L(au3Var2, e04.a.Y, null, new m5(au3Var2, null, 20), 2);
            return au3Var2;
        }
    }

    public static final sz4 D(View view) {
        sz4 sz4Var = (sz4) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (sz4Var == null) {
            sz4 sz4Var2 = new sz4();
            view.setTag(R.id.pooling_container_listener_holder_tag, sz4Var2);
            return sz4Var2;
        }
        return sz4Var;
    }

    public static final e33 E() {
        e33 e33Var = R;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Refresh", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(17.65f, 6.35f);
        ww2Var.h(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        ww2Var.i(-4.42f, RecyclerView.B1, -7.99f, 3.58f, -7.99f, 8.0f);
        ww2Var.q(3.57f, 8.0f, 7.99f, 8.0f);
        ww2Var.i(3.73f, RecyclerView.B1, 6.84f, -2.55f, 7.73f, -6.0f);
        ww2Var.l(-2.08f);
        ww2Var.i(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        ww2Var.i(-3.31f, RecyclerView.B1, -6.0f, -2.69f, -6.0f, -6.0f);
        ww2Var.q(2.69f, -6.0f, 6.0f, -6.0f);
        ww2Var.i(1.66f, RecyclerView.B1, 3.14f, 0.69f, 4.22f, 1.78f);
        ww2Var.m(13.0f, 11.0f);
        ww2Var.l(7.0f);
        ww2Var.t(4.0f);
        ww2Var.n(-2.35f, 2.35f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b = d33Var.b();
        R = b;
        return b;
    }

    public static final es7 F(px0 px0Var) {
        return (es7) ((xq2) px0Var).j(fs7.i);
    }

    public static final void G(va6 va6Var) {
        nc1.f0(va6Var).F();
    }

    public static boolean H(int i, CharSequence charSequence) {
        if (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            switch (charAt) {
                case '!':
                case '\"':
                case InputImage.IMAGE_FORMAT_YUV_420_888 /* 35 */:
                case '$':
                case '%':
                case SubAllocator.N_INDEXES /* 38 */:
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (charAt) {
                        case ':':
                        case ';':
                        case Compress.DC /* 60 */:
                        case '=':
                        case '>':
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (charAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (charAt) {
                                        case '{':
                                        case ModelPPM.MAX_FREQ /* 124 */:
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public static boolean I(Context context) {
        boolean z;
        ((sb1) ((al2) hv.D(context, al2.class))).getClass();
        Set set = Collections.EMPTY_SET;
        if (set.size() <= 1) {
            z = true;
        } else {
            z = false;
        }
        qo2.o(z, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (set.isEmpty()) {
            return true;
        }
        return ((Boolean) set.iterator().next()).booleanValue();
    }

    public static final boolean J(sm3 sm3Var) {
        sm3 sm3Var2;
        if (sm3Var.e0 != null) {
            sm3 v = sm3Var.v();
            if (v != null) {
                sm3Var2 = v.e0;
            } else {
                sm3Var2 = null;
            }
            if (sm3Var2 == null || sm3Var.C0.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String[] K(Context context, String str, Bundle bundle) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            kj2.f0("QuirkSettingsLoader", "Resource ID not found for key: ".concat(str));
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i);
        } catch (Resources.NotFoundException e) {
            kj2.g0("QuirkSettingsLoader", "Quirk class names resource not found: " + i, e);
            return new String[0];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v13, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v17, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v21, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v24, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v27, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v29, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v32, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v33, types: [w83, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v39, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v42, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v45, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v48, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v50, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v53, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v55, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v59, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v61, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v63, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v66, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v69, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v7, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v72, types: [yc1] */
    /* JADX WARN: Type inference failed for: r1v73, types: [x83] */
    /* JADX WARN: Type inference failed for: r1v74, types: [yc1] */
    public static s83 L(String str) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        ?? M;
        int i7;
        int i8;
        boolean z;
        int i9;
        long j;
        char charAt;
        char charAt2;
        str.getClass();
        if (str.length() == 0) {
            M = new yc1((CharSequence) str, "An empty string is not a valid Instant");
        } else {
            char charAt3 = str.charAt(0);
            if (charAt3 != '+' && charAt3 != '-') {
                i = 0;
                charAt3 = ' ';
            } else {
                i = 1;
            }
            int i10 = 0;
            int i11 = i;
            while (i11 < str.length() && '0' <= (charAt2 = str.charAt(i11)) && charAt2 < ':') {
                i10 = (i10 * 10) + (str.charAt(i11) - '0');
                i11++;
            }
            int i12 = i11 - i;
            if (i12 > 10) {
                M = nb3.M(str, "Expected at most 10 digits for the year number, got " + i12 + " digits");
            } else if (i12 == 10 && nb3.p(str.charAt(i), 50) >= 0) {
                M = nb3.M(str, "Expected at most 9 digits for the year number or year 1000000000, got " + i12 + " digits");
            } else if (i12 < 4) {
                M = nb3.M(str, "The year number must be padded to 4 digits, got " + i12 + " digits");
            } else if (charAt3 == '+' && i12 == 4) {
                M = nb3.M(str, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
            } else if (charAt3 == ' ' && i12 != 4) {
                M = nb3.M(str, "A '+' or '-' sign is required for year numbers longer than 4 digits");
            } else {
                if (charAt3 == '-') {
                    i10 = -i10;
                }
                int i13 = i11 + 16;
                if (str.length() < i13) {
                    M = nb3.M(str, "The input string is too short");
                } else {
                    yc1 L2 = nb3.L(str, "'-'", i11, new bz1(28));
                    if (L2 != null || (L2 = nb3.L(str, "'-'", i11 + 3, new bz1(29))) != null || (L2 = nb3.L(str, "'T' or 't'", i11 + 6, new v83(0))) != null || (L2 = nb3.L(str, "':'", i11 + 9, new v83(1))) != null || (L2 = nb3.L(str, "':'", i11 + 12, new v83(2))) != null) {
                        M = L2;
                    } else {
                        int[] iArr = nb3.n;
                        int i14 = 0;
                        while (true) {
                            if (i14 < 10) {
                                M = nb3.L(str, "an ASCII digit", i11 + iArr[i14], new v83(3));
                                if (M != 0) {
                                    break;
                                }
                                i14++;
                            } else {
                                int N = nb3.N(i11 + 1, str);
                                int N2 = nb3.N(i11 + 4, str);
                                int N3 = nb3.N(i11 + 7, str);
                                int N4 = nb3.N(i11 + 10, str);
                                int N5 = nb3.N(i11 + 13, str);
                                int i15 = i11 + 15;
                                if (str.charAt(i15) == '.') {
                                    i15 = i13;
                                    int i16 = 0;
                                    while (i15 < str.length() && '0' <= (charAt = str.charAt(i15)) && charAt < ':') {
                                        i16 = (i16 * 10) + (str.charAt(i15) - '0');
                                        i15++;
                                    }
                                    int i17 = i15 - i13;
                                    if (1 <= i17 && i17 < 10) {
                                        i2 = i16 * nb3.m[9 - i17];
                                    } else {
                                        M = nb3.M(str, "1..9 digits are supported for the fraction of the second, got " + i17 + " digits");
                                    }
                                } else {
                                    i2 = 0;
                                }
                                if (i15 >= str.length()) {
                                    M = nb3.M(str, "The UTC offset at the end of the string is missing");
                                } else {
                                    char charAt4 = str.charAt(i15);
                                    if (charAt4 != '+' && charAt4 != '-') {
                                        if (charAt4 != 'Z' && charAt4 != 'z') {
                                            M = nb3.M(str, "Expected the UTC offset at position " + i15 + ", got '" + charAt4 + '\'');
                                        } else {
                                            int i18 = i15 + 1;
                                            if (str.length() == i18) {
                                                i6 = 0;
                                                if (1 > N) {
                                                }
                                                M = nb3.M(str, "Expected a month number in 1..12, got " + N);
                                            } else {
                                                M = nb3.M(str, "Extra text after the instant at position " + i18);
                                            }
                                        }
                                    } else {
                                        int length = str.length() - i15;
                                        if (length > 9) {
                                            M = nb3.M(str, "The UTC offset string \"" + nb3.e0(16, str.subSequence(i15, str.length()).toString()) + "\" is too long");
                                        } else if (length % 3 != 0) {
                                            M = nb3.M(str, "Invalid UTC offset string \"" + str.subSequence(i15, str.length()).toString() + '\"');
                                        } else {
                                            int[] iArr2 = nb3.o;
                                            for (int i19 = 0; i19 < 2 && (i8 = iArr2[i19] + i15) < str.length(); i19++) {
                                                if (str.charAt(i8) != ':') {
                                                    StringBuilder t = xg6.t("Expected ':' at index ", i8, ", got '");
                                                    t.append(str.charAt(i8));
                                                    t.append('\'');
                                                    M = nb3.M(str, t.toString());
                                                    break;
                                                }
                                            }
                                            int[] iArr3 = nb3.p;
                                            int i20 = 0;
                                            while (i20 < 6 && (i7 = iArr3[i20] + i15) < str.length()) {
                                                char charAt5 = str.charAt(i7);
                                                int[] iArr4 = iArr3;
                                                if ('0' <= charAt5 && charAt5 < ':') {
                                                    i20++;
                                                    iArr3 = iArr4;
                                                } else {
                                                    StringBuilder t2 = xg6.t("Expected an ASCII digit at index ", i7, ", got '");
                                                    t2.append(str.charAt(i7));
                                                    t2.append('\'');
                                                    M = nb3.M(str, t2.toString());
                                                    break;
                                                }
                                            }
                                            int N6 = nb3.N(i15 + 1, str);
                                            if (length > 3) {
                                                i3 = nb3.N(i15 + 4, str);
                                            } else {
                                                i3 = 0;
                                            }
                                            if (length > 6) {
                                                i4 = nb3.N(i15 + 7, str);
                                            } else {
                                                i4 = 0;
                                            }
                                            if (i3 > 59) {
                                                M = nb3.M(str, "Expected offset-minute-of-hour in 0..59, got " + i3);
                                            } else if (i4 > 59) {
                                                M = nb3.M(str, "Expected offset-second-of-minute in 0..59, got " + i4);
                                            } else if (N6 > 17 && (N6 != 18 || i3 != 0 || i4 != 0)) {
                                                M = nb3.M(str, "Expected an offset in -18:00..+18:00, got " + str.subSequence(i15, str.length()).toString());
                                            } else {
                                                int i21 = (i3 * 60) + (N6 * 3600) + i4;
                                                if (charAt4 == '-') {
                                                    i5 = -1;
                                                } else {
                                                    i5 = 1;
                                                }
                                                i6 = i21 * i5;
                                                if (1 > N && N < 13) {
                                                    if (1 <= N2) {
                                                        int i22 = i10 & 3;
                                                        if (i22 == 0 && (i10 % 100 != 0 || i10 % 400 == 0)) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        if (N != 2) {
                                                            if (N != 4 && N != 6 && N != 9 && N != 11) {
                                                                i9 = 31;
                                                            } else {
                                                                i9 = 30;
                                                            }
                                                        } else if (z) {
                                                            i9 = 29;
                                                        } else {
                                                            i9 = 28;
                                                        }
                                                        if (N2 <= i9) {
                                                            if (N3 > 23) {
                                                                M = nb3.M(str, "Expected hour in 0..23, got " + N3);
                                                            } else if (N4 > 59) {
                                                                M = nb3.M(str, "Expected minute-of-hour in 0..59, got " + N4);
                                                            } else if (N5 > 59) {
                                                                M = nb3.M(str, "Expected second-of-minute in 0..59, got " + N5);
                                                            } else {
                                                                long j2 = i10;
                                                                long j3 = 365 * j2;
                                                                if (j2 >= 0) {
                                                                    j = ((j2 + 399) / 400) + (((j2 + 3) / 4) - ((j2 + 99) / 100)) + j3;
                                                                } else {
                                                                    j = j3 - ((j2 / (-400)) + ((j2 / (-4)) - (j2 / (-100))));
                                                                }
                                                                long j4 = j + (((N * 367) - 362) / 12) + (N2 - 1);
                                                                if (N > 2) {
                                                                    j4 = (i22 == 0 && (i10 % 100 != 0 || i10 % 400 == 0)) ? (-1) + j4 : j4 - 2;
                                                                }
                                                                M = new Object();
                                                                M.A = (((j4 - 719528) * 86400) + (((N4 * 60) + (N3 * 3600)) + N5)) - i6;
                                                                M.B = i2;
                                                            }
                                                        }
                                                    }
                                                    StringBuilder q = i61.q(N, i10, "Expected a valid day-of-month for month ", " of year ", ", got ");
                                                    q.append(N2);
                                                    M = nb3.M(str, q.toString());
                                                } else {
                                                    M = nb3.M(str, "Expected a month number in 1..12, got " + N);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return M.toInstant();
    }

    public static void M(long j, fp fpVar, boolean z, bg2 bg2Var) {
        int i;
        if (z) {
            int i2 = k47.c;
            int i3 = (int) (j >> 32);
            int i4 = (int) (j & 4294967295L);
            int i5 = 10;
            if (i3 > 0) {
                i = Character.codePointBefore(fpVar, i3);
            } else {
                i = 10;
            }
            if (i4 < fpVar.B.length()) {
                i5 = Character.codePointAt(fpVar, i4);
            }
            if (kn2.Q(i) && (kn2.P(i5) || kn2.N(i5))) {
                do {
                    i3 -= Character.charCount(i);
                    if (i3 == 0) {
                        break;
                    }
                    i = Character.codePointBefore(fpVar, i3);
                } while (kn2.Q(i));
                j = jx2.f(i3, i4);
            } else if (kn2.Q(i5) && (kn2.P(i) || kn2.N(i))) {
                do {
                    i4 += Character.charCount(i5);
                    if (i4 == fpVar.B.length()) {
                        break;
                    }
                    i5 = Character.codePointAt(fpVar, i4);
                } while (kn2.Q(i5));
                j = jx2.f(i3, i4);
            }
        }
        int i6 = (int) (4294967295L & j);
        bg2Var.g(new sv2(new ds1[]{new dd6(i6, i6), new hh1(k47.d(j), 0)}));
    }

    public static final void N(Bundle bundle, String str, List list) {
        ArrayList<String> arrayList;
        if (list instanceof ArrayList) {
            arrayList = (ArrayList) list;
        } else {
            arrayList = new ArrayList<>(list);
        }
        bundle.putStringArrayList(str, arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashSet O(String[] strArr) {
        Class<?> cls;
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            try {
                cls = Class.forName(str);
            } catch (ClassNotFoundException e) {
                kj2.g0("QuirkSettingsLoader", "Class not found: " + str, e);
            }
            if (!u65.class.isAssignableFrom(cls)) {
                kj2.f0("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
                cls = null;
                if (cls == null) {
                }
            } else {
                if (cls == null) {
                    hashSet.add(cls);
                }
            }
        }
        return hashSet;
    }

    public static final void P(co4 co4Var, int i, Object obj) {
        co4Var.g[(co4Var.h - co4Var.c[co4Var.d - 1].c) + i] = obj;
    }

    public static final void Q(co4 co4Var, int i, Object obj, int i2, Object obj2) {
        int i3 = co4Var.h - co4Var.c[co4Var.d - 1].c;
        Object[] objArr = co4Var.g;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static void R(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            m87.a(view, charSequence);
            return;
        }
        o87 o87Var = o87.g0;
        if (o87Var != null && o87Var.A == view) {
            o87.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            o87 o87Var2 = o87.h0;
            if (o87Var2 != null && o87Var2.A == view) {
                o87Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new o87(view, charSequence);
    }

    public static int S(char c, int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int T(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            if (charAt != '\t' && charAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final long U(long j, long j2, long j3, String str) {
        String str2;
        int i = xx6.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long i0 = xs6.i0(str2);
        if (i0 != null) {
            long longValue = i0.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            xg6.B(sb, "..", j3, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int V(int i, int i2, String str) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 2097150;
        }
        return (int) U(i, 1L, i3, str);
    }

    public static final Object W(sb4 sb4Var, ar0 ar0Var) {
        sb4Var.getClass();
        Bundle c = sb4Var.d0.c();
        if (c == null) {
            c = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
        }
        Map c2 = sb4Var.B.c();
        LinkedHashMap linkedHashMap = new LinkedHashMap(c14.k0(c2.size()));
        for (Map.Entry entry : c2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((rb4) entry.getValue()).a);
        }
        return jx2.K(ar0Var).c(new e26(c, linkedHashMap));
    }

    public static final of6 a() {
        return pf6.b(0, 1, m80.DROP_OLDEST, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final sr4 sr4Var, final a74 a74Var, ic icVar, z31 z31Var, float f, px0 px0Var, final int i, final int i2) {
        int i3;
        ic icVar2;
        int i4;
        int i5;
        z31 z31Var2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        final float f2;
        final ic icVar3;
        final z31 z31Var3;
        cf5 t;
        int i12;
        e40 e40Var;
        w31 w31Var;
        float f3;
        int i13;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1142754848);
        if (xq2Var.h(sr4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i14 = i3 | i;
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.f(a74Var)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i14 |= i13;
        }
        int i15 = i2 & 8;
        if (i15 != 0) {
            i5 = i14 | 3072;
            icVar2 = icVar;
        } else {
            icVar2 = icVar;
            if (xq2Var.f(icVar2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i14 | i4;
        }
        int i16 = i2 & 16;
        if (i16 != 0) {
            i5 |= 24576;
        } else if ((i & 24576) == 0) {
            z31Var2 = z31Var;
            if (xq2Var.f(z31Var2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i5 |= i6;
            i7 = i2 & 32;
            if (i7 == 0) {
                i9 = i5 | 196608;
            } else {
                if (xq2Var.c(f)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i9 = i5 | i8;
            }
            if ((i2 & 64) == 0) {
                i10 = 1572864;
            } else if (xq2Var.f(null)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i11 = i9 | i10;
            if ((599187 & i11) == 599186) {
                z = true;
            } else {
                z = false;
            }
            if (!xq2Var.S(i11 & 1, z)) {
                if (i15 != 0) {
                    e40Var = d90.Z;
                    i12 = i7;
                } else {
                    i12 = i7;
                    e40Var = icVar2;
                }
                if (i16 != 0) {
                    w31Var = y31.b;
                } else {
                    w31Var = z31Var2;
                }
                if (i12 != 0) {
                    f3 = 1.0f;
                } else {
                    f3 = f;
                }
                xq2Var.b0(1899381698);
                xq2Var.p(false);
                a74 u0 = ak7.u0(u24.h(a74Var.d(x64.a)), sr4Var, e40Var, w31Var, f3, null, 2);
                Object P = xq2Var.P();
                if (P == ox0.a) {
                    P = fc.j;
                    xq2Var.l0(P);
                }
                e34 e34Var = (e34) P;
                int hashCode = Long.hashCode(xq2Var.T);
                a74 E = l.E(xq2Var, u0);
                xv4 l = xq2Var.l();
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, e34Var);
                yh2.K(xq2Var, ix0.e, l);
                yh2.F(xq2Var, ix0.h);
                yh2.K(xq2Var, ix0.d, E);
                yh2.K(xq2Var, ix0.g, Integer.valueOf(hashCode));
                xq2Var.p(true);
                icVar3 = e40Var;
                z31Var3 = w31Var;
                f2 = f3;
            } else {
                xq2Var.V();
                f2 = f;
                icVar3 = icVar2;
                z31Var3 = z31Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: k23
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        bl2.b(sr4.this, a74Var, icVar3, z31Var3, f2, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        z31Var2 = z31Var;
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i2 & 64) == 0) {
        }
        i11 = i9 | i10;
        if ((599187 & i11) == 599186) {
        }
        if (!xq2Var.S(i11 & 1, z)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final void c(zh zhVar, a74 a74Var, int i, px0 px0Var, int i2, int i3) {
        z31 z31Var;
        e40 e40Var = d90.Z;
        if ((i3 & 16) != 0) {
            z31Var = y31.b;
        } else {
            z31Var = y31.a;
        }
        z31 z31Var2 = z31Var;
        if ((i3 & 128) != 0) {
            i = 1;
        }
        xq2 xq2Var = (xq2) px0Var;
        boolean f = xq2Var.f(zhVar);
        Object P = xq2Var.P();
        if (f || P == ox0.a) {
            P = g04.h(zhVar, i);
            xq2Var.l0(P);
        }
        b((w40) P, a74Var, e40Var, z31Var2, 1.0f, xq2Var, (i2 & 896) | 56 | (57344 & i2), 0);
    }

    public static final void d(zv0 zv0Var, px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(441837433);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            Object P = xq2Var.P();
            Object obj = ox0.a;
            if (P == obj) {
                P = new Object();
                xq2Var.l0(P);
            }
            Object obj2 = (tz3) P;
            Object P2 = xq2Var.P();
            if (P2 == obj) {
                P2 = iy0.j0;
                xq2Var.l0(P2);
            }
            on2 on2Var = (on2) P2;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(on2Var);
            } else {
                xq2Var.o0();
            }
            if (xq2Var.S) {
                xq2Var.b(new z17(6), jg7.a);
            }
            yh2.K(xq2Var, pn.j0, obj2);
            zv0Var.e(obj2, xq2Var, 48);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new uz3(zv0Var, i, 0);
        }
    }

    public static final void e(final boolean z, final zv0 zv0Var, px0 px0Var, final int i, final int i2) {
        int i3;
        boolean z2;
        es7 es7Var;
        int i4;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1734155591);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0 && xq2Var.g(z)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i3 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i3 & 1, z2)) {
            xq2Var.X();
            if ((i & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                int i5 = i2 & 1;
            } else if ((i2 & 1) != 0) {
                if ((((Configuration) xq2Var.j(kf.a)).uiMode & 48) == 32) {
                    z = true;
                } else {
                    z = false;
                }
            }
            xq2Var.q();
            switch (a44.a[((g57) ht.a.getValue()).ordinal()]) {
                case 1:
                    es7Var = fs7.b;
                    break;
                case 2:
                    es7Var = fs7.c;
                    break;
                case 3:
                    es7Var = fs7.d;
                    break;
                case 4:
                    es7Var = fs7.e;
                    break;
                case 5:
                    es7Var = fs7.f;
                    break;
                case 6:
                    es7Var = fs7.g;
                    break;
                case 7:
                    es7Var = fs7.h;
                    break;
                case 8:
                    es7Var = fs7.a;
                    break;
                case 9:
                    if (z) {
                        es7Var = fs7.a;
                        break;
                    } else {
                        es7Var = fs7.b;
                        break;
                    }
                default:
                    i.d();
                    return;
            }
            hv.d(fs7.i.a(es7Var), n16.I(-889841799, new ql1(24, es7Var, zv0Var), xq2Var), xq2Var, 56);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: z34
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(i | 1);
                    bl2.e(z, zv0Var, (px0) obj, a0, i2);
                    return jg7.a;
                }
            };
        }
    }

    public static final void f(pq5 pq5Var, on2 on2Var, qn2 qn2Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        pq5Var.getClass();
        on2Var.getClass();
        qn2Var.getClass();
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(457736354);
        if ((i & 6) == 0) {
            if (xq2Var.h(pq5Var)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.h(on2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(qn2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            Context context = (Context) xq2Var.j(kf.b);
            F(xq2Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (P == vs0Var) {
                P = np2.Y(0);
                xq2Var.l0(P);
            }
            qa4 qa4Var = (qa4) P;
            boolean f = xq2Var.f(pq5Var);
            Object P2 = xq2Var.P();
            if (f || P2 == vs0Var) {
                String k0 = hf.k0(pq5Var);
                P2 = hf.c0(new qe4("r1", "RedTrainer_DS", k0, "Wiimmfi WFC", 2, 4, 32), new qe4("r2", "SpeedRacer_99", "Mario Kart DS", "Kaeru WFC", 3, 8, 24), new qe4("r3", "GhostHunter", "Metroid Prime Hunters", "AltWFC", 1, 4, 45), new qe4("r4", "PokéMaster_Alex", "Pokemon HeartGold", "Wiimmfi WFC", 1, 2, 18), new qe4("r5", "Local_Champion", k0, "NiFi Local Mesh", 1, 4, 4));
                xq2Var.l0(P2);
            }
            nw7.o(on2Var, new jj1(3, false, false), n16.I(717987385, new ne4((List) P2, qn2Var, on2Var, qa4Var, context, 0), xq2Var), xq2Var, ((i2 >> 3) & 14) | 432, 0);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new rl(pq5Var, on2Var, qn2Var, i, 15);
        }
    }

    public static final void g(zv0 zv0Var, eo2 eo2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1302703572);
        if (xq2Var.h(zv0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (xq2Var.h(eo2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            x64 x64Var = x64.a;
            a74 S = ge7.S(x64Var, 16.0f, RecyclerView.B1, 8.0f, RecyclerView.B1, 10);
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = new fc(11);
                xq2Var.l0(P);
            }
            e34 e34Var = (e34) P;
            int B2 = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, S);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, e34Var);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            pn pnVar3 = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                i61.v(B2, xq2Var, B2, pnVar3);
            }
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 Q = ge7.Q(lb4.D(x64Var, "text"), RecyclerView.B1, 6.0f, 1);
            e40 e40Var = d90.L;
            e34 d = h70.d(e40Var, false);
            int B3 = ge7.B(xq2Var);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, Q);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d);
            yh2.K(xq2Var, pnVar2, l2);
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B3))) {
                i61.v(B3, xq2Var, B3, pnVar3);
            }
            yh2.K(xq2Var, pnVar4, E2);
            zv0Var.o(xq2Var, Integer.valueOf(i5 & 14));
            xq2Var.p(true);
            a74 D = lb4.D(x64Var, "action");
            e34 d2 = h70.d(e40Var, false);
            int B4 = ge7.B(xq2Var);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, D);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l3);
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B4))) {
                i61.v(B4, xq2Var, B4, pnVar3);
            }
            yh2.K(xq2Var, pnVar4, E3);
            eo2Var.o(xq2Var, Integer.valueOf((i5 >> 3) & 14));
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new hl6(zv0Var, eo2Var, i);
        }
    }

    public static final void h(final qe4 qe4Var, final on2 on2Var, px0 px0Var, int i) {
        int i2;
        int i3;
        boolean z;
        on2 on2Var2;
        boolean z2;
        boolean z3;
        long c;
        boolean z4;
        boolean z5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-860293387);
        if (xq2Var.f(qe4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (xq2Var.h(on2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i5 & 1, z)) {
            final Context context = (Context) xq2Var.j(kf.b);
            x64 x64Var = x64.a;
            a74 g = u24.g(dj6.c(x64Var, 1.0f), z16.b(14.0f));
            long c2 = hv.c(4280165427L);
            jy2 jy2Var = u24.m;
            a74 L2 = vy7.L(g, c2, jy2Var);
            boolean h = xq2Var.h(context);
            int i6 = i5 & 14;
            if (i6 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h | z2;
            int i7 = i5 & 112;
            if (i7 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (z7 || P == vs0Var) {
                P = new on2() { // from class: me4
                    @Override // defpackage.on2
                    public final Object c() {
                        int i8 = r4;
                        jg7 jg7Var = jg7.a;
                        on2 on2Var3 = on2Var;
                        qe4 qe4Var2 = qe4Var;
                        Context context2 = context;
                        switch (i8) {
                            case 0:
                                String str = qe4Var2.b;
                                Toast.makeText(context2, "Подключение к комнате " + str + "...", 0).show();
                                on2Var3.c();
                                return jg7Var;
                            default:
                                String str2 = qe4Var2.b;
                                Toast.makeText(context2, "Подключение к комнате " + str2 + "...", 0).show();
                                on2Var3.c();
                                return jg7Var;
                        }
                    }
                };
                xq2Var.l0(P);
            }
            a74 O = ge7.O(mb3.u(L2, false, null, (on2) P, 15), 14.0f);
            l26 a = k26.a(ju.a, d90.i0, xq2Var, 48);
            int hashCode = Long.hashCode(xq2Var.T);
            xv4 l = xq2Var.l();
            a74 E = l.E(xq2Var, O);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, a);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            pn pnVar3 = ix0.g;
            yh2.K(xq2Var, pnVar3, valueOf);
            ne neVar = ix0.h;
            yh2.F(xq2Var, neVar);
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 L3 = vy7.L(u24.g(dj6.i(x64Var, 38.0f), z16.a), kt0.c(0.18f, hv.c(4278248959L)), jy2Var);
            e34 d = h70.d(d90.Z, false);
            int hashCode2 = Long.hashCode(xq2Var.T);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, L3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d);
            yh2.K(xq2Var, pnVar2, l2);
            i61.w(hashCode2, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E2);
            i13.a(dt7.a(), null, dj6.i(x64Var, 20.0f), hv.c(4278248959L), xq2Var, 3504, 0);
            xq2Var.p(true);
            gi2.h(xq2Var, dj6.l(x64Var, 12.0f));
            vn3 vn3Var = new vn3(1.0f, true);
            yt0 a2 = wt0.a(ju.c, d90.k0, xq2Var, 0);
            int hashCode3 = Long.hashCode(xq2Var.T);
            xv4 l3 = xq2Var.l();
            a74 E3 = l.E(xq2Var, vn3Var);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a2);
            yh2.K(xq2Var, pnVar2, l3);
            i61.w(hashCode3, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E3);
            String str = qe4Var.b;
            int i8 = qe4Var.g;
            String concat = str.concat("'s Match");
            long j = kt0.d;
            pi2 pi2Var = qs7.a;
            long E4 = hi2.E(13);
            oj2 oj2Var = oj2.e0;
            x37.b(concat, null, j, E4, oj2Var, pi2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772928, 0, 130962);
            String m = lb1.m(qe4Var.c, " • ", qe4Var.d);
            long c3 = kt0.c(0.6f, j);
            sr2 sr2Var = qs7.c;
            x37.b(m, null, c3, hi2.D(9.5d), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1576320, 0, 130994);
            a74 S = ge7.S(x64Var, RecyclerView.B1, 2.0f, RecyclerView.B1, RecyclerView.B1, 13);
            l26 a3 = k26.a(new gu(8.0f, true, new i(1)), d90.h0, xq2Var, 6);
            int hashCode4 = Long.hashCode(xq2Var.T);
            xv4 l4 = xq2Var.l();
            a74 E5 = l.E(xq2Var, S);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, a3);
            yh2.K(xq2Var, pnVar2, l4);
            i61.w(hashCode4, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E5);
            x37.b(lb1.j("Игроки: ", qe4Var.e, qe4Var.f, "/"), null, hv.c(4279286145L), hi2.E(9), oj2Var, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772928, 0, 130962);
            String str2 = i8 + " ms";
            if (i8 < 30) {
                c = hv.c(4279286145L);
            } else {
                c = hv.c(4294688548L);
            }
            x37.b(str2, null, c, hi2.E(9), null, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1575936, 0, 130994);
            xq2Var.p(true);
            xq2Var.p(true);
            a74 L4 = vy7.L(u24.g(x64Var, z16.b(8.0f)), hv.c(4278248959L), jy2Var);
            boolean h2 = xq2Var.h(context);
            if (i6 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = h2 | z4;
            if (i7 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = z8 | z5;
            Object P2 = xq2Var.P();
            if (z9 || P2 == vs0Var) {
                P2 = new on2() { // from class: me4
                    @Override // defpackage.on2
                    public final Object c() {
                        int i82 = r4;
                        jg7 jg7Var = jg7.a;
                        on2 on2Var3 = on2Var;
                        qe4 qe4Var2 = qe4Var;
                        Context context2 = context;
                        switch (i82) {
                            case 0:
                                String str3 = qe4Var2.b;
                                Toast.makeText(context2, "Подключение к комнате " + str3 + "...", 0).show();
                                on2Var3.c();
                                return jg7Var;
                            default:
                                String str22 = qe4Var2.b;
                                Toast.makeText(context2, "Подключение к комнате " + str22 + "...", 0).show();
                                on2Var3.c();
                                return jg7Var;
                        }
                    }
                };
                xq2Var.l0(P2);
            }
            a74 P3 = ge7.P(mb3.u(L4, false, null, (on2) P2, 15), 12.0f, 6.0f);
            e34 d2 = h70.d(d90.L, false);
            int hashCode5 = Long.hashCode(xq2Var.T);
            xv4 l5 = xq2Var.l();
            a74 E6 = l.E(xq2Var, P3);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d2);
            yh2.K(xq2Var, pnVar2, l5);
            i61.w(hashCode5, xq2Var, pnVar3, xq2Var, neVar);
            yh2.K(xq2Var, pnVar4, E6);
            on2Var2 = on2Var;
            x37.b("ВОЙТИ", null, kt0.b, hi2.E(10), oj2Var, sr2Var, 0L, null, 0L, 0, false, 0, 0, null, null, xq2Var, 1772934, 0, 130962);
            xq2Var = xq2Var;
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            on2Var2 = on2Var;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new ql1(qe4Var, i, 26, on2Var2);
        }
    }

    public static final void i(a74 a74Var, eo2 eo2Var, ke6 ke6Var, long j, long j2, float f, zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        xq2 xq2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(-662779944);
        if ((i & 6) == 0) {
            if (xq2Var2.f(a74Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var2.h(eo2Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        boolean z = false;
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var2.g(false)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (xq2Var2.f(ke6Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (xq2Var2.e(j)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (xq2Var2.e(j2)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i2 |= i5;
        }
        if ((i & 1572864) == 0) {
            if (xq2Var2.c(f)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((12582912 & i) == 0) {
            if (xq2Var2.h(zv0Var)) {
                i3 = 8388608;
            } else {
                i3 = Compress.MAXWINSIZE;
            }
            i2 |= i3;
        }
        if ((4793491 & i2) != 4793490) {
            z = true;
        }
        if (xq2Var2.S(i2 & 1, z)) {
            xq2Var2.X();
            if ((i & 1) != 0 && !xq2Var2.B()) {
                xq2Var2.V();
            }
            xq2Var2.q();
            int i11 = i2 >> 6;
            xq2Var = xq2Var2;
            ej2.c(a74Var, ke6Var, j, j2, f, n16.I(-1429068516, new hl6(eo2Var, zv0Var, 3), xq2Var2), xq2Var, 1572864 | (i2 & 14) | (i11 & 112) | (i11 & 896) | (i11 & 7168) | ((i2 >> 3) & 458752), 16);
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new dq(a74Var, eo2Var, ke6Var, j, j2, f, zv0Var, i);
        }
    }

    public static final void j(final el6 el6Var, a74 a74Var, ke6 ke6Var, long j, long j2, long j3, float f, px0 px0Var, final int i) {
        int i2;
        boolean z;
        xq2 xq2Var;
        final a74 a74Var2;
        final ke6 ke6Var2;
        final long j4;
        final long j5;
        final long j6;
        final float f2;
        int i3;
        int i4;
        long h;
        int i5;
        a74 a74Var3;
        long j7;
        long j8;
        float f3;
        y16 y16Var;
        zv0 zv0Var;
        boolean h2;
        int i6;
        xq2 xq2Var2 = (xq2) px0Var;
        xq2Var2.d0(258660814);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h2 = xq2Var2.f(el6Var);
            } else {
                h2 = xq2Var2.h(el6Var);
            }
            if (h2) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        int i7 = i2 | 432;
        if ((i & 3072) == 0) {
            i7 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i7 |= 8192;
        }
        if ((196608 & i) == 0) {
            i7 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i7 |= 524288;
        }
        int i8 = i7 | 12582912;
        if ((4793491 & i8) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var2.S(i8 & 1, z)) {
            xq2Var2.X();
            if ((i & 1) != 0 && !xq2Var2.B()) {
                xq2Var2.V();
                a74Var3 = a74Var;
                y16Var = ke6Var;
                j7 = j;
                j8 = j2;
                f3 = f;
                i3 = 12582912;
                i5 = i8 & (-4193281);
                h = j3;
            } else {
                y16 y16Var2 = ((ye6) xq2Var2.j(ze6.a)).a;
                nq6 nq6Var = vt0.a;
                long l = hv.l(kt0.c(0.8f, ((ut0) xq2Var2.j(nq6Var)).f()), ((ut0) xq2Var2.j(nq6Var)).j());
                long j9 = ((ut0) xq2Var2.j(nq6Var)).j();
                ut0 ut0Var = (ut0) xq2Var2.j(nq6Var);
                if (ut0Var.k()) {
                    i3 = 12582912;
                    i4 = i8;
                    h = hv.l(kt0.c(0.6f, ut0Var.j()), ut0Var.g());
                } else {
                    i3 = 12582912;
                    i4 = i8;
                    h = ut0Var.h();
                }
                i5 = i4 & (-4193281);
                a74Var3 = x64.a;
                j7 = l;
                j8 = j9;
                f3 = 6.0f;
                y16Var = y16Var2;
            }
            xq2Var2.q();
            String str = el6Var.b;
            if (str != null) {
                xq2Var2.b0(593497188);
                zv0Var = n16.I(1843479216, new i7(h, el6Var, str), xq2Var2);
                xq2Var2.p(false);
            } else {
                xq2Var2.b0(593796152);
                xq2Var2.p(false);
                zv0Var = null;
            }
            xq2Var = xq2Var2;
            i(ge7.O(a74Var3, 12.0f), zv0Var, y16Var, j7, j8, f3, n16.I(-261845785, new bl6(el6Var, 1), xq2Var2), xq2Var, (i5 & 896) | i3 | ((i5 >> 3) & 3670016));
            long j10 = h;
            a74Var2 = a74Var3;
            j6 = j10;
            ke6Var2 = y16Var;
            j4 = j7;
            j5 = j8;
            f2 = f3;
        } else {
            xq2Var = xq2Var2;
            xq2Var.V();
            a74Var2 = a74Var;
            ke6Var2 = ke6Var;
            j4 = j;
            j5 = j2;
            j6 = j3;
            f2 = f;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2() { // from class: il6
                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    bl2.j(el6.this, a74Var2, ke6Var2, j4, j5, j6, f2, (px0) obj, ii2.a0(i | 1));
                    return jg7.a;
                }
            };
        }
    }

    public static final void k(boolean z, jl5 jl5Var, p27 p27Var, px0 px0Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        b47 d;
        int i3;
        int i4;
        int i5;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(-1344558920);
        if ((i & 6) == 0) {
            if (xq2Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (xq2Var.d(jl5Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            if (xq2Var.h(p27Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (xq2Var.S(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f = z3 | xq2Var.f(p27Var);
            Object P = xq2Var.P();
            vs0 vs0Var = ox0.a;
            if (f || P == vs0Var) {
                P = new m27(p27Var, z);
                xq2Var.l0(P);
            }
            g17 g17Var = (g17) P;
            boolean h = xq2Var.h(p27Var);
            if (i6 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | h;
            Object P2 = xq2Var.P();
            if (z5 || P2 == vs0Var) {
                P2 = new q27(p27Var, z);
                xq2Var.l0(P2);
            }
            ok4 ok4Var = (ok4) P2;
            boolean g = k47.g(p27Var.n().b);
            if (z) {
                j = p27Var.n().b >> 32;
            } else {
                j = p27Var.n().b & 4294967295L;
            }
            int i7 = (int) j;
            jt3 jt3Var = p27Var.d;
            float f2 = RecyclerView.B1;
            if (jt3Var != null && (d = jt3Var.d()) != null) {
                a47 a47Var = d.a;
                if (i7 >= 0) {
                    z37 z37Var = a47Var.a;
                    v84 v84Var = a47Var.b;
                    if (z37Var.a.B.length() != 0) {
                        int min = Math.min(v84Var.d(i7), Math.min(v84Var.b - 1, v84Var.f - 1));
                        if (i7 <= v84Var.c(min, false)) {
                            v84Var.m(min);
                            ArrayList arrayList = v84Var.h;
                            yr4 yr4Var = (yr4) arrayList.get(uj2.A(min, arrayList));
                            cj cjVar = yr4Var.a;
                            int i8 = min - yr4Var.d;
                            y37 y37Var = cjVar.d;
                            f2 = y37Var.e(i8) - y37Var.g(i8);
                        }
                    }
                }
            }
            float f3 = f2;
            boolean h2 = xq2Var.h(g17Var);
            Object P3 = xq2Var.P();
            if (h2 || P3 == vs0Var) {
                P3 = new rg(g17Var, 7);
                xq2Var.l0(P3);
            }
            mb3.l(ok4Var, z, jl5Var, g, 0L, f3, jw6.a(x64.a, g17Var, (PointerInputEventHandler) P3), xq2Var, (i2 << 3) & 1008);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new yl(z, jl5Var, p27Var, i);
        }
    }

    public static final void l(zv0 zv0Var, px0 px0Var, int i) {
        int i2;
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(343813818);
        if (xq2Var.h(zv0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i3 & 1, z)) {
            Object P = xq2Var.P();
            if (P == ox0.a) {
                P = fc.l;
                xq2Var.l0(P);
            }
            e34 e34Var = (e34) P;
            int B2 = ge7.B(xq2Var);
            xv4 l = xq2Var.l();
            x64 x64Var = x64.a;
            a74 E = l.E(xq2Var, x64Var);
            jx0.i.getClass();
            iy0 iy0Var = ix0.b;
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            pn pnVar = ix0.f;
            yh2.K(xq2Var, pnVar, e34Var);
            pn pnVar2 = ix0.e;
            yh2.K(xq2Var, pnVar2, l);
            pn pnVar3 = ix0.g;
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B2))) {
                i61.v(B2, xq2Var, B2, pnVar3);
            }
            pn pnVar4 = ix0.d;
            yh2.K(xq2Var, pnVar4, E);
            a74 P2 = ge7.P(x64Var, 16.0f, 6.0f);
            e34 d = h70.d(d90.L, false);
            int B3 = ge7.B(xq2Var);
            xv4 l2 = xq2Var.l();
            a74 E2 = l.E(xq2Var, P2);
            xq2Var.f0();
            if (xq2Var.S) {
                xq2Var.k(iy0Var);
            } else {
                xq2Var.o0();
            }
            yh2.K(xq2Var, pnVar, d);
            yh2.K(xq2Var, pnVar2, l2);
            if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B3))) {
                i61.v(B3, xq2Var, B3, pnVar3);
            }
            yh2.K(xq2Var, pnVar4, E2);
            zv0Var.o(xq2Var, Integer.valueOf(i3 & 14));
            xq2Var.p(true);
            xq2Var.p(true);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eq(zv0Var, i, 10);
        }
    }

    public static v65 m(Context context, Bundle bundle) {
        boolean z = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] K = K(context, "androidx.camera.core.quirks.FORCE_ENABLED", bundle);
        String[] K2 = K(context, "androidx.camera.core.quirks.FORCE_DISABLED", bundle);
        kj2.t("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        kj2.t("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z);
        kj2.t("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(K));
        kj2.t("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(K2));
        return new v65(z, new HashSet(O(K)), new HashSet(O(K2)));
    }

    public static final void n(View view) {
        view.getClass();
        rb6 C = qo2.C(new qg(view, null, 3));
        while (C.hasNext()) {
            ArrayList arrayList = D((View) C.next()).a;
            for (int U = hf.U(arrayList); -1 < U; U--) {
                ((do7) arrayList.get(U)).a.e();
            }
        }
    }

    public static String s(File file) {
        file.getClass();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList();
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (File file3 : listFiles) {
                if (file3.isFile()) {
                    arrayList2.add(file3);
                }
            }
            if (arrayList.size() == 1 && arrayList2.isEmpty()) {
                return ((File) gt0.H0(arrayList)).getName();
            }
            return null;
        }
        return null;
    }

    public static final of5 t(z64 z64Var, boolean z, boolean z2) {
        if (!z64Var.A.j0) {
            return of5.e;
        }
        if (!z) {
            eg4 d0 = nc1.d0(z64Var, 8);
            return ej2.w(d0).O(d0, z2);
        }
        return nc1.d0(z64Var, 8).u1();
    }

    public static final boolean u(long j, long j2) {
        if (j == j2) {
            return true;
        }
        return false;
    }

    public static void v(File file, File file2, no3 no3Var, ap5 ap5Var) {
        jc2.x0(file2);
        file2.mkdirs();
        File canonicalFile = file2.getCanonicalFile();
        try {
            ZipFile zipFile = new ZipFile(file);
            try {
                int size = zipFile.size();
                Enumeration<? extends ZipEntry> entries = zipFile.entries();
                int i = 0;
                while (entries.hasMoreElements()) {
                    l61 l61Var = ap5Var.B;
                    l61Var.getClass();
                    yh2.o(l61Var);
                    ZipEntry nextElement = entries.nextElement();
                    File canonicalFile2 = new File(canonicalFile, nextElement.getName()).getCanonicalFile();
                    String path = canonicalFile2.getPath();
                    path.getClass();
                    if (xs6.g0(path, canonicalFile.getPath() + File.separator, false)) {
                        if (nextElement.isDirectory()) {
                            canonicalFile2.mkdirs();
                        } else {
                            File parentFile = canonicalFile2.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                            InputStream inputStream = zipFile.getInputStream(nextElement);
                            FileOutputStream fileOutputStream = new FileOutputStream(canonicalFile2);
                            try {
                                inputStream.getClass();
                                long w = f04.w(inputStream, fileOutputStream);
                                fileOutputStream.close();
                                new Long(w);
                                inputStream.close();
                            } finally {
                            }
                        }
                        i++;
                        no3Var.o(new Integer(i), new Integer(size));
                    } else {
                        throw new Exception((Throwable) null);
                    }
                }
                zipFile.close();
            } finally {
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public static int w(HandwritingGesture handwritingGesture, bg2 bg2Var) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        bg2Var.g(new pu0(fallbackText, 1));
        return 5;
    }

    public static rj2 x(rj2[] rj2VarArr, int i) {
        int i2;
        boolean z;
        int i3;
        if ((i & 1) == 0) {
            i2 = 400;
        } else {
            i2 = 700;
        }
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        rj2 rj2Var = null;
        int i4 = Integer.MAX_VALUE;
        for (rj2 rj2Var2 : rj2VarArr) {
            int abs = Math.abs(rj2Var2.c - i2) * 2;
            if (rj2Var2.d == z) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i5 = abs + i3;
            if (rj2Var == null || i4 > i5) {
                rj2Var = rj2Var2;
                i4 = i5;
            }
        }
        return rj2Var;
    }

    public static final int y(int i, cq3 cq3Var, Object obj) {
        int e;
        if (obj != null && cq3Var.a() != 0 && ((i >= cq3Var.a() || !obj.equals(cq3Var.c(i))) && (e = cq3Var.e(obj)) != -1)) {
            return e;
        }
        return i;
    }

    public static s83 z(long j) {
        long j2 = j / 1000;
        if ((j ^ 1000) < 0 && j2 * 1000 != j) {
            j2--;
        }
        long j3 = j % 1000;
        int i = (int) ((j3 + (1000 & (((j3 ^ 1000) & ((-j3) | j3)) >> 63))) * 1000000);
        if (j2 < -31557014167219200L) {
            return s83.L;
        }
        if (j2 > 31556889864403199L) {
            return s83.R;
        }
        return A(i, j2);
    }

    public abstract Typeface o(Context context, bj2 bj2Var, Resources resources, int i);

    public abstract Typeface p(Context context, rj2[] rj2VarArr, int i);

    public Typeface q(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface r(Context context, Resources resources, int i, String str, int i2) {
        File M = kn2.M(context);
        if (M == null) {
            return null;
        }
        try {
            if (!kn2.x(M, resources, i)) {
                return null;
            }
            return Typeface.createFromFile(M.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            M.delete();
        }
    }
}
