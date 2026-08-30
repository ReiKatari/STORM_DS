package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wi3  reason: default package */
/* loaded from: classes.dex */
public final class wi3 implements mi2 {
    public static final wi3 B = new wi3(0);
    public static final wi3 L = new wi3(1);
    public static final wi3 R = new wi3(2);
    public static final wi3 X = new wi3(3);
    public static final wi3 Y = new wi3(4);
    public static final wi3 Z = new wi3(5);
    public final /* synthetic */ int A;

    public /* synthetic */ wi3(int i) {
        this.A = i;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        String str = "Unknown reason";
        switch (this.A) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                String str2 = (String) obj;
                if (str2 != null) {
                    str = str2;
                }
                throw new Exception(str);
            case 2:
                String str3 = (String) obj;
                if (str3 != null) {
                    str = str3;
                }
                throw new Exception(str);
            case 3:
                KeyEvent keyEvent = ((da3) obj).a;
                keyEvent.getClass();
                if (hi2.C(keyEvent) == 2 && r93.a(jk2.f(keyEvent.getKeyCode()), r93.e)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (b53.x(obj, Boolean.FALSE)) {
                    return new xq0(xq0.h);
                }
                obj.getClass();
                return new xq0(mh7.c(((Integer) obj).intValue()));
            default:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException) && ve2.E()) {
                    Log.e("CXCP", "Surface setup error!", th);
                }
                return o27.a;
        }
    }
}
