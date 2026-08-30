package d7;

import android.content.Context;
import android.widget.Toast;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.w;
import m9.i;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements i, m6.h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f3920a;

    public c(Context context) {
        this.f3920a = context.getApplicationContext();
    }

    @Override // m9.i
    public void a() {
        Toast.makeText(this.f3920a, (int) R.string.layout_background_load_failed, 1).show();
    }

    @Override // m6.h
    public void b(w wVar) {
        m6.a aVar = new m6.a("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), aVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new a0.i(this, wVar, threadPoolExecutor, 7));
    }

    public /* synthetic */ c(Context context, boolean z10) {
        this.f3920a = context;
    }
}
