package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: no1  reason: default package */
/* loaded from: classes.dex */
public final class no1 implements ua1 {
    public final /* synthetic */ rm3 A;

    public no1(EmojiCompatInitializer emojiCompatInitializer, rm3 rm3Var) {
        this.A = rm3Var;
    }

    @Override // defpackage.ua1
    public final void onResume(fn3 fn3Var) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = wv0.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new w20(1), 500L);
        this.A.c(this);
    }
}
