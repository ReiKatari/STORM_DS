package defpackage;

import android.content.Context;
import android.os.StatFs;
import java.io.File;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vg0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vg0 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ vg0(Context context, int i) {
        this.A = i;
        this.B = context;
    }

    @Override // defpackage.ki2
    public final Object c() {
        long j;
        int i = this.A;
        Context context = this.B;
        switch (i) {
            case 0:
                return new zq5(context);
            case 1:
                nw3 nw3Var = new nw3(context);
                nw3Var.b = 0.25d;
                return nw3Var.a();
            case 2:
                d93 d93Var = j62.A;
                bb1 bb1Var = tg1.a;
                ha1 ha1Var = ha1.L;
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                File M = q72.M(cacheDir);
                String str = jk4.B;
                jk4 p = hm1.p(M);
                if (0.0d > 0.0d) {
                    j = 10485760;
                    try {
                        File file = p.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        j = io2.o((long) (0.0d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                    } catch (Exception unused) {
                    }
                } else {
                    j = 100663296;
                }
                return new z45(j, ha1Var, d93Var, p);
            case 3:
                int i2 = LayoutEditorView.l0;
                return Integer.valueOf((int) ((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 100.0f));
            case 4:
                int i3 = LayoutEditorView.l0;
                return Integer.valueOf((int) ((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * 30.0f));
            case 5:
                return sn2.t(context);
            default:
                return se.U(se.q(new bz0(6, new wx1(context, (j11) null, 13))), hm2.A, new xd6(5000L, 0L), 1);
        }
    }
}
