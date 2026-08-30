package hf;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import gf.f;
import java.util.ArrayList;
import java.util.List;
import oe.r0;
import oe.t0;
import vc.h;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6490a;

    /* renamed from: b  reason: collision with root package name */
    public final ff.a f6491b;

    /* renamed from: c  reason: collision with root package name */
    public final SharedPreferences f6492c;

    public b(Context context, ff.a aVar, SharedPreferences sharedPreferences) {
        this.f6490a = context;
        this.f6491b = aVar;
        this.f6492c = sharedPreferences;
    }

    public static List b(ArrayList arrayList) {
        int i2 = 0;
        if (arrayList.size() >= 3) {
            return arrayList;
        }
        int size = 3 - arrayList.size();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(arrayList);
        if (size >= 0) {
            while (true) {
                arrayList2.add(0);
                if (i2 == size) {
                    break;
                }
                i2++;
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:10)(2:50|51))(4:52|(2:54|(1:58))|59|(1:61))|11|12|(4:17|18|19|(6:21|(1:23)(2:40|(2:42|43))|24|(2:25|(2:27|(2:29|30))(2:38|39))|31|(3:33|34|35)(1:37))(1:44))(2:14|15)))|64|6|7|(0)(0)|11|12|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        r3.getClass();
        zc.x.j(r3);
        r0 = new yb.k(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ec.c r21) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hf.b.a(ec.c):java.lang.Object");
    }

    public final boolean c(f fVar) {
        PackageInfo packageInfo;
        t0 t0Var;
        PackageManager.PackageInfoFlags of2;
        Context context = this.f6490a;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            of2 = PackageManager.PackageInfoFlags.of(0);
            packageInfo = packageManager.getPackageInfo(packageName, of2);
            packageInfo.getClass();
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            packageInfo.getClass();
        }
        String str = packageInfo.versionName;
        str.getClass();
        List u02 = h.u0(str, new char[]{' '});
        if (u02.size() == 1) {
            List<String> u03 = h.u0((CharSequence) u02.get(0), new char[]{'.'});
            ArrayList arrayList = new ArrayList(m.G(u03, 10));
            for (String str2 : u03) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            ArrayList arrayList2 = (ArrayList) b(arrayList);
            t0Var = new t0(r0.FINAL, ((Number) arrayList2.get(0)).intValue(), ((Number) arrayList2.get(1)).intValue(), ((Number) arrayList2.get(2)).intValue());
        } else {
            r0 r0Var = (r0) pc.a.t((String) u02.get(0), r0.values());
            List<String> u04 = h.u0((CharSequence) u02.get(1), new char[]{'.'});
            ArrayList arrayList3 = new ArrayList(m.G(u04, 10));
            for (String str3 : u04) {
                arrayList3.add(Integer.valueOf(Integer.parseInt(str3)));
            }
            ArrayList arrayList4 = (ArrayList) b(arrayList3);
            t0Var = new t0(r0Var, ((Number) arrayList4.get(0)).intValue(), ((Number) arrayList4.get(1)).intValue(), ((Number) arrayList4.get(2)).intValue());
        }
        if (pc.a.v(fVar.f5665a).compareTo(t0Var) <= 0) {
            return false;
        }
        return true;
    }
}
