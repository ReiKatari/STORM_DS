package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.ActionMode;
import android.view.Choreographer;
import android.widget.Toast;
import androidx.fragment.app.g;
import androidx.fragment.app.u;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.stormds.emulator.R;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ n0(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    private final void a() {
        vi2 vi2Var = (vi2) this.B;
        synchronized (vi2Var.d) {
            try {
                if (vi2Var.h == null) {
                    return;
                }
                try {
                    rj2 c = vi2Var.c();
                    int i = c.f;
                    if (i == 2) {
                        synchronized (vi2Var.d) {
                        }
                    }
                    if (i == 0) {
                        Method method = v87.b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        w31 w31Var = vi2Var.c;
                        Context context = vi2Var.a;
                        w31Var.getClass();
                        rj2[] rj2VarArr = {c};
                        bl2 bl2Var = je7.a;
                        Trace.beginSection(ln2.f0("TypefaceCompat.createFromFontInfo"));
                        Typeface p = je7.a.p(context, rj2VarArr, 0);
                        Trace.endSection();
                        MappedByteBuffer T = kn2.T(vi2Var.a, c.a);
                        if (T != null && p != null) {
                            Trace.beginSection("EmojiCompat.MetadataRepo.create");
                            eb ebVar = new eb(p, mp2.S(T));
                            Trace.endSection();
                            Trace.endSection();
                            synchronized (vi2Var.d) {
                                hv hvVar = vi2Var.h;
                                if (hvVar != null) {
                                    hvVar.P(ebVar);
                                }
                            }
                            vi2Var.b();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                } catch (Throwable th) {
                    synchronized (vi2Var.d) {
                        try {
                            hv hvVar2 = vi2Var.h;
                            if (hvVar2 != null) {
                                hvVar2.O(th);
                            }
                            vi2Var.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0346  */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj;
        te teVar;
        te teVar2;
        ArrayList arrayList;
        int i;
        long j;
        ArrayList arrayList2;
        float min;
        long j2;
        boolean z;
        long j3;
        long j4;
        int i2;
        Application application = null;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        switch (this.A) {
            case 0:
                ((p0) this.B).b();
                return;
            case 1:
                boolean z3 = true;
                Activity activity = (Activity) this.B;
                if (!activity.isFinishing()) {
                    Handler handler = x8.g;
                    Method method = x8.f;
                    w8 w8Var = Build.VERSION.SDK_INT;
                    if (w8Var >= 28) {
                        activity.recreate();
                        return;
                    }
                    if (((w8Var != 26 && w8Var != 27) || method != null) && (x8.e != null || x8.d != null)) {
                        try {
                            Object obj2 = x8.c.get(activity);
                            if (obj2 != null && (obj = x8.b.get(activity)) != null) {
                                Application application2 = activity.getApplication();
                                w8 w8Var2 = new w8(activity);
                                application2.registerActivityLifecycleCallbacks(w8Var2);
                                handler.post(new uo2(2, w8Var2, obj2));
                                if (w8Var != 26 && w8Var != 27) {
                                    z3 = false;
                                }
                                try {
                                    if (z3) {
                                        try {
                                            Boolean bool = Boolean.FALSE;
                                            application = application2;
                                            w8Var = w8Var2;
                                            method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                        } catch (Throwable th) {
                                            th = th;
                                            application = application2;
                                            w8 w8Var3 = w8Var2;
                                            handler.post(new uo2(3, application, w8Var3));
                                            throw th;
                                        }
                                    } else {
                                        application = application2;
                                        w8Var = w8Var2;
                                        activity.recreate();
                                    }
                                    handler.post(new uo2(3, application, (Object) w8Var));
                                    return;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 2:
                ze zeVar = (ze) this.B;
                Trace.beginSection("measureAndLayout");
                try {
                    zeVar.R.s(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        zeVar.n();
                        Trace.endSection();
                        zeVar.E0 = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            case 3:
                qf qfVar = (qf) this.B;
                boolean d = qfVar.d();
                te teVar3 = qfVar.A;
                if (d) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        teVar3.s(true);
                        p94 p94Var = qfVar.g0;
                        int[] iArr = p94Var.b;
                        long[] jArr = p94Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j5 = jArr[i5];
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    long j6 = j5;
                                    int i7 = 0;
                                    while (i7 < i6) {
                                        if ((255 & j6) < 128) {
                                            int i8 = iArr[(i5 << 3) + i7];
                                            if (!qfVar.c().a(i8)) {
                                                teVar2 = teVar3;
                                                qfVar.R.add(new h31(i8, qfVar.f0, i31.VIEW_DISAPPEAR, null));
                                                qfVar.d0.c(jg7.a);
                                                j6 >>= 8;
                                                i7++;
                                                teVar3 = teVar2;
                                            }
                                        }
                                        teVar2 = teVar3;
                                        j6 >>= 8;
                                        i7++;
                                        teVar3 = teVar2;
                                    }
                                    teVar = teVar3;
                                    if (i6 == 8) {
                                    }
                                } else {
                                    teVar = teVar3;
                                }
                                if (i5 != length) {
                                    i5++;
                                    teVar3 = teVar;
                                }
                            }
                        } else {
                            teVar = teVar3;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        qfVar.f(teVar.getSemanticsOwner().a(), qfVar.h0);
                        Trace.endSection();
                        qfVar.b(qfVar.c());
                        qfVar.k();
                        qfVar.i0 = false;
                        return;
                    } finally {
                    }
                }
                return;
            case 4:
                ActionMode actionMode = ((hm) this.B).h;
                if (actionMode != null) {
                    actionMode.finish();
                    return;
                }
                return;
            case 5:
                po poVar = (po) ((po) this.B).c.B;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList3 = poVar.b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i9 = 0;
                while (i9 < arrayList3.size()) {
                    fo6 fo6Var = (fo6) arrayList3.get(i9);
                    if (fo6Var != null) {
                        ci6 ci6Var = poVar.a;
                        Long l = (Long) ci6Var.get(fo6Var);
                        if (l != null) {
                            if (l.longValue() < uptimeMillis2) {
                                ci6Var.remove(fo6Var);
                            }
                        }
                        long j7 = fo6Var.i;
                        if (j7 == 0) {
                            fo6Var.i = uptimeMillis;
                            fo6Var.c(fo6Var.b);
                        } else {
                            long j8 = uptimeMillis - j7;
                            fo6Var.i = uptimeMillis;
                            float f = fo6.b().g;
                            if (f == RecyclerView.B1) {
                                j = 2147483647L;
                            } else {
                                j = ((float) j8) / f;
                            }
                            long j9 = j;
                            boolean z4 = fo6Var.o;
                            float f2 = fo6Var.n;
                            if (z4) {
                                if (f2 != Float.MAX_VALUE) {
                                    fo6Var.m.i = f2;
                                    fo6Var.n = Float.MAX_VALUE;
                                }
                                fo6Var.b = (float) fo6Var.m.i;
                                fo6Var.a = RecyclerView.B1;
                                fo6Var.o = z2;
                                arrayList2 = arrayList3;
                                j2 = uptimeMillis2;
                            } else {
                                int i10 = (f2 > Float.MAX_VALUE ? 1 : (f2 == Float.MAX_VALUE ? 0 : -1));
                                go6 go6Var = fo6Var.m;
                                float f3 = fo6Var.b;
                                float f4 = fo6Var.a;
                                if (i10 != 0) {
                                    arrayList2 = arrayList3;
                                    long j10 = j9 / 2;
                                    gv c = go6Var.c(f3, f4, j10);
                                    go6 go6Var2 = fo6Var.m;
                                    go6Var2.i = fo6Var.n;
                                    fo6Var.n = Float.MAX_VALUE;
                                    gv c2 = go6Var2.c(c.a, c.b, j10);
                                    fo6Var.b = c2.a;
                                    fo6Var.a = c2.b;
                                } else {
                                    arrayList2 = arrayList3;
                                    gv c3 = go6Var.c(f3, f4, j9);
                                    fo6Var.b = c3.a;
                                    fo6Var.a = c3.b;
                                }
                                float max = Math.max(fo6Var.b, fo6Var.h);
                                fo6Var.b = max;
                                fo6Var.b = Math.min(max, fo6Var.g);
                                float f5 = fo6Var.a;
                                go6 go6Var3 = fo6Var.m;
                                go6Var3.getClass();
                                j2 = uptimeMillis2;
                                if (Math.abs(f5) < go6Var3.e && Math.abs(min - ((float) go6Var3.i)) < go6Var3.d) {
                                    fo6Var.b = (float) fo6Var.m.i;
                                    fo6Var.a = RecyclerView.B1;
                                } else {
                                    z = false;
                                    float min2 = Math.min(fo6Var.b, fo6Var.g);
                                    fo6Var.b = min2;
                                    float max2 = Math.max(min2, fo6Var.h);
                                    fo6Var.b = max2;
                                    fo6Var.c(max2);
                                    if (!z) {
                                        ArrayList arrayList4 = fo6Var.k;
                                        fo6Var.f = false;
                                        po b = fo6.b();
                                        b.a.remove(fo6Var);
                                        ArrayList arrayList5 = b.b;
                                        int indexOf = arrayList5.indexOf(fo6Var);
                                        if (indexOf >= 0) {
                                            arrayList5.set(indexOf, null);
                                            b.f = true;
                                        }
                                        fo6Var.i = 0L;
                                        fo6Var.c = false;
                                        int i11 = 0;
                                        while (i11 < arrayList4.size()) {
                                            if (arrayList4.get(i11) != null) {
                                                float f6 = fo6Var.b;
                                                z97 z97Var = ((y97) arrayList4.get(i11)).a;
                                                fa6 fa6Var = fa6.L;
                                                qa7 qa7Var = z97Var.h;
                                                if (f6 < 1.0f) {
                                                    long j11 = qa7Var.t0;
                                                    ea7 R = qa7Var.R(0);
                                                    ea7 ea7Var = R.o0;
                                                    R.o0 = null;
                                                    i2 = i11;
                                                    j4 = uptimeMillis;
                                                    qa7Var.H(-1L, z97Var.a);
                                                    qa7Var.H(j11, -1L);
                                                    z97Var.a = j11;
                                                    Runnable runnable = z97Var.g;
                                                    if (runnable != null) {
                                                        runnable.run();
                                                    }
                                                    qa7Var.q0.clear();
                                                    if (ea7Var != null) {
                                                        ea7Var.A(ea7Var, fa6Var, true);
                                                    }
                                                } else {
                                                    j4 = uptimeMillis;
                                                    i2 = i11;
                                                    qa7Var.A(qa7Var, fa6Var, false);
                                                }
                                                i11 = i2 + 1;
                                                uptimeMillis = j4;
                                            } else {
                                                j4 = uptimeMillis;
                                                i2 = i11;
                                            }
                                            i11 = i2 + 1;
                                            uptimeMillis = j4;
                                        }
                                        j3 = uptimeMillis;
                                        for (int size = arrayList4.size() - 1; size >= 0; size--) {
                                            if (arrayList4.get(size) == null) {
                                                arrayList4.remove(size);
                                            }
                                        }
                                    } else {
                                        j3 = uptimeMillis;
                                    }
                                    i9++;
                                    arrayList3 = arrayList2;
                                    uptimeMillis2 = j2;
                                    uptimeMillis = j3;
                                    z2 = false;
                                }
                            }
                            z = true;
                            float min22 = Math.min(fo6Var.b, fo6Var.g);
                            fo6Var.b = min22;
                            float max22 = Math.max(min22, fo6Var.h);
                            fo6Var.b = max22;
                            fo6Var.c(max22);
                            if (!z) {
                            }
                            i9++;
                            arrayList3 = arrayList2;
                            uptimeMillis2 = j2;
                            uptimeMillis = j3;
                            z2 = false;
                        }
                    }
                    j3 = uptimeMillis;
                    arrayList2 = arrayList3;
                    j2 = uptimeMillis2;
                    i9++;
                    arrayList3 = arrayList2;
                    uptimeMillis2 = j2;
                    uptimeMillis = j3;
                    z2 = false;
                }
                ArrayList arrayList6 = arrayList3;
                if (poVar.f) {
                    int size2 = arrayList6.size() - 1;
                    while (size2 >= 0) {
                        ArrayList arrayList7 = arrayList6;
                        if (arrayList7.get(size2) == null) {
                            arrayList7.remove(size2);
                        }
                        size2--;
                        arrayList6 = arrayList7;
                    }
                    arrayList = arrayList6;
                    if (arrayList.size() == 0 && Build.VERSION.SDK_INT >= 33) {
                        u63 u63Var = poVar.h;
                        o2.x((no) u63Var.B);
                        u63Var.B = null;
                    }
                    i = 0;
                    poVar.f = false;
                } else {
                    arrayList = arrayList6;
                    i = 0;
                }
                if (arrayList.size() > 0) {
                    ((Choreographer) poVar.e.B).postFrameCallback(new oo(poVar.d, i));
                    return;
                }
                return;
            case 6:
                g04.x(((bx) this.B).a, null);
                return;
            case 7:
                g04.x(((ed0) this.B).e, null);
                return;
            case 8:
                hv.V(vt1.A, new a6((rd0) this.B, null, 6));
                return;
            case 9:
                Process.setThreadPriority(-3);
                ((Runnable) this.B).run();
                return;
            case 10:
                ((CarouselLayoutManager) this.B).o0();
                return;
            case 11:
                ((lr0) this.B).s(true);
                return;
            case 12:
                jv0 jv0Var = (jv0) this.B;
                Runnable runnable2 = jv0Var.B;
                if (runnable2 != null) {
                    runnable2.run();
                    jv0Var.B = null;
                    return;
                }
                return;
            case 13:
                qv0.c((qv0) this.B);
                return;
            case 14:
                ((sz1) this.B).L0(false);
                return;
            case 15:
                on2 on2Var = (on2) ((dh5) this.B).A;
                if (on2Var != null) {
                    on2Var.c();
                    return;
                }
                return;
            case 16:
                g gVar = (g) this.B;
                if (u.K(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                ArrayList arrayList8 = gVar.c;
                int size3 = arrayList8.size();
                while (i4 < size3) {
                    Object obj3 = arrayList8.get(i4);
                    i4++;
                    ((nf1) obj3).a.c(gVar);
                }
                return;
            case 17:
                ((wv6) this.B).close();
                return;
            case 18:
                qf1 qf1Var = (qf1) this.B;
                qf1Var.j = true;
                qf1Var.c();
                return;
            case 19:
                vp1 vp1Var = (vp1) this.B;
                boolean isPopupShowing = vp1Var.h.isPopupShowing();
                vp1Var.s(isPopupShowing);
                vp1Var.m = isPopupShowing;
                return;
            case 20:
                mq1 mq1Var = (mq1) this.B;
                mq1Var.f = true;
                mq1Var.c();
                return;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                qs0 qs0Var = (qs0) ((s9) this.B).d;
                if (qs0Var != null) {
                    for (V v : qs0Var.values()) {
                        v.b();
                    }
                    return;
                }
                return;
            case 22:
                ((EmulatorMessageQueue) this.B).e();
                return;
            case ConnectionResult.API_DISABLED /* 23 */:
                ((b31) this.B).accept(new kv7(yt1.A));
                return;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((c92) this.B).b();
                return;
            case 25:
                Toast.makeText(((xb2) this.B).a, (int) R.string.rom_options_read_error, 0).show();
                return;
            case SubAllocator.N4 /* 26 */:
                a();
                return;
            case 27:
                ArrayList arrayList9 = ((u) this.B).n;
                int size4 = arrayList9.size();
                while (i3 < size4) {
                    Object obj4 = arrayList9.get(i3);
                    i3++;
                    ((gd6) obj4).getClass();
                }
                return;
            case 28:
                GameTranslationOverlayView gameTranslationOverlayView = (GameTranslationOverlayView) this.B;
                if (gameTranslationOverlayView.q0 && !gameTranslationOverlayView.t0) {
                    gameTranslationOverlayView.q0 = false;
                    gameTranslationOverlayView.performHapticFeedback(0);
                    on2 on2Var2 = gameTranslationOverlayView.n1;
                    if (on2Var2 != null) {
                        on2Var2.c();
                        return;
                    } else {
                        gameTranslationOverlayView.setEditRegionsMode(true);
                        return;
                    }
                }
                return;
            default:
                y13 y13Var = (y13) this.B;
                synchronized (y13Var.s0) {
                    try {
                        y13Var.u0 = null;
                        s23 s23Var = y13Var.t0;
                        if (s23Var != null) {
                            y13Var.t0 = null;
                            y13Var.f(s23Var);
                        }
                    } finally {
                    }
                }
                return;
        }
    }
}
