package b6;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static f f2073c;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2074a;

    /* renamed from: b  reason: collision with root package name */
    public Object f2075b;

    public f(int i2) {
        this.f2074a = i2;
        switch (i2) {
            case l1.c.f8511g /* 5 */:
                this.f2075b = new Object();
                return;
            default:
                this.f2075b = new Object();
                new Handler(Looper.getMainLooper(), new pa.d(this));
                return;
        }
    }

    public static f a(boolean z10, int i2, int i10, int i11, int i12) {
        return new f(0, AccessibilityNodeInfo.CollectionItemInfo.obtain(i2, i10, i11, i12, false, z10));
    }

    public String toString() {
        switch (this.f2074a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("[Result: <");
                sb2.append("Value: " + this.f2075b);
                sb2.append(">]");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f(int i2, Object obj) {
        this.f2074a = i2;
        this.f2075b = obj;
    }
}
