package defpackage;

import android.content.Intent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.p;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.smp.masterswitchpreference.MasterSwitchPreferenceFragment;
import com.stormds.emulator.R;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.RomsPreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.SaveFilesPreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class er2 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ er2(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x039c A[Catch: all -> 0x033f, TRY_LEAVE, TryCatch #14 {all -> 0x033f, blocks: (B:84:0x01eb, B:86:0x01fd, B:87:0x0209, B:97:0x026a, B:99:0x0275, B:147:0x033e, B:150:0x0343, B:179:0x039c, B:185:0x03bf, B:191:0x03cd, B:194:0x03e1, B:195:0x03e8, B:198:0x03ed, B:199:0x0402, B:88:0x0212, B:90:0x021b, B:96:0x0246, B:188:0x03c2, B:189:0x03c7, B:173:0x0391, B:100:0x027e, B:102:0x0287, B:105:0x0298, B:131:0x031e, B:134:0x0322, B:135:0x0327, B:106:0x02a1, B:108:0x02aa, B:112:0x02c7, B:117:0x02e1, B:118:0x02e6, B:120:0x02e9, B:121:0x030f), top: B:304:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x03bf A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v100, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v101, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v89 */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v94, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v95, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r4v9, types: [vr4] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c() {
        boolean z;
        RomListActivity romListActivity;
        int y0;
        Integer num;
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ?? th;
        int n;
        Integer num2;
        vr4 vr4Var;
        int i2 = this.A;
        int i3 = 2;
        int i4 = 4;
        int i5 = 1;
        boolean z2 = true;
        jg7 jg7Var = jg7.a;
        ?? r9 = 0;
        int i6 = 0;
        Integer num3 = null;
        Object obj = this.B;
        switch (i2) {
            case 0:
                GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) obj;
                wh7 wh7Var = generalPreferencesFragment.d0;
                if (wh7Var != null) {
                    yj1 yj1Var = generalPreferencesFragment.e0;
                    if (yj1Var != null) {
                        return new p15(generalPreferencesFragment, wh7Var, yj1Var);
                    }
                    nb3.a0("directoryAccessValidator");
                    throw null;
                }
                nb3.a0("uriPermissionManager");
                throw null;
            case 1:
                int i7 = pu2.a[((qu2) obj).a().ordinal()];
                int i8 = 1;
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            i8 = 4;
                            if (i7 != 4) {
                                if (i7 != 5) {
                                    i.d();
                                    return null;
                                }
                            } else {
                                i3 = 3;
                            }
                        }
                    }
                    i3 = i8;
                } else {
                    i3 = 0;
                }
                return Integer.valueOf(i3);
            case 2:
                qz2 qz2Var = (qz2) obj;
                qz2Var.getClass();
                try {
                    qz2Var.s0.u(2, false, 0);
                } catch (IOException e) {
                    a62 a62Var = a62.PROTOCOL_ERROR;
                    qz2Var.e(a62Var, a62Var, e);
                }
                return jg7Var;
            case 3:
                return Float.valueOf(kj2.y(((w61) obj).A()));
            case 4:
                Object systemService = ((View) ((u63) obj).B).getContext().getSystemService("input_method");
                systemService.getClass();
                return (InputMethodManager) systemService;
            case 5:
                return new fk3(null, ((wa3) obj).a.getString(R.string.use_global_layout), dk3.DEFAULT, ck3.FOLLOW_SYSTEM, false, 0, zt1.A);
            case 6:
                m16 m16Var = ((zb3) obj).a;
                if (m16Var.k() && !m16Var.n()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                return new BaseInputConnection(((kt3) obj).a, false);
            case 8:
                return MasterSwitchPreferenceFragment.h((MasterSwitchPreferenceFragment) obj);
            case 9:
                uk1 uk1Var = ((sb4) obj).d0;
                if (uk1Var.b) {
                    if (((ku3) uk1Var.k).d != tt3.DESTROYED) {
                        return ((tb4) xo7.a((sb4) uk1Var.c, (yo7) ((ex6) uk1Var.n).getValue(), 4).Z(gh5.a(tb4.class))).b;
                    }
                    i.m("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                } else {
                    i.m("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                return null;
            case 10:
                List list = wf4.d0;
                p activity = ((wf4) obj).getActivity();
                if (activity instanceof RomListActivity) {
                    romListActivity = (RomListActivity) activity;
                } else {
                    romListActivity = null;
                }
                if (romListActivity != null) {
                    romListActivity.startActivity(new Intent(romListActivity, SettingsActivity.class));
                }
                return jg7Var;
            case 11:
                return new gl4((il4) obj);
            case 12:
                ht4 ht4Var = (ht4) obj;
                return ht4Var.A.f(ht4Var.B);
            case 13:
                sg0 sg0Var = ((mw4) obj).A;
                Object obj2 = new Object();
                String str = sg0Var.a.B;
                return obj2;
            case 14:
                fz4 fz4Var = (fz4) obj;
                yb6 l = mp2.l("kotlinx.serialization.Polymorphic", dz4.e, new wb6[0], new bg2(fz4Var, 19));
                ar0 ar0Var = fz4Var.a;
                ar0Var.getClass();
                return new h41(l, ar0Var);
            case 15:
                yy7.b((xs7) obj);
                return jg7Var;
            case 16:
                yy7.b((Closeable) ((dh5) obj).A);
                return jg7Var;
            case 17:
                je5 je5Var = ((af5) obj).h;
                je5Var.getClass();
                je5Var.cancel();
                return jg7Var;
            case 18:
                kl5 kl5Var = (kl5) obj;
                ClassLoader classLoader = kl5Var.B;
                db2 db2Var = kl5Var.L;
                Enumeration<URL> resources = classLoader.getResources("");
                resources.getClass();
                ArrayList list2 = Collections.list(resources);
                list2.getClass();
                ArrayList arrayList3 = new ArrayList();
                int size = list2.size();
                int i9 = 0;
                while (i9 < size) {
                    Object obj3 = list2.get(i9);
                    i9++;
                    URL url = (URL) obj3;
                    url.getClass();
                    if (!nb3.k(url.getProtocol(), "file")) {
                        vr4Var = null;
                    } else {
                        String str2 = lt4.B;
                        vr4Var = new vr4(db2Var, w31.q(new File(url.toURI())));
                    }
                    if (vr4Var != null) {
                        arrayList3.add(vr4Var);
                    }
                }
                Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
                resources2.getClass();
                ArrayList list3 = Collections.list(resources2);
                list3.getClass();
                ArrayList arrayList4 = new ArrayList();
                int size2 = list3.size();
                int i10 = 0;
                while (i10 < size2) {
                    int i11 = i10 + 1;
                    URL url2 = (URL) list3.get(i10);
                    url2.getClass();
                    String url3 = url2.toString();
                    url3.getClass();
                    if (!xs6.g0(url3, "jar:file:", r9) || (y0 = qs6.y0(url3, "!", r9, 6)) == -1) {
                        arrayList = arrayList3;
                        Integer num4 = num3;
                        num = num4;
                        i = i11;
                        num2 = num4;
                    } else {
                        String str3 = lt4.B;
                        lt4 q = w31.q(new File(URI.create(url3.substring(i4, y0))));
                        wf3 F = db2Var.F(q);
                        try {
                            long size3 = F.size();
                            long j = size3 - 22;
                            num = num3;
                            i = i11;
                            if (j >= 0) {
                                long max = Math.max(size3 - 65558, 0L);
                                long j2 = 0;
                                long j3 = j;
                                while (true) {
                                    fe5 fe5Var = new fe5(F.e(j3));
                                    if (fe5Var.n() == 101010256) {
                                        int u = fe5Var.u() & 65535;
                                        int u2 = fe5Var.u() & 65535;
                                        long j4 = j3;
                                        long u3 = fe5Var.u() & 65535;
                                        arrayList = arrayList3;
                                        if (u3 == (fe5Var.u() & 65535) && u == 0 && u2 == 0) {
                                            lt4 lt4Var = q;
                                            fe5Var.skip(4L);
                                            int u4 = fe5Var.u() & 65535;
                                            h40 h40Var = new h40(u3, fe5Var.n() & 4294967295L, u4);
                                            fe5Var.v(u4);
                                            fe5Var.close();
                                            long j5 = j4 - 20;
                                            if (j5 > 0) {
                                                fe5 fe5Var2 = new fe5(F.e(j5));
                                                if (fe5Var2.n() == 117853008) {
                                                    int n2 = fe5Var2.n();
                                                    long r = fe5Var2.r();
                                                    if (fe5Var2.n() == 1 && n2 == 0) {
                                                        fe5 fe5Var3 = new fe5(F.e(r));
                                                        if (fe5Var3.n() == 101075792) {
                                                            fe5Var3.skip(12L);
                                                            int n3 = fe5Var3.n();
                                                            int n4 = fe5Var3.n();
                                                            long r2 = fe5Var3.r();
                                                            if (r2 == fe5Var3.r() && n3 == 0 && n4 == 0) {
                                                                fe5Var3.skip(8L);
                                                                h40 h40Var2 = new h40(r2, fe5Var3.r(), u4);
                                                                try {
                                                                    fe5Var3.close();
                                                                    th = num;
                                                                } catch (Throwable th2) {
                                                                    th = th2;
                                                                }
                                                                h40Var = h40Var2;
                                                                if (th != 0) {
                                                                    throw th;
                                                                }
                                                            } else {
                                                                throw new IOException("unsupported zip: spanned");
                                                            }
                                                        } else {
                                                            throw new IOException("bad zip: expected " + vs7.b(101075792) + " but was " + vs7.b(n));
                                                        }
                                                    } else {
                                                        throw new IOException("unsupported zip: spanned");
                                                    }
                                                }
                                                try {
                                                    fe5Var2.close();
                                                    th = num;
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                }
                                                if (th != 0) {
                                                    throw th;
                                                }
                                            }
                                            h40 h40Var3 = h40Var;
                                            ArrayList arrayList5 = new ArrayList();
                                            fe5 fe5Var4 = new fe5(F.e(h40Var3.c));
                                            try {
                                                long j6 = h40Var3.b;
                                                while (j2 < j6) {
                                                    jy7 c = vs7.c(fe5Var4);
                                                    arrayList2 = arrayList5;
                                                    try {
                                                        if (c.h < h40Var3.c) {
                                                            lt4 lt4Var2 = kl5.X;
                                                            if (jd1.c(c.a)) {
                                                                arrayList2.add(c);
                                                            }
                                                            j2++;
                                                            arrayList5 = arrayList2;
                                                        } else {
                                                            throw new IOException("bad zip: local file header offset >= central directory offset");
                                                            break;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        Object obj4 = th;
                                                        fe5Var4.close();
                                                        th = obj4;
                                                        if (th != 0) {
                                                        }
                                                    }
                                                }
                                                arrayList2 = arrayList5;
                                                try {
                                                    fe5Var4.close();
                                                    th = num;
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                arrayList2 = arrayList5;
                                            }
                                            if (th != 0) {
                                                ky7 ky7Var = new ky7(lt4Var, db2Var, vs7.a(arrayList2));
                                                try {
                                                    F.close();
                                                } catch (Throwable unused) {
                                                }
                                                num2 = new vr4(ky7Var, kl5.X);
                                            } else {
                                                throw th;
                                            }
                                        } else {
                                            throw new IOException("unsupported zip: spanned");
                                        }
                                    } else {
                                        ArrayList arrayList6 = arrayList3;
                                        long j7 = j3;
                                        lt4 lt4Var3 = q;
                                        fe5Var.close();
                                        long j8 = j7 - 1;
                                        if (j8 >= max) {
                                            q = lt4Var3;
                                            j3 = j8;
                                            arrayList3 = arrayList6;
                                        } else {
                                            throw new IOException("not a zip: end of central directory signature not found");
                                        }
                                    }
                                }
                            } else {
                                throw new IOException("not a zip: size=" + F.size());
                            }
                        } finally {
                            if (F != null) {
                                try {
                                    F.close();
                                } catch (Throwable th7) {
                                    mb3.q(th, th7);
                                }
                            }
                        }
                    }
                    if (num2 != null) {
                        arrayList4.add(num2);
                    }
                    i10 = i;
                    num3 = num;
                    arrayList3 = arrayList;
                    i4 = 4;
                    r9 = 0;
                }
                return gt0.V0(arrayList3, arrayList4);
            case 19:
                sn5 sn5Var = (sn5) obj;
                hv.L(to7.a(sn5Var), null, null, new qn5(sn5Var, null, 0), 3);
                return new de5(sn5Var.c);
            case 20:
                no5 no5Var = (no5) obj;
                no5Var.m();
                return new de5(no5Var.d);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Iterator it = ((ip3) obj).h().m.iterator();
                if (it.hasNext()) {
                    Integer valueOf = Integer.valueOf(((xo3) it.next()).q);
                    while (true) {
                        num3 = valueOf;
                        while (it.hasNext()) {
                            valueOf = Integer.valueOf(((xo3) it.next()).q);
                            if (num3.compareTo(valueOf) < 0) {
                                break;
                            }
                        }
                    }
                }
                if (num3 != null) {
                    i6 = num3.intValue();
                }
                int i12 = i6 + 1;
                if (i12 >= 1) {
                    i5 = i12;
                }
                return Integer.valueOf(i5);
            case 22:
                hw5 hw5Var = (hw5) obj;
                tp6 a = up6.a(au5.a);
                hv.L(to7.a(hw5Var), null, null, new bf4(hw5Var, a, null, 13), 3);
                return new de5(a);
            case ConnectionResult.API_DISABLED /* 23 */:
                int i13 = RomListActivity.K0;
                return new v82((RomListActivity) obj);
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                RomsPreferencesFragment romsPreferencesFragment = (RomsPreferencesFragment) obj;
                wh7 wh7Var2 = romsPreferencesFragment.e0;
                if (wh7Var2 != null) {
                    yj1 yj1Var2 = romsPreferencesFragment.f0;
                    if (yj1Var2 != null) {
                        return new p15(romsPreferencesFragment, wh7Var2, yj1Var2);
                    }
                    nb3.a0("directoryAccessValidator");
                    throw null;
                }
                nb3.a0("uriPermissionManager");
                throw null;
            case 25:
                return ((Callable) obj).call();
            case SubAllocator.N4 /* 26 */:
                ((Runnable) obj).run();
                return jg7Var;
            case 27:
                e31 e31Var = (e31) obj;
                Class<?> loadClass = e31Var.a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
                loadClass.getClass();
                Method declaredMethod = loadClass.getDeclaredMethod("getWindowExtensions", null);
                Class<?> loadClass2 = e31Var.a.loadClass("androidx.window.extensions.WindowExtensions");
                loadClass2.getClass();
                declaredMethod.getClass();
                if (!declaredMethod.getReturnType().equals(loadClass2) || !Modifier.isPublic(declaredMethod.getModifiers())) {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 28:
                SaveFilesPreferencesFragment saveFilesPreferencesFragment = (SaveFilesPreferencesFragment) obj;
                wh7 wh7Var3 = saveFilesPreferencesFragment.d0;
                if (wh7Var3 != null) {
                    yj1 yj1Var3 = saveFilesPreferencesFragment.e0;
                    if (yj1Var3 != null) {
                        return new p15(saveFilesPreferencesFragment, wh7Var3, yj1Var3);
                    }
                    nb3.a0("directoryAccessValidator");
                    throw null;
                }
                nb3.a0("uriPermissionManager");
                throw null;
            default:
                n46 n46Var = (n46) obj;
                j56 j56Var = n46Var.A;
                Object obj5 = n46Var.R;
                if (obj5 != null) {
                    return j56Var.e(n46Var, obj5);
                }
                i.h("Value should be initialized");
                return null;
        }
    }
}
