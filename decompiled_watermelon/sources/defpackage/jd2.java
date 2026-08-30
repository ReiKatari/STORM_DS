package defpackage;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraCharacteristics;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.view.textclassifier.TextClassification;
import androidx.preference.SwitchPreference;
import androidx.work.impl.WorkDatabase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jd2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class jd2 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ jd2(o34 o34Var, l34 l34Var, boolean z) {
        this.A = 11;
        this.B = o34Var;
        this.L = l34Var;
    }

    private final Object a() {
        gi2 gi2Var = (gi2) this.B;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.L;
        synchronized (f46.b) {
            LinkedHashMap linkedHashMap = f46.c;
            linkedHashMap.remove(gi2Var);
            if (linkedHashMap.isEmpty()) {
                y70.f().b(zg7.a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(f46.a);
                f46.f = null;
                f46.d = null;
                f46.e = false;
            }
        }
        return o27.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, n75] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Character, java.lang.Object] */
    @Override // defpackage.ki2
    public final Object c() {
        long a;
        int i;
        Object obj;
        String[] names;
        String str;
        String str2;
        iv0 iv0Var;
        CameraCharacteristics.Key key;
        String text;
        Intent intent;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i2 = -1;
        boolean z = true;
        int i3 = 0;
        wt2[] wt2VarArr = null;
        switch (this.A) {
            case 0:
                ((n75) this.B).A = mh7.t((kd2) this.L, un4.a);
                return o27.a;
            case 1:
                ((cm2) this.B).a.getContentResolver().unregisterContentObserver((bm2) this.L);
                return o27.a;
            case 2:
                pt2 pt2Var = (pt2) this.B;
                wt2 wt2Var = (wt2) this.L;
                try {
                    pt2Var.A.c(wt2Var);
                } catch (IOException e) {
                    fo4 fo4Var = fo4.a;
                    fo4.a.i(4, "Http2Connection.Listener failure for " + pt2Var.L, e);
                    try {
                        wt2Var.c(l12.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return o27.a;
            case 3:
                r16 r16Var = (r16) this.L;
                ?? obj2 = new Object();
                pt2 pt2Var2 = (pt2) ((j5) this.B).L;
                synchronized (pt2Var2.r0) {
                    synchronized (pt2Var2) {
                        r16 r16Var2 = pt2Var2.m0;
                        r16 r16Var3 = new r16();
                        r16Var2.getClass();
                        for (int i4 = 0; i4 < 10; i4++) {
                            if (((1 << i4) & r16Var2.a) != 0) {
                                r16Var3.b(i4, r16Var2.b[i4]);
                            }
                        }
                        for (int i5 = 0; i5 < 10; i5++) {
                            if (((1 << i5) & r16Var.a) != 0) {
                                r16Var3.b(i5, r16Var.b[i5]);
                            }
                        }
                        obj2.A = r16Var3;
                        a = r16Var3.a() - r16Var2.a();
                        i = (a > 0L ? 1 : (a == 0L ? 0 : -1));
                        if (i != 0 && !pt2Var2.B.isEmpty()) {
                            wt2VarArr = (wt2[]) pt2Var2.B.values().toArray(new wt2[0]);
                        }
                        r16 r16Var4 = (r16) obj2.A;
                        r16Var4.getClass();
                        pt2Var2.m0 = r16Var4;
                        en6.b(pt2Var2.e0, pt2Var2.L + " onSettings", new jd2(pt2Var2, obj2));
                    }
                    try {
                        pt2Var2.r0.d((r16) obj2.A);
                    } catch (IOException e2) {
                        l12 l12Var = l12.PROTOCOL_ERROR;
                        pt2Var2.d(l12Var, l12Var, e2);
                    }
                }
                if (wt2VarArr != null) {
                    int length = wt2VarArr.length;
                    while (i3 < length) {
                        wt2 wt2Var2 = wt2VarArr[i3];
                        synchronized (wt2Var2) {
                            wt2Var2.X += a;
                            if (i > 0) {
                                wt2Var2.notifyAll();
                            }
                        }
                        i3++;
                    }
                }
                return o27.a;
            case 4:
                pt2 pt2Var3 = (pt2) this.L;
                pt2Var3.A.a(pt2Var3, (r16) ((n75) this.B).A);
                return o27.a;
            case 5:
                h06 h06Var = (h06) this.B;
                t63 t63Var = (t63) this.L;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                e73 e73Var = t63Var.a;
                a83.d(t63Var, h06Var);
                int d = h06Var.d();
                for (int i6 = 0; i6 < d; i6++) {
                    List i7 = h06Var.i(i6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : i7) {
                        if (obj3 instanceof z73) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    z73 z73Var = (z73) obj;
                    if (z73Var != null && (names = z73Var.names()) != null) {
                        for (String str3 : names) {
                            if (b53.x(h06Var.c(), m06.h)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str3)) {
                                linkedHashMap.put(str3, Integer.valueOf(i6));
                            } else {
                                throw new t73(io2.u("The suggested name '" + str3 + "' for " + str + ' ' + h06Var.e(i6) + " is already one of the names for " + str + ' ' + h06Var.e(((Number) zt3.i0(str3, linkedHashMap)).intValue()) + " in " + h06Var, null, -1, null, null));
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return qp1.A;
                }
                return linkedHashMap;
            case ig7.b /* 6 */:
                Integer num = (Integer) this.B;
                mi2 mi2Var = (mi2) this.L;
                if (num != null) {
                    mi2Var.n(num);
                }
                return o27.a;
            case 7:
                b bVar = (b) this.B;
                tc3 tc3Var = (tc3) this.L;
                oe3 oe3Var = bVar.c0;
                if (oe3Var != null) {
                    ug3 ug3Var = bVar.A;
                    UUID uuid = tc3Var.a;
                    ug3Var.getClass();
                    LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) ((ka3) oe3Var).B;
                    int i8 = LayoutEditorActivity.M0;
                    layoutEditorActivity.C();
                    Intent intent2 = new Intent(layoutEditorActivity, BackgroundsActivity.class);
                    if (uuid != null) {
                        str2 = uuid.toString();
                    } else {
                        str2 = null;
                    }
                    intent2.putExtra("initial_background_id", str2);
                    int i9 = ae3.a[ug3Var.ordinal()];
                    if (i9 != 1) {
                        if (i9 == 2) {
                            layoutEditorActivity.K0.a(intent2);
                        } else {
                            i.c();
                            return null;
                        }
                    } else {
                        layoutEditorActivity.J0.a(intent2);
                    }
                }
                return o27.a;
            case 8:
                ki3 ki3Var = (ki3) this.L;
                ph3 ph3Var = (ph3) ((ee1) this.B).getValue();
                return new rh3(ki3Var, ph3Var, new sh((d33) ki3Var.d.f.getValue(), ph3Var));
            case 9:
                ya1 ya1Var = (ya1) this.L;
                wh4 wh4Var = (wh4) ((ee1) this.B).getValue();
                return new xh4(ya1Var, wh4Var, new sh((d33) ya1Var.d.f.getValue(), wh4Var));
            case 10:
                return new rk3((lt5) this.B, qp1.A, (jt5) this.L);
            case 11:
                o34 o34Var = (o34) this.B;
                l34 l34Var = (l34) this.L;
                l34Var.getClass();
                synchronized (o34Var.a) {
                    try {
                        ee6 ee6Var = o34Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : (Iterable) ee6Var.getValue()) {
                            if (!b53.x((l34) obj4, l34Var)) {
                                arrayList2.add(obj4);
                            } else {
                                ee6Var.l(null, arrayList2);
                            }
                        }
                        ee6Var.l(null, arrayList2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return o27.a;
            case mj2.L /* 12 */:
                ((ConnectivityManager) this.B).unregisterNetworkCallback((yy2) this.L);
                return o27.a;
            case 13:
                n55 n55Var = (n55) this.L;
                if (((dw) ((os) this.B).B).get() == 0) {
                    n55Var.c();
                }
                return o27.a;
            case 14:
                return oo2.t((String) this.B, kh6.k, new h06[0], new kb2(16, (d94) this.L));
            case ig7.e /* 15 */:
                ((eu0) this.B).d = (aj2) this.L;
                return o27.a;
            case 16:
                SwitchPreference switchPreference = (SwitchPreference) this.B;
                hw hwVar = (hw) this.L;
                ur4 onPreferenceChangeListener = switchPreference.getOnPreferenceChangeListener();
                if (onPreferenceChangeListener instanceof av0) {
                    ((av0) onPreferenceChangeListener).a.remove(hwVar);
                } else if (onPreferenceChangeListener == hwVar) {
                    switchPreference.setOnPreferenceChangeListener(null);
                }
                return o27.a;
            case 17:
                ((StoragePickerPreference) this.B).f((Uri) this.L);
                return o27.a;
            case 18:
                e24 e24Var = (e24) this.B;
                iv0 iv0Var2 = (iv0) this.L;
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length2 = jArr.length - 2;
                if (length2 >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j = jArr[i10];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length2)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((255 & j) < 128) {
                                    iv0Var2.z(objArr[(i10 << 3) + i12]);
                                }
                                j >>= 8;
                            }
                            if (i11 != 8) {
                            }
                        }
                        if (i10 != length2) {
                            i10++;
                        }
                    }
                }
                return o27.a;
            case 19:
                h85 h85Var = (h85) this.B;
                String str4 = (String) this.L;
                h85Var.getClass();
                Matcher matcher = h85Var.A.matcher(str4);
                matcher.getClass();
                return gk2.m(matcher, 0, str4);
            case 20:
                ((mi2) this.B).n((jh5) this.L);
                return o27.a;
            case 21:
                Map map = ((ri5) this.B).k;
                int intValue = ((Number) ((ae6) this.L).getValue()).intValue();
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        ?? r3 = (Character) entry.getKey();
                        r3.getClass();
                        int intValue2 = ((Number) entry.getValue()).intValue();
                        if (intValue2 <= intValue && intValue2 > i2) {
                            i2 = intValue2;
                            wt2VarArr = r3;
                        }
                    }
                }
                return wt2VarArr;
            case 22:
                ((mi2) this.B).n((gl5) this.L);
                return o27.a;
            case 23:
                ((mi2) this.B).n(Float.valueOf(((pj4) this.L).h()));
                return o27.a;
            case 24:
                return a();
            case 25:
                p96 p96Var = (p96) this.B;
                r42 r42Var = (r42) this.L;
                if (!b53.x(p96Var, r42Var.a)) {
                    tq0.Z0(r42Var.b, new n95(15, p96Var));
                    m55 m55Var = r42Var.c;
                    if (m55Var != null && (iv0Var = m55Var.a) != null) {
                        iv0Var.s(m55Var, null);
                    }
                }
                return o27.a;
            case 26:
                return ((d96) this.B).n((WorkDatabase) this.L);
            case 27:
                List<pj6> list = (List) this.L;
                uw uwVar = eg6.a;
                ce0 ce0Var = ((jj6) this.B).a;
                ce0Var.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    key = CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                    key.getClass();
                    long[] jArr2 = (long[]) ((ia0) ce0Var).c(key);
                    if (jArr2 != null && jArr2.length != 0) {
                        HashSet hashSet = new HashSet();
                        for (long j2 : jArr2) {
                            hashSet.add(Long.valueOf(j2));
                        }
                        for (pj6 pj6Var : list) {
                            if (!hashSet.contains(Long.valueOf(pj6Var.c.getValue()))) {
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 28:
                Context context = (Context) this.B;
                TextClassification textClassification = (TextClassification) this.L;
                text = textClassification.getText();
                if (text != null) {
                    i3 = text.hashCode();
                }
                intent = textClassification.getIntent();
                PendingIntent activity = PendingIntent.getActivity(context, i3, intent, 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        activity.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e3) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e3);
                    }
                } else {
                    activity.send();
                }
                return o27.a;
            default:
                tq5.w((o31) this.B, null, s31.UNDISPATCHED, new hq6(0, null, (mi2) this.L), 1);
                return o27.a;
        }
    }

    public /* synthetic */ jd2(pt2 pt2Var, n75 n75Var) {
        this.A = 4;
        this.L = pt2Var;
        this.B = n75Var;
    }

    public /* synthetic */ jd2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
