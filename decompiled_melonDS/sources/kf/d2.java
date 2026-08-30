package kf;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d2 implements cf.d, SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8180a;

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f8181b;

    /* renamed from: c  reason: collision with root package name */
    public final od.c f8182c;

    /* renamed from: d  reason: collision with root package name */
    public final be.c f8183d;

    /* renamed from: e  reason: collision with root package name */
    public final yb.n f8184e = new yb.n(new y1(this, 0));

    /* renamed from: f  reason: collision with root package name */
    public final LinkedHashMap f8185f = new LinkedHashMap();

    /* renamed from: g  reason: collision with root package name */
    public final cd.x0 f8186g;

    public d2(Context context, SharedPreferences sharedPreferences, l7.a aVar, od.c cVar, be.c cVar2, ah.h0 h0Var) {
        String str;
        this.f8180a = context;
        this.f8181b = sharedPreferences;
        this.f8182c = cVar;
        this.f8183d = cVar2;
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        if (sharedPreferences.getString("theme", null) == null) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "system";
            } else {
                str = "light";
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("theme", str);
            edit.apply();
        }
        if (sharedPreferences.getString("internal_mac_address", null) == null) {
            List list = oe.z.f10965b;
            oe.z z10 = l0.f.z(null);
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            edit2.putString("internal_mac_address", z10.toString());
            edit2.apply();
        }
        this.f8186g = cd.q.y(cd.q.g(new cd.x(3, new cd.h[]{b("video_renderer", new y1(this, 11)), b("video_filtering", new y1(this, 8)), b("enable_threaded_rendering", new y1(this, 10)), b("video_internal_resolution", new y1(this, 9))}, new ec.j(5, null)), -1), h0Var, cd.i1.f2833b, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ec.c r42) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.d2.a(ec.c):java.lang.Object");
    }

    public final cd.x b(String str, mc.a aVar) {
        LinkedHashMap linkedHashMap = this.f8185f;
        Object obj = linkedHashMap.get(str);
        cd.e1 e1Var = obj;
        if (obj == null) {
            cd.e1 b10 = cd.q.b(1, 0, bd.a.DROP_OLDEST, 2);
            b10.p(yb.y.f14813a);
            linkedHashMap.put(str, b10);
            e1Var = b10;
        }
        return new cd.x(7, (cd.w0) e1Var, aVar);
    }

    public final oe.d0 c() {
        String string = this.f8181b.getString("rom_icon_filtering", "none");
        string.getClass();
        return (oe.d0) pc.a.t(string, oe.d0.values());
    }

    public final Uri[] d() {
        Set<String> stringSet = this.f8181b.getStringSet("rom_search_dirs", zb.s.A);
        if (stringSet != null) {
            Set<String> set = stringSet;
            ArrayList arrayList = new ArrayList(zb.m.G(set, 10));
            for (String str : set) {
                str.getClass();
                arrayList.add(Uri.parse(str));
            }
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            if (uriArr != null) {
                return uriArr;
            }
        }
        return new Uri[0];
    }

    public final Uri e(ze.a aVar) {
        String str;
        Uri uri;
        String str2;
        aVar.getClass();
        SharedPreferences sharedPreferences = this.f8181b;
        Uri uri2 = null;
        if (!sharedPreferences.getBoolean("use_rom_dir", true)) {
            Set<String> stringSet = sharedPreferences.getStringSet("sram_dir", null);
            if (stringSet != null) {
                str = (String) zb.l.S(stringSet);
            } else {
                str = null;
            }
            if (str != null) {
                uri = Uri.parse(str);
            } else {
                uri = null;
            }
            if (uri != null) {
                Set<String> stringSet2 = sharedPreferences.getStringSet("sram_dir", null);
                if (stringSet2 != null) {
                    str2 = (String) zb.l.S(stringSet2);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    uri2 = Uri.parse(str2);
                }
                uri2.getClass();
                return uri2;
            }
        }
        Uri uri3 = aVar.f15057e;
        if (uri3 != null) {
            if (uri3 != null) {
                k6.a b10 = this.f8183d.b(uri3);
                if (b10 != null) {
                    uri2 = b10.g();
                }
                if (uri2 != null) {
                    return uri2;
                }
            }
            throw new Exception("Could not determine ROMs parent document");
        }
        File file = new File(this.f8180a.getExternalFilesDir(null), "saves");
        if (!file.isDirectory() && !file.mkdirs()) {
            throw new Exception("Could not create internal save directory");
        }
        Uri fromFile = Uri.fromFile(file);
        fromFile.getClass();
        return fromFile;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        sharedPreferences.getClass();
        cd.w0 w0Var = (cd.w0) this.f8185f.get(str);
        if (w0Var != null) {
            w0Var.p(yb.y.f14813a);
        }
    }
}
