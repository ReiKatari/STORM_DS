package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fh  reason: default package */
/* loaded from: classes.dex */
public final class fh implements uw2, lo1 {
    public final Context A;

    public fh(Context context, int i) {
        switch (i) {
            case 3:
                this.A = context.getApplicationContext();
                return;
            default:
                this.A = context.getApplicationContext();
                return;
        }
    }

    @Override // defpackage.lo1
    public void a(l07 l07Var) {
        vv0 vv0Var = new vv0("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), vv0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new u(this, l07Var, threadPoolExecutor, 15));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface b(defpackage.tb5 r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh.b(tb5):android.graphics.Typeface");
    }

    @Override // defpackage.uw2
    public void c() {
        Toast.makeText(this.A, (int) R.string.layout_background_load_failed, 1).show();
    }

    public /* synthetic */ fh(Context context, byte b) {
        this.A = context;
    }

    @Override // defpackage.uw2
    public void d() {
    }
}
