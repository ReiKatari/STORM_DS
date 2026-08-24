package defpackage;

import android.util.Log;
import android.view.KeyEvent;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: up3  reason: default package */
/* loaded from: classes.dex */
public final class up3 implements qn2 {
    public static final up3 B = new up3(0);
    public static final up3 L = new up3(1);
    public static final up3 R = new up3(2);
    public static final up3 X = new up3(3);
    public static final up3 Y = new up3(4);
    public static final up3 Z = new up3(5);
    public static final up3 d0 = new up3(6);
    public final /* synthetic */ int A;

    public /* synthetic */ up3(int i) {
        this.A = i;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        boolean z;
        String str = "Unknown reason";
        switch (this.A) {
            case 0:
                ((Number) obj).intValue();
                return null;
            case 1:
                ((Number) obj).intValue();
                return null;
            case 2:
                String str2 = (String) obj;
                if (str2 != null) {
                    str = str2;
                }
                throw new Exception(str);
            case 3:
                String str3 = (String) obj;
                if (str3 != null) {
                    str = str3;
                }
                throw new Exception(str);
            case 4:
                KeyEvent keyEvent = ((wg3) obj).a;
                keyEvent.getClass();
                if (xk2.u(keyEvent) == 2 && kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.e)) {
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (nb3.k(obj, Boolean.FALSE)) {
                    return new kt0(kt0.h);
                }
                obj.getClass();
                return new kt0(hv.b(((Integer) obj).intValue()));
            default:
                Throwable th = (Throwable) obj;
                if (th != null && !(th instanceof CancellationException) && kj2.G()) {
                    Log.e("CXCP", "Surface setup error!", th);
                }
                return jg7.a;
        }
    }
}
