package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: em  reason: default package */
/* loaded from: classes.dex */
public final class em extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ em(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    gm gmVar = new gm(choreographer, me2.n(myLooper));
                    return se.O(gmVar, gmVar.g0);
                }
                i.n("no Looper on this thread");
                return null;
            case 1:
                return new StringBuilder("Picasso-");
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(ik7.a);
                return simpleDateFormat;
            case 3:
                return new Random();
            case 4:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return iq2.x();
                }
                if (Looper.myLooper() == null) {
                    return null;
                }
                return new np2(new Handler(Looper.myLooper()));
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
