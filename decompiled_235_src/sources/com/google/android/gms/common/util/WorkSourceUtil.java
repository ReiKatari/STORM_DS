package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.Wrappers;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class WorkSourceUtil {
    private static final int zza;
    private static final Method zzb;
    private static final Method zzc;
    private static final Method zzd;
    private static final Method zze;
    private static final Method zzf;
    private static final Method zzg;
    private static final Method zzh;
    private static final Method zzi;
    private static Boolean zzj;

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|2|3|4|(22:55|56|7|8|9|10|11|12|13|(13:47|48|16|(10:42|43|19|(7:37|38|22|(7:28|29|30|31|32|25|26)|24|25|26)|21|22|(0)|24|25|26)|18|19|(0)|21|22|(0)|24|25|26)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26)|6|7|8|9|10|11|12|13|(0)|15|16|(0)|18|19|(0)|21|22|(0)|24|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Class cls = Integer.TYPE;
        zza = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        zzb = method;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
            try {
                method2 = WorkSource.class.getMethod("add", cls, String.class);
            } catch (Exception unused2) {
            }
            zzc = method2;
            Method method7 = WorkSource.class.getMethod("size", null);
            zzd = method7;
            Method method8 = WorkSource.class.getMethod("get", cls);
            zze = method8;
            if (PlatformVersion.isAtLeastJellyBeanMR2()) {
                try {
                    method3 = WorkSource.class.getMethod("getName", cls);
                } catch (Exception unused3) {
                }
                zzf = method3;
                if (PlatformVersion.isAtLeastP()) {
                    try {
                        method4 = WorkSource.class.getMethod("createWorkChain", null);
                    } catch (Exception e) {
                        Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e);
                    }
                    zzg = method4;
                    if (PlatformVersion.isAtLeastP()) {
                        try {
                            method5 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
                        } catch (Exception e2) {
                            Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
                        }
                        zzh = method5;
                        if (PlatformVersion.isAtLeastP()) {
                            try {
                                method6 = WorkSource.class.getMethod("isEmpty", null);
                                try {
                                    method6.setAccessible(true);
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                            }
                            zzi = method6;
                            zzj = null;
                        }
                        method6 = null;
                        zzi = method6;
                        zzj = null;
                    }
                    method5 = null;
                    zzh = method5;
                    if (PlatformVersion.isAtLeastP()) {
                    }
                    method6 = null;
                    zzi = method6;
                    zzj = null;
                }
                method4 = null;
                zzg = method4;
                if (PlatformVersion.isAtLeastP()) {
                }
                method5 = null;
                zzh = method5;
                if (PlatformVersion.isAtLeastP()) {
                }
                method6 = null;
                zzi = method6;
                zzj = null;
            }
            method3 = null;
            zzf = method3;
            if (PlatformVersion.isAtLeastP()) {
            }
            method4 = null;
            zzg = method4;
            if (PlatformVersion.isAtLeastP()) {
            }
            method5 = null;
            zzh = method5;
            if (PlatformVersion.isAtLeastP()) {
            }
            method6 = null;
            zzi = method6;
            zzj = null;
        }
        method2 = null;
        zzc = method2;
        Method method72 = WorkSource.class.getMethod("size", null);
        zzd = method72;
        Method method82 = WorkSource.class.getMethod("get", cls);
        zze = method82;
        if (PlatformVersion.isAtLeastJellyBeanMR2()) {
        }
        method3 = null;
        zzf = method3;
        if (PlatformVersion.isAtLeastP()) {
        }
        method4 = null;
        zzg = method4;
        if (PlatformVersion.isAtLeastP()) {
        }
        method5 = null;
        zzh = method5;
        if (PlatformVersion.isAtLeastP()) {
        }
        method6 = null;
        zzi = method6;
        zzj = null;
    }

    private WorkSourceUtil() {
    }

    public static void add(WorkSource workSource, int i, String str) {
        Method method = zzc;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return;
            }
        }
        Method method2 = zzb;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
    }

    public static WorkSource fromPackage(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i = applicationInfo.uid;
                WorkSource workSource = new WorkSource();
                add(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static WorkSource fromPackageAndModuleExperimentalPi(Context context, String str, String str2) {
        Method method;
        if (context != null && context.getPackageManager() != null && str2 != null && str != null) {
            int i = -1;
            try {
                ApplicationInfo applicationInfo = Wrappers.packageManager(context).getApplicationInfo(str, 0);
                if (applicationInfo == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                } else {
                    i = applicationInfo.uid;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
            if (i < 0) {
                return null;
            }
            WorkSource workSource = new WorkSource();
            Method method2 = zzg;
            if (method2 != null && (method = zzh) != null) {
                try {
                    Object invoke = method2.invoke(workSource, null);
                    int i2 = zza;
                    if (i != i2) {
                        method.invoke(invoke, Integer.valueOf(i), str);
                    }
                    method.invoke(invoke, Integer.valueOf(i2), str2);
                } catch (Exception e) {
                    Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e);
                }
            } else {
                add(workSource, i, str);
            }
            return workSource;
        }
        Log.w("WorkSourceUtil", "Unexpected null arguments");
        return null;
    }

    public static int get(WorkSource workSource, int i) {
        Method method = zze;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, Integer.valueOf(i));
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return 0;
            }
        }
        return 0;
    }

    public static String getName(WorkSource workSource, int i) {
        Method method = zzf;
        if (method != null) {
            try {
                return (String) method.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return null;
            }
        }
        return null;
    }

    public static List<String> getNames(WorkSource workSource) {
        int size;
        ArrayList arrayList = new ArrayList();
        if (workSource == null) {
            size = 0;
        } else {
            size = size(workSource);
        }
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                String name = getName(workSource, i);
                if (!Strings.isEmptyOrWhitespace(name)) {
                    Preconditions.checkNotNull(name);
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static synchronized boolean hasWorkSourcePermission(Context context) {
        synchronized (WorkSourceUtil.class) {
            Boolean bool = zzj;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z = false;
            if (context == null) {
                return false;
            }
            if (ge7.s(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z = true;
            }
            zzj = Boolean.valueOf(z);
            return z;
        }
    }

    public static boolean isEmpty(WorkSource workSource) {
        Method method = zzi;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(invoke);
                return ((Boolean) invoke).booleanValue();
            } catch (Exception e) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e);
            }
        }
        if (size(workSource) == 0) {
            return true;
        }
        return false;
    }

    public static int size(WorkSource workSource) {
        Method method = zzd;
        if (method != null) {
            try {
                Object invoke = method.invoke(workSource, null);
                Preconditions.checkNotNull(invoke);
                return ((Integer) invoke).intValue();
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
                return 0;
            }
        }
        return 0;
    }
}
