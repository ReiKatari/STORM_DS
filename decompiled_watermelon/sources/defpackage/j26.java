package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j26  reason: default package */
/* loaded from: classes.dex */
public final class j26 extends rv0 {
    public final Context e;

    public j26(Context context, w37 w37Var, o54 o54Var) {
        super(context, w37Var, o54Var);
        this.e = context;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [v1, f26] */
    @Override // defpackage.rv0
    public final fq0 g(InputStream inputStream) {
        long maxMemory;
        g26 g26Var;
        y16 y16Var;
        if (!(inputStream instanceof FileInputStream)) {
            return null;
        }
        ActivityManager activityManager = (ActivityManager) this.e.getSystemService(ActivityManager.class);
        if (activityManager != null) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            maxMemory = memoryInfo.totalMem;
        } else {
            maxMemory = Runtime.getRuntime().maxMemory();
        }
        long min = Math.min(((float) maxMemory) * 0.1f, Runtime.getRuntime().maxMemory() / 3);
        if (min < 1048576) {
            min = 1048576;
        }
        long j = min / 1024;
        if (j > 2147483647L) {
            j = 2147483647L;
        }
        ?? v1Var = new v1();
        v1Var.y = "unknown archive";
        v1Var.z = (int) j;
        v1Var.x = ((FileInputStream) inputStream).getChannel();
        FileChannel fileChannel = v1Var.x;
        if (fileChannel != null) {
            g26Var = new g26(fileChannel, v1Var.y, true, v1Var.z);
        } else {
            if (v1Var.u != null) {
                if (v1Var.v.length == 0) {
                    OpenOption[] openOptionArr = new OpenOption[1];
                    StandardOpenOption.READ;
                }
                e1 e1Var = v1Var.u;
                if (e1Var == null) {
                    i.n("origin == null");
                } else {
                    String simpleName = e1.class.getSimpleName();
                    Object obj = e1Var.u;
                    throw new UnsupportedOperationException(String.format("%s#getPath() for %s origin %s", simpleName, obj.getClass().getSimpleName(), obj));
                }
            } else {
                i.n("origin == null");
            }
            g26Var = null;
        }
        while (true) {
            int i = g26Var.R;
            y16[] y16VarArr = (y16[]) g26Var.L.c0;
            if (i >= y16VarArr.length - 1) {
                y16Var = null;
            } else {
                int i2 = i + 1;
                g26Var.R = i2;
                y16Var = y16VarArr[i2];
                String str = y16Var.a;
                g26Var.i(i2, false);
            }
            if (y16Var == null) {
                y16Var = null;
                break;
            } else if (!y16Var.c) {
                String str2 = y16Var.a;
                str2.getClass();
                String lowerCase = zg6.U0('.', str2, str2).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (rv0.d.contains(lowerCase)) {
                    break;
                }
            }
        }
        if (y16Var == null) {
            g26Var.close();
            return null;
        }
        try {
            InputStream x = g26Var.x(y16Var);
            x.getClass();
            return new fq0(new fq0(x, g26Var, 2), new w76(y16Var.o), 1);
        } catch (Exception e) {
            g26Var.close();
            throw e;
        }
    }
}
