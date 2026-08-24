package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.StatFs;
import android.widget.Toast;
import java.io.File;
import me.magnum.melonds.ui.layouteditor.LayoutEditorView;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ej0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ej0 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Context B;

    public /* synthetic */ ej0(Context context, int i) {
        this.A = i;
        this.B = context;
    }

    @Override // defpackage.on2
    public final Object c() {
        long j;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Context context = this.B;
        switch (i) {
            case 0:
                return new t16(context);
            case 1:
                b44 b44Var = new b44(context);
                b44Var.b = 0.25d;
                return b44Var.a();
            case 2:
                xf3 xf3Var = db2.A;
                xe1 xe1Var = xk1.a;
                de1 de1Var = de1.L;
                File cacheDir = context.getCacheDir();
                cacheDir.getClass();
                File C0 = jc2.C0(cacheDir);
                String str = lt4.B;
                lt4 q = w31.q(C0);
                if (0.0d > 0.0d) {
                    j = 10485760;
                    try {
                        File file = q.toFile();
                        file.mkdir();
                        StatFs statFs = new StatFs(file.getAbsolutePath());
                        j = gi2.s((long) (0.0d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                    } catch (Exception unused) {
                    }
                } else {
                    j = 100663296;
                }
                return new me5(j, de1Var, xf3Var, q);
            case 3:
                int i2 = LayoutEditorView.p0;
                return Integer.valueOf((int) np2.K(context, 140.0f));
            case 4:
                int i3 = LayoutEditorView.p0;
                return Integer.valueOf((int) np2.K(context, 30.0f));
            case 5:
                return gi2.A(context);
            case 6:
                Toast.makeText(context, "Комната создана! Ожидание игроков...", 0).show();
                return jg7Var;
            case 7:
                Toast.makeText(context, "Список комнат обновлен", 0).show();
                return jg7Var;
            case 8:
                return f04.P(f04.z(new g21(new u12(context, (r41) null, 17), 7)), ms2.A, new mp6(5000L, 0L), 1);
            default:
                Intent intent = new Intent(context, SettingsActivity.class);
                intent.putExtra("entry_point", "translator");
                context.startActivity(intent);
                return jg7Var;
        }
    }
}
