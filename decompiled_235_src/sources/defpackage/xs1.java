package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xs1  reason: default package */
/* loaded from: classes.dex */
public final class xs1 implements qe1 {
    public final /* synthetic */ ut3 A;

    public xs1(EmojiCompatInitializer emojiCompatInitializer, ut3 ut3Var) {
        this.A = ut3Var;
    }

    @Override // defpackage.qe1
    public final void onResume(hu3 hu3Var) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = sy0.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new sb(2), 500L);
        this.A.c(this);
    }
}
