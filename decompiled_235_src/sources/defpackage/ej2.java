package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import android.util.Base64;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.decode.Compress;
import java.net.URI;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej2  reason: default package */
/* loaded from: classes.dex */
public abstract class ej2 {
    public static e33 a = null;
    public static e33 b = null;
    public static e33 c = null;
    public static e33 d = null;
    public static Thread e = null;
    public static e33 f = null;
    public static boolean g = true;

    public static final int A(j36 j36Var, String str) {
        j36Var.getClass();
        return s(j36Var, str);
    }

    public static final int B(j36 j36Var, String str) {
        j36Var.getClass();
        int s = s(j36Var, str);
        if (s >= 0) {
            return s;
        }
        int columnCount = j36Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(j36Var.getColumnName(i));
        }
        e41.l("Column '", str, "' does not exist. Available columns: [", gt0.P0(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final e33 C() {
        e33 e33Var = b;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Leaderboard", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(7.5f, 21.0f);
        ww2Var.k(2.0f);
        ww2Var.t(9.0f);
        ww2Var.l(5.5f);
        ww2Var.t(21.0f);
        ww2Var.g();
        ww2Var.o(14.75f, 3.0f);
        ww2Var.l(-5.5f);
        ww2Var.u(18.0f);
        ww2Var.l(5.5f);
        ww2Var.t(3.0f);
        ww2Var.g();
        ww2Var.o(22.0f, 11.0f);
        ww2Var.l(-5.5f);
        ww2Var.u(10.0f);
        ww2Var.k(22.0f);
        ww2Var.t(11.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        b = b2;
        return b2;
    }

    public static Intent D(jq jqVar) {
        Intent parentActivityIntent = jqVar.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String F = F(jqVar, jqVar.getComponentName());
            if (F == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(jqVar, F);
            try {
                if (F(jqVar, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + F + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent E(Context context, ComponentName componentName) {
        String F = F(context, componentName);
        if (F == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), F);
        if (F(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String F(Context context, ComponentName componentName) {
        int i;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i = 269222528;
        } else {
            i = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static final e33 G() {
        e33 e33Var = d;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.SportsEsports", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(21.58f, 16.09f);
        ww2Var.n(-1.09f, -7.66f);
        ww2Var.h(20.21f, 6.46f, 18.52f, 5.0f, 16.53f, 5.0f);
        ww2Var.k(7.47f);
        ww2Var.h(5.48f, 5.0f, 3.79f, 6.46f, 3.51f, 8.43f);
        ww2Var.n(-1.09f, 7.66f);
        ww2Var.h(2.2f, 17.63f, 3.39f, 19.0f, 4.94f, 19.0f);
        ww2Var.l(RecyclerView.B1);
        ww2Var.i(0.68f, RecyclerView.B1, 1.32f, -0.27f, 1.8f, -0.75f);
        ww2Var.m(9.0f, 16.0f);
        ww2Var.l(6.0f);
        ww2Var.n(2.25f, 2.25f);
        ww2Var.i(0.48f, 0.48f, 1.13f, 0.75f, 1.8f, 0.75f);
        ww2Var.l(RecyclerView.B1);
        ww2Var.h(20.61f, 19.0f, 21.8f, 17.63f, 21.58f, 16.09f);
        ww2Var.g();
        ww2Var.o(11.0f, 11.0f);
        ww2Var.k(9.0f);
        ww2Var.u(2.0f);
        ww2Var.k(8.0f);
        ww2Var.u(-2.0f);
        ww2Var.k(6.0f);
        ww2Var.u(-1.0f);
        ww2Var.l(2.0f);
        ww2Var.t(8.0f);
        ww2Var.l(1.0f);
        ww2Var.u(2.0f);
        ww2Var.l(2.0f);
        ww2Var.t(11.0f);
        ww2Var.g();
        ww2Var.o(15.0f, 10.0f);
        ww2Var.i(-0.55f, RecyclerView.B1, -1.0f, -0.45f, -1.0f, -1.0f);
        ww2Var.i(RecyclerView.B1, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ww2Var.q(1.0f, 0.45f, 1.0f, 1.0f);
        ww2Var.h(16.0f, 9.55f, 15.55f, 10.0f, 15.0f, 10.0f);
        ww2Var.g();
        ww2Var.o(17.0f, 13.0f);
        ww2Var.i(-0.55f, RecyclerView.B1, -1.0f, -0.45f, -1.0f, -1.0f);
        ww2Var.i(RecyclerView.B1, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        ww2Var.q(1.0f, 0.45f, 1.0f, 1.0f);
        ww2Var.h(18.0f, 12.55f, 17.55f, 13.0f, 17.0f, 13.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        d = b2;
        return b2;
    }

    public static final e33 H() {
        e33 e33Var = f;
        if (e33Var != null) {
            return e33Var;
        }
        d33 d33Var = new d33("Filled.Tune", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = el7.a;
        cn6 cn6Var = new cn6(kt0.b);
        ww2 ww2Var = new ww2(1, (byte) 0);
        ww2Var.o(3.0f, 17.0f);
        ww2Var.u(2.0f);
        ww2Var.l(6.0f);
        ww2Var.u(-2.0f);
        ww2Var.m(3.0f, 17.0f);
        ww2Var.g();
        ww2Var.o(3.0f, 5.0f);
        ww2Var.u(2.0f);
        ww2Var.l(10.0f);
        ww2Var.m(13.0f, 5.0f);
        ww2Var.m(3.0f, 5.0f);
        ww2Var.g();
        ww2Var.o(13.0f, 21.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(8.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(-8.0f);
        ww2Var.u(-2.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(6.0f);
        ww2Var.l(2.0f);
        ww2Var.g();
        ww2Var.o(7.0f, 9.0f);
        ww2Var.u(2.0f);
        ww2Var.m(3.0f, 11.0f);
        ww2Var.u(2.0f);
        ww2Var.l(4.0f);
        ww2Var.u(2.0f);
        ww2Var.l(2.0f);
        ww2Var.m(9.0f, 9.0f);
        ww2Var.m(7.0f, 9.0f);
        ww2Var.g();
        ww2Var.o(21.0f, 13.0f);
        ww2Var.u(-2.0f);
        ww2Var.m(11.0f, 11.0f);
        ww2Var.u(2.0f);
        ww2Var.l(10.0f);
        ww2Var.g();
        ww2Var.o(15.0f, 9.0f);
        ww2Var.l(2.0f);
        ww2Var.m(17.0f, 7.0f);
        ww2Var.l(4.0f);
        ww2Var.m(21.0f, 5.0f);
        ww2Var.l(-4.0f);
        ww2Var.m(17.0f, 3.0f);
        ww2Var.l(-2.0f);
        ww2Var.u(6.0f);
        ww2Var.g();
        d33.a(d33Var, ww2Var.b, 0, cn6Var);
        e33 b2 = d33Var.b();
        f = b2;
        return b2;
    }

    public static final in7 I(ArrayList arrayList, qn2 qn2Var) {
        hn7 hn7Var = in7.Companion;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            int E = ((zi7) qn2Var.g((di7) obj)).E();
            if (E != 0) {
                if (i2 != E && i2 != 0) {
                    kj2.f0("UseCaseUtil", xg6.m(i2, E, "Unexpected configurations: Overwriting current previewStabilizationMode(", ") with useCasePreviewStabilization(", ")!"));
                }
                i2 = E;
            }
        }
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            int y = ((zi7) qn2Var.g((di7) obj2)).y();
            if (y != 0) {
                if (i != y && i != 0) {
                    kj2.f0("UseCaseUtil", xg6.m(i, y, "Unexpected configurations: Overwriting current videoStabilizationMode(", ") with useCaseVideoStabilization(", ")!"));
                }
                i = y;
            }
        }
        hn7Var.getClass();
        if (i2 != 1 && i != 1) {
            if (i2 == 2) {
                return in7.PREVIEW;
            }
            if (i == 2) {
                return in7.ON;
            }
            return in7.UNSPECIFIED;
        }
        return in7.OFF;
    }

    public static boolean J(MotionEvent motionEvent, int i) {
        if ((motionEvent.getSource() & i) == i) {
            return true;
        }
        return false;
    }

    public static final boolean K(vy4 vy4Var, long j, long j2) {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (vy4Var.i == 1) {
            i = 1;
        } else {
            i = 0;
        }
        long j3 = vy4Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f2 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float f3 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        float f4 = ((int) (j & 4294967295L)) + intBitsToFloat4;
        if (intBitsToFloat < (-intBitsToFloat3)) {
            z = true;
        } else {
            z = false;
        }
        if (intBitsToFloat > f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z2 | z;
        if (intBitsToFloat2 < (-intBitsToFloat4)) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z6 = z5 | z3;
        if (intBitsToFloat2 > f4) {
            z4 = true;
        }
        return z6 | z4;
    }

    public static final boolean L(di7 di7Var) {
        di7Var.getClass();
        if (di7Var.h.i(zi7.T)) {
            if (di7Var.h.x() != bj7.VIDEO_CAPTURE) {
                return false;
            }
            return true;
        }
        kj2.v("UseCaseUtil", di7Var + " UseCase does not have capture type.");
        return false;
    }

    public static String M(String str) {
        str.getClass();
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        normalize.getClass();
        xh5 xh5Var = tz5.L;
        xh5Var.getClass();
        String replaceAll = xh5Var.A.matcher(normalize).replaceAll("");
        replaceAll.getClass();
        String lowerCase = replaceAll.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return lowerCase;
    }

    public static void N(c37 c37Var, d17 d17Var, a47 a47Var, jk3 jk3Var, t37 t37Var, boolean z, mk4 mk4Var) {
        of5 of5Var;
        if (z) {
            int s = mk4Var.s(k47.e(c37Var.b));
            String str = l17.a;
            if (s < a47Var.a.a.B.length()) {
                of5Var = a47Var.b(s);
            } else if (s != 0) {
                of5Var = a47Var.b(s - 1);
            } else {
                of5Var = new of5(RecyclerView.B1, RecyclerView.B1, 1.0f, (int) (l17.b(d17Var.b, d17Var.g, d17Var.h) & 4294967295L));
            }
            float f2 = of5Var.b;
            float f3 = of5Var.a;
            long P = jk3Var.P((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (P >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (P & 4294967295L));
            of5 b2 = kj2.b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(of5Var.c - f3) << 32) | (Float.floatToRawIntBits(of5Var.d - f2) & 4294967295L));
            if (nb3.k((t37) t37Var.a.b.get(), t37Var)) {
                t37Var.b.h(b2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:155:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aj2 O(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        TypedArray typedArray;
        long j;
        Throwable th;
        boolean isTerminated;
        boolean isTerminated2;
        TimeUnit timeUnit = TimeUnit.DAYS;
        do {
            next = xmlResourceParser.next();
            i = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), g75.b);
                int i7 = 0;
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int i8 = 3;
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null) {
                    List S = S(resources, resourceId);
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != i8) {
                        if (xmlResourceParser.getEventType() == i) {
                            if (xmlResourceParser.getName().equals("fallback")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), g75.d);
                                int i9 = integer;
                                try {
                                    String string6 = obtainAttributes2.getString(i7);
                                    String string7 = obtainAttributes2.getString(1);
                                    String string8 = obtainAttributes2.getString(i);
                                    if (string6 != null) {
                                        while (xmlResourceParser.next() != 3) {
                                            try {
                                                V(xmlResourceParser);
                                            } catch (Throwable th2) {
                                                th = th2;
                                                typedArray = obtainAttributes2;
                                                j = 1;
                                            }
                                        }
                                        try {
                                            str = string5;
                                            typedArray = obtainAttributes2;
                                            i6 = i9;
                                            i5 = integer2;
                                            j = 1;
                                            try {
                                                ui2 ui2Var = new ui2(string, string2, string6, S, string7, string8);
                                                if (typedArray instanceof AutoCloseable) {
                                                    typedArray.close();
                                                } else if (typedArray instanceof ExecutorService) {
                                                    ExecutorService executorService = (ExecutorService) typedArray;
                                                    if (executorService != ForkJoinPool.commonPool() && !(isTerminated2 = executorService.isTerminated())) {
                                                        executorService.shutdown();
                                                        boolean z2 = false;
                                                        while (!isTerminated2) {
                                                            try {
                                                                isTerminated2 = executorService.awaitTermination(1L, timeUnit);
                                                            } catch (InterruptedException unused) {
                                                                if (!z2) {
                                                                    executorService.shutdownNow();
                                                                    z2 = true;
                                                                }
                                                            }
                                                        }
                                                        if (z2) {
                                                            Thread.currentThread().interrupt();
                                                        }
                                                    }
                                                } else {
                                                    typedArray.recycle();
                                                }
                                                arrayList.add(ui2Var);
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            typedArray = obtainAttributes2;
                                            j = 1;
                                            th = th;
                                            if (typedArray != null) {
                                            }
                                            throw th;
                                        }
                                    } else {
                                        typedArray = obtainAttributes2;
                                        j = 1;
                                        throw new XmlPullParserException("query attribute must be set in fallback element");
                                    }
                                    th = th3;
                                } catch (Throwable th5) {
                                    th = th5;
                                    typedArray = obtainAttributes2;
                                }
                                th = th;
                                if (typedArray != null) {
                                    try {
                                        if (!(typedArray instanceof AutoCloseable)) {
                                            if (typedArray instanceof ExecutorService) {
                                                ExecutorService executorService2 = (ExecutorService) typedArray;
                                                if (executorService2 != ForkJoinPool.commonPool() && !(isTerminated = executorService2.isTerminated())) {
                                                    executorService2.shutdown();
                                                    boolean z3 = false;
                                                    while (!isTerminated) {
                                                        try {
                                                            isTerminated = executorService2.awaitTermination(j, timeUnit);
                                                        } catch (InterruptedException unused2) {
                                                            if (!z3) {
                                                                executorService2.shutdownNow();
                                                                z3 = true;
                                                            }
                                                        }
                                                    }
                                                    if (z3) {
                                                        Thread.currentThread().interrupt();
                                                    }
                                                }
                                            } else {
                                                typedArray.recycle();
                                            }
                                        } else {
                                            typedArray.close();
                                        }
                                    } catch (Throwable th6) {
                                        th.addSuppressed(th6);
                                    }
                                }
                                throw th;
                            }
                            i5 = integer2;
                            str = string5;
                            i6 = integer;
                            V(xmlResourceParser);
                            integer = i6;
                            integer2 = i5;
                            string5 = str;
                            i = 2;
                            i7 = 0;
                            i8 = 3;
                        }
                    }
                    int i10 = integer2;
                    String str2 = string5;
                    int i11 = integer;
                    if (!arrayList.isEmpty()) {
                        return new dj2(arrayList, i11, i10, str2);
                    }
                    if (string3 != null) {
                        arrayList.add(new ui2(string, string2, string3, S, null, null));
                        if (string4 != null) {
                            arrayList.add(new ui2(string, string2, string4, S, null, null));
                        }
                        return new dj2(arrayList, i11, i10, str2);
                    }
                    i.h("The provider font XML requires query attribute or fallback children.");
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), g75.c);
                            int i12 = 8;
                            if (!obtainAttributes3.hasValue(8)) {
                                i12 = 1;
                            }
                            int i13 = obtainAttributes3.getInt(i12, 400);
                            if (obtainAttributes3.hasValue(6)) {
                                i2 = 6;
                            } else {
                                i2 = 2;
                            }
                            if (1 == obtainAttributes3.getInt(i2, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i14 = 9;
                            if (!obtainAttributes3.hasValue(9)) {
                                i14 = 3;
                            }
                            if (obtainAttributes3.hasValue(7)) {
                                i3 = 7;
                            } else {
                                i3 = 4;
                            }
                            String string9 = obtainAttributes3.getString(i3);
                            int i15 = obtainAttributes3.getInt(i14, 0);
                            if (obtainAttributes3.hasValue(5)) {
                                i4 = 5;
                            } else {
                                i4 = 0;
                            }
                            int resourceId2 = obtainAttributes3.getResourceId(i4, 0);
                            String string10 = obtainAttributes3.getString(i4);
                            obtainAttributes3.recycle();
                            while (xmlResourceParser.next() != 3) {
                                V(xmlResourceParser);
                            }
                            arrayList2.add(new cj2(i13, i15, resourceId2, string10, string9, z));
                        } else {
                            V(xmlResourceParser);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return new bj2((cj2[]) arrayList2.toArray(new cj2[0]));
            }
            V(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean P(vh2 vh2Var, ln lnVar) {
        vh2[] vh2VarArr = new vh2[16];
        if (!vh2Var.A.j0) {
            p53.c("visitChildren called on an unattached node");
        }
        ua4 ua4Var = new ua4(new z64[16]);
        z64 z64Var = vh2Var.A;
        z64 z64Var2 = z64Var.Y;
        if (z64Var2 == null) {
            nc1.z(ua4Var, z64Var);
        } else {
            ua4Var.b(z64Var2);
        }
        int i = 0;
        while (true) {
            int i2 = ua4Var.L;
            if (i2 == 0) {
                break;
            }
            z64 z64Var3 = (z64) ua4Var.l(i2 - 1);
            if ((z64Var3.R & 1024) == 0) {
                nc1.z(ua4Var, z64Var3);
            } else {
                while (true) {
                    if (z64Var3 == null) {
                        break;
                    } else if ((z64Var3.L & 1024) != 0) {
                        ua4 ua4Var2 = null;
                        while (z64Var3 != null) {
                            if (z64Var3 instanceof vh2) {
                                vh2 vh2Var2 = (vh2) z64Var3;
                                int i3 = i + 1;
                                if (vh2VarArr.length < i3) {
                                    int length = vh2VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(vh2VarArr, 0, r10, 0, length);
                                    vh2VarArr = r10;
                                }
                                vh2VarArr[i] = vh2Var2;
                                i = i3;
                            } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                int i4 = 0;
                                for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                    if ((z64Var4.L & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            z64Var3 = z64Var4;
                                        } else {
                                            if (ua4Var2 == null) {
                                                ua4Var2 = new ua4(new z64[16]);
                                            }
                                            if (z64Var3 != null) {
                                                ua4Var2.b(z64Var3);
                                                z64Var3 = null;
                                            }
                                            ua4Var2.b(z64Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            z64Var3 = nc1.A(ua4Var2);
                        }
                    } else {
                        z64Var3 = z64Var3.Y;
                    }
                }
            }
        }
        Arrays.sort(vh2VarArr, 0, i, zh2.b);
        int i5 = i - 1;
        if (i5 < vh2VarArr.length) {
            while (i5 >= 0) {
                vh2 vh2Var3 = vh2VarArr[i5];
                if (yh2.A(vh2Var3) && i(vh2Var3, lnVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean Q(vh2 vh2Var, ln lnVar) {
        vh2[] vh2VarArr = new vh2[16];
        if (!vh2Var.A.j0) {
            p53.c("visitChildren called on an unattached node");
        }
        ua4 ua4Var = new ua4(new z64[16]);
        z64 z64Var = vh2Var.A;
        z64 z64Var2 = z64Var.Y;
        if (z64Var2 == null) {
            nc1.z(ua4Var, z64Var);
        } else {
            ua4Var.b(z64Var2);
        }
        int i = 0;
        while (true) {
            int i2 = ua4Var.L;
            if (i2 == 0) {
                break;
            }
            z64 z64Var3 = (z64) ua4Var.l(i2 - 1);
            if ((z64Var3.R & 1024) == 0) {
                nc1.z(ua4Var, z64Var3);
            } else {
                while (true) {
                    if (z64Var3 == null) {
                        break;
                    } else if ((z64Var3.L & 1024) != 0) {
                        ua4 ua4Var2 = null;
                        while (z64Var3 != null) {
                            if (z64Var3 instanceof vh2) {
                                vh2 vh2Var2 = (vh2) z64Var3;
                                int i3 = i + 1;
                                if (vh2VarArr.length < i3) {
                                    int length = vh2VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(vh2VarArr, 0, r10, 0, length);
                                    vh2VarArr = r10;
                                }
                                vh2VarArr[i] = vh2Var2;
                                i = i3;
                            } else if ((z64Var3.L & 1024) != 0 && (z64Var3 instanceof zg1)) {
                                int i4 = 0;
                                for (z64 z64Var4 = ((zg1) z64Var3).l0; z64Var4 != null; z64Var4 = z64Var4.Y) {
                                    if ((z64Var4.L & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            z64Var3 = z64Var4;
                                        } else {
                                            if (ua4Var2 == null) {
                                                ua4Var2 = new ua4(new z64[16]);
                                            }
                                            if (z64Var3 != null) {
                                                ua4Var2.b(z64Var3);
                                                z64Var3 = null;
                                            }
                                            ua4Var2.b(z64Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            z64Var3 = nc1.A(ua4Var2);
                        }
                    } else {
                        z64Var3 = z64Var3.Y;
                    }
                }
            }
        }
        Arrays.sort(vh2VarArr, 0, i, zh2.b);
        for (int i5 = 0; i5 < i; i5++) {
            vh2 vh2Var3 = vh2VarArr[i5];
            if (yh2.A(vh2Var3) && x(vh2Var3, lnVar)) {
                return true;
            }
        }
        return false;
    }

    public static final long R(vy4 vy4Var, boolean z) {
        long e2 = jk4.e(vy4Var.c, vy4Var.g);
        if (!z && vy4Var.c()) {
            return 0L;
        }
        return e2;
    }

    public static List S(Resources resources, int i) {
        if (i == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019b A[EDGE_INSN: B:160:0x019b->B:127:0x019b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean T(vh2 vh2Var, vh2 vh2Var2, int i, ln lnVar) {
        z64 z64Var;
        sm3 f0;
        if0 if0Var;
        if (vh2Var.W0() == sh2.ActiveParent) {
            vh2[] vh2VarArr = new vh2[16];
            if (!vh2Var.A.j0) {
                p53.c("visitChildren called on an unattached node");
            }
            ua4 ua4Var = new ua4(new z64[16]);
            z64 z64Var2 = vh2Var.A;
            z64 z64Var3 = z64Var2.Y;
            if (z64Var3 == null) {
                nc1.z(ua4Var, z64Var2);
            } else {
                ua4Var.b(z64Var3);
            }
            int i2 = 0;
            while (true) {
                int i3 = ua4Var.L;
                z64Var = null;
                if (i3 == 0) {
                    break;
                }
                z64 z64Var4 = (z64) ua4Var.l(i3 - 1);
                if ((z64Var4.R & 1024) == 0) {
                    nc1.z(ua4Var, z64Var4);
                } else {
                    while (true) {
                        if (z64Var4 == null) {
                            break;
                        } else if ((z64Var4.L & 1024) != 0) {
                            ua4 ua4Var2 = null;
                            while (z64Var4 != null) {
                                if (z64Var4 instanceof vh2) {
                                    vh2 vh2Var3 = (vh2) z64Var4;
                                    int i4 = i2 + 1;
                                    if (vh2VarArr.length < i4) {
                                        int length = vh2VarArr.length;
                                        ?? r11 = new Object[Math.max(i4, length * 2)];
                                        System.arraycopy(vh2VarArr, 0, r11, 0, length);
                                        vh2VarArr = r11;
                                    }
                                    vh2VarArr[i2] = vh2Var3;
                                    i2 = i4;
                                } else if ((z64Var4.L & 1024) != 0 && (z64Var4 instanceof zg1)) {
                                    int i5 = 0;
                                    for (z64 z64Var5 = ((zg1) z64Var4).l0; z64Var5 != null; z64Var5 = z64Var5.Y) {
                                        if ((z64Var5.L & 1024) != 0) {
                                            i5++;
                                            if (i5 == 1) {
                                                z64Var4 = z64Var5;
                                            } else {
                                                if (ua4Var2 == null) {
                                                    ua4Var2 = new ua4(new z64[16]);
                                                }
                                                if (z64Var4 != null) {
                                                    ua4Var2.b(z64Var4);
                                                    z64Var4 = null;
                                                }
                                                ua4Var2.b(z64Var5);
                                            }
                                        }
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                z64Var4 = nc1.A(ua4Var2);
                            }
                        } else {
                            z64Var4 = z64Var4.Y;
                        }
                    }
                }
            }
            Arrays.sort(vh2VarArr, 0, i2, zh2.b);
            if (i == 1) {
                l93 R = gi2.R(0, i2);
                int i6 = R.A;
                int i7 = R.B;
                if (i6 <= i7) {
                    boolean z = false;
                    while (true) {
                        if (z) {
                            vh2 vh2Var4 = vh2VarArr[i6];
                            if (yh2.A(vh2Var4) && x(vh2Var4, lnVar)) {
                                break;
                            }
                        }
                        if (nb3.k(vh2VarArr[i6], vh2Var2)) {
                            z = true;
                        }
                        if (i6 == i7) {
                            break;
                        }
                        i6++;
                    }
                    return true;
                }
                if (i != 1 && vh2Var.T0().a) {
                    if (!vh2Var.A.j0) {
                        p53.c("visitAncestors called on an unattached node");
                    }
                    z64 z64Var6 = vh2Var.A.X;
                    f0 = nc1.f0(vh2Var);
                    loop5: while (true) {
                        if (f0 == null) {
                            break;
                        }
                        if ((((z64) f0.B0.g).R & 1024) != 0) {
                            while (z64Var6 != null) {
                                if ((z64Var6.L & 1024) != 0) {
                                    z64 z64Var7 = z64Var6;
                                    ua4 ua4Var3 = null;
                                    while (z64Var7 != null) {
                                        if (z64Var7 instanceof vh2) {
                                            z64Var = z64Var7;
                                            break loop5;
                                        }
                                        if ((z64Var7.L & 1024) != 0 && (z64Var7 instanceof zg1)) {
                                            int i8 = 0;
                                            for (z64 z64Var8 = ((zg1) z64Var7).l0; z64Var8 != null; z64Var8 = z64Var8.Y) {
                                                if ((z64Var8.L & 1024) != 0) {
                                                    i8++;
                                                    if (i8 == 1) {
                                                        z64Var7 = z64Var8;
                                                    } else {
                                                        if (ua4Var3 == null) {
                                                            ua4Var3 = new ua4(new z64[16]);
                                                        }
                                                        if (z64Var7 != null) {
                                                            ua4Var3.b(z64Var7);
                                                            z64Var7 = null;
                                                        }
                                                        ua4Var3.b(z64Var8);
                                                    }
                                                }
                                            }
                                            if (i8 == 1) {
                                            }
                                        }
                                        z64Var7 = nc1.A(ua4Var3);
                                    }
                                    continue;
                                }
                                z64Var6 = z64Var6.X;
                            }
                        }
                        f0 = f0.v();
                        if (f0 != null && (if0Var = f0.B0) != null) {
                            z64Var6 = (vy6) if0Var.f;
                        } else {
                            z64Var6 = null;
                        }
                    }
                    if (z64Var != null) {
                        return ((Boolean) lnVar.g(vh2Var)).booleanValue();
                    }
                }
                return false;
            } else if (i == 2) {
                l93 R2 = gi2.R(0, i2);
                int i9 = R2.A;
                int i10 = R2.B;
                if (i9 <= i10) {
                    boolean z2 = false;
                    while (true) {
                        if (z2) {
                            vh2 vh2Var5 = vh2VarArr[i10];
                            if (yh2.A(vh2Var5) && i(vh2Var5, lnVar)) {
                                break;
                            }
                        }
                        if (nb3.k(vh2VarArr[i10], vh2Var2)) {
                            z2 = true;
                        }
                        if (i10 == i9) {
                            break;
                        }
                        i10--;
                    }
                    return true;
                }
                if (i != 1) {
                    if (!vh2Var.A.j0) {
                    }
                    z64 z64Var62 = vh2Var.A.X;
                    f0 = nc1.f0(vh2Var);
                    loop5: while (true) {
                        if (f0 == null) {
                        }
                    }
                    if (z64Var != null) {
                    }
                }
                return false;
            } else {
                i.m("This function should only be used for 1-D focus search");
                return false;
            }
        }
        i.m("This function should only be used within a parent that has focus.");
        return false;
    }

    public static final String U(Object obj) {
        String simpleName;
        if (obj.getClass().isAnonymousClass()) {
            simpleName = obj.getClass().getName();
        } else {
            simpleName = obj.getClass().getSimpleName();
        }
        return simpleName + '@' + String.format("%07x", Arrays.copyOf(new Object[]{Integer.valueOf(System.identityHashCode(obj))}, 1));
    }

    public static void V(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i--;
                }
            } else {
                i++;
            }
        }
    }

    public static void W(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            rp.y(viewGroup, z);
        } else if (g) {
            try {
                rp.y(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }

    public static final a74 X(a74 a74Var, ke6 ke6Var, long j, c60 c60Var, float f2) {
        a74 a74Var2;
        a74 E = nj2.E(a74Var, f2, ke6Var, false, 0L, 24);
        if (c60Var != null) {
            a74Var2 = new b60(c60Var.a, c60Var.b, ke6Var);
        } else {
            a74Var2 = x64.a;
        }
        return u24.g(vy7.L(E.d(a74Var2), j, ke6Var), ke6Var);
    }

    public static final long Y(long j, qd1 qd1Var, float f2, xq2 xq2Var) {
        if (kt0.d(j, ((ut0) xq2Var.j(vt0.a)).j()) && qd1Var != null) {
            xq2Var.b0(-1124614454);
            long a2 = qd1.a(j, f2, xq2Var, 0);
            xq2Var.p(false);
            return a2;
        }
        xq2Var.b0(-1124546347);
        xq2Var.p(false);
        return j;
    }

    public static final Rect Z(m93 m93Var) {
        return new Rect(m93Var.a, m93Var.b, m93Var.c, m93Var.d);
    }

    public static final long a(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            s53.a("The span value should be higher than 0");
        }
        return i;
    }

    public static final RectF a0(of5 of5Var) {
        return new RectF(of5Var.a, of5Var.b, of5Var.c, of5Var.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(final on2 on2Var, a74 a74Var, boolean z, final eo2 eo2Var, px0 px0Var, final int i, final int i2) {
        int i3;
        a74 a74Var2;
        int i4;
        int i5;
        boolean z2;
        final boolean z3;
        final a74 a74Var3;
        cf5 t;
        a74 a74Var4;
        int i6;
        int i7;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1316660641);
        if ((i & 6) == 0) {
            if (xq2Var.h(on2Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
            i5 = i3 | 3456;
            if ((i & 24576) == 0) {
                if (xq2Var.h(eo2Var)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i5 |= i6;
            }
            if ((i5 & 9363) == 9362) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!xq2Var.S(i5 & 1, z2)) {
                if (i8 != 0) {
                    a74Var4 = x64.a;
                } else {
                    a74Var4 = a74Var2;
                }
                nq6 nq6Var = u93.a;
                a74 t2 = mb3.t(a74Var4.d(m64.a), null, jq5.a(4, 0L, false), true, new mq5(0), on2Var, 8);
                e34 d2 = h70.d(d90.Z, false);
                int B = ge7.B(xq2Var);
                xv4 l = xq2Var.l();
                a74 E = l.E(xq2Var, t2);
                jx0.i.getClass();
                iy0 iy0Var = ix0.b;
                xq2Var.f0();
                if (xq2Var.S) {
                    xq2Var.k(iy0Var);
                } else {
                    xq2Var.o0();
                }
                yh2.K(xq2Var, ix0.f, d2);
                yh2.K(xq2Var, ix0.e, l);
                pn pnVar = ix0.g;
                if (xq2Var.S || !nb3.k(xq2Var.P(), Integer.valueOf(B))) {
                    i61.v(B, xq2Var, B, pnVar);
                }
                yh2.K(xq2Var, ix0.d, E);
                xq2Var.b0(-1874697310);
                py0 py0Var = g31.a;
                float floatValue = ((Number) xq2Var.j(py0Var)).floatValue();
                xq2Var.p(false);
                hv.d(py0Var.a(Float.valueOf(floatValue)), eo2Var, xq2Var, ((i5 >> 9) & 112) | 8);
                xq2Var.p(true);
                a74Var3 = a74Var4;
                z3 = true;
            } else {
                xq2Var.V();
                z3 = z;
                a74Var3 = a74Var2;
            }
            t = xq2Var.t();
            if (t == null) {
                t.d = new eo2() { // from class: g13
                    @Override // defpackage.eo2
                    public final Object o(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        ej2.b(on2.this, a74Var3, z3, eo2Var, (px0) obj, ii2.a0(i | 1), i2);
                        return jg7.a;
                    }
                };
                return;
            }
            return;
        }
        a74Var2 = a74Var;
        i5 = i3 | 3456;
        if ((i & 24576) == 0) {
        }
        if ((i5 & 9363) == 9362) {
        }
        if (!xq2Var.S(i5 & 1, z2)) {
        }
        t = xq2Var.t();
        if (t == null) {
        }
    }

    public static final of5 b0(RectF rectF) {
        return new of5(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(a74 a74Var, ke6 ke6Var, final long j, long j2, float f2, final zv0 zv0Var, px0 px0Var, final int i, final int i2) {
        final a74 a74Var2;
        int i3;
        int i4;
        jy2 jy2Var;
        int i5;
        long j3;
        int i6;
        int i7;
        float f3;
        int i8;
        zv0 zv0Var2;
        boolean z;
        final ke6 ke6Var2;
        final float f4;
        cf5 t;
        a74 a74Var3;
        final float f5;
        int i9;
        int i10;
        int i11;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(174096871);
        int i12 = i2 & 1;
        if (i12 != 0) {
            i3 = i | 6;
            a74Var2 = a74Var;
        } else if ((i & 6) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            a74Var2 = a74Var;
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            jy2Var = ke6Var;
            if (xq2Var.f(jy2Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
            if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
                if (xq2Var.e(j)) {
                    i11 = 256;
                } else {
                    i11 = 128;
                }
                i3 |= i11;
            }
            if ((i & 3072) != 0) {
                j3 = j2;
                if ((i2 & 8) == 0 && xq2Var.e(j3)) {
                    i10 = 2048;
                } else {
                    i10 = 1024;
                }
                i3 |= i10;
            } else {
                j3 = j2;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                if (xq2Var.f(null)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            i7 = i2 & 32;
            if (i7 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                f3 = f2;
                if (xq2Var.c(f3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i3 |= i8;
                if ((1572864 & i) == 0) {
                    zv0Var2 = zv0Var;
                    if (xq2Var.h(zv0Var2)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i3 |= i9;
                } else {
                    zv0Var2 = zv0Var;
                }
                if ((599187 & i3) != 599186) {
                    z = true;
                } else {
                    z = false;
                }
                if (xq2Var.S(i3 & 1, z)) {
                    xq2Var.X();
                    if ((i & 1) != 0 && !xq2Var.B()) {
                        xq2Var.V();
                    } else {
                        if (i12 != 0) {
                            a74Var3 = x64.a;
                        } else {
                            a74Var3 = a74Var2;
                        }
                        if (i13 != 0) {
                            jy2Var = u24.m;
                        }
                        if ((i2 & 8) != 0) {
                            j3 = vt0.b(j, xq2Var);
                        }
                        if (i7 != 0) {
                            ke6Var2 = jy2Var;
                            f5 = 0.0f;
                            a74Var2 = a74Var3;
                            xq2Var.q();
                            py0 py0Var = os1.b;
                            final float f6 = ((om1) xq2Var.j(py0Var)).A + f5;
                            final zv0 zv0Var3 = zv0Var2;
                            hv.e(new pq[]{j31.a.a(new kt0(j3)), py0Var.a(new om1(f6))}, n16.I(-2004281689, new eo2() { // from class: sv6
                                @Override // defpackage.eo2
                                public final Object o(Object obj, Object obj2) {
                                    boolean z2;
                                    px0 px0Var2 = (px0) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    if ((intValue & 3) != 2) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    xq2 xq2Var2 = (xq2) px0Var2;
                                    boolean S = xq2Var2.S(intValue & 1, z2);
                                    jg7 jg7Var = jg7.a;
                                    if (S) {
                                        a74 X = ej2.X(a74.this, ke6Var2, ej2.Y(j, (qd1) xq2Var2.j(os1.a), f6, xq2Var2), null, f5);
                                        Object P = xq2Var2.P();
                                        vs0 vs0Var = ox0.a;
                                        if (P == vs0Var) {
                                            P = new r76(14);
                                            xq2Var2.l0(P);
                                        }
                                        a74 a2 = ua6.a(X, false, (qn2) P);
                                        Object P2 = xq2Var2.P();
                                        if (P2 == vs0Var) {
                                            P2 = ni1.c;
                                            xq2Var2.l0(P2);
                                        }
                                        a74 a3 = jw6.a(a2, jg7Var, (PointerInputEventHandler) P2);
                                        e34 d2 = h70.d(d90.L, true);
                                        int B = ge7.B(xq2Var2);
                                        xv4 l = xq2Var2.l();
                                        a74 E = l.E(xq2Var2, a3);
                                        jx0.i.getClass();
                                        iy0 iy0Var = ix0.b;
                                        xq2Var2.f0();
                                        if (xq2Var2.S) {
                                            xq2Var2.k(iy0Var);
                                        } else {
                                            xq2Var2.o0();
                                        }
                                        yh2.K(xq2Var2, ix0.f, d2);
                                        yh2.K(xq2Var2, ix0.e, l);
                                        pn pnVar = ix0.g;
                                        if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B))) {
                                            i61.v(B, xq2Var2, B, pnVar);
                                        }
                                        yh2.K(xq2Var2, ix0.d, E);
                                        zv0Var3.o(xq2Var2, 0);
                                        xq2Var2.p(true);
                                        return jg7Var;
                                    }
                                    xq2Var2.V();
                                    return jg7Var;
                                }
                            }, xq2Var), xq2Var, 56);
                            f4 = f5;
                        } else {
                            a74Var2 = a74Var3;
                        }
                    }
                    ke6Var2 = jy2Var;
                    f5 = f3;
                    xq2Var.q();
                    py0 py0Var2 = os1.b;
                    final float f62 = ((om1) xq2Var.j(py0Var2)).A + f5;
                    final zv0 zv0Var32 = zv0Var2;
                    hv.e(new pq[]{j31.a.a(new kt0(j3)), py0Var2.a(new om1(f62))}, n16.I(-2004281689, new eo2() { // from class: sv6
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            boolean z2;
                            px0 px0Var2 = (px0) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            xq2 xq2Var2 = (xq2) px0Var2;
                            boolean S = xq2Var2.S(intValue & 1, z2);
                            jg7 jg7Var = jg7.a;
                            if (S) {
                                a74 X = ej2.X(a74.this, ke6Var2, ej2.Y(j, (qd1) xq2Var2.j(os1.a), f62, xq2Var2), null, f5);
                                Object P = xq2Var2.P();
                                vs0 vs0Var = ox0.a;
                                if (P == vs0Var) {
                                    P = new r76(14);
                                    xq2Var2.l0(P);
                                }
                                a74 a2 = ua6.a(X, false, (qn2) P);
                                Object P2 = xq2Var2.P();
                                if (P2 == vs0Var) {
                                    P2 = ni1.c;
                                    xq2Var2.l0(P2);
                                }
                                a74 a3 = jw6.a(a2, jg7Var, (PointerInputEventHandler) P2);
                                e34 d2 = h70.d(d90.L, true);
                                int B = ge7.B(xq2Var2);
                                xv4 l = xq2Var2.l();
                                a74 E = l.E(xq2Var2, a3);
                                jx0.i.getClass();
                                iy0 iy0Var = ix0.b;
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var);
                                } else {
                                    xq2Var2.o0();
                                }
                                yh2.K(xq2Var2, ix0.f, d2);
                                yh2.K(xq2Var2, ix0.e, l);
                                pn pnVar = ix0.g;
                                if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B))) {
                                    i61.v(B, xq2Var2, B, pnVar);
                                }
                                yh2.K(xq2Var2, ix0.d, E);
                                zv0Var32.o(xq2Var2, 0);
                                xq2Var2.p(true);
                                return jg7Var;
                            }
                            xq2Var2.V();
                            return jg7Var;
                        }
                    }, xq2Var), xq2Var, 56);
                    f4 = f5;
                } else {
                    xq2Var.V();
                    ke6Var2 = jy2Var;
                    f4 = f3;
                }
                final long j4 = j3;
                t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2() { // from class: tv6
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            ej2.c(a74.this, ke6Var2, j, j4, f4, zv0Var, (px0) obj, ii2.a0(i | 1), i2);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            f3 = f2;
            if ((1572864 & i) == 0) {
            }
            if ((599187 & i3) != 599186) {
            }
            if (xq2Var.S(i3 & 1, z)) {
            }
            final long j42 = j3;
            t = xq2Var.t();
            if (t != null) {
            }
        }
        jy2Var = ke6Var;
        if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        f3 = f2;
        if ((1572864 & i) == 0) {
        }
        if ((599187 & i3) != 599186) {
        }
        if (xq2Var.S(i3 & 1, z)) {
        }
        final long j422 = j3;
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static Object c0(String str) {
        String obj;
        if (str != null) {
            try {
                obj = qs6.T0(str).toString();
            } catch (Throwable th) {
                return new em5(th);
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            obj = "";
        }
        if (obj.length() > 0) {
            URI uri = new URI(obj);
            if (nb3.k(uri.getScheme(), "http")) {
                if (uri.getRawUserInfo() == null) {
                    if (uri.getRawQuery() == null) {
                        if (uri.getRawFragment() == null) {
                            if (!nb3.k(uri.getHost(), "127.0.0.1") && !xs6.Z(uri.getHost(), "localhost", true)) {
                                throw new IllegalArgumentException("Only localhost or 127.0.0.1 is allowed");
                            }
                            int port = uri.getPort();
                            if (1 <= port && port < 65536) {
                                String rawPath = uri.getRawPath();
                                if (rawPath != null && rawPath.length() != 0 && !nb3.k(uri.getRawPath(), "/") && !nb3.k(uri.getRawPath(), "/dorequest.php")) {
                                    throw new IllegalArgumentException("Only /dorequest.php is allowed");
                                }
                                String host = uri.getHost();
                                host.getClass();
                                String lowerCase = host.toLowerCase(Locale.ROOT);
                                lowerCase.getClass();
                                String str2 = "http://" + lowerCase + ":" + uri.getPort();
                                return new ik7(str2, str2.concat("/dorequest.php"));
                            }
                            throw new IllegalArgumentException("A valid explicit port is required");
                        }
                        throw new IllegalArgumentException("Fragment is not allowed");
                    }
                    throw new IllegalArgumentException("Query is not allowed");
                }
                throw new IllegalArgumentException("User info is not allowed");
            }
            throw new IllegalArgumentException("Only HTTP loopback is supported");
        }
        throw new IllegalArgumentException("Missing host");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(final on2 on2Var, final a74 a74Var, boolean z, final ke6 ke6Var, final long j, final long j2, c60 c60Var, final float f2, final r94 r94Var, final zv0 zv0Var, px0 px0Var, final int i, final int i2) {
        int i3;
        a74 a74Var2;
        boolean z2;
        int i4;
        int i5;
        c60 c60Var2;
        int i6;
        boolean z3;
        final boolean z4;
        final c60 c60Var3;
        cf5 t;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(2141308794);
        if ((i & 6) == 0) {
            if (xq2Var.h(on2Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            a74Var2 = a74Var;
            if (xq2Var.f(a74Var2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        } else {
            a74Var2 = a74Var;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= RendererDebugBridge.CAPTURE_HEIGHT;
        } else if ((i & RendererDebugBridge.CAPTURE_HEIGHT) == 0) {
            z2 = z;
            if (xq2Var.g(z2)) {
                i4 = 256;
            } else {
                i4 = 128;
            }
            i3 |= i4;
            if ((i & 3072) == 0) {
                if (xq2Var.f(ke6Var)) {
                    i12 = 2048;
                } else {
                    i12 = 1024;
                }
                i3 |= i12;
            }
            if ((i & 24576) == 0) {
                if (xq2Var.e(j)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i3 |= i11;
            }
            if ((196608 & i) == 0) {
                if (xq2Var.e(j2)) {
                    i10 = 131072;
                } else {
                    i10 = 65536;
                }
                i3 |= i10;
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                c60Var2 = c60Var;
                if (xq2Var.f(c60Var2)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i3 |= i6;
                if ((12582912 & i) == 0) {
                    if (xq2Var.c(f2)) {
                        i9 = 8388608;
                    } else {
                        i9 = Compress.MAXWINSIZE;
                    }
                    i3 |= i9;
                }
                if ((100663296 & i) == 0) {
                    if (xq2Var.f(r94Var)) {
                        i8 = 67108864;
                    } else {
                        i8 = 33554432;
                    }
                    i3 |= i8;
                }
                if ((i & 805306368) == 0) {
                    if (xq2Var.h(zv0Var)) {
                        i7 = 536870912;
                    } else {
                        i7 = 268435456;
                    }
                    i3 |= i7;
                }
                if ((i3 & 306783379) != 306783378) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (xq2Var.S(i3 & 1, z3)) {
                    xq2Var.X();
                    if ((i & 1) != 0 && !xq2Var.B()) {
                        xq2Var.V();
                    } else {
                        if (i15 != 0) {
                            z2 = true;
                        }
                        if (i5 != 0) {
                            c60Var2 = null;
                        }
                    }
                    final boolean z5 = z2;
                    final c60 c60Var4 = c60Var2;
                    xq2Var.q();
                    py0 py0Var = os1.b;
                    final float f3 = ((om1) xq2Var.j(py0Var)).A + f2;
                    final a74 a74Var3 = a74Var2;
                    hv.e(new pq[]{j31.a.a(new kt0(j2)), py0Var.a(new om1(f3))}, n16.I(-1766606150, new eo2() { // from class: uv6
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            boolean z6;
                            px0 px0Var2 = (px0) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            xq2 xq2Var2 = (xq2) px0Var2;
                            if (xq2Var2.S(intValue & 1, z6)) {
                                nq6 nq6Var = u93.a;
                                a74 t2 = mb3.t(ej2.X(a74.this.d(m64.a), ke6Var, ej2.Y(j, (qd1) xq2Var2.j(os1.a), f3, xq2Var2), c60Var4, f2), r94Var, jq5.a(7, 0L, false), z5, null, on2Var, 24);
                                e34 d2 = h70.d(d90.L, true);
                                int B = ge7.B(xq2Var2);
                                xv4 l = xq2Var2.l();
                                a74 E = l.E(xq2Var2, t2);
                                jx0.i.getClass();
                                iy0 iy0Var = ix0.b;
                                xq2Var2.f0();
                                if (xq2Var2.S) {
                                    xq2Var2.k(iy0Var);
                                } else {
                                    xq2Var2.o0();
                                }
                                yh2.K(xq2Var2, ix0.f, d2);
                                yh2.K(xq2Var2, ix0.e, l);
                                pn pnVar = ix0.g;
                                if (xq2Var2.S || !nb3.k(xq2Var2.P(), Integer.valueOf(B))) {
                                    i61.v(B, xq2Var2, B, pnVar);
                                }
                                yh2.K(xq2Var2, ix0.d, E);
                                zv0Var.o(xq2Var2, 0);
                                xq2Var2.p(true);
                            } else {
                                xq2Var2.V();
                            }
                            return jg7.a;
                        }
                    }, xq2Var), xq2Var, 56);
                    c60Var3 = c60Var4;
                    z4 = z5;
                } else {
                    xq2Var.V();
                    z4 = z2;
                    c60Var3 = c60Var2;
                }
                t = xq2Var.t();
                if (t != null) {
                    t.d = new eo2() { // from class: vv6
                        @Override // defpackage.eo2
                        public final Object o(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int a0 = ii2.a0(i | 1);
                            ej2.d(on2.this, a74Var, z4, ke6Var, j, j2, c60Var3, f2, r94Var, zv0Var, (px0) obj, a0, i2);
                            return jg7.a;
                        }
                    };
                    return;
                }
                return;
            }
            c60Var2 = c60Var;
            if ((12582912 & i) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            if ((i & 805306368) == 0) {
            }
            if ((i3 & 306783379) != 306783378) {
            }
            if (xq2Var.S(i3 & 1, z3)) {
            }
            t = xq2Var.t();
            if (t != null) {
            }
        }
        z2 = z;
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        c60Var2 = c60Var;
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        if ((i3 & 306783379) != 306783378) {
        }
        if (xq2Var.S(i3 & 1, z3)) {
        }
        t = xq2Var.t();
        if (t != null) {
        }
    }

    public static final ea6 e(ci ciVar, s60 s60Var) {
        boolean z;
        m71 m = ciVar.m();
        ls0 ls0Var = (ls0) ciVar.R;
        if (m == m71.CROSSED) {
            z = true;
        } else {
            z = false;
        }
        return new ea6(h(ls0Var, z, true, s60Var), h(ls0Var, z, false, s60Var), z);
    }

    public static final da6 f(ci ciVar, ls0 ls0Var, da6 da6Var) {
        int i;
        int i2;
        m71 m71Var;
        boolean z;
        int i3 = ls0Var.c;
        int i4 = ls0Var.b;
        boolean z2 = ciVar.B;
        if (z2) {
            i = i4;
        } else {
            i = i3;
        }
        a47 a47Var = (a47) ls0Var.e;
        int i5 = ls0Var.d;
        xr3 xr3Var = xr3.NONE;
        go3 M = kj2.M(xr3Var, new mz2(i, ls0Var));
        if (z2) {
            i2 = i3;
        } else {
            i2 = i4;
        }
        go3 M2 = kj2.M(xr3Var, new vr5(ls0Var, i, i2, ciVar, M));
        if (1 != da6Var.c) {
            return (da6) M2.getValue();
        }
        if (i == i5) {
            return da6Var;
        }
        if (((Number) M.getValue()).intValue() != a47Var.b.d(i5)) {
            return (da6) M2.getValue();
        }
        int i6 = da6Var.b;
        long j = a47Var.j(i6);
        if (i5 != -1) {
            if (i != i5) {
                if (i4 < i3) {
                    m71Var = m71.NOT_CROSSED;
                } else if (i4 > i3) {
                    m71Var = m71.CROSSED;
                } else {
                    m71Var = m71.COLLAPSED;
                }
                if (m71Var == m71.CROSSED) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(z ^ z2)) {
                }
            }
            return ls0Var.b(i);
        }
        int i7 = k47.c;
        if (i6 != ((int) (j >> 32)) && i6 != ((int) (4294967295L & j))) {
            return ls0Var.b(i);
        }
        return (da6) M2.getValue();
    }

    public static final void g(j07 j07Var, Context context, final boolean z, final String str, final long j) {
        if (!k47.c(j) && str.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            final Context context2 = context;
            List list = (List) mb3.v.g(context2);
            if (!list.isEmpty()) {
                ca4 ca4Var = j07Var.a;
                ca4 ca4Var2 = j07Var.a;
                w07 w07Var = w07.b;
                ca4Var.a(w07Var);
                int size = list.size();
                int i = 0;
                while (i < size) {
                    final ResolveInfo resolveInfo = (ResolveInfo) list.get(i);
                    ca4Var2.a(new s07(new j35(i), resolveInfo.loadLabel(packageManager).toString(), 0, new qn2() { // from class: k35
                        @Override // defpackage.qn2
                        public final Object g(Object obj) {
                            mb3.w.p(context2, resolveInfo, Boolean.valueOf(z), str, new k47(j));
                            ((x07) obj).close();
                            return jg7.a;
                        }
                    }));
                    i++;
                    context2 = context;
                }
                ca4Var2.a(w07Var);
            }
        }
    }

    public static final da6 h(ls0 ls0Var, boolean z, boolean z2, s60 s60Var) {
        int i;
        long j;
        if (z2) {
            i = ls0Var.b;
        } else {
            i = ls0Var.c;
        }
        long k = s60Var.k(i, ls0Var);
        if (z ^ z2) {
            int i2 = k47.c;
            j = k >> 32;
        } else {
            int i3 = k47.c;
            j = 4294967295L & k;
        }
        return ls0Var.b((int) j);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0087 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean i(vh2 vh2Var, ln lnVar) {
        boolean z;
        sh2 W0 = vh2Var.W0();
        int[] iArr = zl4.a;
        int i = iArr[W0.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (!P(vh2Var, lnVar)) {
                        if (vh2Var.T0().a) {
                            z = ((Boolean) lnVar.g(vh2Var)).booleanValue();
                        } else {
                            z = false;
                        }
                        if (!z) {
                            return false;
                        }
                    }
                    return true;
                }
                i.d();
                return false;
            }
            return P(vh2Var, lnVar);
        }
        vh2 t = yh2.t(vh2Var);
        if (t != null) {
            int i2 = iArr[t.W0().ordinal()];
            if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    if (i2 != 4) {
                        i.d();
                        return false;
                    }
                    i.m("ActiveParent must have a focusedChild");
                    return false;
                }
                return y(vh2Var, t, 2, lnVar);
            } else if (i(t, lnVar) || y(vh2Var, t, 2, lnVar) || (t.T0().a && ((Boolean) lnVar.g(t)).booleanValue())) {
                return true;
            }
        } else {
            i.m("ActiveParent must have a focusedChild");
            return false;
        }
    }

    public static final of5 j(jk3 jk3Var) {
        jk3 D = jk3Var.D();
        if (D != null) {
            return D.O(jk3Var, true);
        }
        return new of5(RecyclerView.B1, RecyclerView.B1, (int) (jk3Var.m() >> 32), (int) (jk3Var.m() & 4294967295L));
    }

    public static final of5 k(jk3 jk3Var, boolean z) {
        jk3 w = w(jk3Var);
        float m = (int) (w.m() >> 32);
        float m2 = (int) (w.m() & 4294967295L);
        of5 O = w.O(jk3Var, z);
        float f2 = O.a;
        float f3 = RecyclerView.B1;
        if (z) {
            if (f2 < RecyclerView.B1) {
                f2 = 0.0f;
            }
            if (f2 > m) {
                f2 = m;
            }
        }
        float f4 = O.b;
        if (z) {
            if (f4 < RecyclerView.B1) {
                f4 = 0.0f;
            }
            if (f4 > m2) {
                f4 = m2;
            }
        }
        float f5 = O.c;
        if (z) {
            if (f5 < RecyclerView.B1) {
                f5 = 0.0f;
            }
            if (f5 <= m) {
                m = f5;
            }
            f5 = m;
        }
        float f6 = O.d;
        if (z) {
            if (f6 >= RecyclerView.B1) {
                f3 = f6;
            }
            if (f3 <= m2) {
                m2 = f3;
            }
            f6 = m2;
        }
        if (f2 == f5 || f4 == f6) {
            return of5.e;
        }
        long d2 = w.d((Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long d3 = w.d((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
        long d4 = w.d((Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L));
        long d5 = w.d((Float.floatToRawIntBits(f6) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (d2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (d3 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (d5 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (d4 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (d2 & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (d3 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (d5 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (d4 & 4294967295L));
        return new of5(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final da6 l(da6 da6Var, ls0 ls0Var, int i) {
        return new da6(((a47) ls0Var.e).a(i), i, da6Var.c);
    }

    public static final boolean m(vy4 vy4Var) {
        if (!vy4Var.c() && !vy4Var.h && vy4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean n(vy4 vy4Var) {
        if (!vy4Var.h && vy4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean o(vy4 vy4Var) {
        if (!vy4Var.c() && vy4Var.h && !vy4Var.d) {
            return true;
        }
        return false;
    }

    public static final boolean p(vy4 vy4Var) {
        if (vy4Var.h && !vy4Var.d) {
            return true;
        }
        return false;
    }

    public static int q(int i, int i2, int i3) {
        if (i < i2) {
            return i2;
        }
        if (i > i3) {
            return i3;
        }
        return i;
    }

    public static cf1 r(long j, long j2, px0 px0Var, int i) {
        long j3;
        long j4;
        if ((i & 1) != 0) {
            j3 = ((ut0) ((xq2) px0Var).j(vt0.a)).g();
        } else {
            j3 = j;
        }
        nq6 nq6Var = vt0.a;
        xq2 xq2Var = (xq2) px0Var;
        long f2 = ((ut0) xq2Var.j(nq6Var)).f();
        long j5 = ((kt0) xq2Var.j(j31.a)).a;
        if (((ut0) xq2Var.j(nq6Var)).k()) {
            hv.N(j5);
        } else {
            hv.N(j5);
        }
        long l = hv.l(kt0.c(0.38f, f2), ((ut0) xq2Var.j(nq6Var)).j());
        if ((i & 4) != 0) {
            j4 = ((ut0) ((xq2) px0Var).j(nq6Var)).g();
        } else {
            j4 = j2;
        }
        long c2 = kt0.c(0.24f, j4);
        long c3 = kt0.c(0.32f, ((ut0) ((xq2) px0Var).j(nq6Var)).f());
        long c4 = kt0.c(0.12f, c3);
        long c5 = kt0.c(0.54f, vt0.b(j4, px0Var));
        return new cf1(j3, l, j4, c2, c3, c4, c5, kt0.c(0.54f, j4), kt0.c(0.12f, c5), kt0.c(0.12f, c4));
    }

    public static final int s(j36 j36Var, String str) {
        j36Var.getClass();
        int columnCount = j36Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i < columnCount) {
                if (str.equals(j36Var.getColumnName(i))) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i >= 0) {
            return i;
        }
        String k = i61.k('`', "`", str);
        int columnCount2 = j36Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 < columnCount2) {
                if (k.equals(j36Var.getColumnName(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = j36Var.getColumnCount();
            String concat = ".".concat(str);
            String k2 = i61.k('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = j36Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (xs6.Y(columnName, concat, false) || (columnName.charAt(0) == '`' && xs6.Y(columnName, k2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static final boolean t(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            di7 di7Var = (di7) obj;
            if (di7Var != null && L(di7Var)) {
                return true;
            }
        }
        return false;
    }

    public static int u(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("ShaderFactory", GLES20.glGetShaderInfoLog(glCreateShader));
        }
        return glCreateShader;
    }

    public static wd6 v(fe6 fe6Var) {
        int i;
        fe6Var.getClass();
        int u = u(35633, fe6Var.b);
        int u2 = u(35632, fe6Var.c);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, u);
        GLES20.glAttachShader(glCreateProgram, u2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 0) {
            Log.e("ShaderFactory", GLES20.glGetProgramInfoLog(glCreateProgram));
        }
        int i2 = de6.a[fe6Var.a.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                i = 9729;
            } else {
                i.d();
                return null;
            }
        } else {
            i = 9728;
        }
        return new wd6(u, u2, glCreateProgram, i);
    }

    public static final jk3 w(jk3 jk3Var) {
        jk3 jk3Var2;
        eg4 eg4Var;
        jk3 D = jk3Var.D();
        while (true) {
            jk3 jk3Var3 = D;
            jk3Var2 = jk3Var;
            jk3Var = jk3Var3;
            if (jk3Var == null) {
                break;
            }
            D = jk3Var.D();
        }
        if (jk3Var2 instanceof eg4) {
            eg4Var = (eg4) jk3Var2;
        } else {
            eg4Var = null;
        }
        if (eg4Var == null) {
            return jk3Var2;
        }
        eg4 eg4Var2 = eg4Var.o0;
        while (true) {
            eg4 eg4Var3 = eg4Var2;
            eg4 eg4Var4 = eg4Var;
            eg4Var = eg4Var3;
            if (eg4Var != null) {
                eg4Var2 = eg4Var.o0;
            } else {
                return eg4Var4;
            }
        }
    }

    public static final boolean x(vh2 vh2Var, ln lnVar) {
        int i = zl4.a[vh2Var.W0().ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    if (vh2Var.T0().a) {
                        return ((Boolean) lnVar.g(vh2Var)).booleanValue();
                    }
                    return Q(vh2Var, lnVar);
                }
                i.d();
                return false;
            }
            return Q(vh2Var, lnVar);
        }
        vh2 t = yh2.t(vh2Var);
        if (t != null) {
            if (!x(t, lnVar) && !y(vh2Var, t, 1, lnVar)) {
                return false;
            }
            return true;
        }
        i.m("ActiveParent must have a focusedChild");
        return false;
    }

    public static final boolean y(vh2 vh2Var, vh2 vh2Var2, int i, ln lnVar) {
        if (T(vh2Var, vh2Var2, i, lnVar)) {
            return true;
        }
        Boolean bool = (Boolean) nb3.X(vh2Var, i, new am4(((eh2) ((te) nc1.g0(vh2Var)).getFocusOwner()).f(), vh2Var, vh2Var2, i, lnVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final Rect z(TextPaint textPaint, CharSequence charSequence, int i, int i2) {
        int i3 = i;
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            if (spanned.nextSpanTransition(i3 - 1, i2, MetricAffectingSpan.class) != i2) {
                Rect rect = new Rect();
                Rect rect2 = new Rect();
                TextPaint textPaint2 = new TextPaint();
                while (i3 < i2) {
                    int nextSpanTransition = spanned.nextSpanTransition(i3, i2, MetricAffectingSpan.class);
                    MetricAffectingSpan[] metricAffectingSpanArr = (MetricAffectingSpan[]) spanned.getSpans(i3, nextSpanTransition, MetricAffectingSpan.class);
                    textPaint2.set(textPaint);
                    for (MetricAffectingSpan metricAffectingSpan : metricAffectingSpanArr) {
                        if (spanned.getSpanStart(metricAffectingSpan) != spanned.getSpanEnd(metricAffectingSpan)) {
                            metricAffectingSpan.updateMeasureState(textPaint2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        textPaint2.getTextBounds(charSequence, i3, nextSpanTransition, rect2);
                    } else {
                        textPaint2.getTextBounds(charSequence.toString(), i3, nextSpanTransition, rect2);
                    }
                    rect.right = rect2.width() + rect.right;
                    rect.top = Math.min(rect.top, rect2.top);
                    rect.bottom = Math.max(rect.bottom, rect2.bottom);
                    i3 = nextSpanTransition;
                }
                return rect;
            }
        }
        Rect rect3 = new Rect();
        if (Build.VERSION.SDK_INT >= 29) {
            textPaint.getTextBounds(charSequence, i3, i2, rect3);
            return rect3;
        }
        textPaint.getTextBounds(charSequence.toString(), i3, i2, rect3);
        return rect3;
    }
}
