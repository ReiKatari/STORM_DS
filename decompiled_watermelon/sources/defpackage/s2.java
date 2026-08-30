package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s2  reason: default package */
/* loaded from: classes.dex */
public final class s2 {
    public static s2 c;
    public final /* synthetic */ int a;
    public Object b;

    public s2() {
        this.a = 4;
        this.b = new Object();
        new Handler(Looper.getMainLooper(), new v96(this));
    }

    public static s2 a(boolean z, int i, int i2, int i3, int i4) {
        return new s2(0, AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("[Result: <");
                sb.append("Value: " + this.b);
                sb.append(">]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
