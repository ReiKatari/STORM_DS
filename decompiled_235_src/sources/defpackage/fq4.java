package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fq4  reason: default package */
/* loaded from: classes.dex */
public abstract class fq4 {
    public static final String a = ga0.h("PackageManagerHelper");

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0032, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        defpackage.ga0.f().b(r2, "Skipping component enablement for ".concat(r8.getName()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Context context, Class cls, boolean z) {
        int i;
        String str;
        String str2 = "disabled";
        String str3 = a;
        try {
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, cls.getName()));
            boolean z2 = false;
            if (componentEnabledSetting != 0 && componentEnabledSetting == 1) {
                z2 = true;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i, 1);
            ga0 f = ga0.f();
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            if (!z) {
                str = "disabled";
            } else {
                str = "enabled";
            }
            sb.append(str);
            f.b(str3, sb.toString());
        } catch (Exception e) {
            ga0 f2 = ga0.f();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            if (z) {
                str2 = "enabled";
            }
            sb2.append(str2);
            f2.c(str3, sb2.toString(), e);
        }
    }
}
