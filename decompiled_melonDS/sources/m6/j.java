package m6;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements androidx.lifecycle.f {
    public final /* synthetic */ androidx.lifecycle.r A;

    public j(EmojiCompatInitializer emojiCompatInitializer, androidx.lifecycle.r rVar) {
        this.A = rVar;
    }

    @Override // androidx.lifecycle.f
    public final void onResume(androidx.lifecycle.x xVar) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new com.squareup.picasso.d(1), 500L);
        this.A.c(this);
    }
}
