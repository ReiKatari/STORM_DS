package defpackage;

import android.graphics.Bitmap;
import android.util.LruCache;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ss3  reason: default package */
/* loaded from: classes.dex */
public final class ss3 extends LruCache {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ss3(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                String str = (String) obj;
                return ((ts3) obj2).b;
            default:
                Bitmap bitmap = (Bitmap) obj2;
                ((String) obj).getClass();
                bitmap.getClass();
                int byteCount = bitmap.getByteCount();
                if (byteCount < 1) {
                    return 1;
                }
                return byteCount;
        }
    }
}
