package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vd6  reason: default package */
/* loaded from: classes.dex */
public final class vd6 extends ny0 {
    public final Context e;

    public vd6(Context context, uh7 uh7Var, ud4 ud4Var) {
        super(context, uh7Var, ud4Var);
        this.e = context;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [rd6, w1] */
    @Override // defpackage.ny0
    public final ss0 g(InputStream inputStream) {
        long maxMemory;
        sd6 sd6Var;
        md6 md6Var;
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
        ?? w1Var = new w1();
        w1Var.x = "unknown archive";
        w1Var.y = (int) j;
        w1Var.w = ((FileInputStream) inputStream).getChannel();
        FileChannel fileChannel = w1Var.w;
        if (fileChannel != null) {
            sd6Var = new sd6(fileChannel, w1Var.x, true, w1Var.y);
        } else {
            if (w1Var.t != null) {
                if (w1Var.u.length == 0) {
                    OpenOption[] openOptionArr = new OpenOption[1];
                    StandardOpenOption.READ;
                }
                f1 f1Var = w1Var.t;
                if (f1Var == null) {
                    i.m("origin == null");
                } else {
                    String simpleName = f1.class.getSimpleName();
                    Object obj = f1Var.t;
                    throw new UnsupportedOperationException(String.format("%s#getPath() for %s origin %s", simpleName, obj.getClass().getSimpleName(), obj));
                }
            } else {
                i.m("origin == null");
            }
            sd6Var = null;
        }
        while (true) {
            int i = sd6Var.R;
            md6[] md6VarArr = (md6[]) sd6Var.L.d0;
            if (i >= md6VarArr.length - 1) {
                md6Var = null;
            } else {
                int i2 = i + 1;
                sd6Var.R = i2;
                md6Var = md6VarArr[i2];
                String str = md6Var.a;
                sd6Var.h(i2, false);
            }
            if (md6Var == null) {
                md6Var = null;
                break;
            } else if (!md6Var.c) {
                String str2 = md6Var.a;
                str2.getClass();
                if (ny0.i(str2)) {
                    break;
                }
            }
        }
        if (md6Var == null) {
            sd6Var.close();
            return null;
        }
        try {
            InputStream r = sd6Var.r(md6Var);
            r.getClass();
            return new ss0(new ss0(r, sd6Var, 3), new lj6(md6Var.o), 1);
        } catch (Exception e) {
            sd6Var.close();
            throw e;
        }
    }
}
