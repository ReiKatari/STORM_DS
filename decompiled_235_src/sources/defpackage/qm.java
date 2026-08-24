package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qm  reason: default package */
/* loaded from: classes.dex */
public final class qm extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ qm(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    sm smVar = new sm(choreographer, uj2.u(myLooper));
                    return jw2.y(smVar, smVar.h0);
                }
                i.m("no Looper on this thread");
                return null;
            case 1:
                return new StringBuilder("Picasso-");
            case 2:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(az7.a);
                return simpleDateFormat;
            case 3:
                return new Random();
            case 4:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return u24.x();
                }
                if (Looper.myLooper() == null) {
                    return null;
                }
                return new ov2(new Handler(Looper.myLooper()));
            default:
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
        }
    }
}
