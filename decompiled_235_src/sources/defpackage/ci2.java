package defpackage;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import androidx.preference.SwitchPreference;
import androidx.work.impl.WorkDatabase;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import me.magnum.melonds.translator.ui.GameTranslationOverlayView;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
import me.magnum.melonds.ui.layouteditor.b;
import me.magnum.melonds.ui.settings.preferences.StoragePickerPreference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ci2 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ ci2(vb4 vb4Var, sb4 sb4Var, boolean z) {
        this.A = 12;
        this.B = vb4Var;
        this.L = sb4Var;
    }

    private final Object a() {
        bi2 bi2Var = (bi2) this.B;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.L;
        synchronized (rf6.b) {
            LinkedHashMap linkedHashMap = rf6.c;
            linkedHashMap.remove(bi2Var);
            if (linkedHashMap.isEmpty()) {
                ga0.f().b(zv7.a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(rf6.a);
                rf6.f = null;
                rf6.d = null;
                rf6.e = false;
            }
        }
        return jg7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Character, java.lang.Object] */
    @Override // defpackage.on2
    public final Object c() {
        long a;
        int i;
        Object obj;
        String[] names;
        String str;
        String str2;
        ey0 ey0Var;
        int i2 = -1;
        xz2[] xz2VarArr = null;
        switch (this.A) {
            case 0:
                ((dh5) this.B).A = hf.K((di2) this.L, zw4.a);
                return jg7.a;
            case 1:
                ((o60) this.B).dismiss();
                GameTranslationOverlayView gameTranslationOverlayView = ((hq2) this.L).l;
                if (gameTranslationOverlayView != null) {
                    gameTranslationOverlayView.setEditRegionsMode(true);
                }
                return jg7.a;
            case 2:
                ((hs2) this.B).a.getContentResolver().unregisterContentObserver((gs2) this.L);
                return jg7.a;
            case 3:
                qz2 qz2Var = (qz2) this.B;
                xz2 xz2Var = (xz2) this.L;
                try {
                    qz2Var.A.b(xz2Var);
                } catch (IOException e) {
                    kx4 kx4Var = kx4.a;
                    kx4.a.i("Http2Connection.Listener failure for " + qz2Var.L, 4, e);
                    try {
                        xz2Var.c(a62.PROTOCOL_ERROR, e);
                    } catch (IOException unused) {
                    }
                }
                return jg7.a;
            case 4:
                fd6 fd6Var = (fd6) this.L;
                ?? obj2 = new Object();
                qz2 qz2Var2 = (qz2) ((i5) this.B).L;
                synchronized (qz2Var2.s0) {
                    synchronized (qz2Var2) {
                        fd6 fd6Var2 = qz2Var2.n0;
                        fd6 fd6Var3 = new fd6();
                        fd6Var2.getClass();
                        for (int i3 = 0; i3 < 10; i3++) {
                            if (((1 << i3) & fd6Var2.a) != 0) {
                                fd6Var3.b(i3, fd6Var2.b[i3]);
                            }
                        }
                        for (int i4 = 0; i4 < 10; i4++) {
                            if (((1 << i4) & fd6Var.a) != 0) {
                                fd6Var3.b(i4, fd6Var.b[i4]);
                            }
                        }
                        obj2.A = fd6Var3;
                        a = fd6Var3.a() - fd6Var2.a();
                        i = (a > 0L ? 1 : (a == 0L ? 0 : -1));
                        if (i != 0 && !qz2Var2.B.isEmpty()) {
                            xz2VarArr = (xz2[]) qz2Var2.B.values().toArray(new xz2[0]);
                        }
                        fd6 fd6Var4 = (fd6) obj2.A;
                        fd6Var4.getClass();
                        qz2Var2.n0 = fd6Var4;
                        pz6.b(qz2Var2.f0, qz2Var2.L + " onSettings", 0L, new ci2(qz2Var2, obj2), 6);
                    }
                    try {
                        qz2Var2.s0.e((fd6) obj2.A);
                    } catch (IOException e2) {
                        a62 a62Var = a62.PROTOCOL_ERROR;
                        qz2Var2.e(a62Var, a62Var, e2);
                    }
                }
                if (xz2VarArr != null) {
                    for (xz2 xz2Var2 : xz2VarArr) {
                        synchronized (xz2Var2) {
                            xz2Var2.X += a;
                            if (i > 0) {
                                xz2Var2.notifyAll();
                            }
                        }
                    }
                }
                return jg7.a;
            case 5:
                qz2 qz2Var3 = (qz2) this.L;
                qz2Var3.A.a(qz2Var3, (fd6) ((dh5) this.B).A);
                return jg7.a;
            case 6:
                wb6 wb6Var = (wb6) this.B;
                id3 id3Var = (id3) this.L;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                td3 td3Var = id3Var.a;
                te3.d(id3Var, wb6Var);
                int f = wb6Var.f();
                for (int i5 = 0; i5 < f; i5++) {
                    List i6 = wb6Var.i(i5);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : i6) {
                        if (obj3 instanceof se3) {
                            arrayList.add(obj3);
                        }
                    }
                    if (arrayList.size() == 1) {
                        obj = arrayList.get(0);
                    } else {
                        obj = null;
                    }
                    se3 se3Var = (se3) obj;
                    if (se3Var != null && (names = se3Var.names()) != null) {
                        for (String str3 : names) {
                            if (nb3.k(wb6Var.e(), bc6.e)) {
                                str = "enum value";
                            } else {
                                str = "property";
                            }
                            if (!linkedHashMap.containsKey(str3)) {
                                linkedHashMap.put(str3, Integer.valueOf(i5));
                            } else {
                                throw new me3(hi2.x("The suggested name '" + str3 + "' for " + str + ' ' + wb6Var.g(i5) + " is already one of the names for " + str + ' ' + wb6Var.g(((Number) c14.j0(linkedHashMap, str3)).intValue()) + " in " + wb6Var, null, -1, null, null));
                            }
                        }
                        continue;
                    }
                }
                if (linkedHashMap.isEmpty()) {
                    return zt1.A;
                }
                return linkedHashMap;
            case 7:
                Integer num = (Integer) this.B;
                qn2 qn2Var = (qn2) this.L;
                if (num != null) {
                    qn2Var.g(num);
                }
                return jg7.a;
            case 8:
                b bVar = (b) this.B;
                lj3 lj3Var = (lj3) this.L;
                jl3 jl3Var = bVar.d0;
                if (jl3Var != null) {
                    sn3 sn3Var = bVar.A;
                    UUID uuid = lj3Var.a;
                    sn3Var.getClass();
                    LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) ((s63) jl3Var).B;
                    int i7 = LayoutEditorActivity.N0;
                    layoutEditorActivity.D();
                    Intent intent = new Intent(layoutEditorActivity, BackgroundsActivity.class);
                    if (uuid != null) {
                        str2 = uuid.toString();
                    } else {
                        str2 = null;
                    }
                    intent.putExtra("initial_background_id", str2);
                    int i8 = tk3.a[sn3Var.ordinal()];
                    if (i8 != 1) {
                        if (i8 == 2) {
                            layoutEditorActivity.L0.a(intent);
                        } else {
                            i.d();
                            return null;
                        }
                    } else {
                        layoutEditorActivity.K0.a(intent);
                    }
                }
                return jg7.a;
            case 9:
                ip3 ip3Var = (ip3) this.L;
                oo3 oo3Var = (oo3) ((ii1) this.B).getValue();
                return new po3(ip3Var, oo3Var, new ei((l93) ip3Var.d.f.getValue(), oo3Var));
            case 10:
                ue1 ue1Var = (ue1) this.L;
                zq4 zq4Var = (zq4) ((ii1) this.B).getValue();
                return new ar4(ue1Var, zq4Var, new ei((l93) ue1Var.d.f.getValue(), zq4Var));
            case 11:
                return new rr3((q46) this.B, zt1.A, (o46) this.L);
            case 12:
                vb4 vb4Var = (vb4) this.B;
                sb4 sb4Var = (sb4) this.L;
                sb4Var.getClass();
                synchronized (vb4Var.a) {
                    try {
                        tp6 tp6Var = vb4Var.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : (Iterable) tp6Var.getValue()) {
                            if (!nb3.k((sb4) obj4, sb4Var)) {
                                arrayList2.add(obj4);
                            } else {
                                tp6Var.m(null, arrayList2);
                            }
                        }
                        tp6Var.m(null, arrayList2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jg7.a;
            case 13:
                ((ConnectivityManager) this.B).unregisterNetworkCallback((c53) this.L);
                return jg7.a;
            case 14:
                df5 df5Var = (df5) this.L;
                if (((vw) ((m44) this.B).B).get() == 0) {
                    df5Var.c();
                }
                return jg7.a;
            case 15:
                return mp2.l((String) this.B, bt6.h, new wb6[0], new bg2((wh4) this.L, 15));
            case 16:
                ((ax0) this.B).d = (eo2) this.L;
                return jg7.a;
            case 17:
                SwitchPreference switchPreference = (SwitchPreference) this.B;
                zw zwVar = (zw) this.L;
                x05 onPreferenceChangeListener = switchPreference.getOnPreferenceChangeListener();
                if (onPreferenceChangeListener instanceof wx0) {
                    ((wx0) onPreferenceChangeListener).a.remove(zwVar);
                } else if (onPreferenceChangeListener == zwVar) {
                    switchPreference.setOnPreferenceChangeListener(null);
                }
                return jg7.a;
            case 18:
                ((StoragePickerPreference) this.B).f((Uri) this.L);
                return jg7.a;
            case 19:
                ka4 ka4Var = (ka4) this.B;
                ey0 ey0Var2 = (ey0) this.L;
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j = jArr[i9];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j) < 128) {
                                    ey0Var2.z(objArr[(i9 << 3) + i11]);
                                }
                                j >>= 8;
                            }
                            if (i10 != 8) {
                            }
                        }
                        if (i9 != length) {
                            i9++;
                        }
                    }
                }
                return jg7.a;
            case 20:
                xh5 xh5Var = (xh5) this.B;
                String str4 = (String) this.L;
                xh5Var.getClass();
                Matcher matcher = xh5Var.A.matcher(str4);
                matcher.getClass();
                return kn2.k(matcher, 0, str4);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                qn2 qn2Var2 = (qn2) this.B;
                qw5 qw5Var = (qw5) this.L;
                qw5 qw5Var2 = qw5.FAVORITES;
                if (qw5Var == qw5Var2) {
                    qw5Var2 = qw5.ALL;
                }
                qn2Var2.g(qw5Var2);
                return jg7.a;
            case 22:
                ((qn2) this.B).g((lr5) this.L);
                return jg7.a;
            case ConnectionResult.API_DISABLED /* 23 */:
                Map map = ((ss5) this.B).k;
                int intValue = ((Number) ((pp6) this.L).getValue()).intValue();
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        ?? r3 = (Character) entry.getKey();
                        r3.getClass();
                        int intValue2 = ((Number) entry.getValue()).intValue();
                        if (intValue2 <= intValue && intValue2 > i2) {
                            i2 = intValue2;
                            xz2VarArr = r3;
                        }
                    }
                }
                return xz2VarArr;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ((qn2) this.B).g((vv5) this.L);
                return jg7.a;
            case 25:
                ((qn2) this.B).g(Integer.valueOf(((c46) this.L).a));
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                ((qn2) this.B).g(Float.valueOf(((rs4) this.L).h()));
                return jg7.a;
            case 27:
                return a();
            case 28:
                el6 el6Var = (el6) this.B;
                k92 k92Var = (k92) this.L;
                if (!nb3.k(el6Var, k92Var.a)) {
                    gt0.W0(k92Var.b, new ro5(el6Var, 13));
                    cf5 cf5Var = k92Var.c;
                    if (cf5Var != null && (ey0Var = cf5Var.a) != null) {
                        ey0Var.s(cf5Var, null);
                    }
                }
                return jg7.a;
            default:
                return ((r76) this.B).g((WorkDatabase) this.L);
        }
    }

    public /* synthetic */ ci2(qz2 qz2Var, dh5 dh5Var) {
        this.A = 5;
        this.L = qz2Var;
        this.B = dh5Var;
    }

    public /* synthetic */ ci2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }
}
