package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss2  reason: default package */
/* loaded from: classes.dex */
public final class ss2 implements f13 {
    public final /* synthetic */ int A;
    public final xk4 B;

    public ss2(Context context) {
        long j;
        this.A = 2;
        StringBuilder sb = ck7.a;
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        long max = Math.max(Math.min(j, 52428800L), 5242880L);
        wk4 wk4Var = new wk4();
        wk4Var.l = new la0(file, max);
        this.B = new xk4(wk4Var);
    }

    @Override // defpackage.f13
    public Object j(String str, String str2, String str3, s41 s41Var) {
        switch (this.A) {
            case 0:
                xe1 xe1Var = xk1.a;
                return hv.d0(de1.L, new la(str, str2, str3, this, null, 4), s41Var);
            case 1:
                xe1 xe1Var2 = xk1.a;
                return hv.d0(de1.L, new la(str, str2, str3, this, null, 7), s41Var);
            default:
                xe1 xe1Var3 = xk1.a;
                return hv.d0(de1.L, new la(str, str2, str3, this, null, 9), s41Var);
        }
    }

    public ss2(xk4 xk4Var, int i) {
        this.A = i;
        xk4Var.getClass();
        switch (i) {
            case 1:
                this.B = xk4Var;
                return;
            case 2:
            default:
                this.B = xk4Var;
                return;
            case 3:
                this.B = xk4Var;
                return;
        }
    }
}
